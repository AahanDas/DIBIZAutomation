package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class US26_1_5_Feedback extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "US26_1_5_Feedback";
		testDescription = "PalmOilMillFeedback";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PalmOilMillFeedback";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String topic, String message) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnFeedbackFromMenu()
		.selectTopic(topic)
		.enterFeedbackMessage(message)
		.clickOnSubmitButton();

}
}
