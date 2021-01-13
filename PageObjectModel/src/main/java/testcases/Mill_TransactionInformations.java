package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_TransactionInformations extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US23_7_8_TransactionInformations";
		testDescription = "PalmOilMill_TransactionInformations";
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
		.verifyFirstCardTransactionInformation();
	}

}