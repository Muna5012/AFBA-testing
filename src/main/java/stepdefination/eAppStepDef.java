package stepdefination;

import org.openqa.selenium.Keys;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.eApp1;
import utilities.TestBase;

public class eAppStepDef extends TestBase{
	
	@When("HomePage to click Manage cases button")
	public void homepage_to_click_Manage_cases_button() {
	 eApp1.ManageCaseButton.click();
	}

	@Then("Input search to find AFBA case")
	public void input_search_to_find_AFBA_case() {
	   eApp1.searchSpace.click();
	   eApp1.searchSpace.sendKeys("AFBA");
	}

	@Then("click AFBA case")
	public void click_AFBA_case() {
	   eApp1.SearchAFBACase.click();
	}

	@Then("create a New Enrollment")
	public void create_a_New_Enrollment() {
	    eApp1.NewEnrollement.click();
	}

	@Then("Input Sponsor SSN")
	public void input_Sponsor_SSN() {
	   eApp1.SSN.click();
	   eApp1.SSN.sendKeys("545100100");
	}

	@Then("Input Enrollement City")
	public void input_Enrollement_City() {
	  eApp1.EnrollmentCity.clear();
	  eApp1.EnrollmentCity.sendKeys("Rice");
	}

	@Then("Input Enrollement State and click Next button")
	public void input_Enrollement_State_and_click_Next_button() {
		//eApp1.EnrollementClick.click();
		act.pause(2000).perform();
	   eApp1.EnrollmentState.click();
	   act.pause(1000).perform();
	   
	}
	
	@Then("Click the Next Button")
	public void click_the_Next_Button() {
	   eApp1.NextBtn.click();
	}

	@Then("Click Begin Enrollement button")
	public void click_Begin_Enrollement_button() {
	  eApp1.ClickBiginEnrollement.click();
	}

	@Then("Input Sponsor firstName, lastName, dateOfBirth")
	public void input_Sponsor_firstName_lastName_dateOfBirth() {
	  eApp1.FirstName.sendKeys("Roy");
	  eApp1.LastName.sendKeys("Holt");
	  act.pause(1000).perform();
	  eApp1.DOB.click();
	  eApp1.DOB.sendKeys("05211989");
	}

	@Then("Select Sponsor gender")
	public void select_Sponsor_gender() {
	 eApp1.Gender.click();
	}

	@Then("Select Eligibility, BranchOfService, DutyStatus, Rank and Contribution Mode")
	public void select_Eligibility_BranchOfService_DutyStatus_Rank_and_Contribution_Mode() {
		eApp1.Eligibility.click();
		eApp1.BranchOfService.click();
		eApp1.DutyStatus.click();
		eApp1.Rank.click();
		eApp1.ContributionMode.click();
		act.pause(1000).perform();
	}

	@Then("Input DepartmentCode and SourceCode")
	public void input_DepartmentCode_and_SourceCode() {
		eApp1.DepartmentCode.sendKeys("AutoTest");
		 eApp1.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor address, Email and contact numbers")
	public void input_Sponsor_address_Email_and_contact_numbers() {
	  eApp1.Street.sendKeys("1 River Rd");
	  eApp1.Street2.sendKeys("Apt 1221");
	  eApp1.City.sendKeys("Paris");
      eApp1.State.click();
      eApp1.State.sendKeys("Virginia");
      eApp1.State.sendKeys(Keys.ENTER);
      act.pause(1000).perform();

      eApp1.ZipCode.click();
      eApp1.ZipCode.sendKeys("20130");
	  
	  eApp1.EmailAddress.sendKeys("MAbabaikeli@afba.com");
	  eApp1.ReEmailAddress.sendKeys("MAbabaikeli@afba.com");
	  eApp1.Phone.click();
	  eApp1.Phone.sendKeys("7037065961");
	  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button")
	public void click_Show_Coverage_Options_button() {
	 eApp1.ShowCoverageOptions.click();
	}
	
	@Then("Select Better Alternative Roy option")
	public void select_Better_Akternative_Roy_option() {
	  eApp1.Tobacco.click();
	  act.pause(2000).perform();
	}

	@Then("Click Applicationfor member benefit")
	public void click_Applicationfor_member_benefit() {
	 eApp1.SponserCoverageOption1.click();
	  act.pause(3000).perform();
	}

	@Then("Select waive enrollment in Application radio button")
	public void select_waive_enrollment_in_Application_radio_button() {
	  eApp1.spouseCoverage.click();
	  act.pause(2000).perform();
	   eApp1.waiveEnrollment.click();
	   act.pause(2000).perform();
	}

	@Then("click Next button for next page")
	public void click_Next_button_for_next_page() {
		eApp1.NextBtn1.click();
	}

	@Then("Click Answer No to All Questions button")
	public void click_Answer_No_to_All_Questions_button() {
	  eApp1.AnswerNOAll.click();
	  act.pause(2000).perform();
	}

	@Then("Click Next button")
	public void click_Next_button() {
	  eApp1.NextBtn2.click();
	}

	@Then("Input Sponser height and weight")
	public void input_Sponser_height_and_weight() {
	    eApp1.HeightOption.click();
	    eApp1.HeightInchesOption.click();
	    act.pause(1000).perform();
	    eApp1.Weight.click();
	    eApp1.Weight.sendKeys("221");
	}

	@Then("Click the Next button again")
	public void click_the_Next_button_again() {
		eApp1.NextBtn3.click();
	}
	
	@Then("Click Next button for Spouse or child info")
	public void click_Next_button_for_Spouse_or_child_info() {
		eApp1.NextBtn3.click();
	}

	@Then("Input Beneficiaries for Better Alternative Sponsor Full Name")
	public void input_Beneficiaries_for_Better_Alternative_Sponsor_Full_Name() {
	 eApp1.BeneficiaryForBetterAlternativeFullname.sendKeys("Al Snow");
	}

	@Then("Input Beneficiary SSN")
	public void input_Beneficiary_SSN() {
	eApp1.BeneficiarySSN.click();
	eApp1.BeneficiarySSN.sendKeys("545100101");
	  act.pause(1000).perform();
	}

	@Then("Select Relationship")
	public void select_Relationship() {
	 eApp1.BeneficiaryRelationship.click();
	}

	@Then("Input Beneficiary DOB")
	public void input_Beneficiary_DOB() {
	   eApp1.BeneficiaryDOB.click();
	   eApp1.BeneficiaryDOB.sendKeys("12041960");
	   act.pause(2000).perform();
	}

	@Then("Click Contingent Beneficiary for Sponsor Coverage Someone else")
	public void click_Contingent_Beneficiary_for_Sponsor_Coverage_Someone_else() {
	  eApp1.SomeoneElse.click();
	}

	@Then("Input Contingent Beneficiary of Sponsor Coverage Beneficiary Full Name")
	public void input_Contingent_Beneficiary_of_Sponsor_Coverage_Beneficiary_Full_Name() {
	 eApp1.ContingentBeneficiaryFullName.sendKeys("Leo Pugh");
	}

	@Then("Input Contingent Beneficiary of Sponsor Coverage SSN")
	public void input_Contingent_Beneficiary_of_Sponsor_Coverage_SSN() {
	  eApp1.ContingentBeneficiarySSNnumber.click();
	  eApp1.ContingentBeneficiarySSNnumber.sendKeys("545100102");
	  act.pause(2000).perform();
	  
	}

	@Then("Select Contingent Beneficiary of Sponsor Coverage Relationship")
	public void select_Contingent_Beneficiary_of_Sponsor_Coverage_Relationship() {
	  eApp1.ContingentBeneficiaryRelationship.click();
	}

	@Then("Contingent Beneficiary of Sponsor Coverage DOB")
	public void contingent_Beneficiary_of_Sponsor_Coverage_DOB() {
		eApp1.ContingentBeneficiaryDOB.click();
		eApp1.ContingentBeneficiaryDOB.sendKeys("05221989");
		  act.pause(2000).perform();
		
	}
	
	@Then("Click Next button for Confirmation page")
	public void click_Next_button_for_Confirmation_page() {
		eApp1.NextBtn6.click();
	}

	@Then("Click Signing in person option")
	public void click_Signing_in_person_option() {
		eApp1.AcknowledgeofPayment.click();
	  eApp1.SiginingInPerson.click();
	  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage and ready to sign button")
	public void click_I_agree_to_this_coverage_and_ready_to_sign_button() {
		 eApp1.AgreeToSignInBtn.click();
		  act.pause(2000).perform();
	}
	
	@Then("Click the Review Application Ducuments")
	public void click_the_Review_Application_Ducuments() {
	   eApp1.ReviewApplicationBtn.click();
	   act.pause(6000).perform();
	}

	@Then("Close the Application")
	public void close_the_Application() {
	 eApp1.CloseBtn.click();
	// eApp1.CheckBox.click();
	 act.pause(2000).perform();
	}

	@Then("Input sponsor lastName")
	public void input_sponsor_lastName() {
		 eApp1.SponsorLastName.click();	
	 eApp1.SponsorLastName.sendKeys("Holt");
	}

	@Then("Input Last four SSN number")
	public void input_Last_four_SSN_number() {
		eApp1.SponsorLastSSN.sendKeys("9999");
		eApp1.verifySSN.click();
		act.pause(2000).perform();
		eApp1.SponsorLastSSN.clear();
	   eApp1.SponsorLastSSN.click();
	   eApp1.SponsorLastSSN.sendKeys("0100");
	}
	
	@Then("Select Paper radio button")
	public void select_Paper_radio_button() {
	 eApp1.PaperBtn.click();
	 act.pause(2000).perform();
	}

	@Then("Click Sign button")
	public void click_Sign_button() {
		eApp1.clickModalBodyBtn.click();
		act.pause(1000).perform();
		eApp1.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign button for Angent eSignature")
	public void click_Sign_button_for_Angent_eSignature() {
		eApp1.eSignatureBrn.click();
		act.pause(7000).perform();
	}

}
