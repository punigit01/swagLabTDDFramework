package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonFunctions;



public class InformationCheckOutPage extends CommonFunctions {
	public void enterPersonalDetails() {
		WebElement firstNameDetail = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstNameDetail.sendKeys("Swag");

		WebElement lastNameDetail = driver.findElement(By.xpath("//input[@id='last-name']"));
		lastNameDetail.sendKeys("Labs");

		WebElement pinCodeDetail = driver.findElement(By.xpath("//input[@id='postal-code']"));
		pinCodeDetail.sendKeys("524785");

		WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		continueButton.click();
	}
}
