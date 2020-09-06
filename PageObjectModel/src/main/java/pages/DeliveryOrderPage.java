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

	public DeliveryOrderPage clickOnActionAcknowledge() {
		clickByXpath("//*[contains(text(),'ACTION')]");
		clickByXpath("//*[contains(text(),'Acknowledge')]");
		return this;

	}

	public DeliveryOrderPage enterRemarksForStatusChange(String data) {
		// enterByXpath("(//*[@class='StyledTextArea-sc-17i3mwp-0 bQXsYf'])[2]", data);
		enterById("input-remarks-input", data);
		return this;

	}

	public DeliveryOrderPage clickSubmitForRemarksStatusChange() {

		clickByXpath("//*[@class='StyledButton-sc-323bzc-0 edaVNT']");
		return this;

	}

	public DeliveryOrderPage clickOnActionAccepted() {
		clickByXpath("//*[contains(text(),'ACTION')]");
		clickByXpath("//*[contains(text(),'Accepted')]");
		return this;

	}

	public DeliveryOrderPage clickOnActionReceivedGoods() {
		clickByXpath("//*[contains(text(),'ACTION')]");
		clickByXpath("//*[contains(text(),'Received Goods')]");
		return this;

	}

	public CreateWeighBridgePage clickOnAddSubDocumentWeighbridge() {
		clickByXpath("//*[contains(text(),'Add Sub Document')]");
		clickByXpath("//*[contains(text(),'Weighbridge')]");
		return new CreateWeighBridgePage(driver, test);

	}

	public FFBQualityEnterDetailPage clickOnAddSubDocumentFFBQuality() {
		clickByXpath("//*[contains(text(),'Add Sub Document')]");
		clickByXpath("//*[contains(text(),'FFB Quality')]");
		return new FFBQualityEnterDetailPage(driver, test);

	}

	public DeliveryOrderPage checkAllDetailsInDeliveryOrderPageForIncomingDO() {
		String Partner = getTextByXpath("(//*[@class='Typography__P-cdhru6-4 dqomvH'])[2]");
		System.out.println("Partner: " +Partner);
		
		String Product = getTextByXpath("(//*[@class='Typography__Label-cdhru6-5 fjmeAk'])[2]");
		System.out.println("Product: " +Product);
		
		String ReportedBy = getTextByXpath("((//*[@class='Box-sc-19yaqt9-0 fAFBPY']))[8]");
		System.out.println("ReportedBy: " +ReportedBy);
		
		
		return this;
	}

}
