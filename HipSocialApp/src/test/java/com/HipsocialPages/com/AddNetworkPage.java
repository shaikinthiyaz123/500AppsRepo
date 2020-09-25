package com.HipsocialPages.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hipsocial.stepdefinitions.RunCukesTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class AddNetworkPage {

	public static By Click_Twitter_Xpath = By.xpath("(//a[@class='text-info'])[1]");
	public static By Enter_Twi_UserName_Css = By.cssSelector("input[id='username_or_email']");
	public static By Enter_Twi_Pass_Css = By.cssSelector("input[id='password']");
	public static By Click_AuthApp_Css = By.cssSelector("input[id='allow']");
	public static By Click_AnyCategory_Xpath= By.xpath("//div[@class='p-0 py-1 ml-2' and text()='New category']");
	public static By enter_User_xpath= By.xpath("(//input[@name='session[username_or_email]'])[1]");
	public static By enter_pass_xpath= By.xpath("(//input[@name='session[password]'])[1]");
	public static By click_again_xpath= By.xpath("(//div[@role='button'])[1]/div");
	public static By Select_Streem_Dropdown_Xpath = By.xpath("//h5[text()='Add Stream']//following::div/div/select");
	// ==========================FacebookLocators==========================================================================
	public static By Click_FB_Xpath = By.xpath("(//a[@class='text-info'])[2]");
	public static By FB_Username_Xpath = By.xpath("//input[@id='email']");
	public static By FB_Pass_Xpath = By.xpath("//input[@id='pass']");
	public static By FB_ClickLogIn_Xpath = By.xpath("//button[@id='loginbutton']");
	public static By FB_Click_Contiueas_Xpath = By.xpath("//span[text()='Continue as Mohd Hakeem']");
	public static By Clcik_Back_Button_Xpath = By.xpath("//button[text()='Back']");
	public static By Click_FB1stPage_Xpath = By
			.xpath("//span[text()='QA testing']");
	public static By Clcik_Submit_Xpath = By.xpath("(//button[@type='submit'])[4]");
	// ============================LinkedInLocators=====================================================================
	public static By Click_LinkedIn_Xpath = By.xpath("(//a[@class='text-info'])[4]");
	public static By LinkedIn_Username_Xpath = By.xpath("//input[@id='username']");
	public static By LinkedIn_Pass_Xpath = By.xpath("//input[@id='password']");
	public static By LinkedIn_ClickSignIn_Xpath = By.xpath("//button[@aria-label='Sign in']");
	public static By Click_Lnk1stpage_Xpath = By
			.xpath("//span[text()='500apps-socialchimp']");
	public static By Clcik_LnkSubmit_Xpath = By.xpath("(//button[@type='submit'])[4]");
	public static By Clcik_LnkBack_Button_Xpath = By.xpath("//button[text()='Back']");
	// ===========================WordPress
	// Locators==========================================================================
	public static By Click_Wordpress_Xpath = By.xpath("(//a[@class='text-info'])[5]");
	public static By WordPress_Username_Css = By.cssSelector("input[id='usernameOrEmail']");
	public static By Click_Continue_Css = By.cssSelector("button[type='submit']");
	public static By WordPress_Pass_Css = By.cssSelector("input[id='password']");
	public static By WordPress_ClickLogin_Css = By.cssSelector("button[type='submit']");
	public static By WordPress_ClickApprove_Css = By.cssSelector("button[id='approve']");

	// ========================================================================================================

	// span[text()='QA testing']

	

	public static void switchWindowHandle() {
		String currentWindowHandle = KeywordUtil.getDriver().getWindowHandle();

		Set<String> windowHandles = KeywordUtil.getDriver().getWindowHandles();
		System.out.println(windowHandles);
		int count = windowHandles.size();
		System.out.println("Number of the tabs open =" + count);

		for (String window : windowHandles) {

			if (!window.equals(currentWindowHandle)) {

				KeywordUtil.getDriver().switchTo().window(window);

			}
		}
	}

	public static void selectAddedNetwork(String value) throws Exception {
		WebElement element = KeywordUtil.getDriver().findElement(Select_Streem_Dropdown_Xpath);

		Select streem = new Select(element);
		streem.selectByVisibleText(value);
		KeywordUtil.delay(3000);

	}
	public static void waitForClick() throws InterruptedException{
		
		KeywordUtil.delay(6000);
	}
	}


