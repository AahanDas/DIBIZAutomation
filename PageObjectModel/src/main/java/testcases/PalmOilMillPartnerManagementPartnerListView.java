package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillPartnerManagementPartnerListView extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PalmOilMillPartnerManagementPartnerListView";
		testDescription = "PalmOilMillPartnerManagementPartnerListView";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillPartnerManagementPartnerListView";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickPartnerModule()
		.clickOnPartnerListView();

}
}
