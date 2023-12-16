package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonFunctions;


public class CartPage extends CommonFunctions {
	public void productCheckOut() {
		WebElement checkOutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
		if (checkOutButton.isDisplayed()) {
			checkOutButton.click();
		}
	}
}
