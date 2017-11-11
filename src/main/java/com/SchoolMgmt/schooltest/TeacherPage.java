package com.SchoolMgmt.schooltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TeacherPage {
	
	private WebDriver driver;

	public TeacherPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	
	public void teacherElements () {
		
		WebElement btnPanel = driver.findElement(By.id("breadcrumbs"));
		WebElement addBtn = btnPanel.findElement(By.cssSelector(".btn.btn-success.btn-sm"));
	
		addBtn.click();
		
		System.out.println("Add Button Clicked!!");
		
		
	}
	
	public void addTeacherRecord (String code) {
		
		WebElement fieldsPanel = driver.findElement(By.className("col-sm-12"));
		WebElement fieldCode = fieldsPanel.findElement(By.id("txtCode"));
		
		fieldCode.click();
		fieldCode.sendKeys(code);
		
		
		
	}
}
