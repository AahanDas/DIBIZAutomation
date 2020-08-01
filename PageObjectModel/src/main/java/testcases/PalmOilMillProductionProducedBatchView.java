package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillProductionProducedBatchView extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Production Produced Batch View";
		testDescription = "PalmOilMillProductionProducedBatchView";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillProductionProducedBatchView";
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
