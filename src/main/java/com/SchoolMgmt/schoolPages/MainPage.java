package com.SchoolMgmt.schoolPages;

import static com.SchoolMgmt.utils.Sleeper.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.SchoolMgmt.utils.MainMenu;
import com.SchoolMgmt.utils.Selectors;
import com.SchoolMgmt.utils.SubMenu;

public class MainPage 
{

	private  WebDriver driver;
	
	public MainPage(WebDriver driver)
	{
		this.driver = driver;	
	}

	public void mainPageAfterLogin(String menuName) 
	{
		Selectors findEle = new Selectors(driver);
		Actions act = new Actions(driver);
		MainMenu mn = MainMenu.DASHBOARD;
	
		String dashboard = mn.getMainMenu();
		
		if(menuName.equals(dashboard)) 
		{
			act.click(findEle.targetLinkText("Dashboard")).build().perform();	
	
		}
		else 
		{
			System.out.println("Dashboard Menu not Found!");
		}
	}

	
	public void mainPageAfterLogin (String menuName,String subMenuName) 
	{
	
		MainMenu mn  = MainMenu.GENERALMAINTAIN;
		MainMenu mp = MainMenu.MAPPINGS;
		MainMenu fee = MainMenu.FEEUNITS;
		
		String menuGeneralMaintain = mn.getMainMenu() ; 
		String menuMappings = mp.getMainMenu();
		String menuFeeUnits = fee.getMainMenu();
		
		Selectors findEle = new Selectors(driver);
		Actions act = new Actions(driver);
				
		WebElement menu = driver.findElement(By.id("Menu"));
		
			if(menuName.equals(menuGeneralMaintain)) {

			SubMenu ss  = SubMenu.SCHOOLSESSION;
			SubMenu br  = SubMenu.BRANCH;
			SubMenu tc  = SubMenu.TEACHER;
			SubMenu std = SubMenu.STUDENT;
			SubMenu pr  = SubMenu.PARENT;
			SubMenu usr = SubMenu.USER;
								
			String schSession = ss.getSubMenu();
			String brnch      = br.getSubMenu();
			String tchr       = tc.getSubMenu();
			String student    = std.getSubMenu();
			String prnt       = pr.getSubMenu();
			String user       = usr.getSubMenu();
			
			act.moveToElement(findEle.targetLinkText(menuGeneralMaintain)).perform();
			
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
				System.out.println("Sub Menu for General Maintain not Found!");
			}
		
			act.click(target).perform();
			sleep();

		}
		
		else if(menuName.equals(menuMappings)) 
		{
		
			SubMenu stdClass    = SubMenu.STUDENTCLASSMAP;
			SubMenu tchSub      = SubMenu.TEACHERSUBJECTMAP;
			SubMenu classSec    = SubMenu.CLASSSECTIONMAP;
			SubMenu tchclass    = SubMenu.TEACHERCLASSSECTIONMAP;
			SubMenu tchSubClass = SubMenu.TEACHERSUBJECTCLASSMAP;
			SubMenu lTimeMap    = SubMenu.LECTURETIMEMAP;
			SubMenu tTble       = SubMenu.TIMETABLE;
			SubMenu subSy       = SubMenu.SUBJECTSYLLABUS;
			
			String mapstdClass    = stdClass.getSubMenu();
			String mapstdTSub     = tchSub.getSubMenu();
			String mapstdClassSec = classSec.getSubMenu();
			String mapTchrSec     = tchclass.getSubMenu();
			String mapTchrSubClss = tchSubClass.getSubMenu();
			String mapLctTime     = lTimeMap.getSubMenu();
			String mapTimetable   = tTble.getSubMenu();
			String mapSubSyl      = subSy.getSubMenu();
			
			
			act.moveToElement(findEle.targetLinkText(menuMappings)).perform();		
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
				System.out.println("Sub Menu for Mappings not Found!");
			}
			
			act.click(target).perform();
			sleep();
		}
		
		else if(menuName.equals(menuFeeUnits)) 
		{
			
			SubMenu feeHead     = SubMenu.FEEHEAD;
			SubMenu feeTmpl     = SubMenu.FEETEMPLATE;
			SubMenu feeClass    = SubMenu.FEECLASSTEMPLATE;
			SubMenu feeColl     = SubMenu.FEECOLLECTION;
				
			String fHead       = feeHead.getSubMenu();
			String fTemplate   = feeTmpl.getSubMenu();
			String fClassType  = feeClass.getSubMenu();
			String fCollection = feeColl.getSubMenu();
			
			act.moveToElement(findEle.targetLinkText(menuFeeUnits)).perform();
			
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
				System.out.println("Sub Menu for Fee Units not Found!");
			}
			
			act.click(target).perform();
			sleep();
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
	

