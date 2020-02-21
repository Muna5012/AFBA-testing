package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EAppProductionIssue1 extends TestBase{

	@When("Search IT_QA Automation Face to Face cases and create a new case")
	public void search_IT_QA_Automation_Face_to_Face_cases_and_create_a_new_case() {
		EApp2.Home.click();
		act.pause(2000).perform();
		EApp2.ManageCaseButton.click();
		EApp2.searchSpace.click();
		EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
		EApp2.SearchITQAAutomationFace2Face.click();
		act.pause(2000).perform();
		EApp2.NewEnrollement.click();
		
	}

	@Then("Enter sponsor SSN, Enrollment City, Enrollment State and Begin Enrollment")
	public void enter_sponsor_SSN_Enrollment_City_Enrollment_State_and_Begin_Enrollment() {
		EApp2.SSN.click();
		EApp2.SSN.sendKeys("545200100");
		EApp2.EnrollmentCity.clear();
		EApp2.EnrollmentCity.sendKeys("Bath");
		act.pause(2000).perform();
		EApp2.NC.click();
		act.pause(1000).perform();
		EApp2.NextBtn.click();
		EApp2.BeginEnrollment.click();
	//    EApp2.ClickNewSponsor.click();
	}

	@Then("Enter Sponsor first name, last name, gender and DOB")
	public void enter_Sponsor_first_name_last_name_gender_and_DOB() {
		EApp2.FirstName.sendKeys("Emma");
		EApp2.LastName.sendKeys("Ethan");
		act.pause(1000).perform();
		EApp2.DOB.click();
		EApp2.DOB.sendKeys("12061989");
		EApp2.GenderforMale.click();
	}

	@Then("Select Eligibility, Contribution Mode, Branch of service, Duty Status, Rank, Department Code and Source Code")
	public void select_Eligibility_Contribution_Mode_Branch_of_service_Duty_Status_Rank_Department_Code_and_Source_Code() {
		  EApp2.Eligibility.click();
		  EApp2.ContributionMode.click();
		  EApp2.BranchOfArmyService.click();
		  EApp2.DutyStatus.click();
		  EApp2.Rank3.click();
		  act.pause(2000).perform();
		  EApp2.DepartmentCode.sendKeys("AutoTest");
		  EApp2.SourceCode.sendKeys("AT1");
		  
	}

	@Then("Enter Street address, City, State, Zipcode")
	public void enter_Street_address_City_State_Zipcode() {
		 EApp2.Street.sendKeys("13 River Rd");
		 EApp2.Street2.sendKeys("Apt 1232");
		 EApp2.City.sendKeys("Paris");
	     EApp2.State.click();
	     EApp2.State.sendKeys("Virginia");
	     EApp2.State.sendKeys(Keys.ENTER);
	     act.pause(1000).perform();

	     EApp2.ZipCode.click();
	     EApp2.ZipCode.sendKeys("20130");
		  
	}

	@Then("Enter Email address and repeat Email address for confirmatin and Enter Daytime Phone numbers")
	public void enter_Email_address_and_repeat_Email_address_for_confirmatin_and_Enter_Daytime_Phone_numbers() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
		 EApp2.Phone.sendKeys("7037065961");
		 act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button to select the benefit plan")
	public void click_Show_Coverage_Options_button_to_select_the_benefit_plan() {
		  EApp2.ShowCoverageOptions.click();
		  act.pause(1000).perform();
	}

	@Then("Select BA and customize")
	public void select_BA_and_customize() {
		 EApp2.NonTobacco.click();
		    EApp2.CustomizeOption2.click();
		    act.pause(2000).perform();
	}

	@Then("Select Application Member Benefit Covered and vaived Fed Term and First Protect")
	public void select_Application_Member_Benefit_Covered_and_vaived_Fed_Term_and_First_Protect() {
		  EApp2.spouseCoverage.click();
		  EApp2.Covered.click();
		  act.pause(2000).perform();
		    EApp2.FedTerm.click();
			EApp2.WaiveFedTerm.click();
			act.pause(2000).perform();
			EApp2.ClickFirstProtect.click();
			EApp2.WaiveFirstProtect.click();
			act.pause(2000).perform();
			   EApp2.NextBtn1.click();
	}
	
	@Then("Answer all the questions which include other Insuarance")
	public void answer_all_the_questions_which_include_other_Insuarance() {
		 EApp2.AnswerNOAll.click();
		  act.pause(2000).perform();
		  EApp2.NextBtn2.click();
	}

	@Then("Select sponsor Height and Weight")
	public void select_sponsor_Height_and_Weight() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption4.click();
	    act.pause(1000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("201");
	    EApp2.NextBtn3.click();
	    act.pause(1000).perform();
		EApp2.NextBtn3.click();
	}

	@Then("Enter Sponsor Better Alternative Primary Beneficiary full name, SSN, relationship and DOB")
	public void enter_Sponsor_Better_Alternative_Primary_Beneficiary_full_name_SSN_relationship_and_DOB() {
		 EApp2.PrimaryBenficiaryFullName.sendKeys("Ball Lucy");
		 EApp2.PrimaryBeneficiarySSN.click();
		 EApp2.PrimaryBeneficiarySSN.sendKeys("545200092");
		 EApp2.PrimaryRelationship.click();
		 EApp2.PrimaryBeneficiaryDOB.click();
		 EApp2.PrimaryBeneficiaryDOB.sendKeys("10101980");
		 act.pause(2000).perform();
		 
	}

	@Then("Enter Sponsor Better Alternative Contingent Beneficiary full name, SSN, relationship and DOB")
	public void enter_Sponsor_Better_Alternative_Contingent_Beneficiary_full_name_SSN_relationship_and_DOB() {
		EApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	    EApp2.ContingentBeneficiaryFullName.sendKeys("Best Guy");
	    EApp2.ContingentBeneficiarySSNnumber.click();
	    EApp2.ContingentBeneficiarySSNnumber.sendKeys("545200093");
		EApp2.ContingentRelationship.click();
		EApp2.ContingentBeneficiaryDOB.click();
		EApp2.ContingentBeneficiaryDOB.sendKeys("10151980");
		act.pause(1000).perform();
	}

	@Then("Enter Sponsor Application Member Benefit primary beneficiary full name, SSN, Relationship and DOB")
	public void enter_Sponsor_Application_Member_Benefit_primary_beneficiary_full_name_SSN_Relationship_and_DOB() {
	    EApp2.SecondPrmaryBenFullName.sendKeys("Bella Luna");
	    EApp2.SecondPrimaryBenfSSN.click();
	    EApp2.SecondPrimaryBenfSSN.sendKeys("545200094");
		EApp2.SecondPrimaryBenRelationship2.click();
		EApp2.SecondPrimaryBenfDOB.click();
		EApp2.SecondPrimaryBenfDOB.sendKeys("10161970");
		act.pause(1000).perform();

	  
	}

	@Then("Enter Sponsor Application Member Benefit contingent beneficiary full name, SSN, Relationship and DOB")
	public void enter_Sponsor_Application_Member_Benefit_contingent_beneficiary_full_name_SSN_Relationship_and_DOB() {
		EApp2.secondSomeOneElse.click();
	    act.pause(1000).perform();
	    EApp2.SecondContingentBeneficiaryFullName.sendKeys("Toms John");
	    EApp2.SecondContingentBeneficiarySSN.click();
	    EApp2.SecondContingentBeneficiarySSN.sendKeys("545200095");
		EApp2.SecondContingentBeneficiaryRelationship.click();
		EApp2.SecondContingentBeneficiaryDOB.click();
		EApp2.SecondContingentBeneficiaryDOB.sendKeys("10151980");
		act.pause(1000).perform();
		EApp2.NextBtn6.click();
		
	}

	@Then("Select Acknowledgement of Military Allotment Method of Payment")
	public void select_Acknowledgement_of_Military_Allotment_Method_of_Payment() {
		EApp2.AcknowledgeofPayment.click();
	    act.pause(2000).perform();
	}

	@Then("Click Sigining in Person button and click Agree to this coverage and ready to sign button")
	public void click_Sigining_in_Person_button_and_click_Agree_to_this_coverage_and_ready_to_sign_button() {
		EApp2.SiginingInPerson.click();
		act.pause(2000).perform();
		EApp2.AgreeToSignInBtn.click();
		act.pause(2000).perform();
	}

	@Then("Select Review Application Documents button to review all the document")
	public void select_Review_Application_Documents_button_to_review_all_the_document() {
		EApp2.ReviewApplicationBtn.click();
		 act.pause(7000).perform();
		 EApp2.CloseBtn.click();
		 act.pause(2000).perform();
	}

	@Then("select receive insurance notices and document via Paper option")
	public void select_receive_insurance_notices_and_document_via_Paper_option() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Enter Sponsor last name, last four SSN Number and select Sigin")
	public void enter_Sponsor_last_name_last_four_SSN_Number_and_select_Sigin() {
		EApp2.SponsorLastName.sendKeys("Ethan");
		act.pause(2000).perform();
		EApp2.SponsorLastSSN.click();
	    EApp2.SponsorLastSSN.sendKeys("0100");
	    act.pause(2000).perform();
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
		EApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}
	
	@Then("On Main page search the name of sponsor")
	public void on_Main_page_search_the_name_of_sponsor() {
		EApp2.SearchSponsorName.click();
		EApp2.SearchSponsorName.sendKeys("Ethan");
		act.pause(1000).perform();
	}

	@Then("Click Add Coverage Button")
	public void click_Add_Coverage_Button() {
	  EApp2.AddCoveragebtn.click();
	  act.pause(3000).perform();
	}

	@Then("Change Sponsor first name, last name")
	public void change_Sponsor_first_name_last_name() {
		EApp2.FirstName.clear();
		EApp2.FirstName.sendKeys("James");
		EApp2.LastName.clear();
		EApp2.LastName.sendKeys("Alexander");
		act.pause(1000).perform();
		EApp2.DOB.click();
		EApp2.DOB.sendKeys("12061989");
		EApp2.GenderforMale.click();
	}

	@Then("Select Eligibility, Service, Status, Rank, Contribution Mode, Department Code and Source Code")
	public void select_Eligibility_Service_Status_Rank_Contribution_Mode_Department_Code_and_Source_Code() {
		 EApp2.Eligibility.click();
		  EApp2.ContributionMode.click();
		  EApp2.NOAA.click();
		  EApp2.DutyStatus2.click();
		  EApp2.Rank6.click();
		  act.pause(2000).perform();
		  EApp2.DepartmentCode.sendKeys("AutoTest");
		  EApp2.SourceCode.sendKeys("AT1");
		  act.pause(2000).perform();
	}

	@Then("Enter Email Address and click Show Coverage Options")
	public void enter_Email_Address_and_click_Show_Coverage_Options() {
		// EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 act.pause(2000).perform();
		  EApp2.ShowCoverageOptions.click();
		  act.pause(1000).perform();
	}

	@Then("Select BA and Coverage, Covered Application Member, Waived Fed Term, and FirstProtect")
	public void select_BA_and_Coverage_Covered_Application_Member_Waived_Fed_Term_and_FirstProtect() {
		 EApp2.NonTobacco.click();
		    EApp2.CustomizeOption2.click();
		    act.pause(2000).perform();
		    EApp2.spouseCoverage.click();
			  EApp2.Covered.click();
			  act.pause(2000).perform();
			    EApp2.FedTerm.click();
				EApp2.WaiveFedTerm.click();
				act.pause(2000).perform();
				EApp2.ClickFirstProtect.click();
				EApp2.WaiveFirstProtect.click();
				act.pause(2000).perform();
				   EApp2.NextBtn1.click();
	}

	@Then("Answer all the questions Yes or No")
	public void answer_all_the_questions_Yes_or_No() {
		 EApp2.AnswerNOAll.click();
		  act.pause(2000).perform();
		  EApp2.NextBtn2.click();
	}

	@Then("Select Sponsor SSN and change it")
	public void select_Sponsor_SSN_and_change_it() {
	    EApp2.ChangeSponsorSSN.click();
	    EApp2.ChangeSponsorSSN.clear();
	    act.pause(2000).perform();
	    EApp2.ChangeSponsorSSN.click();
	    EApp2.ChangeSponsorSSN.sendKeys("545200101");
	    EApp2.NextBtn3.click();
	    act.pause(1000).perform();
		EApp2.NextBtn3.click();
	    
	}

	@Then("Enter Sponsor BA primary Beneficiary full name, SSN, Relationship and DOB")
	public void enter_Sponsor_BA_primary_Beneficiary_full_name_SSN_Relationship_and_DOB() {
		 EApp2.PrimaryBenficiaryFullName.sendKeys("Ball Lucy");
		 EApp2.PrimaryBeneficiarySSN.click();
		 EApp2.PrimaryBeneficiarySSN.sendKeys("545200092");
		 EApp2.PrimaryRelationship.click();
		 EApp2.PrimaryBeneficiaryDOB.click();
		 EApp2.PrimaryBeneficiaryDOB.sendKeys("10101980");
		 act.pause(2000).perform();
	}

	@Then("Enter Sponsor Contingent Beneficiary full name, SSN, Relationship and DOB")
	public void enter_Sponsor_Contingent_Beneficiary_full_name_SSN_Relationship_and_DOB() {
		EApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	    EApp2.ContingentBeneficiaryFullName.sendKeys("Best Guy");
	    EApp2.ContingentBeneficiarySSNnumber.click();
	    EApp2.ContingentBeneficiarySSNnumber.sendKeys("545200093");
		EApp2.ContingentRelationship.click();
		EApp2.ContingentBeneficiaryDOB.click();
		EApp2.ContingentBeneficiaryDOB.sendKeys("10151980");
		act.pause(1000).perform();
	}

	@Then("Enter Sponsor Application Member Benefit primary Beneficiary full name, SSN, Relationship and DOB")
	public void enter_Sponsor_Application_Member_Benefit_primary_Beneficiary_full_name_SSN_Relationship_and_DOB() {
		  EApp2.SecondPrmaryBenFullName.sendKeys("Bella Luna");
		    EApp2.SecondPrimaryBenfSSN.click();
		    EApp2.SecondPrimaryBenfSSN.sendKeys("545200094");
			EApp2.SecondPrimaryBenRelationship2.click();
			EApp2.SecondPrimaryBenfDOB.click();
			EApp2.SecondPrimaryBenfDOB.sendKeys("10161970");
			act.pause(1000).perform();
	}

	@Then("Enter Sponsor Application Member Benefit Contingent Beneficiary full name, SSN, Relationship and DOB")
	public void enter_Sponsor_Application_Member_Benefit_Contingent_Beneficiary_full_name_SSN_Relationship_and_DOB() {
		EApp2.secondSomeOneElse.click();
	    act.pause(1000).perform();
	    EApp2.SecondContingentBeneficiaryFullName.sendKeys("Toms John");
	    EApp2.SecondContingentBeneficiarySSN.click();
	    EApp2.SecondContingentBeneficiarySSN.sendKeys("545200095");
		EApp2.SecondContingentBeneficiaryRelationship.click();
		EApp2.SecondContingentBeneficiaryDOB.click();
		EApp2.SecondContingentBeneficiaryDOB.sendKeys("10151980");
		act.pause(1000).perform();
		EApp2.NextBtn6.click();
	}

	@Then("Select Military Allotment Method of Payment and Sigining in Person button")
	public void select_Military_Allotment_Method_of_Payment_and_Sigining_in_Person_button() {
		EApp2.AcknowledgeofPayment.click();
	    act.pause(2000).perform();
	    EApp2.SiginingInPerson.click();
		act.pause(2000).perform();
	}

	@Then("click Agree to this coverage sign button")
	public void click_Agree_to_this_coverage_sign_button() {
		EApp2.AgreeToSignInBtn.click();
		act.pause(2000).perform();
	}

	@Then("Select Review Application Documents button to review all the document and select receive document via Paper option")
	public void select_Review_Application_Documents_button_to_review_all_the_document_and_select_receive_document_via_Paper_option() {
		EApp2.ReviewApplicationBtn.click();
		 act.pause(7000).perform();
		 EApp2.CloseBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Enter Sponsor last name, last four SSN Number and select Sigin in button to sigin")
	public void enter_Sponsor_last_name_last_four_SSN_Number_and_select_Sigin_in_button_to_sigin() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.sendKeys("Alexander");
			act.pause(2000).perform();
			EApp2.SponsorLastSSN.click();
		    EApp2.SponsorLastSSN.sendKeys("0101");
		    act.pause(2000).perform();
			EApp2.clickModalBodyBtn.click();
			act.pause(1000).perform();
			EApp2.SignBtn.click();
			act.pause(3000).perform();
			EApp2.eSignatureBrn.click();
			act.pause(7000).perform();
	}

	
	
	
	
}
