package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillCreateReportFFBQuality extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Create Report FFB Quality";
		testDescription = "PalmOilMillCreateReportFFBQuality";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillCreateReportFFBQuality";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String DO, String product, String RipeBunches, String OverRipeBunches,
			String UnderRipeBunches, String EmptyBunches) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnQuality()
		.selectFFBQualityFromCreateReportDropDown()
		.selectDOList(DO)
		.selectProductSelection(product)
		.clickOnSubmitButton()
		.enterNumberOfRipeBunches(RipeBunches)
		.enterNumberOfOverRipeBunches(OverRipeBunches)
		.enterNumberOfUnderRipeBunches(UnderRipeBunches)
		.enterNumberOfEmptyBunches(EmptyBunches)
		.clickOnCreate();
	}
}
