package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import pages.Remote;
import utilities.TestBase;

public class RemoteNewMembershipAppSponsorSpouse extends TestBase{

	@When("Input Sponsor SSN, Enrollment City and Enrollment State")
	public void input_Sponsor_SSN_Enrollment_City_and_Enrollment_State() {
	  Remote.SSN.click();
	  Remote.SSN.sendKeys("222222222");
	  Remote.EnrollmentCity.clear();
	  Remote.EnrollmentCity.sendKeys("Key West");
	  Remote.EnrollmentState.click();
	  Remote.FL.click();
	  act.pause(2000).perform();
	  
	}

	@When("click Next and click Begin Enrollment Btn")
	public void click_Next_and_click_Begin_Enrollment_Btn() {
	  Remote.NextBtn.click();
	  act.pause(2000).perform();
	  Remote.SSN.clear();
	  act.pause(1000).perform();
	  Remote.SSN.click();
	  Remote.SSN.sendKeys("656000028");
	  act.pause(2000).perform();
	  Remote.NextBtn.click();
	  act.pause(2000).perform();
 //     Remote.BeginEnrollment.click();
	  Remote.ClickNewSponsor.click();
	  act.pause(2000).perform();
	}

	@Then("Input Sponsor First Name, Last Name, Gender, DOB")
	public void input_Sponsor_First_Name_Last_Name_Gender_DOB() {
	    Remote.FirstName.sendKeys("TIKA");
	    Remote.LastName.sendKeys("ALBEK");
	    Remote.DOB.click();
	    act.pause(1000).perform();
	    Remote.DOB.sendKeys("06081984");
	    Remote.Gender.click();   
	    act.pause(2000).perform();
	}

	@Then("Click Married radio button and Input spouse information")
	public void click_Married_radio_button_and_Input_spouse_information() {
		Remote.MarriedBtn.click();
	    Remote.SpouseFN.sendKeys("Kim");
	    Remote.SpouseLN.sendKeys("ALBEK");
	    Remote.SpouseDOB.click();
	    act.pause(1000).perform();
	    Remote.SpouseDOB.sendKeys("10041969");
	}
	
	@Then("Select Military on Eligibility option, Army on Branch of Service, Active duty status,")
	public void select_Military_on_Eligibility_option_Army_on_Branch_of_Service_Active_duty_status() {
	   Remote.Military.click();
	   Remote.AirForce.click();
	   Remote.ActiveDuty.click();

	}

	@Then("Select O Seven on Rank, Millitary Allotment on Contribution Mode")
	public void select_O_Seven_on_Rank_Millitary_Allotment_on_Contribution_Mode() {
		Remote.O7.click();
		Remote.MilitaryAllotment.click();
		act.pause(2000).perform();
	}

	@Then("Enter Department_Code and Source_Code")
	public void enter_Department_Code_and_Source_Code() {
	    Remote.DepartmentCode.sendKeys("AutoTest");
	    Remote.SourceCode.sendKeys("IT2");
	}

	@Then("Input Street address, City, State and Zip")
	public void input_Street_address_City_State_and_Zip() {
	    Remote.Street.sendKeys("Bayview Shores");
	    Remote.Street2.sendKeys("Apt 1");
	    Remote.City.sendKeys("Pago Pago");
	    Remote.State.sendKeys("American Samoa");
	    Remote.State.sendKeys(Keys.ENTER);
	    Remote.ZipCode.click();
	    Remote.ZipCode.sendKeys("96799");
	}

	@Then("Input Email address and Daytime Phone Numbers")
	public void input_Email_address_and_Daytime_Phone_Numbers() {
		Remote.Phone.click();
	    Remote.Phone.sendKeys("7037065961");
	    act.pause(2000).perform();
	}

	@Then("Click Show Coverage Option to select beneficiaries plans")
	public void click_Show_Coverage_Option_to_select_beneficiaries_plans() {
	    Remote.ShowCoverageOptions.click();
	    act.pause(2000).perform();
	}
	
	@Then("Click Save for later button to Pause enrollment and Save data")
	public void click_Save_for_later_button_to_Pause_enrollment_and_Save_data() {
		 EApp2.ClickSaveForLater.click();
		 act.pause(3000).perform();
		 EApp2.ClickPauseEnrollementBtn.click();
		 act.pause(7000).perform();
	}
	
	@Then("Search the name and Resume Enrollment")
	public void search_the_name_and_Resume_Enrollment() {
		 EApp2.SearchCase.click();
		 EApp2.SearchCase.sendKeys("TIKA");
		 act.pause(1000).perform();
		 EApp2.ClickEnrollCase.click();
		 act.pause(2000).perform();
	}

	@Then("Select Better Alternative customize sponsor and spouse")
	public void select_Better_Alternative_customize_sponsor_and_spouse() {
	    act.pause(2000).perform();
	    Remote.BASponsorCustomize200.click();
	    act.pause(1000).perform();
	    Remote.BASpouseCustomize100.click();
	    act.pause(2000).perform();
	}

	@Then("Select FedTerm customize sponsor and spouse")
	public void select_FedTerm_customize_sponsor_and_spouse() {
	   Remote.FedTerm.click();
	   Remote.FedTermSponsorCustomize100.click();
	   Remote.FedTermSpouseCustomize100.click();
	   act.pause(2000).perform();
	}

	@Then("Waived Senior Protect")
	public void waived_Senior_Protect() {
	   Remote.SeniorProtect.click();
	   Remote.WaiveSeniorProtect.click();
	   act.pause(2000).perform();	   
	}
	
	@Then("Select group free to Covered and select Yes or no buttons")
	public void select_group_free_to_Covered_and_select_Yes_or_no_buttons() {
		Remote.ApplicationMemberBenf.click();
		act.pause(2000).perform();	 
		  EApp2.Covered.click();
		  act.pause(1000).perform();	 
//		  EApp2.YesForFirstQuestion.click();
//		  act.pause(1000).perform();
//		  EApp2.NoForSecondQuestion.click();
		  act.pause(2000).perform();
	}

	@Then("Waived First Protect")
	public void waived_First_Protect() {
	  Remote.FirstProtect.click();
	  Remote.WaiveFirstProtect.click();
	  act.pause(2000).perform();
	
	  act.pause(2000).perform();
	  Remote.NextBtn2.click();
	  act.pause(2000).perform();
	}

	@Then("Click Next to Answer All the questions")
	public void click_Next_to_Answer_All_the_questions() {
		EApp2.AnswerNOAll.click();
		act.pause(2000).perform();
//	    Remote.OISponsor1.click();
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
//	    Remote.SeniorProtectSponsor6.click();
//	    Remote.FirstProtectSponsor1.click();
//	    Remote.FirstProtectSponsor2.click();
//	    Remote.FirstProtectSponsor3.click();
//	    Remote.FirstProtectSponsor4.click();
//	    Remote.FirstProtectSponsor5.click();
//	    Remote.FirstProtectSponsor6.click();
//	    Remote.FirstProtectSponsor7.click();
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
//	    Remote.SeniorProtectSpouse6.click();
//	    act.pause(1000).perform();
//	    Remote.FirstProtectSpouse1.click();
//	    Remote.FirstProtectSpouse2.click();
//	    Remote.FirstProtectSpouse3.click();
//	    Remote.FirstProtectSpouse4.click();
//	    Remote.FirstProtectSpouse5.click();
//	    Remote.FirstProtectSpouse6.click();
//	    Remote.FirstProtectSpouse7.click();
	    act.pause(2000).perform();
	    Remote.NextBtn2.click();  
	}
	
	@Then("Input Sponsor Information Height Feet, Inches and Weight")
	public void input_Sponsor_Information_Height_Feet_Inches_and_Weight() {
	   Remote.Height5Feet.click();
	   Remote.Height8Inches.click();
	   Remote.Weight.sendKeys("132");
	   act.pause(2000).perform();
	   Remote.NextBtn2.click();
	}

	@Then("Input Spouse Information SSN, Gender, Height feet inches and Weight")
	public void input_Spouse_Information_SSN_Gender_Height_feet_inches_and_Weight() {
	    Remote.SpouseSSN.click();
	    Remote.SpouseSSN.sendKeys("656000029");
	    Remote.SpouseGenderMale.click();
	    Remote.Spouse6Feet.click();
	    Remote.Spouse5Inches.click();
	    Remote.SpouseWeight.sendKeys("200");
	    act.pause(2000).perform();
	    Remote.NextBtn2.click(); 
	}
	
	@Then("Better Alternative Sponsor Coverage Contingent Beneficiary FullName, SSN, Relationship and DOB")
	public void better_Alternative_Sponsor_Coverage_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		Remote.SomeoneElsee.click();
		Remote.ContingentBeneficiaryFullName.sendKeys("Martha Keech");
		Remote.ContingentBeneficiaryRelationshipAunt.click();
		Remote.ContingentBeneficiarySSNnumber.click();
		Remote.ContingentBeneficiarySSNnumber.sendKeys("656000030");
		Remote.ContingentBeneficiaryDOB.click();
		Remote.ContingentBeneficiaryDOB.sendKeys("10111837");
		Remote.ContingentBeneficiaryDOBVarify.click();
		act.pause(2000).perform();
		Remote.ContingentBeneficiaryDOB.clear();
		 Remote.ContingentBeneficiaryDOB.click();
		 act.pause(1000).perform();
		Remote.ContingentBeneficiaryDOB.sendKeys("10111937");
		act.pause(1000).perform();
		
	}

	@Then("Better Alternative Spouse Coverage Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void better_Alternative_Spouse_Coverage_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	   Remote.SomeoneElseForSpousePrimary.click();
	   Remote.SpousePrimarytFN.sendKeys("Jarvis Woolard");
	   Remote.SpousePrimarytSSN.click();
	   Remote.SpousePrimarytSSN.sendKeys("656000031");
	   Remote.SpousePrimaryRelationshipGirlFriend.click();
	   Remote.SpousePrimaryDOB.click();
	   Remote.SpousePrimaryDOB.sendKeys("05211868");
	   Remote.ContingentBeneficiaryDOBVarify.click();
	   act.pause(2000).perform();
	   Remote.SpousePrimaryDOB.clear();
	   Remote.SpousePrimaryDOB.click();
		 act.pause(1000).perform();
	   Remote.SpousePrimaryDOB.sendKeys("05211968");
	   act.pause(1000).perform();
	}

	@Then("Senior Protect Sponsor Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void senior_Protect_Sponsor_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	    Remote.SeniorProtectSponsorPrimaryBenifSomeoneElse.click();
	    Remote.SeniorProtectSponsorPrmaryBenFullName.sendKeys("Macon Thomas");
	    Remote.SeniorProtectSponsorPrimaryBenfSSN.click();
	    Remote.SeniorProtectSponsorPrimaryBenfSSN.sendKeys("656000032");
	    Remote.SeniorProtectSponsorPrimaryBenRelationshipBrother.click();
	    Remote.SeniorProtectSponsorPrimaryBenfDOB.click();
	    Remote.SeniorProtectSponsorPrimaryBenfDOB.sendKeys("02211878");
	    Remote.ContingentBeneficiaryDOBVarify.click();
		act.pause(2000).perform();
		Remote.SeniorProtectSponsorPrimaryBenfDOB.clear();
		Remote.SeniorProtectSponsorPrimaryBenfDOB.click();
		 act.pause(1000).perform();
		Remote.SeniorProtectSponsorPrimaryBenfDOB.sendKeys("02211978");
		act.pause(1000).perform();
	}

	@Then("Senior Protect Spouse Contingent Beneficiary FullName, SSN, Relationship and DOB")
	public void senior_Protect_Spouse_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	    Remote.SeniorProtectSpouseContingentSomeoneElse.click();
	    Remote.SeniorProtectSpouseContingentFullName.sendKeys("John Wallace");
	    Remote.SeniorProtectSpouseContingentSSN.click();
	    Remote.SeniorProtectSpouseContingentSSN.sendKeys("656000033");
	    Remote.SeniorProtectSpouseContingentRelationshipUncle.click();
	    Remote.SeniorProtectSpouseContingentDOB.click();
	    Remote.SeniorProtectSpouseContingentDOB.sendKeys("12251842");
	    Remote.ContingentBeneficiaryDOBVarify.click();
		   act.pause(2000).perform();
		Remote.SeniorProtectSpouseContingentDOB.clear();
		Remote.SeniorProtectSpouseContingentDOB.click();
		 act.pause(1000).perform();
		Remote.SeniorProtectSpouseContingentDOB.sendKeys("12251942");
		act.pause(2000).perform();
	}

	@Then("First Protect Sponsor Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void first_Protect_Sponsor_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	  Remote.FirstprotectSponsorPrimarySomeOneElse.click();
	  Remote.FirstProtectSponsorPrimaryFullName.sendKeys("Brett Burbage");
	  Remote.FirstProtectSponsorPrimarySSN.click();
	  Remote.FirstProtectSponsorPrimarySSN.sendKeys("656000034");
	  Remote.FirstProtectSponsorPrimaryRelationshipUncle.click();
	  Remote.FirstProtectSponsorPrimaryDOB.click();
	  Remote.FirstProtectSponsorPrimaryDOB.sendKeys("04101867");
	  Remote.FirstProtectSponsorPrimaryDOBVarify.click();
	   act.pause(2000).perform();
	  Remote.FirstProtectSponsorPrimaryDOB.clear();
	  Remote.FirstProtectSponsorPrimaryDOB.click();
	  act.pause(1000).perform();
	  Remote.FirstProtectSponsorPrimaryDOB.sendKeys("04101967");
	  act.pause(1000).perform();

	}

//	@Then("First Protect Spouse Primary Beneficiary FullName, SSN, Relationship and DOB")
//	public void first_Protect_Spouse_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
//		Remote.FirstprotectSpousePrimarySomeOneElse.click();
//		Remote.FirstProtectSpousePrimaryFullName.sendKeys("Pamela Dawson");
//		Remote.FirstProtectSpousePrimarySSN.click();
//		Remote.FirstProtectSpousePrimarySSN.sendKeys("414000007");
//		Remote.FirstProtectSpousePrimaryRelationshipSister.click();
//		Remote.FirstProtectSpousePrimaryDOB.click();
//		Remote.FirstProtectSpousePrimaryDOB.sendKeys("03171877");
//		Remote.FirstProtectSponsorPrimaryDOBVarify.click();
//		   act.pause(2000).perform();
//		Remote.FirstProtectSpousePrimaryDOB.clear();
//		Remote.FirstProtectSpousePrimaryDOB.click();
//		 act.pause(1000).perform();
//		Remote.FirstProtectSpousePrimaryDOB.sendKeys("03171977");
//		act.pause(1000).perform();
//	}

	@Then("Confirmation page select Email Summary and select Millitary Allotment method payment")
	public void confirmation_page_select_Email_Summary_and_select_Millitary_Allotment_method_payment() {
	    Remote.NextBtn6.click();
	    act.pause(2000).perform();
		Remote.EmailSummary1.click();
		act.pause(1000).perform();
		Remote.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
		Remote.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
		Remote.AcknowledgeofPayment.click();
	
	}

	@Then("Select Singing via Email button and input Email address")
	public void select_Singing_via_Email_button_and_input_Email_address() {
		  Remote.SiginingViaEmail.click();
		  act.pause(2000).perform();
		  Remote.EnterEmailOne.clear();
		  Remote.EnterEmailOne.sendKeys("qapeep512@gmail.com");
		  Remote.EnterEmailTwo.clear();
		  Remote.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
		  act.pause(1000).perform();
		
	}

	@Then("Click Submit and send email for signature")
	public void click_Submit_and_send_email_for_signature() {
		  Remote.SubmitEmailForsignatureBtn.click();
		  act.pause(7000).perform();  
	}

	@Then("Navigate back to Email account to login Email username and password")
	public void navigate_back_to_Email_account_to_login_Email_username_and_password() {
		 driver.get("https://www.google.com");
		 Remote.SignIn.click();  
	}

	@Then("Click Inbox and select Email")
	public void click_Inbox_and_select_Email() {
		Remote.InputEmail.sendKeys("qapeep512@gmail.com");
		Remote.NextButton.click();	
		act.pause(2000).perform();
		Remote.InputPassword.sendKeys("Muna@5012");
		Remote.NextButton.click();
		act.pause(4000).perform();
	}

	@Then("Click Review Application button")
	public void click_Review_Application_button() {
		Remote.ClickSelect.click();
		act.pause(2000).perform();
		Remote.ClickEmail.click();
		act.pause(2000).perform();
		Remote.SelectFirstEmail.click();
	//	Remote.selectEmail.click();
		act.pause(3000).perform();
		Remote.ReviewApplicationBtn.click();
		act.pause(2000).perform();
		
		java.util.Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String handle1 : driver.getWindowHandles()) {
               System.out.println(handle1);
               driver.switchTo().window(handle1);
        }
	}

	@Then("Input Last Name and Last four SSN numbers")
	public void input_Last_Name_and_Last_four_SSN_numbers() {
		Remote.LastNameforSponsor.sendKeys("ALBEK");
		Remote.LastSSNforSponsor.sendKeys("0028");
	}

	@Then("Click Review and Sign my Application btn")
	public void click_Review_and_Sign_my_Application_btn() {
		Remote.ReviewAndSignMyApplication.click();
		act.pause(3000).perform();
	}

	@Then("Click Review Application Ducuments button to review all the application")
	public void click_Review_Application_Ducuments_button_to_review_all_the_application() {
		Remote.ReviewApplicationDocumentBtn.click();
		act.pause(8000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
	}


	@Then("Input Sponsor Last Name and last four SSN numbers")
	public void input_Sponsor_Last_Name_and_last_four_SSN_numbers() {
		Remote.SponsorLastName.sendKeys("ALBKK");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
	    Remote.SponsorLastName.clear();
		Remote.SponsorLastName.click();	
	    Remote.SponsorLastName.sendKeys("ALBEK");
		Remote.SponsorLastSSN.sendKeys("0003");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
		Remote.SponsorLastSSN.clear();
		Remote.SponsorLastSSN.click();
		Remote.SponsorLastSSN.sendKeys("0028");
		act.pause(1000).perform();
//		Remote.SpouseLastName.sendKeys("ALBEK");
//		Remote.SpouseLastSSN.click();
//		Remote.SpouseLastSSN.sendKeys("0030");
	}

	@Then("Select Paper option for receive the Document")
	public void select_Paper_option_for_receive_the_Document() {
		Remote.PaperBtn.click();
		act.pause(2000).perform();
		Remote.SignBtn.click();
		act.pause(3000).perform();
		driver.get("https://enroll-sandbox.afba.com/login");
		Remote.email.sendKeys("qapeep512@gmail.com");
		Remote.password.sendKeys("Muna@512");
		Remote.loginBtn.click();
		act.pause(3000).perform();
		Remote.AccessAgentSigningInbox.click();
		act.pause(2000).perform();
		Remote.SignButton.click();
		act.pause(2000).perform();
		Remote.ReviewApplicationDocumentBtn.click();
		act.pause(8000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
		Remote.Sign.click();
		act.pause(3000).perform();
		
	}

}
