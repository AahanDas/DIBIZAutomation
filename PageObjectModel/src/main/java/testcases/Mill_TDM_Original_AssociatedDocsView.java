package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_TDM_Original_AssociatedDocsView extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US18_16_17_TDM_Original_AssociatedDocsView";
		testDescription = "Palm Oil Mill_TDM_Original_AssociatedDocsView";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US18_16_17_TDM_Original_AssociatedDocsView";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd, String entity) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnIncomingDeliveryOrders()
		.clickOnFirstVIEWLink()
		.clickOnAssociatedDocsTab()
		.checkForentityType(entity)
		.clickOnOriginalDocsTab();

}
}
