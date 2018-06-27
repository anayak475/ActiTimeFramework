package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListener implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult t)
	{
		String failedTestName=t.getMethod().getMethodName();
		System.out.println("The Failed test method is"+failedTestName);
		EventFiringWebDriver efw=new EventFiringWebDriver(BaseClass.driver);
		File srcFile=efw.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Screenshot");
		try
		{
			FileUtils.copyFile(srcFile, destFile);
			
		}
		catch(IOException e)
		{
			
		}
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
