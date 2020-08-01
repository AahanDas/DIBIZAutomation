package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillWeighbridgeCreateSlip extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Weigh bridge Create Slip";
		testDescription = "PalmOilMillWeighbridgeCreateSlip";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillWeighbridgeCreateSlip";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String DO, String product, String grossWeight, String tareWeight, String ticketNumber) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnWeighBridgeMainMenu()
		.clickOnCreateSlip()
		.selectDOList(DO)
		.selectProductSelection(product)
		.clickOnSubmitButton()
		.entergrossWeight(grossWeight)
		.entertareWeight(tareWeight)
		.enterticketNumber(ticketNumber)
		.clickOnSubmit();
}
}
