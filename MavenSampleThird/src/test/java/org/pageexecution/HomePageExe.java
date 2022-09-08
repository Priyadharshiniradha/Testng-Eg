package org.pageexecution;

import org.baseutils.BaseClass;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class HomePageExe extends BaseClass {

	@Test
	public void method1()
	{
		String Actual = "Welcome to Facebook";
		String Expected = "Welcome to Facebook";
		
		Assert.assertTrue(Actual.contains(Expected));
	}
	
	@Test
	public void method2()
	{
		String Actual = "Welcome to Facebook";
		String Expected = "Welcome to Facebook";
		
		Assert.assertTrue(Actual.contains(Expected));
	}
	
	@Ignore
	@Test
	public void method3()
	{
		String Actual = "Welcome to Facebook";
		String Expected = "Welcome to Facebook";
		
		Assert.assertTrue(Actual.contains(Expected));
	}
	
	@Test
	public void reportgeneration()
	{
		ExtentTest logger = extent.createTest("Sample test");
		logger.log(Status.PASS, "Test Success");
	}
}
