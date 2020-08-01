package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryIncomingDOViewAssociatedDocs extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryIncomingDOViewAssociatedDocs";
		testDescription = "RefineryIncomingDOViewAssociatedDocs";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryIncomingDOViewAssociatedDocs";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnIncomingDeliveryOrders()
		.clickOnIncomingDeliveryOrdersView()
		.clickOnIncomingDOAssociatedDocs();
}
}
