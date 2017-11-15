package com.SchoolMgmt.schooltest;

import java.io.IOException;

import static com.SchoolMgmt.utils.Messages.*;
import static com.SchoolMgmt.utils.ScrShot.*;
import org.testng.annotations.Test;

import com.SchoolMgmt.schoolPages.BranchPage;
import com.SchoolMgmt.schoolPages.LoginPage;
import com.SchoolMgmt.schoolPages.MainPage;

public class TestCasesForLoginMappings extends Setup{

	final String usrName   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "Mappings";
	
	@Test
	public void Test1() throws InterruptedException, IOException 
	{	
		String subMenu  = "Student Class Map";
		testStartMessage("Test 1");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 1");
	}
	
	@Test
	public void Test2() throws InterruptedException, IOException 
	{
		String subMenu = "Teacher Subject Map";
		testStartMessage("Test 2");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
			
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 2");
	}
	
	@Test
	public void Test3() throws InterruptedException, IOException 
	{	
		String subMenu =  "Class Section Map";
		testStartMessage("Test 3");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName, pass, accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 3");
	}
		
	@Test
	public void Test4() throws InterruptedException, IOException 
	{
		
		String subMenu = "Teacher Class Section Map";
		testStartMessage("Test 4");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 4");
	}
		
	@Test
	public void Test5() throws InterruptedException, IOException 
	{
		
		String subMenu = "Teacher Subject Class Map";
		testStartMessage("Test 5");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 5");
	}
		
	@Test
	public void Test6() throws InterruptedException, IOException 
	{
		String subMenu = "Lecture Time Map";
		testStartMessage("Test 6");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName, pass, accRights);
		
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 6");
	}
		
	@Test
	public void Test7() throws InterruptedException, IOException 
	{
		String subMenu = "Time Table";
		testStartMessage("Test 7");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 7");
	}
		
	
	@Test
	public void Test8() throws InterruptedException, IOException 
	{	
		String subMenu = "Subject Syllabus";
		testStartMessage("Test 8");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 8");
	}

}
