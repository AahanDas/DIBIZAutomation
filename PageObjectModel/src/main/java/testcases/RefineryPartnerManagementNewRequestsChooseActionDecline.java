package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryPartnerManagementNewRequestsChooseActionDecline extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryPartnerManagementNewRequestsChooseActionDecline";
		testDescription = "RefineryPartnerManagementNewRequestsChooseActionDecline";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryPartnerManagementNewRequestsChooseActionDecline";
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