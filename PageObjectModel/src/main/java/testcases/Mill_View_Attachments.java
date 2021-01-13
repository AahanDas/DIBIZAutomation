package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_View_Attachments extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US21_17_View_Attachments";
		testDescription = "US21_17_View_Attachments";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US21_17_View_Attachments";
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