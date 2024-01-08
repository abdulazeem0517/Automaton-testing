package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OmayoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html?m=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement multiselect=driver.findElement(By.xpath("//select[@id=\"multiselect1\"]"));
		Select ms=new Select(multiselect);
		ms.selectByValue("volvox");
		ms.selectByValue("audix");
		
		WebElement sselect=driver.findElement(By.xpath("//select[@class=\"combobox\"]"));
		Select ms1=new Select(sselect);
		ms1.selectByValue("jkl");
		
		driver.findElement(By.xpath("//input[@value=\"ClickAfterTextDissappears\"]")).click();
		driver.switchTo().alert().accept();
		
		WebElement dclick=driver.findElement(By.xpath("//button[@ondblclick=\"dblclickAlert()\"]"));
		Actions a1=new Actions(driver);
		a1.doubleClick(dclick).build().perform();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
