package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US30_4_5_CreateFFBQualityReport extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US30_4_5_CreateFFBQualityReport";
		testDescription = "PalmOilMillQualityCreateReportFFBQuality";
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
		.selectFFBQualityFromCreateReportDropDown()
		.selectDOList(DO)
		//.selectProductSelection(product)
		.clickOnSubmitButton()
		.enterNumberOfRipeBunches(RipeBunch)
		.enterNumberOfOverRipeBunches(OverRipe)
		.enterNumberOfUnderRipeBunches(UnderRipe)
		.enterNumberOfEmptyBunches(EmptyBunches)
		.clickOnCreate();
		

}
}
