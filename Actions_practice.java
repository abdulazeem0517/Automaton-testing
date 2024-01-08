package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_practice {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
//		driver.get("https://www.ebay.com/");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
		
		
		
//		WebElement sc = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).sendKeys("Abdul azeem");
		
		WebElement sc = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		String res=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
		System.out.println(res);
		
		WebElement slide=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
				
		
		
		Actions ac=new Actions(driver);
//		ac.moveToElement(sc).build().perform();
		ac.doubleClick(sc).build().perform();
		ac.dragAndDrop(a, b).build().perform();
		ac.setActiveKeyboard(res);
//		ac.getActivePointer().createPointerMove(01, 01, 0, 0, 20).
		
		String res1 =driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();

		System.out.println(res1);
		String 

		
//		
//		Thread.sleep(2000);
//		driver.close();
//		
		
	}

}
