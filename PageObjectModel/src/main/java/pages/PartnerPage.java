package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class PartnerPage extends DibizWrappers {

	public PartnerPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Partner Page", "FAIL");
		}
	}

	public AddPartner clickOnAddPartner() {
		clickByXpath("//*[contains(text(),'Add Partner')]");
		return new AddPartner(driver, test);
	}

	public PartnerDetailPage clickOnPartnerListView() {
		clickByXpath("(//*[contains(text(),'VIEW')])[1]");
		return new PartnerDetailPage(driver, test);
	}

	public PartnerPage clickOnNewRequestsTab() {

		clickByXpath("//*[contains(text(),'Incoming Request')]");
		return this;

	}

	public PartnerDetailPage clickOnNewRequestsView() {
		clickByXpath("(//*[contains(text(),'VIEW')])[1]");
		return new PartnerDetailPage(driver, test);
	}

	public PartnerPage selectChooseActionAccept() {
		clickByXpath("(//*[contains(text(),'Choose Action')])[2]");
		clickByXpath("(//*[@class='StyledBox-sc-13pk1d4-0 ixxyKD'])[1]");
		return this;

	}

	public PartnerPage clickOKButtonForAcceptOrReject() {
		clickByXpath("//*[contains(text(),'OK')]");
		return this;
	}

	public PartnerPage selectChooseActionDecline() {
		clickByXpath("(//*[contains(text(),'Choose Action')])[2]");
		clickByXpath("(//*[@class='StyledBox-sc-13pk1d4-0 ixxyKD'])[2]");
		return this;

	}

	public PartnerPage verifyPartnerListTabPageDetails() {

		verifyTextByXpath("(//*[contains(text(), 'Partner Name')])[1]", "Partner Name");
		verifyTextByXpath("(//*[contains(text(), 'Invite Status')])[1]", "Invite Status");
		return this;
	}
	
	public PartnerPage clickOnIncomingRequestTab() {
		clickByXpath("//*[contains(text(),'Incoming Request')]");
		return this;
	}
	public PartnerPage clickOnPartnerListTab() {
		clickByXpath("//*[contains(text(),'Partner List')]");
		return this;
	}
	

	public PartnerPage verifyIncomingRequestTabPageDetails() {

		verifyTextByXpath("(//*[contains(text(), 'Partner Name')])[1]", "Partner Name");
		verifyTextByXpath("(//*[contains(text(), 'Status')])[1]", "Status");
		verifyTextByXpath("(//*[contains(text(), 'Location')])[1]", "Location");
		verifyTextByXpath("(//*[contains(text(), 'Choose Action')])[1]", "Choose Action");
		return this;
	}

}
