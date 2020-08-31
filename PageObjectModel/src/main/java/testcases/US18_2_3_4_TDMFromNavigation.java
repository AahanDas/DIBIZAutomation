package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US18_2_3_4_TDMFromNavigation extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US18_2_3_4_TDMFromNavigation";
		testDescription = "US18_2_3_4_TDMFromNavigation";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US18_2_3_4_TDMFromNavigation";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu();
}
}
