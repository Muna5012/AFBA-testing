package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import pages.Remote;
import utilities.TestBase;

public class EAppRemote4 extends TestBase {

	@When("Click New Enrollment button Enter Sponsor SSN, Enrollment City and Enrollment State")
	public void click_New_Enrollment_button_Enter_Sponsor_SSN_Enrollment_City_and_Enrollment_State() {
		  Remote.SSN.click();
		  Remote.SSN.sendKeys("414000024");
		  Remote.EnrollmentCity.clear();
		  Remote.EnrollmentCity.sendKeys("Thurmont");
		  Remote.EnrollmentState.click();
		  Remote.MD.click();
		  act.pause(2000).perform();
	}

	@Then("click Next button and Select Begin Enrollment button")
	public void click_Next_button_and_Select_Begin_Enrollment_button() {
			Remote.NextBtn.click();
		 //   Remote.BeginEnrollment.click();
			Remote.ClickNewSponsor.click();
			act.pause(2000).perform();
	}

	@Then("Input Sponsor First Name, Last Name, gender and DateOfBirth")
	public void input_Sponsor_First_Name_Last_Name_gender_and_DateOfBirth() {
		    Remote.FirstName.sendKeys("Pallo");
		    Remote.LastName.sendKeys("Rojas");
		    Remote.DOB.click();
		    act.pause(1000).perform();
		    Remote.DOB.sendKeys("10201969");
		    Remote.GenderMale.click();   
		    act.pause(2000).perform();
	}

	@Then("Click Married Radio button and enter spouse First Name, Last Name and DateOfBirth")
	public void click_Married_Radio_button_and_enter_spouse_First_Name_Last_Name_and_DateOfBirth() {
		Remote.MarriedBtn.click();
	    Remote.SpouseFN.sendKeys("Andres");
	    Remote.SpouseLN.sendKeys("Rojas");
	    act.pause(1000).perform();
	    Remote.SpouseDOB.click();
	    Remote.SpouseDOB.sendKeys("10201969");
	}

	@Then("Select ESP on Eligibility, select Checkmatic on Contribution Mode")
	public void select_ESP_on_Eligibility_select_Checkmatic_on_Contribution_Mode() {
		   Remote.ESP.click();
		   act.pause(1000).perform();
		   Remote.Checkmatic.click();
		   act.pause(1000).perform();
	}

	@Then("Enter Street Address, City, State and ZipCode")
	public void enter_Street_Address_City_State_and_ZipCode() {
			Remote.Street.sendKeys("Bayview Shores");
		    Remote.Street2.sendKeys("Apt 4");
		    Remote.City.sendKeys("Portland");
		    Remote.State.sendKeys("Oregon");
		    Remote.State.sendKeys(Keys.ENTER);
		    Remote.ZipCode.click();
		    Remote.ZipCode.sendKeys("97035");
	}

	@Then("Enter Email address, Daytime phone numbers")
	public void enter_Email_address_Daytime_phone_numbers() {
		Remote.Phone.click();
	    Remote.Phone.sendKeys("7037065961");
	    act.pause(3000).perform();
	}

	@Then("Click Show Coverage Option to select sponsor and spouse beneficiary plans")
	public void click_Show_Coverage_Option_to_select_sponsor_and_spouse_beneficiary_plans() {
		  Remote.ShowCoverageOptions.click();
	}

	@Then("Better Alternative select Tobacco for Sponsor and select Option One")
	public void better_Alternative_select_Tobacco_for_Sponsor_and_select_Option_One() {
		Remote.TobaccoforSponsor.click();
		act.pause(1000).perform();
		Remote.SeniorProtectOption1.click();
		act.pause(2000).perform();
	}
	
	@Then("Waived FedTerm and Application Member Benefit five thousand k Products")
	public void waived_FedTerm_and_Application_Member_Benefit_five_thousand_k_Products() {
		 Remote.FedTerm.click();
		   Remote.WaiveFedTerm.click();
		   act.pause(2000).perform();
		   Remote.ApplicationMemberBenf.click();
		   Remote.WaiveApplication.click();
		   act.pause(2000).perform();
	}

	@Then("Senior Protect Product select Option two")
	public void senior_Protect_Product_select_Option_two() {
		Remote.SeniorProtect.click();
		Remote.SeniorProtectOption2.click();
		act.pause(2000).perform();
	}


	@Then("First Protect select Option two")
	public void first_Protect_select_Option_two() {
		Remote.FirstProtect.click();
		Remote.SeniorProtectOption2.click();
		act.pause(2000).perform();
		 Remote.NextBtn2.click();
	}

	@Then("Qualification page Answer all the questions")
	public void qualification_page_Answer_all_the_questions() {
		EApp2.AnswerNOAll.click();
		act.pause(2000).perform();
//		Remote.OISponsor1.click();
//	    Remote.OISponsor2.click();
//	    Remote.BASponsor1.click();
//	    Remote.BASponsor2.click();
//	    Remote.BASponsor3.click();
//	    Remote.BASponsor4.click();
//	    Remote.BASponsor5.click();
//	    Remote.BASponsor6.click();
//	    Remote.BASponsor7.click();
//	    act.pause(1000).perform();
//	    Remote.SeniorProtectSponsor1.click();
//	    Remote.SeniorProtectSponsor2.click();
//	    Remote.SeniorProtectSponsor3.click();
//	    Remote.SeniorProtectSponsor4.click();
//	    Remote.SeniorProtectSponsor5.click();
//    //  Remote.SeniorProtectSponsor6.click();
//	    Remote.FirstProtectSponsor1.click();
//	    Remote.FirstProtectSponsor2.click();
//	    Remote.FirstProtectSponsor3.click();
//	    Remote.FirstProtectSponsor4.click();
//	    Remote.FirstProtectSponsor5.click();
//	    Remote.FirstProtectSponsor6.click();
//	    Remote.FirstProtectSponsor8.click();
//	    act.pause(1000).perform();
//	    Remote.OISpouse1.click();
//	    Remote.OISpouse2.click();
//	    Remote.BASpouse1.click();
//	    Remote.BASpouse2.click();
//	    Remote.BASpouse3.click();
//	    Remote.BASpouse4.click();
//	    Remote.BASpouse5.click();
//	    Remote.BASpouse6.click();
//	    Remote.BASpouse7.click();
//	    act.pause(1000).perform();
//	    Remote.SeniorProtectSpouse1.click();
//	    Remote.SeniorProtectSpouse2.click();
//	    Remote.SeniorProtectSpouse3.click();
//	    Remote.SeniorProtectSpouse4.click();
//	    Remote.SeniorProtectSpouse5.click();
////	    Remote.SeniorProtectSpouse6.click();
//	    act.pause(1000).perform();
//	    Remote.FirstProtectSpouse1.click();
//	    Remote.FirstProtectSpouse2.click();
//	    Remote.FirstProtectSpouse3.click();
//	    Remote.FirstProtectSpouse4.click();
//	    Remote.FirstProtectSpouse5.click();
//	    Remote.FirstProtectSpouse6.click();
//	    Remote.FirstProtectSpouse8.click();
	    act.pause(2000).perform();
	    Remote.NextBtn2.click();  
	}

	@Then("Enter Sponsor Information Height feet, inches and Weight")
	public void enter_Sponsor_Information_Height_feet_inches_and_Weight() {
		 Remote.Height5Feet.click();
		   Remote.Height9Inches.click();
		   Remote.Weight.sendKeys("184");
		   act.pause(2000).perform();
		   Remote.NextBtn2.click();
	}

	@Then("Enter Spouse Information SSN, gender, Height feet inches and Weight")
	public void enter_Spouse_Information_SSN_gender_Height_feet_inches_and_Weight() {
		Remote.SpouseSSN.click();
	    Remote.SpouseSSN.sendKeys("414000025");
	    Remote.SpouseGenderFamale.click();
	    Remote.Spouse5Feet.click();
	    Remote.Spouse5Inches.click();
	    Remote.SpouseWeight.sendKeys("160");
	    act.pause(2000).perform();
	    Remote.NextBtn2.click(); 
	}
	
	@Then("Better Alternative Sponsor Primary Beneficiary Full Name, Relationship")
	public void better_Alternative_Sponsor_Primary_Beneficiary_Full_Name_Relationship() {
		   Remote.BASponsorPrimarySomeOneElse.click();
		   Remote.PrimaryBenficiaryFullName.sendKeys("My Trust");
		   Remote.PrimaryRelationshipForTrust.click();
		   act.pause(1000).perform();
	}

	@Then("Better Alternative Sponsor Contingent Beneficiary Full Name, Relationship")
	public void better_Alternative_Sponsor_Contingent_Beneficiary_Full_Name_Relationship() {
		Remote.SomeoneElsee.click();
		Remote.ContingentBeneficiaryFullName.sendKeys("Sue Ewing");
		Remote.ContingentBeneficiaryRelationshipSister.click();
		  act.pause(1000).perform();
	}

	@Then("Better Alternative Spouse Primary Beneficiary Full Name, Relationship")
	public void better_Alternative_Spouse_Primary_Beneficiary_Full_Name_Relationship() {
		   Remote.SomeoneElseForSpousePrimary.click();
		   Remote.SpousePrimarytFN.sendKeys("My Estate");
		   Remote.SpousePrimaryRelationshipEstate.click();
		   act.pause(1000).perform();
	}

	@Then("Better Alternative Spouse Contingent Beneficiary Full Name, Relationship")
	public void better_Alternative_Spouse_Contingent_Beneficiary_Full_Name_Relationship() {
		   Remote.BASpouseContingentSomeOneElse.click();
		   Remote.SpouseContingentFN.sendKeys("JR Ewing");
		   Remote.SpouseContingentRelationshipBrother.click();
		   act.pause(1000).perform();
	}

	@Then("Senior Protect Sponsor Primary Beneficiary Full Name, Relationship")
	public void senior_Protect_Sponsor_Primary_Beneficiary_Full_Name_Relationship() {
		   Remote.SeniorProtectSponsorPrimaryBenifSomeoneElse.click();
		    Remote.SeniorProtectSponsorPrmaryBenFullName.sendKeys("Dolly Parton");
		    Remote.SeniorProtectSponsorPrimaryBenRelationshipEXspouse.click();
		    act.pause(1000).perform();
	}

	@Then("Senior Protect Sponsor Contingent Beneficiary Full Name, Relationship")
	public void senior_Protect_Sponsor_Contingent_Beneficiary_Full_Name_Relationship() {
		  Remote.SeniorProtectSponsorContingentSomeoneElse.click();
		  Remote.SeniorProtrctSponsorContingentFullName.sendKeys("Nina Simone");
		  Remote.SeniorProtrctSponsorContingentRelationshipAunt.click();
		  act.pause(1000).perform();
	}

	@Then("Senior Protect Spouse Primary Beneficiary Full Name, Relationship")
	public void senior_Protect_Spouse_Primary_Beneficiary_Full_Name_Relationship() {
		 Remote.SeniorProtectSpousePrimarySomeoneElse.click();
	      Remote.SeniorProtectSpousePrmaryBenFullName.sendKeys("Billie Holiday");
	      Remote.SeniorProtectSpousePrimaryBenRelationshipSister.click();
		  act.pause(1000).perform();
	}

	@Then("Senior Protect Spouse Contingent Beneficiary Full Name, Relationship")
	public void senior_Protect_Spouse_Contingent_Beneficiary_Full_Name_Relationship() {
		Remote.SeniorProtectSpouseContingentSomeoneElse.click();
	    Remote.SeniorProtectSpouseContingentFullName.sendKeys("Ella Fitzgerald");
	    Remote.SeniorProtectSpouseContingentRelationshipAunt.click();
	    act.pause(1000).perform();
	}

	@Then("First Protect Sponsor Primary Beneficiary Full Name, Relationship")
	public void first_Protect_Sponsor_Primary_Beneficiary_Full_Name_Relationship() {
		  Remote.FirstprotectSponsorPrimarySomeOneElse.click();
		  Remote.FirstProtectSponsorPrimaryFullName.sendKeys("Diana Krall");
		  Remote.FirstProtectSponsorPrimaryRelationshipSister.click();
		  act.pause(1000).perform();  
	}

	@Then("First Protect Sponsor Contingent Beneficiary Full Name, Relationship")
	public void first_Protect_Sponsor_Contingent_Beneficiary_Full_Name_Relationship() {
		    Remote.FirstProtectSponsorContingentSomeoneElse.click();
		    Remote.FirstProtectSponsorContingentFullName.sendKeys("Amy Winehouse");
		    Remote.FirstProtectSponsorContingentRelationshipGirlFriend.click();
		    act.pause(1000).perform();  

	}

	@Then("First Protect Spouse Primary Beneficiary Full Name, Relationship")
	public void first_Protect_Spouse_Primary_Beneficiary_Full_Name_Relationship() {
		   Remote.FirstprotectSpousePrimarySomeOneElse.click();
		   Remote.FirstProtectSpousePrimaryFullName.sendKeys("Sarah Vaughan");
		   Remote.FirstProtectSpousePrimaryRelationshipSister.click();
		   act.pause(1000).perform();  
	}

	@Then("First Protect Spouse Contingent Beneficiary Full Name, Relationship")
	public void first_Protect_Spouse_Contingent_Beneficiary_Full_Name_Relationship() {
		 Remote.FirstProtectSpouseContingentSomeoneElse.click();
		 Remote.FirstProtectSpouseContingentFullName.sendKeys("Norah Jones");
		 Remote.FirstProtectSpouseContingentRelationshipFatherBoyFriend.click();
		  act.pause(1000).perform();  
		 
	}

	@Then("Select Email Summary and input Email Address for Confirmation")
	public void select_Email_Summary_and_input_Email_Address_for_Confirmation() {
		    Remote.NextBtn6.click();
		    act.pause(2000).perform();
			Remote.EmailSummary1.click();
			act.pause(1000).perform();
			Remote.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
			Remote.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
			act.pause(1000).perform();
	}

	@Then("Select Day of Deducation And Account Type for Bank Information")
	public void select_Day_of_Deducation_And_Account_Type_for_Bank_Information() {
	     	Remote.DayOfDeduction1.click();
		    act.pause(1000).perform();
		    Remote.CheckingAccountType.click();
	}

	@Then("Input Routing Number, Account Number, Bank Name, City, State, Zip")
	public void input_Routing_Number_Account_Number_Bank_Name_City_State_Zip() {
		    Remote.RoutingNumber.click();
		    Remote.RoutingNumber.sendKeys("011103093");
		    Remote.AccountNumber.click();
		    Remote.AccountNumber.sendKeys("123423532");
		    Remote.BankName.sendKeys("TD Bank");
		    Remote.CityStateZip.sendKeys("Arlington, VA, 22205");
		    act.pause(2000).perform();
	}

	@Then("Select Signing via Email button and Input Email Address for routing application")
	public void select_Signing_via_Email_button_and_Input_Email_Address_for_routing_application() {
		  Remote.SiginingViaEmail.click();
		  act.pause(2000).perform();
		  Remote.EnterEmailOne.clear();
		  Remote.EnterEmailOne.sendKeys("qapeep512@gmail.com");
		  Remote.EnterEmailTwo.clear();
		  Remote.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
		  act.pause(1000).perform();
	}

	@Then("Click Sumbit and send email for signature button to submit it")
	public void click_Sumbit_and_send_email_for_signature_button_to_submit_it() {
		 Remote.SubmitEmailForsignatureBtn.click();
		  act.pause(9000).perform();  
	}
	
	@Then("Login Email Username and Password")
	public void login_Email_Username_and_Password() {
		 driver.get("https://www.google.com");
		 Remote.SignIn.click();  
		 Remote.InputEmail.sendKeys("qapeep512@gmail.com");
			Remote.NextButton.click();	
			act.pause(2000).perform();
			Remote.InputPassword.sendKeys("Muna@5012");
			Remote.NextButton.click();
			act.pause(4000).perform();
	}

	@Then("Select Inbox and check the Email")
	public void select_Inbox_and_check_the_Email() {
		Remote.ClickSelect.click();
		act.pause(1000).perform();
		Remote.ClickEmail.click();
		act.pause(2000).perform();
		//Remote.ClickInbox.click();
		Remote.SelectFirstEmail.click();
		act.pause(2000).perform();
	}

	@Then("Select Email from AFBA Enrollement and click Review Application on AFBA Enrollment")
	public void select_Email_from_AFBA_Enrollement_and_click_Review_Application_on_AFBA_Enrollment() {
		act.pause(2000).perform();
		Remote.ReviewApplicationBtn.click();
		act.pause(2000).perform();
		
		java.util.Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String handle1 : driver.getWindowHandles()) {
               System.out.println(handle1);
               driver.switchTo().window(handle1);
        }
	}

	@Then("Input sponsor lastName and Last four SSN")
	public void input_sponsor_lastName_and_Last_four_SSN() {
		Remote.LastNameforSponsor.sendKeys("Rojas");
		Remote.LastSSNforSponsor.sendKeys("0024");
	}

	@Then("Click review and sign my application button")
	public void click_review_and_sign_my_application_button() {
		Remote.ReviewAndSignMyApplication.click();
		act.pause(3000).perform();
	}

	@Then("Click review application ducuments button to review application")
	public void click_review_application_ducuments_button_to_review_application() {
		Remote.ReviewApplicationDocumentBtn.click();
		act.pause(9000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input Sponsor and spouse lastName and last four SSN numbers")
	public void input_Sponsor_and_spouse_lastName_and_last_four_SSN_numbers() {
		Remote.SponsorLastName.sendKeys("Rojass");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
	    Remote.SponsorLastName.clear();
		Remote.SponsorLastName.click();	
	    Remote.SponsorLastName.sendKeys("Rojas");
		Remote.SponsorLastSSN.sendKeys("0022");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
		Remote.SponsorLastSSN.clear();
		Remote.SponsorLastSSN.click();
		Remote.SponsorLastSSN.sendKeys("0024");
		act.pause(1000).perform();
		Remote.SpouseLastName.sendKeys("Rojas");
		Remote.SpouseLastSSN.click();
		Remote.SpouseLastSSN.sendKeys("0025");
	}

	@Then("Select Paper receive the Document radio button")
	public void select_Paper_receive_the_Document_radio_button() {
		Remote.PaperBtn.click();
		act.pause(2000).perform();
		Remote.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Navigate back to login AFBA Enrollment")
	public void navigate_back_to_login_AFBA_Enrollment() {
		driver.get("https://enroll-sandbox.afba.com/login");
		Remote.email.sendKeys("qapeep512@gmail.com");
		Remote.password.sendKeys("Muna@512");
		Remote.loginBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Access agent signing inbox button")
	public void click_Access_agent_signing_inbox_button() {
		Remote.AccessAgentSigningInbox.click();
		act.pause(2000).perform();
	}

	@Then("Sign the Application on Agent Inbox")
	public void sign_the_Application_on_Agent_Inbox() {
		Remote.SignButton.click();
		act.pause(2000).perform();
		Remote.ReviewApplicationDocumentBtn.click();
		act.pause(10000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
		Remote.Sign.click();
		act.pause(3000).perform();
	}

	




}
