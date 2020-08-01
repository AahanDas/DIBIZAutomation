package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryPartnerManagementPartnerListView extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryPartnerManagementPartnerListView";
		testDescription = "RefineryPartnerManagementPartnerListView";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryPartnerManagementPartnerListView";
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
