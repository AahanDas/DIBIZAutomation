package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US18_10_11_12_13_14_15_TDM_ViewAllDO extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US18_10_11_12_13_14_15_TDM_ViewAllDO";
		testDescription = "US18_10_11_12_13_14_15_TDM_ViewAllDO";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US18_10_11_12_13_14_15_TDM_ViewAllDO";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
	
		
		  public void loginLogOut(String uName, String pwd) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnDeliveryOrdersTabIncoming()
		.clickOnVIEWALLDELIVERYORDERSIncomingDO()
		.checkPendingTab()
		.checkAcceptedTab()
		.checkOnHoldTab()
		.checkRejectedTab()
		.checkAnyTab();
		
		
		
}
}