package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.TestBase;

public class RemoteLoginPage extends TestBase {

	 @FindBy(xpath = "//input[@id='login']")
	    public static WebElement email;

	    @FindBy(xpath = "//input[@id='password']")
	    public static WebElement password;

	    @FindBy(xpath = "//button[@type='submit']")
	    public static WebElement loginBtn; 
	    
	    @FindBy(xpath = "//*[@class='btn btn-success btn-lg btn-enrollment']")
		public static WebElement EnrollmentCase;
		
		@FindBy(xpath = "//*[@type='search']")
		public static WebElement searchSpace;
		
		@FindBy(xpath="//*[@id='cases_table']/tbody/tr/td[1]")
		public static WebElement SearchITQAAutomationRemote;
		
		@FindBy(xpath = "//*[@id='add-to-census-btn']")
		public static WebElement NewEnrollement;
}
