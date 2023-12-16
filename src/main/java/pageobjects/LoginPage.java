package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonFunctions;



public class LoginPage extends CommonFunctions {

	public void swagLabUserLogin() {
		WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButtonLoginPage = driver.findElement(By.xpath("//input[@id='login-button']"));
		userNameTextBox.sendKeys("standard_user");
		passwordTextBox.sendKeys("secret_sauce");
		loginButtonLoginPage.click();
	}
}
