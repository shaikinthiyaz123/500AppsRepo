package com.HipsocialPages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.KeywordUtil;

public class RejOrApprvPosts {
	public static By Manage_App_xpath = By.xpath("//a[text()='Manage Approvals']");
	public static By Select_manager_xpath = By.xpath("(//div[@class='d-flex'])[7]//select[2]");
	public static By Select_Account_xpath = By.xpath("(//div[@class='d-flex'])[7]//select[1]");
	public static By Save_Button_xpath = By.xpath("(//div[@class='d-flex'])[7]//button[text()='Save']");
	public static By userName = By.id("user");
	public static By Password = By.id("pass");
	public static By loginbutton = By.xpath("//button[@class='btn w-100 submit-button mt-4 btn-primary py-3']");
	public static By Click_hipsocial_xpath = By.xpath("//h5[contains(text(),'Hipsocial')]");
	public static By click_to_logout_css=By.cssSelector("button[class='btn btn-link btn-lg dropdown-toggle dropdown-toggle-no-caret text-decoration-none ac-material-dropdown']"); 
	public static By click_on_logout_xpath= By.xpath("//span[contains(text(),'Logout')]");
	public static By click_skip_xpath= By.xpath("//a[text()='Skip']");
	public static By click_on_elipse_xpath= By.xpath("(//button//i[@class='far fa-ellipsis-h fa-lg text-primary'])[1]");
	public static By click_on_Approve_xpath= By.xpath("(//a[text()='Approve'])[1]");
	public static By click_published_xpath= By.xpath("(//span[text()='published'])[1]");
	public static By click_delmanager_elipse_xpath= By.xpath("(//i[@class='fal fa-ellipsis-h'])[1]");
	public static By click_elipsedel_xpath= By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'Delete')]");
	public static By click_managerDel_btn_xpath= By.xpath("//button[@class='btn']");
	public static By click_Reject_xpath= By.xpath("(//a[text()='Reject'])[1]");
	public static By Reject_Status_onUser_xpath= By.xpath("(//span[text()='rejected'])");
	public static By Enter_Text = By.xpath("//textarea[@name='message']");
	public static By col_index_xpath = By.xpath("//td[@aria-colindex='3']");
	
	
	public static void selectAddedNetwork(String value) throws Exception {
		WebElement element = KeywordUtil.getDriver().findElement(AddNetworkPage.Select_Streem_Dropdown_Xpath);

		Select streem = new Select(element);
		streem.selectByVisibleText(value);
		KeywordUtil.delay(3000);
	
	}
}
