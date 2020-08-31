package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillIncomingDOStatusChangeToDelivered extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PalmOilMillIncomingDOStatusChangeToDelivered";
		testDescription = "PalmOilMillIncomingDOStatusChangeToDelivered";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillIncomingDOStatusChangeToDelivered";
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