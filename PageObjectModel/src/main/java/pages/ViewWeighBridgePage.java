package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ViewWeighBridgePage extends DibizWrappers {

	public ViewWeighBridgePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not View Weigh Bridge Page", "FAIL");
		}

	}
	public UpdateWeighBridgePage clickOnEDITWEIGHBRIDGE() {
		
		clickByXpath("//*[contains(text(), 'EDIT WEIGHBRIDGE')]");
		return new UpdateWeighBridgePage(driver, test);
	}
	
	public ViewWeighBridgePage validateToastMessage() {
		
		WebElement msg=driver.findElement(By.xpath("//*[@class='ct-heading']"));
        String text=msg.getText();
        String expectedText = "Success";
        Assert.assertEquals(text,expectedText);
       // Assert.assertTrue(text.contains(expectedText));
		return this;
	}
	
}
