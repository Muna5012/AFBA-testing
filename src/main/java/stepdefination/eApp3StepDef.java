package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.eApp2;
import utilities.TestBase;

public class eApp3StepDef  extends TestBase {

	@When("Home page click Manage cases button")
	public void home_page_click_Manage_cases_button() {
		eApp2.ManageCaseButton.click();
	}

	@Then("Ale to search AFBA case")
	public void ale_to_search_AFBA_case() {
		  eApp2.searchSpace.click();
		  eApp2.searchSpace.sendKeys("AFBA");
		  eApp2.SearchAFBACase.click();
	}

	@Then("Create New Enrollement for case census")
	public void create_New_Enrollement_for_case_census() {
		 eApp2.NewEnrollement.click();
	}

	@Then("Input valid Sponsor SSN number")
	public void input_valid_Sponsor_SSN_number() {
		eApp2.SSN.click();
		 eApp2.SSN.sendKeys("545100108");
	}

	@Then("Input City of Enrollment")
	public void input_City_of_Enrollment() {
		  eApp2.EnrollmentCity.clear();
		  eApp2.EnrollmentCity.sendKeys("Bath");
			act.pause(2000).perform();
	}

	@Then("Input State of Enrollment")
	public void input_State_of_Enrollment() {
		   eApp2.NC.click();
		   act.pause(1000).perform();
	}

	@Then("Click Next Button for next page")
	public void click_Next_Button_for_next_page() {
	   eApp2.NextBtn.click();
	}

	@Then("Click Begin Enrollement")
	public void click_Begin_Enrollement() {
	  eApp2.BeginEnrollment.click();
	}

	@Then("Input Sponsor firstName, lastName, DOB")
	public void input_Sponsor_firstName_lastName_DOB() {
		  eApp2.FirstName.sendKeys("Tim");
		  eApp2.LastName.sendKeys("Cole");
		  act.pause(1000).perform();
		  eApp2.DOB.click();
		  eApp2.DOB.sendKeys("12061990");
	}

	@Then("Select the Sponsor gender")
	public void select_the_Sponsor_gender() {
		eApp2.GenderforMale.click();
	}

	@Then("Select Eligibility, Contribution Mode, Branch Of Service, Duty Status and Rank")
	public void select_Eligibility_Contribution_Mode_Branch_Of_Service_Duty_Status_and_Rank() {
	    eApp2.Eligibility.click();
	    eApp2.ContributionMode.click();
	    eApp2.BranchOfArmyService.click();
	    eApp2.DutyStatus.click();
	    eApp2.Rank3.click();
	    act.pause(2000).perform();
	}

	@Then("Input Department and Source Code")
	public void input_Department_and_Source_Code() {
		eApp2.DepartmentCode.sendKeys("AutoTest");
		eApp2.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor address, Email address and contact numbers")
	public void input_Sponsor_address_Email_address_and_contact_numbers() {
		 eApp2.Street.sendKeys("3 River Rd");
		  eApp2.Street2.sendKeys("Apt 1223");
		  eApp2.City.sendKeys("Paris");
	      eApp2.State.click();
	      eApp2.State.sendKeys("Virginia");
	      eApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();

	      eApp2.ZipCode.click();
	      eApp2.ZipCode.sendKeys("20130");
		  
		  eApp2.EmailAddress.sendKeys("MAbabaikeli@afba.com");
		  eApp2.ReEmailAddress.sendKeys("MAbabaikeli@afba.com");
		  eApp2.Phone.click();
		  eApp2.Phone.sendKeys("7037065961");
		  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button select benefit plans")
	public void click_Show_Coverage_Options_button_select_benefit_plans() {
	    eApp2.ShowCoverageOptions.click();
	    act.pause(1000).perform();
	}
	
	@Then("Select Better Alternative NonTobacco")
	public void select_Better_Alternative_NonTobacco() {
	    eApp2.NonTobacco.click();
	    eApp2.CustomizeOption1.click();
	    act.pause(2000).perform();
	}

	@Then("Click Application for Member Benefit option")
	public void click_Application_for_Member_Benefit_option() {
	    eApp2.spouseCoverage.click();
	}

	@Then("SelectWaive enrollment for this application")
	public void selectwaive_enrollment_for_this_application() {
	    eApp2.waiveEnrollment.click();
	    act.pause(2000).perform();
	}

	@Then("click Next button for answer question")
	public void click_Next_button_for_answer_question() {
	   eApp2.NextBtn1.click();
	}

	@Then("Click Answer No to All Questions")
	public void click_Answer_No_to_All_Questions() {
	  eApp2.AnswerNOAll.click();
	  act.pause(2000).perform();
	}

	@Then("Click Next button for Sponsor information")
	public void click_Next_button_for_Sponsor_information() {
		eApp2.NextBtn2.click();
	}

	@Then("Input Sponser height feet and inches")
	public void input_Sponser_height_feet_and_inches() {
		eApp2.HeightOption6.click();
	    eApp2.HeightInchesOption4.click();
	}

	@Then("Input weight Lbs and click Next button")
	public void input_weight_Lbs_and_click_Next_button() {
		 act.pause(1000).perform();
		    eApp2.Weight.click();
		    eApp2.Weight.sendKeys("201");
		    eApp2.NextBtn3.click();
	}

	@Then("Click Next button for Spouse and child information")
	public void click_Next_button_for_Spouse_and_child_information() {
		act.pause(1000).perform();
		eApp2.NextBtn3.click();
	}
	
	@Then("Input Primary Beneficiaries Sponsor FullName")
	public void input_Primary_Beneficiaries_Sponsor_FullName() {
		  eApp2.PrimaryBenficiaryFullName.sendKeys("Lucy Ball");
	}

	@Then("Input Primary Beneficiary SSN")
	public void input_Primary_Beneficiary_SSN() {
		  eApp2.PrimaryBeneficiarySSN.click();
		    eApp2.PrimaryBeneficiarySSN.sendKeys("545100109");
	}

	@Then("Select Primary Beneficiary Relationship option")
	public void select_Primary_Beneficiary_Relationship_option() {
		  eApp2.PrimaryRelationship.click();
	}

	@Then("Input Primary Beneficiary Date of Birth")
	public void input_Primary_Beneficiary_Date_of_Birth() {
		  eApp2.PrimaryBeneficiaryDOB.click();
		  eApp2.PrimaryBeneficiaryDOB.sendKeys("10101980");
		   act.pause(2000).perform();
	}

	@Then("Click someone else to add Contingent Beneficiary")
	public void click_someone_else_to_add_Contingent_Beneficiary() {
		eApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	}

	@Then("Input Contingent Beneficiary Full Name")
	public void input_Contingent_Beneficiary_Full_Name() {
		 eApp2.ContingentBeneficiaryFullName.sendKeys("Guy Best");
	}

	@Then("Input Contingent Beneficiary SSN number")
	public void input_Contingent_Beneficiary_SSN_number() {
		 eApp2.ContingentBeneficiarySSNnumber.click();
		    eApp2.ContingentBeneficiarySSNnumber.sendKeys("545100110");
	}

	@Then("Select Contingent Beneficiary Relationship")
	public void select_Contingent_Beneficiary_Relationship() {
		eApp2.ContingentRelationship.click();
	}

	@Then("Input Contingent Beneficiary DOB")
	public void input_Contingent_Beneficiary_DOB() {
		 eApp2.ContingentBeneficiaryDOB.click();
		   eApp2.ContingentBeneficiaryDOB.sendKeys("10151980");
		   act.pause(1000).perform();
	}

	@Then("Click Next button for Confirmation")
	public void click_Next_button_for_Confirmation() {
		   eApp2.NextBtn6.click();
	}

	@Then("Select Signing in person option")
	public void select_Signing_in_person_option() {
		eApp2.AcknowledgeofPayment.click();
		   eApp2.SiginingInPerson.click();
			  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage and ready to sign button to confirm")
	public void click_I_agree_to_this_coverage_and_ready_to_sign_button_to_confirm() {
		eApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Review Application Ducuments button")
	public void click_Review_Application_Ducuments_button() {
		eApp2.ReviewApplicationBtn.click();
		   act.pause(5000).perform();
	}

	@Then("Close the Application Document")
	public void close_the_Application_Document() {
		 eApp2.CloseBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Input valid sponsor last Name")
	public void input_valid_sponsor_last_Name() {
		eApp2.SponsorLastName.sendKeys("hero");
		eApp2.verifySSN.click();
		 act.pause(2000).perform();
		 eApp2.SponsorLastName.clear();
		 eApp2.SponsorLastName.click();	
		 eApp2.SponsorLastName.sendKeys("Cole");
	}

	@Then("Input valid last four SSN Number")
	public void input_valid_last_four_SSN_Number() {
		eApp2.SponsorLastSSN.sendKeys("3333");
		eApp2.verifySSN.click();
		act.pause(2000).perform();
		eApp2.SponsorLastSSN.clear();
	   eApp2.SponsorLastSSN.click();
	   eApp2.SponsorLastSSN.sendKeys("0108");
	}

	@Then("Select Paper")
	public void select_Paper() {
		 eApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Sign Button")
	public void click_Sign_Button() {
		eApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		eApp2.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign Button for Angent eSignature option")
	public void click_Sign_Button_for_Angent_eSignature_option() {
		eApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}


}
