package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class swagLabsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		String logo=driver.findElement(By.xpath("//div[@class=\"app_logo\"]")).getText();
		System.out.println(logo);
		
		
		
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		driver.findElement(By.id("continue-shopping")).click();
		
		WebElement filter=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		Select ftr=new Select(filter);
		ftr.selectByValue("lohi");
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();

		WebElement filter1=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		Select ftr1=new Select(filter1);
		ftr1.selectByValue("hilo");		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		
		WebElement filter2=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		Select ftr2=new Select(filter2);
		ftr2.selectByValue("za");		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		
		WebElement filter3=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		Select ftr3=new Select(filter3);
		ftr3.selectByValue("az");		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		WebElement cart=driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
		System.out.println("Total Items:" + cart.getText());
		cart.click();
		driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("AB");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Develiers");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("522614");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		
		WebElement total=driver.findElement(By.xpath("//div[@class=\"summary_info_label summary_total_label\"]"));
		System.out.println("Total price:" +total.getText());
		
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		
		String output=driver.findElement(By.xpath("//h2[@class=\"complete-header\"]")).getText();
		System.out.println(output);
		
//		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
		
		
		
		

		
		
	
		
		
		
	}

}
