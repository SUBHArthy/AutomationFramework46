package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider = "dataProviderEx")
	public void destination(String src, String dest) {
		System.out.println("from " + src + " to " + dest);
	}

	@DataProvider
	public Object[][] dataProviderEx() {
		Object[][] obj = new Object[2][2];
		obj[0][0] = "Digha";
		obj[0][1] = "Puri";

		obj[1][0] = "darjeeling";
		obj[1][1] = "sikim";
		return obj;
	}
}
