package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DummyTicketDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"product_551\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"travname\"]")).sendKeys("Abdul");
		driver.findElement(By.xpath("//input[@name=\"travlastname\"]")).sendKeys("Azeem");
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
		WebElement month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));
		Select date1=new Select(month);
		date1.selectByValue("2");
		WebElement year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
		Select date2=new Select(year);
		date2.selectByVisibleText("1999");
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sex_1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"traveltype_1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromcity\"]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"tocity\"]")).sendKeys("Goa");
		driver.findElement(By.xpath("//*[@id=\"departon\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"notes\"]")).sendKeys("We prefer Window seat");
//		driver.findElement(By.xpath("//*[@id=\"reasondummy\"]"));
		WebElement typeofapp=driver.findElement(By.xpath("//*[@id=\"reasondummy\"]"));
		Select application=new Select(typeofapp);
		application.selectByVisibleText("Office work place needs it");
		driver.findElement(By.xpath("//*[@id=\"deliverymethod_1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"billname\"]")).sendKeys("Abdul azeem");
		driver.findElement(By.xpath("//*[@id=\"billing_phone\"]")).sendKeys("9515170586");
		driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("abdulazeem0571@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("2-235/3");
		driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).sendKeys("Main road near ricemill");
		driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Karempudi");
//		driver.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]")).click();
		WebElement state=driver.findElement(By.xpath("//*[@id=\"billing_state\"]"));
		Select st=new Select(state);
		st.selectByValue("AP");
//		driver.findElement(By.xpath("//*[@id=\"select2-billing_state-result-odx6-AP\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("522614");
//		driver.findElement(By.xpath("//*[@id=\"quantity_6507e43619c0e\"]")).sendKeys("2");
//		driver.findElement(By.xpath("//*[@id=\"quantity_6507e43619c0e\"]")).sendKeys("2");
		
		
		
		
	
		
		
		
	
	
	
	
	
	
	}
	
}
