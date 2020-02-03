package CustomerPortalStepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AFBAMemberPortalLoginPage;
import utilities.TestBase;

public class AFBAMemberPortalAccountLoginStepDef extends TestBase {

	@Given("Accout Login page get title")
	public void accout_Login_page_get_title() {
		String title = AFBAMemberPortalLoginPage.AccountLogin.getText();
		System.out.println(title + " page: "+ "\n");
	}

	
	@When("Click Register Here button")
	public void click_Register_Here_button() {
		AFBAMemberPortalLoginPage.RegisterHere.click();
		act.pause(2000).perform();
	}
	

	@Then("Get text of This is AFBA TEST System, If you are a AFBA Member, Please use following url for Production webside")
	public void get_text_of_This_is_AFBA_TEST_System_If_you_are_a_AFBA_Member_Please_use_following_url_for_Production_webside() {
		System.out.println(AFBAMemberPortalLoginPage.ContactAFBAText.getText());
		act.pause(1000).perform();
	}
	
	
	@Then("Get the title of Register with AFBA")
	public void get_the_title_of_Register_with_AFBA() {
		String title = AFBAMemberPortalLoginPage.RegisterWithAFBA.getText();
		System.out.println(title);
		act.pause(1000).perform();
	}

	@Then("Input First Name, Last Name, SSN, DOB, Email, Password and Confirm Password")
	public void input_First_Name_Last_Name_SSN_DOB_Email_Password_and_Confirm_Password() {
		String st = AFBAMemberPortalLoginPage.GetTextOfFirstName.getText();
		AFBAMemberPortalLoginPage.FirstName.sendKeys("AARON");
		System.out.println(st + ": AARON");
		act.pause(1000).perform();
		
		String st2 = AFBAMemberPortalLoginPage.GetTextOfLastName.getText();
		AFBAMemberPortalLoginPage.LastName.sendKeys("DAVIS");
		System.out.println(st2 + ": DAVIS");
		act.pause(1000).perform();
		
		String st3 = AFBAMemberPortalLoginPage.GetTextOfSSN.getText();
		AFBAMemberPortalLoginPage.SSN.sendKeys("401530001");
		System.out.println(st3 + ": 401530001");
		act.pause(1000).perform();
		
		String st4 = AFBAMemberPortalLoginPage.GetTextOfDOB.getText();
		AFBAMemberPortalLoginPage.DOB.click();
		AFBAMemberPortalLoginPage.DOB.sendKeys("08051978");
		System.out.println(st4 + ": 8/5/1978");
		act.pause(1000).perform();
		
		String st5 = AFBAMemberPortalLoginPage.GetTextOfEmail.getText();
		AFBAMemberPortalLoginPage.Email.sendKeys("qapeep19@gmail.com");
		System.out.println(st5 + ": qapeep19@gmail.com");
		act.pause(1000).perform();
		
		String st6 = AFBAMemberPortalLoginPage.GetTextOfPassword.getText();
		AFBAMemberPortalLoginPage.Password.click();
		AFBAMemberPortalLoginPage.Password.sendKeys("M@12345");
		System.out.println(st6 +": ********");
		act.pause(2000).perform();
		
		String st7 = AFBAMemberPortalLoginPage.GetTextOfConfirmPassword.getText();
		AFBAMemberPortalLoginPage.ConfirmPassword.click();
		AFBAMemberPortalLoginPage.ConfirmPassword.sendKeys("M@12345");
		System.out.println(st7 +": ******");
		act.pause(1000).perform();
	}
	
	@Then("Get the second text of This is AFBA TEST System, If you are a AFBA Member, Please use following url for Production webside")
	public void get_the_second_text_of_This_is_AFBA_TEST_System_If_you_are_a_AFBA_Member_Please_use_following_url_for_Production_webside() {
		System.out.println(AFBAMemberPortalLoginPage.getTextOnButton.getText() + "\n");
		act.pause(2000).perform();
	}

	
	@Then("Get the text of Contact AFBA Customer Service Hours, Toll-free, Local, Address")
	public void get_the_text_of_Contact_AFBA_Customer_Service_Hours_Toll_free_Local_Address() {
		String str = AFBAMemberPortalLoginPage.ContactAFBA.getText();
		System.out.println(str + "\n");
		act.pause(2000).perform();
	    
	}

	@Then("Click here to complete Email form")
	public void click_here_to_complete_Email_form() {
		AFBAMemberPortalLoginPage.EmailClick.click();
		act.pause(1000).perform();
	}

	@Then("Select Subject, name, SSN or Policy number, Email Address, phone number and Message")
	public void select_Subject_name_SSN_or_Policy_number_Email_Address_phone_number_and_Message() {
		String str = AFBAMemberPortalLoginPage.ContactUs.getText();
		System.out.println(str + " Page:" + "\n");
		act.pause(1000).perform();
		
		String st = AFBAMemberPortalLoginPage.GetTextOfSubject.getText();
		AFBAMemberPortalLoginPage.ClickSubject.click();
		System.out.println(st + ": Life Insurance");
		act.pause(1000).perform();
		AFBAMemberPortalLoginPage.SubjectSelectLifeInsurance.click();
		
		String st1 = AFBAMemberPortalLoginPage.GetTextOFName.getText();
		AFBAMemberPortalLoginPage.Name.sendKeys("AARON DAVIS");
		System.out.println(st1+": AARON DAVIS");
		act.pause(1000).perform();
		
		String st2 = AFBAMemberPortalLoginPage.GetTextOfSN.getText();
		AFBAMemberPortalLoginPage.SSNorPolicyNumber.click();
		AFBAMemberPortalLoginPage.SSNorPolicyNumber.sendKeys("545102002");
		System.out.println(st2+": *******");
		act.pause(1000).perform();
		
		String st3 = AFBAMemberPortalLoginPage.GetTextOfEmailAddress.getText();
		AFBAMemberPortalLoginPage.EmailAddress.sendKeys("qapeep19@gmail.com");
		System.out.println(st3+": qapeep19@gmail.com");
		act.pause(1000).perform();
		
		String st4 = AFBAMemberPortalLoginPage.GetTextOfPhoneNumber.getText();
		AFBAMemberPortalLoginPage.PhoneNumber.click();
		AFBAMemberPortalLoginPage.PhoneNumber.sendKeys("7036541233");
		System.out.println(st4+": 7036541233");
		act.pause(1000).perform();
		
		String st5= AFBAMemberPortalLoginPage.GetTextOfMessage.getText();
		AFBAMemberPortalLoginPage.ClickMessage.click();
		AFBAMemberPortalLoginPage.ClickMessage.sendKeys("Message....");
		System.out.println(st5+": Message....");
		act.pause(1000).perform();
	}

	@Then("Click Submit button")
	public void click_Submit_button() {
		AFBAMemberPortalLoginPage.SubmitBtn.click();
		act.pause(2000).perform();
	}
	
	@Then("Get Text of Success Your Online Inquiry has been submitted. A representative will be in contact with you shortly")
	public void get_Text_of_Success_Your_Online_Inquiry_has_been_submitted_A_representative_will_be_in_contact_with_you_shortly() {
		String text = AFBAMemberPortalLoginPage.SuccessBox.getText();
		System.out.println("After click Submit : "+ text  + "\n");
		act.pause(2000).perform();
	}
	

	@Then("Nevigate back to Login page")
	public void nevigate_back_to_Login_page() {
		AFBAMemberPortalLoginPage.LoginBtn.click();
	    act.pause(2000).perform();
	}
	
	
	@Then("Click Forgot your password button")
	public void click_Forgot_your_password_button() {
		AFBAMemberPortalLoginPage.ForgotYourPassword.click();
		act.pause(1000).perform();
	}
	

	@Then("Get text of Forgot your password")
	public void get_text_of_Forgot_your_password() {
	  String s = AFBAMemberPortalLoginPage.ForgotYourUserNameText.getText();
	  System.out.println(s + " Page: " + "\n");
	  act.pause(1000).perform();
	}

	
	@Then("Input Username")
	public void input_Username() {
		AFBAMemberPortalLoginPage.UserName.sendKeys("qapeep19@gmail.com");
	}
	
	
	@Then("Click Submit button to submit Username")
	public void click_Submit_button_to_submit_Username() {
		AFBAMemberPortalLoginPage.ForgotYourPasswordSubmitBtn.click();
		act.pause(1000).perform();
	}
	

	@Then("Get text of Welcome to the AFBA member portal")
	public void get_text_of_Welcome_to_the_AFBA_member_portal() {
		String string = AFBAMemberPortalLoginPage.WelcomeText.getText();
		  System.out.println(string);
		String string1 = AFBAMemberPortalLoginPage.AFBAMemberPortalText.getText();
		  System.out.println(string1 + "\n");
		  act.pause(1000).perform();
	}
	

	@Then("Get text of An email has been sent to you with your temporary password")
	public void get_text_of_An_email_has_been_sent_to_you_with_your_temporary_password() {
		String str = AFBAMemberPortalLoginPage.AnEmailHasBeenSentText.getText();
		  System.out.println(str + "\n");
		  act.pause(1000).perform();
	}

	@Then("Click Go to Login Page button")
	public void click_Go_to_Login_Page_button() {
		AFBAMemberPortalLoginPage.GoToLoginPageClick.click();
		act.pause(2000).perform();
	}
	

	@Then("Click Help button")
	public void click_Help_button() {
		AFBAMemberPortalLoginPage.HelpBtn.click();
	}

	@Then("Get text of Frequently Asked Questions")
	public void get_text_of_Frequently_Asked_Questions() {
		String str = AFBAMemberPortalLoginPage.FrequenrlyAskedQuestionText.getText();
		  System.out.println(str + " Help Page: " + "\n");
		  act.pause(1000).perform();
	}

	@Then("Get all the text of How do I login to AFBA Member Portal explanations")
	public void get_all_the_text_of_How_do_I_login_to_AFBA_Member_Portal_explanations() {
		String str = AFBAMemberPortalLoginPage.HowToLoginText.getText();
		  System.out.println(str + "\n");
		  act.pause(1000).perform();
		  
		  String str1 = AFBAMemberPortalLoginPage.AFBAExplanations.getText();
		  System.out.println(str1 + "\n");
		  act.pause(1000).perform(); 
		  
		  String str2 = AFBAMemberPortalLoginPage.ToGainaccess.getText();
		  System.out.println(str2 + "\n");
		  act.pause(1000).perform();  
		  
		  String str3 = AFBAMemberPortalLoginPage.stepExplanation1.getText();
		  System.out.println(str3 + "\n");
		  act.pause(3000).perform(); 
		  
		  AFBAMemberPortalLoginPage.LoginClick1.click();
		  act.pause(2000).perform();
		  driver.navigate().to("https://afbafull-afba.cs93.force.com/MemberPortal/apex/FAQ");  
		  act.pause(3000).perform();
		  System.out.println("Varify AFBA Member Portal Login Page");
		  act.pause(4000).perform();
		  
		  
		  AFBAMemberPortalLoginPage.RegisterHereBtn.click();
		  act.pause(2000).perform();
		  driver.navigate().to("https://afbafull-afba.cs93.force.com/MemberPortal/apex/FAQ");    
		  act.pause(3000).perform();
		  System.out.println("Verify Register Page");
		 
	}
	
	@Then("Get all the text of I forgot my password. How do i reset it explanations")
	public void get_all_the_text_of_I_forgot_my_password_How_do_i_reset_it_explanations() {
		String str = AFBAMemberPortalLoginPage.ForgetPassword.getText();
		System.out.println(str + "\n");
		  act.pause(1000).perform();
		  
		  String str1 = AFBAMemberPortalLoginPage.IfYouHaveForgottenIxplanation.getText();
		  System.out.println(str1 + "\n");
		  act.pause(1000).perform(); 
		  
		  String str2 = AFBAMemberPortalLoginPage.ForgotPasswordExplanation.getText();
		  System.out.println(str2 + "\n");
		  act.pause(3000).perform();  
		  
		  AFBAMemberPortalLoginPage.LoginClick2.click();
		  driver.navigate().to("https://afbafull-afba.cs93.force.com/MemberPortal/apex/FAQ");    
		  act.pause(3000).perform();
		  System.out.println("Verify Login Page");

		  AFBAMemberPortalLoginPage.ForgetYourPassword.click();
		  act.pause(2000).perform();
		  driver.navigate().to("https://afbafull-afba.cs93.force.com/MemberPortal/apex/FAQ");    
		  act.pause(4000).perform();
		  System.out.println("Verify Forget Password Page");
		  
		  AFBAMemberPortalLoginPage.loginClick3.click();
		  act.pause(2000).perform();
		  driver.navigate().to("https://afbafull-afba.cs93.force.com/MemberPortal/apex/FAQ");    
		  act.pause(4000).perform();
		  System.out.println("Verify Login For Change Password");
		   
	}
	
	@Then("Get all the text of I forget my Username. what can i do explanations")
	public void get_all_the_text_of_I_forget_my_Username_what_can_i_do_explanations() {
		 String str = AFBAMemberPortalLoginPage.ForgetUserName.getText();
	    	System.out.println(str + "\n");
		  act.pause(1000).perform();
		  
		  String str1 = AFBAMemberPortalLoginPage.followstepForForgotenUserNameText.getText();
		  System.out.println(str1 + "\n");
		  act.pause(1000).perform(); 
		  
		  String str2 = AFBAMemberPortalLoginPage.ForgotUserNameExplanation.getText();
		  System.out.println(str2 + "\n");
		  act.pause(3000).perform();  
		  
		  AFBAMemberPortalLoginPage.loginClick4.click();
		  act.pause(2000).perform();
		  driver.navigate().to("https://afbafull-afba.cs93.force.com/MemberPortal/apex/FAQ");    
		  act.pause(4000).perform();
		  System.out.println("Verify Login For Forget Username");
		  
		  
		  AFBAMemberPortalLoginPage.ForgetYourUsername.click();
		  act.pause(2000).perform();
		  driver.navigate().to("https://afbafull-afba.cs93.force.com/MemberPortal/apex/FAQ");    
		  act.pause(4000).perform();
		  System.out.println("Verify Forget Username Page"); 
	}
	
	@Then("Get all the text of How can i receive my documents electronically explanations")
	public void get_all_the_text_of_How_can_i_receive_my_documents_electronically_explanations() {
		
		  String str = AFBAMemberPortalLoginPage.Edeliverytext.getText();
		  System.out.println(str + "\n");
		  act.pause(1000).perform();
		  
		  String str1 = AFBAMemberPortalLoginPage.ChooseExplanationForeDelivery.getText();
		  System.out.println(str1 + "\n");
		  act.pause(1000).perform(); 
		  
		  String str2 = AFBAMemberPortalLoginPage.eDeliveryStepsText.getText();
		  System.out.println(str2 + "\n");
		  act.pause(1000).perform();  
		  
		  String str3 = AFBAMemberPortalLoginPage.eDeliveryExplanation.getText();
		  System.out.println(str3 + "\n");
		  act.pause(3000).perform();  
		  
		  AFBAMemberPortalLoginPage.LoginClick5.click();
		  act.pause(2000).perform();
		  driver.navigate().to("https://afbafull-afba.cs93.force.com/MemberPortal/apex/FAQ");    
		  act.pause(4000).perform();
		  System.out.println("Verify eDelivery Login Page"); 
		  
		  
		  AFBAMemberPortalLoginPage.eDelivery.click();
		  act.pause(2000).perform();
		  driver.navigate().to("https://afbafull-afba.cs93.force.com/MemberPortal/apex/FAQ");    
		  act.pause(4000).perform();
		  System.out.println("Verify eDelivery Page"); 
		  act.pause(4000).perform();
		  
	}
	
//	@Then("Input Username and Password on Account Login Page")
//	public void input_Username_and_Password_on_Account_Login_Page() {
//		AFBAMemberPortalLoginPage.UserNameforLogin.sendKeys("qapeep512@gmail.com");
//		AFBAMemberPortalLoginPage.PasswordforLogin.click();
//		AFBAMemberPortalLoginPage.PasswordforLogin.sendKeys("Q85q2019");
//		
//	}
//
//	@Then("Click Login button")
//	public void click_Login_button() {
//		AFBAMemberPortalLoginPage.LoginBtnforLoginPage.click();
//		act.pause(2000).perform();
//	}

	}
