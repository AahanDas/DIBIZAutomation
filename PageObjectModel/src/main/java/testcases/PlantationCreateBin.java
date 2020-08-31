package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationCreateBin extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationCreateBin";
		testDescription = "PlantationCreateBin";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationCreateBin";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd,String Product, String Harvester, String FFBCount, String Area, String Block,
			String Phase, String unripe, String rotten, String Loose, String VehicleType, String VehicleNumber, String CrewMember, String BinLabel) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
				/*
				 * .clickOnTicket() .clickOnCreateTicket() .searchProduct(Product)
				 * .SelectProduct() .selectHarvester(Harvester) .enterFFBCount(FFBCount)
				 * .enterSelectArea(Area) .enterSelectBlock(Block) .enterSelectPhase(Phase)
				 * .enterUnripeBunches(unripe) .enterRottenBunches(rotten)
				 * .enterLooseFruitlets(Loose) .clickOnCreate() .clickOnHomeFromNavigation()
				 */
		.clickOnBin()
		.clickOnCreateBin()
		.enterVehicleType(VehicleType)
		.enterVehicleNumber(VehicleNumber)
		.enterCrewMember(CrewMember)
		.enterBinLabel(BinLabel)
		.clickOnTicketNumberCheckBox()
		.clickOnCreate()
		.clickOnMarkAsComplete()
		.clickOnYesinConfirmPopUpPage();

}
}
