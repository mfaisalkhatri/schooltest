package com.SchoolMgmt.schoolPages;

import static com.SchoolMgmt.utils.Sleeper.sleep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.xml.ISuiteParser;

import com.SchoolMgmt.utils.Selectors;
import com.SchoolMgmt.utils.ExcelDataConfig;


public class TeacherPage {
	
	private WebDriver driver;
	
	public TeacherPage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	public void teacherElements () {
		
		Selectors findEle = new Selectors(driver);
		Actions act = new Actions(driver);
		
		act.click(findEle.targetCss(".btn.btn-success.btn-sm")).perform();
		System.out.println("Add Button Clicked!!");
	
	}
	
	/*public void addTeacherRecord (String code) {
		
		Selectors findEle = new Selectors(driver);
		Actions act = new Actions(driver);
	
		act.click(findEle.targetId("txtCode")).sendKeys(code).perform();
		
	}*/
	
	
	public void addTeacherRecord (String code,String fName, String mName, String lName,String birthDate,boolean gender,boolean mStatus,
								  String contactNo, String emailId,String qualfc, String acdm, String panNo, String aadhrNo, String pfNo,
								  String enrolNo, String enrolId, String joinDt,String cnfrmDt, String branch, boolean hasLeft, boolean isPartTime)
	{
		
		Selectors findEle = new Selectors(driver);
		Actions act = new Actions(driver);
	
		act.click(findEle.targetId("txtCode")).sendKeys(code).perform();
		act.click(findEle.targetId("txtFname")).sendKeys(fName).perform();
		act.click(findEle.targetId("txtMname")).sendKeys(mName).perform();
		act.click(findEle.targetId("txtLname")).sendKeys(lName).perform();
		act.click(findEle.targetId("dtBirthDate")).sendKeys(birthDate).perform();
		
		List<WebElement> gend = driver.findElements(By.className("lbl")); 
		
		WebElement target = null;
		if (gender == true) 
		{
			target = gend.get(0);	
		}
		
		else if (gender == false) 
		{
			target = gend.get(1);
		}
		else 
		{
		 System.out.println("Gender element not found!!");
		}	
		act.click(target).perform();
		
		//List<WebElement> mStat = driver.findElements(By.cssSelector(".lbl[contains *= 'Married']"));
		//WebElement mStat = driver.findElement(By.cssSelector(".lbl > input [id *= 'Married']"));
		
		WebElement targt = null;
		if (mStatus==true) 
		{
			targt = gend.get(2);
			
		}
		else
		{
			targt = gend.get(3);
		}
		act.click(targt).perform(); 
		act.click(findEle.targetId("txtContactno")).sendKeys(contactNo).perform();
		
		act.click(findEle.targetId("txtEmail")).sendKeys(emailId).perform();
		act.click(findEle.targetId("txtQualification")).sendKeys(qualfc).perform();
		act.click(findEle.targetId("txtAchedamics")).sendKeys(acdm).perform();
		act.click(findEle.targetId("txtPancard")).sendKeys(panNo).perform();
		act.click(findEle.targetId("txtAadharCard")).sendKeys(aadhrNo).perform();
		act.click(findEle.targetId("txtPfnumber")).sendKeys(pfNo).perform();
		act.click(findEle.targetId("txtEnrollNumber")).sendKeys(enrolNo).perform();
		act.click(findEle.targetId("txtEnrollmentid")).sendKeys(enrolId).perform();
		act.click(findEle.targetId("dtJoinDate")).sendKeys(joinDt).perform();
		act.click(findEle.targetId("dtConfirmdate")).sendKeys(cnfrmDt).perform(); 
		
		act.click(findEle.targetCss(".multiselect.dropdown-toggle.btn.btn-white.btn-primary"));
		Select slct = new Select(findEle.targetCss(".multiselect-container.dropdown-menu"));
		
		List<String> list = new ArrayList<String>(Arrays.asList(branch.split(",")));

		for (String check : list) {
			slct.selectByVisibleText(check);
		}

		if(hasLeft == true) {
			act.click(findEle.targetId("chkHasleft")).perform();	
		}
		
		if(isPartTime == true) {
			act.click(findEle.targetId("chkIsparttimefulltime")).perform();	
		}
			
	}
	
	


	
	
	
	
}
