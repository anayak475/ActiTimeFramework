package com.actitime.objectrepositorylib;

/**
 * @author Abinash Nayak
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(id="username")
	private WebElement userEdit;
	
	@FindBy(name="pwd")
	private WebElement pwdEdit;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	public void login(String username,String password)
	{
		userEdit.sendKeys(username);
		pwdEdit.sendKeys(password);
		loginBtn.click();
	}
}
