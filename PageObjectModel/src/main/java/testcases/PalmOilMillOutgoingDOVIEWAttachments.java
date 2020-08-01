package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillOutgoingDOVIEWAttachments extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Outgoing DO View Attachments";
		testDescription = "PalmOilMillOutgoingDOVIEWAttachments";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillOutgoingDOVIEWAttachments";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnOutgoingDeliveryOrders()
		.clickOnOutgoingDeliveryOrdersView()
		.clickOnOutgoingDOAttachments();

}
}