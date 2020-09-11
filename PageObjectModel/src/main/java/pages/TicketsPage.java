package pages;

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
		verifyTextByXpath("(//*[contains(text(), 'Quantity')])[1]", "Quantity");
		verifyTextByXpath("(//*[contains(text(), 'Daily')])[1]", "Daily");
		verifyTextByXpath("(//*[contains(text(), 'Weekly')])[1]", "Weekly");
		verifyTextByXpath("(//*[contains(text(), 'Status')])[1]", "Status");
		
		return this;
	}
}
