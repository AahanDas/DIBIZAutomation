package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_Authorization_Info_Check extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US21_11_Authorization_Info_Check";
		testDescription = "Palm Oil Mill_Authorization_Info_Check";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US21_11_Authorization_Info_Check";
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
		.clickOnAuthorization()
		.verifyReportedBy()
		.verifyRole()
		.verifyAuthorisedSignatory();
	}
}