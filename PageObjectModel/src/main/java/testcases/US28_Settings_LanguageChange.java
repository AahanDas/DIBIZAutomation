package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US28_Settings_LanguageChange extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US28_Settings_LanguageChange";
		testDescription = "US28_Settings_LanguageChange";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US28_Settings_LanguageChange";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnUserLogo()
		.clickOnSettings()
		.clickOnLanguageView()
		.chooseMalay()
		.clickOnUpdateButton()
		.clickOnProceedButton();

}
}
