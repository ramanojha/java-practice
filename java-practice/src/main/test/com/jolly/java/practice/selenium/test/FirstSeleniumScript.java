package com.jolly.java.practice.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumScript {

	public static void main(String[] args) throws Exception {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		
//		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
//		WebElement passWord = driver.findElement(By.xpath("//input[@id='pass']"));
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
//		Thread.sleep(5000);
//		userName.sendKeys("ojha.raman100000000000000001@gmail.com");
//		Thread.sleep(5000);
//		passWord.sendKeys("Fireshot12#$");
//		Thread.sleep(5000);
//		loginBtn.click();
//		Thread.sleep(5000);
//
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://www.Naukri.com");
		
//		clickOn(driver , driver.findElement(By.xpath("//a[@title='Jobseeker Login']")));
//		clickOn(driver ,driver.findElements( By.xpath(xpathExpression)))
		
	}

}
