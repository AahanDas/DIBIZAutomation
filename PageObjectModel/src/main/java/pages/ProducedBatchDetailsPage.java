package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ProducedBatchDetailsPage extends DibizWrappers {

	public ProducedBatchDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Produced Batch Details Page", "FAIL");
		}

	}
	
	public ProductionPage clickOnBackButton(){
		clickByXpath("//*[contains(text(),'Back')]");
		
		return new ProductionPage(driver, test);
	}
}
