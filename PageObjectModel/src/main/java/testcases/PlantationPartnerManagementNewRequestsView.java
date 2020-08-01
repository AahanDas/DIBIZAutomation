package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationPartnerManagementNewRequestsView extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationPartnerManagementNewRequestsView";
		testDescription = "PlantationPartnerManagementNewRequestsView";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationPartnerManagementNewRequestsView";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickPartnerModule()
		.clickOnNewRequestsTab()
		.clickOnNewRequestsView();

}
}