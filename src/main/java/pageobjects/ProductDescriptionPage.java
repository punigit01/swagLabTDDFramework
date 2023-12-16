package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonFunctions;



public class ProductDescriptionPage extends CommonFunctions {

	public void reviewProduct() {
		WebElement backToProductsButton = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		if (backToProductsButton.isDisplayed()) {
			WebElement addToCartButton = driver
					.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
			addToCartButton.click();

			// a[@class='shopping_cart_link']/child::span[@class='shopping_cart_badge']
			WebElement addToCartValidate = driver.findElement(
					By.xpath("//a[@class='shopping_cart_link']/child::span[@class='shopping_cart_badge']"));
			String cartValue = addToCartValidate.getText();
			int cartValueInt = Integer.parseInt(cartValue);
			if (cartValueInt == 1) {
				addToCartValidate.click();
			}
		}
	}
}
