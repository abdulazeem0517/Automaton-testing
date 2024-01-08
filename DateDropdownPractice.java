package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateDropdownPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Click on input date box
		
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
		
		// select year
		
		WebElement el_year=driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[2]"));
		Select se_year=new Select(el_year);
		se_year.selectByIndex(12); // 2014
		
		// select month
		
		WebElement el_month=driver.findElement(By.xpath("//*[contains(@title,\"the month\")]"));
		Select se_month=new Select(el_month);
		se_month.selectByIndex(8);// june
		
		// select day
		
		List<WebElement> li=driver.findElements(By.xpath("//*[@class=\"datepick-month\"]//table//td"));
		
		for (WebElement day:li) {
			
			if (day.getText().equals("28")) {
				day.click();
				break;
			}
		}
	}

}
