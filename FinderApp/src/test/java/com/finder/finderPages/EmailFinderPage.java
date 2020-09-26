package com.finder.finderPages;

import org.openqa.selenium.By;

import utilities.KeywordUtil;


/**
 * @author Shaik Inthiyaz
 * A class to main all the locators of EmailFinderPage
 *
 */
public class EmailFinderPage  {
	public static By Click_EmailFinder_Xpath = By.xpath("//span[text()='Email Finder']");
	public static By Enter_EmailFinder_FN_Xpath=By.xpath("//input[@id='input_first_name']");
	public static By Enter_EmailFinder_LN_Xpath=By.xpath("//input[@id='input_last_name']");
	public static By Enter_EmailFinder_InputDomain_Xpath=By.xpath("//input[@id='input_domain']");
	public static By Find_Button_Xpath = By.xpath("//button[text()='Find']");
	public static By EmialFinder_Frontend_Card_Css= By.cssSelector("p[class*='finder-emailfindercard-font']");
	public static By  Confidence_Score_xpath = By.xpath("//div[@class='d-flex align-items-center justify-content-center']//descendant::div");


	
	
	
	
	
	
	
	
	//Click_EmailFinder_Css = span[class='Dashboard']+span 
	//Enter_EmailFinder_FN_Css=input[id='input_first_name']
	//Enter_EmailFinder_LN_Css=input[id='input_last_name']

}
