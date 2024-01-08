package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_testQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/text-box");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Abdul");
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("abdulazeem01@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("4-32-133, Prasanth Nagar, Shapur Nagar, Chinthal, Jeedimetla, Hyderabad, Telangana 500055");
		
		Actions ac = new Actions(driver);
		// CTRL+A
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		// CTRL+C
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
//		act.sendKeys(Keys.TAB).build().perform();
		// CTRL+V
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
				
		
		
		
		
		
		
		
		
		
		
	}

}
