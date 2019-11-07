package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EAppFaceToFace6 extends TestBase{

	@When("Home Page to click Manage cases button")
	public void home_Page_to_click_Manage_cases_button() {
		EApp2.Home.click();
		act.pause(2000).perform();
	EApp2.ManageCaseButton.click();
	}

	@Then("Search AFBA cases on Manage Cases page")
	public void search_AFBA_cases_on_Manage_Cases_page() {
	 EApp2.searchSpace.click();
	  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
	}

	@Then("Click the AFBA casess")
	public void click_the_AFBA_casess() {
	act.pause(1000).perform();
    EApp2.SearchITQAAutomationFace2Face.click();
	}

	@Then("Click the New Enrollement button to create case")
	public void click_the_New_Enrollement_button_to_create_case() {
	EApp2.NewEnrollement.click();
	}

	@Then("Input Sponsor SSN numbers")
	public void input_Sponsor_SSN_numbers() {
	act.pause(1000).perform();
	EApp2.SSN.click();
	 EApp2.SSN.sendKeys("545100212");
	}

	@Then("Input Enrollment city")
	public void input_Enrollment_city() {
	 EApp2.EnrollmentCity.clear();
	  EApp2.EnrollmentCity.sendKeys("Las Vegas");
		act.pause(2000).perform();
	}

	@Then("Select Enrollment state")
	public void select_Enrollment_state() {
	 EApp2.NV.click();
	   act.pause(1000).perform();
	   EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollement button to create new sponsor")
	public void click_Begin_Enrollement_button_to_create_new_sponsor() {
	//	EApp2.BeginEnrollment.click();
		 EApp2.ClickNewSponsor.click();
	}

	@Then("Input Sponsor First Name, Last Name and DOB")
	public void input_Sponsor_First_Name_Last_Name_and_DOB() {
		   EApp2.FirstName.sendKeys("Izzy");
		    EApp2.LastName.sendKeys("Pop");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("10281984");
	}

	@Then("Select Sponsor Gender")
	public void select_Sponsor_Gender() {
		EApp2.GenderforMale.click();
	}
	
	@Then("Click Marreid button")
	public void click_Marreid_button() {
		  EApp2.MarriedBtn.click();
		    act.pause(3000).perform();
	}

	@Then("Input Spouse FirstName, LastName and DOB")
	public void input_Spouse_FirstName_LastName_and_DOB() {
		   EApp2.SpouseFN.sendKeys("Else");
		   EApp2.SpouseLN.sendKeys("Pop");
		   act.pause(1000).perform();
		   EApp2.SpouseDOB.click();
		   EApp2.SpouseDOB.sendKeys("01121982");
	}

	@Then("Click Include Children button to input child information")
	public void click_Include_Children_button_to_input_child_information() {
		EApp2.ChildrenBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input Child First Name, Last Name and DOB")
	public void input_Child_First_Name_Last_Name_and_DOB() {
		EApp2.ChildOneFN.sendKeys("Hae");
	    EApp2.ChildOneLN.sendKeys("Pop");
	    EApp2.ChildOneDOB.click();
	    EApp2.ChildOneDOB.sendKeys("11112010");
	    act.pause(2000).perform();
	}
	
	@Then("Clilk Add Child button for add more child")
	public void clilk_Add_Child_button_for_add_more_child() {
		EApp2.AddChildBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input second child First Name and Last Name and DOB")
	public void input_second_child_First_Name_and_Last_Name_and_DOB() {
		EApp2.ChildTwoFN.sendKeys("Cye");
		EApp2.ChildTwoDOB.click();
		EApp2.ChildTwoDOB.sendKeys("12312011");
	}

	@Then("Select option Eligibility")
	public void select_option_Eligibility() {
		EApp2.Eligibility.click();
	}

	@Then("Select option Branch of service")
	public void select_option_Branch_of_service() {
		  EApp2.BranchOfService6.click();
	}

	@Then("Select Option Duty Status")
	public void select_Option_Duty_Status() {
		EApp2.DutyStatus2.click();
	}

	@Then("Select option Rank")
	public void select_option_Rank() {
		  EApp2.Rank9.click();
	}

	@Then("Select Contribution Mode option")
	public void select_Contribution_Mode_option() {
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
	}

	@Then("Input Source Code")
	public void input_Source_Code() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
		EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street one, Street two, City, ST and Zip code")
	public void input_Street_one_Street_two_City_ST_and_Zip_code() {
		 EApp2.Street.sendKeys("6 River Rd");
		  EApp2.Street2.sendKeys("Apt 1226");
		  EApp2.City.sendKeys("Washington");
	      EApp2.State.click();
	      EApp2.State.sendKeys("NC");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();

	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("27889");
	}

	@Then("Input Email Address and repeat Email address for confimation")
	public void input_Email_Address_and_repeat_Email_address_for_confimation() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
	}

	@Then("Input daytime phone and second phone")
	public void input_daytime_phone_and_second_phone() {
		EApp2.Phone.click();
		EApp2.Phone.sendKeys("7037065961");
		  act.pause(2000).perform();
	}
	
	@Then("Click Show Coverage Options to select Benefitiary Plans")
	public void click_Show_Coverage_Options_to_select_Benefitiary_Plans() {
		 EApp2.ShowCoverageOptions.click();
		    act.pause(1000).perform();
	}
	
	@Then("Waive Better Alternative")
	public void waive_Better_Alternative() {
	    EApp2.WaiveBA.click();
	    act.pause(2000).perform();
	}

	@Then("Covered Application Member Benefit five thousands k")
	public void covered_Application_Member_Benefit_five_thousands_k() {
		EApp2.spouseCoverage.click();
		   act.pause(1000).perform();
	   EApp2.WaiveApplication.click();
	   act.pause(2000).perform();
	}

	@Then("Select Fed Term option to select Sponsor and spouse Tobacco or NonTobacco")
	public void select_Fed_Term_option_to_select_Sponsor_and_spouse_Tobacco_or_NonTobacco() {
		EApp2.FedTerm.click();
		
	}

	@Then("Select Coverage type for Customize sponsor and spouse")
	public void select_Coverage_type_for_Customize_sponsor_and_spouse() {
		   act.pause(2000).perform();
		EApp2.CustomizeOption5.click();
		EApp2.CustomizeOptionSe2.click();
		act.pause(2000).perform();
	}

	@Then("Select Coverage type Rider Units")
	public void select_Coverage_type_Rider_Units() {
		EApp2.ChildCoverge.click();
		act.pause(2000).perform();
		EApp2.ClickFirstProtect.click();
		EApp2.WaiveFirstProtect.click();
		act.pause(2000).perform();
		   EApp2.NextBtn1.click();
		EApp2.ChildrenProtectClick.click();
		EApp2.WaiveChildProtect.click();
		act.pause(2000).perform();
		   EApp2.NextBtn1.click();
	}

	@Then("Click Answer No to all Questions")
	public void click_Answer_No_to_all_Questions() {
	    EApp2.AnswerNOAll.click();
	    act.pause(2000).perform();
	    EApp2.AnswerOneYes.click();
	    EApp2.ForAnswer.sendKeys("Income Limitations");
	    act.pause(2000).perform();
	}

	@Then("Click Next button to input Sponsor informations")
	public void click_Next_button_to_input_Sponsor_informations() {
		 EApp2.NextBtn2.click();
	}

	@Then("Select Sponser height and Weight options")
	public void select_Sponser_height_and_Weight_options() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption5.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("232"); 
	}

	@Then("Click Next button to input spouse information")
	public void click_Next_button_to_input_spouse_information() {
		act.pause(2000).perform();
	    EApp2.NextBtn3.click();
	}

	@Then("Input Spouse SSN")
	public void input_Spouse_SSN() {
		EApp2.SpouseSSN.click();
		EApp2.SpouseSSN.sendKeys("545100213");
	
	}

	@Then("Select Spouse gender option")
	public void select_Spouse_gender_option() {
		EApp2.SpouseGenderFamale.click();
		act.pause(1000).perform();
	}

	@Then("Select spouse height and weight options")
	public void select_spouse_height_and_weight_options() {
		 EApp2.SpouseHeigthFeet.click();
		    EApp2.SpouseHeightInches11.click();
		    act.pause(2000).perform();
		    EApp2.SpouseWeight.click();
			   EApp2.SpouseWeight.sendKeys("153");
	}
	
	@Then("Click Next button to fill out beneficiaries option")
	public void click_Next_button_to_fill_out_beneficiaries_option() {
		  act.pause(2000).perform();
		   EApp2.Next.click();
	}


	@Then("Input Sponsor primary beneficiary FullName,SSN, Relationship and DOB")
	public void input_Sponsor_primary_beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.SomeoneElseForSponsorPrimary.click();
		 act.pause(1000).perform();
	    EApp2.PrimaryBenficiaryFullName.sendKeys("George Jetson");
	    EApp2.PrimaryBeneficiarySSN.click();
	    EApp2.PrimaryBeneficiarySSN.sendKeys("545100214");
	    EApp2.PrimaryRelationshipForFIL.click();
	    EApp2.PrimaryBeneficiaryDOB.click();
	    EApp2.PrimaryBeneficiaryDOB.sendKeys("04101942");
	    act.pause(2000).perform();
	}

	@Then("Input Spouse Primary Beneficiary fullname, SSN, Relationship and DOB")
	public void input_Spouse_Primary_Beneficiary_fullname_SSN_Relationship_and_DOB() {
		EApp2.SomeoneElseForSpousePrimary.click();
		 act.pause(1000).perform();
	    EApp2.SpousePrimarytFN.sendKeys("Bette Hawkins");
	    EApp2.SpousePrimarytSSN.click();
	    EApp2.SpousePrimarytSSN.sendKeys("545100215");
	    EApp2.SpousePrimaryRelationship.click();
	    EApp2.SpousePrimaryDOB.click();
	    EApp2.SpousePrimaryDOB.sendKeys("12111937");
	    act.pause(2000).perform();
	}

	@Then("Click Next button to confirm all the informations")
	public void click_Next_button_to_confirm_all_the_informations() {
		EApp2.NextBtn6.click();
	}

	@Then("Select Location for Signing in person option")
	public void select_Location_for_Signing_in_person_option() {
		EApp2.EmailSummary2.click();
		 act.pause(3000).perform();
		EApp2.AcknowledgeofPayment.click();
		   EApp2.SiginingInPerson.click();
			  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage and ready for sign button to signin")
	public void click_I_agree_to_this_coverage_and_ready_for_sign_button_to_signin() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Review Application Ducuments to Continue Button to review all the application")
	public void click_Review_Application_Ducuments_to_Continue_Button_to_review_all_the_application() {
		EApp2.ReviewApplicationBtn.click();
		   act.pause(6000).perform();
			 EApp2.CloseBtn.click();
			 act.pause(2000).perform();
	}

	@Then("Input Sponsor Last Name for confirm")
	public void input_Sponsor_Last_Name_for_confirm() {
		EApp2.SponsorLastName.sendKeys("ppo");
		EApp2.verifySSN.click();
		 act.pause(2000).perform();
		 EApp2.SponsorLastName.clear();
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Pop");
	}

	@Then("Input Sponsor last four SSN numbers for confirm")
	public void input_Sponsor_last_four_SSN_numbers_for_confirm() {
		EApp2.SponsorLastSSN.sendKeys("0191");
		EApp2.verifySSN.click();
		act.pause(2000).perform();
		EApp2.SponsorLastSSN.clear();
	   EApp2.SponsorLastSSN.click();
	   EApp2.SponsorLastSSN.sendKeys("0212");
	}

	@Then("Select Paper Option for receive the documents")
	public void select_Paper_Option_for_receive_the_documents() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Sign Button to Signin")
	public void click_Sign_Button_to_Signin() {
		EApp2.clickModalBodyBtn.click();
		act.pause(1000).perform();
		EApp2.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Sign Button for eSignature to this application")
	public void click_Sign_Button_for_eSignature_to_this_application() {
		EApp2.eSignatureBrn.click();
		act.pause(7000).perform();
	}

}
