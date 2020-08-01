package pages;

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
		clickByXpath("//*[contains(text(),'DELIVERY ORDER')]");

		// selectVisibileTextByXPath("//*[contains(text(),'CREATE NEW')]", "DELIVERY
		// ORDER");
		return new NewDOPage(driver, test);
	}

	public TDMPage clickOnIncomingDeliveryOrders() {
		clickByXpath("(//*[@class='Tabs__TabLabel-sc-18bzzb8-3 eHJjyF'])[3]");

		return this;
	}
	public TDMPage clickOnOutgoingDeliveryOrders() {
		clickByXpath("(//*[@class='Tabs__TabLabel-sc-18bzzb8-3 eHJjyF'])[7]");

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

}
