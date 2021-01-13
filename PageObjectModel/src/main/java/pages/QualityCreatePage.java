package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class QualityCreatePage extends DibizWrappers {

	public QualityCreatePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Quality Create Page", "FAIL");
		}

	}

	public QualityCreatePage enterNumberOfRipeBunches(String data) {
		enterById("input-ripeBunches", data);

		return this;
	}

	public QualityCreatePage enterNumberOfOverRipeBunches(String data) {
		enterById("input-overripeBunches", data);

		return this;
	}

	public QualityCreatePage enterNumberOfUnderRipeBunches(String data) {
		enterById("input-underripeBunches", data);

		return this;
	}

	public QualityCreatePage enterNumberOfEmptyBunches(String data) {
		enterById("input-emptyBunches", data);

		return this;
	}
	
	public QualityCreatePage enterNumberOfWetBunches(String data) {
		enterById("input-wetBunches", data);

		return this;
	}
	
	public QualityCreatePage enterNumberOfUnripeBunches(String data) {
		enterById("input-unripeBunches", data);

		return this;
	}
	
	
	
	
	public QualityPage clickOnCreate() {
		clickByXpath("//*[contains(text(),'Submit')]");
		return new QualityPage(driver, test);
	}

}
