package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationAuditReport extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationAuditReport";
		testDescription = "PlantationAuditReport";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationAuditReport";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnAuditReportsFromMenu()
		.chooseFromDate()
		.clickOnApplyButton()
		.clickOnShowMore();
	}

}

