package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoWebshopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Gill");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Shubman");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sgill9696@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("gill96sara");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("gill96sara");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"ico-logout\"]")).click();
		
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sgill9696@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("gill96sara");
		
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[1]")).click();
		driver.findElement(By.xpath("//img[@title=\"Show products in category Cell phones\"]")).click();
		driver.findElement(By.xpath("(//input[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		
		
		
		
		
		
		
		

	}

}
