package com.SchoolMgmt.schoolPages;

import static com.SchoolMgmt.utils.Sleeper.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.SchoolMgmt.utils.Selectors;

public class BranchPage 
{
	
	private static WebDriver driver;
	

	public BranchPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void Branch () 
	{
	
		Selectors findEle = new Selectors(driver);
		Actions act = new Actions(driver);

		WebElement org = findEle.targetName("cboOrganisation");	
		
		String orgn = org.getText();
		String expctorg = " eSkul (Demo) International";
	
		WebElement brnch = findEle.targetName("cboBranchList");
		String branch = brnch.getText();
	
		String expctbrnch = " Mumbai Branch";
	
		Assert.assertEquals(orgn, expctorg);
		Assert.assertEquals(branch, expctbrnch);

		act.click(findEle.targetId("btnOk")).perform();
		
		sleep();
	
	}

}