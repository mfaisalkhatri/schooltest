package com.SchoolMgmt.schooltest;

import java.io.IOException;


import org.testng.annotations.Test;

public class TestCasesForLoginGeneralMaintain extends Setup{

	final String usrName   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "General Maintain";
	
	@Test
	public void Test1() throws InterruptedException, IOException 
	{

		String subMenu  = "School Session";
		
		System.out.println("Test 1 Start..");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
		waitfs.WaitforSometime(2000);
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		waitfs.WaitforSometime(2000);

		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
		
		capture.captureScreen();
		
		System.out.println("Test 1 Complete!!");
	}

/*	@Test
	public void Test2() throws InterruptedException, IOException 
	{
	
		String subMenu   = "Branch";
		
		System.out.println("Test 2 Start..");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
		waitfs.WaitforSometime(2000);
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		waitfs.WaitforSometime(2000);
	
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
		
		capture.captureScreen();
		
		System.out.println("Test 2 Complete!!");
	}
	
	@Test
	public void Test3() throws InterruptedException, IOException 
	{	
		String subMenu   = "Teacher";
		String code = "Code123";
		
		System.out.println("Test 3 Start..");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
		waitfs.WaitforSometime(2000);
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		waitfs.WaitforSometime(2000);
		
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		waitfs.WaitforSometime(2000);
		
		capture.captureScreen();
		
		TeacherPage tPage = new TeacherPage(driver);
		tPage.teacherElements();
		
		
		tPage.addTeacherRecord(code);
		capture.captureScreen();
		
		System.out.println("Test 3 Complete!!");
	}
	
	@Test
	public void Test4() throws InterruptedException, IOException 
	{
		String subMenu   = "Student";
		
		System.out.println("Test 4 Start..");
	
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
		waitfs.WaitforSometime(2000);
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		waitfs.WaitforSometime(2000);
	
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		waitfs.WaitforSometime(2000);
		
		capture.captureScreen();		
		
		System.out.println("Test 4 Complete!!");
	}
	
	@Test
	public void Test5() throws InterruptedException, IOException 
	{
		String subMenu   = "User";
		
		System.out.println("Test 5 Start..");
		
		LoginPage login = new LoginPage(driver);
		Wait waitfs = new Wait();
	
		login.loginapp(usrName,pass,accRights);
		waitfs.WaitforSometime(2000);
		
		ScrShot capture = new ScrShot(driver);
		capture.captureScreen();

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		waitfs.WaitforSometime(2000);
		
		MainPage mpg = new MainPage(driver);
	
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		waitfs.WaitforSometime(2000);
		
		capture.captureScreen();	
		
		System.out.println("Test 5 Complete!!");
	}*/
	
}
