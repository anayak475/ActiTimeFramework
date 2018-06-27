package com.actitime.genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Abinash Nayak
 *
 */

public class Libraries {

	/**
	 * 
	 * @param dayElement
	 * @param visibleText
	 * A method present in Libraries class to select the value based on visible text from the day dropdown.
	 */
	public void selectDay(WebElement dayElement,String visibleText)
	{
		Select sel=new Select(dayElement);
		sel.selectByVisibleText(visibleText);
	}
	
	/**
	 * 
	 * @param dayElement
	 * @param index
	 * A method present in Libraries class to select the value based on index number from the day dropdown.
	 */
	
	public void selectDay(WebElement dayElement,int index)
	{
		Select sel=new Select(dayElement);
		sel.selectByIndex(index);
	}
	
	/**
	 * 
	 * @param dayElement
	 * @param visibleText
	 * A method present in Libraries class to select the value based on visible text from the month dropdown.
	 */
	public void selectMonth(WebElement monthElement,String visibleText)
	{
		Select sel=new Select(monthElement);
		sel.selectByVisibleText(visibleText);
	}
	
	/**
	 * 
	 * @param monthElement
	 * @param index
	 *A method present in Libraries class to select the value based on index number from the month dropdown.
     */
	public void selecMonth(WebElement monthElement,int index)
	{
		Select sel=new Select(monthElement);
		sel.selectByIndex(index);
	}
	
	/**
	 * 
	 * @param yearElement
	 * @param visibleText
	 * A method present in Libraries class to select the value based on visible text from the year dropdown.
	 */
	public void selectYear(WebElement yearElement,String visibleText)
	{
		Select sel=new Select(yearElement);
		sel.selectByVisibleText(visibleText);
	}
	
	/**
	 * 
	 * @param yearElement
	 * @param index
	 * A method present in Libraries class to select the value based on visible text from the year dropdown
	 */
	public void selectYear(WebElement yearElement,int index)
	{
		Select sel=new Select(yearElement);
		sel.selectByIndex(index);
	}
}
