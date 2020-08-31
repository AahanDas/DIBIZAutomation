package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US18_20_IncomingDOStatusChangeToDelivered extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US18_20_IncomingDOStatusChangeToDelivered";
		testDescription = "US18_20_IncomingDOStatusChangeToDelivered";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US18_20_IncomingDOStatusChangeToDelivered";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String remarksAcknowledge, 
			String remarksAccepted, String remarksReceivedGoods) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnIncomingDeliveryOrders()
		.clickOnIncomingDeliveryOrdersView()
		.clickOnActionAcknowledge()
		.enterRemarksForStatusChange(remarksAcknowledge)
		.clickSubmitForRemarksStatusChange()
		.clickOnActionAccepted()
		.enterRemarksForStatusChange(remarksAccepted)
		.clickSubmitForRemarksStatusChange()
		.clickOnActionReceivedGoods()
		.enterRemarksForStatusChange(remarksReceivedGoods)
		.clickSubmitForRemarksStatusChange();
		/*.clickOnTradeDocumentManagerMainMenu()
		.clickOnIncomingDeliveryOrders();*/
		
		
}
}