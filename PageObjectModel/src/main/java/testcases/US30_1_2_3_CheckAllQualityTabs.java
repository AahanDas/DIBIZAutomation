package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US30_1_2_3_CheckAllQualityTabs extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US30_1_2_3_CheckAllQualityTabs";
		testDescription = "US30_1_2_3_CheckAllQualityTabs";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillQualityCreateReportFFBQuality";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String DO, String product, String RipeBunch, 
			String OverRipe, String UnderRipe, String EmptyBunches) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnQuality()
		.verifyFFBCPOQualityDateColumn()
		.verifyFFBCPOQualityConsignmentNumberColumn()
		.verifyFFBQualityRipeColumn()
		.verifyFFBQualityOverRipeColumn()
		.verifyFFBQualityUnderRipeColumn()
		.verifyFFBQualityEmptyColumn()
		.clickOnCPOQualityTab()
		.verifyFFBCPOQualityDateColumn()
		.verifyFFBCPOQualityConsignmentNumberColumn()
		.verifyCPOQualityFFAPercentageColumn()
		.verifyCPOQualityDOBIColumn()
		.verifyCPOQualityMNIColumn();
}
}
