package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_ViewAddSubDocumentFFBQuality extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US18_22_ViewAddSubDocumentFFBQuality";
		testDescription = "Palm Oil Mill_ViewAddSubDocumentFFBQuality";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US18_22_ViewAddSubDocumentFFBQuality";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String productName) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnIncomingDeliveryOrders()
		.clickOnIncomingDeliveryOrdersView()
		.clickOnAddSubDocumentFFBQuality()
		.verifyProduct(productName);
		
		
}
}