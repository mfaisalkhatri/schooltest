package com.SchoolMgmt.schooltest;

import java.io.IOException;
import java.util.ArrayList;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LoginPage {

		private static  WebDriver driver;

	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;

	}
	
	
	public void loginapp(String usrname, String passw, String accrights) throws InterruptedException, IOException {
		

		String [] accRights = {"Admin", "Teacher","Student", "Parent"};
		
		WebElement loginpage = driver.findElement(By.id("LoginForm"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement usrName = loginpage.findElement(By.id("txtUser"));
		usrName.click();
		usrName.clear();
		usrName.sendKeys(usrname);
		
		WebElement password = loginpage.findElement(By.name ("txtPassword"));
		password.click();
		password.clear();
		password.sendKeys(passw);
		
		ArrayList<WebElement> radio = (ArrayList<WebElement>) driver.findElements(By.className("lbl"));
		
		WebElement target = null;
		if (accrights.equals(accRights[0])) 
		{
			target = radio.get(0);	
		}
		
		else if (accrights.equals(accRights[1])) 
		{
			target = radio.get(1);
		}
		
		else if (accrights.equals(accRights[2])) 
		{
			target = radio.get(2);
		}
		
		else if (accrights.equals(accRights[3]))
		{
			target = radio.get(3);
		}
		
		else
		{
			System.out.println("Access rights field not Found!");		
		}
		
		Actions act = new Actions (driver);
		act.click(target).perform();
		
		WebElement lgnBtn = loginpage.findElement(By.id("btnLogin"));
		lgnBtn.click();
		
	}
	
}
