package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\"C:\\\\Users\\\\compa\\\\eclipse-workspace\\\\Selenium\\\\drivers\\\\chromedriver.exe\"");
	WebDriver driver= new ChromeDriver();
	
	driver.getPageSource();
	
	
	
	}

}
