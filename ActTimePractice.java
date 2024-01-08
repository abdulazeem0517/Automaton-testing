package practice1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class ActTimePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//*[@id=\"topnav\"]//td[4]")).click();
		driver.findElement(By.xpath("//div[@class=\"addNewButton\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"+ New Project\"]")).click();
		driver.findElement(By.xpath("//input[@tabindex=\"1\"]")).sendKeys("Abdul Azeem Testing");
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//div[@class=\"itemRow \"]")).click();
		driver.findElement(By.xpath("//input[@class=\"newCustomerNameField newCustomer\"]")).sendKeys("Charani");
		
//		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[1]/div[2]/input")).sendKeys("charani");
		
//	WebElement ele1 = driver.findElement(By.className("components_combobox cpCombobox"));
//    Select customer=new Select(ele1);
//	customer.selectByVisibleText("AbC");driver.findElement(By.className("dropdownButton"));
//		WebElement dropdownElement = driver.findElement(By.xpath("////*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/input"));
//        dropdownElement.click();

        // Select the value from the dropdown
//        WebElement optionToSelect = driver.findElement(By.xpath("////*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[5]"));
//        optionToSelect.click();
//		driver.findElement(By.className("newCustomerNameField newCustomer")).sendKeys("Abdul");
		driver.findElement(By.xpath("//textarea[@placeholder=\"Add Project Description\"]")).sendKeys("Hear i'm creating a project which is used to automate the site");
		driver.findElement(By.xpath("(//input[@placeholder=\"Enter task name\"])[1]")).sendKeys("Development team");
		driver.findElement(By.xpath("(//input[@placeholder=\"not needed\"])[1]")).sendKeys("1000:0");
		driver.findElement(By.xpath("//*[@id=\"ext-gen51\"]/td[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ext-gen108\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ext-gen157\"]/tbody/tr[2]/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ext-gen157\"]/tbody/tr[2]/td[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"ext-gen157\"]/tbody/tr[7]/td/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ext-gen85\"]/tbody/tr[2]/td/table/tbody/tr[3]/td[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/table/tbody/tr[2]/td[1]/input")).sendKeys("Testing Team");
		driver.findElement(By.xpath("(//input[@maxlength=\"6\"])[2]")).sendKeys("250:0");
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/table/tbody/tr[2]/td[5]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/table/tbody/tr[2]/td[5]/div[1]/div/div/div[1]/div/div[11]")).click();
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[3]/div[2]/div[1]")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"ext-gen61\"]/td[2]/em")).click();
//		driver.findElement(By.xpath("//*[@id=\"ext-gen207\"]/td[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"ext-gen273\"]/tbody/tr[3]/td[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"ext-gen273\"]/tbody/tr[2]/td[4]")).click();
//		driver.findElement(By.xpath("//*[@id=\"ext-gen282\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"ext-gen196\"]/tbody/tr[2]/td/table/tbody/tr[5]/td[3]")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[3]/div/div")).click();
//		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[3]/div/div[3]")).click();
		
//		driver.findElement(By.xpath("//div[@title=\"Development team\"]")).click();
//		driver.findElement(By.xpath("//div[@class=\"taskStatusButton editable pressed\"]]")).click();
//		driver.findElement(By.xpath("(//div[@class=\"workflowStatus statusType_open statusColor_darkGreen statusTypeIcon_darkGreen\"])[3]")).click();
		
//		Actions ac2=new Actions(driver);
//		ac2.moveToElement(project).click().build().perform();
//		WebElement selectStatus1=driver.findElement(By.xpath("(//div[@class=\"taskStatusButton editable\"])[1]"));
//		Select ss1=new Select(selectStatus1);
//		ss1.selectByVisibleText("In Progress");
//		WebElement selectStatus2=driver.findElement(By.xpath("(//div[@class=\"taskStatusButton editable\"])[2]"));
//		Select ss2=new Select(selectStatus2);
//		ss2.selectByVisibleText("Planning");
		
		driver.findElement(By.xpath("//div[@id=\"container_users\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"components_button withPlusIcon\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/table/tbody/tr[2]/td[1]/input")).sendKeys("Abdul");
		driver.findElement(By.xpath("name=\"middleName\"")).sendKeys("SK");
		driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("abdulazeem0517@gmail.com");
		driver.findElement(By.xpath("(//div[@class=\"downIcon\"])[5]")).click();
		driver.findElement(By.xpath("//div[@class=\"item selected\"]")).click();
		driver.findElement(By.xpath("(//input[@name=\"newUserGroupName\"])[2]")).sendKeys("Charani Dev team");
		driver.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[4]")).click();
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
