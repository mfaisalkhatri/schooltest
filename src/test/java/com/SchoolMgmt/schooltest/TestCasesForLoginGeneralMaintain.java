package com.SchoolMgmt.schooltest;

import java.io.IOException;

import static com.SchoolMgmt.utils.Messages.*;
import static com.SchoolMgmt.utils.ScrShot.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.SchoolMgmt.schoolPages.BranchPage;
import com.SchoolMgmt.schoolPages.LoginPage;
import com.SchoolMgmt.schoolPages.MainPage;
import com.SchoolMgmt.schoolPages.TeacherPage;
import com.SchoolMgmt.utils.ExcelDataConfig;

public class TestCasesForLoginGeneralMaintain extends Setup{

	final String usrName   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "General Maintain";
	
/*	@Test
	public void Test1() throws IOException 
	{

		String subMenu  = "School Session";
		testStartMessage("Test 1");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();

		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 1");
	}

	@Test
	public void Test2() throws InterruptedException, IOException 
	{
	
		String subMenu   = "Branch";
		testStartMessage("Test 2");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Test 2");	
	
	}*/
	
	@Test(dataProvider = "personalData")
	public void Test3(String code, String fName, String mName, String lName, String birthDate, String gender, String mStatus, String contactNo) throws IOException 
	{	
		String subMenu   = "Teacher";
		testStartMessage("Test 3");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);
		
		TeacherPage tPage = new TeacherPage(driver);
		tPage.teacherElements();
		tPage.addTeacherRecord(code,fName,mName,lName,birthDate,Boolean.parseBoolean(gender),Boolean.parseBoolean(mStatus),contactNo);
		captureScreen(driver);
		
		testEndMessage("Test 3");
	}
	
	/*@Test
	public void Test4() throws IOException 
	{
		String subMenu   = "Student";
		testStartMessage("Test 4");
	
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

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
		String subMenu   = "User";
		testStartMessage("Test 5");
		
		LoginPage login = new LoginPage(driver);	
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
	
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);	
		
		testEndMessage("Test 5");
	}*/
	
	
	@DataProvider (name = "personalData") 
	public Object[][] passData (){
		String xlPath = "D:\\Eclipse_Oxygen\\schooltest\\src\\test\\resources\\TeacherDetails.xlsx";
		ExcelDataConfig excl = new ExcelDataConfig(xlPath);
		int rows = excl.getRowCount(0);
	
		Object[][] data  = new Object [rows][8];
		for (int i = 0; i< rows ;i++) {
			
			data [i][0] = excl.getData(0, i + 1, 0);
			data [i][1] = excl.getData(0, i + 1, 1);
			data [i][2] = excl.getData(0, i + 1, 2);
			data [i][3] = excl.getData(0, i + 1, 3);
			data [i][4] = excl.getData(0, i + 1, 4);
			data [i][5] = excl.getData(0, i + 1, 5);
			data [i][6] = excl.getData(0, i + 1, 6);
			data [i][7] = excl.getData(0, i + 1, 7);
			
		}
		return data;
	}
	
	
}
