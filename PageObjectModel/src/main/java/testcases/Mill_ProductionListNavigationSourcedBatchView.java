package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_ProductionListNavigationSourcedBatchView extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US20_1_2_3_ProductionListNavigationSourcedBatchView";
		testDescription = "Palm Oil Mill_ProductionListNavigationSourcedBatchView";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US20_1_2_3_ProductionListNavigationSourcedBatchView";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnProduction()
		.clickOnSourcedBatchDetailsView()
		.clickOnBackButton();

}
}
