package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EAppFaceToFace3  extends TestBase {

	@When("Home page click Manage cases button")
	public void home_page_click_Manage_cases_button() {
		EApp2.Home.click();
		act.pause(2000).perform();
		EApp2.ManageCaseButton.click();
	}

	@Then("Ale to search AFBA case")
	public void ale_to_search_AFBA_case() {
		  EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
		  EApp2.SearchITQAAutomationFace2Face.click();
	}

	@Then("Create New Enrollement for case census")
	public void create_New_Enrollement_for_case_census() {
		 EApp2.NewEnrollement.click();
	}

	@Then("Input valid Sponsor SSN number")
	public void input_valid_Sponsor_SSN_number() {
		EApp2.SSN.click();
		 EApp2.SSN.sendKeys("545200037");
	}

	@Then("Input City of Enrollment")
	public void input_City_of_Enrollment() {
		  EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Bath");
			act.pause(2000).perform();
	}

	@Then("Input State of Enrollment")
	public void input_State_of_Enrollment() {
		   EApp2.NC.click();
		   act.pause(1000).perform();
	}

	@Then("Click Next Button for next page")
	public void click_Next_Button_for_next_page() {
	   EApp2.NextBtn.click();
	}

	@Then("Click Begin Enrollement")
	public void click_Begin_Enrollement() {
		// EApp2.BeginEnrollment.click();
	   EApp2.ClickNewSponsor.click();
	}

	@Then("Input Sponsor firstName, lastName, DOB")
	public void input_Sponsor_firstName_lastName_DOB() {
		  EApp2.FirstName.sendKeys("Tim");
		  EApp2.LastName.sendKeys("Cole");
		  act.pause(1000).perform();
		  EApp2.DOB.click();
		  EApp2.DOB.sendKeys("12061990");
	}

	@Then("Select the Sponsor gender")
	public void select_the_Sponsor_gender() {
		EApp2.GenderforMale.click();
	}

	@Then("Select Eligibility, Contribution Mode, Branch Of Service, Duty Status and Rank")
	public void select_Eligibility_Contribution_Mode_Branch_Of_Service_Duty_Status_and_Rank() {
	    EApp2.Eligibility.click();
	    EApp2.ContributionMode.click();
	    EApp2.BranchOfArmyService.click();
	    EApp2.DutyStatus.click();
	    EApp2.Rank3.click();
	    act.pause(2000).perform();
	}

	@Then("Input Department and Source Code")
	public void input_Department_and_Source_Code() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
		EApp2.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor address, Email address and contact numbers")
	public void input_Sponsor_address_Email_address_and_contact_numbers() {
		 EApp2.Street.sendKeys("3 River Rd");
		  EApp2.Street2.sendKeys("Apt 1223");
		  EApp2.City.sendKeys("Paris");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Virginia");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();

	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("20130");
		  
		  EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		  EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		  EApp2.Phone.click();
		  EApp2.Phone.sendKeys("7037065961");
		  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button select benefit plans")
	public void click_Show_Coverage_Options_button_select_benefit_plans() {
	    EApp2.ShowCoverageOptions.click();
	    act.pause(1000).perform();
	}
	
	@Then("Select Better Alternative NonTobacco")
	public void select_Better_Alternative_NonTobacco() {
	    EApp2.NonTobacco.click();
	    EApp2.CustomizeOption1.click();
	    act.pause(2000).perform();
	}

	@Then("Click Application for Member Benefit option")
	public void click_Application_for_Member_Benefit_option() {
	    EApp2.spouseCoverage.click();
	}

	@Then("SelectWaive enrollment for this application")
	public void selectwaive_enrollment_for_this_application() {
	    EApp2.WaiveApplication.click();
	    act.pause(2000).perform();
	    EApp2.FedTerm.click();
		EApp2.WaiveFedTerm.click();
		act.pause(2000).perform();
		EApp2.ClickFirstProtect.click();
		EApp2.WaiveFirstProtect.click();
		act.pause(2000).perform();
	}

	@Then("click Next button for answer question")
	public void click_Next_button_for_answer_question() {
	   EApp2.NextBtn1.click();
	}

	@Then("Click Answer No to All Questions")
	public void click_Answer_No_to_All_Questions() {
	  EApp2.AnswerNOAll.click();
	  act.pause(2000).perform();
	}

	@Then("Click Next button for Sponsor information")
	public void click_Next_button_for_Sponsor_information() {
		EApp2.NextBtn2.click();
	}

	@Then("Input Sponser height feet and inches")
	public void input_Sponser_height_feet_and_inches() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption4.click();
	}

	@Then("Input weight Lbs and click Next button")
	public void input_weight_Lbs_and_click_Next_button() {
		 act.pause(1000).perform();
		    EApp2.Weight.click();
		    EApp2.Weight.sendKeys("201");
		    EApp2.NextBtn3.click();
	}

	@Then("Click Next button for Spouse and child information")
	public void click_Next_button_for_Spouse_and_child_information() {
		act.pause(1000).perform();
		EApp2.NextBtn3.click();
	}
	
	@Then("Input Primary Beneficiaries Sponsor FullName")
	public void input_Primary_Beneficiaries_Sponsor_FullName() {
		  EApp2.PrimaryBenficiaryFullName.sendKeys("Lucy Ball");
	}

	@Then("Input Primary Beneficiary SSN")
	public void input_Primary_Beneficiary_SSN() {
		  EApp2.PrimaryBeneficiarySSN.click();
		    EApp2.PrimaryBeneficiarySSN.sendKeys("545200038");
	}

	@Then("Select Primary Beneficiary Relationship option")
	public void select_Primary_Beneficiary_Relationship_option() {
		  EApp2.PrimaryRelationship.click();
	}

	@Then("Input Primary Beneficiary Date of Birth")
	public void input_Primary_Beneficiary_Date_of_Birth() {
		  EApp2.PrimaryBeneficiaryDOB.click();
		  EApp2.PrimaryBeneficiaryDOB.sendKeys("10101980");
		   act.pause(2000).perform();
	}

	@Then("Click someone else to add Contingent Beneficiary")
	public void click_someone_else_to_add_Contingent_Beneficiary() {
		EApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	}

	@Then("Input Contingent Beneficiary Full Name")
	public void input_Contingent_Beneficiary_Full_Name() {
		 EApp2.ContingentBeneficiaryFullName.sendKeys("Guy Best");
	}

	@Then("Input Contingent Beneficiary SSN number")
	public void input_Contingent_Beneficiary_SSN_number() {
		 EApp2.ContingentBeneficiarySSNnumber.click();
		    EApp2.ContingentBeneficiarySSNnumber.sendKeys("545200039");
	}

	@Then("Select Contingent Beneficiary Relationship")
	public void select_Contingent_Beneficiary_Relationship() {
		EApp2.ContingentRelationship.click();
	}

	@Then("Input Contingent Beneficiary DOB")
	public void input_Contingent_Beneficiary_DOB() {
		 EApp2.ContingentBeneficiaryDOB.click();
		   EApp2.ContingentBeneficiaryDOB.sendKeys("10151980");
		   act.pause(1000).perform();
	}

	@Then("Click Next button for Confirmation")
	public void click_Next_button_for_Confirmation() {
		   EApp2.NextBtn6.click();
	}

	@Then("Select Signing in person option")
	public void select_Signing_in_person_option() {
		EApp2.AcknowledgeofPayment.click();
		   EApp2.SiginingInPerson.click();
			  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage and ready to sign button to confirm")
	public void click_I_agree_to_this_coverage_and_ready_to_sign_button_to_confirm() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Review Application Ducuments button")
	public void click_Review_Application_Ducuments_button() {
		EApp2.ReviewApplicationBtn.click();
		   act.pause(5000).perform();
	}

	@Then("Close the Application Document")
	public void close_the_Application_Document() {
		 EApp2.CloseBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Input valid sponsor last Name")
	public void input_valid_sponsor_last_Name() {
		EApp2.SponsorLastName.sendKeys("hero");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Cole");
	}

	@Then("Input valid last four SSN Number")
	public void input_valid_last_four_SSN_Number() {
		EApp2.SponsorLastSSN.sendKeys("3333");
		EApp2.verifySSN.click();
		act.pause(2000).perform();
		EApp2.SponsorLastSSN.clear();
	   EApp2.SponsorLastSSN.click();
	   EApp2.SponsorLastSSN.sendKeys("0037");
	}

	@Then("Select Paper")
	public void select_Paper() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Sign Button")
	public void click_Sign_Button() {
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign Button for Angent eSignature option")
	public void click_Sign_Button_for_Angent_eSignature_option() {
		EApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}


}
