package smoketest;

//import java.time.Duration;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import baseclass.TestBase;
import pageobjects.CartPage;
import pageobjects.InformationCheckOutPage;
import pageobjects.LoginPage;
import pageobjects.ProductDescriptionPage;
import pageobjects.ProductOverviewPage;
import pageobjects.ProductsListPage;
import utils.CommonFunctions;

public class SwagLabProductPurchase extends CommonFunctions {

	@Test
	public void productPurchaseFlow() {
		LoginPage loginpage = new LoginPage();
		loginpage.swagLabUserLogin();

		ProductsListPage productslistpage = new ProductsListPage();
		productslistpage.selectSauceLabsBackpack();

		ProductDescriptionPage productdescriptionpage = new ProductDescriptionPage();
		productdescriptionpage.reviewProduct();

		CartPage cartpage = new CartPage();
		cartpage.productCheckOut();

		InformationCheckOutPage informationcheckoutpage = new InformationCheckOutPage();
		informationcheckoutpage.enterPersonalDetails();

		ProductOverviewPage productoverviewpage = new ProductOverviewPage();
		productoverviewpage.productOverview();

		// new ProductsListPage().selectSauceLabsBackpack(); //Runtime calling page
		// objects

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
