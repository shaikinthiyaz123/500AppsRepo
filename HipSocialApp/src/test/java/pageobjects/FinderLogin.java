package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains web elements related login page
 * 
 * @author shaik.inityaz@500apps.com
 * 
 *
 */
public class FinderLogin extends BaseClass {
	public FinderLogin(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='user']")
	public static WebElement Email;
	@FindBy(how = How.XPATH, using = "//input[@id='pass']")
	public static WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[text()='LOGIN']")
	public static WebElement Login_Button;

}
