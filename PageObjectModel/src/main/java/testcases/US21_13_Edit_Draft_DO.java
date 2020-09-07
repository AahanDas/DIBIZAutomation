package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US21_13_Edit_Draft_DO extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US21_13_Edit_Draft_DO";
		testDescription = "US21_13_Edit_Draft_DO";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US21_1_2_3_4_5_6_7_9_14_15_16";
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