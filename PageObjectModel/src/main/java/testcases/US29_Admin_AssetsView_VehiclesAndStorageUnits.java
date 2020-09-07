package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US29_Admin_AssetsView_VehiclesAndStorageUnits extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US29_Admin_AssetsView_VehiclesAndStorageUnits";
		testDescription = "US29_Admin_AssetsView_VehiclesAndStorageUnits";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US29_Admin_AssetsView_VehiclesAndStorageUnits";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnUserLogo()
		.clickOnAdmin()
		.clickOnAssetsView()
		.clickOnVehiclesTab()
		.verifyVehiclesTable()
		.clickOnStorageUnitsTab()
		.verifyStorageUnitsTable();
		

}
}
