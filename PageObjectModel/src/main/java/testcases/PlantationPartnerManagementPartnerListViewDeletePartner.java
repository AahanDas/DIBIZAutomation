package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationPartnerManagementPartnerListViewDeletePartner extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationPartnerManagementPartnerListViewDeletePartner";
		testDescription = "PlantationPartnerManagementPartnerListViewDeletePartner";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationPartnerManagementPartnerListViewDeletePartner";
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