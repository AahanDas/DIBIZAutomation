package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class HomePage extends DibizWrappers {

	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Home Page", "FAIL");
		}

	}

	public HomePage clickOnUserLogo() {

		clickByXpath("//*[@class='TopNavbarFragments__UserProfile-adzq1e-0 bnwzZQ']");
		return this;
	}

	public SettingsPage clickOnSettings() {
		clickByXpath("//*[contains(text(),'Settings')]");
		return new SettingsPage(driver, test);
	}

	public AdminPage clickOnAdmin() {
		clickByXpath("(//*[contains(text(),'Admin')])[1]");
		return new AdminPage(driver, test);
	}

	public LoginPageDibiz clickLogOut() {
		clickByXpath("//*[contains(text(),'Log Out')]");
		return new LoginPageDibiz(driver, test);
	}

	public WorkListingPage clickOnWorkModule() {
		clickByXpath("(//*[contains(text(),'Work')])[1]");
		return new WorkListingPage(driver, test);

	}

	public PartnerPage clickPartnerModule() {
		clickByXpath("//*[contains(text(),'Partner Management')]");
		return new PartnerPage(driver, test);

	}

	public TDMPage clickOnTradeDocumentManagerMainMenu() {
		clickByXpath("(//*[contains(text(),'Trade Document Manager')])[1]");
		return new TDMPage(driver, test);

	}

	public WeighBridgePage clickOnWeighBridgeMainMenu() {

		clickByXpath("//*[contains(text(), 'WeighBridge')]");
		return new WeighBridgePage(driver, test);
	}

	public TicketsPage clickOnTicket() {
		clickByXpath("//*[contains(text(), 'Ticket')]");
		return new TicketsPage(driver, test);

	}

	public BinsPage clickOnBin() {
		clickByXpath("(//*[contains(text(), 'Bin')])[1]");
		return new BinsPage(driver, test);

	}

	public QualityPage clickOnQuality() {

		clickByXpath("//*[contains(text(), 'Quality')]");
		return new QualityPage(driver, test);

	}

	public ProductionPage clickOnProduction() {

		clickByXpath("//*[contains(text(), 'Production')]");
		return new ProductionPage(driver, test);

	}

	public HomePage verifyFeedBackSuccessMessage(String data) {
		verifyTextByXpath("//*[contains(text(), 'Feedback Submitted')]", data);

		return this;
	}

	public FeedbackPage clickOnFeedbackFromMenu() {

		clickByXpath("//*[contains(text(),'Feedback')]");
		return new FeedbackPage(driver, test);
	}

	public AuditReportPage clickOnAuditReportsFromMenu() {

		clickByXpath("//*[contains(text(),'Audit Reports')]");
		return new AuditReportPage(driver, test);
	}

	public ProductTracePage clickOnProductTraceFromMenu() {
		clickByXpath("//*[contains(text(),'Product Trace')]");
		return new ProductTracePage(driver, test);

	}

	public HomePage checkForCardInsightSales(String data) {

		verifyTextByXpath("(//*[contains(text(), 'Sales')])[1]", data);
		return this;
	}

	public HomePage checkForCardInsightPurchase(String data) {

		verifyTextByXpath("(//*[contains(text(), 'Purchase')])[2]", data);
		return this;
	}

	public HomePage checkForCardInsightBestSuppliers(String data) {

		verifyTextByXpath("(//*[contains(text(), 'Best Suppliers')])[1]", data);
		return this;
	}

	public HomePage checkForCardInsightTopProducts(String data) {

		verifyTextByXpath("(//*[contains(text(), 'Top Products')])[1]", data);
		return this;
	}

	public HomePage checkForCardInsightCertifiedSupplyChain(String data) {

		verifyTextByXpath("//*[contains(text(), 'Certified Supply Chain')]", data);
		return this;
	}

	public HomePage checkForCardInsightSupplierCategories(String data) {

		verifyTextByXpath("//*[contains(text(), 'Supplier Categories')]", data);
		return this;
	}

	public HomePage checkForCardInsightExtractionRatio(String data) {

		verifyTextByXpath("//*[contains(text(), 'Extraction Ratio')]", data);
		return this;
	}

	public HomePage checkForCardInsightTradeDetails(String data) {

		verifyTextByXpath("//*[contains(text(), 'Trade details')]", data);
		return this;
	}

	public HomePage checkForCardInsightMessagesExchanged(String data) {

		verifyTextByXpath("//*[contains(text(), 'Messages exchanged')]", data);
		return this;
	}

	public HomePage checkForPlantationCardInsightSales() {

		verifyTextByXpath("(//*[contains(text(), 'Sales')])[1]", "Sales");
		return this;
	}
	
	public HomePage checkForPlantationCardInsightProductionHectareArea() {

		verifyTextByXpath("(//*[contains(text(), 'Production/ Hectare Area')])[1]", "Production/ Hectare Area");
		return this;
	}
	
	public HomePage checkForPlantationCardInsightBestBlocks() {

		verifyTextByXpath("(//*[contains(text(), 'Best Blocks')])[1]", "Best Blocks");
		return this;
	}
	public HomePage checkForPlantationCardInsightBestHarvesters() {

		verifyTextByXpath("(//*[contains(text(), 'Best Harvesters')])[1]", "Best Harvesters");
		return this;
	}
	public HomePage checkForPlantationCardInsightTradeDetails() {

		verifyTextByXpath("(//*[contains(text(), 'Trade Details')])[1]", "Trade Details");
		return this;
	}
	public HomePage checkForPlantationCardInsightBinsperday() {

		verifyTextByXpath("(//*[contains(text(), 'Bins per day')])[1]", "Bins per day");
		return this;
	}
	public HomePage checkForPlantationCardInsightTripstimings() {

		verifyTextByXpath("(//*[contains(text(), 'Trips timings')])[1]", "Trips timings");
		return this;
	}
	public HomePage checkForPlantationCardInsightMessagesExchanged() {

		verifyTextByXpath("(//*[contains(text(), 'Messages Exchanged')])[1]", "Messages Exchanged");
		return this;
	}
	
}
