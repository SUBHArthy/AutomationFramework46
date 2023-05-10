package Contacts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.Excel_Utility;
import generic_utility.Java_Utility;
import generic_utility.Webdriver_Utility;

public class ContactWithOrganization extends BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	@Test
	public void contactWithOrganization() throws Throwable {
//		

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

		Java_Utility jav = new Java_Utility();
		int ranNum = jav.getRandomNum(100);
		Excel_Utility ex = new Excel_Utility();
		String cont = ex.getExcelData("Contacts", 0, 1) + ranNum;
		String org = ex.getExcelData("Organization", 3, 1);
		driver.findElement(By.name("lastname")).sendKeys(cont);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();

		Webdriver_Utility web = new Webdriver_Utility();
		web.switchToWindow(driver, "Accounts&action");
		driver.findElement(By.id("search_txt")).sendKeys(org);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='" + org + "']")).click();

		web.switchToWindow(driver, "Contacts&action");

		driver.findElement(By.name("button")).click();

	}

}
