package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryOutgoingDOVIEWAttachments extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryOutgoingDOVIEWAttachments";
		testDescription = "RefineryOutgoingDOVIEWAttachments";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryOutgoingDOVIEWAttachments";
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