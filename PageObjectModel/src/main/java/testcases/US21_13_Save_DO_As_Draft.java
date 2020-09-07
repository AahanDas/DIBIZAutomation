package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US21_13_Save_DO_As_Draft extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US21_13_Save_DO_As_Draft";
		testDescription = "US21_13_Save_DO_As_Draft";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US21_1_2_3_4_5_6_7_9_14_15_16";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String partner, String VehicleNumber, String DriverName, String DispatchedThrough,
			String ShipperReferenceNumber, String Product, String Quantity, String Remarks, String Remarks1) throws InterruptedException {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnCreateNewdropDown()
		.searchPartner(partner)
		.selectPartner()
		.clickOnEnterDetails()
		
		.enterVehicleNumber(VehicleNumber)
		.enterDriverName(DriverName)
		
		.EnterSelectExpectedDeliveryDate()
		//.enterDispatchedThrough(DispatchedThrough)
		//.enterShipperReferenceNumber(ShipperReferenceNumber)
		.clickOnAddProduct()
		.selectProductFromDropDown(Product)
		.enterQuantity(Quantity)
		.clickOnSubmit()
		.enterRemarks(Remarks)
		.clickOnSaveButton();
}
}