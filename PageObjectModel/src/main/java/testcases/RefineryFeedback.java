package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class RefineryFeedback extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "RefineryFeedback";
		testDescription = "RefineryFeedback";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "RefineryFeedback";
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
