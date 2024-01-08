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

public class DrapDropdemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement italy=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		WebElement madrid=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		WebElement spain=driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		WebElement oslo=driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement norway=driver.findElement(By.xpath("//*[@id=\"box101\"]"));
		WebElement copenhagen=driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		WebElement denmark=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
		WebElement seoul=driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement southcorea=driver.findElement(By.xpath("//*[@id=\"box105\"]"));
		WebElement stockholm=driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		WebElement sweden=driver.findElement(By.xpath("//*[@id=\"box102\"]"));
		WebElement washington=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement us=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		
		Actions act2=new Actions(driver);
		act2.dragAndDrop(rome,italy).build().perform();
		act2.dragAndDrop(madrid,spain).build().perform();
		act2.dragAndDrop(oslo, norway).build().perform();
		act2.dragAndDrop(copenhagen, denmark).build().perform();
		act2.dragAndDrop(seoul, southcorea).build().perform();
		act2.dragAndDrop(stockholm, sweden).build().perform();
		act2.dragAndDrop(washington, us).build().perform();
		
		WebElement srt=driver.findElement(By.xpath("//*[@id=\"mainContainer\"]"));
		File src=srt.getScreenshotAs(OutputType.FILE);
		File tar=new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\stats.png");
		FileUtils.copyFile(src, tar);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
