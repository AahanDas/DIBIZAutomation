package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US25_3_DeclinePartner extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US25_3_DeclinePartner";
		testDescription = "US25_3_DeclinePartner";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillPartnerManagementNewRequestsChooseActionDecline";
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