package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationPartnerManagementNewRequestsChooseActionDecline extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationPartnerManagementNewRequestsChooseActionDecline";
		testDescription = "PlantationPartnerManagementNewRequestsChooseActionDecline";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationPartnerManagementNewRequestsChooseActionDecline";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickPartnerModule()
		.clickOnNewRequestsTab()
		.selectChooseActionDecline()
		.clickOKButtonForAcceptOrReject();
}
}