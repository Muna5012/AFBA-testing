package EappStepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class VarifyEmailConfirm extends TestBase {

	@When("Click Manage Cases button and Search case")
	public void click_Manage_Cases_button_and_Search_case() {
		EApp2.ManageCaseButton.click();
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
			act.pause(1000).perform();
		    EApp2.SearchITQAAutomationFace2Face.click();
	}

	@Then("create new Case")
	public void create_new_Case() {
		EApp2.NewEnrollement.click();
	}

	@Then("Input Sponsor SSN, Enrollment city and state")
	public void input_Sponsor_SSN_Enrollment_city_and_state() {
		 act.pause(1000).perform();
		 EApp2.SSN.click();
		  EApp2.SSN.sendKeys("545200000");
		  EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Asheville");
		  act.pause(2000).perform();
		  EApp2.NC.click();
		  act.pause(1000).perform();
			EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollement button")
	public void click_Begin_Enrollement_button() {
//		  EApp2.BeginEnrollment.click();
			  EApp2.ClickNewSponsor.click();
	}

	@Then("Input sponsor First Name, Last Name, Gender and DOB")
	public void input_sponsor_First_Name_Last_Name_Gender_and_DOB() {
		  EApp2.FirstName.sendKeys("Thomas John");
		    EApp2.LastName.sendKeys("Wayne");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("05211978");
			EApp2.GenderforMale.click();
	}

	@Then("Click Married button to input spouse First Name, Last Name, DOB")
	public void click_Married_button_to_input_spouse_First_Name_Last_Name_DOB() {
		EApp2.MarriedBtn.click();
	       act.pause(3000).perform();
	       EApp2.SpouseFN.sendKeys("Mary Joan ");
		   EApp2.SpouseLN.sendKeys("Wayne");
		   act.pause(1000).perform();
		   EApp2.SpouseDOB.click();
		   EApp2.SpouseDOB.sendKeys("11251968");
	}

	@Then("Select Military")
	public void select_Military() {
		 EApp2.Eligibility.click();
	}

	@Then("Select Army and select Active Status and Rank option")
	public void select_Army_and_select_Active_Status_and_Rank_option() {
		  EApp2.BranchOfArmyService.click();
		  EApp2.DutyStatus2.click();
		   EApp2.RankO9.click();
		   act.pause(1000).perform();
	}

	@Then("Select Military Allotment on Contribution Mode and input Department code and Source code")
	public void select_Military_Allotment_on_Contribution_Mode_and_input_Department_code_and_Source_code() {
		  EApp2.ContributionMode.click();
		   act.pause(2000).perform();
			EApp2.DepartmentCode.sendKeys("AutoTest");
		    EApp2.SourceCode.sendKeys("ATWINTER");
		    act.pause(1000).perform();
	}

	@Then("Input street address, city and zip code")
	public void input_street_address_city_and_zip_code() {
	    EApp2.Street.sendKeys("11 River Rd");
		  EApp2.Street2.sendKeys("Apt 1231");
		  EApp2.City.sendKeys("LAs Vegas");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Nevada");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("89158");
	}

	@Then("Input Email address And skip confirmation email address")
	public void input_Email_address_And_skip_confirmation_email_address() {
		EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
	//	 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 act.pause(2000).perform();
		 EApp2.Phone.click();
		 EApp2.Phone.sendKeys("7037065961");
		 act.pause(4000).perform();
	}
	
	@Then("click Save for later button")
	public void click_Save_for_later_button() {
	    EApp2.ClickSaveForLater.click();
	    act.pause(3000).perform();
	}

	@Then("Click Pause enrollment and Save Data button")
	public void click_Pause_enrollment_and_Save_Data_button() {
		  EApp2.ClickPauseEnrollementBtn.click();
		    act.pause(7000).perform();
	}

	@Then("Click Search space to search this case")
	public void click_Search_space_to_search_this_case() {
		  EApp2.SearchCase.click();
		   EApp2.SearchCase.sendKeys("Wayne");
		   act.pause(4000).perform();
		   EApp2.ClickEnrollCase.click();
		   act.pause(4000).perform();
	}

	
	@Then("Varify the Email and reinput confirmation email address")
	public void varify_the_Email_and_reinput_confirmation_email_address() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 EApp2.VarifyEmail.click();
		 act.pause(3000).perform();
		EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		act.pause(2000).perform();
	}
	
	@Then("Click Show Coverage Options")
	public void click_Show_Coverage_Options() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(3000).perform();
	}


	@Then("Waived BA, skip FedTerm, waived First Protect and Application Member Benefit")
	public void waived_BA_skip_FedTerm_waived_First_Protect_and_Application_Member_Benefit() {
		//   EApp2.WaiveBA.click();
		    act.pause(1000).perform();
		    EApp2.FedTerm.click();
		 //   EApp2.WaiveFedTerm.click();
		    act.pause(1000).perform();
		    EApp2.ClickFirstProtect.click();
		//    EApp2.WaiveFirstProtect.click();
		    act.pause(2000).perform();
		    EApp2.spouseCoverage.click();
		//	EApp2.WaiveApplication.click();
			act.pause(2000).perform();	 
	}

	@Then("Select Senior Protect NonTobacco for Spouse and Customize it")
	public void select_Senior_Protect_NonTobacco_for_Spouse_and_Customize_it() {
		 EApp2.SeniorProtect.click();
		 EApp2.SeniorProtectCustomizeclick.click();
		 act.pause(1000).perform();
		 EApp2.SeniorProtectCustomize25.click();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 act.pause(3000).perform();
		 EApp2.Next.click();
		 act.pause(2000).perform();
		 
	}

	@Then("Next page answer Questions")
	public void next_page_answer_Questions() {
		EApp2.AnswerNOAll.click();
	    act.pause(3000).perform(); 
	    EApp2.YesAnswer1.click();
	    act.pause(1000).perform();
//	    EApp2.YesAnswer2.click();
//	    act.pause(2000).perform();
	    EApp2.NextBtn2.click();
	}

	@Then("Next page input sponsor information height and weight")
	public void next_page_input_sponsor_information_height_and_weight() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption7.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("238"); 
	    EApp2.NextBtn3.click();
	}

	@Then("Next page input spouse information, SSN, gender, height and weight")
	public void next_page_input_spouse_information_SSN_gender_height_and_weight() {
		 EApp2.SpouseSSN.click();
		 EApp2.SpouseSSN.sendKeys("545200001");
		 EApp2.SpouseGenderFamale.click();
		 act.pause(1000).perform();
		 EApp2.SpouseHeigthFeet.click();
		 EApp2.SpouseHeightInches11.click();
		  act.pause(2000).perform();
		  EApp2.SpouseWeight.click();
		  EApp2.SpouseWeight.sendKeys("143");
		  act.pause(2000).perform();
		  EApp2.Next.click();
	}

	@Then("Next page Beneficiaries for Senior Protect Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void next_page_Beneficiaries_for_Senior_Protect_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.SomeoneElseForSpousePrimary.click();
		act.pause(1000).perform();
	    EApp2.SpousePrimarytFN.sendKeys("Basil Kennedy");
	    EApp2.SpousePrimarytSSN.click();
	    EApp2.SpousePrimarytSSN.sendKeys("545200002");
	    EApp2.SpousePrimaryRelationshipFatherInLaw.click();
	    EApp2.SpousePrimaryDOB.click();
	    EApp2.SpousePrimaryDOB.sendKeys("03171964");
	    act.pause(2000).perform();
	}

	@Then("Input Contingent Beneficiary FullName, SSN, relationship and DOB")
	public void input_Contingent_Beneficiary_FullName_SSN_relationship_and_DOB() {
		  EApp2.SomeOneElseForSpouseContingent.click();
		    act.pause(1000).perform();
		    EApp2.SpouseContingentFN.sendKeys("Samuel Webster");
			act.pause(1000).perform();
			EApp2.SpouseContingentRelationshipBrother.click();
			act.pause(2000).perform();
		    EApp2.NextBtn6.click();
	}

	@Then("Next Page select Email Summary and select spouse sign this application click Yes")
	public void next_Page_select_Email_Summary_and_select_spouse_sign_this_application_click_Yes() {
		  EApp2.EmailSummary2.click();
	       act.pause(3000).perform();
		   EApp2.SpouseSigninYes.click();
		    act.pause(2000).perform();
		    EApp2.AgreeToSignInBtn.click();
		    act.pause(2000).perform();
			EApp2.ReviewApplicationBtn.click();
			act.pause(6000).perform();
		    EApp2.CloseBtn.click();
		    act.pause(2000).perform();
		     EApp2.PaperBtn.click();
			  act.pause(2000).perform();
			  EApp2.SponsorLastName.sendKeys("Wayne");
			   EApp2.SponsorLastSSN.sendKeys("0000");
			   act.pause(2000).perform();
			   EApp2.SpouseLastName.sendKeys("Wayne");
			   EApp2.SpouseLastSSN.click();
			   EApp2.SpouseLastSSN.sendKeys("0001");
			   act.pause(2000).perform();			
	}

	@Then("Select Paper to receive documents and click sign button")
	public void select_Paper_to_receive_documents_and_click_sign_button() {
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
		EApp2.eSignatureBrn.click();
		act.pause(5000).perform();
	}

}
