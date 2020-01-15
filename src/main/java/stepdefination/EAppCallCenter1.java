package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EAppCallCenter1 extends TestBase {

	@When("Click Manage Cases button on Home page and Search IT_QA Automation Face{int}Face Remote cases and click it")
	public void click_Manage_Cases_button_on_Home_page_and_Search_IT_QA_Automation_Face_Face_Remote_cases_and_click_it(Integer int1) {
		EApp2.ManageCaseButton.click();
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
			act.pause(1000).perform();
		    EApp2.SearchITQAAutomationFace2Face.click();
	}

	@Then("Click New Enrollement button to create new Case")
	public void click_New_Enrollement_button_to_create_new_Case() {
		EApp2.NewEnrollement.click();
	}

	@Then("Input Sponsor SSN, Enrollment city and Enrollment state")
	public void input_Sponsor_SSN_Enrollment_city_and_Enrollment_state() {
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

	@Then("click Begin Enrollement")
	public void click_Begin_Enrollement() {
		  EApp2.BeginEnrollment.click();
	//	  EApp2.ClickNewSponsor.click();
	}

	@Then("Input the Sponsor First Name, Last Name, Gender, DOB")
	public void input_the_Sponsor_First_Name_Last_Name_Gender_DOB() {
		    EApp2.FirstName.sendKeys("Thomas John");
		    EApp2.LastName.sendKeys("Wayne");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("05211978");
			EApp2.GenderforMale.click();
	}
	
	@Then("Click Married button to input Spouse first name, last name, DOB")
	public void click_Married_button_to_input_Spouse_first_name_last_name_DOB() {
		       EApp2.MarriedBtn.click();
		       act.pause(3000).perform();
		       EApp2.SpouseFN.sendKeys("Mary Joan ");
			   EApp2.SpouseLN.sendKeys("Wayne");
			   act.pause(1000).perform();
			   EApp2.SpouseDOB.click();
			   EApp2.SpouseDOB.sendKeys("11251968");
	}
	
	@Then("Select Military on Eligibility Options")
	public void select_Military_on_Eligibility_Options() {
		    EApp2.Eligibility.click();
	}

	@Then("Select Army on BranchOfService")
	public void select_Army_on_BranchOfService() {
		   EApp2.BranchOfArmyService.click();
	}

	
	@Then("Select Active Status and Rank option O six")
	public void select_Active_Status_and_Rank_option_O_six() {
		   EApp2.DutyStatus2.click();
		   EApp2.RankO9.click();
	} 

	@Then("Select Military Allotment on Contribution Mode")
	public void select_Military_Allotment_on_Contribution_Mode() {
		   EApp2.ContributionMode.click();
		   act.pause(2000).perform();
	}

	@Then("Input Department code and Sourcecode")
	public void input_Department_code_and_Sourcecode() {
	    	EApp2.DepartmentCode.sendKeys("AutoTest");
		    EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input street address, City and ST Zipcode")
	public void input_street_address_City_and_ST_Zipcode() {
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

	@Then("Input Email for confimation and daytime phone numbers")
	public void input_Email_for_confimation_and_daytime_phone_numbers() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
		 EApp2.Phone.sendKeys("7037065961");
		 act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options to Select Benefitiary planes")
	public void click_Show_Coverage_Options_to_Select_Benefitiary_planes() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}
	
	@Then("Waived BA, FedTerm, First Protect and Application Member Benefit")
	public void waived_BA_FedTerm_First_Protect_and_Application_Member_Benefit() {
		    EApp2.WaiveBA.click();
		    act.pause(2000).perform();
		    EApp2.FedTerm.click();
		    EApp2.WaiveFedTerm.click();
		    act.pause(2000).perform();
		    EApp2.ClickFirstProtect.click();
		    EApp2.WaiveFirstProtect.click();
		    act.pause(2000).perform();
		    EApp2.spouseCoverage.click();
			EApp2.WaiveApplication.click();
			act.pause(2000).perform();	 
	}

	@Then("Slect Senior Protect NonTobacco for Spouse and Customize twenty five thousand K")
	public void slect_Senior_Protect_NonTobacco_for_Spouse_and_Customize_twenty_five_thousand_K() {
		 EApp2.SeniorProtect.click();
		 EApp2.SeniorProtectCustomizeclick.click();
		 act.pause(1000).perform();
		 EApp2.SeniorProtectCustomize25.click();
		 act.pause(3000).perform();
		 EApp2.Next.click();
	}

	@Then("Next page answer All Questions")
	public void next_page_answer_All_Questions() {
		EApp2.AnswerNOAll.click();
	    act.pause(2000).perform(); 
	    EApp2.NextBtn2.click();
	}

	@Then("Next page input Sponsor Information Height inches and Weight")
	public void next_page_input_Sponsor_Information_Height_inches_and_Weight() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption7.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("238"); 
	    EApp2.NextBtn3.click();
	}

	@Then("Next page input Spouse Information, SSN, gender, Height and Weight")
	public void next_page_input_Spouse_Information_SSN_gender_Height_and_Weight() {
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

	@Then("Next page Beneficiaries for Senior Protect Primary Beneficiary of Spouse Coverage Beneficiary FullName, SSN, Relationship and DOB")
	public void next_page_Beneficiaries_for_Senior_Protect_Primary_Beneficiary_of_Spouse_Coverage_Beneficiary_FullName_SSN_Relationship_and_DOB() {
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

	@Then("Input Contingent Beneficiary of Spouse Coverage beneficiary FullName, SSN, relationship and DOB")
	public void input_Contingent_Beneficiary_of_Spouse_Coverage_beneficiary_FullName_SSN_relationship_and_DOB() {
		   EApp2.SomeOneElseForSpouseContingent.click();
		    act.pause(1000).perform();
		    EApp2.SpouseContingentFN.sendKeys("Samuel Webster");
			act.pause(1000).perform();
			EApp2.SpouseContingentRelationshipBrother.click();
			act.pause(2000).perform();
		    EApp2.NextBtn6.click();
			
	}

	@Then("Next Page select Email Summary And Select Spouse sign this application click Yes")
	public void next_Page_select_Email_Summary_And_Select_Spouse_sign_this_application_click_Yes() {
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
			  EApp2.SponsorLastName.sendKeys("Waynee");
			  EApp2.verifySSN.click();
			  act.pause(2000).perform();
			  EApp2.SponsorLastName.clear();
			  EApp2.SponsorLastName.click();	
			  EApp2.SponsorLastName.sendKeys("Wayne");
			  EApp2.SponsorLastSSN.sendKeys("0001");
			  EApp2.verifySSN.click();
			  act.pause(2000).perform();
			   EApp2.SponsorLastSSN.clear();
			   EApp2.SponsorLastSSN.click();
			   EApp2.SponsorLastSSN.sendKeys("0000");
			   act.pause(2000).perform();
			   EApp2.SpouseLastName.sendKeys("Wayne");
			   EApp2.SpouseLastSSN.click();
			   EApp2.SpouseLastSSN.sendKeys("0002");
			   act.pause(2000).perform();			
	}
	
	@Then("Applicant eSignature and select Paper to receive documents and click sign button")
	public void applicant_eSignature_and_select_Paper_to_receive_documents_and_click_sign_button() {	
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
		EApp2.eSignatureBrn.click();
		act.pause(5000).perform();
//	    EApp2.ClickQuestion1.click();
//	    EApp2.ClickQuestion2.click();
//	     EApp2.ClickQuestion3.click();
//	   	act.pause(2000).perform();
//			EApp2.clickModalBodyBtn.click();
//			act.pause(2000).perform();
//			EApp2.SignBtn.click();
//			act.pause(3000).perform();
//			EApp2.eSignatureBrn.click();
//			act.pause(5000).perform();
	   
	}
	
}
