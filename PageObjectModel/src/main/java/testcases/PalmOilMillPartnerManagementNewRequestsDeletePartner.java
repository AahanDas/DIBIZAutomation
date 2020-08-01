package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillPartnerManagementNewRequestsDeletePartner extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Partner Management New Requests Delete Partner";
		testDescription = "PalmOilMillPartnerManagementNewRequestsDeletePartner";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillPartnerManagementNewRequestsDeletePartner";
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
