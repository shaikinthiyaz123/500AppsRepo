package com.finder.finderPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtendUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

public class ListsPage {
	public static By Click_Lists_xpath= By.xpath("//span[contains(text(),'Lists')]");
	public static By Click_Add_List_xpath= By.xpath("//button[text()='Add List']");
	public static By Enter_List_Name_xpath= By.xpath("//input[@id='input_undefined']");
	public static By Click_Save_Button_xpath= By.xpath("//button[@class='btn submit-button btn-primary']");
	public static By Click_List_Elipse_xpath= By.xpath("(//i[@class='fal fa-ellipsis-h'])[1]");
	public static By Click_List_Edit_xpath= By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'Edit')]");
	public static By Click_List_delete_xpath= By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'Delete')]");
	public static By Click_List_updatebtn= By.xpath("//button[text()='Update']");
	public static By Click_List_delbtn= By.xpath("//button[@class='btn btn-danger' and text()='Delete']");
	

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static String randomAlphaNumeric(int count) {
	StringBuilder builder = new StringBuilder();
	while (count-- != 0) {
	int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
	builder.append(ALPHA_NUMERIC_STRING.charAt(character));
	}
	return builder.toString();
	}
	public static void clickonellicpes(String text) {
		//p[text()="test1"]//ancestor::td//following-sibling::td//div[@icon='fal fa-ellipsis-h']
		KeywordUtil.waitForVisible(
				
				By.xpath("//p[text()=\"" + text + "\"]//ancestor::td//following-sibling::td//div[@icon='fal fa-ellipsis-h']"));
		WebElement ele = KeywordUtil.getDriver().findElement(
				By.xpath("//p[text()=\"" + text + "\"]//ancestor::td//following-sibling::td//div[@icon='fal fa-ellipsis-h']"));
		ele.click();
		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Sucessfully Clicked on ellipses"));
	}
	  
	public static void clickonEdit(String text) {
		KeywordUtil.waitForVisible(
				By.xpath("//p[text()=\"" + text + "\"]//ancestor::td//following-sibling::td//span[text()='Edit']"));
		WebElement ele = KeywordUtil.getDriver().findElement(
				By.xpath("//p[text()=\"" + text + "\"]//ancestor::td//following-sibling::td//span[text()='Edit']"));
		ele.click();
		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Sucessfully Clicked on Update"));
	}
	
	public static  void clickOnDelete(String text) {
		KeywordUtil.waitForVisible(
				By.xpath("//p[text()=\"" + text + "\"]//ancestor::td//following-sibling::td//span[text()='Delete']"));
		WebElement ele = KeywordUtil.getDriver().findElement(
				By.xpath("//p[text()=\"" + text + "\"]//ancestor::td//following-sibling::td//span[text()='Delete']"));
		ele.click();
		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Sucessfully Clicked on Delete"));
	}
	public void clickforDeleteAll() {
		WebElement ele1 = KeywordUtil.getDriver().findElement(
				By.xpath("//i[@class='fal fa-trash-alt']//following::button[text()='Delete']"));
		ele1.click();
		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Sucessfully Clicked on Delete"));
	}
}
