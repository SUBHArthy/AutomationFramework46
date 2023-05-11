package organizations;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.OrganizationsPage;
import POM.ValidationandVerification;
import generic_utility.BaseClass;
import generic_utility.Excel_Utility;
import generic_utility.Java_Utility;

@Listeners(generic_utility.ListnerImp.class)
public class CreateOrganizationWithPOM extends BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	@Test
	public void createOrganizationWithPOM() throws Throwable {



		
		HomePage home = new HomePage(driver);
		home.clickOrganizationsLinkText();

		
		
		OrganizationsPage org = new OrganizationsPage(driver);
		org.clickOrganizationCreateImage();

		Java_Utility j = new Java_Utility();
		int ranNum = j.getRandomNum(1000);

		Excel_Utility ex = new Excel_Utility();
		String exeldata = ex.getExcelData("Organization", 3, 1) + ranNum;

		org.organizationNameTextField(exeldata);
		org.saveButton();

		
		Thread.sleep(1000);

	}

}
//  update
//
//th