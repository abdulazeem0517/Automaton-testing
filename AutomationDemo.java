package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Abdul Azeem");
		driver.findElement(By.id("email")).sendKeys("abdulazeem0517@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		driver.findElement(By.id("textarea")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//input[@value=\"male\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"sunday\"]")).click();
		WebElement testDropDown = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select country = new Select(testDropDown);
		country.selectByValue("india");
		WebElement colourhandle = driver.findElement(By.xpath("//*[@id=\"colors\"]"));
		Select colour = new Select(colourhandle);
		colour.selectByValue("red");
		colour.selectByValue("yellow");
		int rows=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("the no of rows on table: "+rows);
		int cols=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println("the no of columns on table: "+cols);
		String value=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[3]")).getText();
//		String cellvalue=value.getText();
		System.out.println("the value on table: "+value);
		driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr[3]//td[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"pagination\"]/li[1]/a")).click();
		driver.manage().window();
		
		
		
		
		
		
//		System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
		
		
//		for(int r=2;r<=rows;r++)
//		{
////			4 elements in the row so thats why inside for loop will run for 4 times
//			for(int c=1;c<=cols;c++)
//			{
//				String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(value1+"\t"); 
//			}
//			System.out.println();
//		}
		
		
		
		

		
		

	}

}
