package Campaigns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.Excel_Utility;
import generic_utility.Java_Utility;
import generic_utility.Webdriver_Utility;

public class CreateCampaign extends BaseClass{

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	@Test
	public void createCampaign() throws Throwable {
	
		Webdriver_Utility web = new Webdriver_Utility();
		WebElement more = driver.findElement(By.linkText("More"));
		web.mouseOverOnElement(driver, more);

		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

		Java_Utility jav = new Java_Utility();
		int ranNum = jav.getRandomNum(1000);

		Excel_Utility ex = new Excel_Utility();
		String data = ex.getExcelData("Campaign", 0, 0) + ranNum;

		driver.findElement(By.name("campaignname")).sendKeys(data);

		driver.findElement(By.name("button")).click();

	}

}
