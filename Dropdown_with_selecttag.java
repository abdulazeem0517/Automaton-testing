package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_with_selecttag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement country = driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		Select c = new Select(country);
		c.selectByVisibleText("India");
		WebElement state = driver.findElement(By.xpath("//*[@id=\"state-list\"]"));
		Select s = new Select(state);
		s.selectByValue("22");

	}

}
