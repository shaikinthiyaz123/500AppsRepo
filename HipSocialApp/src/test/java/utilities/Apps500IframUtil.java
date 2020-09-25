package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Apps500IframUtil extends GlobalUtil{

	public static void switchToIFrameInAddflowModule() {
		KeywordUtil.switchToFrame("messaging");
	}

	public static WebElement startDragableXpath() {
		return find(By.xpath(
				"//td[@title='Start']//ancestor::tr//ancestor::table//following-sibling::div//descendant::div[@class='circleChrome']"));
	}

	public static By sendMessageBaseXpath() {
		return By.xpath("//div[@id='toolbar']/div[1]//descendant::*[contains(text(),\"sendmessage\")]");
	}
	// div[@id='toolbar']//div[2]//descendant::*[contains(text(),"delay")]

	public static By delayBaseXpath() {
		return By.xpath("//div[@id='toolbar']//div[2]//descendant::*[contains(text(),\"delay\")]");
	}

	// div[@id='toolbar']//div[3]//descendant::*[contains(text(),"stopmessage")]

	public static By stopMessageBaseXpath() {
		return By.xpath("//div[@id='toolbar']//div[3]//descendant::*[contains(text(),\"stopmessage\")]");
	}

	public static WebElement createdMessageDropable(String Messagetitle) {
		return find(By.xpath("//td[@title='" + Messagetitle
				+ "']//ancestor::table[@class='nodeTable']//following-sibling::div//descendant::div[@class='circleChrome'][contains(@style,' rgb(255, 126, 0)')]"));
	}

	public static By createdMessageDragableReject(String Messagetitle) {

		return By.xpath("//td[@title='" + Messagetitle
				+ "']//ancestor::table[@class='nodeTable']//following-sibling::div//descendant::div[@class='circleChrome'][contains(@style,' rgb(216, 255, 0)')]//ancestor::div[contains(@style,'left: 24px;')]");
	}

	public static By createdMessageDragableAccept(String Messagetitle) {
		return By.xpath("//td[@title='" + Messagetitle
				+ "']//ancestor::table[@class='nodeTable']//following-sibling::div//descendant::div[@class='circleChrome'][contains(@style,' rgb(216, 255, 0)')]//ancestor::div[contains(@style,'left: 84px;')]");
	}
	// td[@title='delay']//ancestor::table[@class='nodeTable']//following-sibling::div//descendant::div[@class='circleChrome'][contains(@style,'rgb(255,
	// 126, 0)')]
//
	// td[@title='delay']//ancestor::table[@class='nodeTable']//following-sibling::div//descendant::div[@class='circleChrome'][contains(@style,'
	// rgb(255, 126, 0)')]

	public static WebElement createdDelayDrogAble(String delaytitle) {
		return find(By.xpath("//td[@title='" + delaytitle
				+ "']//ancestor::table[@class='nodeTable']//following-sibling::div//descendant::div[@class='circleChrome'][contains(@style,'rgb(210, 255, 1);')]"));
	}

	public static WebElement createdDelayDropAble(String delaytitle) {
		return find(By.xpath("//td[@title='" + delaytitle
				+ "']//ancestor::table[@class='nodeTable']//following-sibling::div//descendant::div[@class='circleChrome'][contains(@style,'rgb(255, 126, 0);')]"));
	}

	public static WebElement createdMeassageRejectDragAble(String messagetitle) {
		By list = By.xpath("//td[@title='" + messagetitle
				+ "']//ancestor::table[@class='nodeTable']//following-sibling::div//descendant::div[@class='circleChrome'][contains(@style,'rgb(216, 255, 0)')]");

		List<WebElement> elements = KeywordUtil.getListElements(list, "List of elements identified");
		System.out.println(elements.size());
		return elements.get(0);
	}
	public static WebElement createdMeassageAcceptDragAble(String messagetitle) {
		By list = By.xpath("//td[@title='" + messagetitle
				+ "']//ancestor::table[@class='nodeTable']//following-sibling::div//descendant::div[@class='circleChrome'][contains(@style,'rgb(216, 255, 0)')]");

		List<WebElement> elements = KeywordUtil.getListElements(list, "List of elements identified");
		System.out.println(elements.size());
		return elements.get(1);
	}

	public static void actiondragndrop(WebElement source, WebElement target) {
		KeywordUtil.action().dragAndDrop(source, target).build().perform();
	}

	public static WebElement find(By locator) {
		return GlobalUtil.getDriver().findElement(locator);
	}

	public static void dragNDrop(By from, By to) {
		KeywordUtil.action().moveToElement(find(from)).clickAndHold().moveToElement(find(to)).release(find(to))
				.build().perform();
	}

	public static void dragNDrop(WebElement from, WebElement to) {
		KeywordUtil.action().moveToElement(from).clickAndHold().moveToElement(to).release(to).build().perform();
	}

	public static void moveToElementAndClickAndHoldAanMoveOffset(String xpath, int xOffset, int yOffset) {
		WebElement ele = find(By.xpath(xpath));
		KeywordUtil.action().moveToElement(ele).clickAndHold().moveByOffset(xOffset, yOffset).release().build()
				.perform();
	}

	public static void addNewMessageToFrame(String messageName, int xOffset, int yOffset) throws InterruptedException {
		KeywordUtil.scrollingToElementofAPage(sendMessageBaseXpath(), "");
		KeywordUtil.doubleClick(sendMessageBaseXpath(), "Droping the New Message in frame");
		KeywordUtil.delay(1000);
		KeywordUtil.moveToElementAndClick(startDragableXpath());
		KeywordUtil.action().sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(messageName).sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		moveToElementAndClickAndHoldAanMoveOffset("//td[@title='" + messageName + "']", xOffset, yOffset);

		// KeywordUtil.delay(5000);

	}

	public static void addNewDelayToFrame(String delayName, String day, String mins, String sec, int xOffset,
			int yOffset) throws InterruptedException {
		KeywordUtil.scrollingToElementofAPage(delayBaseXpath(), "");
		KeywordUtil.doubleClick(delayBaseXpath(), "Droping the New Delay Message in frame");
		KeywordUtil.delay(2000);
		KeywordUtil.moveToElementAndClick(startDragableXpath());
		KeywordUtil.action().sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(delayName).sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB).sendKeys(day).sendKeys(Keys.TAB).sendKeys(mins).sendKeys(Keys.TAB).sendKeys(sec)
				.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		moveToElementAndClickAndHoldAanMoveOffset("//td[@title='" + delayName + "']", xOffset, yOffset);

	}

	public static void addNewStopToFrame(String stopName, int xOffset, int yOffset) throws InterruptedException {
		KeywordUtil.scrollingToElementofAPage(delayBaseXpath(), "");
		KeywordUtil.doubleClick(stopMessageBaseXpath(), "Droping the New Stop Message in frame");
		KeywordUtil.delay(2000);
		KeywordUtil.moveToElementAndClick(startDragableXpath());
		KeywordUtil.action().sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(stopName).sendKeys(Keys.TAB)
				.sendKeys(Keys.ENTER).build().perform();
		moveToElementAndClickAndHoldAanMoveOffset("//td[@title='" + stopName + "']", xOffset, yOffset);

	}

}
