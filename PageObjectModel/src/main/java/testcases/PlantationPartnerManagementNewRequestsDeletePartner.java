package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationPartnerManagementNewRequestsDeletePartner extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationPartnerManagementNewRequestsDeletePartner";
		testDescription = "PlantationPartnerManagementNewRequestsDeletePartner";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationPartnerManagementNewRequestsDeletePartner";
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
