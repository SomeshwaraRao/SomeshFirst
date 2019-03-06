package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithChrome {

	ChromeDriver driver;

	void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/praveenpolur/Downloads/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://youtube.com");
	}

}
