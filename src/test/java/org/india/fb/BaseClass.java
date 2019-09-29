package org.india.fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;

	public static void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JAGAN\\eclipse-workspace\\fb\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void writ(WebElement po, String hem) {
		po.sendKeys(hem);

	}

	public static void writ1(WebElement po1, String he) {
		po1.sendKeys(he);

	}

	public static void btnclick(WebElement gh) {
		gh.click();

	}

}
