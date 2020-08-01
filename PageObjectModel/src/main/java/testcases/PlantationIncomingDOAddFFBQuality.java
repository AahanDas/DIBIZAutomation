package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationIncomingDOAddFFBQuality extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationIncomingDOAddFFBQuality";
		testDescription = "PlantationIncomingDOAddFFBQuality";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationIncomingDOAddFFBQuality";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd,String DO, String product, String RipeBunches, String OverRipeBunches, String UnderRipeBunches, 
			String EmptyBunches) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnIncomingDeliveryOrders()
		.clickOnIncomingDeliveryOrdersAddFFBQuality()
		.selectDOList(DO)
		.selectProductSelection(product)
		.clickOnSubmitButton()
		.EnterNumberOfRipeBunches(RipeBunches)
		.EnterNumberOfOverRipeBunches(OverRipeBunches)
		.EnterNumberOfUnderRipeBunches(UnderRipeBunches)
		.EnterNumberOfEmptyBunches(EmptyBunches)
		.clickOnCreateButton();
		

}
}