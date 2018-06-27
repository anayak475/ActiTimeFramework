package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author Abinash Nayak
 *
 */

public class CreateNewCustomer {
	
	@FindBy(xpath="//div[text()='Add New']/..")
	private WebElement addNewCust;
	
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement newCustBtn;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement custNameEdt;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement custDesEdt;
	
	@FindBy(xpath="//span[text()='Create Customer']/..")
	private WebElement createCustBtn;
	
	public void createNewCustomer(String customerName) throws Throwable
	{
		addNewCust.click();
		Thread.sleep(2000);
		newCustBtn.click();
		Thread.sleep(2000);
		custNameEdt.sendKeys(customerName);
		createCustBtn.click();
	}
	
	public void createNewCustomer(String customerName,String customerDesc) throws Throwable
	{
		addNewCust.click();
		Thread.sleep(2000);
		newCustBtn.click();
		Thread.sleep(2000);
		custNameEdt.sendKeys(customerName);
		Thread.sleep(2000);
		custDesEdt.sendKeys(customerDesc);
		Thread.sleep(2000);
		createCustBtn.click();
	}

}
