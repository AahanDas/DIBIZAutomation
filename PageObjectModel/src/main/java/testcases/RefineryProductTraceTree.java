package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryProductTraceTree extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryProductTraceTree";
		testDescription = "RefineryProductTraceTree";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryProductTraceTree";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String product) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnProductTraceFromMenu()
		.chooseProduct(product)
		.chooseFromDate()
		.clickOnApplyButton()
		.clickOnTraceLink()
		.clickOnMinusForTree()
		.clickOnPlusForTree();
	}
}
