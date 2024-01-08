package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DateDemoQaPractice {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Click on date and time input box
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		
		// Store expected date and time
		
		String exp_year="2024";
		String exp_month="November";
		String exp_day="5";
//		String exp_time="01:15";
		String exp_time="06:15";
		
		// Get current month and year frome calendar
		
		
		
		
		// Year and month
		
		while(true) {
			String cur_month_year=driver.findElement(By.xpath("//*[contains(@class,\"current-mont\")]")).getText();
			String[] cur_month_year_arr=cur_month_year.split(" ");
			String cur_month=cur_month_year_arr[0];
			String cur_year=cur_month_year_arr[1];
			
			if (exp_year.equals(cur_year) && exp_month.equals(cur_month)) {
				break;
			}
			
			driver.findElement(By.xpath("//button[text()=\"Next Month\"]")).click();
			
		}
		
		// day 
		
		List<WebElement> day_li=driver.findElements(By.xpath("//div[@class=\"react-datepicker__month\"]//div//div"));
		
		for(WebElement day:day_li) {
			if (day.getText().equals(exp_day)) {
				day.click();
				break;
			}
		}
		
		// Time
		
		List<WebElement> times_li=driver.findElements(By.xpath("//ul[@class=\"react-datepicker__time-list\"]//li"));
		
		for(WebElement time:times_li) {
			
			if(time.getText().equals(exp_time)) {
				time.click();
				break;
			}
		}



    
	}

}
