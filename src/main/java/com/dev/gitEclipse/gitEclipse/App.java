package com.dev.gitEclipse.gitEclipse;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test(priority = 1)
	public void Login() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/LAM/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://deepai.org/chat");
		try {
			// get all cookies
			Set<Cookie> cookies = driver.manage().getCookies();
			System.out.println(cookies);
		} finally {
			driver.quit();
		}
	}
}
