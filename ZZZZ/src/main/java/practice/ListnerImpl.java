package practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import generic_utility.BaseClass;

public class ListnerImpl implements ITestListener{

	public void onTestFailure(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		EventFiringWebDriver aEvent=new EventFiringWebDriver(BaseClass.sdriver);
		File src = aEvent.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./ScreenShot/"+testname+".png"));
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	
	
}
