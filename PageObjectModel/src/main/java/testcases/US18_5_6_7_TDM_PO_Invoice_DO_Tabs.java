package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US18_5_6_7_TDM_PO_Invoice_DO_Tabs extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US18_5_6_7_TDM_PO_Invoice_DO_Tabs";
		testDescription = "US18_5_6_7_TDM_PO_Invoice_DO_Tabs";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US18_5_6_7_TDM_PO_Invoice_DO_Tabs";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnInvoicesTabIncoming()
		.clickOnPurchaseOrdersTabIncoming()
		.clickOnDeliveryOrdersTabIncoming();
		
}
}
