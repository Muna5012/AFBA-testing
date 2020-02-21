package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class VarifyBASponsorTest extends TestBase {
	@When("Search IT_QA Automation Call Center cases and click it")
	public void search_IT_QA_Automation_Call_Center_cases_and_click_it() {
		EApp2.ManageCaseButton.click();
		EApp2.searchSpace.click();
		EApp2.searchSpace.sendKeys("IT_QA Automation Call Center");
		act.pause(1000).perform();
		EApp2.SearchITAutomationCallCenter.click();
	}

	@Then("Click New Enrollement button to create a Case")
	public void click_New_Enrollement_button_to_create_a_Case() {
		 EApp2.NewEnrollement.click();
		 act.pause(1000).perform();
	}

	@Then("Input sponsor SSN numbers, Enrollment City and Enrollment State")
	public void input_sponsor_SSN_numbers_Enrollment_City_and_Enrollment_State() {
		 EApp2.SSN.click();
		 EApp2.SSN.sendKeys("545200074");
		 EApp2.EnrollmentCity.clear();
		 EApp2.EnrollmentCity.sendKeys("Lake Gaston");
		 act.pause(2000).perform();
		 EApp2.VA.click();
		 act.pause(1000).perform();
		 EApp2.NextBtn.click();
	}

	@Then("Select Begin Enrollement")
	public void select_Begin_Enrollement() {
		//   EApp2.BeginEnrollment.click();
	     EApp2.ClickNewSponsor.click();
	}

	@Then("Input the sponsor First Name, Last Name, Gender, DOB")
	public void input_the_sponsor_First_Name_Last_Name_Gender_DOB() {
		EApp2.FirstName.sendKeys("WALTER");
		EApp2.LastName.sendKeys("AANONSEN");
		act.pause(1000).perform();
		EApp2.DOB.click();
		EApp2.DOB.sendKeys("02211975");
		EApp2.GenderforMale.click();
	}

	@Then("Select Eligibility options")
	public void select_Eligibility_options() {
		   EApp2.Eligibility.click();
	}

	@Then("Select Branch Of Service")
	public void select_Branch_Of_Service() {
		   EApp2.BranchOfArmyService.click();
	}

	@Then("Select Active Status and Rank")
	public void select_Active_Status_and_Rank() {
		  EApp2.DutyStatus2.click();
		   EApp2.RankO9.click();
	}

	@Then("Select Contribution Mode")
	public void select_Contribution_Mode() {
		   EApp2.ContributionMode.click();
		   act.pause(2000).perform();
	}

	@Then("Input Department Code and Source Code Num")
	public void input_Department_Code_and_Source_Code_Num() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
	    EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street Address, City and ZipCode")
	public void input_Street_Address_City_and_ZipCode() {
		  EApp2.Street.sendKeys("11 River Rd");
		  EApp2.Street2.sendKeys("Apt 1231");
		  EApp2.City.sendKeys("LAs Vegas");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Nevada");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("");
	}

	@Then("Input Email Address and phone numbers")
	public void input_Email_Address_and_phone_numbers() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
		 EApp2.Phone.sendKeys("7037065961");
		 act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options to Select planes")
	public void click_Show_Coverage_Options_to_Select_planes() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}

	@Then("Select Better Alternative and Customize one houndred thousands")
	public void select_Better_Alternative_and_Customize_one_houndred_thousands() {
	    EApp2.CustomizeOption1.click();
	    act.pause(2000).perform();
	}

	@Then("Waived FedTerm, First Protect and Application Member Benefit")
	public void waived_FedTerm_First_Protect_and_Application_Member_Benefit() {
		  EApp2.FedTerm.click();
		    EApp2.WaiveFedTerm.click();
		    act.pause(3000).perform();
		    EApp2.ClickFirstProtect.click();
		    EApp2.WaiveFirstProtect.click();
		    act.pause(2000).perform();
		    EApp2.spouseCoverage.click();
			 EApp2.WaiveApplication.click();
			 act.pause(2000).perform();	
	}

	@Then("Answer All Questions regarding Better Alternative")
	public void answer_All_Questions_regarding_Better_Alternative() {
		 EApp2.Next.click();
		  EApp2.AnswerNOAll.click();
		  act.pause(2000).perform(); 
		  EApp2.NextBtn2.click();
	   
	}

	@Then("Input Sponsor height inches and weight")
	public void input_Sponsor_height_inches_and_weight() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption5.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("200"); 
	    EApp2.NextBtn3.click();
		EApp2.Next.click();
		act.pause(1000).perform();
	}

	@Then("Input Beneficiaries for Better Alternative Primary Beneficiary of sponsor Coverage Beneficiary FullName, SSN, Relationship and DOB")
	public void input_Beneficiaries_for_Better_Alternative_Primary_Beneficiary_of_sponsor_Coverage_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		  EApp2.PrimaryBenficiaryFullName.sendKeys("Basil Kennedy");
		    EApp2.PrimaryBeneficiarySSN.click();
		    EApp2.PrimaryBeneficiarySSN.sendKeys("545200075");
		    EApp2.PrimaryBeneficiaryRelationship.click();
		    EApp2.PrimaryBeneficiaryDOB.click();
		    EApp2.PrimaryBeneficiaryDOB.sendKeys("03171964");
		    act.pause(2000).perform();
	}

	@Then("Input Better Alternative sponsor Contingent Beneficiary FullName, SSN, Relationship and DOB")
	public void input_Better_Alternative_sponsor_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	    EApp2.SomeoneElsee.click();
	    EApp2.ContingentBeneficiaryFullName.sendKeys("Meeker Larry");
	    EApp2.ContingentBeneficiarySSNnumber.click();
	    EApp2.ContingentBeneficiarySSNnumber.sendKeys("545200076");
	    EApp2.ContingentBeneficiaryRelationship.click();
	    EApp2.ContingentBeneficiaryDOB.click();
	    EApp2.ContingentBeneficiaryDOB.sendKeys("03171964");
	    act.pause(2000).perform();
		EApp2.NextBtn6.click();
	}

	@Then("Select Email Summary")
	public void select_Email_Summary() {
		EApp2.EmailSummary2.click();
		 act.pause(3000).perform();
		 EApp2.AcknowledgeofPayment.click();
	}

	@Then("Select spouse sign this application click Yes")
	public void select_spouse_sign_this_application_click_Yes() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(3000).perform();
		  EApp2.ClickQuestion1.click();
		   EApp2.ClickQuestion2.click();
		   EApp2.ClickQuestion3.click();
			act.pause(2000).perform();
	}

	@Then("Applicant eSignature and select Paper to receive documents and varify it")
	public void applicant_eSignature_and_select_Paper_to_receive_documents_and_varify_it() {
		 EApp2.PaperBtn2.click();
		 act.pause(2000).perform();
		 EApp2.SignBtn2.click();
			act.pause(3000).perform();
			EApp2.eSignatureBrn2.click();
			act.pause(7000).perform();
	}
	
}
