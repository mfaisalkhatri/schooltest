package com.SchoolMgmt.schooltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage 
{

	private  WebDriver driver;
	
	public MainPage(WebDriver driver)
	{
		this.driver = driver;	
	}

	public void mainPageAfterLogin(String menuName) 
	{
		
		WebElement menu = driver.findElement(By.id("Menu"));
		
		String dashboard = "Dashboard";
		if(menuName.equals(dashboard)) 
		{
		WebElement dashbrd = menu.findElement(By.linkText(dashboard));
		dashbrd.click();
		}
		else 
		{
			System.out.println("Main Menu not Found!");
		}
	}

	
	public void mainPageAfterLogin (String menuName,String subMenuName) throws InterruptedException 
	{
	
		String menuGeneralMaintain = "General Maintain"; 
		String menuMappings = "Mappings";
		String menuFeeUnits = "Fee Units";
		
		
		WebElement menu = driver.findElement(By.id("Menu"));
		
			if(menuName.equals(menuGeneralMaintain)) {

			String schSession = "School Session";
			String brnch = "Branch";
			String tchr = "Teacher";
			String student = "Student";
			String prnt = "Parent";
			String user = "User";
			
			Actions act = new Actions(driver);
			WebElement genMtn = menu.findElement(By.linkText(menuGeneralMaintain));
			act.moveToElement(genMtn).perform();
			Thread.sleep(2000);
			
			WebElement target = null;
			if(subMenuName.equals(schSession))
			{
			target = menu.findElement(By.linkText(schSession));
			}
			
			else if (subMenuName.equals(brnch)) 
			{
			target = menu.findElement(By.linkText(brnch));
			}
			
			else if (subMenuName.equals(tchr)) 
			{
			target = menu.findElement(By.linkText(tchr));
			}
			
			else if (subMenuName.equals(student)) 
			{
			target = menu.findElement(By.linkText(student));
			}
			
			else if (subMenuName.equals(prnt)) 
			{
			target = menu.findElement(By.linkText(prnt));
			}
			
			else if (subMenuName.equals(user)) 
			{
			target = menu.findElement(By.linkText(user));
			}
				else 
			{
				System.out.println("Sub Menu not Found!");
			}
		
			act.click(target).perform();
			Thread.sleep(2000);
		}
		
		else if(menuName.equals(menuMappings)) 
		{
		
			String mapstdClass = "Student Class Map";
			String mapstdTSub = "Teacher Subject Map";
			String mapstdClassSec = "Class Section Map";
			String mapTchrSec = "Teacher Class Section Map";
			String mapTchrSubClss = "Teacher Subject Class Map";
			String mapLctTime = "Lecture Time Map";
			String mapTimetable = "Time Table";
			String mapSubSyl = "Subject Syllabus";
			
			Actions act = new Actions(driver);
			WebElement map = menu.findElement(By.linkText(menuMappings));
			act.moveToElement(map).perform();
			Thread.sleep(2000);
			
			WebElement target = null;
			if(subMenuName.equals(mapstdClass)) 
			{
			target = menu.findElement(By.linkText(mapstdClass));
			}
			
			else if (subMenuName.equals (mapstdTSub)) 
			{
			target = menu.findElement(By.linkText(mapstdTSub));
			}
			
			else if (subMenuName.equals(mapstdClassSec)) 
			{
			target = menu.findElement(By.linkText(mapstdClassSec));
			}
			
			else if (subMenuName.equals(mapTchrSec)) 
			{
			target = menu.findElement(By.linkText(mapTchrSec));
			}
			
			else if (subMenuName.equals(mapTchrSubClss)) 
			{
			target = menu.findElement(By.linkText(mapTchrSubClss));
			}
			
			else if (subMenuName.equals(mapLctTime)) 
			{
			target = menu.findElement(By.linkText(mapLctTime));
			}
			
			else if (subMenuName.equals(mapTimetable)) 
			{
			target = menu.findElement(By.linkText(mapTimetable));
			}
			
			else if (subMenuName.equals(mapSubSyl)) 
			{
			target = menu.findElement(By.linkText(mapSubSyl));
			}
				else 
			{
				System.out.println("Sub Menu not Found!");
			}
			
			act.click(target).perform();
			Thread.sleep(2000);
		}
		
		else if(menuName.equals(menuFeeUnits)) 
		{
			String fHead       = "Fee Head";
			String fTemplate   = "Fee Template";
			String fClassType  = "Fee Class Template";
			String fCollection = "Fee Collection";
			
			Actions act = new Actions(driver);
			WebElement feeUnit = menu.findElement(By.linkText(menuFeeUnits));
			
			act.moveToElement(feeUnit).perform ();
			
			WebElement target = null;
			if(subMenuName.equals(fHead)) 
			{
				target = menu.findElement(By.linkText(fHead));
			}
			else if (subMenuName.equals(fTemplate)) 
			{
				target = menu.findElement(By.linkText(fTemplate));
			}
			else if (subMenuName.equals(fClassType)) 
			{
				target = menu.findElement(By.linkText(fClassType));
			}
			else if (subMenuName.equals(fCollection)) 
			{
				target = menu.findElement(By.linkText(fCollection));
			}
				else 
			{
				System.out.println("Sub Menu not Found!");
			}
			
			act.click(target).perform();
			Thread.sleep(2000);
			
		}
		

		/*else if(menuName == "Events & Holiday") {
			WebElement event = menu.findElement(By.linkText("Events & Holiday"));
			event.click();		
			}

		else if(menuName == "Attendance") {
			WebElement attndnce = menu.findElement(By.linkText("Attendance"));
			attndnce.click();		
			}*/
		
		else 
		{
		System.out.println("Main Menu Not Found!");	
			
		}
			
	}
	
}
	

