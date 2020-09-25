package com.finder.finderPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.GlobalUtil;
import utilities.KeywordUtil;


/**
 * @author Shaik Inthiyaz
 * A class to maintain the locators of BulkEmailVerifypage
 *
 */
public class BulkEmailVerifypage  {
	public static By BulkFinder_Click_Xpath = By.xpath("//span[text()='Bulk']");
	
	public static By EmailVerify_Upload_Csv_Click_Xpath= 
			By.xpath("//div[@class='card-body border-0 pl-0 py-3']//div[@class='customized-form d-flex choose-file']//div//button[@class='btn btn-outline-primary secondary col-md-12'][contains(text(),'Upload CSV File')]");
	
	public static By EmailVerify_UploadButton_Xpath= 
			By.xpath("//h3[text()='Email Verify']/../../../..//child::div[1]//child::*[1]//descendant::button[3]");
	public static By SelectOption_Xpath = By.xpath("(//select[@id='select'])[1]");
	
	public static By Button_Import =By.xpath("(//button[text()='Import'])[1]");
	public static By BulkEmailVerif_resultbody= By.xpath("//h3[contains(text(),'Email Verify')]/following::main");
	
	
	
	
	
	
	
	public void uploadfile(String path) {
		By listinput = By.xpath("//div[@class='mr-3']//div[@class='custom-file b-form-file ac-local-upload_input mb-2']//input");
		
		List<WebElement>inputelementsss = GlobalUtil.getDriver().findElements(listinput);
		for (WebElement webElement : inputelementsss) {
			
			if(webElement.isEnabled()) {
			webElement.sendKeys("path");
			break;
			}
			
		}
	}
}
