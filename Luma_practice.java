package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Luma_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Abdul");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Azeem");
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("abdul121@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abdul@1234");
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("abdul@1234");
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();

		String actual = "Abdul Azeem";
		String email = driver.findElement(By.xpath("(//div[@class=\"box-content\"])[1]")).getText();
		System.out.println(email);
//		String exp=email.equals(actual)
		if (email.contains(actual)) {
//		if(email.equals(actual)) {

			System.out.println("your name is confirmed");
		} else {
			System.out.println("your name is unmatched");
		}

	}

}
