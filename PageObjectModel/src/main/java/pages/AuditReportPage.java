package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class AuditReportPage extends DibizWrappers {

	public AuditReportPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Audit Report Page", "FAIL");
		}

	}

	public AuditReportPage chooseFromDate() {

		clickById("date-picker-startDate-id");
		clickByXpath("(//*[@class='flatpickr-prev-month'])[1]");
		clickByXpath("(//*[@class='flatpickr-day '])[1]");
		return this;
	}

	public AuditReportPage clickOnApplyButton() {
		clickByXpath("//*[contains(text(),'Apply')]");
		return this;
	}

	public AuditReportPage clickOnShowMore() {
		clickByXpath("//*[contains(text(),'Show More')]");
		return this;
	}

	public AuditReportPage verifyFirstCardCompanyInformation(String data) {
		verifyTextByXpath("//*[contains(text(), 'Company Information')]", data);
		return this;
	}

	public AuditReportPage verifyFirstCardTransactionInformation(String data) {
		verifyTextByXpath("(//*[contains(text(), 'Transaction - 1')])[1]", data);
		return this;
	}

}
