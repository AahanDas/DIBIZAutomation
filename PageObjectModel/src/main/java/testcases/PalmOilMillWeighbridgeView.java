package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillWeighbridgeView extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Weighbridge View";
		testDescription = "PalmOilMillWeighbridgeView";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillWeighbridgeView";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnWeighBridgeMainMenu()
		.clickOnVIEW();

}
}
