package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillProductTraceTree extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Product Trace Tree";
		testDescription = "PalmOilMillProductTraceTree";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillProductTraceTree";
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
