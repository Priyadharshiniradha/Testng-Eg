package org.pageexecution;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginPageExecution.class, HomePageExe.class })
public class Execution {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(LoginPageExecution.class, HomePageExe.class);
		
		System.out.println(r.getRunTime());
		System.out.println(r.getIgnoreCount());
		System.out.println(r.getFailureCount());	
	}
}
