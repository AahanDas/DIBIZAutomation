package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US28_Settings_PasswordChange  extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US28_Settings_PasswordChange";
		testDescription = "US28_Settings_PasswordChange";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US28_Settings_PasswordChange";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd, String currentPassword, 
				  String newPassword, String retypePassword) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnUserLogo()
		.clickOnSettings()
		.clickOnPasswordView()
		.TypeYourCurrentPassword(currentPassword)
		.TypeYourNewPassword(newPassword)
		.RetypeYourNewPassword(retypePassword)
		.clickOnUpdateButton();
		

}
}
