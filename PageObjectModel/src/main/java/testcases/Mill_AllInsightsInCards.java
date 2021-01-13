package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class Mill_AllInsightsInCards extends DibizWrappers {

	@BeforeClass	
	public void setValue() {
		testCaseName = "US18_1_AllInsightsInCards";
		testDescription = "PAlm Oil Mill_AllInsightsInCards";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "US18_1_AllInsightsInCards";
	}

	@Test(dataProvider = "fetchData")
	/*public void loginLogOut(String uName, String pwd, String partner, String Product, String Quantity) {*/
		
		
		  public void loginLogOut(String uName, String pwd, String Sales, String 
				  Purchase, String BestSuppliers, String TopProducts, String
				  CertifiedSupplyChain, String SupplierCategories, String ExtractionRatio, String
				  TradeDetails, String MessagesExchanged) throws InterruptedException {
		 
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.checkForCardInsightSales(Sales)
		.checkForCardInsightPurchase(Purchase)
		.checkForCardInsightBestSuppliers(BestSuppliers)
		.checkForCardInsightTopProducts(TopProducts)
		.checkForCardInsightCertifiedSupplyChain(CertifiedSupplyChain)
		.checkForCardInsightSupplierCategories(SupplierCategories)
		.checkForCardInsightExtractionRatio(ExtractionRatio)
		.checkForCardInsightTradeDetails(TradeDetails)
		.checkForCardInsightMessagesExchanged(MessagesExchanged);

}
}