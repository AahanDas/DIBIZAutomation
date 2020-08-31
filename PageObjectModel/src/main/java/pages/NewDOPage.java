package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class NewDOPage extends DibizWrappers {

	public NewDOPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not New DO Page", "FAIL");
		}

	}

	public NewDOPage searchPartner(String data) throws InterruptedException {

		clickByXpath("//*[@name='input-undefined-Search Partner']");
		enterByXpath("//*[@name='input-undefined-Search Partner']", data);
		Thread.sleep(5000);
		return this;
	}
	
	public NewDOPage selectPartner() {
		clickByXpath("//*[@class='StyledBox-sc-13pk1d4-0 ewGRLN StyledRadioButton__StyledRadioButtonBox-g1f6ld-3 gsXQqV']");		
		return this;
	}
	public NewDeliveryOrderDetailsPage clickOnEnterDetails() {
		clickByXpath("//*[contains(text(),'Enter Details')]");
		return new NewDeliveryOrderDetailsPage(driver, test);
		
	}
	

}
