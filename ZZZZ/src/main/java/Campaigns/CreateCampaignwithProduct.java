package Campaigns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.Excel_Utility;
import generic_utility.Java_Utility;
import generic_utility.Webdriver_Utility;

public class CreateCampaignwithProduct extends BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	@Test
	public void createCampaignwithProduct() throws Throwable {


		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

		Java_Utility jav = new Java_Utility();
		int ranNum = jav.getRandomNum(1000);

		Excel_Utility ex = new Excel_Utility();
		String prod = ex.getExcelData("Product", 0, 0) + ranNum;
		String camp = ex.getExcelData("Campaign", 0, 0) + ranNum;

		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.name("productname")).sendKeys(prod);
		driver.findElement(By.name("button")).click();
		
		Webdriver_Utility web = new Webdriver_Utility();
		WebElement more = driver.findElement(By.linkText("More"));
		web.mouseOverOnElement(driver, more);

		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.name("campaignname")).sendKeys(camp);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();

		web.switchToWindow(driver, "Products&action");

		driver.findElement(By.name("search_text")).sendKeys(prod);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='" + prod + "']")).click();

		web.switchToWindow(driver, "Campaigns&action");

		driver.findElement(By.name("button")).click();

	}

}
