package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillQualityCreateReportCPOQuality  extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Quality Create Report CPOQuality";
		testDescription = "PalmOilMillQualityCreateReportCPOQuality";
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
		.selectCPOQualityFromCreateReportDropDown()
		.SelectCPOBatchReference(batctRef)
		.EnterFFA(FFA)
		.EnterDOBI(DOBI)
		.SelectChooseTank(Tank)
		.clickOnCommonCreateButton();
}
}