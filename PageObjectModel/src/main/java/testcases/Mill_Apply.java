package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_Apply extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US23_4_5_Apply";
		testDescription = "PalmOilMill_Apply";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillAuditReport";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String companyInfo, String transactionInfo) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnAuditReportsFromMenu()
		.chooseFromDate()
		.clickOnApplyButton();
}
}
