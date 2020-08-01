package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryWeighbridgeEdit extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryWeighbridgeEdit";
		testDescription = "RefineryWeighbridgeEdit";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryWeighbridgeEdit";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String grossWeight, String tareWeight, String ticketNumber) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnWeighBridgeMainMenu()
		.clickOnVIEW()
		.clickOnEDITWEIGHBRIDGE()
		.entergrossWeight(grossWeight)
		.entertareWeight(tareWeight)
		.enterticketNumber(ticketNumber)
		.clickOnSubmit();
		

}
}
