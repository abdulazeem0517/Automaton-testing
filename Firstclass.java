package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Firstclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to charani");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
ChromeOptions options=new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver =new EdgeDriver();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HELLO");
driver.findElement(By.name("email")).sendKeys("abdul");
driver.findElement(By.id("pass")).sendKeys("12345678");
//driver.findElement(By.xpath("//*[text()=\"हिन्दी\"]")).click();

//driver.findElement(By.cssSelector("css=button:contains("Log in")"));
//driver.findElement(By.cssSelector(""))
//driver.findElement(By.cssSelector("input#lastName")).sendKeys("hello");



	



//locators:To identify an element in webpage
//single line comment-ctrl+/
//1.classnam
//2.id
////3.tagname
////4.linktext
////5.partial link text
////6.css selector
////7.xpath
//driver.findElement(By.name("email")).sendKeys("");
//driver.findElement(By.id("pass")).sendKeys("");
//driver.findElement(By.id("loginbutton")).click();
////driver.findElement(By.linkText("Forgotten account?")).click();
}
}