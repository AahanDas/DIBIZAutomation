package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class createBinPage extends DibizWrappers {

	public createBinPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not create Bin Page", "FAIL");
		}

	}
	public createBinPage enterVehicleType(String data) {
		enterById("input-vehicleType", data);
		return this;
	}
	public createBinPage enterVehicleNumber(String data) {
		enterById("input-vehicleNumber", data);
		
		return this;
	}
	public createBinPage enterCrewMember(String data) {
		enterById("input-crewMember", data);
		return this;
	}
	public createBinPage enterBinLabel(String data) {
		enterById("input-binNumber", data);
		return this;
	}
	
	public createBinPage ReadTicketNumberAndClickOnCheckBox() throws IOException {
		//Properties props = new Properties();

		String path = "C:\\Users\\Suresh VeeraRaghavan\\git\\repositoryDIBIZ\\PageObjectModel\\src\\main\\resources\\db.properties";
		FileInputStream inputStream = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(inputStream);
		
		String tktNumber = prop.getProperty("tktNumber");
		System.out.println("Ticket number Read from db.properties file: " + tktNumber);

		// clickByXpath(prop.getProperty("doNo"));

		clickByXpath("(//*[contains(text(),'"+tktNumber+"')]//preceding::div[1]");

		return this;

		}
	
	
	
	
	public createBinPage ReadTicketNumberclickOnTicketNumberCheckBox() throws IOException {
		//Properties props = new Properties();

		String path = "C:\\Users\\Suresh VeeraRaghavan\\git\\repositoryDIBIZ\\PageObjectModel\\src\\main\\resources\\db.properties";
		FileInputStream inputStream = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(inputStream);
		//Properties prop = new Properties();
		String tktNumber = prop.getProperty("tktNumber");
		System.out.println("Ticket number Read from db.properties file: " + tktNumber);

		// clickByXpath(prop.getProperty("doNo"));

		clickByXpath("(//*[contains(text(),'"+tktNumber+"')]//preceding::div[1])");

		return this;

		}
	
	
	
	
	
	
	
	
	public createBinPage clickOnTicketNumberCheckBox() {
		clickByXpath("(//*[@class='StyledBox-sc-13pk1d4-0 PiYIl StyledCheckBox__StyledCheckBoxBox-sc-1dbk5ju-3 cJNjzg'])[1]");
		clickByXpath("(//*[@class='StyledBox-sc-13pk1d4-0 PiYIl StyledCheckBox__StyledCheckBoxBox-sc-1dbk5ju-3 cJNjzg'])[2]");
		clickByXpath("(//*[@class='StyledBox-sc-13pk1d4-0 PiYIl StyledCheckBox__StyledCheckBoxBox-sc-1dbk5ju-3 cJNjzg'])[3]");
		clickByXpath("(//*[@class='StyledBox-sc-13pk1d4-0 PiYIl StyledCheckBox__StyledCheckBoxBox-sc-1dbk5ju-3 cJNjzg'])[4]");
		return this;
	}
	public ViewBinPage clickOnCreate() {
		clickByXpath("//*[@class='StyledButton-sc-323bzc-0 ctgEtY']");
		return new ViewBinPage(driver, test);
	}

}
