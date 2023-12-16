package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass.TestBase;

public class CommonFunctions extends TestBase {
	public void TakesScreenshotMethod() {
		try {
			String filepath = System.getProperty("user.dir") + "\\screenshots\\SwagLabScreenshot-" + TimeStamp()
					+ ".png";
			File sourceFile;
			sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile, new File(filepath));
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public String TimeStamp() throws IOException {
		Date dt = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		return sf.format(dt);
	}
}
