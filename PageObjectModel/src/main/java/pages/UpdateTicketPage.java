package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class UpdateTicketPage extends DibizWrappers {

	public UpdateTicketPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Update Ticket Page", "FAIL");
		}

	}

	public UpdateTicketPage searchProduct(String data) {

		clickByXpath("//*[@class='StyledButton-sc-323bzc-0 kaBBoa']");
		clickById("select-drop-productID__input");
		enterByXpath("//*[@type='search']", data);
		return this;
	}

	public UpdateTicketPage SelectProduct() {

		/*
		 * //clickByXpath("//*[@class='StyledButton-sc-323bzc-0 kaBBoa']"); //
		 * clickById("select-drop-productID__input");
		 * clickByXpath("//*[@class='StyledIcon-ofa7kd-0 cBvDlm']");
		 * clickByXpath("//*[@class='StyledTextInput-sc-1x30a0s-0 bkOazG']");
		 * enterByXpath("//*[@class='StyledTextInput-sc-1x30a0s-0 bkOazG']", data);
		 */
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		clickByXpath("//*[contains(text(),'Submit')]");
		return this;
	}

	public UpdateTicketPage selectHarvester(String data) {
		clickById("select-drop-harvester__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");


		return this;
	}

	public UpdateTicketPage enterFFBCount(String data) {
		enterById("input-ffbCount", data);
		return this;
	}

	public UpdateTicketPage enterSelectArea(String data) {
		enterById("input-area", data);
		return this;
	}

	public UpdateTicketPage enterSelectBlock(String data) {
		enterById("input-block", data);

		return this;
	}

	public UpdateTicketPage enterSelectPhase(String data) {
		enterById("input-phase", data);

		return this;
	}

	public UpdateTicketPage enterUnripeBunches(String data) {
		enterById("input-unripe", data);

		return this;
	}

	public UpdateTicketPage enterRottenBunches(String data) {
		enterById("input-rotten", data);

		return this;
	}

	public UpdateTicketPage enterLooseFruitlets(String data) {
		enterById("input-loose", data);
		return this;
	}

	public ViewTicketPage clickOnUpdate() {
		clickByXpath("//*[@class='StyledButton-sc-323bzc-0 edaVNT']");
		return new ViewTicketPage(driver, test);
	}

}
