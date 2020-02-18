package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EAppFaceToFace5 extends TestBase {

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
	  EApp2.SSN.sendKeys("545200043");
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


	@Then("Select Eligibility, Contribution Mode, BranchOfService, Duty Status and Rank")
	public void select_Eligibility_Contribution_Mode_BranchOfService_Duty_Status_and_Rank() {
		EApp2.Eligibility.click();
	    EApp2.ContributionMode.click();
	    EApp2.BranchOfService2.click();
	    EApp2.DutyStatus2.click();
	    EApp2.Rank7.click();
	    act.pause(2000).perform();
	}

	@Then("Input Department code and SourceCode")
	public void input_Department_code_and_SourceCode() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
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
	
	@Then("Select Better Alternative Tobacco for sponsor")
	public void select_Better_Alternative_Tobacco_for_sponsor() {
		 EApp2.Tobacco.click();
		 act.pause(2000).perform();
	}

	@Then("Select NonTobacco for Spouse")
	public void select_NonTobacco_for_Spouse() {
	  EApp2.NonTobacco2.click();
	  act.pause(2000).perform();
	}

	@Then("Select Option three and select coverage for childrens option")
	public void select_Option_three_and_select_coverage_for_childrens_option() {
	   EApp2.SponserCoverageOption3.click();
	   act.pause(2000).perform();
	   EApp2.ChildCoverageClick.click();
	   EApp2.ChildrenCoverageOption5.click();
	   act.pause(4000).perform();
	   
	}

	@Then("Click the Application Member Benefit option")
	public void click_the_Application_Member_Benefit_option() {
	   EApp2.spouseCoverage.click();
	   act.pause(2000).click();
	   EApp2.Covered.click();
	   EApp2.FedTerm.click();
	   EApp2.CustomizeOption5.click();
	   act.pause(2000).perform();
	   EApp2.CustomizeOptionSe1.click();
	   act.pause(2000).perform();
	 //  EApp2.WaiveFedTerm.click();
	   EApp2.ClickFirstProtect.click();
	   EApp2.CustomizeFirstOption150.click();
	   EApp2.ClickFirstProtectSpouseCustomize.click();
	 //  EApp2.WaiveFirstProtect.click();
	   act.pause(2000).perform();
	   EApp2.ChildrenProtectClick.click();
	   EApp2.WaiveChildProtect.click();
	   act.pause(2000).perform();
	   EApp2.NextBtn1.click();
	}

	@Then("Click Answer No to All Questions buttons")
	public void click_Answer_No_to_All_Questions_buttons() {
	    EApp2.AnswerNOAll.click();
	    act.pause(2000).perform();
	    
	}

	@Then("Click Next button input Sponsor informations")
	public void click_Next_button_input_Sponsor_informations() {
		 EApp2.NextBtn2.click();
	}

	@Then("Select Sponser height Feet and Inches option")
	public void select_Sponser_height_Feet_and_Inches_option() {
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
		EApp2.SpouseSSN.sendKeys("555555555");
//		EApp2.SpouseSSN.sendKeys("545200044");
//		EApp2.SpouseGenderMale.click();
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
	   EApp2.SpouseSSN.sendKeys("545200044");
	   act.pause(2000).perform();
		EApp2.SpouseGenderMale.click();
		 act.pause(2000).perform();
	   EApp2.Next.click();
	}
	
	@Then("Select Someone else for BA Contingent Beneficiary of Sponsor Coverage")
	public void select_Someone_else_for_BA_Contingent_Beneficiary_of_Sponsor_Coverage() {
	    EApp2.SomeoneElsee.click();
	}

	@Then("Input Sponsor Contingent Beneficiary full name")
	public void input_Sponsor_Contingent_Beneficiary_full_name() {
	    EApp2.ContingentBeneficiaryFullName.sendKeys("Hyman Roth");
	}

	@Then("Input Sponsor Contingent Beneficiary SSN")
	public void input_Sponsor_Contingent_Beneficiary_SSN() {
		EApp2.ContingentBeneficiarySSNnumber.click();
		EApp2.ContingentBeneficiarySSNnumber.sendKeys("545200045");
	}

	@Then("Select Sponsor Relationship for Contingent Beneficiary")
	public void select_Sponsor_Relationship_for_Contingent_Beneficiary() {
		 act.pause(2000).perform();
	    EApp2.ContingentRelationshipForOther.click();
	}

	@Then("Input Sponsor Contingent Beneficiary DOB")
	public void input_Sponsor_Contingent_Beneficiary_DOB() {
		 act.pause(2000).perform();
	    EApp2.ContingentBeneficiaryDOB.click();
	    EApp2.ContingentBeneficiaryDOB.sendKeys("11011959");
	}

	@Then("Select Someone else for BA Contingent Beneficiary of Spouse Coverage")
	public void select_Someone_else_for_BA_Contingent_Beneficiary_of_Spouse_Coverage() {
		 act.pause(2000).perform();
		EApp2.SomeOneElseforSpouse.click();
	}

	@Then("Input Spouse Contingent Beneficiary full name")
	public void input_Spouse_Contingent_Beneficiary_full_name() {
	    EApp2.SpouseContingentFN.sendKeys("Ma Barker");
	}

	@Then("Input Spouse Contingent Beneficiary SSN")
	public void input_Spouse_Contingent_Beneficiary_SSN() {
		  EApp2.SpouseContingentSSN.click();
	   EApp2.SpouseContingentSSN.sendKeys("545200046");
	   act.pause(2000).perform();
	   EApp2.SpouseContingentRelationship.click();
	}

	@Then("Select Spouse Contingent Beneficiary DOB")
	public void select_Spouse_Contingent_Beneficiary_DOB() {
	    EApp2.spouseContingentDOB.click();
	    EApp2.spouseContingentDOB.sendKeys("08281958");
	    
	}

	@Then("Select Someone else for Primary Beneficiary for Application Member Benefit")
	public void select_Someone_else_for_Primary_Beneficiary_for_Application_Member_Benefit() {
		 act.pause(2000).perform();
	    EApp2.SomeOneEleseForApp.click();
	}

	@Then("Input Sponsor Primary Beneficiary full name")
	public void input_Sponsor_Primary_Beneficiary_full_name() {
	   EApp2.SecondPrmaryBenFullName.sendKeys("Kurt Kobane");
	}

	@Then("Input Sponsor Primary Beneficiary SSN")
	public void input_Sponsor_Primary_Beneficiary_SSN() {
		EApp2.SecondPrimaryBenfSSN.click();
	   EApp2.SecondPrimaryBenfSSN.sendKeys("545200047");
	   act.pause(2000).perform();
	}

	@Then("Select Relationship for the Primary Beneficiary")
	public void select_Relationship_for_the_Primary_Beneficiary() {
	    EApp2.SecondPrimaryBenRelationship3.click();
	}

	@Then("Input Sponsor Primary Beneficiary DOB")
	public void input_Sponsor_Primary_Beneficiary_DOB() {
		EApp2.SecondPrimaryBenfDOB.click();
		EApp2.SecondPrimaryBenfDOB.sendKeys("02211967");
		 act.pause(2000).perform();
	}

	@Then("Click Next button Confirm all the application")
	public void click_Next_button_Confirm_all_the_application() {
	    EApp2.NextBtn6.click();
	}
	
	@Then("Select Location for Signing in person")
	public void select_Location_for_Signing_in_person() {
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
	   EApp2.SponsorLastSSN.sendKeys("0043");
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
