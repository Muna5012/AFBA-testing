package stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoogleLoginPage;
import utilities.TestBase;

public class GoogleLoginStepDef extends TestBase {
	@When("Click Sign in button to login Email account")
	public void click_Sign_in_button_to_login_Email_account() {
	  driver.get("https://www.google.com");
	  GoogleLoginPage.SignIn.click();  
	}

	@Then("Input Email address and click Next button")
	public void input_Email_address_and_click_Next_button() {
		GoogleLoginPage.InputEmail.sendKeys("qapeep512@gmail.com");
		GoogleLoginPage.Next.click();	
		act.pause(2000).perform();
	}

	@Then("Input Email password to click Next button")
	public void input_Email_password_to_click_Next_button() {
		GoogleLoginPage.InputPassword.sendKeys("Muna@5012");
		GoogleLoginPage.Next.click();
		act.pause(3000).perform();
	}

	@Then("Click InBox and Select first Email")
	public void click_InBox_and_Select_first_Email() {
	
		GoogleLoginPage.ClickEmail.click(); 
		 act.pause(4000).perform();
 
	     
		GoogleLoginPage.ClickInbox.click();
		GoogleLoginPage.SelectFirstEmail.click();
	}

	@Then("Click Review Application Button")
	public void click_Review_Application_Button() {
		act.pause(2000).perform();
		GoogleLoginPage.ReviewApplicationBtn.click();
	}
	
	@Then("Input LastName and Last four SSN number")
	public void input_LastName_and_Last_four_SSN_number() {
		act.pause(2000).perform();
		java.util.Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String handle1 : driver.getWindowHandles()) {
               System.out.println(handle1);
               driver.switchTo().window(handle1);
        }
		GoogleLoginPage.LastName.sendKeys("Holt");
		GoogleLoginPage.LastSSN.sendKeys("0193");
	}


	@Then("Click Review and Sign my Application button")
	public void click_Review_and_Sign_my_Application_button() {
		GoogleLoginPage.ReviewAndSignMyApplication.click();
		act.pause(3000).perform();
	}
	

	@Then("Click Review Application Ducuments Button to review all the application")
	public void click_Review_Application_Ducuments_Button_to_review_all_the_application() {
		GoogleLoginPage.ReviewApplicationDocumentBtn.click();
		   act.pause(6000).perform();
		   GoogleLoginPage.CloseBtn.click();
		   act.pause(2000).perform();
	}
	
	@Then("Input Sponsor LastName")
	public void input_Sponsor_LastName() {
		GoogleLoginPage.SponsorLastName.click();	
		GoogleLoginPage.SponsorLastName.sendKeys("Holt");
	}

	@Then("Input Sponsor last four SSN numbers")
	public void input_Sponsor_last_four_SSN_numbers() {
		GoogleLoginPage.SponsorLastSSN.click();
		GoogleLoginPage.SponsorLastSSN.sendKeys("0193");
	}

	@Then("Select Paper Option for receive the Documents")
	public void select_Paper_Option_for_receive_the_Documents() {
		GoogleLoginPage.PaperBtn.click();
		act.pause(2000).perform();
		GoogleLoginPage.SignBtn.click();
	}


}
