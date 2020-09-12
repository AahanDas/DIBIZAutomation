package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class WeighBridgePage extends DibizWrappers {

	public WeighBridgePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not WeighBridge Page", "FAIL");
		}

	}

	public CreateWeighBridgePage clickOnCreateSlip() {

		clickByXpath("//*[contains(text(), 'Create Slip')]");
		return new CreateWeighBridgePage(driver, test);
	}

	public ViewWeighBridgePage clickOnVIEW() {

		clickByXpath("(//*[contains(text(), 'VIEW')])[1]");
		return new ViewWeighBridgePage(driver, test);
	}
	
	public WeighBridgePage verifyWeighBridgePageDetails() {
		
		verifyTextByXpath("(//*[contains(text(), 'Created Date')])[1]", "Created Date");
		verifyTextByXpath("(//*[contains(text(), 'Ticket Number')])[1]", "Ticket Number");
		verifyTextByXpath("(//*[contains(text(), 'Consignment number')])[1]", "Consignment number");
		verifyTextByXpath("(//*[contains(text(), 'Vehicle Number')])[1]", "Vehicle Number");
		verifyTextByXpath("(//*[contains(text(), 'Driver Name')])[1]", "Driver Name");
		return this;
	}

}
