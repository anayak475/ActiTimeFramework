package com.actitime.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileDataLib;
import com.actitime.objectrepositorylib.CreateNewCustomer;
import com.actitime.objectrepositorylib.HomePage;
import com.actitime.objectrepositorylib.OpenTask;

/**
 * 
 * @author Abinash Nayak
 *
 */

public class CreateCustomerTest extends BaseClass {
	
	FileDataLib lib=new FileDataLib();
	
	@Test
	public void createCustomer() throws Throwable
	{
		/*Read Data from Excel*/
		String custName=lib.getExcelData("Sheet1", 1, 2);
		
		/*Navigate to task page*/
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.navigateToTaskPage();
		Thread.sleep(2000);
		OpenTask op=PageFactory.initElements(driver, OpenTask.class);
		op.createNewCustomer();
		CreateNewCustomer cust=PageFactory.initElements(driver, CreateNewCustomer.class);
		cust.createNewCustomer(custName);
	}
	
	

}
