package practice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropdemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
		
		
		
		WebElement amt50001 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amount1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		WebElement dragelmt2 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dropelmt2 = driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		WebElement dragelmt3 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dropelmt3 = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		WebElement dragelmt4 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement dropelmt4 = driver.findElement(By.xpath("//*[@id=\"loan\"]"));

		Actions act = new Actions(driver);
		act.dragAndDrop(amt50001, amount1).build().perform();
		act.dragAndDrop(dragelmt2, dropelmt2).build().perform();
		act.dragAndDrop(dragelmt3, dropelmt3).build().perform();
		act.dragAndDrop(dragelmt4, dropelmt4).build().perform();
		
		WebElement table=driver.findElement(By.xpath("//*[@id=\"g-mainbar\"]/div/div"));
		File scr1=table.getScreenshotAs(OutputType.FILE);
		File tar1=new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\dragdrop2.png");
		FileUtils.copyFile(scr1, tar1);
		
	
	
	
	
	
	
	
	
	
	}
	

}
