package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillWeighbridgeEdit extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Weighbridge Edit";
		testDescription = "PalmOilMillWeighbridgeEdit";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillWeighbridgeEdit";
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
