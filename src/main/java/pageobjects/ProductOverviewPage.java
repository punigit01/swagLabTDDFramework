package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonFunctions;

public class ProductOverviewPage extends CommonFunctions {
	public void productOverview() {
		WebElement finishButton = driver.findElement(By.xpath("//button[@id='finish']"));
		jse.executeScript("arguments[0].scrollIntoView();", finishButton);
		if (finishButton.isDisplayed()) {
			TakesScreenshotMethod();
			System.out.println("Successful, Completed through Check out page");
			WebElement totalValueString = driver
					.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']"));
			String totalValueText = totalValueString.getText();
			System.out.println(totalValueText);
			String[] arrStrings = totalValueText.split(" ");
			double totalValueDouble = Double.parseDouble(arrStrings[1].substring(1));
			// Validate by adding two values to validate with total
			if (totalValueDouble == 32.39) {
				System.out.println("Successful, Total value is validated properly");
			}

		} else {
			System.out.println("Err, Not through Check out page");
		}
	}
}
