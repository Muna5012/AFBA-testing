package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EApp9SeniorStepDef extends TestBase {

	@When("Click Manage Cases button to Search AFBA cases and click it")
	public void click_Manage_Cases_button_to_Search_AFBA_cases_and_click_it() {
		EApp2.ManageCaseButton.click();
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face Remote");
			act.pause(1000).perform();
		    EApp2.SearchAFBACase.click();
	}

	@When("Click New Enrollement button")
	public void click_New_Enrollement_button() {
		EApp2.NewEnrollement.click();
	}

	@Then("Input Sponsor SSN, Enrollment City, Enrollment state")
	public void input_Sponsor_SSN_Enrollment_City_Enrollment_state() {
		act.pause(1000).perform();
		EApp2.SSN.click();
		 EApp2.SSN.sendKeys("545100139");
		 EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Mobile");
			act.pause(2000).perform();
			 EApp2.AL.click();
			   act.pause(1000).perform();
			   EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollement to create new Case")
	public void click_Begin_Enrollement_to_create_new_Case() {
	//	EApp2.BeginEnrollment.click();
		 EApp2.ClickNewSponsor.click();
	}

	@Then("Input the Sponsor FirstName, LastName, DOB and Gender")
	public void input_the_Sponsor_FirstName_LastName_DOB_and_Gender() {
		 EApp2.FirstName.sendKeys("Nathaniel");
		    EApp2.LastName.sendKeys("Jefferson");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("03101969");
			EApp2.GenderforMale.click();
	}

	@Then("Input Spouse First Name, Last Name, DOB")
	public void input_Spouse_First_Name_Last_Name_DOB() {
		 EApp2.MarriedBtn.click();
		    act.pause(3000).perform();
		    EApp2.SpouseFN.sendKeys("Isabella");
			   EApp2.SpouseLN.sendKeys("Jefferson");
			   act.pause(1000).perform();
			   EApp2.SpouseDOB.click();
			   EApp2.SpouseDOB.sendKeys("12061968");
	}

	@Then("Select Military on Eligibility options")
	public void select_Military_on_Eligibility_options() {
		EApp2.Eligibility.click();
	}

	@Then("Select Army on Branch of service")
	public void select_Army_on_Branch_of_service() {
		EApp2.BranchOfService2.click();
	}

	@Then("Select Active Duty Status and Rank option")
	public void select_Active_Duty_Status_and_Rank_option() {
		EApp2.DutyStatus2.click();
		 EApp2.RankO9.click();
	}

	@Then("Select Military Allotment on Contribution Mode option")
	public void select_Military_Allotment_on_Contribution_Mode_option() {
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
	}

	@Then("Input Department code and Source code")
	public void input_Department_code_and_Source_code() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
		EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street information, City and ST Zipcode")
	public void input_Street_information_City_and_ST_Zipcode() {
		 EApp2.Street.sendKeys("9 River Rd");
		  EApp2.Street2.sendKeys("Apt 1229");
		  EApp2.City.sendKeys("Pago Pago");
	      EApp2.State.click();
	      EApp2.State.sendKeys("American Samoa");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("96799");
	}

	@Then("Input Email Address for confimation and Daytime phone numbers")
	public void input_Email_Address_for_confimation_and_Daytime_phone_numbers() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
			EApp2.Phone.sendKeys("7037065961");
			  act.pause(2000).perform();
	}
	

	@Then("Click Show Coverage Options to select Benefitiary plane")
	public void click_Show_Coverage_Options_to_select_Benefitiary_plane() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}
	
	@Then("Waived Better Alternative, Application Member Benefit five thousand K, Fed Term and First Protect")
	public void waived_Better_Alternative_Application_Member_Benefit_five_thousand_K_Fed_Term_and_First_Protect() {
		 EApp2.WaiveBA.click();
		    act.pause(2000).perform();
		    EApp2.spouseCoverage.click();
		    EApp2.WaiveApplication.click();
		    act.pause(2000).perform();
		    EApp2.FedTerm.click();
		    EApp2.WaiveFedTerm.click();
		    act.pause(2000).perform();
		    EApp2.ClickFirstProtect.click();
		    EApp2.WaiveFirstProtect.click();
		    act.pause(2000).perform();
		    
	}

	@Then("Click Senior protect")
	public void click_Senior_protect() {
	   EApp2.SeniorProtect.click();
	}

	@Then("Select NonTobacco for Sponsor and Spouse, select option three")
	public void select_NonTobacco_for_Sponsor_and_Spouse_select_option_three() {
		 EApp2.SeniorProtectOptionThree.click();
		   act.pause(2000).perform();
	}

	@Then("Next page to Answer all Questions")
	public void next_page_to_Answer_all_Questions() {
		  EApp2.NextBtn1.click();
		  EApp2.AnswerNOAll.click();
		    act.pause(2000).perform(); 
		    EApp2.NextBtn2.click();
	}

	@Then("Next page Input sponsor information, Height and Weight")
	public void next_page_Input_sponsor_information_Height_and_Weight() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption5.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("205"); 
	    EApp2.NextBtn3.click();
	}

	@Then("Next page Input Spouse inofrmation, Gender, Height and Weight")
	public void next_page_Input_Spouse_inofrmation_Gender_Height_and_Weight() {
		EApp2.SpouseSSN.click();
		 EApp2.SpouseSSN.sendKeys("545100140");
		 EApp2.SpouseGenderFamale.click();
		 act.pause(1000).perform();
		 EApp2.SpouseHeigthFeet.click();
		 EApp2.SpouseHeightInches.click();
		  act.pause(2000).perform();
		  EApp2.SpouseWeight.click();
		  EApp2.SpouseWeight.sendKeys("150");
		  act.pause(2000).perform();
		   EApp2.Next.click();
	}

	@Then("Next Page for Beneficiaries for senior protect Sponsor Contingent Beneficiary Fullname, SSN, Relationship and DOB")
	public void next_Page_for_Beneficiaries_for_senior_protect_Sponsor_Contingent_Beneficiary_Fullname_SSN_Relationship_and_DOB() {
		 EApp2.SomeoneElseForSponsorContingent.click();
		   EApp2.ContingentBeneficiaryFullName.sendKeys("My Estate");
	//	   EApp2.ContingentBeneficiarySSNnumber.click();
		//	EApp2.ContingentBeneficiarySSNnumber.sendKeys("545100129");
			EApp2.ContingentRelationshipForEstate.click();
//			EApp2.ContingentBeneficiaryDOB.click();
//			EApp2.ContingentBeneficiaryDOB.sendKeys("08081964");
	}

	@Then("Select Contingent Beneficiary of Spouse Coverage FullName, SSN, Relationship and DOB")
	public void select_Contingent_Beneficiary_of_Spouse_Coverage_FullName_SSN_Relationship_and_DOB() {
		 EApp2.SomeOneElseForSpouseContingent.click();
		    act.pause(1000).perform();
		    EApp2.SpouseContingentFN.sendKeys("Gabriella Rinconnes");
		    EApp2.SpouseContingentSSN.sendKeys("545100141");
			   act.pause(2000).perform();
			   EApp2.SpouseContingentRelationshipMother.click();
			   EApp2.spouseContingentDOB.click();
			    EApp2.spouseContingentDOB.sendKeys("04101937");
			    act.pause(2000).perform();
				EApp2.NextBtn6.click();
			    
	}

	@Then("Next page to Email Summary and click Sigining in person and spouse signin button")
	public void next_page_to_Email_Summary_and_click_Sigining_in_person_and_spouse_signin_button() {
		EApp2.EmailSummary2.click();
		 act.pause(3000).perform();
		 EApp2.AcknowledgeofPayment.click();
		 EApp2.SiginingInPerson.click();
		  EApp2.SpouseSigninYes.click();
		  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage and I am ready to sign button")
	public void click_I_agree_to_this_coverage_and_I_am_ready_to_sign_button() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Review Application Ducuments to Continue and Close Application")
	public void review_Application_Ducuments_to_Continue_and_Close_Application() {
		EApp2.ReviewApplicationBtn.click();
		   act.pause(6000).perform();
			 EApp2.CloseBtn.click();
			 act.pause(2000).perform();
	}

	@Then("Input Sponsor Last Name and last SSN numbers for confirm")
	public void input_Sponsor_Last_Name_and_last_SSN_numbers_for_confirm() {
		EApp2.SponsorLastName.sendKeys("Jeddders");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Jefferson");
		 EApp2.SponsorLastSSN.sendKeys("0193");
			EApp2.verifySSN.click();
			act.pause(2000).perform();
			EApp2.SponsorLastSSN.clear();
		   EApp2.SponsorLastSSN.click();
		   EApp2.SponsorLastSSN.sendKeys("0139");
			act.pause(2000).perform();
	}

	@Then("Input Spouse Last Name and last SSN numbers for confirm")
	public void input_Spouse_Last_Name_and_last_SSN_numbers_for_confirm() {
		 EApp2.SpouseLastName.sendKeys("Jefferson");
		   EApp2.SpouseLastSSN.click();
		   EApp2.SpouseLastSSN.sendKeys("0140");
	}

	@Then("Select Paper option radio button")
	public void select_Paper_option_radio_button() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
			EApp2.clickModalBodyBtn.click();
			act.pause(1000).perform();
			EApp2.SignBtn.click();
			act.pause(3000).perform();
	}

	@Then("Click Signin Button for eSignature to application")
	public void click_Signin_Button_for_eSignature_to_application() {
		EApp2.eSignatureBrn.click();
		act.pause(5000).perform();
	}

}
