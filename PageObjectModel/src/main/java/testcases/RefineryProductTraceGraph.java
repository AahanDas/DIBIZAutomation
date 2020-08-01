package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryProductTraceGraph extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryProductTraceGraph";
		testDescription = "RefineryProductTraceGraph";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryProductTraceGraph";
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
		.clickOnGraphTab()
		.clickOnMinusForGraph()
		.clickOnPlusForGraph();
	}

}
