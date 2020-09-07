package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ViewEmployeePage extends DibizWrappers {

	public ViewEmployeePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not View Employee Page", "FAIL");
		}

	}
	
	public ViewEmployeePage verifyEmployeeManagementPage() {

		verifyTextByXpath("//*[contains(text(), 'Employee Name')]", "Employee Name");
		verifyTextByXpath("//*[contains(text(), 'Designation')]", "Designation");
		verifyTextByXpath("//*[contains(text(), 'Email Address')]", "Email Address");
		verifyTextByXpath("//*[contains(text(), 'Phone Number')]", "Phone Number");
		verifyTextByXpath("//*[contains(text(), 'Employee ID')]", "Employee ID");
		verifyTextByXpath("//*[contains(text(), 'DIBIZ Role')]", "DIBIZ Role");

		return this;

	}
}
