package NGPStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class LoginPageVerify extends TestBase{
	
	@Given("Open NGP login page and get the URL of NGP tag")
	public void open_NGP_login_page_and_get_the_URL_of_NGP_tag() {
		 act.pause(1000).perform();
		 String str = NGPPayments.NGPPicture.getText();
		 System.out.println(str);
		 act.pause(2000).perform();
	}

	@When("Input username click Forget your password button")
	public void input_username_click_Forget_your_password_button() {
		NGPPayments.ForgetYourPassword.click();
		act.pause(3000).perform();
	}

	@Then("Get text of password forget notes")
	public void get_text_of_password_forget_notes() {
		 act.pause(1000).perform();
		 String str = NGPPayments.Passwordreset.getText();
		 System.out.println(str);
		 act.pause(2000).perform();
		 String str1 = NGPPayments.GetetxtOfPasswordreset.getText();
		 System.out.println(str1+ "\n");
		 act.pause(2000).perform();
	}

	@Then("Input User name")
	public void input_User_name() {
		NGPPayments.UsernameForgetpassword.sendKeys("mababaikeli@afba.com");
		act.pause(3000).perform();
	}

	@Then("Click Reset Password button")
	public void click_Reset_Password_button() {
		NGPPayments.ResetpasswordBtn.click();
		act.pause(3000).perform();
	}

	@Then("Get text of check Email message")
	public void get_text_of_check_Email_message() {
		 act.pause(1000).perform();
		 String str = NGPPayments.getTextOfCheckYourEmail.getText();
		 System.out.println(str);
		 act.pause(2000).perform();
		act.pause(1000).perform();
		 String str1 = NGPPayments.GetTextOfCheckEmail.getText();
		 System.out.println(str1);
		 act.pause(2000).perform();
	}

	@Then("click back to button button to login Username and Password")
	public void click_back_to_button_button_to_login_Username_and_Password() {
		NGPPayments.BacktoLogin.click();
		act.pause(3000).perform();
	}
	

}
