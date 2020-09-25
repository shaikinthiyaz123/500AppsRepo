package com.finder.finderPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtendUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;


/**
 * @author Shaik Inthiyaz
 *A class to maintain all the locator of EmailVerifyPage
 */
public class EmailVerifyPage {
	public static By Click_EmailVerify_Xpath = By.xpath("//span[text()='Email Verify']");
	public static By EnterEmailAddress_Css = By.cssSelector("input[id='input_email'][name ='email']");
	public static By Find_Xpath= By.xpath("//button[@type='button' and text()='Find']");
	public static By Verify_Email_Xpath= By.xpath("//p[@class='mb-0 text-dark font-weight-bold finder-emailverycard-font']");
	public static By Email_Success_xpath=By.xpath("//h3[text()='Email Verify']//following::i[2]");
	public static By Email_warning_xpath= By.xpath("//i[@class='fal fa-exclamation-triangle finder-icons fa-lg text-dange pt-1r fider-warninig']");
	public static By ValidateEmail=By.xpath("//i[@data-original-title='Add to List']");

	public static WebElement waitForVisible(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(KeywordUtil.getDriver(), 20);
			// wait.ignoring(ElementNotVisibleException.class);
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			return null;
		}
	}
	
	public static void isWebElementVisible(By locator, String logStep) {
		
		String color= KeywordUtil.getDriver().findElement(EmailVerifyPage.Email_Success_xpath).getCssValue("color");

		
			if(color.equals("rgba(36, 179, 20, 1)")){
			
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
			System.out.println("Color displyed="+ color);
			}else {
				ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.failStringRedColor("Email is Invalid"));
			}
	
		}
	}

//EnterEmailAddress_Xpath =//input[@id='input_email' and @name ='email'] 
