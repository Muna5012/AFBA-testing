package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EApp10SeniorGroupFreeStepDef extends TestBase{

	@When("Click Manage Cases button to Search IT_QA Automation Face{int}Face Remote cases and click it")
	public void click_Manage_Cases_button_to_Search_IT_QA_Automation_Face_Face_Remote_cases_and_click_it(Integer int1) {
		EApp2.ManageCaseButton.click();
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face Remote");
			act.pause(1000).perform();
		    EApp2.SearchAFBACase.click();
	}
	
	@When("Click New Enrollement button to create")
	public void click_New_Enrollement_button_to_create() {
		EApp2.NewEnrollement.click();
	}

	@Then("Input Sponsor SSN, Enrollment city, Enrollment state")
	public void input_Sponsor_SSN_Enrollment_city_Enrollment_state() {
		act.pause(1000).perform();
		EApp2.SSN.click();
		 EApp2.SSN.sendKeys("545100236");
		 EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Fort Meyer");
			act.pause(2000).perform();
			 EApp2.FL.click();
			   act.pause(1000).perform();
			   EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollement to create")
	public void click_Begin_Enrollement_to_create() {
    //	EApp2.BeginEnrollment.click();
	  EApp2.ClickNewSponsor.click();
	}

	@Then("Input the Sponsor FirstName, LastName, DOB, Gender")
	public void input_the_Sponsor_FirstName_LastName_DOB_Gender() {
		 EApp2.FirstName.sendKeys("Charlotte");
		    EApp2.LastName.sendKeys("McCullough");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("12301961");
			EApp2.GenderforMale.click();
	}

	@Then("Select Military on Eligibility options,")
	public void select_Military_on_Eligibility_options() {
		EApp2.Eligibility.click();
	}

	@Then("Select Navy on Branch of service")
	public void select_Navy_on_Branch_of_service() {
		EApp2.BranchOfNavy.click();
		
	}

	@Then("Select Active Status and Rank option")
	public void select_Active_Status_and_Rank_option() {
		EApp2.DutyStatus2.click();
		 EApp2.Rank9.click();
	}

	@Then("Select Military Allotment on ContributionMode option")
	public void select_Military_Allotment_on_ContributionMode_option() {
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
	}

	@Then("Input Departmentcode and Source code")
	public void input_Departmentcode_and_Source_code() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
		EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input address, City and ST Zipcode")
	public void input_address_City_and_ST_Zipcode() {
		 EApp2.Street.sendKeys("10 River Rd");
		  EApp2.Street2.sendKeys("Apt 1230");
		  EApp2.City.sendKeys("BARRIGADA");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Guam");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("96799");
	}

	@Then("Input Email Address for confimation and daytime phone numbers")
	public void input_Email_Address_for_confimation_and_daytime_phone_numbers() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
			EApp2.Phone.sendKeys("7037065961");
			  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options to Select Benefitiary plane")
	public void click_Show_Coverage_Options_to_Select_Benefitiary_plane() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}
	
	@Then("Waived to Better Alternative")
	public void waived_to_Better_Alternative() {
		 EApp2.WaiveBA.click();
		    act.pause(2000).perform();
	}

	
	@Then("Click Covered Application Memeber benefit")
	public void click_Covered_Application_Memeber_benefit() {
	    EApp2.spouseCoverage.click();
		   act.pause(2000).click();
		   EApp2.Covered.click();
		   EApp2.NextBtn1.click();
	}

	@Then("Waived Fed Term and First Protect")
	public void waived_Fed_Term_and_First_Protect() {
		  EApp2.FedTerm.click();
		    EApp2.WaiveFedTerm.click();
		    act.pause(2000).perform();
		    EApp2.ClickFirstProtect.click();
		    EApp2.WaiveFirstProtect.click();
		    act.pause(2000).perform();
	}

	@Then("Click Senior Protect to click Tobacco and select first Option")
	public void click_Senior_Protect_to_click_Tobacco_and_select_first_Option() {
		 EApp2.SeniorProtect.click();
		 EApp2.SeniorProtectSponsorTobacco.click();
		   act.pause(2000).perform();
		 EApp2.SeniorProtectOptionOne.click();
		   act.pause(2000).perform();
		   EApp2.NextBtn1.click();
	}

	@Then("Next page Answer all the questions")
	public void next_page_Answer_all_the_questions() {
		EApp2.AnswerNOAll.click();
	    act.pause(2000).perform(); 
	    EApp2.NextBtn2.click();
	}

	@Then("Next Page input Sponsor Information Height and Weight")
	public void next_Page_input_Sponsor_Information_Height_and_Weight() {
		EApp2.HeightOption.click();
	    EApp2.HeightInchesOption.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("131"); 
	    EApp2.NextBtn3.click();
	}

	@Then("Next step Beneficairy for Application Member Benefit Sponsor Primary beneficiary FullName, SSN, Relationship and DOB")
	public void next_step_Beneficairy_for_Application_Member_Benefit_Sponsor_Primary_beneficiary_FullName_SSN_Relationship_and_DOB() {
		 act.pause(2000).perform();
		   EApp2.Next.click();
		   EApp2.PrimaryBenficiaryFullName.sendKeys("Gladys Cratch");
		   EApp2.PrimaryBeneficiarySSN.click();
		    EApp2.PrimaryBeneficiarySSN.sendKeys("545100237");
		    EApp2.PrimaryRelationshipBF.click();
		    EApp2.PrimaryBeneficiaryDOB.click();
		    EApp2.PrimaryBeneficiaryDOB.sendKeys("08121964");
		    act.pause(2000).perform();
	}

	@Then("Contingent Beneficiary of sponsor Coverage beneficiary FullName, SSN, Relationship and DOB")
	public void contingent_Beneficiary_of_sponsor_Coverage_beneficiary_FullName_SSN_Relationship_and_DOB() {
		 EApp2.SomeoneElseForSponsorContingent.click();
		   EApp2.ContingentBeneficiaryFullName.sendKeys("George Dewey");
			EApp2.ContingentRelationshipForOther.click();
		
	}

	@Then("Input Beneficiary for Senior Protect sponsor primary Beneficiary FullName, SSN, Relationship and DOB")
	public void input_Beneficiary_for_Senior_Protect_sponsor_primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	   EApp2.SecondPrmaryBenFullName.sendKeys("Marvin Washington");
	   EApp2.SecondPrimaryBenRelationshipUncle.click();
	   act.pause(2000).perform();
		EApp2.NextBtn6.click();
	}

	@Then("Click Method of Payment and select Singing in person button")
	public void click_Method_of_Payment_and_select_Singing_in_person_button() {
		 EApp2.AcknowledgeofPayment.click();
		 EApp2.SiginingInPerson.click();
		  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage and am ready to sign button")
	public void click_I_agree_to_this_coverage_and_am_ready_to_sign_button() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(3000).perform();
	}

	@Then("Next page click Review Application Ducuments to Continue button and Close Application")
	public void next_page_click_Review_Application_Ducuments_to_Continue_button_and_Close_Application() {
		EApp2.ReviewApplicationBtn.click();
		   act.pause(6000).perform();
			 EApp2.CloseBtn.click();
			 act.pause(2000).perform();
	}

	@Then("Input Sponsor Lastname and last SSN numbers for confirmation")
	public void input_Sponsor_Lastname_and_last_SSN_numbers_for_confirmation() {
		EApp2.SponsorLastName.sendKeys("Mcscllouhg");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("McCullough");
		 EApp2.SponsorLastSSN.sendKeys("0124");
			EApp2.verifySSN.click();
			act.pause(2000).perform();
			EApp2.SponsorLastSSN.clear();
		   EApp2.SponsorLastSSN.click();
		   EApp2.SponsorLastSSN.sendKeys("0236");
			act.pause(2000).perform();
	}

	@Then("Select receive insurance documents on Paper option")
	public void select_receive_insurance_documents_on_Paper_option() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
			EApp2.clickModalBodyBtn.click();
			act.pause(1000).perform();
			EApp2.SignBtn.click();
			act.pause(3000).perform();
	}

	@Then("Click Sign in Button for eSignature to application")
	public void click_Sign_in_Button_for_eSignature_to_application() {
		EApp2.eSignatureBrn.click();
		act.pause(5000).perform();
	}


}
