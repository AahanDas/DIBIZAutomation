package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillProductionPlotInput extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Palm Oil Mill Production PlotInput";
		testDescription = "PalmOilMillProductionPlotInput";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillProductionPlotInput";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String product, String quantity, String productionLine) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnProduction()
		.clickOnPlotInput()
		.selectChooseProduct(product)
		.selectCheckBoxOfConsignmentNumber()
		.enterQuantityUsed(quantity)
		.enterProductionLine(productionLine)
		.clickOnSubmit();
}
}
