package practice1;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AlertPractice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"); 
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Abdul");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.cssSelector("p#demo1")).getText());
//		Thread.sleep(2000);
//		driver.switchTo().alert().getText();
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1= ts1.getScreenshotAs(OutputType.FILE);
		File tar1=new File("C:\\Users\\Admin\\Desktop\\sc1.png");  //we need to change name of file at every time
		FileUtils.copyFile(src1, tar1);
		driver.close();
		
		
	}

}
