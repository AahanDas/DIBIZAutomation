package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationOutgoingDOVIEWAttachments extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationOutgoingDOVIEWAttachments";
		testDescription = "PlantationOutgoingDOVIEWAttachments";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationOutgoingDOVIEWAttachments";
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