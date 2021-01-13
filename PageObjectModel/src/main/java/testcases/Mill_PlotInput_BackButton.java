package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_PlotInput_BackButton extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US20_12_13_PlotInput_BackButton";
		testDescription = "PAlm Oil Mill_PlotInput_BackButton";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US20_12_13_PlotInput_BackButton";
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
		.clickOnSubmit()
		.clickOnBackButton();
}
}