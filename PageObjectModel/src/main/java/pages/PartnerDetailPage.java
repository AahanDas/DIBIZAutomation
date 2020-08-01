package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class PartnerDetailPage extends DibizWrappers {

	public PartnerDetailPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Partner Detail Page", "FAIL");
		}
	}

	public PartnerDetailPage clickOnDeletePartnerButton() {

		clickByXpath("//*[contains(text(), 'Delete Partner')]");

		return this;
	}
	
	public PartnerDetailPage clickOnAcceptButtonForPartnerDetail() {

		clickByXpath("//*[contains(text(), 'Accept')]");

		return this;
	}
	

	public PartnerDetailPage clickOnProceedButton() {

		clickByXpath("//*[contains(text(), 'Proceed')]");

		return this;
	}

	public PartnerPage clickOnOKButton() {

		clickByXpath("//*[contains(text(), 'OK')]");

		return new PartnerPage(driver, test);
	}
}
