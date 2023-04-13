package com.jala.opwebelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputPlaceHolderTestCase {

	public static void main(String[] args) {

		String pathDriver = System.getProperty("user.dir");

		// System.out.println("PathDtiver: "+ pathDriver);
		// System.setProperty("webdriver.gecko.driver",
		// pathDriver+"\\drivers\\gecko\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", pathDriver + "\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement inputUserElement = driver.findElement(By.id("UserName"));
		//inputUserElement.sendKeys("jaybkm");
		String value1 = inputUserElement.getAttribute("placeholder");
		System.out.println("Entered text is: " + value1);
		
		WebElement inputPasswordElement = driver.findElement(By.id("Password"));
		//inputPasswordElement.sendKeys("jaybkmjfhfgdgggdgh");
		String value2 = inputPasswordElement.getAttribute("placeholder");
		System.out.println("Entered text is: " + value2);
	    //driver.quit();
	}

}
