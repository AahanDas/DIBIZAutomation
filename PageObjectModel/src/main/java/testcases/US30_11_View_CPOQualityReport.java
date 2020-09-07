package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US30_11_View_CPOQualityReport extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US30_11_View_CPOQualityReport";
		testDescription = "US30_11_View_CPOQualityReport";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillQualityCreateReportCPOQuality";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String batctRef, String FFA, String DOBI, 
			String Tank) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnQuality()
		.clickOnCPOQualityTab()
		.clickOnViewForCPOQuality();

}
}
