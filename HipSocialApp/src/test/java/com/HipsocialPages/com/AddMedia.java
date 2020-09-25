package com.HipsocialPages.com;

import java.awt.AWTException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtendUtil;
import utilities.FileUploadingRobotClass;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

public class AddMedia {
	public static By click_setting_icon_xpath= By.xpath("//button[@class='btn btn-secondary btn-lg dropdown-toggle dropdown-toggle-no-caret text-decoration-none']");
	public static By click_MediaLibrary_xpath= By.xpath("//a[text()='Media Library']");

	public static By click_select_xpath= By.xpath("//select[@class='btn btn-transparent border border-rounded border-secondary w-100']");

	public static By click_on_Addmedia_xpath= By.xpath("//button[text()='Add Media']");

	public static By click_on_browse= By.xpath("//div[@class='custom-file b-form-file']");

	public static By click_to_choose_category= By.xpath("//h5[text()='Add Media']//following::button[2]");
	public static By choose_category= By.xpath("//a[contains(text(),'default category')]");
	public static By choose_category_video= By.xpath("//a[contains(text(),'default category')]");
	public static By choose_category_audio= By.xpath("//a[contains(text(),'default category')]");


	public static By Click_on_Save_button= By.xpath("(//button[@class='btn submit-button btn-primary'])[1]");
	
	public static By Click_on_Videos_xapth= By.xpath("//a[text()='Videos']");
	public static By Click_on_Audioes_xapth= By.xpath("//a[text()='Audios']");
	public static By uploding_percent_xpath=By.xpath("//div[@class='w-100 m-1 progress']");
	
	public static void selectMediaLib(String value) throws Exception {
		WebElement element = KeywordUtil.getDriver().findElement(click_select_xpath);

		Select streem = new Select(element);
		streem.selectByVisibleText(value);
		KeywordUtil.delay(3000);
		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Category selected from the dropdown"));

	}
	public static void randomFileupload() throws AWTException, InterruptedException{
		/*KeywordUtil.delay(3000);
		Actions action = new Actions(KeywordUtil.getDriver());
		action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();*/
		KeywordUtil.hoverOnElement(AddMedia.click_on_browse);
		KeywordUtil.click(AddMedia.click_on_browse,"Click to choose file");
		KeywordUtil.delay(1000);
		Random rand = new Random();

		int rand_int = rand.nextInt(10);
		System.out.println("Random Integers: " + rand_int);

		FileUploadingRobotClass.uploadfile("src\\test\\resources\\testData\\ImageFiles\\img"+rand_int+".jpg");
		KeywordUtil.delay(4000);
	}
public static WebElement waitForDisplay(By Locator) throws InterruptedException{
		
		//KeywordUtil.delay(7000);
	WebDriverWait wait = new WebDriverWait(KeywordUtil.getDriver(), 10);
	wait.ignoring(ElementNotVisibleException.class);
	wait.ignoring(WebDriverException.class);
	

	return wait.until(ExpectedConditions.elementToBeClickable(Locator));
	}
	}



