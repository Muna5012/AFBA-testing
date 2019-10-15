package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EApp15BAFedTSeniorProFirstProStepDef extends TestBase{

	@When("Click Manage Cases button and Search IT QA Automation Call Center Case")
	public void click_Manage_Cases_button_and_Search_IT_QA_Automation_Call_Center_Case() {
		EApp2.ManageCaseButton.click();
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Call Center");
			act.pause(1000).perform();
		    EApp2.SearchITAutomationCallCenter.click();
	}

	@Then("Click New Enrollement button and Input Sponsor SSN, Enrollment City Santa Rita, Enrollment State GU")
	public void click_New_Enrollement_button_and_Input_Sponsor_SSN_Enrollment_City_Santa_Rita_Enrollment_State_GU() {
		EApp2.NewEnrollement.click();
		act.pause(1000).perform();
		EApp2.SSN.click();
		 EApp2.SSN.sendKeys("545100162");
		 EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("SANTA RITA");
			act.pause(2000).perform();
			 EApp2.GU.click();
			   act.pause(1000).perform();
			   EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollement buttonInput Sponsor First Name, Last Name, Gender and DOB")
	public void click_Begin_Enrollement_buttonInput_Sponsor_First_Name_Last_Name_Gender_and_DOB() {
	//	EApp2.BeginEnrollment.click();
	    EApp2.ClickNewSponsor.click();
		 EApp2.FirstName.sendKeys("Illona");
		    EApp2.LastName.sendKeys("Lanski");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("08161978");
			EApp2.Gender.click();
	}

	@Then("Click Married to input Spouse First Name, Last Name and DOB")
	public void click_Married_to_input_Spouse_First_Name_Last_Name_and_DOB() {
		 EApp2.MarriedBtn.click();
		    act.pause(1000).perform();
		    EApp2.SpouseFN.sendKeys("Maldo");
			   EApp2.SpouseLN.sendKeys("Lanski");
			   act.pause(1000).perform();
			   EApp2.SpouseDOB.click();
			   EApp2.SpouseDOB.sendKeys("01301969");
	}

	@Then("Click Include Children Button to input Adult Child First Name, Last Name, DOB")
	public void click_Include_Children_Button_to_input_Adult_Child_First_Name_Last_Name_DOB() {
		EApp2.ChildrenBtn.click();
		act.pause(1000).perform();
		EApp2.ChildOneFN.sendKeys("Qui Qui");
	    EApp2.ChildOneLN.sendKeys("Lanski");
	    EApp2.ChildOneDOB.click();
	    EApp2.ChildOneDOB.sendKeys("10141993");
	    act.pause(1000).perform();
	}

	@Then("Click Add Child button to input Minor Child First Name, Last Name and DOB")
	public void click_Add_Child_button_to_input_Minor_Child_First_Name_Last_Name_and_DOB() {
		EApp2.AddChildBtn.click();
		act.pause(1000).perform();
		EApp2.ChildTwoFN.sendKeys("Cordon");
		EApp2.ChildTwoDOB.click();
		EApp2.ChildTwoDOB.sendKeys("09162004");
	}

	@Then("Select Military on Eligibility options, select Army on Branch Of Service")
	public void select_Military_on_Eligibility_options_select_Army_on_Branch_Of_Service() {
		EApp2.Eligibility.click();
		EApp2.BranchOfService2.click();
	}

	@Then("Select Active Status and Rank option O three")
	public void select_Active_Status_and_Rank_option_O_three() {
		EApp2.DutyStatus2.click();
		 EApp2.RankO3.click();
	}

	@Then("Select Military Allotment on Contribution Mode and input Department Code AutoTest and Source Code AT{int}")
	public void select_Military_Allotment_on_Contribution_Mode_and_input_Department_Code_AutoTest_and_Source_Code_AT(Integer int1) {
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
		 EApp2.DepartmentCode.sendKeys("AutoTest");
			EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street address, City, State and St Zipcode")
	public void input_Street_address_City_State_and_St_Zipcode() {
		 EApp2.Street.sendKeys("15 River Rd");
		  EApp2.Street2.sendKeys("Apt 1235");
		  EApp2.City.sendKeys("Washington");
	      EApp2.State.click();
	      EApp2.State.sendKeys("North Carolina");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(2000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("27889");
	}

	@Then("Input Email address for confirmation and phone numbers")
	public void input_Email_address_for_confirmation_and_phone_numbers() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
			EApp2.Phone.sendKeys("7037065961");
			  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Option to select Benefitiary Planes")
	public void click_Show_Coverage_Option_to_select_Benefitiary_Planes() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}
	
@Then("Select Better Alternative Tobacco to Sponsor and Customize fifty thousand K for sponsor")
public void select_Better_Alternative_Tobacco_to_Sponsor_and_Customize_fifty_thousand_K_for_sponsor() {
   EApp2.TobaccoForSponsorBA.click();
   act.pause(2000).perform();
   EApp2.CustomizeOption3.click();
   act.pause(2000).perform();
   
}

@Then("Click Fed Term Customize One houndred thousand K for Sponsor")
public void click_Fed_Term_Customize_One_houndred_thousand_K_for_Sponsor() {
   EApp2.FedTerm.click();
   EApp2.CustomizeOptionSe10.click();
   act.pause(2000).perform();
   
}

@Then("Select First Protect Tobacco for kid and Customize fifty thousand K for AC")
public void select_First_Protect_Tobacco_for_kid_and_Customize_fifty_thousand_K_for_AC() {
    EApp2.ClickFirstProtect.click();
    act.pause(2000).perform();
    EApp2.ClickFirstProtectKidCustomize.click();
    act.pause(2000).perform();
}

@Then("Waived Application Member Benefict")
public void waived_Application_Member_Benefict() {
	  EApp2.spouseCoverage.click();
      EApp2.WaiveApplication.click();
      act.pause(2000).perform();
}

@Then("Click Covered for Child Protect Product")
public void click_Covered_for_Child_Protect_Product() {
	 EApp2.ChildrenProtectClick.click();
	   act.pause(2000).perform();
	   EApp2.CoveredForFirstKid.click();
}

@Then("Next page Answer All Qustions")
public void next_page_Answer_All_Qustions() {
	  EApp2.Next.click();
	  EApp2.AnswerNOAll.click();
	    act.pause(2000).perform(); 
	    EApp2.NextBtn2.click();
}

@Then("Input Sponsor Information height and weight")
public void input_Sponsor_Information_height_and_weight() {
	EApp2.HeightOption6.click();
    EApp2.HeightInchesOption5.click();
    act.pause(2000).perform();
    EApp2.Weight.click();
    EApp2.Weight.sendKeys("217"); 
    EApp2.NextBtn3.click();
}

@Then("Next page input Children Information include Gender, Height, Weight and Relationship options")
public void next_page_input_Children_Information_include_Gender_Height_Weight_and_Relationship_options() {
	EApp2.ChildOneSSN.click();
	EApp2.ChildOneSSN.sendKeys("545100164");
	EApp2.ChildOneGenderFamale.click();
	EApp2.ChildOneHeight5Feet.click();
	EApp2.ChildOneHeight10Inches.click();
	EApp2.ChildOneWeight.sendKeys("143");
	EApp2.ChildUSCitizen.click();
	EApp2.ChildOneRelationshipParent.click();
	act.pause(2000).perform();
	EApp2.ChildTwoSSN.sendKeys("545100165");
	EApp2.ChildTwoGenderMale.click();
	EApp2.ChildTwoHeight5Feet.click();
	EApp2.ChildTwoInches6.click();
	EApp2.ChildTwoWeight.sendKeys("103");
	EApp2.ChildUSCitizenm2.click();
	EApp2.ChildTwoRelationship.click();
	 act.pause(2000).perform();
	   EApp2.Next.click();
}

@Then("Next Page for Beneficiaries for BA Sponsor primary Benficiary Full Name and Relationship")
public void next_Page_for_Beneficiaries_for_BA_Sponsor_primary_Benficiary_Full_Name_and_Relationship() {
	act.pause(1000).perform();
	EApp2.SomeoneElseForSponsorPrimary.click();
	EApp2.PrimaryBenficiaryFullName.sendKeys("Maldo Lanski");
    EApp2.PrimaryRelationshipForOther.click();
   
}

@Then("Input Beneficiaries for BA Sponsor Contingent Beneficiary Full Name and Relationship")
public void input_Beneficiaries_for_BA_Sponsor_Contingent_Beneficiary_Full_Name_and_Relationship() {
	EApp2.SomeoneElsee.click();
    act.pause(1000).perform();
    EApp2.ContingentBeneficiaryFullName.sendKeys("Grover Washington");
    EApp2.ContingentBeneficiaryRelationship.click();
	act.pause(2000).perform();
}

@Then("Input Beneficiaries for Fed Term Sponsor Primary Beneficiary Full Name, SSN, Relationship and DOB")
public void input_Beneficiaries_for_Fed_Term_Sponsor_Primary_Beneficiary_Full_Name_SSN_Relationship_and_DOB() {
	EApp2.SecondPrmaryBenSOmeOneElse.click();
	EApp2.SecondPrmaryBenFullName.sendKeys("Qui Qui Lanski");
	EApp2.SecondPrimaryBenfSSN.click();
	EApp2.SecondPrimaryBenfSSN.sendKeys("545100164");
	EApp2.SecondPrimaryBenRelationshipforChild.click();
	EApp2.SecondPrimaryBenfDOB.click();
	EApp2.SecondPrimaryBenfDOB.sendKeys("10141993");
	act.pause(2000).perform();
}

@Then("Input Beneficiary for First Protect Adult Child Primary Beneficiary Full Name, SSN, Relationship and DOB")
public void input_Beneficiary_for_First_Protect_Adult_Child_Primary_Beneficiary_Full_Name_SSN_Relationship_and_DOB() {
	EApp2.FirstProtectPrimarySomeOneElse.click();
	EApp2.FirstProtectPrimaryFN.sendKeys("Qui Qui Lanski");
	EApp2.FirstProtectPrimarySSN.click();
	EApp2.FirstProtectPrimarySSN.sendKeys("545100164");
	EApp2.FirstProtectPrimaryRelationshipBF.click();
	EApp2.FirstProtectPrimaryDOB.click();
	EApp2.FirstProtectPrimaryDOB.sendKeys("10141993");
	act.pause(2000).perform();
}

@Then("Input Beneficiary for Children Protect for Minor Child Contingent Beneficiary Full Name, SSN, Relationship and DOB")
public void input_Beneficiary_for_Children_Protect_for_Minor_Child_Contingent_Beneficiary_Full_Name_SSN_Relationship_and_DOB() {
    EApp2.ChildProtectContingentSomeOneElse.click();
    EApp2.ChildProtectContingentFullName.sendKeys("Maldo Lanski");
    EApp2.ChildProtectContingentSSN.click();
    EApp2.ChildProtectContingentSSN.sendKeys("545100163");
    act.pause(2000).perform();
    EApp2.ChildProtectContingentRelationshipFather.click();
    EApp2.ChildProtectContingentDOB.click();
    EApp2.ChildProtectContingentDOB.sendKeys("01301969");
    act.pause(2000).perform();
}

@Then("Nexc page select Email Summary and select Acknowledgement Military Payment radio button")
public void nexc_page_select_Email_Summary_and_select_Acknowledgement_Military_Payment_radio_button() {
	EApp2.NextBtn6.click();
	EApp2.EmailSummary2.click();
	 act.pause(3000).perform();
	 EApp2.AcknowledgeofPayment.click();
}

@Then("Click I Sgree to This Coverage and am ready to signin button")
public void click_I_Sgree_to_This_Coverage_and_am_ready_to_signin_button() {
	EApp2.AgreeToSignInBtn.click();
	 act.pause(3000).perform();
}

@Then("Select Applicant eSignature three options Button")
public void select_Applicant_eSignature_three_options_Button() {
	 EApp2.ClickQuestion1.click();
	   EApp2.ClickQuestion2.click();
	   EApp2.ClickQuestion3.click();
		act.pause(2000).perform();
}

@Then("Select recieve Documents Option for Paper and click Sign button")
public void select_recieve_Documents_Option_for_Paper_and_click_Sign_button() {
	EApp2.PaperBtn2.click();
	 act.pause(2000).perform();
}

@Then("Select Sign button on Agent Enroller eSignature")
public void select_Sign_button_on_Agent_Enroller_eSignature() {
	EApp2.SignBtn2.click();
	act.pause(3000).perform();
	EApp2.eSignatureBrn2.click();
	act.pause(7000).perform();
}




}
