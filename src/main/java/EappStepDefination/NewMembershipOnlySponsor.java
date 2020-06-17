package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class NewMembershipOnlySponsor extends TestBase {

	@When("Search IT_QA Automation Face to Face cases and click it")
	public void search_IT_QA_Automation_Face_to_Face_cases_and_click_it() {
		EApp2.Home.click();
		act.pause(2000).perform();
		EApp2.ManageCaseButton.click();
		EApp2.searchSpace.click();
		EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
		EApp2.SearchITQAAutomationFace2Face.click();
	}

	@Then("Click New Enrollement button to create the Case")
	public void click_New_Enrollement_button_to_create_the_Case() {
		 EApp2.NewEnrollement.click();
		 act.pause(2000).perform();
	}

	@Then("Input sponsor SSN, Enrollment City, Enrollment State")
	public void input_sponsor_SSN_Enrollment_City_Enrollment_State() {
		EApp2.SSN.click();
		EApp2.SSN.sendKeys("222222222");
		act.pause(1000).perform();
		EApp2.EnrollmentCity.clear();
		EApp2.EnrollmentCity.sendKeys("Bath");
		act.pause(2000).perform();
		EApp2.NC.click();
		act.pause(1000).perform();
		EApp2.NextBtn.click();
		EApp2.SSN.click();
		EApp2.SSN.sendKeys("512000010");
		act.pause(1000).perform();
		EApp2.NextBtn.click();
		act.pause(2000).perform();
	}
	
	@Then("Click Begin Enrollment button to start new case")
	public void click_Begin_Enrollment_button_to_start_new_case() {
	 //   EApp2.BeginEnrollment.click();
	   EApp2.ClickNewSponsor.click();
	}

	@Then("Enter Sponsor First Name, Last Name, DOB, Gender")
	public void enter_Sponsor_First_Name_Last_Name_DOB_Gender() {
		EApp2.FirstName.sendKeys("Parks");
		EApp2.LastName.sendKeys("Burt");
		act.pause(1000).perform();
		EApp2.DOB.click();
		EApp2.DOB.sendKeys("12061990");
		act.pause(1000).perform();
		EApp2.GenderforMale.click();
	}

	@Then("Select Eligibility options, Branch of Service Options, Duty Status Options, Rank and Contribution mode")
	public void select_Eligibility_options_Branch_of_Service_Options_Duty_Status_Options_Rank_and_Contribution_mode() {
		 EApp2.Eligibility.click();
		 EApp2.ContributionMode.click();
		 EApp2.BranchOfArmyService.click();
		 EApp2.DutyStatus.click();
		 EApp2.Rank3.click();
		 act.pause(2000).perform();
	}
	
	@Then("Enter Department and Source Code")
	public void enter_Department_and_Source_Code() {
		 EApp2.DepartmentCode.sendKeys("AutoTest");
		 EApp2.SourceCode.sendKeys("AT1");
	}

	@Then("Enter Street Address, City, State, and valid Zipcode")
	public void enter_Street_Address_City_State_and_valid_Zipcode() {
		 EApp2.Street.sendKeys("3 River Rd");
		 EApp2.Street2.sendKeys("Apt 1223");
		 EApp2.City.sendKeys("Paris");
	     EApp2.State.click();
	     EApp2.State.sendKeys("Virginia");
	     EApp2.State.sendKeys(Keys.ENTER);
	     act.pause(1000).perform();

	     EApp2.ZipCode.click();
	     EApp2.ZipCode.sendKeys("20130");
		 act.pause(2000).perform();
	}

	@Then("Enter Email Address and repeat Email address for Confirmation")
	public void enter_Email_Address_and_repeat_Email_address_for_Confirmation() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 act.pause(2000).perform();
	}

	@Then("Enter Daytime Phone Number")
	public void enter_Daytime_Phone_Number() {
		 EApp2.Phone.click();
		 EApp2.Phone.sendKeys("7037065961");
		 act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options to select benefit plan")
	public void click_Show_Coverage_Options_to_select_benefit_plan() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}

	@Then("Waived BA, Fed Term, First Protect")
	public void waived_BA_Fed_Term_First_Protect() {
		 EApp2.WaiveBA.click();
		 act.pause(2000).perform();
		 EApp2.FedTerm.click();
	     EApp2.WaiveBA.click();
		 act.pause(2000).perform();
		 EApp2.ClickFirstProtect.click();
		 EApp2.WaiveBA.click();
		 act.pause(2000).perform();
	}

	@Then("Select Covered Application Member Benefit five thousand K")
	public void select_Covered_Application_Member_Benefit_five_thousand_K() {
		  EApp2.spouseCoverage.click();
		  EApp2.Covered.click();
		  act.pause(3000).perform();
//		  EApp2.YesForFirstQuestion.click();
//		  act.pause(2000).perform();
//		  EApp2.NoForSecondQuestion.click();
		  EApp2.NextBtn1.click();
		  act.pause(2000).perform();
		  EApp2.NextBtn2.click();
		  act.pause(1000).perform();
		  EApp2.NextBtn2.click();
		  act.pause(1000).perform();
		  EApp2.NextBtn2.click();
		  
	}

	@Then("Select Primary Beneficiaries for Application Member Benefit five thousand K")
	public void select_Primary_Beneficiaries_for_Application_Member_Benefit_five_thousand_K() {
		  EApp2.PrimaryBenficiaryFullName.sendKeys("Lucy Ball");
		  EApp2.PrimaryBeneficiarySSN.click();
		  EApp2.PrimaryBeneficiarySSN.sendKeys("512000011");
		  EApp2.PrimaryRelationship.click();
		  EApp2.PrimaryBeneficiaryDOB.click();
		  EApp2.PrimaryBeneficiaryDOB.sendKeys("10101980");
		  act.pause(2000).perform();
	}
	

	@Then("Select Contingent Beneficiary for Application Member Benefit five thousand K")
	public void select_Contingent_Beneficiary_for_Application_Member_Benefit_five_thousand_K() {
		EApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	    EApp2.ContingentBeneficiaryFullName.sendKeys("Guy Best");
	    EApp2.ContingentBeneficiarySSNnumber.click();
	    EApp2.ContingentBeneficiarySSNnumber.sendKeys("512000012");
	    EApp2.ContingentRelationship.click();
	    EApp2.ContingentBeneficiaryDOB.click();
		EApp2.ContingentBeneficiaryDOB.sendKeys("10151980");
		act.pause(1000).perform();
		EApp2.NextBtn6.click();
		act.pause(3000).perform();
		
//		EApp2.ClickSaveForLater.click();
//		act.pause(1000).perform();
//		EApp2.ClickPauseEnrollementBtn.click();
//		act.pause(4000).perform();
//		EApp2.SearchCase.click();
//		EApp2.SearchCase.sendKeys("Parks Burt");
//		act.pause(2000).perform();
//		EApp2.ClickEnrollCase.click();
//		act.pause(3000).perform();		
	}
	
	@Then("Click Save for later button")
	public void click_Save_for_later_button() {
		EApp2.ClickSaveForLater.click();
		act.pause(1000).perform();
	}

	@Then("Click Pause Enrollement button")
	public void click_Pause_Enrollement_button() {
		EApp2.ClickPauseEnrollementBtn.click();
		act.pause(4000).perform();
	}

	@Then("Search the case")
	public void search_the_case() {
		EApp2.SearchCase.click();
		EApp2.SearchCase.sendKeys("Parks Burt");
		act.pause(2000).perform();
		EApp2.ClickEnrollCase.click();
		act.pause(3000).perform();		
	}
	
	@Then("Click Next button to get Confirmation page")
	public void click_Next_button_to_get_Confirmation_page() {
		  EApp2.NextBtn1.click();
		  act.pause(2000).perform();
		  EApp2.NextBtn2.click();
		  act.pause(1000).perform();
		  EApp2.NextBtn2.click();
		  act.pause(1000).perform();
		  EApp2.NextBtn2.click();
		  act.pause(2000).perform();
		  EApp2.NextBtn6.click();
		  act.pause(3000).perform();
	}

	@Then("Select Contributory Benefits")
	public void select_Contributory_Benefits() {	
		EApp2.SurvivorBenefitNo.click();
		act.pause(2000).perform();
		EApp2.CharlesBlantonYes.click();
		act.pause(2000).perform();
	}


	
	@Then("Click I agree to this Coverage and ready to sign in button")
	public void click_I_agree_to_this_Coverage_and_ready_to_sign_in_button() {
	//	EApp2.AcknowledgeofPayment.click();
		EApp2.SiginingInPerson.click();
		act.pause(2000).perform();
		EApp2.AgreeToSignInBtn.click();
		act.pause(2000).perform();
	}
	

	@Then("Click Review Application Documents button to open the pdf file")
	public void click_Review_Application_Documents_button_to_open_the_pdf_file() {
		EApp2.ReviewApplicationBtn.click();
		act.pause(5000).perform();
		EApp2.CloseBtn.click();
		act.pause(2000).perform();
	}
	

	@Then("Enter Spouse Last Name and Last four SSN")
	public void enter_Spouse_Last_Name_and_Last_four_SSN() {
		EApp2.SponsorLastName.sendKeys("hero");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Burt");
		 EApp2.SponsorLastSSN.sendKeys("3333");
		 EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastSSN.clear();
		 EApp2.SponsorLastSSN.click();
		 EApp2.SponsorLastSSN.sendKeys("0010");
	}

	
	@Then("Select receive life insuarance notices and documents options and Sign in")
	public void select_receive_life_insuarance_notices_and_documents_options_and_Sign_in() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
		 EApp2.clickModalBodyBtn.click();
		 act.pause(1000).perform();
		 EApp2.SignBtn.click();
		 act.pause(3000).perform();
		 EApp2.eSignatureBrn.click();
		 act.pause(7000).perform();
	}

	
}
