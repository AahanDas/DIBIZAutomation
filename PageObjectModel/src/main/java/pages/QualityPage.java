package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class QualityPage extends DibizWrappers {

	public QualityPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Quality Page", "FAIL");
		}

	}

	public QualityPage selectFFBQualityFromCreateReportDropDown() {
		clickByXpath("//*[contains(text(),'CREATE REPORT')]");
		clickByXpath("//*[contains(text(),'FFB QUALITY')]");
		return this;
	}

	public QualityPage selectDOList(String data) {
		clickById("select-drop-entityID__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");

		return this;
	}

	public QualityPage selectProductSelection(String data) {
		clickById("select-drop-Product Selection__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");

		return this;
	}

	public QualityCreatePage clickOnSubmitButton() {
		clickByXpath("//*[contains(text(),'Submit')]");
		return new QualityCreatePage(driver, test);

	}

	public CPOQualityDetailsPage selectCPOQualityFromCreateReportDropDown() {
		clickByXpath("//*[contains(text(),'CREATE REPORT')]");
		clickByXpath("//*[contains(text(),'CPO QUALITY')]");
		return new CPOQualityDetailsPage(driver, test);
	}

	public QualityPage verifyFFBCPOQualityDateColumn() {
		verifyTextByXpath("(//*[contains(text(), 'Date')])[1]", "Date");
		return this;
	}

	public QualityPage verifyFFBCPOQualityConsignmentNumberColumn() {
		verifyTextByXpath("//*[contains(text(), 'Consignment Number')]", "Consignment Number");
		return this;
	}

	public QualityPage verifyFFBQualityRipeColumn() {
		verifyTextByXpath("//*[contains(text(), 'Ripe')]", "Ripe");
		return this;
	}

	public QualityPage verifyFFBQualityOverRipeColumn() {
		verifyTextByXpath("//*[contains(text(), 'Over ripe')]", "Over ripe");
		return this;
	}

	public QualityPage verifyFFBQualityUnderRipeColumn() {
		verifyTextByXpath("//*[contains(text(), 'Under ripe')]", "Under ripe");
		return this;
	}

	public QualityPage verifyFFBQualityEmptyColumn() {
		verifyTextByXpath("(//*[contains(text(), 'Empty')])[2]", "Empty");
		return this;
	}
	public QualityPage clickOnCPOQualityTab() {
		clickByXpath("//*[contains(text(),'CPO Quality')]");
		return this;
	}
	
	public QualityPage verifyCPOQualityFFAPercentageColumn() {
		verifyTextByXpath("//*[contains(text(), 'FFA %')]", "FFA %");
		return this;
	}
	public QualityPage verifyCPOQualityDOBIColumn() {
		verifyTextByXpath("//*[contains(text(), 'DOBI')]", "DOBI");
		return this;
	}
	public QualityPage verifyCPOQualityMNIColumn() {
		verifyTextByXpath("//*[contains(text(), 'MNI')]", "MNI");
		return this;
	}
	public QualityPage clickOnEditFFBQuality() {
		clickByXpath("(//*[contains(text(),'EDIT')])[1]");
		return this;
	}
	
	public QualityPage enterNumberOfRipeBunches(String data) {
		enterById("input-ripeBunches", data);

		return this;
	}

	public QualityPage enterNumberOfOverRipeBunches(String data) {
		enterById("input-overripeBunches", data);

		return this;
	}

	public QualityPage enterNumberOfUnderRipeBunches(String data) {
		enterById("input-underripeBunches", data);

		return this;
	}

	public QualityPage enterNumberOfEmptyBunches(String data) {
		enterById("input-emptyBunches", data);

		return this;
	}
	public QualityPage clickOnSubmit() {
		clickByXpath("//*[contains(text(),'Submit')]");
		return new QualityPage(driver, test);
	}
	public QualityPage clickOnViewForCPOQuality() {
		clickByXpath("(//*[contains(text(),'VIEW')])[1]");
		return new QualityPage(driver, test);
	}

}
