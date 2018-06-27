package com.actitime.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.objectrepositorylib.HomePage;

/**
 * 
 * @author Abinash Nayak
 *
 */

public class DeleteCustomerTest extends BaseClass {
	
	@Test
	
	public void deleteCustomerTest() throws Throwable
	{
		/*Navigate to task page*/
		HomePage hp=PageFactory.initElements(driver,HomePage.class);
		hp.navigateToTaskPage();
		/*Identify the project name and click on it*/
		driver.findElement(By.xpath("//div[@class='customersProjectsTree allExpanded']/div[2]/div[1]/div[1]/div[2]/div[13]/div[3]")).click();
		Thread.sleep(2000);
		/*Select the project and delete it*/
		driver.findElement(By.xpath("//div[@class='editProjectPanelHeader']/div[3]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']/div[4]/div[1]/div[3]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='itemsContainer']/div[12]/div[4]")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='headerBlock']/div[4]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']/div[4]/div/div[3]/div")).click();;
		Thread.sleep(2000);
		driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		Thread.sleep(2000);
		}
	}
	


