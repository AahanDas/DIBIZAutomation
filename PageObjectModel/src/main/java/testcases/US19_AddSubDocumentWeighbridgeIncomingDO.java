package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US19_AddSubDocumentWeighbridgeIncomingDO  extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US19_AddSubDocumentWeighbridgeIncomingDO";
		testDescription = "PalmOilMillIncomingDOAddWeighbridge";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillIncomingDOAddWeighbridge";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String DO, String product, 
			String grossWeight, String tareWeight, String ticketNumber) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnIncomingDeliveryOrders()
		.clickOnFirstVIEWLink()
		.clickOnAddSubDocumentWeighbridge()
		.entergrossWeight(grossWeight)
		.entertareWeight(tareWeight)
		.enterticketNumber(ticketNumber)
		.clickOnSubmit()
		.validateToastMessage();
		/*.clickOnIncomingDeliveryOrdersAddWeighbridge()
		//.selectDOList(DO)
		//.selectProductSelection(product)
		//.clickOnSubmitButton()
		.entergrossWeight(grossWeight)
		.entertareWeight(tareWeight)
		.enterticketNumber(ticketNumber)
		.clickOnSubmit()
		.validateToastMessage();*/

}
}
