package com.SchoolMgmt.schooltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BranchPage 
{
	
	private static WebDriver driver;
	
	public BranchPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void Branch () 
	{
		
	WebElement mainpage = driver.findElement(By.id("LoginForm"));
		
	WebElement org = mainpage.findElement(By.name("cboOrganisation"));
	String orgn = org.getText();
	String expctorg = " eSkul (Demo) International";
	
	WebElement brnch = mainpage.findElement(By.name("cboBranchList"));
	String branch = brnch.getText();
	
	String expctbrnch = " Mumbai Branch";
	
	Assert.assertEquals(orgn, expctorg);
	Assert.assertEquals(branch, expctbrnch);

	WebElement OkBtn = mainpage.findElement(By.id("btnOk"));
	OkBtn.click();
	
	}

}