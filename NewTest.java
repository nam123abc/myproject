package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	  WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

    	System.setProperty("webdriver.chrome.driver", "/Users/gsns/Downloads/chromedriver");

     driver = new ChromeDriver();
    }
    
    @Test
    public void lauchURL() {
     
        driver.get("https://www.max.com/home/");
       
        Assert.assertEquals(driver.getTitle(), "MAX INTERNATIONAL");
    }
     
	
	@Test
	public void welcomepage() {
		System.out.println("Welcome page is displayed");
	}
	
	@Test
	public void shoplink() {
		System.out.println("Shopping items are displayed on clicking SHOP");
	}
	@Test
	public void price() {
		System.out.println("correct price is displayed");
	}
	 @AfterMethod
	    public void afterMethod() {
	        driver.quit();
	    }
	}
	 
	