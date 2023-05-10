package Contacts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM.HomePage;
import generic_utility.BaseClass;
import generic_utility.Excel_Utility;
import generic_utility.Java_Utility;

public class CreateContact extends BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	@Test
	public void createContact() throws Throwable {

//		driver.findElement(By.linkText("Contacts")).click();
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//
//		Java_Utility jav = new Java_Utility();
//		int ranNum = jav.getRandomNum(100);
//		Excel_Utility ex = new Excel_Utility();
//		String cont = ex.getExcelData("Contacts", 0, 1) + ranNum;
//
//		driver.findElement(By.name("lastname")).sendKeys(cont);
//		driver.findElement(By.name("button")).click();

		HomePage home = new HomePage(driver);
		home.getContactLinkText();
		

	}

}
