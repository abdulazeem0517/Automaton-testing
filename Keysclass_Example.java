package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysclass_Example {
	public static void main(String[] args) {

		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@name=\"text1\"]")).sendKeys("Good Morning");
		Actions act = new Actions(driver);
		// CTRL+A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		// CTRL+C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		// TAB
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
//		act.sendKeys(Keys.TAB).build().perform();
		// CTRL+V
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//div[@class=\"compareButtonText\"]")).click();
		String res=driver.findElement(By.className("messageForUser")).getText();
		System.out.println(res);
	}

}
