package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryOutgoingDOVIEWAssociatedDocs extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryOutgoingDOVIEWAssociatedDocs";
		testDescription = "RefineryOutgoingDOVIEWAssociatedDocs";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryOutgoingDOVIEWAssociatedDocs";
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
		.clickOnOutgoingDOAssociatedDocs();
}
}