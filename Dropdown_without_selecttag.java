package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdown_without_selecttag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/guntur");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id=\"common-header-region\"]/span")).click();
		List<WebElement> cities = driver.findElements(By.xpath("//div[@class=\"bwc__sc-ttnkwg-19 hkqhSR\"]"));

//		String exactname="Hyderabad";
		String exactname = "Pune";

		for (WebElement city : cities) {
			System.out.println(city.getText());

			if (city.getText().equals(exactname)) {
				city.click();
				break;
			}
		}

	}

}
