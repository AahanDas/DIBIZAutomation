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
		clickByXpath("(//*[@class='Trace-Tree__Dot-sc-1wum2sf-1 bgxVPE'])[1]");

		return this;
	}
	
	public GenerateTracePage clickOnPlusForTree() {
		clickByXpath("(//*[@class='Trace-Tree__Dot-sc-1wum2sf-1 bgxVPE'])[1]");

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

}
