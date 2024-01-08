package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Twitterhandle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to charani");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
ChromeOptions options=new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver =new ChromeDriver();
driver.get("https://twitter.com/i/flow/login");
driver.manage().window().maximize();
//locators:To identify an element in webpage
//single line comment-ctrl+/
//1.classnam
//2.id
//3.tagname
//4.linktext
//5.partial link text
//6.css selector
//7.xpath
//driver.findElement(By.name("email")).sendKeys("7674202084");
//driver.findElement(By.id("pass")).sendKeys("Potti@14357");
//driver.findElement(By.id("loginbutton")).click();
//driver.findElement(By.linkText("Forgotten account?")).click();
}
}