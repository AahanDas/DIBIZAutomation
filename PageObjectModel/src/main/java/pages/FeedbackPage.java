package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class FeedbackPage extends DibizWrappers {

	public FeedbackPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Feedback Page", "FAIL");
		}

	}
	public FeedbackPage selectTopic(String data) {
		clickById("select-drop-topic__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;

	}
	
	public FeedbackPage enterFeedbackMessage(String data) {
		
		enterById("input-message", data);
		return this;

	}
	
	//Need to decide which page is landing, as there is an existing issue after Submit.
	public FeedbackPage clickOnSubmitButton() {
		
		clickByXpath("//*[contains(text(),'Submit')]");
		return this;
	}

}
