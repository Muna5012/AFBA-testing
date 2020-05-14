package utilities;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SalesforceFlashingPages.MemberLoginPage;
import SalesforceFlashingPages.SalesforceFlashingPage;
import cucumber.api.Scenario;
import pages.AllPagefactories;
import pages.ClaimsIntake;
import pages.LoginPage;
import pages.AFBAMemberPortalLoginPage;
import pages.AgentLoginPage;
import pages.RemoteLoginPage;

public abstract class TestBase {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Actions act;
	protected static JavascriptExecutor js;
	
	protected static void LogIn() {
		
		Assert.assertTrue(driver.getTitle().contains("Login"));
		LoginPage.email.sendKeys("MAbabaikeli@afba.com");
		LoginPage.password.sendKeys("Muna5012");	 
		LoginPage.loginBtn.click();
		act.pause(3000).perform();
	}
	
	protected static void RemoteLogIn() {
		Assert.assertTrue(driver.getTitle().contains("Login"));
		RemoteLoginPage.email.sendKeys("qapeep512@gmail.com");
		RemoteLoginPage.password.sendKeys("Muna@512");	 
		RemoteLoginPage.loginBtn.click();
		act.pause(2000).perform();
		RemoteLoginPage.EnrollmentCase.click();
		act.pause(1000).perform();
		RemoteLoginPage.searchSpace.sendKeys("IT_QA Automation Remote");
		RemoteLoginPage.SearchITQAAutomationRemote.click();
		RemoteLoginPage.NewEnrollement.click();
		act.pause(3000).perform();
	}
	
	protected static void ClaimsInTake() {	
		act.pause(2000).perform();
		ClaimsIntake.CNext.click();
		act.pause(2000).perform();	
	}
	
	protected static void CustomerPortal() {	
		MemberLoginPage.MemberLoginBtn.click();
		MemberLoginPage.UserName.sendKeys("qapeep512@gmail.com");
		MemberLoginPage.Password.sendKeys("Q85q2019");
		MemberLoginPage.LoginBtn.click();
		act.pause(3000).perform();
	}
	
	protected static void AgentLogin() {	
		AgentLoginPage.AgentLoginBtn.click();
		AgentLoginPage.InputUserName.sendKeys("rams.mallipeddi@gmail.com.eleanor");
		AgentLoginPage.InputPassword.sendKeys("Test12345");
		AgentLoginPage.LoginBtn.click();
		act.pause(3000).perform();
	}
	
	protected static void MemberPortal() {	
		AFBAMemberPortalLoginPage.AccountLogin.click();
		act.pause(3000).perform();
	}
	

	protected static void FlashingPage() {
		SalesforceFlashingPage.ContactsBtn.click();
		SalesforceFlashingPage.ViewSearch.click();
		SalesforceFlashingPage.ContactWithBalmastMobileOption.click();
		SalesforceFlashingPage.GoBtn.click();
		act.pause(3000).perform();	
	}
	
	protected static void SetUp() {
		driver=Driver.getDriver();
		driver.get(ConfigurationReader.getProperty("url9"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		
		// this is to run all page factories:
		new AllPagefactories();

	}
	
	protected static void TearDown(Scenario scenario) {
		if (scenario.isFailed()) 		
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		
			Driver.closeDriver();
			
	}

}