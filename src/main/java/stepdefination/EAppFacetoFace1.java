package stepdefination;

import org.openqa.selenium.Keys;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp1;
import pages.EApp2;
import utilities.TestBase;

public class EAppFacetoFace1 extends TestBase{
	
	@When("HomePage to click Manage cases button")
	public void homepage_to_click_Manage_cases_button() {
	 EApp1.ManageCaseButton.click();
	}

	@Then("Input search to find IT QA Automation Face2Face case")
	public void input_search_to_find_case() {
	   EApp1.searchSpace.click();
	   EApp1.searchSpace.sendKeys("IT_QA Automation Face2Face");
	}

	@Then("click IT QA Automation Face2Face case")
	public void click_case() {
	   EApp2.SearchITQAAutomationFace2Face.click();
	}

	@Then("create a New Enrollment")
	public void create_a_New_Enrollment() {
	    EApp1.NewEnrollement.click();
	}

	@Then("Input Sponsor SSN")
	public void input_Sponsor_SSN() {
	   EApp1.SSN.click();
	   EApp1.SSN.sendKeys("545100193");
	}

	@Then("Input Enrollement City")
	public void input_Enrollement_City() {
	  EApp1.EnrollmentCity.clear();
	  EApp1.EnrollmentCity.sendKeys("Rice");
	}

	@Then("Input Enrollement State")
	public void input_Enrollement_Staten() {
		//eApp1.EnrollementClick.click();
		act.pause(2000).perform();
	   EApp1.EnrollmentState.click();
	   act.pause(2000).perform();
	   
	}
	
	@Then("Click the Next Button")
	public void click_the_Next_Button() {
	   EApp1.NextBtn.click();
	}

	@Then("Click Begin Enrollement button")
	public void click_Begin_Enrollement_button() {
	//	EApp1.ClickBiginEnrollement.click();
	  EApp1.ClickNewSponsor.click();
	}

	@Then("Input Sponsor firstName, lastName, dateOfBirth")
	public void input_Sponsor_firstName_lastName_dateOfBirth() {
	  EApp1.FirstName.sendKeys("Roy");
	  EApp1.LastName.sendKeys("Holt");
	  act.pause(1000).perform();
	  EApp1.DOB.click();
	  EApp1.DOB.sendKeys("05211989");
	}

	@Then("Select Sponsor gender")
	public void select_Sponsor_gender() {
	 EApp1.Gender.click();
	}

	@Then("Select Eligibility, BranchOfService, DutyStatus, Rank and Contribution Mode")
	public void select_Eligibility_BranchOfService_DutyStatus_Rank_and_Contribution_Mode() {
		EApp1.Eligibility.click();
		EApp1.BranchOfService.click();
		EApp1.DutyStatus.click();
		EApp1.Rank.click();
		EApp1.ContributionMode.click();
		act.pause(1000).perform();
	}

	@Then("Input DepartmentCode and SourceCode")
	public void input_DepartmentCode_and_SourceCode() {
		EApp1.DepartmentCode.sendKeys("AutoTest");
		 EApp1.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor address, Email and contact numbers")
	public void input_Sponsor_address_Email_and_contact_numbers() {
	  EApp1.Street.sendKeys("1 River Rd");
	  EApp1.Street2.sendKeys("Apt 1221");
	  EApp1.City.sendKeys("Paris");
      EApp1.State.click();
      EApp1.State.sendKeys("Virginia");
      EApp1.State.sendKeys(Keys.ENTER);
      act.pause(1000).perform();

      EApp1.ZipCode.click();
      EApp1.ZipCode.sendKeys("20130");
	  
//	  EApp1.EmailAddress.sendKeys("qapeep19@gmail.com");
//	  EApp1.ReEmailAddress.sendKeys("qapeep19@gmail.com");
	  EApp1.Phone.click();
	  EApp1.Phone.sendKeys("7037065961");
	  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button")
	public void click_Show_Coverage_Options_button() {
	 EApp1.ShowCoverageOptions.click();
	}
	
	@Then("Select Better Alternative Roy option")
	public void select_Better_Akternative_Roy_option() {
	  EApp1.Tobacco.click();
	  act.pause(2000).perform();
	}

	@Then("Click Applicationfon member benefit five thousand k")
	public void click_Applicationfon_member_benefit_five_thousand_k() {
	 EApp1.SponserCoverageOption1.click();
	  act.pause(3000).perform();
	}

	@Then("Select waive enrollment in Application radio button")
	public void select_waive_enrollment_in_Application_radio_button() {
	  EApp1.spouseCoverage.click();
	  act.pause(2000).perform();
	   EApp1.waiveEnrollment.click();
	   act.pause(2000).perform();
		EApp2.FedTerm.click();
		EApp2.WaiveFedTerm.click();
		EApp2.ClickFirstProtect.click();
		EApp2.WaiveFirstProtect.click();
		act.pause(2000).perform();
	}

	@Then("click Next button for next page")
	public void click_Next_button_for_next_page() {
		EApp1.NextBtn1.click();
	}

	@Then("Click Answer No to All Questions button")
	public void click_Answer_No_to_All_Questions_button() {
	  EApp1.AnswerNOAll.click();
	  act.pause(2000).perform();
	}

	@Then("Click Next button")
	public void click_Next_button() {
	  EApp1.NextBtn2.click();
	}

	@Then("Input Sponser height and weight")
	public void input_Sponser_height_and_weight() {
	    EApp1.HeightOption.click();
	    EApp1.HeightInchesOption.click();
	    act.pause(1000).perform();
	    EApp1.Weight.click();
	    EApp1.Weight.sendKeys("221");
	}

	@Then("Click the Next button again")
	public void click_the_Next_button_again() {
		EApp1.NextBtn3.click();
	}
	
	@Then("Click Next button for Spouse or child info")
	public void click_Next_button_for_Spouse_or_child_info() {
		EApp1.NextBtn3.click();
	}

	@Then("Input Beneficiaries for Better Alternative Sponsor Full Name")
	public void input_Beneficiaries_for_Better_Alternative_Sponsor_Full_Name() {
	 EApp1.BeneficiaryForBetterAlternativeFullname.sendKeys("Al Snow");
	}

	@Then("Input Beneficiary SSN")
	public void input_Beneficiary_SSN() {
	EApp1.BeneficiarySSN.click();
	EApp1.BeneficiarySSN.sendKeys("545100194");
	  act.pause(1000).perform();
	}

	@Then("Select Relationship")
	public void select_Relationship() {
	 EApp1.BeneficiaryRelationship.click();
	}

	@Then("Input Beneficiary DOB")
	public void input_Beneficiary_DOB() {
	   EApp1.BeneficiaryDOB.click();
	   EApp1.BeneficiaryDOB.sendKeys("12041960");
	   act.pause(2000).perform();
	}

	@Then("Click Contingent Beneficiary for Sponsor Coverage Someone else")
	public void click_Contingent_Beneficiary_for_Sponsor_Coverage_Someone_else() {
	  EApp1.SomeoneElse.click();
	}

	@Then("Input Contingent Beneficiary of Sponsor Coverage Beneficiary Full Name")
	public void input_Contingent_Beneficiary_of_Sponsor_Coverage_Beneficiary_Full_Name() {
	 EApp1.ContingentBeneficiaryFullName.sendKeys("Leo Pugh");
	}

	@Then("Input Contingent Beneficiary of Sponsor Coverage SSN")
	public void input_Contingent_Beneficiary_of_Sponsor_Coverage_SSN() {
	  EApp1.ContingentBeneficiarySSNnumber.click();
	  EApp1.ContingentBeneficiarySSNnumber.sendKeys("545100195");
	  act.pause(2000).perform();
	  
	}

	@Then("Select Contingent Beneficiary of Sponsor Coverage Relationship")
	public void select_Contingent_Beneficiary_of_Sponsor_Coverage_Relationship() {
	  EApp1.ContingentBeneficiaryRelationship.click();
	}

	@Then("Contingent Beneficiary of Sponsor Coverage DOB")
	public void contingent_Beneficiary_of_Sponsor_Coverage_DOB() {
		EApp1.ContingentBeneficiaryDOB.click();
		EApp1.ContingentBeneficiaryDOB.sendKeys("05221989");
		  act.pause(2000).perform();
		
	}
	
	@Then("Click Next button for Confirmation page")
	public void click_Next_button_for_Confirmation_page() {
		EApp1.NextBtn6.click();
	}

	@Then("Click Signing in person option")
	public void click_Signing_in_person_option() {
		  act.pause(2000).perform();
		EApp2.EmailSummary.click();
		act.pause(1000).perform();
		EApp2.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
		EApp2.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
		
		EApp1.AcknowledgeofPayment.click();
	  EApp2.SiginingViaEmail.click();
	  act.pause(2000).perform();
	  EApp2.EnterEmailOne.clear();
	  EApp2.EnterEmailOne.sendKeys("qapeep512@gmail.com");
	  EApp2.EnterEmailTwo.clear();
	  EApp2.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
	  act.pause(1000).perform();
	  EApp2.SubmitEmailForsignatureBtn.click();
	  act.pause(5000).perform();  
	  
	  
	  
	}

//	@Then("Click I agree to this coverage and ready to sign button")
//	public void click_I_agree_to_this_coverage_and_ready_to_sign_button() {
//		 EApp1.AgreeToSignInBtn.click();
//		  act.pause(2000).perform();
//	}
//	
//	@Then("Click the Review Application Ducuments")
//	public void click_the_Review_Application_Ducuments() {
//	   EApp1.ReviewApplicationBtn.click();
//	   act.pause(6000).perform();
//	}
//
//	@Then("Close the Application")
//	public void close_the_Application() {
//	 EApp1.CloseBtn.click();
//	// eApp1.CheckBox.click();
//	 act.pause(2000).perform();
//	}
//
//	@Then("Input sponsor lastName")
//	public void input_sponsor_lastName() {
//		 EApp1.SponsorLastName.click();	
//	 EApp1.SponsorLastName.sendKeys("Holt");
//	}
//
//	@Then("Input Last four SSN number")
//	public void input_Last_four_SSN_number() {
//		EApp1.SponsorLastSSN.sendKeys("9999");
//		EApp1.verifySSN.click();
//		act.pause(2000).perform();
//		EApp1.SponsorLastSSN.clear();
//	   EApp1.SponsorLastSSN.click();
//	   EApp1.SponsorLastSSN.sendKeys("0193");
//	}
//	
//	@Then("Select Paper radio button")
//	public void select_Paper_radio_button() {
//	 EApp1.PaperBtn.click();
//	 act.pause(2000).perform();
//	}
//
//	@Then("Click Sign button")
//	public void click_Sign_button() {
//		EApp1.clickModalBodyBtn.click();
//		act.pause(1000).perform();
//		EApp1.SignBtn.click();
//		act.pause(3000).perform();
//	}
//
//	@Then("Click Sign button for Angent eSignature")
//	public void click_Sign_button_for_Angent_eSignature() {
//		EApp1.eSignatureBrn.click();
//		act.pause(7000).perform();
//	}

}
