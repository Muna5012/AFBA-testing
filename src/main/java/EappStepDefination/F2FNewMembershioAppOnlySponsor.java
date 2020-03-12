package EappStepDefination;

import org.openqa.selenium.Keys;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp1;
import pages.EApp2;
import pages.Remote;
import utilities.TestBase;

public class F2FNewMembershioAppOnlySponsor extends TestBase{
	
	@When("HomePage to click Manage cases button")
	public void homepage_to_click_Manage_cases_button() {
		EApp2.Home.click();
		act.pause(2000).perform();
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
	    EApp2.NewEnrollement.click();
	}

	@Then("Input Sponsor SSN")
	public void input_Sponsor_SSN() {
	   EApp2.SSN.click();
	   EApp2.SSN.sendKeys("545200125");
	}

	@Then("Input Enrollement City")
	public void input_Enrollement_City() {
	  EApp2.EnrollmentCity.clear();
	  EApp2.EnrollmentCity.sendKeys("RENO");
	}

	@Then("Input Enrollement State")
	public void input_Enrollement_Staten() {
		act.pause(2000).perform();
	    EApp2.NV.click();
	    act.pause(2000).perform();
	}
	
	@Then("Click the Next Button")
	public void click_the_Next_Button() {
	   EApp1.NextBtn.click();
	}

	@Then("Click Begin Enrollement button")
	public void click_Begin_Enrollement_button() {
      //EApp1.ClickBiginEnrollement.click();
	  EApp1.ClickNewSponsor.click();
	}

	@Then("Input Sponsor firstName, lastName, dateOfBirth and gender")
	public void input_Sponsor_firstName_lastName_dateOfBirth_and_gender() {
	  EApp1.FirstName.sendKeys("NATHAN");
	  EApp1.LastName.sendKeys("ALFSEN");
	  act.pause(1000).perform();
	  EApp1.DOB.click();
	  EApp1.DOB.sendKeys("02031975");
	  EApp2.Gender.click();
	}

	@Then("Select Law Enforcement on Eligibility, Cerdit Card on Contribution Mode")
	public void select_Law_Enforcement_on_Eligibility_Cerdit_Card_on_Contribution_Mode() {
		EApp2.LawEnforcement.click();
		act.pause(1000).perform();
		EApp2.CreditCard.click();
		act.pause(1000).perform();
	}

	@Then("Input DepartmentCode and SourceCode")
	public void input_DepartmentCode_and_SourceCode() {
		EApp1.DepartmentCode.sendKeys("AutomationTest");
		EApp1.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor address, Email addresses and contact numbers")
	public void input_Sponsor_address_Email_addresses_and_contact_numbers() {
	  EApp1.Street.sendKeys("1070 Backer Way");
	  EApp1.City.sendKeys("RENO");
      EApp1.State.click();
      EApp1.State.sendKeys("Nevada");
      EApp1.State.sendKeys(Keys.ENTER);
      act.pause(1000).perform();
      EApp1.ZipCode.click();
      EApp1.ZipCode.sendKeys("89532");
	  EApp1.Phone.click();
	  EApp1.Phone.sendKeys("7037065961");
	  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button")
	public void click_Show_Coverage_Options_button() {
	 EApp1.ShowCoverageOptions.click();
	}
	
	@Then("Select Covered on group free and answer No for first, select Yes on second question")
	public void select_Covered_on_group_free_and_answer_No_for_first_select_Yes_on_second_question() {
	  act.pause(2000).perform();
	  EApp2.Covered.click();
	  EApp2.YesForFirstQuestion.click();
	  act.pause(1000).perform();
	  EApp2.NoForSecondQuestion.click();
	}

	@Then("Select Customize sponsor on FedTem and First Protect")
	public void select_Customize_sponsor_on_FedTem_and_First_Protect() {
		 EApp2.FedTerm.click();
	     EApp2.LT20SponsorCustomize150.click();
		 act.pause(2000).perform();
		 EApp2.ClickFirstProtect.click();
		 EApp2.WaiveFirstProtect.click();
		 act.pause(2000).perform();
		 EApp2.NextBtn1.click();
		 act.pause(2000).perform();
	}

	@Then("Answer all the Questions on next page")
	public void answer_all_the_Questions_on_next_page() {
	  EApp1.AnswerNOAll.click();
	  act.pause(2000).perform();
	  EApp1.NextBtn2.click();
	}

	@Then("Input Sponser Rank or Grade, height and weight on next page")
	public void input_Sponser_Rank_or_Grade_height_and_weight_on_next_page() {
	    EApp1.HeightOption.click();
	    EApp1.HeightInchesOption.click();
	    act.pause(1000).perform();
	    EApp1.Weight.click();
	    EApp1.Weight.sendKeys("221");
		EApp1.NextBtn3.click();
	}
	
	
	@Then("Skip the Spouse and Children Information Page")
	public void skip_the_Spouse_and_Children_Information_Page() {
		EApp1.NextBtn3.click();
	}

	@Then("Input Beneficiary for group free sponsor primary beneficiary full name, SSN, relationship and DOB")
	public void input_Beneficiary_for_group_free_sponsor_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
	    EApp1.BeneficiaryForBetterAlternativeFullname.sendKeys("Al Snow");
	    EApp1.BeneficiarySSN.click();
	    EApp1.BeneficiarySSN.sendKeys("545200030");
	    act.pause(1000).perform();
	    EApp1.BeneficiaryRelationship.click();
	    EApp1.BeneficiaryDOB.click();
	    EApp1.BeneficiaryDOB.sendKeys("12041960");
	    act.pause(2000).perform();
	}

	@Then("Input Beneficiary for group free sponsor contingent beneficiary full name, SSN, relationship and DOB")
	public void input_Beneficiary_for_group_free_sponsor_contingent_beneficiary_full_name_SSN_relationship_and_DOB() {
		EApp1.SomeoneElse.click();
		EApp1.ContingentBeneficiaryFullName.sendKeys("Leo Pugh");
		EApp1.ContingentBeneficiarySSNnumber.click();
		EApp1.ContingentBeneficiarySSNnumber.sendKeys("545200031");
		act.pause(2000).perform();
		EApp1.ContingentBeneficiaryRelationship.click();
		EApp1.ContingentBeneficiaryDOB.click();
		EApp1.ContingentBeneficiaryDOB.sendKeys("05221989");
		act.pause(2000).perform();
		
	}
	
	@Then("Input Beneficiary for Fed Term sponsor primary beneficiary full name, SSN,relationship and DOB")
	public void input_Beneficiary_for_Fed_Term_sponsor_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
	    act.pause(1000).perform();
	    EApp2.SecondPrmaryBenFullName.sendKeys("Guy Best");
	    EApp2.SecondPrimaryBenfSSN.click();
	    EApp2.SecondPrimaryBenfSSN.sendKeys("545200090");
	    EApp2.SecondPrimaryBenRelationship.click();
	    EApp2.SecondPrimaryBenfDOB.click();
		EApp2.SecondPrimaryBenfDOB.sendKeys("10151980");
		act.pause(1000).perform();
		EApp2.NextBtn6.click();
	}

	@Then("Click Email summary btn and input Email address")
	public void click_Email_summary_btn_and_input_Email_address() {
	 act.pause(2000).perform();
	 EApp2.EmailSummary.click();
	 act.pause(1000).perform();
	 EApp2.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
	 EApp2.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
	}
	
	
	@Then("Input Credit Card Number, expiration Date and CVV")
	public void input_Credit_Card_Number_expiration_Date_and_CVV() {
		   Remote.DayOfDeducation1forCreditCard.click();
		    Remote.CreditCardNumber.click();
		    Remote.CreditCardNumber.sendKeys("5800000000000001");
		    Remote.ExpirationDate.click();
		    Remote.ExpirationDate.sendKeys("0420");
		    Remote.CVV.click();
		    Remote.CVV.sendKeys("316");
		    act.pause(2000).perform();
	}
	
	
	@Then("Select signing in person button")
	public void select_signing_in_person_button() {
		EApp2.SiginingInPerson.click();
		act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage and ready to sign button")
	public void click_I_agree_to_this_coverage_and_ready_to_sign_button() {
		EApp2.AgreeToSignInBtn.click();
		act.pause(5000).perform();
	}

	@Then("Click the Review Application Ducuments")
	public void click_the_Review_Application_Ducuments() {
		EApp2.ReviewApplicationBtn.click();
		act.pause(7000).perform();
		EApp2.CloseBtn.click();
		act.pause(2000).perform();
	}
	
	@Then("Input sponsor lastName, Last four SSN number")
	public void input_sponsor_lastName_Last_four_SSN_number() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.sendKeys("ALFSEN");
		 EApp2.SponsorLastSSN.sendKeys("0512");
		 EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastSSN.clear();
		 EApp2.SponsorLastSSN.click();
		 EApp2.SponsorLastSSN.sendKeys("0125");
	}

	@Then("Select Paper radio button and Sign the application")
	public void select_Paper_radio_button_and_Sign_the_application() {
		 EApp2.clickModalBodyBtn.click();
		 act.pause(1000).perform();
		 EApp2.SignBtn.click();
		 act.pause(3000).perform();
		 EApp2.eSignatureBrn.click();
		 act.pause(7000).perform();
	}



}
