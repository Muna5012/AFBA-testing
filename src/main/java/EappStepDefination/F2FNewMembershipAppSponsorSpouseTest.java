package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp1;
import pages.EApp2;
import utilities.TestBase;

public class F2FNewMembershipAppSponsorSpouseTest extends TestBase{

	@When("Home Page to click Manage cases button")
	public void home_Page_to_click_Manage_cases_button() {
		EApp2.Home.click();
		act.pause(2000).perform();
	EApp2.ManageCaseButton.click();
	}

	@Then("Search AFBA cases on Manage Cases page")
	public void search_AFBA_cases_on_Manage_Cases_page() {
	  EApp2.searchSpace.click();
	  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
	  act.pause(1000).perform();
	  EApp2.SearchITQAAutomationFace2Face.click();
	}

	@Then("Click the New Enrollement button to create case")
	public void click_the_New_Enrollement_button_to_create_case() {
	EApp2.NewEnrollement.click();
	}

	@Then("Input Sponsor SSN numbers")
	public void input_Sponsor_SSN_numbers() {
	act.pause(1000).perform();
	EApp2.SSN.click();
	 EApp2.SSN.sendKeys("656000033");
	}

	@Then("Input Enrollment city")
	public void input_Enrollment_city() {
	 EApp2.EnrollmentCity.clear();
	  EApp2.EnrollmentCity.sendKeys("Las Vegas");
		act.pause(2000).perform();
	}

	@Then("Select Enrollment state")
	public void select_Enrollment_state() {
	 EApp2.NV.click();
	   act.pause(1000).perform();
	   EApp2.NextBtn.click();
	   act.pause(2000).perform();
	}

	@Then("click Begin Enrollement button to create new sponsor")
	public void click_Begin_Enrollement_button_to_create_new_sponsor() {
	//  EApp2.BeginEnrollment.click();
   	 EApp2.ClickNewSponsor.click();
	}

	@Then("Input Sponsor First Name, Last Name and DOB")
	public void input_Sponsor_First_Name_Last_Name_and_DOB() {
		   EApp2.FirstName.sendKeys("Izzy");
		    EApp2.LastName.sendKeys("Pop");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("10281984");
	}

	@Then("Select Sponsor Gender")
	public void select_Sponsor_Gender() {
		EApp2.GenderforMale.click();
	}
	
	@Then("Click Marreid button")
	public void click_Marreid_button() {
		  EApp2.MarriedBtn.click();
		    act.pause(3000).perform();
	}

	@Then("Input Spouse FirstName, LastName and DOB")
	public void input_Spouse_FirstName_LastName_and_DOB() {
		   EApp2.SpouseFN.sendKeys("Else");
		   EApp2.SpouseLN.sendKeys("Pop");
		   act.pause(1000).perform();
		   EApp2.SpouseDOB.click();
		   EApp2.SpouseDOB.sendKeys("01121982");
	}
	
	
	@Then("Select option Eligibility, Branch of service, Duty Status, Rank")
	public void select_option_Eligibility_Branch_of_service_Duty_Status_Rank() {
		EApp2.Eligibility.click();
		EApp2.BranchOfService6.click();
		EApp2.DutyStatus2.click();
		EApp2.Rank9.click();
	}

	@Then("Select Contribution Mode option, and Source Code")
	public void select_Contribution_Mode_option_and_Source_Code() {
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
		EApp2.DepartmentCode.sendKeys("AutoTest");
		EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street address, City, ST, Zip code, Email Address and repeat Email address and phone number")
	public void input_Street_address_City_ST_Zip_code_Email_Address_and_repeat_Email_address_and_phone_number() {
		 EApp2.Street.sendKeys("6 River Rd");
		  EApp2.Street2.sendKeys("Apt 1226");
		  EApp2.City.sendKeys("Washington");
	      EApp2.State.click();
	      EApp2.State.sendKeys("NC");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("27889");
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		EApp2.Phone.click();
		EApp2.Phone.sendKeys("7037065961");
		  act.pause(2000).perform();
	}
	
	@Then("Click Show Coverage Options to select Benefitiary Plans")
	public void click_Show_Coverage_Options_to_select_Benefitiary_Plans() {
		 EApp2.ShowCoverageOptions.click();
		    act.pause(1000).perform();
	}
	
	@Then("Selct Better Alternative, customize sponsor and spouse")
	public void selct_Better_Alternative_customize_sponsor_and_spouse() {
		 EApp2.Tobacco.click();
		 act.pause(1000).perform();
		 EApp1.SponserCoverageOption1.click();
	     act.pause(2000).perform();
	}

	@Then("Selct group free Application Member Benefit and answer the questions")
	public void selct_group_free_Application_Member_Benefit_and_answer_the_questions() {
		EApp2.spouseCoverage.click();
		EApp2.Covered.click();
		act.pause(3000).perform();	
//		EApp2.YesForFirstQuestion.click();
//		act.pause(1000).perform();
//		EApp2.NoForSecondQuestion.click();
		act.pause(2000).perform();
	}

	@Then("Select Fed Term customize Sponsor and spouse")
	public void select_Fed_Term_customize_Sponsor_and_spouse() {
		EApp2.FedTerm.click();
		EApp2.LT20SponsorCustomize100.click();
		act.pause(2000).perform();
		EApp2.LT20CutomizeSpouse100.click();
		act.pause(1000).perform();
		
	}

	@Then("Waive the First Protect")
	public void waive_the_First_Protect() {
		EApp2.ClickFirstProtect.click();
		EApp2.WaiveFirstProtect.click();
		act.pause(1000).perform();
		EApp2.Next.click();
	}


	@Then("Answer all the questions on qualification page")
	public void answer_all_the_questions_on_qualification_page() {
	    EApp2.AnswerNOAll.click();
	    act.pause(2000).perform();
	    EApp2.AnswerOneYes.click();
	    EApp2.ForAnswer.sendKeys("Income Limitations");
	    act.pause(2000).perform();
		 EApp2.NextBtn2.click();
	}

	@Then("Input Sponsor informations height and Weight options")
	public void input_Sponsor_informations_height_and_Weight_options() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption5.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("232"); 
		act.pause(2000).perform();
	    EApp2.NextBtn3.click();
	}

	@Then("Input spouse information SSN, gender, height and weight")
	public void input_spouse_information_SSN_gender_height_and_weight() {
		EApp2.SpouseSSN.click();
		EApp2.SpouseSSN.sendKeys("656000034");
		EApp2.SpouseGenderFamale.click();
		act.pause(1000).perform();
		 EApp2.SpouseHeigthFeet.click();
		    EApp2.SpouseHeightInches11.click();
		    act.pause(2000).perform();
		    EApp2.SpouseWeight.click();
			   EApp2.SpouseWeight.sendKeys("153");
		  act.pause(2000).perform();
		   EApp2.Next.click();
	}


	@Then("Input BA Alternative Sponsor primary beneficiary full name,SSN, relationship and DOB")
	public void input_BA_Alternative_Sponsor_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
		EApp2.SomeoneElseForSponsorPrimary.click();
		 act.pause(1000).perform();
	    EApp2.PrimaryBenficiaryFullName.sendKeys("George Jetson");
	    EApp2.PrimaryBeneficiarySSN.click();
	    EApp2.PrimaryBeneficiarySSN.sendKeys("656000035");
	    EApp2.PrimaryRelationshipForFIL.click();
	    EApp2.PrimaryBeneficiaryDOB.click();
	    EApp2.PrimaryBeneficiaryDOB.sendKeys("04101942");
	    act.pause(2000).perform();
	}

	@Then("Input BA Alternative Spouse primary beneficiary full name,SSN, relationship and DOB")
	public void input_BA_Alternative_Spouse_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
		EApp2.SomeoneElseForSpousePrimary.click();
		 act.pause(1000).perform();
	    EApp2.SpousePrimarytFN.sendKeys("Bette Hawkins");
	    EApp2.SpousePrimarytSSN.click();
	    EApp2.SpousePrimarytSSN.sendKeys("656000036");
	    EApp2.SpousePrimaryRelationship.click();
	    EApp2.SpousePrimaryDOB.click();
	    EApp2.SpousePrimaryDOB.sendKeys("12111937");
	    act.pause(2000).perform();
	}

	@Then("Input Group Free Sponsor primary beneficiary full name,SSN, relationship and DOB")
	public void input_Group_Free_Sponsor_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
	  
	}

	@Then("Input Fed Term Sponsor primary beneficiary full name,SSN, relationship and DOB")
	public void input_Fed_Term_Sponsor_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
	 
	}

	@Then("Input Fed Term Spouse primary beneficiary full name,SSN, relationship and DOB")
	public void input_Fed_Term_Spouse_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
	  
		EApp2.NextBtn6.click();
	}

	@Then("Select Location for Signing in person option")
	public void select_Location_for_Signing_in_person_option() {
		EApp2.EmailSummary2.click();
		 act.pause(3000).perform();
		EApp2.AcknowledgeofPayment.click();
		   EApp2.SiginingInPerson.click();
			  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage and ready for sign button to signin")
	public void click_I_agree_to_this_coverage_and_ready_for_sign_button_to_signin() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Review Application Ducuments to Continue Button to review all the application")
	public void click_Review_Application_Ducuments_to_Continue_Button_to_review_all_the_application() {
		EApp2.ReviewApplicationBtn.click();
		   act.pause(6000).perform();
			 EApp2.CloseBtn.click();
			 act.pause(2000).perform();
	}

	@Then("Input Sponsor Last Name and last four SSN numbers for confirm")
	public void input_Sponsor_Last_Name_and_last_four_SSN_numbers_for_confirm() {
		EApp2.SponsorLastName.sendKeys("ppo");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Pop");
		EApp2.SponsorLastSSN.sendKeys("0191");
		EApp2.verifySSN.click();
		act.pause(2000).perform();
		EApp2.SponsorLastSSN.clear();
	   EApp2.SponsorLastSSN.click();
	   EApp2.SponsorLastSSN.sendKeys("0033");
	}

	@Then("Select Paper Option for receive the documents")
	public void select_Paper_Option_for_receive_the_documents() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Sign Button to Signin")
	public void click_Sign_Button_to_Signin() {
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign Button for eSignature to this application")
	public void click_Sign_Button_for_eSignature_to_this_application() {
		EApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}

}
