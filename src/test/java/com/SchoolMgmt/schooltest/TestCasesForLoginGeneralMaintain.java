package com.SchoolMgmt.schooltest;

import java.io.IOException;
import java.util.List;

import static com.SchoolMgmt.utils.Messages.*;
import static com.SchoolMgmt.utils.ScrShot.*;
import static com.SchoolMgmt.utils.Sleeper.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.SchoolMgmt.schoolPages.BranchPage;
import com.SchoolMgmt.schoolPages.LoginPage;
import com.SchoolMgmt.schoolPages.MainPage;
import com.SchoolMgmt.schoolPages.TeacherPage;
import com.SchoolMgmt.utils.ExcelDataConfig;
import com.SchoolMgmt.utils.Selectors;

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
	
	@Test
	public void Test3() throws IOException 
	{	
		String subMenu   = "Teacher";
		testStartMessage("Test 3");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
		//captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		//captureScreen(driver);
		TeacherPage tPage = new TeacherPage(driver);
		tPage.teacherElements();
	
		Selectors findEle = new Selectors(driver);
		Actions act = new Actions(driver);
		act.click(findEle.targetId("txtAadharCard")).sendKeys("123456").perform();
		WebElement bBtn = driver.findElement(By.cssSelector(".multiselect.dropdown-toggle.btn.btn-white.btn-primary"));
		bBtn.click();
		sleep();
		List<WebElement> list = driver.findElements(By.cssSelector(".btn-group.open>ul>li>a"));
		
		String [] opts = { "123", "ANDHERI BRANCH" };
		for (String opt : opts) { // Excel.
			WebElement option = list.stream().filter(e -> e.getText().equals(opt)).findFirst().get();
			option.click ();
			sleep ();
		}
		captureScreen(driver);
		testEndMessage	("Test 3");
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
	
	
	
}
