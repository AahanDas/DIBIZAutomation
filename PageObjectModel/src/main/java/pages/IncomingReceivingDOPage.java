package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class IncomingReceivingDOPage extends DibizWrappers {

	public IncomingReceivingDOPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Incoming or Receiving DO Page", "FAIL");
		}

	}

	public IncomingReceivingDOPage checkPendingTab() {
		
		clickByXpath("//*[contains(text(), 'Pending')]");

		return this;
	}

	public IncomingReceivingDOPage checkAcceptedTab() {
		clickByXpath("//*[contains(text(), 'Accepted')]");

		return this;
	}

	public IncomingReceivingDOPage checkOnHoldTab() {
		clickByXpath("//*[contains(text(), 'On Hold')]");

		return this;
	}

	public IncomingReceivingDOPage checkRejectedTab() {
		clickByXpath("//*[contains(text(), 'Rejected')]");

		return this;
	}

	public IncomingReceivingDOPage checkAnyTab() {
		clickByXpath("//*[contains(text(), 'Any')]");

		return this;
	}
}
