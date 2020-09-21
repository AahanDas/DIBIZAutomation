package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class TicketsPage extends DibizWrappers {

	public TicketsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Tickets Page", "FAIL");
		}

	}
	public CreateTicketPage clickOnCreateTicket() {
		clickByXpath("//*[contains(text(), 'CREATE TICKET')]");
		
		return new CreateTicketPage(driver, test);
	}

	public ViewTicketPage clickOnView() {
		clickByXpath("(//*[contains(text(), 'View')])[2]");
		return new ViewTicketPage(driver, test);
	}
	
	public TicketsPage checkForPlantationTicketPageRecordTable() {

		verifyTextByXpath("(//*[contains(text(), 'Date')])[1]", "Date");
		verifyTextByXpath("(//*[contains(text(), 'Ticket Number')])[1]", "Ticket Number");
		verifyTextByXpath("(//*[contains(text(), 'Harvester Name')])[1]", "Harvester Name");
		verifyTextByXpath("(//*[@class='Typography__Label-cdhru6-5 gNFnJ'])[6]", "Quantity (Nos)");
		verifyTextByXpath("(//*[contains(text(), 'Daily')])[1]", "Daily");
		verifyTextByXpath("(//*[contains(text(), 'Weekly')])[1]", "Weekly");
		verifyTextByXpath("(//*[contains(text(), 'Status')])[1]", "Status");
		
		return this;
	}
	
	
	
	
	public ViewTicketPage ReadTicketNumberAndClickOnView() throws IOException {
		//Properties props = new Properties();

		String path = "C:\\Users\\Suresh VeeraRaghavan\\git\\repositoryDIBIZ\\PageObjectModel\\src\\main\\resources\\db.properties";
		FileInputStream inputStream = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(inputStream);
		
		String tktNumber = prop.getProperty("tktNumber");
		System.out.println("Ticket number Read from db.properties file: " + tktNumber);

		// clickByXpath(prop.getProperty("doNo"));

		clickByXpath("(//*[contains(text(),'"+tktNumber+"')]//following::td[3]//button)");

		return new ViewTicketPage(driver, test);

		}
	
	
	
}
