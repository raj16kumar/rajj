package com.facebook.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FunctionalBaseclass {
	
	public static WebDriver driver;
	
	public static WebDriver launchApp() throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sadhana\\eclipse-workspace\\FunctionalBaseclass\\Drivers\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 return driver;
			 
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
			
		}
		 

	}
	
	public static void geturl(String url) throws Exception {
				try {
					driver.get(url);
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}		

	}
	
	public static void quit() {
		driver.quit();

	}
	
	public static void enterText(WebElement element,String value) {
		
           try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void elementIsDisplay(WebElement element) {
		element.isDisplayed();
		//boolean displayed = element.isDisplayed();
		//return displayed;
					}
	public static boolean elementIsEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;

	}
	public static void alert() {

	}
	
	public static void selectDropdown(WebElement element, String values,String options) {
		Select sc=new Select(element);
		if (options.equalsIgnoreCase(values)) {
			sc.selectByIndex(Integer.parseInt(values));
			
		}else if (options.equalsIgnoreCase("values")) {
			sc.selectByValue(values);
			
		}else {
			sc.selectByVisibleText(values);
		}
		
		
	}

	public static void navigationOption(String value) {
		if(value.equalsIgnoreCase("forward")) {
		
       driver.navigate().forward();
	}else if (value.equalsIgnoreCase("back")) {
		driver.navigate().back();
	}else {
		driver.navigate().refresh();
	}
		
	}

	public static void mouseact(WebElement element) {
		
		Actions ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
//		ac.dragAndDrop(source, target).build().perform();
//		ac.contextClick().build().perform();
//		ac.doubleClick().build().perform();

	}
	
	public static void clk(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
