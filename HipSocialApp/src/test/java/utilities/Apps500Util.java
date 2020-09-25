package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class Apps500Util extends Apps500IframUtil {
	protected static By cardviewbutton = By.xpath("//button[@id='v-cards-id']");
	protected static By listviewbutton = By.xpath("//button[@id='v-table-id']");

	String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public static void verifyInsertedElementPresentInTable(int colindex, String text,
			String iftextisunderparententerparentelsechild) {

		switch (iftextisunderparententerparentelsechild) {
		case "parent":

			By locatorparent = By.xpath("//td[@aria-colindex='" + colindex + "'][text()='" + text + "']");
			WebDriverWait wait = new WebDriverWait(GlobalUtil.getDriver(), 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locatorparent));
			WebElement ele = GlobalUtil.getDriver().findElement(locatorparent);
			ele.isDisplayed();
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Element with text :" + text + " is Present in List "));

			break;

		case "child":
			By locatorchild = By.xpath("//td[@aria-colindex='" + colindex + "']//*[text()='" + text + "']");
			WebDriverWait wait1 = new WebDriverWait(GlobalUtil.getDriver(), 30);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorchild));
			WebElement elechild = GlobalUtil.getDriver().findElement(locatorchild);
			elechild.isDisplayed();
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Element with text : " + text + " is Present in List "));
			break;

		}

	}

	public static void clickOnEllipsisAndSelectOption(String iftextisunderparententerparentelsechild, String text,
			String Option) throws InterruptedException {

		switch (iftextisunderparententerparentelsechild) {
		case "parent":

			String ellispsislocpatent = "//*[text()='" + text
					+ "']//following-sibling::td//div[@icon='fal fa-ellipsis-h']";
			System.out.println(ellispsislocpatent);
			KeywordUtil.waitForVisible(By.xpath(ellispsislocpatent));
			WebElement ellicpsispa = GlobalUtil.getDriver().findElement(By.xpath(ellispsislocpatent));
			ellicpsispa.click();
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Sucessfully Clicked on ellipses"));
			String optionlocpa = "//*[text()='" + text + "']//following-sibling::td//span[text()='" + Option + "']";
			System.out.println(optionlocpa);
			KeywordUtil.waitForVisible(By.xpath(optionlocpa));
			WebElement selectoptionpa = GlobalUtil.getDriver().findElement(By.xpath(optionlocpa));
			selectoptionpa.click();
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Sucessfully Clicked " + Option + " Option"));
			if (Option == "Delete") {
				KeywordUtil.waitForInVisibile(By.xpath("//footer//button[text()=\"Delete\"]"));
				GlobalUtil.getDriver().findElement(By.xpath("//footer//button[text()=\"Delete\"]")).click();
				ExtendUtil.logger.log(LogStatus.PASS,
						HTMLReportUtil.passStringGreenColor("Sucessfully Clicked confirm " + Option + " Option"));
				KeywordUtil.delay(2500);
			}

			break;

		case "child":
			String ellispsislocchild = "//*[contains(text(),\"" + text
					+ "\")]//ancestor::td//following-sibling::td//div[@icon='fal fa-ellipsis-h']";
			KeywordUtil.waitForVisible(By.xpath(ellispsislocchild));
			WebElement ellicpsis = GlobalUtil.getDriver().findElement(By.xpath(ellispsislocchild));
			ellicpsis.click();
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Sucessfully Clicked on ellipses"));
			String optionloc = "//*[contains(text(),'" + text
					+ "')]//ancestor::td//following-sibling::td//span[text()='" + Option + "']";
			KeywordUtil.waitForVisible(By.xpath(optionloc));
			WebElement selectoption = GlobalUtil.getDriver().findElement(By.xpath(optionloc));
			selectoption.click();
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Sucessfully clicked " + Option + "Option"));
			if (Option == "Delete") {
				KeywordUtil.waitForInVisibile(By.xpath("//footer//button[text()=\"Delete\"]"));
				GlobalUtil.getDriver().findElement(By.xpath("//footer//button[text()=\"Delete\"]")).click();
				ExtendUtil.logger.log(LogStatus.PASS,
						HTMLReportUtil.passStringGreenColor("Sucessfully Clicked confirm " + Option + " Option"));
				KeywordUtil.delay(2500);
			}
			if (Option == "Archive") {
				KeywordUtil.delay(500);
				KeywordUtil.waitForVisible(By.xpath("//button[text()=\"Ok\"]"));
				GlobalUtil.getDriver().findElement(By.xpath("//button[text()=\"Ok\"]")).click();
				ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil
						.passStringGreenColor("Sucessfully Clicked ok to " + Option + " Archive Project"));
				KeywordUtil.delay(2500);
			}
			if (Option == "Restore") {
				KeywordUtil.waitForVisible(By.xpath("//button[text()=\"Ok\"]"));
				GlobalUtil.getDriver().findElement(By.xpath("//button[text()=\"Ok\"]")).click();
				ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil
						.passStringGreenColor("Sucessfully Clicked ok to " + Option + "the Project"));
				KeywordUtil.delay(2500);
			}

			break;

		}
	}

	public static void assertTosterMessage(String expectedMessage) throws InterruptedException {

		// SoftAssert assert1 = new SoftAssert();
		Assert.assertEquals(KeywordUtil.tosterMessageSubText(), expectedMessage);

		ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil
				.passStringGreenColor("ActualText found in Alert was : " + KeywordUtil.tosterMessageSubText()));
		KeywordUtil.waitUntilTosterMessageDisappear();
		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Actual Message Text Matched to Expected Text Message "));
	//eywordUtil.delay(3000);
	}

	public static String selectColours(String color) {

		switch (color) {
		case "yellow":
			return color = "rgb(255, 208, 54);";
		case "black":

			return color = "rgb(44, 57, 73);";
		case "skyblue":
			return color = "rgb(56, 157, 223);";

		}
		return color;
	}

	public static void switchToGridView() throws InterruptedException {
		KeywordUtil.click(cardviewbutton, "Switch Grid view icon");
		KeywordUtil.delay(1500);
	}

	public static void switchToListView() throws InterruptedException {
		KeywordUtil.click(listviewbutton, "Switch to List View");
	}

	public static boolean verifyInsertedObjectPresentinGridView(String gridViewtagName, String texttobeverified) {

		By loc = By.xpath("//" + gridViewtagName + "[contains(text(),'" + texttobeverified + "')]");
		boolean ispresent = find(loc).isDisplayed();

		if (ispresent) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil
					.passStringGreenColor("Object is present In the Grid View With Text : " + texttobeverified));
			return true;
		} else

		{
			ExtendUtil.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor(
					"Object was not found in the Grid View which was with Text : " + texttobeverified));
			return false;
		}

	}

	public static boolean verifyInsertedObjectPresentinlistView(String listViewtagName, String texttobeverified) {

		By loc = By.xpath("//" + listViewtagName + "[contains(text(),'" + texttobeverified + "')]");
		List<WebElement> ele = getDriver().findElements(loc);
		int size = ele.size();

		if (size > 0) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil
					.passStringGreenColor("Object is present In the List View With Text : " + texttobeverified));
			return true;
		} else

		{
			ExtendUtil.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor(
					" Object was not found in the list View which was with Text : " + texttobeverified));
			return false;
		}

	}
	public static boolean verifyInsertedObjectNotPresentinlistView(String listViewtagName, String texttobeverified) {

		By loc = By.xpath("//" + listViewtagName + "[contains(text(),'" + texttobeverified + "')]");
		List<WebElement> ele = getDriver().findElements(loc);
		int size = ele.size();

		if (size <= 0) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil
					.passStringGreenColor(" Object was not found in the list View which was with Text : " + texttobeverified));
			return true;
		} else

		{
			ExtendUtil.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor(
					"Object is present In the List View With Text : " + texttobeverified));
			return false;
		}

	}
	
	protected static void selectfromDropdownfiledsa(String fieldtext, String enterthenametobeselected)
			throws InterruptedException {

		By select = By.xpath("//div//label[contains(text(),\"" + fieldtext + "\")]//following-sibling::div");
		KeywordUtil.click(select, "Clicked on " + fieldtext);
		By name = By.xpath("//label[contains(text(),\"" + fieldtext + "\")]//parent::div//descendant::li//a[text()=\""
				+ enterthenametobeselected + "\"]");
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(name));
		if (find(name).isDisplayed()) {
			KeywordUtil.action().moveToElement(find(name)).click().build().perform();
		}
		KeywordUtil.delay(200);
	}

	public static By locatorDynamicContainsText(String tag,String text) {
		System.out.println("//"+tag+"[contains(text(),\""+text+"\")]");
		return By.xpath("//"+tag+"[contains(text(),\""+text+"\")]");
		
	}
	
}
