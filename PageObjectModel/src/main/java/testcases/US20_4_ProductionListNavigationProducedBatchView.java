package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US20_4_ProductionListNavigationProducedBatchView extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US20_4_ProductionListNavigationProducedBatchView";
		testDescription = "US20_4_ProductionListNavigationProducedBatchView";
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
		.clickOnProducedBatchTab()
		.clicOnProducedBatchDetailsView()
		.clickOnBackButton();
		
}
}