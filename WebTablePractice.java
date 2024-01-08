package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//get the number of Rows
		int rows=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("the number of rows: " +rows);
		//Get the number of Columns
		int cols=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th")).size();
		System.out.println("the number of columns: " +cols);
		//Get the particular value from the table
		String singlevalue=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td[2]")).getText();
		System.out.println("the exact value from table is " +singlevalue);
		
		//printing all data from table
		
		System.out.println("Company"+"	"+"Contact"+"	"+"Country");
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				String data=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
			}
	
		
	}
}
