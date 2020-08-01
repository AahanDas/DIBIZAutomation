package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryPartnerManagementNewRequestsDeletePartner extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryPartnerManagementNewRequestsDeletePartner";
		testDescription = "RefineryPartnerManagementNewRequestsDeletePartner";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryPartnerManagementNewRequestsDeletePartner";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickPartnerModule()
		.clickOnNewRequestsTab()
		.clickOnNewRequestsView()
		.clickOnAcceptButtonForPartnerDetail()
		.clickOnOKButton();
	}
}
