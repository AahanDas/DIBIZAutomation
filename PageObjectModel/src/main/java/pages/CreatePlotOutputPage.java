package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class CreatePlotOutputPage extends DibizWrappers {

	public CreatePlotOutputPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Create PlotOutput Page", "FAIL");
		}

	}

	public CreatePlotOutputPage clickOnAddMore() {

		clickByXpath("//*[contains(text(), 'Add More +')]");
		return this;

	}
	public CreatePlotOutputPage selectProductFromDropDown(String data) {
		clickById("select-drop-productID-0__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;
	}
	public CreatePlotOutputPage enterProducedQuantity(String data) {

		enterById("input-quantity-0", data);
		return this;

	}
	
	public CreatePlotOutputPage clickOnSelectTank() {

		clickByXpath("(//*[contains(text(), 'Select Tank')])[2]");
		return this;

	}
	public CreatePlotOutputPage selectTank(String data) {
		clickById("select-drop-storageUnitID-0__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;
	}
	public CreatePlotOutputPage enterQuantity(String data) {
		//enterById("input-quantity-0", data);
		
		enterByXpath("(//*[@id='input-quantity-0'])[2]", data);
		return this;

	}
	
	public CreatePlotOutputPage clickOnTankSubmitButton() {

		clickByXpath("(//*[contains(text(), 'Submit')])[2]");
		return this;

	}
	public CreatePlotOutputPage clickOnSubmitButton() {

		clickByXpath("(//*[contains(text(), 'Submit')])");
		return this;

	}
	
	
	
	
	
	
	
	

}
