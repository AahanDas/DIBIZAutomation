package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class InputStorageUpdatePage extends DibizWrappers {

	public InputStorageUpdatePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Input Storage Update Page", "FAIL");
		}

	}
	
	public InputStorageUpdatePage clickOnAssignTankHL() {
		
		clickByXpath("(//*[contains(text(), ' Assign Tank')])[1]");
		return this;
	}
	
	public InputStorageUpdatePage selectTank1(String data) {
		clickById("select-drop-storageUnitID-0__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;

	}
	public InputStorageUpdatePage enterQuantity1(String data) {
		enterById("input-quantity-0", data);
		return this;

	}
	public InputStorageUpdatePage clickOnAddMoreTankLink() {
		clickByXpath("//*[contains(text(), 'Add More Tank')]");
		return this;

	}
	
	public InputStorageUpdatePage selectTank2(String data) {
		clickById("select-drop-storageUnitID-2__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;

	}
	public InputStorageUpdatePage enterQuantity2(String data) {
		enterById("input-quantity-2", data);
		return this;

	}
	
	public InputStorageUpdatePage clickOnSubmitButton() {
		clickByXpath("//*[contains(text(), 'Submit')]");
		return this;

	}
	

}
