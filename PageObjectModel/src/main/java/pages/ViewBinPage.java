package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ViewBinPage extends DibizWrappers {

	public ViewBinPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not View Bin Page", "FAIL");
		}

	}

	public ViewBinPage clickOnMarkAsComplete() {
		clickByXpath("//*[contains(text(),'Mark as Complete')]");

		return this;
	}

	public ViewBinPage clickOnYesinConfirmPopUpPage() {
		clickByXpath("//*[contains(text(),'Yes')]");

		return this;
	}
	public ViewBinPage clickOnNoinConfirmPopUpPage() {
		clickByXpath("//*[contains(text(),'No')]");

		return this;
	}
	
	public ViewBinPage verifyViewBinPage() {
		
		verifyTextByXpath("(//*[contains(text(), 'Bin Details')])[1]", "Bin Details");
		verifyTextByXpath("(//*[contains(text(), 'Bin Label')])[1]", "Bin Label:");
		verifyTextByXpath("(//*[contains(text(), 'Number of Tickets')])[1]", "Number of Tickets:");
		verifyTextByXpath("(//*[contains(text(), 'Quanity')])[1]", "Quanity:");
		verifyTextByXpath("(//*[contains(text(), 'Assigned Ticket')])[1]", "Assigned Ticket");
		verifyTextByXpath("(//*[contains(text(), 'Ticket Number')])[1]", "Ticket Number");
		verifyTextByXpath("(//*[contains(text(), 'Area')])[1]", "Area");
		verifyTextByXpath("(//*[contains(text(), 'Block Number')])[1]", "Block Number");
		
		return this;
	}
	
	public BinsPage clickOnBackButton() {
		clickByXpath("//*[contains(text(),'Back')]");

		return new BinsPage(driver, test);
	}
	
	public UpdateBinPage clickOnEDITBINButton() {
		clickByXpath("//*[contains(text(),'EDIT BIN')]");

		return new UpdateBinPage(driver, test);
	}
	
	public NewDOPage clickOnGenerateDeliveryOrderButton() {
		
		clickByXpath("//*[contains(text(),'Generate Delivery Order')]");
		return new NewDOPage(driver, test);
	}

}
