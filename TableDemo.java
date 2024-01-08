package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(2000);
		int rows=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		System.out.println("the number of rows are" +rows);
		int cols=driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
		System.out.println("the number of rows are" +cols);
		String cell=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[2]//td[3]")).getText();
		System.out.println("the cell value u search for is " +cell);
		
		System.out.println("Company"+"	"+"Contact"+"	"+"Country");
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				String data=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
	
		}
		
		driver.close();
		
		

	}

}
