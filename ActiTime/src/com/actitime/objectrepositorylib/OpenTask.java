package com.actitime.objectrepositorylib;

/**
 * @author Abinash Nayak
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
	
	@FindBy(xpath="//div[text()='Add New']/..")
	private WebElement addNewCust;
	
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement newCustBtn;
	
	@FindBy(xpath="//div[text()='Add New Task']/..")
	private WebElement addNewTaskBtn;
	
	@FindBy(xpath="//div[text()='Create new tasks']")
	private WebElement createNewTaskBtn;
	
	public void createNewCustomer()
	{
		newCustBtn.click();
	}
	
	public void createNewProject() throws Throwable
	{
		addNewTaskBtn.click();
		Thread.sleep(2000);
		createNewTaskBtn.click();
	}
	
	
}
