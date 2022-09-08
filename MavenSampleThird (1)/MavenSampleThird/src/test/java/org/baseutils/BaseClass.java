package org.baseutils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	@BeforeClass
	public static void beforeClass()
	{
	
		System.out.println("beforeClass");
	}
	
	public static WebDriver driver;
	
	public static void browserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	public static void url(String url)
	{
		driver.get(url);	
	}
	
	public static void type(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("afterClass");
	}
}
