package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class calenderPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.manage().window().maximize();
		
		
		driver.findElement(By.className("hasDatepicker")).click();
//		driver.findElement(By.className("hasDatepicker")).sendKeys("16/03/2025");   //using send keys on calender
		
		
//		String month="March";	//using loop while we know the year
//		String year="2025";
//		String day="16";
//		while(true) {
//			String mnth=driver.findElement(By.className("ui-datepicker-month")).getText();
//			String yr=driver.findElement(By.className("ui-datepicker-year")).getText();
//			if(mnth.equals(month)&& yr.equals(year))
//			{
//				
//				break;
//			}
//				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
//		}
//		List<WebElement> days=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
//		for(WebElement d:days) {
//			if(d.getText().equals(day)) {
//				d.click();
//			}
//		}
		
		String month="March";	//using loop while we don't know the year
		String year="2024";
		String day="16";
		int actyear=Integer.parseInt(year);
		while(true) {
			String mnth=driver.findElement(By.className("ui-datepicker-month")).getText();
			String yr=driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.print(mnth);
			System.out.print(yr);
//			int curyear=Integer.parseInt(yr);
			if(mnth.equals(month)&& yr.equals(year))
			{
				
				break;
			}
			int curyear=Integer.parseInt(yr);
			if (curyear<actyear) {
//			int curyear=Integer.parseInt(yr);
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
			}
			
			
			
			}
		List<WebElement> days1=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement d:days1) {
			if(d.getText().equals(day)) {
				d.click();
			}
		}
	
	}

	

}
