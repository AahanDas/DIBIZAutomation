package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US29_11_Admin_CreateAssets extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US29_11_Admin_CreateAssets";
		testDescription = "US29_11_Admin_CreateAssets";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US29_11_Admin_CreateAssets";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd, String Vehicle, String assetName, String make,
				  String assetNumber, String model, String capacity, String UOM, String type) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnUserLogo()
		.clickOnAdmin()
		.clickOnAssetsView()
		.clickOnCreateAssetButton()
		.SelectVehicle(Vehicle)
		.enterAssetName(assetName)
		.enterMake(make)
		.enterAssetNumber(assetNumber)
		.enterModel(model)
		.enterCapacity(capacity)
		.ChooseUOM(UOM)
		.SelectType(type)
		.clickOnSubmitButton();
		

}
}
