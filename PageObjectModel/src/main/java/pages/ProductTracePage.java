package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ProductTracePage extends DibizWrappers {

	public ProductTracePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Product Trace Page", "FAIL");
		}

	}
	public ProductTracePage chooseProduct(String data) {
		
		clickById("select-drop-Choose Product__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;
	}

	public ProductTracePage chooseFromDate() {

		clickById("date-picker-startDate-id");
		clickByXpath("(//*[@class='flatpickr-prev-month'])[1]");
		clickByXpath("(//*[@class='flatpickr-prev-month'])[1]");
		clickByXpath("(//*[@class='flatpickr-day '])[1]");
		return this;
	}

	public ProductTracePage clickOnApplyButton() {

		clickByXpath("//*[contains(text(),'Apply')]");
		return this;

	}

	public GenerateTracePage clickOnTraceLink() {

		clickByXpath("(//*[contains(text(),'Trace')])[4]");
		return new GenerateTracePage(driver, test);

	}

}
