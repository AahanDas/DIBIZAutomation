package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_AddSubDocumentWeighbridgeIncomingDO extends DibizWrappers {

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
			String grossWeight, String tareWeight, String ticketNumber) throws IOException {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnIncomingDeliveryOrders()
		.clickOnFirstVIEWLink()
		
		
		//.ReadDONumberAndClickOnView()
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
