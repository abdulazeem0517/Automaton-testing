package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Naviagation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("samsung s23");
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
//		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-bold a-text-normal\"])[1]")).click();
//		driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
//		driver.findElement(By.xpath("//input[@title=\"Buy Now\"]")).click();
		
		
	}

}
