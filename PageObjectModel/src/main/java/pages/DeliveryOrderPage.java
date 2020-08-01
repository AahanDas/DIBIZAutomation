package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class DeliveryOrderPage extends DibizWrappers {

	public DeliveryOrderPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Delivery Order Page", "FAIL");
		}

	}
	public TDMPage clickOnTradeDocumentManagerMainMenu() {
		clickByXpath("(//*[contains(text(),'Trade Document Manager')])[1]");
		return new TDMPage(driver, test);

	}
	public DeliveryOrderPage enterRemarks(String data) {
		
		enterById("input-remarks", data);
		return this;
	}
	
	public DeliveryOrderPage clickOnSubmitButton() {
		clickByXpath("(//*[contains(text(),'Submit')])[2]");
		return this;
		
	}
	public OutgoingOrSentPage clickOnDeliveryOrdersFromOutGoing() {
		
		clickByXpath("(//*[contains(text(),'Delivery Orders')])[2]");
		return new OutgoingOrSentPage(driver, test);
	}
	
	public DeliveryOrderPage clickOnIncomingDOAssociatedDocs() {
		clickByXpath("//*[contains(text(),'Associated Docs')]");
		return this;
	}
	
	public DeliveryOrderPage clickOnOutgoingDOAssociatedDocs() {
		clickByXpath("//*[contains(text(),'Associated Docs')]");
		return this;
	}
	public DeliveryOrderPage clickOnIncomingDOAttachments() {
		clickByXpath("//*[contains(text(),'Attachments')]");
		return this;
	}
	
	public DeliveryOrderPage clickOnOutgoingDOAttachments() {
		clickByXpath("//*[contains(text(),'Attachments')]");
		return this;
	}
	
	
}
