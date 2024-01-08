package practice1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class hycAlerts {

	public static <string> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Abdul azeem");
		driver.switchTo().alert().accept();
		WebElement name1= driver.findElement(By.xpath("//*[@id=\"output\"]"));
//		System.out.println(name1.getText());
		String s1=name1.getText();
		System.out.println(s1);
		String[] val=s1.split(" ");
		String val3=val[3];
		System.out.println(val[3]);
//		if(val.equals()) {
//			System.out.println("Your welcome");
//		}
//		else
//		{
//			System.out.println("user invalid");
//		}
		
//		if(s1.contains("Abdul azeem")) {
//		if(s1.contains("azeem")) {
//		if(s1.contains("Srinu")) {
//			System.out.println("yor the right one");
//		}
//		else {
//			System.out.println("your unable to login");
//		}
////		if(String (name1.Contains("abdul"))) {
//			System.out.println("hello");
//		}
//		else {
//			System.out.println("Bye");
//		}

	}

		
		
	}

