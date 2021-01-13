package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryOutgoingDOAddWeighbridge extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryOutgoingDOAddWeighbridge";
		testDescription = "RefineryOutgoingDOAddWeighbridge";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryOutgoingDOAddWeighbridge";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd,String DO, String product, String grossWeight, String tareWeight, String ticketNumber) throws IOException {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnOutgoingDeliveryOrders()
		.ReadDONumberAndclickOnOutgoingDeliveryOrdersAddWeighbridge()
		//.selectDOList(DO)
		//.selectProductSelection(product)
		//.clickOnSubmitButton()
		.entergrossWeight(grossWeight)
		.entertareWeight(tareWeight)
		.enterticketNumber(ticketNumber)
		.clickOnSubmit();

}
}
