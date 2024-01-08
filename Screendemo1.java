package practice1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Screendemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/search?q=laptop+stand+for+bed+and+sofa&sid=wwe%2Cki7%2Cd4s&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_20_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_20_na_na_na&as-pos=1&as-type=RECENT&suggestionId=laptop+stand+for+bed+and+sofa%7CPortable+Laptop+Tables&requestId=c49dbbb6-be1b-424c-b5f4-d9d0c41d40a4&as-searchtext=laptop%20stand%20for%20bed%20and%20sofa");
		//took screenshot of entire webpage
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		TakesScreenshot s1= (TakesScreenshot)driver;
		File src1= ts1.getScreenshotAs(OutputType.FILE);
		File tar1=new File("C:\\\\Users\\\\Admin\\\\Pictures\\\\flip.png");  //we need to change name of file at every time
		FileUtils.copyFile(src1, tar1);
	//took screenshot of perticular element
	WebElement screen= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div"));	
	File a1= screen.getScreenshotAs(OutputType.FILE);
	File sc=new File("C:\\Users\\Admin\\Pictures\\flipcart.png");
	FileUtils.copyFile(a1, sc);
	}
	
	

}
