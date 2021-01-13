package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_ViewAddSubDocumentWeighbridge extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US18_21_ViewAddSubDocumentWeighbridge";
		testDescription = "US18_21_ViewAddSubDocumentWeighbridge";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US18_21_ViewAddSubDocumentWeighbridge";
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
		.clickOnAddSubDocumentWeighbridge()
		.verifyProduct(productName);
		
}
}
