package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US18_19_ViewIncomingDODetails extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US18_19_ViewIncomingDODetails";
		testDescription = "US18_19_ViewIncomingDODetails";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US18_19_ViewIncomingDODetails";
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
		.checkAllDetailsInDeliveryOrderPageForIncomingDO();
		
		
}
}