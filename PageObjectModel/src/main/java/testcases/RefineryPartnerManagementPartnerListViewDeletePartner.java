package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryPartnerManagementPartnerListViewDeletePartner extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryPartnerManagementPartnerListViewDeletePartner";
		testDescription = "RefineryPartnerManagementPartnerListViewDeletePartner";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryPartnerManagementPartnerListViewDeletePartner";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickPartnerModule()
		.clickOnPartnerListView()
		.clickOnDeletePartnerButton()
		.clickOnProceedButton()
		.clickOnOKButton();

}
}