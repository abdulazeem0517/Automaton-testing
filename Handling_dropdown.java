package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class Handling_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("welcome to charani");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.findElement(By.name("firstname")).sendKeys("abdul");
		driver.findElement(By.name("lastname")).sendKeys("azeem");
		driver.findElement(By.name("reg_email__")).sendKeys("shaik521@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shaik521@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Azeem3256");
		WebElement day_of_month = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select dt = new Select(day_of_month);
		dt.selectByValue("16");
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select mon = new Select(month);
		mon.selectByIndex(2);
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select yr = new Select(year);
		yr.selectByVisibleText("1999");
//		yr.deselectByVisibleText("1999");
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
