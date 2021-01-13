package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_PlotInput extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US20_5_6_7_8_9_10_PlotInput";
		testDescription = "PalmOilMill_PlotInput";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillProductionPlotInput";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String product, String quantity, String productionLine) throws IOException {
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
		.StoreBatchReference();
}
}