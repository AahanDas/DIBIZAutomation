package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Plantation_OutgoingDOAddWeighbridge extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationOutgoingDOAddWeighbridge";
		testDescription = "PlantationOutgoingDOAddWeighbridge";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationOutgoingDOAddWeighbridge";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String grossWeight, String tareWeight, String ticketNumber) throws IOException {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnOutgoingDeliveryOrders()
		//.ReadDONumberAndClickOnView()
		.ReadDONumberAndclickOnOutgoingDeliveryOrdersAddWeighbridge()
		//.selectDOList(DO)
		//.selectProductSelection(product)
		.clickOnSubmitButton()
		.entergrossWeight(grossWeight)
		.entertareWeight(tareWeight)
		.enterticketNumber(ticketNumber)
		.clickOnSubmit();

}
}
