package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryProductionInputStorageUpdate extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryProductionInputStorageUpdate";
		testDescription = "RefineryProductionInputStorageUpdate";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryProductionInputStorageUpdate";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String Tank1, String Quantity1, String Tank2, String Quantity2) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnProduction()
		.clickOnInputStorageUpdateButton()
		.clickOnAssignTankHL()
		.selectTank1(Tank1)
		.enterQuantity1(Quantity1)
		.clickOnAddMoreTankLink()
		.selectTank2(Tank2)
		.enterQuantity2(Quantity2)
		.clickOnSubmitButton();

}
}
