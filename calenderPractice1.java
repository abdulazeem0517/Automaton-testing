package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class calenderPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.manage().window().maximize();
	
		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("16/03/2025");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		String actmonth="March";	//using loop while we know the year
		String actyear="2024";
		String day="16";
		
		while(true) {
			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			String year=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			if(month.equals(actmonth)&&year.equals(actyear)) {
				break;
			}
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		}
			List<WebElement> days=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
			for(WebElement d:days) {
				if(d.getText().equals(day)) {
					d.click();
		}
		
		
	}
	}
}
