package com.actitime.objectrepositorylib;

/**
 * @author Abinash Nayak
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//div[text()='TASKS']/..")
	private WebElement taskTab;
	
	@FindBy(xpath="//div[text()='REPORTS']/..")
	private WebElement reportTab;
	
	@FindBy(xpath="//div[text()='USERS']/..")
	private WebElement userTab;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public void navigateToTaskPage()
	{
		taskTab.click();
	}
	
	public void navigateToUserPage()
	{
		userTab.click();
	}
	
	public void navigateToReportPage()
	{
		reportTab.click();
	}
	
	public void logoutLnk()
	{
		logoutLink.click();
	}
}
