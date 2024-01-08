package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class handlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input[1]")).sendKeys("Hello abdul");
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		WebElement ele=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(ele);
	}

}
