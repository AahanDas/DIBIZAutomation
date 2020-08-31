package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class FFBQualityEnterDetailPage extends DibizWrappers {

	public FFBQualityEnterDetailPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not FFB Quality Enter Detail Page", "FAIL");
		}

	}

	public FFBQualityEnterDetailPage selectDOList(String data) {

		clickById("select-drop-DO List__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("(//*[@class='StyledText-sc-1sadyjn-0 oKAxv'])[1]");
		return this;
	}

	public FFBQualityEnterDetailPage selectProductSelection(String data) {

		clickById("select-drop-Product Selection__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("(//*[@class='StyledText-sc-1sadyjn-0 oKAxv'])[1]");
		return this;
	}

	public FFBQualityEnterDetailPage clickOnSubmitButton() {

		clickByXpath("//*[contains(text(), 'Submit')]");
		return this;
	}

	public FFBQualityEnterDetailPage EnterNumberOfRipeBunches(String data) {
		// enterByXpath("//*[contains(text(), 'Enter number of ripe bunches')]", data);
		enterById("input-ripe", data);

		return this;
	}

	public FFBQualityEnterDetailPage EnterNumberOfOverRipeBunches(String data) {
		// enterByXpath("//*[contains(text(), 'Enter number of over ripe bunches')]",
		// data);
		enterById("input-overRipe", data);
		return this;
	}

	public FFBQualityEnterDetailPage EnterNumberOfUnderRipeBunches(String data) {
		// enterByXpath("//*[contains(text(), 'Enter number of under ripe bunches')]",
		// data);
		enterById("input-underRipe", data);

		return this;
	}

	public FFBQualityEnterDetailPage EnterNumberOfEmptyBunches(String data) {
		// enterByXpath("//*[contains(text(), 'Enter number of empty bunches')]", data);
		enterById("input-empty", data);

		return this;
	}

	public QualityPage clickOnCreateButton() {
		clickByXpath("(//*[contains(text(), 'Create')])[2]");
		return new QualityPage(driver, test);
	}

	public FFBQualityEnterDetailPage verifyProduct(String data) {

		verifyTextByXpath("//*[contains(text(), 'Fresh fruit bunch')]", data);
		return this;

	}
}
