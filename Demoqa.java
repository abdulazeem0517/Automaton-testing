package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
//		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("Azeem");
		driver.findElement(By.id("lastName")).sendKeys("Abdul");
		driver.findElement(By.id("userEmail")).sendKeys("abdulazeem0517@gmail.com");
//		driver.findElement(By.className("custom-control-label")).click();
		driver.navigate().refresh();
		//driver.findElement(By.id("userNumber")).sendKeys("9515170586");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]//following::input[6]")).sendKeys("24865521");
//		driver.findElement(By.id("dateOfBirthInput"))
//		driver.findElement(By.id("dateOfBirthInput")).sendKeys("16 MAR 1999");
		//driver.findElement(By.className("react-datepicker__month-select")).click();
		//driver.findElement(By.className("react-datepicker__month-select")).sendKeys("March");
		//driver.findElement(By.className("react-datepicker__year-select")).click();
		//driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1999");
		//driver.findElement(By.className("react-datepicker__year-select")).click();
		////driver.findElement(By.className("react-datepicker__day react-datepicker")).sendKeys("16");
		//driver.findElement(By.className("react-datepicker__week")).sendKeys("16");
		//driver.findElement(By.className("react-datepicker__day react-datepicker__day--016 react-datepicker__day--selected")).click();
		//driver.findElement(By.className("react-datepicker__day react-datepicker__day--016")).click();

		//driver.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3")).sendKeys("JAVA AND SELINIUM");
		//driver.findElement(By.className("custom-control-label")).click();
		//driver.findElement(By.className("custom-control-label")).click();
		//driver.findElement(By.className("custom-control-label")).click();
		//driver.findElement(By.className("uploadPicture")

	}

}
