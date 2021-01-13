package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ProductionPage extends DibizWrappers {

	public ProductionPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Production Page", "FAIL");
		}

	}

	public CreatePlotInputPage clickOnPlotInput() {
		
		clickByXpath("//*[contains(text(), 'Plot Input')]");
		
		return new CreatePlotInputPage(driver, test);
	}
	
	public SourcedBatchDetailsPage clickOnSourcedBatchDetailsView() {
		clickByXpath("(//*[contains(text(), 'View')])[1]");
		return new SourcedBatchDetailsPage(driver, test);
	}
	
	public CreatePlotOutputPage clickOnPlotOutput() {
		
		clickByXpath("(//*[contains(text(), 'Plot Output')])[1]");
		return new CreatePlotOutputPage(driver, test);
		
		
	}
	
	public ProductionPage clickOnProducedBatchTab() {
		
		clickByXpath("//*[contains(text(), 'Produced Batch')]");
		return this;
		
		
	}
	public ProducedBatchDetailsPage clicOnProducedBatchDetailsView() {
		clickByXpath("(//*[contains(text(), 'View')])[1]");
		return new ProducedBatchDetailsPage(driver, test);
		
		
	}
	
	public InputStorageUpdatePage clickOnInputStorageUpdateButton() {
		
		clickByXpath("//*[contains(text(), 'Input Storage Update')]");
		return new InputStorageUpdatePage(driver, test);
	}
	
	public CreatePlotOutputPage ReadBatchReferenceAndClickOnPlotOutput() throws IOException {
		Properties props = new Properties();

		String path = "C:\\Users\\Suresh VeeraRaghavan\\git\\repositoryDIBIZ\\PageObjectModel\\src\\main\\resources\\db.properties";
		FileInputStream inputStream = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(inputStream);
		//Properties prop = new Properties();
		String BatchReference = prop.getProperty("BatchReference");
		System.out.println("DO number Read from db.properties file: " + BatchReference);

		// clickByXpath(prop.getProperty("BatchReference"));

		clickByXpath("(//*[contains(text(),'"+BatchReference+"')]//following::td[4]//button)");

		return new CreatePlotOutputPage(driver, test);

	}

}
