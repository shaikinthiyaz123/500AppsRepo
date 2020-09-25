package com.finder.finderPages;

import org.openqa.selenium.By;

/**
 * @author Shaik Inthiyaz A class to maintain the locators of
 *         BulkEmailFinderPage
 *
 */
public class BulkEmailFinderPage {
	public static By BulkDomainFinder_Click_Xpath = By.xpath("//a[text()='Email Finder']");
	public static By EmailFinder_Upload_Csv_Click_Xpath = By.xpath("(//h3[text()='Email finder']/../../../..//child::div[1]//child::*[1]//descendant::button[1])[1]");
	public static By EmailFinder_UploadButton_Xpath = By
			.xpath("//h3[text()='Email finder']/../../../..//child::div[1]//child::*[1]//descendant::button[3]");
	public static By SelectOption_firstname_Xpath = By.xpath("(//select[@id='select'])[2]");
	public static By SelectOption_lastname_Xpath = By.xpath("(//select[@id='select'])[3]");
	public static By SelectOption_domainName_Xpath = By.xpath("(//select[@id='select'])[4]");

	public static By Button_import_Xpath = By.xpath("(//button[text()='Import'])[2]");
	public static By  card_body_xpath= By.xpath("//h3[contains(text(),'Email finder')]/following::main");
	public static By BulkEmailFinder_Downlodlink_xpath= By.xpath("//div[@class='row border-left-0 border-right-0 border-bottom-0 border-top-0 m-0 finder-left-0']//a[contains(@class,'text-decoration-none text-primary')][contains(text(),'Download')]");
	public static By movetotop= By.xpath("//div[@class='ac-gravatar']");
}
