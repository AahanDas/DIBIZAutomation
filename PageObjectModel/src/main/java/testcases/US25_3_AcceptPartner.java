package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US25_3_AcceptPartner extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US25_3_AcceptPartner";
		testDescription = "US25_3_AcceptPartner";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillPartnerManagementNewRequestsChooseActionAccept";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickPartnerModule()
		.clickOnNewRequestsTab()
		.selectChooseActionAccept()
		.clickOKButtonForAcceptOrReject();
}
}