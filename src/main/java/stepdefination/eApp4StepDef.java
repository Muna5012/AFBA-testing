package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EApp4StepDef extends TestBase{
	
	@When("Home page to click Manage cases button")
	public void home_page_to_click_Manage_cases_button() {
		EApp2.ManageCaseButton.click();
	}

	@Then("Manage Cases page search AFBA case")
	public void manage_Cases_page_search_AFBA_case() {
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("AFBA");
		  
	}

	@Then("Click AFBA cases")
	public void click_AFBA_cases() {
		act.pause(1000).perform();
	    EApp2.SearchAFBACase.click();
	}

	@Then("Create New Enrollement")
	public void create_New_Enrollement() {
		EApp2.NewEnrollement.click();
		
	}

	@Then("Input Sponsor SSN number")
	public void input_Sponsor_SSN_number() {
		EApp2.SSN.click();
		 EApp2.SSN.sendKeys("545100111");
	}

	@Then("Input Enrollment City")
	public void input_Enrollment_City() {
		  EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Holly Spring");
			act.pause(2000).perform();
	}

	@Then("Input Enrollment State")
	public void input_Enrollment_State() {
		  EApp2.NC.click();
		   act.pause(1000).perform();
	}

	@Then("Click Next button to create it")
	public void click_Next_button_to_create_it() {
		  EApp2.NextBtn.click();
	}

	@Then("Select Begin Enrollement case")
	public void select_Begin_Enrollement_case() {
	//	eApp2.BeginEnrollment.click();
		EApp2.ClickNewSponsor.click();
	}

	@Then("Input Sponsor first Name, last Name, DOB")
	public void input_Sponsor_first_Name_last_Name_DOB() {
		  EApp2.FirstName.sendKeys("Burt");
		  EApp2.LastName.sendKeys("Parks");
		  act.pause(1000).perform();
		  EApp2.DOB.click();
		  EApp2.DOB.sendKeys("11111990");
	}

	@Then("Select the Sponsor Gender")
	public void select_the_Sponsor_Gender() {
		EApp2.GenderforMale.click();
	}

	@Then("Select Eligibility, ContributionMode, Branch Of Service, Duty Status and Rank")
	public void select_Eligibility_ContributionMode_Branch_Of_Service_Duty_Status_and_Rank() {
	    EApp2.Eligibility.click();
	    EApp2.ContributionMode.click();
	    EApp2.BranchOfMCService.click();
	    EApp2.DutyStatus.click();
	    EApp2.Rank6.click();
	    act.pause(2000).perform();
	}

	@Then("Input Department code and Source Code")
	public void input_Department_code_and_Source_Code() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
		EApp2.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor address, Emails and contact numbers")
	public void input_Sponsor_address_Emails_and_contact_numbers() {
		 EApp2.Street.sendKeys("4 River Rd");
		  EApp2.Street2.sendKeys("Apt 1224");
		  EApp2.City.sendKeys("Piti");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Guam");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();

	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("96915");
	
		  EApp2.Phone.click();
		  EApp2.Phone.sendKeys("7037065961");
		  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button to select benefit plans")
	public void click_Show_Coverage_Options_button_to_select_benefit_plans() {
		 EApp2.ShowCoverageOptions.click();
		    act.pause(1000).perform();
	}
	
	@Then("Select Better Alternative Tobacco")
	public void select_Better_Alternative_Tobacco() {
	    EApp2.Tobacco.click();
	    act.pause(2000).perform();
	}

	@Then("Select Customize option{int}")
	public void select_Customize_option(Integer int1) {
		 EApp2.CustomizeOption2.click();
		    act.pause(2000).perform();
	}

	@Then("Click the Application for Member Benefit option")
	public void click_the_Application_for_Member_Benefit_option() {
	    EApp2.spouseCoverage.click();
	}

	@Then("Select Covered")
	public void select_Covered() {
	    EApp2.Covered.click();
	    act.pause(1000).perform();
	}

	@Then("click Next")
	public void click_Next() {
		 EApp2.NextBtn1.click();
	}

	@Then("Click Answer No to All Question button")
	public void click_Answer_No_to_All_Question_button() {
		  EApp2.AnswerNOAll.click();
		  act.pause(2000).perform();
	}

	@Then("Click Next button for Sponsor informations")
	public void click_Next_button_for_Sponsor_informations() {
		EApp2.NextBtn2.click();
	}

	@Then("Input Sponser height feet and inches option")
	public void input_Sponser_height_feet_and_inches_option() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption6.click();
	}

	@Then("Input weight and click Next button")
	public void input_weight_and_click_Next_button() {
		 act.pause(1000).perform();
		    EApp2.Weight.click();
		    EApp2.Weight.sendKeys("231");
		    EApp2.NextBtn3.click();
	}

	@Then("Click Next button for Spouse and child informations")
	public void click_Next_button_for_Spouse_and_child_informations() {
		act.pause(1000).perform();
		EApp2.NextBtn3.click();
	}
	
	@Then("Input Primary Beneficiary Full Name")
	public void input_Primary_Beneficiary_Full_Name() {
		  EApp2.PrimaryBenficiaryFullName.sendKeys("Walt Davis");
	}

	@Then("Input Primary Beneficiary SSN numbers")
	public void input_Primary_Beneficiary_SSN_numbers() {
		  EApp2.PrimaryBeneficiarySSN.click();
		    EApp2.PrimaryBeneficiarySSN.sendKeys("545100116");
	}

	@Then("Select Relationship for Primary Beneficiary")
	public void select_Relationship_for_Primary_Beneficiary() {
	   EApp2.PrimaryBeneficiaryRelationship2.click();
	}

	@Then("Input Primary Beneficiary sponsor DOB")
	public void input_Primary_Beneficiary_sponsor_DOB() {
		  EApp2.PrimaryBeneficiaryDOB.click();
		  EApp2.PrimaryBeneficiaryDOB.sendKeys("11251964");
		   act.pause(2000).perform();
	}

	@Then("Input Second Primary Beneficiary Full Name")
	public void input_Second_Primary_Beneficiary_Full_Name() {
	   EApp2.SecondPrmaryBenFullName.sendKeys("Amber Rose");
	}

	@Then("Input Second Primary Beneficiary SSN numbers")
	public void input_Second_Primary_Beneficiary_SSN_numbers() {
	    EApp2.SecondPrimaryBenfSSN.click();
	    EApp2.SecondPrimaryBenfSSN.sendKeys("545100117");
	}

	@Then("Select Relationship Second Primary Beneficiary")
	public void select_Relationship_Second_Primary_Beneficiary() {
	   EApp2.SecondPrimaryBenRelationship2.click();
	}

	@Then("Input Second Primary Beneficiary sponsor DOB")
	public void input_Second_Primary_Beneficiary_sponsor_DOB() {
	   EApp2.SecondPrimaryBenfDOB.click();
	   EApp2.SecondPrimaryBenfDOB.sendKeys("10211983");
	}
	
	@Then("Click Next button to Confirmation")
	public void click_Next_button_to_Confirmation() {
		   EApp2.NextBtn6.click();
	}

	@Then("Select Signing in person click button")
	public void select_Signing_in_person_click_button() {
		EApp2.AcknowledgeofPayment.click();
		   EApp2.SiginingInPerson.click();
			  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage to sign button to confirm")
	public void click_I_agree_to_this_coverage_to_sign_button_to_confirm() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Review Application Ducuments button to review")
	public void click_Review_Application_Ducuments_button_to_review() {
		EApp2.ReviewApplicationBtn.click();
		   act.pause(6000).perform();
	}

	@Then("Close the Application Document page")
	public void close_the_Application_Document_page() {
		 EApp2.CloseBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Input sponsor valid last Name")
	public void input_sponsor_valid_last_Name() {
		EApp2.SponsorLastName.sendKeys("Pakst");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Parks");
	}

	@Then("Input sponsor last four SSN Number")
	public void input_sponsor_last_four_SSN_Number() {
		EApp2.SponsorLastSSN.sendKeys("1116");
		EApp2.verifySSN.click();
		act.pause(2000).perform();
		EApp2.SponsorLastSSN.clear();
	   EApp2.SponsorLastSSN.click();
	   EApp2.SponsorLastSSN.sendKeys("0111");
	}

	@Then("Select Paper option")
	public void select_Paper_option() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Sign Button to sign in")
	public void click_Sign_Button_to_sign_in() {
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign Button for Angent eSignature")
	public void click_Sign_Button_for_Angent_eSignature() {
		EApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}




	
}
