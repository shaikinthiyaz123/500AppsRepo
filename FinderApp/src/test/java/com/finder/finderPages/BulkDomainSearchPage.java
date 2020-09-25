package com.finder.finderPages;

import org.openqa.selenium.By;


/**
 * @author Shaik Inthiyaz
 * A class to maintain the locators of BulkDomainSearchPage
 *
 */
public class BulkDomainSearchPage {
	public static By BulkDomainSearch_Click_Xpath = By.xpath("//a[text()='Domain Search']");

	public static By BulckDomainSearch_Csv_ClickXpath = By.xpath("//div[@class='card-body border-0 py-3 pl-0']//div[@class='customized-form d-flex choose-file']//div//button[@class='btn btn-outline-primary secondary col-md-12'][contains(text(),'Upload CSV File')]");

	public static By BulkDomainSearch_UploadButton_Xpath = By.xpath("//h3[text()='Domain Search']/../../../..//child::div[1]//child::*[1]//descendant::button[3]");
	public static By BulkDomainSearch_SelectOption_Xpath = By.xpath("(//select[@id='select'])[5]");
	
	public static By BulkDomainSearch_Button_Import_Xpath =By.xpath("(//button[text()='Import'])[1]");
	public static By BulkDomainSearch_Progress_Bar= By.xpath("//span[contains(text(),'files verified.')]");
	public static By BulkDomainSearch_Downlodlink_xpath= By.xpath("//div[@class='tab-pane show active fade card-body']//div//div[contains(@class,'text-center mt-4 p-4 bg-light')]//a[contains(@class,'text-decoration-none text-primary')][contains(text(),'Download')]");
}
