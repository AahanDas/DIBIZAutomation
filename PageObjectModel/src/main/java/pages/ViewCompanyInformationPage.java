package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ViewCompanyInformationPage extends DibizWrappers {

	public ViewCompanyInformationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not View Company Information Page", "FAIL");
		}

	}
	
	public ViewCompanyInformationPage verifyViewCompanyInformationPage() {

		verifyTextByXpath("//*[contains(text(), 'Organisation Name')]", "Organisation Name");
		return this;

	}
}
