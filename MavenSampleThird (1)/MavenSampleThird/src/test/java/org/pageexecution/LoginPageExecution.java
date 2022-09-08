package org.pageexecution;

import org.baseutils.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pagerepo.LoginPageRepo;

public class LoginPageExecution extends BaseClass {
	@Before
	public void before()
	{
		System.out.println("Before ");
		BaseClass.browserLaunch();
		BaseClass.url("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{		
		LoginPageRepo repo = new LoginPageRepo();
		BaseClass.type(repo.getUsername(), "Gunasekar");
		BaseClass.type(repo.getPassword(), "gunapwd");
		
		System.out.println("Test1 passed");
	}
	
	@Test
	public void test2()
	{
		LoginPageRepo repo = new LoginPageRepo();
		BaseClass.type(repo.getUsername(), "Priyadharshini");
		BaseClass.type(repo.getPassword(), "Priyapwd");
		
		System.out.println("Test2 passed");
	}
	
	@Test
	public void test3()
	{
		LoginPageRepo repo = new LoginPageRepo();
		BaseClass.type(repo.getUsername(), "Suresh");
		BaseClass.type(repo.getPassword(), "sureshpwd");
		
		System.out.println("Test3 passed");
	}
		
	@After
	public void after()
	{
		System.out.println("After ");
	}
}
