package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationOutgoingDOVIEWOriginal extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationOutgoingDOVIEWOriginal";
		testDescription = "PlantationOutgoingDOVIEWOriginal";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationOutgoingDOVIEWOriginal";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnOutgoingDeliveryOrders()
		.clickOnOutgoingDeliveryOrdersView();
	}

}
