package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_ClickSigninWithoutEnteringPassword extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US17_6_ClickSigninWithoutEnteringPassword";
		testDescription = "PalmOilMill_ClickSigninWithoutEnteringPassword";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillQualityCreateReportCPOQuality";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String batctRef, String FFA, String DOBI, 
			String Tank) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.verifySignInButtonDisableOrNot();
	}
}