package com.SchoolMgmt.schooltest;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestCasesForLoginMappings extends Setup{

	final String usrName   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "Mappings";
	
	@Test
	public void Test1() throws InterruptedException, IOException 
	{	
		String subMenu  = "Student Class Map";
		
		System.out.println("Starting Test 1");
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		waitfs.WaitforSometime(2000);
	
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 1 Complete.");
	}
	
	@Test
	public void Test2() throws InterruptedException, IOException 
	{
		String subMenu = "Teacher Subject Map";
		
		System.out.println("Starting Test 2..");
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
	
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
		String subMenu =  "Class Section Map";
		
		System.out.println("Starting Test 3...");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp("MFK", "123456", "Admin");
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		waitfs.WaitforSometime(2000);
	
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 3 Complete.");
	}
		
	@Test
	public void Test4() throws InterruptedException, IOException 
	{
		
		String subMenu = "Teacher Class Section Map";
		System.out.println("Starting Test 4...");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 4 Complete.");
	}
		
	@Test
	public void Test5() throws InterruptedException, IOException 
	{
		
		String subMenu = "Teacher Subject Class Map";
		System.out.println("Starting Test 5...");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		waitfs.WaitforSometime(2000);		

		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 5 Complete.");
	}
		
	@Test
	public void Test6() throws InterruptedException, IOException 
	{
		String subMenu = "Lecture Time Map";
		
		System.out.println("Starting Test 6...");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName, pass, accRights);
		
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);	
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 6 Complete.");
	}
		
	@Test
	public void Test7() throws InterruptedException, IOException 
	{
		String subMenu = "Time Table";
		System.out.println("Starting Test 7...");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
	
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 7 Complete.");
	}
		
	
	@Test
	public void Test8() throws InterruptedException, IOException 
	{	
		String subMenu = "Subject Syllabus";
		System.out.println("Starting Test 8...");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
	
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();
		
		System.out.println("Test 7 Complete.");
	}

}
