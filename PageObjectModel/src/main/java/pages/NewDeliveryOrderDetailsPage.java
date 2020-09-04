package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class NewDeliveryOrderDetailsPage extends DibizWrappers {

	public NewDeliveryOrderDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not New Delivery Order Details Page", "FAIL");
		}

	}

	public NewDeliveryOrderDetailsPage EnterSelectExpectedDeliveryDate() {

		clickById("date-picker-expectedDate-id");
		clickByXpath("//*[@class='flatpickr-next-month']");
		clickByXpath("(//*[@class='flatpickr-day '])[30]");
		return this;
	}

	public NewDeliveryOrderDetailsPage enterVehicleNumber(String data) {
		enterById("input-vehicleNumber", data);

		return this;
	}

	public NewDeliveryOrderDetailsPage enterDriverName(String data) {
		enterById("input-driverName", data);

		return this;
	}

	public NewDeliveryOrderDetailsPage enterDispatchedThrough(String data) {
		enterById("input-shipThrough", data);

		return this;
	}

	public NewDeliveryOrderDetailsPage enterShipperReferenceNumber(String data) {
		enterById("input-shipperNumber", data);

		return this;
	}

	public NewDeliveryOrderDetailsPage clickOnAddProduct() {
		clickByXpath("//*[contains(text(),'Add Products')]");

		return this;
	}

	public NewDeliveryOrderDetailsPage selectProductFromDropDown(String data) {
		clickById("select-drop-productSelection__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;
	}

	public NewDeliveryOrderDetailsPage enterQuantity(String data) {
		enterById("input-quantity", data);

		return this;
	}

	public NewDeliveryOrderDetailsPage clickOnSubmit() {
		clickByXpath("//*[contains(text(),'Submit')]");

		return this;
	}

	public NewDeliveryOrderDetailsPage enterRemarks(String data) {
		enterById("input-remarks", data);

		return this;
	}

	public TDMPage clickOnSaveButton() {
		clickByXpath("//*[contains(text(),'Save')]");
		return new TDMPage(driver, test);

	}

	public NewDeliveryOrderConfirmPage clickOnPreviewDetails() {

		clickByXpath("//*[contains(text(),'Preview Details')]");
		return new NewDeliveryOrderConfirmPage(driver, test);
	}

	public NewDeliveryOrderDetailsPage enterDeliveryOrderReference(String data) {

		enterById("input-entityReference", data);
		return this;
	}

	public NewDeliveryOrderDetailsPage clickOnAssociatedDocsTab() {

		clickByXpath("//*[contains(text(),'Associated Docs')]");
		return this;
	}

	public NewDeliveryOrderDetailsPage clickOnOriginalDocsTab() {

		clickByXpath("//*[contains(text(),'Original')]");
		return this;
	}
	public NewDeliveryOrderDetailsPage clickOnAttachmentsTab() {

		clickByXpath("//*[contains(text(),'Attachments')]");
		return this;
	}
	
	public NewDeliveryOrderDetailsPage checkForentityType(String data) {

		verifyTextByXpath("(//*[contains(text(), 'DELIVERY ORDER')])[1]", data);
		return this;
	}
	public NewDeliveryOrderDetailsPage clickOnGoBackButton() {
		clickByXpath("//*[contains(text(),'Go Back')]");	
		return this;
	}
	public NewDeliveryOrderDetailsPage clickOnAuthorization() {
		clickByXpath("//*[contains(text(),'Authorization')]");
		return this;
	}
	
	public NewDeliveryOrderDetailsPage verifyReportedBy() {
		String ReportedBy = getTextById("input-reportedBy");
		
		
		if (ReportedBy == null){
			System.out.println("ReportedBy field is Empty");
		}
		System.out.println(ReportedBy);
		
		return this;
	}
	public NewDeliveryOrderDetailsPage verifyRole() {
		String Role = getTextById("input-reportedByRole");
		if (Role == null){
			System.out.println("Role field is Empty");
		}
		System.out.println(Role);
		
		
		
		return this;
	}
	
	public NewDeliveryOrderDetailsPage verifyAuthorisedSignatory() {
		String AuthorisedSignatory = getTextById("input-authorisedSignatory");
		if (AuthorisedSignatory == null){
			System.out.println("AuthorisedSignatory field is Empty");
		}
		System.out.println(AuthorisedSignatory);
		
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

}
