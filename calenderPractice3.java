package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class calenderPractice3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");

		Thread.sleep(2000); 
		driver.findElement(By.id("first_date_picker")).click();
    
//  GETTING TEXT OG MONTH AND YEAR
   String mm=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
   String yy=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
   
//   REQURED DATE AND YEAR
   String mon="April";
   int yer=2026;
   String dayy="25";
//   CONVERTING INTIGER TO STRING
   String yer1=Integer.toString(yer);
   
//   PRESENT YEAR
   int current_year=Integer.parseInt(yy);
   
   while(true) {
	   mm=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
       yy=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
       
//       YEAR IS GREATER THEN PRESENT YEAR
	   if (yer > current_year) {
		   if(mm.equals(mon) && yy.equals(yer1)) {
			   break;
		   }
		   else {
//			   CLICKING FORWORD BUTTON
			   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		   }
		   
	   }
	   else {
//		   GIVEN YEAR IS LESSTHEN PRESENT YEAR
		   if (yer < current_year) {
//			   COMPARE MONTH AND YEAR
			   if(mm.equals(mon) && yy.equals(yer1)) {
				   break;
			   }
			   else {
//				   CLICKING PREVIVE BUTTON
				   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();    				   
			   }
		   }
	   }
	   
   } 
//   SELECT DATE
   java.util.List<WebElement> jj=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//td"));
   for(WebElement kk:jj) {
	   if(kk.getText().equals(dayy)) {
		   kk.click();
		   break;
	   }
	   
   }
	}

}
