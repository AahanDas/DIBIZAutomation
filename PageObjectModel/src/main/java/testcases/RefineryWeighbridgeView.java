package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryWeighbridgeView extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryWeighbridgeView";
		testDescription = "RefineryWeighbridgeView";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryWeighbridgeView";
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
