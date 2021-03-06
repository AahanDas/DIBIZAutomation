package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_ClickSigninWithInvalidCredential extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US17_5_ClickSigninWithInvalidCredential";
		testDescription = "Palm Oil Mill_ClickSigninWithInvalidCredential";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US17_5_ClickSigninWithInvalidCredential";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickOnSignInAndVerifyToastMessageForLoginFailure();
		
	}
}