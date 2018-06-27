package com.actitime.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileDataLib;
import com.actitime.objectrepositorylib.HomePage;
import com.actitime.objectrepositorylib.OpenTask;

/**
 * 
 * @author Abinash Nayak
 *
 */

public class ModifyCustomerTest extends BaseClass {
	
	
	@Test
	public void modifyCustomerTest() throws Throwable
	{
	FileDataLib lib=new FileDataLib();
    String taskName=lib.getExcelData("Sheet1", 1, 4);
    /*Navigate to task page*/
	HomePage hp=PageFactory.initElements(driver, HomePage.class);
	hp.navigateToTaskPage();
	OpenTask opt=PageFactory.initElements(driver, OpenTask.class);
	opt.createNewProject();
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	WebElement customerEdt=driver.findElement(By.xpath("//div[@id='createTasksPopup_customerSelector']/table/tbody/tr[1]/td[2]/em"));
	act.moveToElement(customerEdt).click().perform();
	Thread.sleep(2000);
	WebElement customerName=driver.findElement(By.xpath("//a[text()='James Hicks']"));
	act.moveToElement(customerName).click().perform();
	Thread.sleep(2000);
	WebElement projectEdt=driver.findElement(By.xpath("//div[@id='createTasksPopup_projectSelector']"));
	act.moveToElement(projectEdt).click().perform();
	Thread.sleep(2000);
	WebElement projectName=driver.findElement(By.xpath("//a[text()='- New Project -']"));
	act.moveToElement(projectName).click().perform();
	Thread.sleep(2000);
	driver.findElement(By.id("createTasksPopup_newProject")).sendKeys("Automation Project");
	/*Retrieve and update the project details for the customer*/
    String xpTask="//div[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input[@class='inputFieldWithPlaceholder']";
    Thread.sleep(2000);
    driver.findElement(By.xpath(xpTask)).sendKeys(taskName);
	Thread.sleep(2000);
    driver.findElement(By.xpath("//table[@class='createTasksTable hideEstimate']/tbody/tr[1]/td[3]/div/table/tbody[1]/tr[1]/td[2]/em/button[@class='x-btn-text']")).click();
    Thread.sleep(2000);
    
	
	/*Update the deadline(date of completion) for the project*/
	while(true)
	{
		try
		{
			
			String calOpt="//table[@class='x-date-inner']/tbody/tr[4]/td[3]/a/em/span[text()='20']";
			driver.findElement(By.xpath(calOpt));
			break;
		}
		catch(Throwable t)
		{
			String mNext="//a[@class='x-unselectable']";
			driver.findElement(By.xpath(mNext)).click();			}
		
	}
	
	/*Identify and tick the checkbox*/
	driver.findElement(By.xpath("//div[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[5]/td[5]/div/input")).click();
	
	/*Click on create customer and verify the message*/
	driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();
	Thread.sleep(5000);
	}
}
