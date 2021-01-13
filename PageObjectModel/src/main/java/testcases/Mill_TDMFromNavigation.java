package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_TDMFromNavigation extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US18_2_3_4_TDMFromNavigation";
		testDescription = "Palm Oil Mill_TDMFromNavigation";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillLogin";
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
