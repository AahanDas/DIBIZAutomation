package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationFeedback extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "PlantationFeedback";
		testDescription = "PlantationFeedback";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "PlantationFeedback";
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
