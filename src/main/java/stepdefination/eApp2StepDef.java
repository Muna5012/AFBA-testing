package stepdefination;

import org.openqa.selenium.Keys;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.eApp2;
import utilities.TestBase;

public class eApp2StepDef extends TestBase {

	@When("Click Manage cases button")
	public void click_Manage_cases_button() {
	  eApp2.ManageCaseButton.click();
	}

	@Then("Manage Case Page search to find AFBA case")
	public void manage_Case_Page_search_to_find_AFBA_case() {
	  eApp2.searchSpace.click();
	  eApp2.searchSpace.sendKeys("AFBA");
	}

	@Then("Select AFBA case")
	public void select_AFBA_case() {
	   eApp2.SearchAFBACase.click();
	}

	@Then("Create New Enrollment")
	public void create_New_Enrollment() {
	 eApp2.NewEnrollement.click();
	}

	@Then("Input valid Sponsor SSN")
	public void input_valid_Sponsor_SSN() {
	 eApp2.SSN.click();
	 eApp2.SSN.sendKeys("545100103");
	}

	@Then("Input Enrollement State then click Next button")
	public void input_Enrollement_State_then_click_Next_button() {
		  eApp2.EnrollmentCity.clear();
		  eApp2.EnrollmentCity.sendKeys("Rice");
			act.pause(2000).perform();
			   eApp2.EnrollmentState.click();
			   act.pause(1000).perform();
	}

	@Then("Click Next Button")
	public void click_Next_Button() {
		  eApp2.NextBtn.click();
	}

	@Then("Click Begin Enrollement Button")
	public void click_Begin_Enrollement_Button() {
		 eApp2.ClickBiginEnrollement.click();
	}

	@Then("Input valid Sponsor firstName, lastName, DOB")
	public void input_valid_Sponsor_firstName_lastName_DOB() {
		  eApp2.FirstName.sendKeys("Reba");
		  eApp2.LastName.sendKeys("Hess");
		  act.pause(1000).perform();
		  eApp2.DOB.click();
		  eApp2.DOB.sendKeys("10121982");
	}

	@Then("Click Sponsor gender")
	public void click_Sponsor_gender() {
		eApp2.Gender.click();
	}

	@Then("Select Eligibility, Contribution Mode, BranchOfService, DutyStatus, Rank")
	public void select_Eligibility_Contribution_Mode_BranchOfService_DutyStatus_Rank() {
		eApp2.Eligibility.click();
		eApp2.BranchOfService.click();
		eApp2.DutyStatus.click();
		eApp2.Rank.click();
		eApp2.ContributionMode.click();
		act.pause(1000).perform();
	}

	@Then("Input Department Code and Source Code")
	public void input_Department_Code_and_Source_Code() {
		eApp2.DepartmentCode.sendKeys("AutoTest");
		 eApp2.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor address, Email and contact number")
	public void input_Sponsor_address_Email_and_contact_number() {
		 eApp2.Street.sendKeys("1 River Rd");
		  eApp2.Street2.sendKeys("Apt 1222");
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

	@Then("Click Show Coverage Options button select benefit plan")
	public void click_Show_Coverage_Options_button_select_benefit_plan() {
		 eApp2.ShowCoverageOptions.click();
	}

	@Then("Select Better Alternative Roy click and selct Options")
	public void select_Better_Alternative_Roy_click_and_selct_Options() {
		  eApp2.NonTobacco.click();
		  act.pause(2000).perform();
	}

	@Then("Click Application for member benefit")
	public void click_Application_for_member_benefit() {
		 eApp2.SponserCoverageOption2.click();
		  act.pause(3000).perform();
	}	

	@Then("Select Application Member Benefit radio button")
	public void select_Application_Member_Benefit_radio_button() {
		  eApp2.spouseCoverage.click();
		  act.pause(2000).perform();
		   eApp2.Covered.click();
		   act.pause(2000).perform();
	}

	@Then("click Next button")
	public void click_Next_button() {
		eApp2.NextBtn1.click();
	}

	@Then("Click Answer No to All Questions one click button")
	public void click_Answer_No_to_All_Questions_one_click_button() {
		 eApp2.AnswerNOAll.click();
		  act.pause(2000).perform();
	}

	@Then("Click Next button for next page")
	public void click_Next_button_for_next_page() {
		 eApp2.NextBtn2.click();
	}

	@Then("Input Sponser height feet inches")
	public void input_Sponser_height_feet_inches() {
		eApp2.HeightOption.click();
	    eApp2.HeightInchesOption.click();
	}

	@Then("input weight and click Next button")
	public void input_weight_and_click_Next_button() {
		  act.pause(1000).perform();
		    eApp2.Weight.click();
		    eApp2.Weight.sendKeys("130");
		    eApp2.NextBtn3.click();
	}

	@Then("Click Next button for Spouse or child information")
	public void click_Next_button_for_Spouse_or_child_information() {
		eApp2.NextBtn3.click();
	}
	
	@Then("Input Primary Beneficiaries for Better Alternative Sponsor FullName")
	public void input_Primary_Beneficiaries_for_Better_Alternative_Sponsor_FullName() {
	   eApp2.PrimaryBenficiaryFullName.sendKeys("Lena Best");
	}

	@Then("Input Primary BeneficiarySSN")
	public void input_Primary_BeneficiarySSN() {
	    eApp2.PrimaryBeneficiarySSN.click();
	    eApp2.PrimaryBeneficiarySSN.sendKeys("545100104");
	}

	@Then("Select Primary Beneficiary Relationship")
	public void select_Primary_Beneficiary_Relationship() {
	  eApp2.PrimaryBeneficiaryRelationship.click();
	}

	@Then("Input Primary Beneficiary DOB")
	public void input_Primary_Beneficiary_DOB() {
		  eApp2.PrimaryBeneficiaryDOB.click();
		    eApp2.PrimaryBeneficiaryDOB.sendKeys("04101942");
		    act.pause(2000).perform();
	}

	@Then("Click someone else to add more contingent beneficiary")
	public void click_someone_else_to_add_more_contingent_beneficiary() {
	    eApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	}

	@Then("Input Contingent Beneficiary FullName")
	public void input_Contingent_Beneficiary_FullName() {
	  eApp2.ContingentBeneficiaryFullName.sendKeys("Mayo Snow");
	}

	@Then("Input Contingent Beneficiary SSN")
	public void input_Contingent_Beneficiary_SSN() {
	    eApp2.ContingentBeneficiarySSNnumber.click();
	    eApp2.ContingentBeneficiarySSNnumber.sendKeys("545100105");
	}

	@Then("Select Contingent Beneficiary Relationship option")
	public void select_Contingent_Beneficiary_Relationship_option() {
		eApp2.ContingentBeneficiaryRelationship.click();
	}
	
	@Then("Contingent Beneficiary DOB")
	public void contingent_Beneficiary_DOB() {
	   eApp2.ContingentBeneficiaryDOB.click();
	   eApp2.ContingentBeneficiaryDOB.sendKeys("2211964");
	   act.pause(1000).perform();
	}
	
	@Then("Input Second Primary Beneficiary FullName")
	public void input_Second_Primary_Beneficiary_FullName() {
	   eApp2.SecondPrmaryBenFullName.sendKeys("Art Gill");
	}

	@Then("Input Second Primary Beneficiary SSN")
	public void input_Second_Primary_Beneficiary_SSN() {
	  eApp2.SecondPrimaryBenfSSN.click();
	  eApp2.SecondPrimaryBenfSSN.sendKeys("545100106");
	}

	@Then("Select Second Primary Beneficiary Relationship option")
	public void select_Second_Primary_Beneficiary_Relationship_option() {
	    eApp2.SecondPrimaryBenRelationship.click();    
	}

	@Then("Input Second Primary Beneficiary DOB")
	public void input_Second_Primary_Beneficiary_DOB() {
	    eApp2.SecondPrimaryBenfDOB.click();
	    eApp2.SecondPrimaryBenfDOB.sendKeys("12251970");
	    act.pause(2000).perform();
	}
	
	@Then("click someone else for second contingent beneficiary")
	public void click_someone_else_for_second_contingent_beneficiary() {
	    eApp2.secondSomeOneElse.click();
	    act.pause(3000).perform();
	}

	@Then("Input Second Contingent Beneficiary FullName")
	public void input_Second_Contingent_Beneficiary_FullName() {
	  eApp2.SecondContingentBeneficiaryFullName.sendKeys("Vin Webb");
	}

	@Then("Input second Contingent Beneficiary SSN")
	public void input_second_Contingent_Beneficiary_SSN() {
	   eApp2.SecondContingentBeneficiarySSN.click();
	   eApp2.SecondContingentBeneficiarySSN.sendKeys("545100107");
	}

	@Then("Select Second Contigent Beneficiary Relationship")
	public void select_Second_Contigent_Beneficiary_Relationship() {
	   eApp2.SecondContingentBeneficiaryRelationship.click();
	   act.pause(1000).perform();
	}

	@Then("Input Second Contingent Beneficiary DOB")
	public void input_Second_Contingent_Beneficiary_DOB() {
	   eApp2.SecondContingentBeneficiaryDOB.click();
	   eApp2.SecondContingentBeneficiaryDOB.sendKeys("1211937");
	   act.pause(2000).perform();
	}

	@Then("Click Next for Confirmation page")
	public void click_Next_for_Confirmation_page() {
	   eApp2.NextBtn6.click();
	}

	@Then("Click Signing in person button")
	public void click_Signing_in_person_button() {
		eApp2.AcknowledgeofPayment.click();
	   eApp2.SiginingInPerson.click();
		  act.pause(2000).perform();
	}

	@Then("Click the I agree to this coverage and ready to sign button")
	public void click_the_I_agree_to_this_coverage_and_ready_to_sign_button() {
		eApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click the Review Application Ducuments button")
	public void click_the_Review_Application_Ducuments_button() {
	   eApp2.ReviewApplicationBtn.click();
	   act.pause(5000).perform();
	}

	@Then("Close the Application Documents")
	public void close_the_Application_Documents() {
		 eApp2.CloseBtn.click();
			 act.pause(2000).perform();
	}

	@Then("Input valid sponsor lastName")
	public void input_valid_sponsor_lastName() {
		eApp2.SponsorLastName.sendKeys("Nomin");
		eApp2.verifySSN.click();
		 act.pause(2000).perform();
		 eApp2.SponsorLastName.clear();
		 eApp2.SponsorLastName.click();	
		 eApp2.SponsorLastName.sendKeys("Hess");
	
	}

	@Then("Input valid last four SSN")
	public void input_valid_last_four_SSN() {
		eApp2.SponsorLastSSN.sendKeys("9999");
		eApp2.verifySSN.click();
		act.pause(2000).perform();
		eApp2.SponsorLastSSN.clear();
	   eApp2.SponsorLastSSN.click();
	   eApp2.SponsorLastSSN.sendKeys("0103");
	}

	@Then("Click Paper radio button")
	public void click_Paper_radio_button() {
	   eApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Sign button to signin")
	public void click_Sign_button_to_signin() {
		eApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		eApp2.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign button for Angent eSignature option")
	public void click_Sign_button_for_Angent_eSignature_option() {
		eApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}


}
