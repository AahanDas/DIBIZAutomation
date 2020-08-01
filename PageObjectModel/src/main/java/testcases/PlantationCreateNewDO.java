package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationCreateNewDO extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationCreateNewDO";
		testDescription = "PlantationCreateNewDO";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationCreateNewDO";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String partner, String VehicleNumber, String DriverName, String DispatchedThrough,
			String ShipperReferenceNumber, String Product, String Quantity, String Remarks, String Remarks1) {
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
		.clickOnPreviewDetails()
		.clickOnSubmitDetails()
		.enterRemarks(Remarks1)
		.clickOnSubmitButton()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnDeliveryOrdersFromOutGoing()
		.clickOnVIEWlink();
		
		
}
}