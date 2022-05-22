package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.awt.datatransfer.StringSelection;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest {
	  WebDriver driver;

   @BeforeTest
	public void launchTest() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/gsns/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apptest.digiboxx.com/login");
		Thread.sleep(3000);
		
		WebElement Digispace = driver.findElement(By.xpath("//input[@id='workspace']"));
		WebElement EmailId = driver.findElement(By.xpath("//input[@id='Username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement LoginNow = driver.findElement(By.xpath("//button[contains(text(),'Login Now')]"));
		
		Digispace.sendKeys("Intern3");
		Thread.sleep(1500);
		EmailId.sendKeys("testing2510932@gmail.com");
		Thread.sleep(1500);
		password.sendKeys("Gaurav@123");
		Thread.sleep(1500);
		LoginNow.click();
		Thread.sleep(1500);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Click Here']")));
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='add-btn']")));
		driver.findElement(By.xpath("//span[@class='add-btn']")).click();
		
   }
	

 
    	
    }
    	
    	
   
    
    

		