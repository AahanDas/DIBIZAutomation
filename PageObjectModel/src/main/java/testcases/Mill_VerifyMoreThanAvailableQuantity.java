package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_VerifyMoreThanAvailableQuantity extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US20_11_VerifyMoreThanAvailableQuantity";
		testDescription = "Palm Oil Mill_VerifyMoreThanAvailableQuantity";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US20_11_VerifyMoreThanAvailableQuantity";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd, String partner, String
		  entityReference, String VehicleNumber, String DriverName, String
		  DispatchedThrough, String ShipperReferenceNumber, String Product, String
		  Quantity, String Remarks, String Remarks1) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnCreateNewdropDown()
		.searchPartner(partner)
		.selectPartner()
		.clickOnEnterDetails()
	//	.enterDeliveryOrderReference(entityReference)
		.enterVehicleNumber(VehicleNumber)
		.enterDriverName(DriverName)
		
		.EnterSelectExpectedDeliveryDate()
		//.enterDispatchedThrough(DispatchedThrough)
		//.enterShipperReferenceNumber(ShipperReferenceNumber)
		.clickOnAddProduct()
		.selectProductFromDropDown(Product)
		.enterQuantity(Quantity)
		.verifySubmitButtonDisableOrNot();
		
		
}
}