package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US21_12_Goback_To_PartnerSelectionPage extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US21_12_Goback_To_PartnerSelectionPage";
		testDescription = "US21_12_Goback_To_PartnerSelectionPage";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US21_12_Goback_To_PartnerSelectionPage";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd, String partner) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnCreateNewdropDown()
		.searchPartner(partner)
		.selectPartner()
		.clickOnEnterDetails()
		.clickOnGoBackButton();
		
		
	}
}
