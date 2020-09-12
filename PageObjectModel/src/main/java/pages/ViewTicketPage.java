package pages;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ViewTicketPage extends DibizWrappers {

	public ViewTicketPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not View Ticket Page", "FAIL");
		}

	}

	public HomePage clickOnHomeFromNavigation() {

		clickByXpath("(//*[contains(text(), 'Home')])[1]");
		return new HomePage(driver, test);
	}

	public UpdateTicketPage clickOnEditTicket() {

		clickByXpath("//*[contains(text(), 'EDIT TICKET')]");
		return new UpdateTicketPage(driver, test);
	}

	public TicketsPage clickOnBackButton() {

		clickByXpath("//*[contains(text(), 'EDIT TICKET')]");
		return new TicketsPage(driver, test);
	}
	
	public ViewTicketPage verifyViewTicketPageRecordDetail() {
		String HarvesterName = driver.findElement(By.xpath("(//*[@class='Typography__P-cdhru6-4 ctKvoC'])[1]")).getText();
		verifyTextByXpath("(//*[contains(text(), 'Harvester Name')])[1]", HarvesterName);
		
		String TicketNumber = driver.findElement(By.xpath("(//*[@class='Typography__P-cdhru6-4 ctKvoC'])[2]")).getText();
		verifyTextByXpath("(//*[contains(text(), 'Ticket Number')])[1]", TicketNumber);
		
		String Quantity = driver.findElement(By.xpath("(//*[@class='Typography__P-cdhru6-4 ctKvoC'])[3]")).getText();
		verifyTextByXpath("(//*[contains(text(), 'Quantity')])[1]", Quantity);
		
		String UnripeBunches = driver.findElement(By.xpath("(//*[@class='Typography__P-cdhru6-4 ctKvoC'])[4]")).getText();
		verifyTextByXpath("(//*[contains(text(), 'Unripe bunches')])[1]", UnripeBunches);
		
		String RottenBunches = driver.findElement(By.xpath("(//*[@class='Typography__P-cdhru6-4 ctKvoC'])[5]")).getText();
		verifyTextByXpath("(//*[contains(text(), 'Rotten bunches')])[1]", RottenBunches);
		
		String LooseFruitlets = driver.findElement(By.xpath("(//*[@class='Typography__P-cdhru6-4 ctKvoC'])[6]")).getText();
		verifyTextByXpath("(//*[contains(text(), 'Loose Fruitlets')])[1]", LooseFruitlets);
		
		String Block = driver.findElement(By.xpath("(//*[@class='Typography__P-cdhru6-4 ctKvoC'])[9]")).getText();
		verifyTextByXpath("(//*[contains(text(), 'Block')])[1]", Block);
		
		return this;
	}
	
	public ViewTicketPage StoreTicketNumber() throws IOException {
		Properties props = new Properties();


		String path = "C:\\Users\\Suresh VeeraRaghavan\\git\\repositoryDIBIZ\\PageObjectModel\\src\\main\\resources\\db.properties";
		FileOutputStream outputStrem = new FileOutputStream(path, false);
		String data = driver.findElement(By.xpath("(//*[@class='Typography__P-cdhru6-4 ctKvoC'])[2]")).getText();
		props.setProperty("tktNumber", data);
		props.store(outputStrem,data);
		return this;

		}


}
