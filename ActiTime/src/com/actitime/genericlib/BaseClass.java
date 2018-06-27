package com.actitime.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	FileDataLib lib=new FileDataLib();
	public static WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() throws Throwable
	{
		Properties pObj=lib.getPropertiesFileObject();
		String browserName=pObj.getProperty("browser");
		if(browserName.equals("firefox"))
		{
			WebDriver driver=new FirefoxDriver();
		}
		else if(browserName.equals("Chrome"))
		{
			WebDriver driver=new ChromeDriver();
		}
		
	}
	@BeforeMethod
	public void loginToActiTime() throws Throwable
	{
		Properties pObject=lib.getPropertiesFileObject();
		String urlLink=pObject.getProperty("url");
		String userName=pObject.getProperty("username");
		String pwd=pObject.getProperty("password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(urlLink);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		
	}
	@AfterMethod
	public void logoutFromActiTime()
	{
		driver.findElement(By.linkText("Logout")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
