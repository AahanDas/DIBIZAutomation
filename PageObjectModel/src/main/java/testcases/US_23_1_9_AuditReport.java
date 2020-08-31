package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US_23_1_9_AuditReport extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US_23_1_9_AuditReport";
		testDescription = "US_23_1_9_AuditReport";
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
		.clickOnShowMore()
		.verifyFirstCardCompanyInformation(companyInfo)
		.verifyFirstCardTransactionInformation(transactionInfo);
	}

}
