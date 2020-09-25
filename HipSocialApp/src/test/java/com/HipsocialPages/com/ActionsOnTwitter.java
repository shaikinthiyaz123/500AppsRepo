package com.HipsocialPages.com;

import org.openqa.selenium.By;

public class ActionsOnTwitter {
	//public static By Click_Reply_Xpath = By.xpath("(//div[@class='ac-card-collection card d-flex flex-column ']//div//following::div[11]//p//following::span//span)[1]");
	public static By Click_Reply_Xpath= By.xpath("(//span[@data-original-title='Reply']/i)[1]");
	public static By Enter_ReplyText_Xpath= By.xpath("(//textarea[@id='exampleFormControlTextarea1'])[2]");
	public static By Click_ReplySend_Xpath= By.xpath("//button[@id='reply_button' and text()='Send']");
	public static By Click_Retweet_Xpath= By.xpath("(//i[@data-original-title='Retweet'])[1]");
	public static By Retweet_count= By.xpath("(//span[@class='mr-3 small text-muted'])[1]");
	public static By Click_DisLike_Tweet_Xpath= By.xpath("(//i[@data-original-title='Undo like'])[1]");
	public static By Click_Like_Tweet_Xpath= By.xpath("(//i[@class='fal fa-heart text-muted mr-3'])[1]");
	public static By Click_UnFollow_Xpath= By.xpath("(//i[@id='unfollow'])[1]");
	public static By Click_Follow_Xpath= By.xpath("(//i[@id='Follow'])[1]");

	public static By like_tooltip_xpath=  By.xpath("//div[@class='tooltip-inner']");


}
