package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class GenerateTracePage extends DibizWrappers {

	public GenerateTracePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Generate Trace Page", "FAIL");
		}

	}

	public GenerateTracePage clickOnMinusForTree() {
		clickByXpath("(//*[@class='Trace-Tree__Dot-sc-1wum2sf-1 bLmPhk'])[1]");

		return this;
	}
	
	public GenerateTracePage clickOnPlusForTree() {
		clickByXpath("(//*[@class='Trace-Tree__Dot-sc-1wum2sf-1 bLmPhk'])[1]");

		return this;
	}
	public GenerateTracePage clickOnGraphTab() {
		clickByXpath("//*[contains(text(),'Graph')]");
		return this;
	}
	public GenerateTracePage clickOnMinusForGraph() {
		clickByXpath("//*[@class='Trace-Graph__Dot-sc-14qktsy-1 bHOnzW']");

		return this;
	}
	public GenerateTracePage clickOnPlusForGraph() {
		clickByXpath("//*[@class='Trace-Graph__Dot-sc-14qktsy-1 bHOnzW']");

		return this;
	}
	
	public GenerateTracePage clickOnMapTab() {
		clickByXpath("//*[contains(text(),'Map')]");
		return this;
	}	
	public GenerateTracePage clickOnTreeTab() {
		clickByXpath("//*[contains(text(),'Tree')]");
		return this;
	}
	
	public ProductTracePage clickOnBackButton() {
		clickByXpath("//*[contains(text(),'Back')]");
		return new ProductTracePage(driver, test);
	}
	
	public GenerateTracePage verifyTreeTracePage() {
		verifyTextByXpath("//*[contains(text(), 'Organisation Information')]", "Organisation Information");
		verifyTextByXpath("//*[contains(text(), 'List of Transactions')]", "List of Transactions");
		
		verifyTextByXpath("//*[contains(text(), 'Company Name')]", "Company Name:");
		verifyTextByXpath("//*[contains(text(), 'Certification Status')]", "Certification Status:");
		verifyTextByXpath("//*[contains(text(), 'Transactions')]", "Transactions:");
		
		verifyTextByXpath("//*[contains(text(), 'Date')]", "Date");
		verifyTextByXpath("(//*[contains(text(), 'Product')])[6]", "Product");
		verifyTextByXpath("(//*[contains(text(), 'Quantity')])[2]", "Quantity");
		verifyTextByXpath("//*[contains(text(), 'Transporter Name')]", "Transporter Name");
		
		return this;
	}
	
	public GenerateTracePage verifyGraphTracePage() {
		verifyTextByXpath("//*[contains(text(), 'Company Name')]", "Company Name:");
		verifyTextByXpath("//*[contains(text(), 'Certification Status')]", "Certification Status:");
		verifyTextByXpath("//*[contains(text(), 'Transactions')]", "Transactions:");
		
		
		verifyTextByXpath("//*[contains(text(), 'Organisation Information')]", "Organisation Information");
		//verifyTextByXpath("//*[contains(text(), 'List of Transactions')]", "List of Transactions");
		
		
		verifyTextByXpath("//*[contains(text(), 'Date')]", "Date");
		verifyTextByXpath("(//*[contains(text(), 'Product')])[6]", "Product");
		verifyTextByXpath("(//*[contains(text(), 'Quantity')])[2]", "Quantity");
		verifyTextByXpath("//*[contains(text(), 'Transporter Name')]", "Transporter Name");
		
		return this;
	}
	
	public GenerateTracePage verifyMapTracePage() {
		verifyTextByXpath("//*[contains(text(), 'Company Name')]", "Company Name:");
		verifyTextByXpath("//*[contains(text(), 'Certification Status')]", "Certification Status:");
		verifyTextByXpath("//*[contains(text(), 'Transactions')]", "Transactions:");
		
		
		return this;
	}
	
	

}
