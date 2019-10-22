package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EAppCallCenter3 extends TestBase {

	@When("Click Manage Cases button and Search IT QA Automation Call Center")
	public void click_Manage_Cases_button_and_Search_IT_QA_Automation_Call_Center() {
		EApp2.ManageCaseButton.click();
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Call Center");
			act.pause(1000).perform();
		    EApp2.SearchITAutomationCallCenter.click();
	}

	@Then("Click New Enrollement button and Input Sponsor SSN, Enrollment City Washingtom, Enrollment State DC")
	public void click_New_Enrollement_button_and_Input_Sponsor_SSN_Enrollment_City_Washingtom_Enrollment_State_DC() {
		EApp2.NewEnrollement.click();
		act.pause(1000).perform();
		EApp2.SSN.click();
		 EApp2.SSN.sendKeys("545100247");
		 EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Washington");
			act.pause(2000).perform();
			 EApp2.DC.click();
			   act.pause(1000).perform();
			   EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollement and Input Sponsor FirstName, LastName, Gender and DOB")
	public void click_Begin_Enrollement_and_Input_Sponsor_FirstName_LastName_Gender_and_DOB() {
	//	EApp2.BeginEnrollment.click();
	  EApp2.ClickNewSponsor.click();
		 EApp2.FirstName.sendKeys("Simon");
		    EApp2.LastName.sendKeys("LeBlanc");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("10021963");
			EApp2.GenderforMale.click();
	}

	@Then("Click Married button to Input spouse FirstName,LastName and DOB")
	public void click_Married_button_to_Input_spouse_FirstName_LastName_and_DOB() {
		EApp2.MarriedBtn.click();
	    act.pause(3000).perform();
	    EApp2.SpouseFN.sendKeys("Priscilla");
		   EApp2.SpouseLN.sendKeys("LeBlanc");
		   act.pause(1000).perform();
		   EApp2.SpouseDOB.click();
		   EApp2.SpouseDOB.sendKeys("10151978");
	}

	@Then("Click Include Children button to input first Child FirstName, LastName, DOB")
	public void click_Include_Children_button_to_input_first_Child_FirstName_LastName_DOB() {
		EApp2.ChildrenBtn.click();
		act.pause(2000).perform();
		EApp2.ChildOneFN.sendKeys("Lawrence");
	    EApp2.ChildOneLN.sendKeys("LeBlanc");
	    EApp2.ChildOneDOB.click();
	    EApp2.ChildOneDOB.sendKeys("07311993");
	    act.pause(2000).perform();
	}

	@Then("Click Add Child button to input second Child FirstName, LastName, DOB")
	public void click_Add_Child_button_to_input_second_Child_FirstName_LastName_DOB() {
		EApp2.AddChildBtn.click();
		act.pause(2000).perform();
		EApp2.ChildTwoFN.sendKeys("Silas");
		EApp2.ChildTwoDOB.click();
		EApp2.ChildTwoDOB.sendKeys("07152018");
	}

	@Then("Click Add Child button to input third Child FirstName, LastName, DOB")
	public void click_Add_Child_button_to_input_third_Child_FirstName_LastName_DOB() {
		EApp2.AddChildBtn.click();
		act.pause(2000).perform();
		EApp2.ChildThreeFN.sendKeys("Xavier");
		EApp2.ChildThreeDOB.click();
		EApp2.ChildThreeDOB.sendKeys("07152018");
	}

	@Then("Select Military on Eligibility Options, Select Navy on BranchOfService")
	public void select_Military_on_Eligibility_Options_Select_Navy_on_BranchOfService() {
		EApp2.Eligibility.click();
		act.pause(2000).perform();
		EApp2.BranchOfNavy.click();
	}

	@Then("Select Active Status and Rank option E nine")
	public void select_Active_Status_and_Rank_option_E_nine() {
		EApp2.DutyStatus.click();
		 EApp2.Rank9.click();
	}

	@Then("Select Military Allotment on Contribution Mode and input DepartmentCode and Sourcecode")
	public void select_Military_Allotment_on_Contribution_Mode_and_input_DepartmentCode_and_Sourcecode() {
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
		 EApp2.DepartmentCode.sendKeys("AutoTest");
			EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street address, City, state and ST Zipcode")
	public void input_Street_address_City_state_and_ST_Zipcode() {
		 EApp2.Street.sendKeys("13 River Rd");
		  EApp2.Street2.sendKeys("Apt 1233");
		  EApp2.City.sendKeys("Portland");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Oregon");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(2000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("97035");
	}

	@Then("Input Email for confimation and phone number")
	public void input_Email_for_confimation_and_phone_number() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
			EApp2.Phone.sendKeys("7037065961");
			  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options to select Benefitiary Planes")
	public void click_Show_Coverage_Options_to_select_Benefitiary_Planes() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}
	
	@Then("Waived BA, Fed Term and Application Member Benefit")
	public void waived_BA_Fed_Term_and_Application_Member_Benefit() {
		EApp2.WaiveBA.click();
	    act.pause(2000).perform();
	    EApp2.FedTerm.click();
	    EApp2.WaiveFedTerm.click();
	    act.pause(2000).perform();
	    EApp2.spouseCoverage.click();
		 EApp2.WaiveApplication.click();
		 act.pause(3000).perform();	
	}

	@Then("Select Sponsor NonTobacco, Spouse Tobacco and First kid Tobacco")
	public void select_Sponsor_NonTobacco_Spouse_Tobacco_and_First_kid_Tobacco() {
	    EApp2.ClickFirstProtect.click();
	    EApp2.FirstProtectTobacoforSpouse.click();
	    EApp2.FirstProtectTobacoForKid.click();
	    act.pause(3000).perform();

	}

	@Then("Sponsor Customize No benefit, Spouse Customize one houndred thousand K and first kid Customize fifty thousand K")
	public void sponsor_Customize_No_benefit_Spouse_Customize_one_houndred_thousand_K_and_first_kid_Customize_fifty_thousand_K() {
		    EApp2.ClickFirstProtectSpouseCustomize.click();
		    EApp2.ClickFirstProtectKidCustomize.click();
		    act.pause(3000).perform();
		    EApp2.SeniorProtect.click();
		    EApp2.SeniorProtectCustomize15.click();
		    act.pause(3000).perform();    
	}

	@Then("Children Protect Covered Silas and Xavier")
	public void children_Protect_Covered_Silas_and_Xavier() {
		  EApp2.ChildrenProtectClick.click();
		   act.pause(2000).perform();
		   EApp2.CoveredForFirstKid.click();
		   EApp2.CoveredforSecondKid.click();
		   act.pause(3000).perform();
	}

	@Then("Next Page to Answer to All the Questions")
	public void next_Page_to_Answer_to_All_the_Questions() {
		 EApp2.Next.click();
		  EApp2.AnswerNOAll.click();
		    act.pause(2000).perform(); 
		    EApp2.NextBtn2.click();
	}

	@Then("Next page Input Sponsor Height feet inches and weight")
	public void next_page_Input_Sponsor_Height_feet_inches_and_weight() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption5.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("327"); 
	    EApp2.NextBtn3.click();
	}

	@Then("Next page input Spouse Information")
	public void next_page_input_Spouse_Information() {
		EApp2.SpouseSSN.click();
		 EApp2.SpouseSSN.sendKeys("545100248");
		 EApp2.SpouseGenderFamale.click();
		 act.pause(1000).perform();
		 EApp2.SpouseHeigthFeet.click();
		 EApp2.SpouseHeightInches11.click();
		  act.pause(2000).perform();
		  EApp2.SpouseWeight.click();
		  EApp2.SpouseWeight.sendKeys("157");
	}

	@Then("Input child one Information SSN, Gender, Height, Weight, Slect US Citizen Option and Relationship")
	public void input_child_one_Information_SSN_Gender_Height_Weight_Slect_US_Citizen_Option_and_Relationship() {
		EApp2.ChildOneSSN.click();
		EApp2.ChildOneSSN.sendKeys("545100249");
		EApp2.ChildOneGenderMale.click();
		EApp2.ChildOneHeight6Feet.click();
		EApp2.ChildOneHeight0Inches.click();
		EApp2.ChildOneWeight.sendKeys("158");
		EApp2.ChildUSCitizen.click();
		EApp2.ChildOneRelationshipParent.click();
		act.pause(2000).perform();
	}

	@Then("Input child two Information SSN, Gender, Height, Weight, Slect US Citizen Option and Relationship")
	public void input_child_two_Information_SSN_Gender_Height_Weight_Slect_US_Citizen_Option_and_Relationship() {
		EApp2.ChildTwoSSN.click();
		EApp2.ChildTwoSSN.sendKeys("545100250");
		EApp2.ChildTwoGenderMale.click();
		EApp2.ChildTwoHeight3Feet.click();
		EApp2.ChildTwoInches1.click();
		EApp2.ChildTwoWeight.sendKeys("24");
		EApp2.ChildUSCitizenm2.click();
		EApp2.ChildTwoRelationshipParent.click();
		 act.pause(2000).perform();
	}

	@Then("Input child three Information SSN, Gender, Height, Weight, Slect US Citizen Option and Relationship")
	public void input_child_three_Information_SSN_Gender_Height_Weight_Slect_US_Citizen_Option_and_Relationship() {
		EApp2.ChildThreeSSN.click();
		EApp2.ChildThreeSSN.sendKeys("545100251");
		EApp2.ChildThreeGenderFemale.click();
		EApp2.ChildThreeHeight3Feet.click();
		EApp2.ChildThree2Inches.click();
		EApp2.ChildThreeWeight.sendKeys("25");
		EApp2.ChildThreeUSCitizen.click();
		EApp2.ChildThreeRelationshipParent.click();
	}

	@Then("Next page for Benficiaries for First Protect Contingent beneficiary FullName, SSN, Relationship and DOB")
	public void next_page_for_Benficiaries_for_First_Protect_Contingent_beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.Next.click();
		act.pause(2000).perform();
		 EApp2.SomeOneElseForSpouseContingent.click();
		    act.pause(2000).perform();
		    EApp2.SpouseContingentFN.sendKeys("My Estate");
		    EApp2.SpouseContingentRelationshipOther.click();
	}

	@Then("Beneficiary for Senior Protect Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void beneficiary_for_Senior_Protect_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		   act.pause(2000).perform();
		EApp2.SeniorProtectSponsorPrimarySomeOneElse.click();
	   EApp2.SecondPrmaryBenFullName.sendKeys("My Trust");
	   EApp2.SecondPrimaryBenRelationshiTrust.click();
	   act.pause(2000).perform();
	}

	@Then("Input Children Protect Primary Beneficiary for Silas Beneficiary FullName, SSN, Relationship and DOB")
	public void input_Children_Protect_Primary_Beneficiary_for_Silas_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	    EApp2.ChildProtectPrimarySomeOneElse.click();
	    EApp2.ChildProtectPrimaryFN.sendKeys("Priscilla LeBlanc");
	    EApp2.ChildProtectPrimarySSN.click();
	    EApp2.ChildProtectPrimarySSN.sendKeys("545100252");
	    EApp2.ChildProtectPrimaryRelationshipParent.click();
	    EApp2.ChildProtectPrimaryDOB.click();
	    EApp2.ChildProtectPrimaryDOB.sendKeys("10151978");
	    act.pause(2000).perform();
	}

	@Then("Input Children Protect Contingent Beneficiary for Silas Beneficiary FullName, SSN, Relationship and DOB")
	public void input_Children_Protect_Contingent_Beneficiary_for_Silas_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		   EApp2.ChildProtectPContingentSomeOneElse.click();
		   EApp2.ChildProtectContingentFN.sendKeys("Gramp LeBlanc");
		   EApp2.ChildProtectContingentRelationship.click();
		   act.pause(2000).perform();
	}

	@Then("Input Children Protect Primary Beneficiary for Xavier Beneficiary FullName, SSN, Relationship and DOB")
	public void input_Children_Protect_Primary_Beneficiary_for_Xavier_Beneficiary_FullName_SSN_Relationship_and_DOB() {
			EApp2.SecondChildProtectPrimarySomeOneElse.click();
			EApp2.SecondChildProtectPrimarytFN.sendKeys("Priscilla LeBlanc");
			EApp2.SecondChildProtectPrimarySSN.click();
			EApp2.SecondChildProtectPrimarySSN.sendKeys("545100253");
			EApp2.SecondChildProtectPrimaryRelationshipParent.click();
			EApp2.SecondChildProtectPrimaryDOB.click();
			EApp2.SecondChildProtectPrimaryDOB.sendKeys("10151987");
			act.pause(2000).perform();
			
	}

	@Then("Input Children Protect Contingent Beneficiary for Xavier Beneficiary FullName, SSN, Relationship and DOB")
	public void input_Children_Protect_Contingent_Beneficiary_for_Xavier_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	    EApp2.SecondChildProtectContingentSomeOneElse.click();
	    EApp2.SecondChildProtectContingentFN.sendKeys("Priscilla LeBlanc");
	    EApp2.SecondChildProtectContingentSSN.click();
	    EApp2.SecondChildProtectContingentSSN.sendKeys("545100254");
	    EApp2.SecondChildProtectContingentRelationshipParent.click();
	    EApp2.SecondChildProtectContingentDOB.click();
	    EApp2.SecondChildProtectContingentDOB.sendKeys("10151987");
	    act.pause(2000).perform();
		EApp2.NextBtn6.click();
	}

	@Then("Nexc page Select Email Summary and Select Acknowledgement Military Payment option")
	public void nexc_page_Select_Email_Summary_and_Select_Acknowledgement_Military_Payment_option() {
		EApp2.EmailSummary2.click();
		 act.pause(3000).perform();
		 EApp2.AcknowledgeofPayment.click();
	}

	@Then("Click I Agree to this Coverage and am ready to Signin button")
	public void click_I_Agree_to_this_Coverage_and_am_ready_to_Signin_button() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(3000).perform();
	}

	@Then("Select Applicant eSignature Three options")
	public void select_Applicant_eSignature_Three_options() {
		 EApp2.ClickQuestion1.click();
		   EApp2.ClickQuestion2.click();
		   EApp2.ClickQuestion3.click();
			act.pause(2000).perform();
	}

	@Then("Select recieve documents option for Paper and click Sign button")
	public void select_recieve_documents_option_for_Paper_and_click_Sign_button() {
		EApp2.PaperBtn2.click();
		 act.pause(2000).perform();
	}

	@Then("Select sign button for Agent Enroller eSignature")
	public void select_sign_button_for_Agent_Enroller_eSignature() {
		EApp2.SignBtn2.click();
		act.pause(3000).perform();
		EApp2.eSignatureBrn2.click();
		act.pause(7000).perform();
	}
}
