package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp1;
import pages.EApp2;
import pages.EApp3;
import utilities.TestBase;

public class F2FNewMembershipAppSponsorSpouseWithAdultChildren extends TestBase {

	@When("Click Manage cases button on Home page")
	public void click_Manage_cases_button_on_Home_page() {
		EApp2.Home.click();
		act.pause(2000).perform();
		EApp2.ManageCaseButton.click();
	}

	@Then("Search AFBA case Manage Cases page")
	public void search_AFBA_case_Manage_Cases_page() {
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
	}

	@Then("Click the AFBA case")
	public void click_the_AFBA_case() {
		act.pause(1000).perform();
	    EApp2.SearchITQAAutomationFace2Face.click();
	}

	@Then("Create the New Enrollement")
	public void create_the_New_Enrollement() {
		EApp2.NewEnrollement.click();
	}

	@Then("Input Sponsor valid SSN number")
	public void input_Sponsor_valid_SSN_number() {
		act.pause(1000).perform();
		EApp2.SSN.click();
		 EApp2.SSN.sendKeys("444444444");
	}

	@Then("Input Sponsor Enrollment City")
	public void input_Sponsor_Enrollment_City() {
		 EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Fuquay Varina");
			act.pause(2000).perform();
	}

	@Then("Input Sponsor Enrollment State")
	public void input_Sponsor_Enrollment_State() {
		  EApp2.NC.click();
		   act.pause(1000).perform();
	}

	@Then("Click Next button to create the case")
	public void click_Next_button_to_create_the_case() {
	  EApp2.NextBtn.click();
	  act.pause(2000).perform();
	  EApp2.SSN.clear();
	  EApp2.SSN.click();
	  EApp2.SSN.sendKeys("656000040");
	  EApp2.NextBtn.click();
	  act.pause(2000).perform();
	}

	@Then("Select Begin Enrollement button")
	public void select_Begin_Enrollement_button() {
	  EApp2.ClickNewSponsor.click();
	 // EApp2.BeginEnrollment.click();
	}

	@Then("Input Sponsor first Name, last Name and DOB")
	public void input_Sponsor_first_Name_last_Name_and_DOB() {
	    EApp2.FirstName.sendKeys("Ruth");
	    EApp2.LastName.sendKeys("Yang");
	    act.pause(1000).perform();
	    EApp2.DOB.click();
	    EApp2.DOB.sendKeys("09161979");
	}

	@Then("Select Sponsor Gender option")
	public void select_Sponsor_Gender_option() {
	    EApp2.Gender.click();
	}
	
	@Then("Click Married button")
	public void click_Married_button() {
	    EApp2.MarriedBtn.click();
	    act.pause(3000).perform();
	}

	@Then("Input Spouse First Name, Last Name and DOB")
	public void input_Spouse_First_Name_Last_Name_and_DOB() {
	   EApp2.SpouseFN.sendKeys("Nixon");
	   EApp2.SpouseLN.sendKeys("Yang");
	   act.pause(1000).perform();
	   EApp2.SpouseDOB.click();
	   EApp2.SpouseDOB.sendKeys("03171989");
	}

	@Then("Click Include Children button")
	public void click_Include_Children_button() {
		EApp2.ChildrenBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input Child one First Name, Last Name, and DOB")
	public void input_Child_one_First_Name_Last_Name_and_DOB() {
	    EApp2.ChildOneFN.sendKeys("Lisa");
	    EApp2.ChildOneLN.sendKeys("Yang");
	    EApp2.ChildOneDOB.click();
	    EApp2.ChildOneDOB.sendKeys("06222004");
	    act.pause(2000).perform();
	}

	@Then("click Add Child button")
	public void click_Add_Child_button() {
		EApp2.AddChildBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input second child first name, last name and DOB")
	public void input_second_child_first_name_last_name_and_DOB() {
		EApp2.ChildTwoFN.sendKeys("Ted");
		EApp2.ChildTwoDOB.click();
		EApp2.ChildTwoDOB.sendKeys("07042005");
	}
	

@Then("Input Child three first name, last name and DOB")
public void input_Child_three_first_name_last_name_and_DOB() {
	EApp2.AddChildBtn.click();
    EApp2.ChildThreeFN.sendKeys("Yan");
    EApp2.ChildThreeDOB.click();
    EApp2.ChildThreeDOB.sendKeys("07052006");
    act.pause(2000).perform();
}


	@Then("Select Fire Department on Eligibility")
	public void select_Fire_Department_on_Eligibility() {
		EApp2.FireDepartment.click();
		 act.pause(2000).perform();
		 EApp2.ContributionMode.click();
		 act.pause(1000).perform();
	}

	@Then("Input Department code and SourceCode")
	public void input_Department_code_and_SourceCode() {
		EApp2.DepartmentCode.sendKeys("AutomationTest");
		EApp2.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor street{int}, street{int}, City, ST, Zip, Emails and contact numbers")
	public void input_Sponsor_street_street_City_ST_Zip_Emails_and_contact_numbers(Integer int1, Integer int2) {
		 EApp2.Street.sendKeys("5 River Rd");
		  EApp2.Street2.sendKeys("Apt 1225");
		  EApp2.City.sendKeys("Pago");
	      EApp2.State.click();
	      EApp2.State.sendKeys("American Samoa");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();

	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("96799");
	      EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		  EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		  EApp2.Phone.click();
		  EApp2.Phone.sendKeys("7037065961");
		  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button to select benefitiary plans")
	public void click_Show_Coverage_Options_button_to_select_benefitiary_plans() {
		 EApp2.ShowCoverageOptions.click();
		    act.pause(1000).perform();
	}

	@Then("Select NonTobacco for Spouse")
	public void select_NonTobacco_for_Spouse() {
	  EApp2.NonTobacco2.click();
	  act.pause(2000).perform();
	}

	@Then("Select Application Member Benefit option Covered it, and select Yes or No questions")
	public void select_Application_Member_Benefit_option_Covered_it_and_select_Yes_or_No_questions() {
		EApp2.spouseCoverage.click();
		EApp2.Covered.click();
//		act.pause(3000).perform();	
//		EApp2.YesForFirstQuestion.click();
//		act.pause(1000).perform();
//		EApp2.YESForSecondQuestion.click();
		act.pause(2000).perform();
	}
	
	
	@Then("Select FedTerm to customize sponsor and spouse")
	public void select_FedTerm_to_customize_sponsor_and_spouse() {
		EApp2.FedTerm.click();
		EApp2.LT20SponsorCustomize100.click();
		act.pause(2000).perform();
		EApp2.LT20CutomizeSpouse100.click();
		act.pause(1000).perform();
	}

	@Then("Select First Protect to customize only sponsor")
	public void select_First_Protect_to_customize_only_sponsor() {
		  EApp2.ClickFirstProtect.click();
		   EApp2.CustomizeFirstOption150.click();
		   EApp2.FirstProtectNobenefitForSpouse.click();
		   act.pause(2000).perform();
		   EApp2.ChildrenProtectClick.click();
		   EApp2.WaiveChildProtect.click();
		   act.pause(2000).perform();
		   EApp2.NextBtn1.click();
		    act.pause(2000).perform();
	}

	@Then("Click Answer No to All Questions buttons")
	public void click_Answer_No_to_All_Questions_buttons() {
	    EApp2.AnswerNOAll.click();
	    act.pause(2000).perform();
	    
	}

	@Then("Click Next button input Sponsor informations")
	public void click_Next_button_input_Sponsor_informations() {
		 EApp2.NextBtn2.click();
		 act.pause(2000).perform();
	}

	@Then("Select Sponser height Feet and Inches option")
	public void select_Sponser_height_Feet_and_Inches_option() {
		EApp2.SponsorRank.sendKeys("E3");
		act.pause(1000).perform();
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption3.click();
	    act.pause(2000).perform();
	}

	@Then("Input Sponsor Weight and click Next button")
	public void input_Sponsor_Weight_and_click_Next_button() {
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("199");
	    act.pause(2000).perform();
	    EApp2.NextBtn3.click();
	}

	@Then("Select Spouse gender")
	public void select_Spouse_gender() {
		EApp2.SpouseSSN.click();
		EApp2.SpouseSSN.sendKeys("656000041");
		EApp2.SpouseGenderMale.click();
		act.pause(1000).perform();
		
	}

	@Then("Select spouse height feet and Inches")
	public void select_spouse_height_feet_and_Inches() {
	    EApp2.SpouseHeigthFeet.click();
	    EApp2.SpouseHeightInches.click();
	    act.pause(2000).perform();
	}

	@Then("Input spouse weight and Click Next button")
	public void input_spouse_weight_and_Click_Next_button() {
	   EApp2.SpouseWeight.click();
	   EApp2.SpouseWeight.sendKeys("142");
		 act.pause(2000).perform();
	   EApp2.Next.click();
	}
	
	@Then("Select group free sponsor Contingent Beneficiary, full name, SSN, relationship, DOB")
	public void select_group_free_sponsor_Contingent_Beneficiary_full_name_SSN_relationship_DOB() {
		EApp1.SomeoneElse.click();
		EApp1.ContingentBeneficiaryFullName.sendKeys("Leo Pugh");
		EApp1.ContingentBeneficiarySSNnumber.click();
		EApp1.ContingentBeneficiarySSNnumber.sendKeys("656000042");
		act.pause(2000).perform();
		EApp1.ContingentBeneficiaryRelationship.click();
		EApp1.ContingentBeneficiaryDOB.click();
		EApp1.ContingentBeneficiaryDOB.sendKeys("05221989");
		act.pause(2000).perform();
	}

	@Then("Select Fed Term sponsor primary beneficiary full name, SSN, relationship and DOB")
	public void select_Fed_Term_sponsor_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
		   EApp3.FedTermSponsorPrmaryBenSOmeOneElse.click();
		   EApp3.FedTermSponsorPrmaryBenFullName.sendKeys("Guy Best");
		    EApp3.FedTermSponsorPrimaryBenfSSN.click();
		    EApp3.FedTermSponsorPrimaryBenfSSN.sendKeys("656000043");
		    EApp3.FedTermSponsorPrimaryBenRelationship2.click();
		    EApp3.FedTermSponsorPrimaryBenfDOB.click();
			EApp3.FedTermSponsorPrimaryBenfDOB.sendKeys("10151980");
	}

	@Then("Select Fed Term Spouse primary beneficiary full name, SSN, relationship and DOB")
	public void select_Fed_Term_Spouse_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
	    EApp3.FedTermSpousePrimarySomeOneElse.click();
	    EApp3.FedTermSpousePrimarytFN.sendKeys("Kim Kobe");
		EApp3.FedTermSpousePrimarytSSN.click();
	    EApp3.FedTermSpousePrimarytSSN.sendKeys("656000044");
	    act.pause(2000).perform();
	    EApp3.FedTermSpousePrimaryRelationshipFather.click();
		EApp3.FedtermSpousePrimaryDOB.click();
		EApp3.FedtermSpousePrimaryDOB.sendKeys("02211975");

	}
	
	@Then("Select First Protect sponsor primary beneficiary full name, SSN, relationship and DOB")
	public void select_First_Protect_sponsor_primary_beneficiary_full_name_SSN_relationship_and_DOB() {
		   EApp3.FirstprotectSponsorPrimarySOE.click();
		    EApp3.FirstprotectSponsorPrimaryFL2.sendKeys("Kurt Kobane");
			EApp3.FirstprotectSponsorPrimarySSN2.click();
		    EApp3.FirstprotectSponsorPrimarySSN2.sendKeys("656000045");
		    act.pause(2000).perform();
		    EApp3.FirstprotectSponsorPrimaryRelationship2.click();
			EApp3.FirstprotectSponsorPrimaryDOB2.click();
			EApp3.FirstprotectSponsorPrimaryDOB2.sendKeys("02211967");
		act.pause(2000).perform();
	    EApp2.NextBtn6.click();
	}
	
	@Then("Select Location for Signing in person on next page")
	public void select_Location_for_Signing_in_person_on_next_page() {
		EApp2.EmailSummary2.click();
		act.pause(3000).perform();
		EApp2.AcknowledgeofPayment.click();
		EApp2.SiginingInPerson.click();
	    act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage button to confirm")
	public void click_I_agree_to_this_coverage_button_to_confirm() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Review Application Ducument Button to review")
	public void click_Review_Application_Ducument_Button_to_review() {
		EApp2.ReviewApplicationBtn.click();
		   act.pause(6000).perform();
	}

	@Then("Close Application document")
	public void close_Application_document() {
		 EApp2.CloseBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Input Sponsor valid LastName")
	public void input_Sponsor_valid_LastName() {
		EApp2.SponsorLastName.sendKeys("pang");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Yang");
	}

	@Then("Input Sponsor last four SSN number")
	public void input_Sponsor_last_four_SSN_number() {
		EApp2.SponsorLastSSN.sendKeys("1112");
		EApp2.verifySSN.click();
		act.pause(2000).perform();
		EApp2.SponsorLastSSN.clear();
	   EApp2.SponsorLastSSN.click();
	   EApp2.SponsorLastSSN.sendKeys("0040");
	}

	@Then("Select Paper Option radio button")
	public void select_Paper_Option_radio_button() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Sign Button to Sign in")
	public void click_Sign_Button_to_Sign_in() {
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign Button for eSignature")
	public void click_Sign_Button_for_eSignature() {
		EApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}




	
	
}
