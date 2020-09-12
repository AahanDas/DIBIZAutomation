package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class TDMPage extends DibizWrappers {

	public TDMPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not TDM Page", "FAIL");
		}

	}

	public NewDOPage clickOnCreateNewdropDown() {
		clickByXpath("//*[contains(text(),'CREATE NEW')]");
		// clickByXpath("(//*[contains(text(),'DELIVERY ORDER')])[3]");
		clickByXpath("(//*[@class='StyledBox-sc-13pk1d4-0 ixxyKD'])[3]");

		// selectVisibileTextByXPath("//*[contains(text(),'CREATE NEW')]", "DELIVERY
		// ORDER");
		return new NewDOPage(driver, test);
	}

	public NewPurchaseOrderPage clickOnPURCHASEORDERFromCreateNewdropDown() {
		clickByXpath("//*[contains(text(),'CREATE NEW')]");
		clickByXpath("//*[contains(text(),'PURCHASE ORDER')]");

		// selectVisibileTextByXPath("//*[contains(text(),'CREATE NEW')]", "DELIVERY
		// ORDER");
		return new NewPurchaseOrderPage(driver, test);
	}

	public TDMPage clickOnIncomingDeliveryOrders() {
		clickByXpath("(//*[@class='Tabs__TabLabel-sc-18bzzb8-3 eHJjyF'])[3]");

		return this;
	}

	public TDMPage clickOnOutgoingDeliveryOrders() {
		// clickByXpath("(//*[@class='Tabs__TabLabel-sc-18bzzb8-3 eHJjyF'])[7]");
		clickByXpath("(//*[contains(text(),'Delivery Orders')])[2]");

		return this;
	}

	public DeliveryOrderPage clickOnIncomingDeliveryOrdersView() {
		clickByXpath("(//*[contains(text(),'VIEW')])[1]");

		return new DeliveryOrderPage(driver, test);
	}

	public DeliveryOrderPage clickOnOutgoingDeliveryOrdersView() {
		clickByXpath("(//*[contains(text(),'VIEW')])[2]");

		return new DeliveryOrderPage(driver, test);
	}

	public CreateWeighBridgePage clickOnIncomingDeliveryOrdersAddWeighbridge() {
		clickByXpath("(//*[contains(text(),'Add')])[1]");
		clickByXpath("(//*[contains(text(),'Weighbridge')])[1]");

		return new CreateWeighBridgePage(driver, test);
	}

	public CreateWeighBridgePage clickOnOutgoingDeliveryOrdersAddWeighbridge() {
		clickByXpath("(//*[contains(text(),'Add')])[1]");
		clickByXpath("(//*[contains(text(),'Weighbridge')])[1]");

		return new CreateWeighBridgePage(driver, test);
	}

	public FFBQualityEnterDetailPage clickOnIncomingDeliveryOrdersAddFFBQuality() {
		clickByXpath("(//*[contains(text(),'Add')])[1]");
		clickByXpath("(//*[contains(text(),'FFB Quality')])[1]");

		return new FFBQualityEnterDetailPage(driver, test);
	}

	public FFBQualityEnterDetailPage clickOnOutgoingDeliveryOrdersAddFFBQuality() {
		clickByXpath("(//*[contains(text(),'Add')])[1]");
		clickByXpath("(//*[contains(text(),'FFB Quality')])[1]");

		return new FFBQualityEnterDetailPage(driver, test);
	}

	public OutgoingOrSentPage clickOnDeliveryOrdersFromOutGoing() {

		clickByXpath("(//*[contains(text(),'Delivery Orders')])[2]");
		return new OutgoingOrSentPage(driver, test);
	}

	public TDMPage clickOnOutgoingDraftTab() {
		clickByXpath("//*[contains(text(),'Drafts')]");
		return this;

	}

	public NewDeliveryOrderDetailsPage ReadDONumberAndClickOnView() throws IOException {
		Properties props = new Properties();

		String path = "C:\\Users\\Suresh VeeraRaghavan\\git\\repositoryDIBIZ\\PageObjectModel\\src\\main\\resources\\db.properties";
		FileInputStream inputStream = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(inputStream);
		//Properties prop = new Properties();
		String doNo = prop.getProperty("DONumber");
		System.out.println("DO number Read from db.properties file: " + doNo);

		// clickByXpath(prop.getProperty("doNo"));

		clickByXpath("(//*[contains(text(),'"+doNo+"')]//following::td[2]//button)");

		return new NewDeliveryOrderDetailsPage(driver, test);

	}

	public NewDeliveryOrderDetailsPage clickOnFirstVIEWLink() {
		clickByXpath("(//*[contains(text(),'VIEW')])[2]");
		return new NewDeliveryOrderDetailsPage(driver, test);

	}

	public TDMPage clickOnInvoicesTabIncoming() {
		clickByXpath("(//*[contains(text(),'Invoices')])[1]");
		return this;

	}

	public TDMPage clickOnPurchaseOrdersTabIncoming() {
		clickByXpath("(//*[contains(text(),'Purchase Orders')])[1]");
		return this;

	}

	public TDMPage clickOnDeliveryOrdersTabIncoming() {
		clickByXpath("(//*[contains(text(),'Delivery Orders')])[1]");
		return this;

	}

	public IncomingReceivingDOPage clickOnVIEWALLDELIVERYORDERSIncomingDO() {
		clickByXpath("//*[contains(text(),'VIEW ALL DELIVERY ORDERS')]");
		return new IncomingReceivingDOPage(driver, test);

	}

	public TDMPage checkForTDMPageDetails() {
		verifyTextByXpath("(//*[contains(text(), 'Incoming')])[1]", "Incoming");
		verifyTextByXpath("(//*[contains(text(), 'Outgoing')])[1]", "Outgoing");
		verifyTextByXpath("(//*[contains(text(), 'Received Date')])[1]", "Received Date");
		verifyTextByXpath("(//*[contains(text(), 'Received Date')])[2]", "Received Date");
		verifyTextByXpath("(//*[contains(text(), 'Partner Name')])[1]", "Partner Name");
		verifyTextByXpath("(//*[contains(text(), 'Partner Name')])[2]", "Partner Name");
		verifyTextByXpath("(//*[contains(text(), 'Delivery Order #')])[1]", "Delivery Order #");
		verifyTextByXpath("(//*[contains(text(), 'Delivery Order #')])[2]", "Delivery Order #");
		verifyTextByXpath("(//*[contains(text(), 'Action')])[1]", "Action");
		verifyTextByXpath("(//*[contains(text(), 'Action')])[2]", "Action");
		verifyTextByXpath("(//*[contains(text(), 'Back')])[1]", "Back");
		return this;

	}

}
