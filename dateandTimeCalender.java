package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class dateandTimeCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.id("dateAndTimePickerInput")).click();
	
		String Cur_Month_Year=driver.findElement(By.xpath("//*[contains(@class,\"current-month\")]")).getText();//October 2023
		String[] Cur_Month_Year_Arr=Cur_Month_Year.split(" ");
		String Cur_Month=Cur_Month_Year_Arr[0]; //oct
		String Cur_Year=Cur_Month_Year_Arr[1];  //2023
		
		String Req_Year="2022";
		int Req_YEAR=Integer.parseInt(Req_Year);
		String Req_Month="May";
		String Req_Date="19";
		String Req_Time="10:00";
		
		//curr year
		int Cur_YEAR=Integer.parseInt(Cur_Year);
while(true)
		{
			Cur_Month_Year=driver.findElement(By.xpath("//*[contains(@class,\"current-month\")]")).getText();//October 2023
			Cur_Month_Year_Arr=Cur_Month_Year.split(" ");//["oct","2023"]
			Cur_Month=Cur_Month_Year_Arr[0];
			Cur_Year=Cur_Month_Year_Arr[1];
			if(Req_YEAR>Cur_YEAR)
			{
				if(Cur_Year.equals(Req_Year) && Cur_Month.equals(Req_Month))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[contains(@class,\"next--with-time\")]")).click();
				}
			}
			else
			{
				if(Cur_Year.equals(Req_Year) && Cur_Month.equals(Req_Month))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[contains(@class,\"previous\")]")).click();
				}
			}
		}
		List<WebElement> Dates =driver.findElements(By.xpath("//div[@class=\"react-datepicker__month\"]//div//div"));
		for(WebElement Date:Dates)
		{
			if(Date.getText().equals(Req_Date))
			{
				Date.click();
				break;
			}
		}
		List<WebElement> Times=driver.findElements(By.xpath("//ul[@class=\"react-datepicker__time-list\"]//li"));
		for (WebElement Time : Times) 
		{
			if(Time.getText().equals(Req_Time))
			{
				Time.click();
				break;
			}
		}
	}
}
