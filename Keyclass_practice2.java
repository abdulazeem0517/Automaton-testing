package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Keyclass_practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://gotranscript.com/text-compare#diff");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//textarea[@placeholder=\"Paste one version of the text here.\"]")).sendKeys("Hello this is Azeem");
		driver.findElement(By.xpath("//textarea[@placeholder=\"Paste another version of the text here.\"]")).sendKeys("Hello this is Azeem");
		driver.findElement(By.xpath("//*[@id=\"recaptcha\"]")).click();		
		
	}

}
