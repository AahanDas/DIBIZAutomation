package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillEditDraftNewDO extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PalmOilMillEditDraftNewDO";
		testDescription = "PalmOilMillEditDraftNewDO";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillCreateNewDO";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String partner, String VehicleNumber, String DriverName, String DispatchedThrough,
			String ShipperReferenceNumber, String Product, String Quantity, String Remarks, String Remarks1) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnOutgoingDraftTab()
		.clickOnFirstVIEWLink()
		.clickOnPreviewDetails()
		.clickOnSubmitDetails()
		.enterRemarks(Remarks1)
		.clickOnSubmitButton()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnDeliveryOrdersFromOutGoing()
		.clickOnVIEWlink();
		
		
}
}