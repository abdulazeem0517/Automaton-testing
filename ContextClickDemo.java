package practice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement dclick=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		List<WebElement> li=driver.findElements(By.xpath("//li[contains(@class,\"context-menu-item context-menu-icon\")]"));
		for(WebElement act:li){
			Actions a1=new Actions(driver);
			a1.contextClick(dclick).build().perform();
			act.click();
			
			driver.switchTo().alert().accept();
			
			
//			WebElement srcsht=driver.findElement(By.xpath("/html/body/ul/li[1]"));
//			srcsht.click();
//			
//			File src=srcsht.getScreenshotAs(OutputType.FILE);
//			File tar=new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\Edit.png");
//			FileUtils.copyFile(src, tar);
		}
		driver.close();
		System.out.println("suceesfully clicked");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
