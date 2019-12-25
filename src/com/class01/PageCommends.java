package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommends {
	public static void main(String[] args) throws InterruptedException {
		//                    key                            Value
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\compa\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		 driver.get("http://google.com");
		 Thread.sleep(2000);
		 //browsers navigation commands
		 
		
		 driver.navigate().to("http://google.com");
		
         final String expectedTitle="Google";
		 String actualTitle=driver.getTitle();
		 if(expectedTitle.equals(actualTitle)) {
			 System.out.println(" iam on the right page");
		 }else {
			 System.out.println("The actual and expected title did not match");
		 }
		 System.out.println("*************************");
		 String expectedUrl="https://www.google.com/?gws_rd=ssl";
	        String actualUrl=driver.getCurrentUrl();
	        
	        
	        if(expectedUrl.equals(actualUrl)) {
	            System.out.println("Both URL matched");
	        }else {
	            System.err.println("Actual and Expected did not match");
	        }
	        

	
		 driver.close();
		 
		
	}

}
