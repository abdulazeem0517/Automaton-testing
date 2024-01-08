package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoblaze_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement item=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a"));
		Actions act=new Actions(driver);
		act.moveToElement(item);
		item.click();
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
//		driver.switchTo().alert().accept();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		
		String cartitem=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
		System.out.println(cartitem);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		String totalamt=driver.findElement(By.xpath("//*[@id=\"totalm\"]")).getText();
		System.out.println(totalamt);
		
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Abdul");
		driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("ICICI credit card");
		driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("December");
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2023");
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		String order_details=driver.findElement(By.xpath("/html/body/div[10]")).getText();
		System.out.println(order_details);
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		
		
		
		
		
		
		
		
		
	}
	

}
