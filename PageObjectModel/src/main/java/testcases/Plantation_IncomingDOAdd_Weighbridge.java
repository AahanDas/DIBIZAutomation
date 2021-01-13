package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Plantation_IncomingDOAdd_Weighbridge extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationIncomingDOAddWeighbridge";
		testDescription = "PlantationIncomingDOAddWeighbridge";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationIncomingDOAddWeighbridge";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd,  String grossWeight, String tareWeight, String ticketNumber) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnIncomingDeliveryOrders()
		.clickOnIncomingDeliveryOrdersAddWeighbridge()
		//.selectDOList(DO)
		//.selectProductSelection(product)
		.clickOnSubmitButton()
		.entergrossWeight(grossWeight)
		.entertareWeight(tareWeight)
		.enterticketNumber(ticketNumber)
		.clickOnSubmit();

}
}
