package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EApp7FedAdultStepdef extends TestBase{

	@When("Home page to click Manage Cases button")
	public void home_page_to_click_Manage_Cases_button() {
		EApp2.ManageCaseButton.click();
	}

	@Then("Search AFBA cases")
	public void search_AFBA_cases() {
		EApp2.searchSpace.click();
		EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face Remote");
	}

	@Then("Click the AFBA case Owner Agent Hugh Wang")
	public void click_the_AFBA_case_Owner_Agent_Hugh_Wang() {
		act.pause(1000).perform();
	    EApp2.SearchAFBACase.click();
	}

	@Then("Click New Enrollement button to create new case")
	public void click_New_Enrollement_button_to_create_new_case() {
		EApp2.NewEnrollement.click();
	}

	@Then("Input Sponsor valid SSN")
	public void input_Sponsor_valid_SSN() {
		act.pause(1000).perform();
		EApp2.SSN.click();
		EApp2.SSN.sendKeys("545100123");
	}

	@Then("Input Sponsor Enrollment city")
	public void input_Sponsor_Enrollment_city() {
		EApp2.EnrollmentCity.clear();
	    EApp2.EnrollmentCity.sendKeys("Ozark");
		act.pause(2000).perform();
	}

	@Then("Select Sponsor Enrollment state")
	public void select_Sponsor_Enrollment_state() {
		 EApp2.MO.click();
		 act.pause(2000).perform();
		 EApp2.NextBtn.click();
	}
	
	@Then("click Begin Enrollement button to create new case")
	public void click_Begin_Enrollement_button_to_create_new_case() {
		//EApp2.BeginEnrollment.click();
		EApp2.ClickNewSponsor.click();
	}

	@Then("Input Sponsor first name, last name and DOB")
	public void input_Sponsor_first_name_last_name_and_DOB() {
		 EApp2.FirstName.sendKeys("Aleia");
		    EApp2.LastName.sendKeys("Dubois");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("05201998");
	}

	@Then("Select Sponsor gender option")
	public void select_Sponsor_gender_option() {
		EApp2.Gender.click();
	}

	@Then("Click marreid button")
	public void click_marreid_button() {
		EApp2.MarriedBtn.click();
	    act.pause(3000).perform();
	}

	@Then("Input Spouse first name, last name, DOB")
	public void input_Spouse_first_name_last_name_DOB() {
		   EApp2.SpouseFN.sendKeys("Barthon");
		   EApp2.SpouseLN.sendKeys("Dubois");
		   act.pause(1000).perform();
		   EApp2.SpouseDOB.click();
		   EApp2.SpouseDOB.sendKeys("10041998");
	}

	@Then("Click include children button")
	public void click_include_children_button() {
		  EApp2.ChildrenBtn.click();
		  act.pause(2000).perform();
	}

	@Then("Input child first name, last name, DOB")
	public void input_child_first_name_last_name_DOB() {
		EApp2.ChildOneFN.sendKeys("Rylie");
	    EApp2.ChildOneLN.sendKeys("Dubois");
	    EApp2.ChildOneDOB.click();
	    EApp2.ChildOneDOB.sendKeys("03211994");
	    act.pause(2000).perform();
	}

	@Then("Clilk add child button for add more child")
	public void clilk_add_child_button_for_add_more_child() {
	    EApp2.AddChildBtn.click();
	}

	@Then("Input second child first name, last name, DOB")
	public void input_second_child_first_name_last_name_DOB() {
	   EApp2.ChildTwoFN.sendKeys("Max");
	   EApp2.ChildTwoDOB.click();
	   EApp2.ChildTwoDOB.sendKeys("03221994");
	}

	@Then("Select Military on Eligibility")
	public void select_Military_on_Eligibility() {
		EApp2.Eligibility.click();
	}

	@Then("Select NOAA on Branch of service")
	public void select_NOAA_on_Branch_of_service() {
	    EApp2.NOAA.click();
	}

	@Then("Select Active Duty on Duty Status")
	public void select_Active_Duty_on_Duty_Status() {
	    EApp2.DutyStatus.click();
	}

	@Then("Select O{int} on Rank")
	public void select_O_on_Rank(Integer int1) {
	    EApp2.RankO7.click();
	}

	@Then("Select Militart Allotment on Contribution Mode")
	public void select_Militart_Allotment_on_Contribution_Mode() {
	   EApp2.ContributionMode.click();
	}

	@Then("Input SourceCode")
	public void input_SourceCode() {
		EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street one, Street two, City, St Zipcode")
	public void input_Street_one_Street_two_City_St_Zipcode() {
		 EApp2.Street.sendKeys("7 River Rd");
		  EApp2.Street2.sendKeys("Apt 1227");
		  EApp2.City.sendKeys("Pago Pago");
	      EApp2.State.click();
	      EApp2.State.sendKeys("American Samoa");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();

	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("96799");
	}

	@Then("Input Email Address, repeat Email address for confimation")
	public void input_Email_Address_repeat_Email_address_for_confimation() {
		 EApp2.EmailAddress.sendKeys("MAbabaikeli@afba.com");
		 EApp2.ReEmailAddress.sendKeys("MAbabaikeli@afba.com");
	}

	@Then("Input phone numbers")
	public void input_phone_numbers() {
		EApp2.Phone.click();
		EApp2.Phone.sendKeys("7037065961");
		act.pause(2000).perform();
	}

	@Then("Click Show Coverage options to select Benefitiary Plans")
	public void click_Show_Coverage_options_to_select_Benefitiary_Plans() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}
	
	@Then("Waived Better Alternative")
	public void waived_Better_Alternative() {
	    EApp2.WaiveBA.click();
	    act.pause(2000).perform();
	}

	@Then("Waived Application Member benefit five thousand K")
	public void waived_Application_Member_benefit_five_thousand_K() {
	    EApp2.spouseCoverage.click();
	    EApp2.WaiveApplication.click();
	    act.pause(2000).perform();
	}

	@Then("Select FedTerm Nontobacco for sponsor and spouse, Tobacco for both kids")
	public void select_FedTerm_Nontobacco_for_sponsor_and_spouse_Tobacco_for_both_kids() {
		EApp2.FedTerm.click();
		
	}

	@Then("Select Sponsor Customize One Hundred Thousand k on Fed Term")
	public void select_Sponsor_Customize_One_Hundred_Thousand_k_on_Fed_Term() {
	   EApp2.TobaccoforFedTermChildOne.click();
	   EApp2.TobaccoforFedTermChildTwo.click();
	   act.pause(4000).perform();
	   
	}

	@Then("Select Spouse Customize One Hundred Thousand K on Fed Term")
	public void select_Spouse_Customize_One_Hundred_Thousand_K_on_Fed_Term() {
	    EApp2.CustomizeOption3.click();
	    EApp2.CustomizeOption4.click();
	    act.pause(4000).perform();
	    
	}

	@Then("Select First Protect to Customize Fifty Thousand K for both kids")
	public void select_First_Protect_to_Customize_Fifty_Thousand_K_for_both_kids() {
		EApp2.ClickFirstProtect.click();
		   act.pause(2000).perform();
		   EApp2.CustomizeOptionforChild1.click();
		   EApp2.CustomizeOptionforChild2.click();
		    act.pause(4000).perform();
		
	}

	@Then("Click Next button for next steps")
	public void click_Next_button_for_next_steps() {
		   EApp2.NextBtn1.click();
		   
	}

	@Then("Answer No to all Questions")
	public void answer_No_to_all_Questions() {
		  EApp2.AnswerNOAll.click();
		    act.pause(2000).perform();
		    EApp2.NextBtn2.click();
	}

	@Then("Select Sponser information, SSN, Height and Weight")
	public void select_Sponser_information_SSN_Height_and_Weight() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption5.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("239"); 
		act.pause(2000).perform();
	    EApp2.NextBtn3.click();
	}

	@Then("Select Spouse information, Gender, Height and Weight")
	public void select_Spouse_information_Gender_Height_and_Weight() {
		 EApp2.SpouseSSN.sendKeys("545100124");
		 EApp2.SpouseGenderMale.click();
		 act.pause(1000).perform();
		 EApp2.SpouseHeigthFeet.click();
		 EApp2.SpouseHeightInches11.click();
		  act.pause(2000).perform();
		  EApp2.SpouseWeight.click();
		  EApp2.SpouseWeight.sendKeys("141");
		
	}

	@Then("Select Children information, Gender, Height, Weight and Relationship")
	public void select_Children_information_Gender_Height_Weight_and_Relationship() {
		EApp2.ChildOneSSN.sendKeys("545100125");
		EApp2.ChildOneGenderFamale.click();
		EApp2.ChildOneHeight5Feet.click();
		EApp2.ChildOneHeight10Inches.click();
		EApp2.ChildOneWeight.sendKeys("169");
		EApp2.ChildOneRelationship.click();
		act.pause(2000).perform();
		EApp2.ChildTwoSSN.sendKeys("545100126");
		EApp2.ChildTwoGenderMale.click();
		EApp2.ChildTwoHeight5Feet.click();
		EApp2.ChildTwoInches11.click();
		EApp2.ChildTwoWeight.sendKeys("171");
		EApp2.ChildTwoRelationship.click();
		 act.pause(2000).perform();
		   EApp2.Next.click();
		
	}
	
	@Then("Select Beneficiary for FedTerm Sponsor Primary Beneficiary  FullName, SSN, Relationship and DOB")
	public void select_Beneficiary_for_FedTerm_Sponsor_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.SomeoneElseForSponsorPrimary.click();
		 act.pause(1000).perform();
		    EApp2.PrimaryBenficiaryFullName.sendKeys("Isabella Macron");
		    EApp2.PrimaryBeneficiarySSN.sendKeys("545100127");
		    EApp2.PrimaryRelationshipBF.click();
		    EApp2.PrimaryBeneficiaryDOB.click();
		    EApp2.PrimaryBeneficiaryDOB.sendKeys("09241978");
		    act.pause(2000).perform();
		
	}

	@Then("Select Beneficiary for FedTerm Sponsor Contingent Beneficiary FullName, SSN, Relationship and DOB")
	public void select_Beneficiary_for_FedTerm_Sponsor_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	   EApp2.SomeoneElseForSponsorContingent.click();
	   EApp2.ContingentBeneficiaryFullName.sendKeys("Aldo Marteen");
	   EApp2.ContingentBeneficiarySSNnumber.click();
		EApp2.ContingentBeneficiarySSNnumber.sendKeys("545100129");
		EApp2.ContingentRelationUncle.click();
		EApp2.ContingentBeneficiaryDOB.click();
		EApp2.ContingentBeneficiaryDOB.sendKeys("08081964");
		
	}

	@Then("Select Beneficiary for FedTerm Spouse Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void select_Beneficiary_for_FedTerm_Spouse_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.SomeoneElseForSpousePrimary.click();
		 act.pause(1000).perform();
	    EApp2.SpousePrimarytFN.sendKeys("Qui LeGard");
	    EApp2.SpousePrimarytSSN.sendKeys("545100128");
	    EApp2.SpousePrimaryRelationship.click();
	    EApp2.SpousePrimaryDOB.click();
	    EApp2.SpousePrimaryDOB.sendKeys("11041978");
	    act.pause(2000).perform();
	}

	@Then("Select Beneficiary for FedTerm Spouse Contingent Beneficiary FullName, SSN, Relationship and DOB")
	public void select_Beneficiary_for_FedTerm_Spouse_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	    EApp2.SomeOneElseForSpouseContingent.click();
	    act.pause(1000).perform();
	    EApp2.SpouseContingentFN.sendKeys("Pilo Tobar");
	    EApp2.SpouseContingentSSN.sendKeys("545100130");
		   act.pause(2000).perform();
		   EApp2.SpouseContingentRelationship.click();
		   EApp2.spouseContingentDOB.click();
		    EApp2.spouseContingentDOB.sendKeys("12011963");
	}

	@Then("Select Beneficiaries for Frist Protect first child Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void select_Beneficiaries_for_Frist_Protect_first_child_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	  EApp2.SomeOneElseForFirstProtect.click();
	    act.pause(2000).perform();
	  EApp2.FirstProtectPrimaryFirstKidFN.sendKeys("Kane Boyd");
	  EApp2.FirstProtectPrimaryFirstKidSSN.sendKeys("545100131");
	  EApp2.FirstProtecPrimaryFirstKidRelationship.click();
	  EApp2.FirstProtecPrimaryFirstKidDOB.click();
	  EApp2.FirstProtecPrimaryFirstKidDOB.sendKeys("07151982");
	  act.pause(2000).perform();
	}

	@Then("Select Beneficiaries for Frist Protect second child Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void select_Beneficiaries_for_Frist_Protect_second_child_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	    EApp2.FirstProtecPrimarySecondKidSomeOneElse.click();
	    act.pause(2000).perform();
	    EApp2.FirstProtectPrimarySecondKidFN.sendKeys("Miles Yo");
	    EApp2.FirstProtectPrimarSecondKidSSN.sendKeys("545100132");
	    EApp2.FirstProtecPrimarySecondKidRelationship.click();
	    EApp2.FirstProtecPrimarySecondKidDOB.click();
	    EApp2.FirstProtecPrimarySecondKidDOB.sendKeys("12061982");
	    act.pause(2000).perform();
		EApp2.NextBtn6.click();
	}
	
	@Then("Click Signin person option")
	public void click_Signin_person_option() {
		EApp2.AcknowledgeofPayment.click();
		   EApp2.SiginingInPerson.click();
			  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage sigin button")
	public void click_I_agree_to_this_coverage_sigin_button() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Review Application Ducuments to Continue Button and close it")
	public void click_Review_Application_Ducuments_to_Continue_Button_and_close_it() {
		EApp2.ReviewApplicationBtn.click();
		   act.pause(6000).perform();
			 EApp2.CloseBtn.click();
			 act.pause(2000).perform();
	}

	@Then("Input Sponsor Last Name for confirmation")
	public void input_Sponsor_Last_Name_for_confirmation() {
		EApp2.SponsorLastName.sendKeys("DUbios");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("DuBois");
	}

	@Then("Input Sponsor last four SSN numbers for confirmation")
	public void input_Sponsor_last_four_SSN_numbers_for_confirmation() {
		EApp2.SponsorLastSSN.sendKeys("0023");
		EApp2.verifySSN.click();
		act.pause(2000).perform();
		EApp2.SponsorLastSSN.clear();
	   EApp2.SponsorLastSSN.click();
	   EApp2.SponsorLastSSN.sendKeys("0123");
	}

	@Then("Select Paper Option for receive the document")
	public void select_Paper_Option_for_receive_the_document() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign Button for eSignature to this applications")
	public void click_Sign_Button_for_eSignature_to_this_applications() {
		EApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}


	
	
	
	
}
