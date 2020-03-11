package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class NewMembershipwithAdultChild extends TestBase {
	
	@When("Search IT QA Automation Call Center case")
	public void search_IT_QA_Automation_Call_Center_case() {
		EApp2.ManageCaseButton.click();
		EApp2.searchSpace.click();
		EApp2.searchSpace.sendKeys("IT_QA Automation Call Center");
	    act.pause(1000).perform();
		EApp2.SearchITAutomationCallCenter.click();
	}

	@Then("Click New Enrollment btn and Input Sponsor SSN, Enrollment City, State")
	public void click_New_Enrollment_btn_and_Input_Sponsor_SSN_Enrollment_City_State() {
		EApp2.NewEnrollement.click();
		act.pause(2000).perform();
		EApp2.SSN.click();
		act.pause(1000).perform();
		EApp2.SSN.sendKeys("545200100");
		EApp2.EnrollmentCity.clear();
		EApp2.EnrollmentCity.sendKeys("MIAMISBURG");
		act.pause(2000).perform();
		EApp2.OH.click();
		act.pause(1000).perform();
	    EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollment and Input Sponsor FirstName, LastName, Gender and DOB")
	public void click_Begin_Enrollment_and_Input_Sponsor_FirstName_LastName_Gender_and_DOB() {
	    //  EApp2.BeginEnrollment.click();
	    EApp2.ClickNewSponsor.click();
		  EApp2.FirstName.sendKeys("Beths");
		  EApp2.LastName.sendKeys("Abney");
		  act.pause(1000).perform();
		  EApp2.DOB.click();
		  EApp2.DOB.sendKeys("08181971");
	      EApp2.GenderforMale.click();
	}

	@Then("Click Include Children btn to input adult child FirstName, LastName, DOB")
	public void click_Include_Children_btn_to_input_adult_child_FirstName_LastName_DOB() {
		 EApp2.ChildrenBtn.click();
		 act.pause(2000).perform();
		 EApp2.ChildOneFN.sendKeys("Wallace");
	     EApp2.ChildOneLN.sendKeys("Abney");
	     EApp2.ChildOneDOB.click();
	     EApp2.ChildOneDOB.sendKeys("01211994");
	     act.pause(2000).perform();
	}

	@Then("Select Fire Department on Eligibility, Contribution Mode, Department Code, Source Code")
	public void select_Fire_Department_on_Eligibility_Contribution_Mode_Department_Code_Source_Code() {
		 EApp2.FireDepartment.click();
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
		 EApp2.DepartmentCode.sendKeys("AutoTest");
		 EApp2.SourceCode.sendKeys("ATWINTER");
		 
	}

	@Then("Input Street address, city, state and st zipcode, Email address and phone numbers")
	public void input_Street_address_city_state_and_st_zipcode_Email_address_and_phone_numbers() {
		 EApp2.Street.sendKeys("6701 Manning Rd");
		 EApp2.City.sendKeys("MIAMISBURG");
	     EApp2.State.click();
	     EApp2.State.sendKeys("OH");
	     EApp2.State.sendKeys(Keys.ENTER);
	     act.pause(2000).perform();
	     EApp2.ZipCode.click();
	     EApp2.ZipCode.sendKeys("45342");
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
		 EApp2.Phone.sendKeys("7037065961");
		 act.pause(2000).perform();
	}

	@Then("Click Show Coverage options btn to Select Benefitiary Planes")
	public void click_Show_Coverage_options_btn_to_Select_Benefitiary_Planes() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}

	@Then("Select FedTerm Customize Sponsor and No customize for adult child")
	public void select_FedTerm_Customize_Sponsor_and_No_customize_for_adult_child() {
		EApp2.FedTerm.click();
		EApp2.LT20SponsorCustomize100.click();
		act.pause(2000).perform();
		EApp2.LT20NoBenefitforKid.click();
		act.pause(1000).perform();
	}

	@Then("Select First Protect customize adult child")
	public void select_First_Protect_customize_adult_child() {
		EApp2.ClickFirstProtect.click();
		EApp2.FirstProtectNoBenefitForSponse.click();
		act.pause(1000).perform();
		EApp2.FirstProtectKidCustomize100.click();
		act.pause(3000).perform();
	}

	@Then("Select Application Member benefit and select Yes or No Question")
	public void select_Application_Member_benefit_and_select_Yes_or_No_Question() {
		EApp2.spouseCoverage.click();
		EApp2.Covered.click();
		act.pause(3000).perform();	
		EApp2.YesForFirstQuestion.click();
		act.pause(1000).perform();
		EApp2.NoForSecondQuestion.click();
		act.pause(2000).perform();
	}

	@Then("Answer All the Questions on Next Page")
	public void answer_All_the_Questions_on_Next_Page() {
		EApp2.Next.click();
		EApp2.AnswerNOAll.click();
		act.pause(2000).perform(); 
		EApp2.NextBtn2.click();
	}

	@Then("Input sponsor information include Height and Weight")
	public void input_sponsor_information_include_Height_and_Weight() {
	    act.pause(2000).perform();
		EApp2.SponsorRank.sendKeys("E3");
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption5.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("157"); 
	    EApp2.NextBtn3.click();
	}

	@Then("Input adult child SSN, Gender, Height, Weight and Relationship")
	public void input_adult_child_SSN_Gender_Height_Weight_and_Relationship() {
		EApp2.ChildOneSSN.click();
		EApp2.ChildOneSSN.sendKeys("545200101");
		EApp2.ChildOneGenderMale.click();
		EApp2.ChildOneHeight6Feet.click();
		EApp2.ChildOneHeight0Inches.click();
		EApp2.ChildOneWeight.sendKeys("178");
		EApp2.ChildOneRelationshipParent.click();
		act.pause(2000).perform();
		EApp2.Next.click();
		act.pause(1000).perform();
	}

//	@Then("Input BA Sponsor Primary Beneficiary full name, SSN, relationship and DOB")
//	public void input_BA_Sponsor_Primary_Beneficiary_full_name_SSN_relationship_and_DOB() {
//		EApp2.Next.click();
//		act.pause(1000).perform();
//		EApp2.PrimaryBenficiaryFullName.sendKeys("Acka Franck");
//		EApp2.PrimaryBeneficiarySSN.click();
//	    EApp2.PrimaryBeneficiarySSN.sendKeys("545200103");
//	    EApp2.PrimaryBeneficiaryRelationship2.click();
//	    EApp2.PrimaryBeneficiaryDOB.click();
//		EApp2.PrimaryBeneficiaryDOB.sendKeys("11281949");
//		act.pause(2000).perform();
//	}
//
//	@Then("Input Sponsor BA Contingent Beneficiary coverage full name, SSN, relationship and DOB")
//	public void input_Sponsor_BA_Contingent_Beneficiary_coverage_full_name_SSN_relationship_and_DOB() {
//		EApp2.SomeoneElsee.click();
//	    act.pause(1000).perform();
//	    EApp2.ContingentBeneficiaryFullName.sendKeys("My Trust");
//	    EApp2.ContingentRelationshipForTrust.click();
//		act.pause(2000).perform();
//	}

	@Then("Input FetTerm product Sponsor Primary Beneficiary full name, SSN, relationship, DOB")
	public void input_FetTerm_product_Sponsor_Primary_Beneficiary_full_name_SSN_relationship_DOB() {
//		EApp2.SecondPrmaryBenFullName.sendKeys("Adams Anthony");
//		EApp2.SecondPrimaryBenfSSN.click();
//		EApp2.SecondPrimaryBenfSSN.sendKeys("545200104");
//		EApp2.SecondPrimaryBenRelationshipforChild.click();
//		EApp2.SecondPrimaryBenfDOB.click();
//		EApp2.SecondPrimaryBenfDOB.sendKeys("01211994");
//		act.pause(2000).perform();
		act.pause(1000).perform();
		EApp2.PrimaryBenficiaryFullName.sendKeys("Acka Franck");
		EApp2.PrimaryBeneficiarySSN.click();
	    EApp2.PrimaryBeneficiarySSN.sendKeys("545200103");
	    EApp2.PrimaryBeneficiaryRelationship2.click();
	    EApp2.PrimaryBeneficiaryDOB.click();
		EApp2.PrimaryBeneficiaryDOB.sendKeys("11281949");
		act.pause(2000).perform();
	}

//	@Then("Input FedTerm Product Sponsor Contingent Beneficiary full name, SSN, relationship and DOB")
//	public void input_FedTerm_Product_Sponsor_Contingent_Beneficiary_full_name_SSN_relationship_and_DOB() {
////		EApp2.secondSomeOneElse.click();
////		EApp2.SecondContingentBeneficiaryFullName.sendKeys("My Trust");
////		EApp2.SecondContingentBeneficiaryRelationshipforTrust.click();
//		act.pause(2000).perform();
//	}

	@Then("Input First Protect adult child Primary Beneficiary full name, SSN. relastionship and DOB")
	public void input_First_Protect_adult_child_Primary_Beneficiary_full_name_SSN_relastionship_and_DOB() {
		EApp2.SomeOneElseForFirstProtect.click();
		EApp2.FirstProtectPrimaryFirstKidFN.sendKeys("Amy Adams");
		EApp2.FirstProtectPrimaryFirstKidSSN.click();
		EApp2.FirstProtectPrimaryFirstKidSSN.sendKeys("545200105");
		EApp2.FirstProtecPrimaryFirstKidRelationship.click();
		EApp2.FirstProtecPrimaryFirstKidDOB.click();
		EApp2.FirstProtecPrimaryFirstKidDOB.sendKeys("11151963");
		act.pause(2000).perform();
	}

	@Then("Input sponsor Primary Beneficiary full name, SSN, relationship & DOB")
	public void input_sponsor_Primary_Beneficiary_full_name_SSN_relationship_DOB() {
		EApp2.GroupFreeSponsorBeneFL.sendKeys("Nina Adams");
		EApp2.GroupFreeSponsorBeneSSN.click();
		EApp2.GroupFreeSponsorBeneSSN.sendKeys("545200106");
		EApp2.GroupFreeSponsorBeneRelationship.click();
		EApp2.GroupFreeSponsorBeneDOB.click();
		EApp2.GroupFreeSponsorBeneDOB.sendKeys("11151993");
		act.pause(2000).perform();
	}

	@Then("Select Email Summary and select Acknowledgement Military Payment")
	public void select_Email_Summary_and_select_Acknowledgement_Military_Payment() {
		EApp2.NextBtn6.click();
		EApp2.EmailSummary2.click();
		act.pause(3000).perform();
		EApp2.AcknowledgeofPayment.click();
	}

	@Then("Click I agree to this coverage and ready to sign in btn")
	public void click_I_agree_to_this_coverage_and_ready_to_sign_in_btn() {
		EApp2.AgreeToSignInBtn.click();
		act.pause(3000).perform();
	}

	@Then("Select Applicant eSignature btns")
	public void select_Applicant_eSignature_btns() {
		 EApp2.ClickQuestion1.click();
		 EApp2.ClickQuestion2.click();
		 EApp2.ClickQuestion3.click();
		 act.pause(2000).perform();
	}

	@Then("Select recieve documents option for Paper option and click Sign button")
	public void select_recieve_documents_option_for_Paper_option_and_click_Sign_button() {
		EApp2.PaperBtn2.click();
		act.pause(2000).perform();
	}

	@Then("Select Agent Enroller eSignature")
	public void select_Agent_Enroller_eSignature() {
		EApp2.SignBtn2.click();
		act.pause(3000).perform();
		EApp2.eSignatureBrn2.click();
		act.pause(7000).perform();
	}



}
