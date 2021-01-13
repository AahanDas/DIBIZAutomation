package pages;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class SourcedBatchDetailsPage  extends DibizWrappers {

	public SourcedBatchDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Sourced Batch Details Page", "FAIL");
		}

	}
	
	public ProductionPage clickOnBackButton(){
		clickByXpath("//*[contains(text(),'Back')]");
		
		return new ProductionPage(driver, test);
	}
	
	public SourcedBatchDetailsPage clickOnUserLogo() {

		clickByXpath("//*[@class='TopNavbarFragments__UserProfile-adzq1e-0 bnwzZQ']");
		return this;
	}
	public LoginPageDibiz clickLogOut() {
		clickByXpath("//*[contains(text(),'Log Out')]");
		return new LoginPageDibiz(driver, test);
	}
	
	public SourcedBatchDetailsPage StoreBatchReference() throws IOException {
		Properties props = new Properties();
		String path = "C:\\Users\\Suresh VeeraRaghavan\\git\\repositoryDIBIZ\\PageObjectModel\\src\\main\\resources\\db.properties";
		FileOutputStream outputStrem = new FileOutputStream(path, false);
		String data1 = driver.findElement(By.xpath("//*[contains(text(),'Batch Reference')]//following::div[1]")).getText();
		props.setProperty("BatchReference", data1);
		props.store(outputStrem,data1);
		return this;
	}
	

}
