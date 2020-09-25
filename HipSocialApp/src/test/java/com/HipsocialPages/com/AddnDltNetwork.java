package com.HipsocialPages.com;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import utilities.Apps500Util;
import utilities.ExtendUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

public class AddnDltNetwork {
	public static By click_setting_icon_xpath= By.xpath("//button[@class='btn btn-secondary btn-lg dropdown-toggle dropdown-toggle-no-caret text-decoration-none']");
	public static By click_Manage_Network_xpath= By.xpath("//a[@class='dropdown-item' and text()='Manage Networks' ]");
	public static By click_Twitter_xpath= By.xpath("//span[text()='Twitter']");
	public static By click_to_trash_xpath= By.xpath("//i[@class='fal fa-trash-alt text-danger']");
	public static By click_Del_button= By.xpath("//i[@class='fal fa-trash-alt text-danger']//following::button[2]");
	public static By click_facebook_xpath= By.xpath("//span[text()='Facebook']");
	public static By click_wordpress_xpath= By.xpath("//span[text()='WordPress']");
	public static By click_LinkedIn_xpath= By.xpath("//span[text()='LinkedIn']");
	public static By click_Add_Network_xpath= By.xpath("//span[text()='Add Account']");
	
	//public static By click_Manage_Network_xpath= By.xpath("");
	//public static By click_Manage_Network_xpath= By.xpath("");
	//public static By click_Manage_Network_xpath= By.xpath("");
	//public static By click_Manage_Network_xpath= By.xpath("");
	//public static By click_Manage_Network_xpath= By.xpath("");
	//public static By click_Manage_Network_xpath= By.xpath("");
	//public static By click_Manage_Network_xpath= By.xpath("");
	
	
	
	public static void netVerify() throws InterruptedException{
		
		
		boolean display= KeywordUtil.getDriver().findElement(click_to_trash_xpath).isDisplayed();
		System.out.println("element display="+display);
		
		if(display==true){
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Account Presented Successfully"));
			
		}
		
	}

	public static boolean isElementPresent(By locatorKey) throws InterruptedException {
	    try {
	    	KeywordUtil.getDriver().findElement(locatorKey);
	        return true;
	        
	        
	    } catch (Exception e) {
	        return false;
	    }

	    }
	}
	

