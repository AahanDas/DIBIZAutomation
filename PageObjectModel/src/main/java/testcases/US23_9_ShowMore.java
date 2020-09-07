package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US23_9_ShowMore extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US23_9_ShowMore";
		testDescription = "US23_9_ShowMore";
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
		.clickOnApplyButton()
		.clickOnShowMore();
	}
}
