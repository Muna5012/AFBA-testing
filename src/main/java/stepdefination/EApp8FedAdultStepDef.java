package stepdefination;

import org.openqa.selenium.Keys;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EApp8FedAdultStepDef extends TestBase{

	@When("Click Manage Cases button")
	public void click_Manage_Cases_button() {
		EApp2.ManageCaseButton.click();
	}

	@Then("Search AFBA cases and click it")
	public void search_AFBA_cases_and_click_it() {
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face Remote");
			act.pause(1000).perform();
		    EApp2.SearchAFBACase.click();
	}
	
	@Then("Click NewEnrollement button to create new case")
	public void click_NewEnrollement_button_to_create_new_case() {
		EApp2.NewEnrollement.click();
	}
	
	@Then("Input Sponsor SSN, Enrollment City, Enrollment State")
	public void input_Sponsor_SSN_Enrollment_City_Enrollment_State() {
		act.pause(1000).perform();
		EApp2.SSN.click();
		 EApp2.SSN.sendKeys("545100133");
		 EApp2.EnrollmentCity.clear();
		 EApp2.EnrollmentCity.sendKeys("Charlotte");
		 act.pause(2000).perform();
		  EApp2.NC.click();
			   act.pause(1000).perform();
			   EApp2.NextBtn.click();
	}

	@Then("click the Begin Enrollement button to create new Case")
	public void click_the_Begin_Enrollement_button_to_create_new_Case() {
		EApp2.BeginEnrollment.click();
		// EApp2.ClickNewSponsor.click();
	}

	@Then("Input the Sponsor FirstName, LastName and DOB")
	public void input_the_Sponsor_FirstName_LastName_and_DOB() {
		 EApp2.FirstName.sendKeys("Allen");
		    EApp2.LastName.sendKeys("Kerr");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("12311964");
	}
	
	@Then("Select the SponsorGender")
	public void select_the_SponsorGender() {
		EApp2.GenderforMale.click();
	}

	@Then("Input Spouse information FirstName, LastName, DOB")
	public void input_Spouse_information_FirstName_LastName_DOB() {
		  EApp2.MarriedBtn.click();
		    act.pause(3000).perform();
		    EApp2.SpouseFN.sendKeys("Donatella");
			   EApp2.SpouseLN.sendKeys("Kerr");
			   act.pause(1000).perform();
			   EApp2.SpouseDOB.click();
			   EApp2.SpouseDOB.sendKeys("03221965");
	}

	@Then("Click Include Children button, input child information first name, last name, DOB")
	public void click_Include_Children_button_input_child_information_first_name_last_name_DOB() {
		EApp2.ChildrenBtn.click();
		act.pause(2000).perform();
		EApp2.ChildOneFN.sendKeys("Demitri");
	    EApp2.ChildOneLN.sendKeys("Kerr");
	    EApp2.ChildOneDOB.click();
	    EApp2.ChildOneDOB.sendKeys("07151994");
	    act.pause(2000).perform();
	}
	
	@Then("Clilk add child button for add more Children")
	public void clilk_add_child_button_for_add_more_Children() {
		EApp2.AddChildBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input second child information first name, last name, DOB")
	public void input_second_child_information_first_name_last_name_DOB() {
		EApp2.ChildTwoFN.sendKeys("Raven");
		EApp2.ChildTwoDOB.click();
		EApp2.ChildTwoDOB.sendKeys("10261994");
	}

	@Then("Select Military on Eligibility option")
	public void select_Military_on_Eligibility_option() {
		EApp2.Eligibility.click();
	}

	@Then("Select Air Force on Branch of service")
	public void select_Air_Force_on_Branch_of_service() {
		EApp2.BranchOfService2.click();
	}

	@Then("Select Active Duty Status")
	public void select_Active_Duty_Status() {
		EApp2.DutyStatus2.click();
	}

	@Then("Select O ten for Rank")
	public void select_O_ten_for_Rank() {
		 EApp2.RankO10.click();
	}

	@Then("Select Militart Allotment on ContributionMode")
	public void select_Militart_Allotment_on_ContributionMode() {
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
	}
	
	@Then("Input Department Code, Source Code")
	public void input_Department_Code_Source_Code() {
		EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street information, City, St Zipcode")
	public void input_Street_information_City_St_Zipcode() {
		 EApp2.Street.sendKeys("7 River Rd");
		  EApp2.Street2.sendKeys("Apt 1227");
		  EApp2.City.sendKeys("Winchester");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Virginia");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();

	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("22604");
	}

	@Then("Input Email Address for confimation")
	public void input_Email_Address_for_confimation() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
	}

	@Then("Input Daytime phone numbers")
	public void input_Daytime_phone_numbers() {
		EApp2.Phone.click();
		EApp2.Phone.sendKeys("7037065961");
		  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options to select Benefitiary plans")
	public void click_Show_Coverage_Options_to_select_Benefitiary_plans() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}
	
	@Then("Waived Better Alternative and Application Member Benefit")
	public void waived_Better_Alternative_and_Application_Member_Benefit() {
		 EApp2.WaiveBA.click();
		    act.pause(2000).perform();
		    EApp2.spouseCoverage.click();
		    EApp2.WaiveApplication.click();
		    act.pause(2000).perform();
	}

	@Then("Select FedTerm Tobacco for Sponsor and Spouse, NonTobacco for two adult kids")
	public void select_FedTerm_Tobacco_for_Sponsor_and_Spouse_NonTobacco_for_two_adult_kids() {
		EApp2.FedTerm.click();
		EApp2.FedTermTobaccoForSponsor.click();
		EApp2.FedTermTobaccoForSpouse.click();
		EApp2.FedTermNOnTobaccoforFirstKid.click();
		EApp2.FedTermNonTobaccoforSecondKid.click();
		act.pause(4000).perform();
	}

	@Then("Select Customize One Hundred Thousand for Spouse and fifty thousand for Sponsor")
	public void select_Customize_One_Hundred_Thousand_for_Spouse_and_fifty_thousand_for_Sponsor() {
	    EApp2.CustomizeOption5.click();
	    EApp2.CustomizeOptionSe1.click();
	    act.pause(3000).perform();
	}

	@Then("Click First Protect select fifty thousand K for two adult kids")
	public void click_First_Protect_select_fifty_thousand_K_for_two_adult_kids() {
	    EApp2.ClickFirstProtect.click();
	    EApp2.FirstProtectCustomizeFirstKid.click();
	    EApp2.FirstProtectCustomizeSecondKid.click();
	    act.pause(4000).perform();
	    EApp2.NextBtn1.click();
	}

	@Then("Click Next button to answer all the questions")
	public void click_Next_button_to_answer_all_the_questions() {
		  EApp2.AnswerNOAll.click();
		    act.pause(2000).perform();
		    EApp2.AnswerYes4.click();
		    EApp2.AnswerYes4click1.click();
		    EApp2.AnswerYes4clickAnswer.sendKeys("Reason one....");
		    act.pause(2000).perform();
		    EApp2.NextBtn2.click();
	}

	@Then("On Next page input Sponsor information, Height and Weight")
	public void on_Next_page_input_Sponsor_information_Height_and_Weight() {
		EApp2.HeightOption.click();
	    EApp2.HeightInchesOption6.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("241"); 
	    EApp2.NextBtn3.click();
	}

	@Then("Next Page input Spouse information, SSN, Gender, Height and Weight")
	public void next_Page_input_Spouse_information_SSN_Gender_Height_and_Weight() {
		 EApp2.SpouseSSN.sendKeys("545100134");
		 EApp2.SpouseGenderFamale.click();
		 act.pause(1000).perform();
		 EApp2.SpouseHeigthFeet.click();
		 EApp2.SpouseHeightInches11.click();
		  act.pause(2000).perform();
		  EApp2.SpouseWeight.click();
		  EApp2.SpouseWeight.sendKeys("159");
	}

	@Then("Input Children information, SSN, Gender, Height, Weight and Relationship")
	public void input_Children_information_SSN_Gender_Height_Weight_and_Relationship() {
		EApp2.ChildOneSSN.sendKeys("545100135");
		EApp2.ChildOneGenderFamale.click();
		EApp2.ChildOneHeight5Feet.click();
		EApp2.ChildOneHeight10Inches.click();
		EApp2.ChildOneWeight.sendKeys("165");
		EApp2.ChildOneRelationship.click();
		act.pause(2000).perform();
		EApp2.ChildTwoSSN.sendKeys("545100136");
		EApp2.ChildTwoGenderMale.click();
		EApp2.ChildTwoHeight5Feet.click();
		EApp2.ChildTwoInches11.click();
		EApp2.ChildTwoWeight.sendKeys("166");
		EApp2.ChildTwoRelationship.click();
		 act.pause(2000).perform();
		   EApp2.Next.click();
	}

	@Then("Next page input Beneficiaries for FedTerm Sponsor Contingent Beneficiary FullName, SSN, Relationship and DOB")
	public void next_page_input_Beneficiaries_for_FedTerm_Sponsor_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		 EApp2.SomeoneElseForSponsorContingent.click();
		   EApp2.ContingentBeneficiaryFullName.sendKeys("Salein Prado");
	//	   EApp2.ContingentBeneficiarySSNnumber.click();
		//	EApp2.ContingentBeneficiarySSNnumber.sendKeys("545100129");
			EApp2.ContingentRelationshipForOther.click();
//			EApp2.ContingentBeneficiaryDOB.click();
//			EApp2.ContingentBeneficiaryDOB.sendKeys("08081964");
	}

	@Then("Input Spouse Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void input_Spouse_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.SomeoneElseForSpousePrimary.click();
		 act.pause(1000).perform();
	    EApp2.SpousePrimarytFN.sendKeys("Lenzo Meiden");
	    EApp2.SpousePrimarytSSN.sendKeys("545100137");
	    EApp2.SpousePrimaryRelationshipother.click();
	    EApp2.SpousePrimaryDOB.click();
	    EApp2.SpousePrimaryDOB.sendKeys("04161964");
	    act.pause(3000).perform();
	}

	@Then("Input Beneficiaries for First Protect Contingent Beneficiary of Demitri FullName, SSN, Relationship and DOB")
	public void input_Beneficiaries_for_First_Protect_Contingent_Beneficiary_of_Demitri_FullName_SSN_Relationship_and_DOB() {
		EApp2.SomeOneElseForFirstProtectContingent.click();
		EApp2.FirstProtectContingentFirstKidFN.sendKeys("Salein Prado");
		EApp2.FirstProtecContingentFirstKidRelationship.click();
	}

	@Then("Input Beneficiaries for First Protect Primary Beneficiary of Raven FullName, SSN, Relationship and DOB")
	public void input_Beneficiaries_for_First_Protect_Primary_Beneficiary_of_Raven_FullName_SSN_Relationship_and_DOB() {
		 EApp2.FirstProtecPrimarySecondKidSomeOneElse.click();
		    act.pause(3000).perform();
		    EApp2.FirstProtectPrimarySecondKidFN.sendKeys("Alvaro Mendez");
		    EApp2.FirstProtectPrimarSecondKidSSN.sendKeys("545100138");
		    EApp2.FirstProtecPrimarySecondKidRelationshipUncle.click();
		    EApp2.FirstProtecPrimarySecondKidDOB.click();
		    EApp2.FirstProtecPrimarySecondKidDOB.sendKeys("12041960");
		    act.pause(3000).perform();
	}

	@Then("Then Input Beneficiaries for First Protect Contingent Beneficiary of Raven FullName, SSN, Relationship and DOB")
	public void then_Input_Beneficiaries_for_First_Protect_Contingent_Beneficiary_of_Raven_FullName_SSN_Relationship_and_DOB() {
	    EApp2.FirstProtecContingentSecondKidSomeOneElse.click();
	    EApp2.FirstProtectContingentSecondKidFN.sendKeys("Donatella Kerr");
	    EApp2.FirstProtectContingentSecondKidSSN.sendKeys("545100134");
	    EApp2.FirstProtecContingentSecondKidRelationship.click();
	    EApp2.FirstProtectContingentSecondKidDOB.click();
	    EApp2.FirstProtectContingentSecondKidDOB.sendKeys("03221965");
	    act.pause(2000).perform();
		EApp2.NextBtn6.click();
		
	}
	
	@Then("Click Email Summary to coverage confirmation to email address")
	public void click_Email_Summary_to_coverage_confirmation_to_email_address() {
		EApp2.EmailSummary.click();
		 act.pause(3000).perform();
//		EApp2.EmailSummaryConfirm1.sendKeys("qapeep19@gmail.com");
//		EApp2.EmailSummaryConfirm2.sendKeys("qapeep19@gmail.com");
		EApp2.AcknowledgeofPayment.click();
		   EApp2.SiginingInPerson.click();
			  act.pause(2000).perform();
	}

	@Then("Click Signing in Person button and Click I agree to this coverage and am ready to sign button")
	public void click_Signing_in_Person_button_and_Click_I_agree_to_this_coverage_and_am_ready_to_sign_button() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Review Application Ducuments to Continue")
	public void review_Application_Ducuments_to_Continue() {
		EApp2.ReviewApplicationBtn.click();
		   act.pause(6000).perform();
			 EApp2.CloseBtn.click();
			 act.pause(2000).perform();
	}

	@Then("Input Sponsor LastName for confirm")
	public void input_Sponsor_LastName_for_confirm() {
		EApp2.SponsorLastName.sendKeys("Perr");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Kerr");
	}

	@Then("Input Sponsor last SSN numbers for confirm")
	public void input_Sponsor_last_SSN_numbers_for_confirm() {
		EApp2.SponsorLastSSN.sendKeys("0113");
		EApp2.verifySSN.click();
		act.pause(2000).perform();
		EApp2.SponsorLastSSN.clear();
	   EApp2.SponsorLastSSN.click();
	   EApp2.SponsorLastSSN.sendKeys("0133");
	}

	@Then("Select Paper Option")
	public void select_Paper_Option() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
			EApp2.clickModalBodyBtn.click();
			act.pause(1000).perform();
			EApp2.SignBtn.click();
			act.pause(3000).perform();
	}

	@Then("Click Sign Button for eSignature to application")
	public void click_Sign_Button_for_eSignature_to_application() {
		EApp2.eSignatureBrn.click();
		act.pause(5000).perform();
	}
}
