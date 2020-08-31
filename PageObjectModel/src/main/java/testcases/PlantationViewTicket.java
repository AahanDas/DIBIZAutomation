package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationViewTicket extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationViewTicket";
		testDescription = "PlantationViewTicket";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationViewTicket";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTicket()
		.clickOnView();
		
	}

}
