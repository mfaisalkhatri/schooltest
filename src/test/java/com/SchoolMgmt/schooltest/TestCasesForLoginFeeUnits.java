package com.SchoolMgmt.schooltest;

import java.io.IOException;
import org.testng.annotations.Test;

public class TestCasesForLoginFeeUnits extends Setup{

	
	final String usrname   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "Fee Units"; 

	@Test
	public void Test1() throws InterruptedException, IOException 
	{

		String subMenu  = "Fee Head";
		
		System.out.println("Starting Test 1");
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrname,pass,accRights);
		
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);

		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 1 Complete.");
	}
	

	@Test
	public void Test2() throws InterruptedException, IOException 
	{
		String subMenu  = "Fee Template";
		
		System.out.println("Starting Test 2");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrname,pass,accRights);
		
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);

		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
	
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 2 Complete.");
		
	}
	
	@Test
	public void Test3() throws InterruptedException, IOException 
	{
	
		String subMenu  = "Fee Class Template";
		
		System.out.println("Starting Test 3");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrname,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);

		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 3 Complete.");
		
	}

	@Test
	public void Test4() throws InterruptedException, IOException 
	{
	
		String subMenu   = "Fee Collection";
		
		System.out.println("Starting Test 4");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrname,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
	
		MainPage mpg = new MainPage(driver);

		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 4 Complete.");
		
	}	
	
	
}