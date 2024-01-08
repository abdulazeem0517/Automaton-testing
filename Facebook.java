package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe"); 
//		ChromeOptions options=new Options();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver =new edgeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
	}

}
