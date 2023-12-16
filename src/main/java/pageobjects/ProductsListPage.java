package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonFunctions;

public class ProductsListPage extends CommonFunctions {

	public void selectSauceLabsBackpack() {
		WebElement productElementLandingPage = driver.findElement(By.xpath("//span[text()='Products']"));
		boolean isLandedInProductPage = productElementLandingPage.isDisplayed();
		if (isLandedInProductPage) {
			WebElement selectedProduct = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
			selectedProduct.click();
		} else {
			WebElement loginButtonNotLoggedIn = driver.findElement(By.xpath("//input[@id='login-button']"));
			boolean loginPageDisplay = loginButtonNotLoggedIn.isDisplayed();
			if (loginPageDisplay) {
				System.out.println("Not Logged into SwagLabs");
			} else {
				System.out.println("Error,Check for the SwagLabs");
			}
		}
	}
}
