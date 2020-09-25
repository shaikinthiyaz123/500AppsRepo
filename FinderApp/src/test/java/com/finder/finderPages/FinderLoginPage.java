package com.finder.finderPages;

import org.openqa.selenium.By;

/**
 * @author Shaik Inthiyaz
 * A class to maintain all the locators of 500apps  or FinderLoginPage
 *
 */
public class FinderLoginPage {
	public static By Email = By.xpath("//input[@id='user']");
	public static By Password = By.xpath("//input[@id='pass']");
	public static By Loginbtn = By.cssSelector("button[type='submit']");
	//public static By Loginbtn=By.xpath("//button[@class='btn w-100 submit-button mt-4 btn-primary py-3']");
	//public static By Loginbtn=By.xpath("//button[@class='btn w-100 submit-button mt-4 btn-primary py-3']");//div[text()='Welcome to 500apps']
	//public static By domainheader = By.cssSelector("div[class='col-6 font-weight-bold h4 pt-2 px-0']");
	//public static By domainheader = By.xpath("//div[text()='Welcome to 500apps']");
	public static By domainheader =By.xpath("//button[text()='My Apps']");

}
