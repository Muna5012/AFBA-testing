package stepdefination;

import org.openqa.selenium.Keys;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EApp2StepDef extends TestBase {

	@When("Click Manage cases button")
	public void click_Manage_cases_button() {
	  EApp2.ManageCaseButton.click();
	}

	@Then("Manage Case Page search to find AFBA case")
	public void manage_Case_Page_search_to_find_AFBA_case() {
	  EApp2.searchSpace.click();
	  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face Remote");
	}

	@Then("Select AFBA case")
	public void select_AFBA_case() {
	   EApp2.SearchAFBACase.click();
	}

	@Then("Create New Enrollment")
	public void create_New_Enrollment() {
	 EApp2.NewEnrollement.click();
	}

	@Then("Input valid Sponsor SSN")
	public void input_valid_Sponsor_SSN() {
	 EApp2.SSN.click();
	 EApp2.SSN.sendKeys("545100103");
	}

	@Then("Input Enrollement State then click Next button")
	public void input_Enrollement_State_then_click_Next_button() {
		  EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Rice");
			act.pause(2000).perform();
			   EApp2.EnrollmentState.click();
			   act.pause(1000).perform();
	}

	@Then("Click Next Button")
	public void click_Next_Button() {
		  EApp2.NextBtn.click();
	}

	@Then("Click Begin Enrollement Button")
	public void click_Begin_Enrollement_Button() {
	//	 EApp2.BeginEnrollment.click();
		   EApp2.ClickNewSponsor.click();
	}

	@Then("Input valid Sponsor firstName, lastName, DOB")
	public void input_valid_Sponsor_firstName_lastName_DOB() {
		  EApp2.FirstName.sendKeys("Reba");
		  EApp2.LastName.sendKeys("Hess");
		  act.pause(1000).perform();
		  EApp2.DOB.click();
		  EApp2.DOB.sendKeys("10121982");
	}

	@Then("Click Sponsor gender")
	public void click_Sponsor_gender() {
		EApp2.Gender.click();
	}

	@Then("Select Eligibility, Contribution Mode, BranchOfService, DutyStatus, Rank")
	public void select_Eligibility_Contribution_Mode_BranchOfService_DutyStatus_Rank() {
		EApp2.Eligibility.click();
		EApp2.BranchOfService.click();
		EApp2.DutyStatus.click();
		EApp2.Rank.click();
		EApp2.ContributionMode.click();
		act.pause(1000).perform();
	}

	@Then("Input Department Code and Source Code")
	public void input_Department_Code_and_Source_Code() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
		 EApp2.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor address, Email and contact number")
	public void input_Sponsor_address_Email_and_contact_number() {
		 EApp2.Street.sendKeys("1 River Rd");
		  EApp2.Street2.sendKeys("Apt 1222");
		  EApp2.City.sendKeys("Paris");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Virginia");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();

	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("20130");
		  
		  EApp2.EmailAddress.sendKeys("MAbabaikeli@afba.com");
		  EApp2.ReEmailAddress.sendKeys("MAbabaikeli@afba.com");
		  EApp2.Phone.click();
		  EApp2.Phone.sendKeys("7037065961");
		  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button select benefit plan")
	public void click_Show_Coverage_Options_button_select_benefit_plan() {
		 EApp2.ShowCoverageOptions.click();
	}

	@Then("Select Better Alternative Roy click and selct Options")
	public void select_Better_Alternative_Roy_click_and_selct_Options() {
		  EApp2.NonTobacco.click();
		  act.pause(2000).perform();
	}

	@Then("Click Application for member benefit")
	public void click_Application_for_member_benefit() {
		 EApp2.SponserCoverageOption2.click();
		  act.pause(3000).perform();
	}	

	@Then("Select Application Member Benefit radio button")
	public void select_Application_Member_Benefit_radio_button() {
		  EApp2.spouseCoverage.click();
		  act.pause(2000).perform();
		   EApp2.Covered.click();
		   act.pause(2000).perform();
	}

	@Then("click Next button")
	public void click_Next_button() {
		EApp2.FedTerm.click();
		EApp2.WaiveFedTerm.click();
		act.pause(2000).perform();
		EApp2.ClickFirstProtect.click();
		EApp2.WaiveFirstProtect.click();
		act.pause(2000).perform();
		EApp2.NextBtn1.click();
	}

	@Then("Click Answer No to All Questions one click button")
	public void click_Answer_No_to_All_Questions_one_click_button() {
		 EApp2.AnswerNOAll.click();
		  act.pause(2000).perform();
	}

	@Then("Click Next button for next page")
	public void click_Next_button_for_next_page() {
		 EApp2.NextBtn2.click();
	}

	@Then("Input Sponser height feet inches")
	public void input_Sponser_height_feet_inches() {
		EApp2.HeightOption.click();
	    EApp2.HeightInchesOption.click();
	}

	@Then("input weight and click Next button")
	public void input_weight_and_click_Next_button() {
		  act.pause(1000).perform();
		    EApp2.Weight.click();
		    EApp2.Weight.sendKeys("130");
		    EApp2.NextBtn3.click();
	}

	@Then("Click Next button for Spouse or child information")
	public void click_Next_button_for_Spouse_or_child_information() {
		EApp2.NextBtn3.click();
	}
	
	@Then("Input Primary Beneficiaries for Better Alternative Sponsor FullName")
	public void input_Primary_Beneficiaries_for_Better_Alternative_Sponsor_FullName() {
	   EApp2.PrimaryBenficiaryFullName.sendKeys("Lena Best");
	}

	@Then("Input Primary BeneficiarySSN")
	public void input_Primary_BeneficiarySSN() {
	    EApp2.PrimaryBeneficiarySSN.click();
	    EApp2.PrimaryBeneficiarySSN.sendKeys("545100104");
	}

	@Then("Select Primary Beneficiary Relationship")
	public void select_Primary_Beneficiary_Relationship() {
	  EApp2.PrimaryBeneficiaryRelationship.click();
	}

	@Then("Input Primary Beneficiary DOB")
	public void input_Primary_Beneficiary_DOB() {
		  EApp2.PrimaryBeneficiaryDOB.click();
		    EApp2.PrimaryBeneficiaryDOB.sendKeys("04101942");
		    act.pause(2000).perform();
	}

	@Then("Click someone else to add more contingent beneficiary")
	public void click_someone_else_to_add_more_contingent_beneficiary() {
	    EApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	}

	@Then("Input Contingent Beneficiary FullName")
	public void input_Contingent_Beneficiary_FullName() {
	  EApp2.ContingentBeneficiaryFullName.sendKeys("Mayo Snow");
	}

	@Then("Input Contingent Beneficiary SSN")
	public void input_Contingent_Beneficiary_SSN() {
	    EApp2.ContingentBeneficiarySSNnumber.click();
	    EApp2.ContingentBeneficiarySSNnumber.sendKeys("545100105");
	}

	@Then("Select Contingent Beneficiary Relationship option")
	public void select_Contingent_Beneficiary_Relationship_option() {
		EApp2.ContingentBeneficiaryRelationship.click();
	}
	
	@Then("Contingent Beneficiary DOB")
	public void contingent_Beneficiary_DOB() {
	   EApp2.ContingentBeneficiaryDOB.click();
	   EApp2.ContingentBeneficiaryDOB.sendKeys("2211964");
	   act.pause(1000).perform();
	}
	
	@Then("Input Second Primary Beneficiary FullName")
	public void input_Second_Primary_Beneficiary_FullName() {
	   EApp2.SecondPrmaryBenFullName.sendKeys("Art Gill");
	}

	@Then("Input Second Primary Beneficiary SSN")
	public void input_Second_Primary_Beneficiary_SSN() {
	  EApp2.SecondPrimaryBenfSSN.click();
	  EApp2.SecondPrimaryBenfSSN.sendKeys("545100106");
	}

	@Then("Select Second Primary Beneficiary Relationship option")
	public void select_Second_Primary_Beneficiary_Relationship_option() {
	    EApp2.SecondPrimaryBenRelationship.click();    
	}

	@Then("Input Second Primary Beneficiary DOB")
	public void input_Second_Primary_Beneficiary_DOB() {
	    EApp2.SecondPrimaryBenfDOB.click();
	    EApp2.SecondPrimaryBenfDOB.sendKeys("12251970");
	    act.pause(2000).perform();
	}
	
	@Then("click someone else for second contingent beneficiary")
	public void click_someone_else_for_second_contingent_beneficiary() {
	    EApp2.secondSomeOneElse.click();
	    act.pause(3000).perform();
	}

	@Then("Input Second Contingent Beneficiary FullName")
	public void input_Second_Contingent_Beneficiary_FullName() {
	  EApp2.SecondContingentBeneficiaryFullName.sendKeys("Vin Webb");
	}

	@Then("Input second Contingent Beneficiary SSN")
	public void input_second_Contingent_Beneficiary_SSN() {
	   EApp2.SecondContingentBeneficiarySSN.click();
	   EApp2.SecondContingentBeneficiarySSN.sendKeys("545100107");
	}

	@Then("Select Second Contigent Beneficiary Relationship")
	public void select_Second_Contigent_Beneficiary_Relationship() {
	   EApp2.SecondContingentBeneficiaryRelationship.click();
	   act.pause(1000).perform();
	}

	@Then("Input Second Contingent Beneficiary DOB")
	public void input_Second_Contingent_Beneficiary_DOB() {
	   EApp2.SecondContingentBeneficiaryDOB.click();
	   EApp2.SecondContingentBeneficiaryDOB.sendKeys("1211937");
	   act.pause(2000).perform();
	}

	@Then("Click Next for Confirmation page")
	public void click_Next_for_Confirmation_page() {
	   EApp2.NextBtn6.click();
	}

	@Then("Click Signing in person button")
	public void click_Signing_in_person_button() {
		EApp2.AcknowledgeofPayment.click();
	   EApp2.SiginingInPerson.click();
		  act.pause(2000).perform();
	}

	@Then("Click the I agree to this coverage and ready to sign button")
	public void click_the_I_agree_to_this_coverage_and_ready_to_sign_button() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click the Review Application Ducuments button")
	public void click_the_Review_Application_Ducuments_button() {
	   EApp2.ReviewApplicationBtn.click();
	   act.pause(5000).perform();
	}

	@Then("Close the Application Documents")
	public void close_the_Application_Documents() {
		 EApp2.CloseBtn.click();
			 act.pause(2000).perform();
	}

	@Then("Input valid sponsor lastName")
	public void input_valid_sponsor_lastName() {
		EApp2.SponsorLastName.sendKeys("Nomin");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Hess");
	
	}

	@Then("Input valid last four SSN")
	public void input_valid_last_four_SSN() {
		EApp2.SponsorLastSSN.sendKeys("9999");
		EApp2.verifySSN.click();
		act.pause(2000).perform();
		EApp2.SponsorLastSSN.clear();
	   EApp2.SponsorLastSSN.click();
	   EApp2.SponsorLastSSN.sendKeys("0103");
	}

	@Then("Click Paper radio button")
	public void click_Paper_radio_button() {
	   EApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Sign button to signin")
	public void click_Sign_button_to_signin() {
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign button for Angent eSignature option")
	public void click_Sign_button_for_Angent_eSignature_option() {
		EApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}


}
