package com.SchoolMgmt.schooltest;

import static com.SchoolMgmt.utils.Messages.testEndMessage;
import static com.SchoolMgmt.utils.Messages.testStartMessage;
import static com.SchoolMgmt.utils.ScrShot.captureScreen;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.SchoolMgmt.schoolPages.BranchPage;
import com.SchoolMgmt.schoolPages.LoginPage;
import com.SchoolMgmt.schoolPages.MainPage;
import com.SchoolMgmt.schoolPages.TeacherPage;
import com.SchoolMgmt.utils.ExcelDataConfig;

public class TestCaseForAddingTeacherRecord extends Setup {
	
	final String usrName   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "General Maintain";

	@Test(dataProvider = "personalData")
	public void Test1(String code, String fName, String mName, String lName, String birthDate, String gender, String mStatus, 
					  String contactNo, String emailId, String qualfc, String acdm, String panNo, String aadhrNo, String pfNo,
					  String enrolNo, String enrolId, String joinDt,String cnfrmDt, String branch, String hasLeft,String isPartTime) throws IOException 
	{	
		String subMenu   = "Teacher";
		testStartMessage("Test 1");
		
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
		tPage.addTeacherRecord(code,fName,mName,lName,birthDate,Boolean.parseBoolean(gender),Boolean.parseBoolean(mStatus),contactNo,emailId,
								qualfc, acdm,panNo,aadhrNo,pfNo,enrolNo,enrolId,joinDt,cnfrmDt,branch,Boolean.parseBoolean(hasLeft),Boolean.parseBoolean(isPartTime));
		captureScreen(driver);
		
		testEndMessage("Test 1");
	}
	
	@DataProvider (name = "personalData") 
	public Object[][] passData (){
		//String xlPath = "D:\\Eclipse_Oxygen\\schooltest\\src\\test\\resources\\TeacherDetails.xlsx";
		String xlPath = "F:\\Github\\schooltest\\src\\test\\resources\\TeacherDetails.xlsx";
		ExcelDataConfig excl = new ExcelDataConfig(xlPath);
		int rows = excl.getRowCount(0);
	
		Object[][] data  = new Object [rows][21];
		for (int i = 0; i< rows ;i++) {
			
			data [i][0] = excl.getData(0, i + 1, 0);
			data [i][1] = excl.getData(0, i + 1, 1);
			data [i][2] = excl.getData(0, i + 1, 2);
			data [i][3] = excl.getData(0, i + 1, 3);
			data [i][4] = excl.getData(0, i + 1, 4);
			data [i][5] = excl.getData(0, i + 1, 5);
			data [i][6] = excl.getData(0, i + 1, 6);
			data [i][7] = excl.getData(0, i + 1, 7);
			data [i][8] = excl.getData(0, i + 1, 8);
			data [i][9] = excl.getData(0, i + 1, 9);
			data [i][10] = excl.getData(0, i + 1, 10);
			data [i][11] = excl.getData(0, i + 1, 11);
			data [i][12] = excl.getData(0, i + 1, 12);
			data [i][13] = excl.getData(0, i + 1, 13);
			data [i][14] = excl.getData(0, i + 1, 14);
			data [i][15] = excl.getData(0, i + 1, 15);
			data [i][16] = excl.getData(0, i + 1, 16);
			data [i][17] = excl.getData(0, i + 1, 17);
			data [i][18] = excl.getData(0, i + 1, 18);
			data [i][19] = excl.getData(0, i + 1, 19);
			data [i][20] = excl.getData(0, i + 1, 20);			
		}
		return data;
	}
	
	
	

}
