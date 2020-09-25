package com.HipsocialPages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtendUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

public class HipsocialCategoriesPage {
	public static By Click_Streams_Xpath = By.xpath("//span[text()='Streams']");
	public static By Click_Bars_Xpath = By.xpath("//i[@class='fal fa-bars']");
	public static By Click_Categories_Xpath = By.xpath("//div[text()='Categories']");
	public static By EnterName_Css = By.cssSelector("input[placeholder='Enter Name']");
	public static By Click_Save_Xpath = By.xpath("//h5[text()='Add Category']//following::div[14]/button[1]");
	// -----------------------------Edit
	// Category---------------------------------------------------------------//
	public static By Click_Dots_Xpath = By.xpath("(//i[@class='fal fa-ellipsis-h'])[1]");
	public static By Click_Edit_Xpath = By.xpath("(//span[text()='Edit'])[1]");
	public static By InsrtedSuccessfully_toaste_Xpath = By.xpath("//p[text()='Inserted Successfully']");
	public static By MouseHovrCategeory_Xpath = By.xpath("(//div[@class='p-0 py-1 ml-2'])[1]");
	public static By Edit_Categorie_Xpath = By.xpath("//input[@placeholder='Enter Name']");
	public static By Click_Update_Xpath = By.xpath("//button[text()='Update']");
	public static By UpdatedSuccessfully_toaste_Xpath = By.xpath("//p[text()='Updated Sucessfully']");
	// ---------------------------Delete
	// Category---------------------------------------------------------------//
	public static By DeleteDropDown_Category_Xpath = By.xpath("(//i[@class='fal fa-ellipsis-h'])[1]//following::span[2]");
	public static By DeleteButton_Xpath = By.xpath("//h3[@class='delete-text']//following::button[2]");
	public static By DeleteSuccess_toaste_Xpath = By.xpath("//p[text()='Deleted Successfully']");

	public static void toasteMessageDisplay() throws Exception {
		KeywordUtil.waitForVisible(HipsocialCategoriesPage.InsrtedSuccessfully_toaste_Xpath);
		String toasteMessage = KeywordUtil.getDriver()
				.findElement(HipsocialCategoriesPage.InsrtedSuccessfully_toaste_Xpath).getText();
		System.out.println("Toaste message displayed is -->" + toasteMessage);

		String expected = "Inserted Successfully";
		Assert.assertEquals(toasteMessage, expected);
		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Toaste message displayed is :" + toasteMessage));
		KeywordUtil.delay(3000);
	}

	public static void mouseHoveraction() {
		Actions act = new Actions(KeywordUtil.getDriver());
		act.moveToElement(KeywordUtil.getDriver().findElement(HipsocialCategoriesPage.MouseHovrCategeory_Xpath))
				.perform();
	}

	public static void toasteUpdateMessageDisplay() throws InterruptedException {

		KeywordUtil.waitForVisible(HipsocialCategoriesPage.UpdatedSuccessfully_toaste_Xpath);
		String toasteMessage = KeywordUtil.getDriver()
				.findElement(HipsocialCategoriesPage.UpdatedSuccessfully_toaste_Xpath).getText();
		System.out.println("Toaste message displayed is -->" + toasteMessage);
		String expected = "Updated Sucessfully";
		Assert.assertEquals(toasteMessage, expected);

		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Toaste message displayed is :" + toasteMessage));
		KeywordUtil.delay(3000);
	}

	public static void toasteDeleteMessageDisplay() throws InterruptedException {
		KeywordUtil.waitForVisible(HipsocialCategoriesPage.DeleteSuccess_toaste_Xpath);
		String toasteMessage = KeywordUtil.getDriver().findElement(HipsocialCategoriesPage.DeleteSuccess_toaste_Xpath)
				.getText();
		System.out.println("Toaste message displayed is -->" + toasteMessage);
		String expected = "Deleted Successfully";
		Assert.assertEquals(toasteMessage, expected);
		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Toaste message displayed is :" + toasteMessage));
		KeywordUtil.delay(3000);
	}

}