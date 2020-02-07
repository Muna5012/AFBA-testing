package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgentLoginPage {

	@FindBy(xpath="//*[contains(text(),'Agent Login')]")
	public static WebElement AgentLoginBtn;
	
	@FindBy(xpath="//*[@id='username']")
	public static WebElement InputUserName;
	
	@FindBy(xpath="//*[@id='password']")
	public static WebElement InputPassword;
	
	@FindBy(className = "btn")
	public static WebElement LoginBtn;
	
	@FindBy(xpath="//*[contains(text(),'Please')]")
	public static WebElement GetTextOfEnterYourUserName;
	
	@FindBy(xpath="//*[contains(text(),'Forgot your password?')]")
	public static WebElement ForgetPasswordBtn;
	
	@FindBy(className="mainTitle")
	public static WebElement GetTextOfForgetPassword;
	
	
}
