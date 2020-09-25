package com.finder.finderPages;

import org.openqa.selenium.By;

import utilities.KeywordUtil;

/**
 * @author Shaik Inthiyaz 
 * 
 * A class to maintain locators of domain search page
 *
 */
public class DomainSearchPage  {

	//public static By Click_Finder_Xpath = By.xpath("//h5[contains(text(),'Finder')]");
	 public static By Click_Finder_Xpath = By.xpath("//span[contains(text(),'Finder')]");
	public static By Enter_Domain_Name_Field_Xpath = By.xpath("//input[@id='input_domain']");
	// public static By Click_Find_Email_Address_Xpath=By.xpath("//button[@type='submit']");
	public static By Click_Find_Email_Address_Xpath = By.xpath("//button[text()='Find Email addresses']");
	public static By EmialAddress_Count_Xpath = By.xpath("//span[@class='text-black-50' and text()=' Emails Found: ']/span");
	public static By Click_Finder_Middle_Xpath= By.xpath("");
	public static By domain_search= By.xpath("//span[contains(text(),'Domain Search')]");

	public static By SelectOption_Xpath = By.xpath("(//select[@id='select'])[3]");
	public static By Button_importCsv_Xpath= By.xpath("(//button[text()='Import From CSV'])[3]");

}
