package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EAppCallCenter2 extends TestBase {
	
	@When("Click Manage Cases button on Homepage and Search IT QA Automation Call Center and click it")
	public void click_Manage_Cases_button_on_Homepage_and_Search_IT_QA_Automation_Call_Center_and_click_it() {
		EApp2.ManageCaseButton.click();
		EApp2.searchSpace.click();
		EApp2.searchSpace.sendKeys("IT_QA Automation Call Center");
		act.pause(1000).perform();
		EApp2.SearchITAutomationCallCenter.click();
		
	}

	@Then("Click New Enrollement button to Input Sponsor SSN, Enrollment City, Enrollment State")
	public void click_New_Enrollement_button_to_Input_Sponsor_SSN_Enrollment_City_Enrollment_State() {
		 EApp2.NewEnrollement.click();
		 act.pause(1000).perform();
		 EApp2.SSN.click();
		 EApp2.SSN.sendKeys("999999999");
		 EApp2.EnrollmentCity.clear();
		 EApp2.EnrollmentCity.sendKeys("Lake Gaston");
		 act.pause(2000).perform();
		 EApp2.VA.click();
		 act.pause(1000).perform();
		 EApp2.NextBtn.click();
		 EApp2.SSN.clear();
		 act.pause(1000).perform();
		 EApp2.SSN.click();
		 EApp2.SSN.sendKeys("656000070");
		 act.pause(1000).perform();
		 EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollement and Input the Sponsor First Name, Last Name, Gender and DOB")
	public void click_Begin_Enrollement_and_Input_the_Sponsor_First_Name_Last_Name_Gender_and_DOB() {
			EApp2.BeginEnrollment.click();
		    //EApp2.ClickNewSponsor.click();
			EApp2.FirstName.sendKeys("Mark Anthony");
			EApp2.LastName.sendKeys("Woodward");
			act.pause(1000).perform();
			EApp2.DOB.click();
			EApp2.DOB.sendKeys("02211978");
			EApp2.GenderforMale.click();
	}

	@Then("Click Include Children button to input first Child first name, last name, DOB")
	public void click_Include_Children_button_to_input_first_Child_first_name_last_name_DOB() {
		EApp2.ChildrenBtn.click();
		act.pause(2000).perform();
		EApp2.ChildOneFN.sendKeys("Mark Anthony");
	    EApp2.ChildOneLN.sendKeys("Woodward Jr");
	    EApp2.ChildOneDOB.click();
	    EApp2.ChildOneDOB.sendKeys("09162004");
	    act.pause(2000).perform();
	}

	@Then("Click Add Child button to input second Child first name, last name, DOB")
	public void click_Add_Child_button_to_input_second_Child_first_name_last_name_DOB() {
		EApp2.AddChildBtn.click();
		act.pause(2000).perform();
		EApp2.ChildTwoFN.sendKeys("Wyatt James");
		EApp2.ChildTwoDOB.click();
		EApp2.ChildTwoDOB.sendKeys("06222007");
	}

	@Then("Click Add Child button to input third Child first name, last name, DOB")
	public void click_Add_Child_button_to_input_third_Child_first_name_last_name_DOB() {
		EApp2.AddChildBtn.click();
		act.pause(2000).perform();
		EApp2.ChildThreeFN.sendKeys("Elizabeth");
		EApp2.ChildThreeDOB.click();
		EApp2.ChildThreeDOB.sendKeys("08282010");
	}

	@Then("Select Military on Eligibility Options, Select Air Force on BranchOfService")
	public void select_Military_on_Eligibility_Options_Select_Air_Force_on_BranchOfService() {
		EApp2.Eligibility.click();
		EApp2.BranchOfArmyService.click();
	}

	@Then("Select Active Status and Rank option Osix")
	public void select_Active_Status_and_Rank_option_Osix() {
		EApp2.DutyStatus2.click();
		EApp2.RankO6.click();
	}

	@Then("Select MilitaryAllotment on Contribution Mode")
	public void select_MilitaryAllotment_on_Contribution_Mode() {
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
	}

	@Then("Input DepartmentCode and Sourcecode")
	public void input_DepartmentCode_and_Sourcecode() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
		EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input street address, City, state and ST Zipcode")
	public void input_street_address_City_state_and_ST_Zipcode() {
		  EApp2.Street.sendKeys("12 River Rd");
		  EApp2.Street2.sendKeys("Apt 1232");
		  EApp2.City.sendKeys("Atlantic City");
	      EApp2.State.click();
	      EApp2.State.sendKeys("New Jersey");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(2000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("08201");
	      act.pause(1000).perform();
	}

	@Then("Input Emails for confimation and daytime phone numbers")
	public void input_Emails_for_confimation_and_daytime_phone_numbers() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
		 EApp2.Phone.sendKeys("7037065961");
		 act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options to Select benefitiary planes")
	public void click_Show_Coverage_Options_to_Select_benefitiary_planes() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}
	
	@Then("Waived BA, Fed Term, First protect, Application Member Benefit")
	public void waived_BA_Fed_Term_First_protect_Application_Member_Benefit() {
		 EApp2.CustomizeOption2.click();
		 act.pause(2000).perform();
	    act.pause(2000).perform();
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

	@Then("Click Children Protect and select Covered for Three of children")
	public void click_Children_Protect_and_select_Covered_for_Three_of_children() {
	   EApp2.ChildrenProtectClick.click();
	   act.pause(2000).perform();
	   EApp2.CoveredForFirstKid.click();
	   EApp2.CoveredforSecondKid.click();
	   EApp2.CoveredForThrid.click();
	   act.pause(2000).perform();
	}

	@Then("Next Page to Answer to All the questions")
	public void next_Page_to_Answer_to_All_the_questions() {
		  EApp2.Next.click();
		  EApp2.AnswerNOAll.click();
		  act.pause(2000).perform(); 
		  EApp2.NextBtn2.click();
		  
	}

	@Then("Next page Input Sponsor Height and weight")
	public void next_page_Input_Sponsor_Height_and_weight() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption5.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("200"); 
	    EApp2.NextBtn3.click();
	}

	@Then("Input child one information SSN, Gender, Height, Weight, Slect US Citizen Option and Relationship")
	public void input_child_one_information_SSN_Gender_Height_Weight_Slect_US_Citizen_Option_and_Relationship() {
		EApp2.ChildOneSSN.click();
		EApp2.ChildOneSSN.sendKeys("656000071");
		EApp2.ChildOneGenderMale.click();
		EApp2.ChildOneHeight5Feet.click();
		EApp2.ChildOneHeight6Inches.click();
		EApp2.ChildOneWeight.sendKeys("101");
		EApp2.ChildUSCitizen.click();
		EApp2.ChildOneRelationship.click();
		act.pause(2000).perform();
	}

	@Then("Input child two information SSN, Gender, Height, Weight, Slect US Citizen Option and Relationship")
	public void input_child_two_information_SSN_Gender_Height_Weight_Slect_US_Citizen_Option_and_Relationship() {
		EApp2.ChildTwoSSN.click();
		EApp2.ChildTwoSSN.sendKeys("656000072");
		EApp2.ChildTwoGenderMale.click();
		EApp2.ChildTwoHeight5Feet.click();
		EApp2.ChildTwoInches0.click();
		EApp2.ChildTwoWeight.sendKeys("85");
		EApp2.ChildUSCitizenm2.click();
		EApp2.ChildTwoRelationship.click();
		 act.pause(2000).perform();  
	  
	}

	@Then("Input child three information SSN, Gender, Height, Weight, Slect US Citizen Option and Relationship")
	public void input_child_three_information_SSN_Gender_Height_Weight_Slect_US_Citizen_Option_and_Relationship() {
		EApp2.ChildThreeSSN.click();
		EApp2.ChildThreeSSN.sendKeys("656000073");
		EApp2.ChildThreeGenderFemale.click();
		EApp2.ChildThreeHeight4Feet.click();
		EApp2.ChildThree11Inches.click();
		EApp2.ChildThreeWeight.sendKeys("59");
		EApp2.ChildThreeUSCitizen.click();
		EApp2.ChildThreeRelationship.click();
	}

	@Then("Input Beneficiary for Better Alternative sponsor beneficiary Full Name, SSN, Relationship and DOB")
	public void input_Beneficiary_for_Better_Alternative_sponsor_beneficiary_Full_Name_SSN_Relationship_and_DOB() {
		EApp2.Next.click();
		act.pause(2000).perform();
	    EApp2.PrimaryBenficiaryFullName.sendKeys("Basil Kennedy");
	    EApp2.PrimaryBeneficiarySSN.click();
	    EApp2.PrimaryBeneficiarySSN.sendKeys("656000074");
	    EApp2.PrimaryBeneficiaryRelationship.click();
	    EApp2.PrimaryBeneficiaryDOB.click();
	    EApp2.PrimaryBeneficiaryDOB.sendKeys("03171964");
	    act.pause(2000).perform();
	    EApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	    EApp2.ContingentBeneficiaryFullName.sendKeys("Samuel Webster");
	    EApp2.ContingentBeneficiarySSNnumber.click();
	    EApp2.ContingentBeneficiarySSNnumber.sendKeys("545200078");
	    EApp2.ContingentBeneficiaryDOB.click();
	    EApp2.ContingentBeneficiaryDOB.sendKeys("05121989");
		act.pause(1000).perform();
		EApp2.ContingentBeneficiaryRelationship.click();
		
		act.pause(2000).perform();
	}

	@Then("First kid Mark Anthony Primary and Contingent Beneficiary FullName, SSN, DOB and Relationship")
	public void first_kid_Mark_Anthony_Primary_and_Contingent_Beneficiary_FullName_SSN_DOB_and_Relationship() {
		  EApp2.SomeOneElseForChildProtectPrimaryFirstKid.click();
		  EApp2.ChildProtecFirstChildtPrimaryFN.sendKeys("Margaret Thatcher");
		  EApp2.ChildProtectFirstChildPrimarySSN.click();
		  EApp2.ChildProtectFirstChildPrimarySSN.sendKeys("656000075");
		  EApp2.ChildProtectFirstChildPrimaryRelationshipBrother.click();
		  EApp2.ChildProtectFirstChildPrimaryDOB.click();
		  EApp2.ChildProtectFirstChildPrimaryDOB.sendKeys("02201985");
		  act.pause(1000).perform();
		  
		  EApp2.SomeOneElseChildProtectFirstKidContingetnt.click();
		  EApp2.ChildProtectFirstKidContingentBeneficiaryFN.sendKeys("Margaret Thatcher");
		  EApp2.ChildProtectFirstKidContingentBeneficiarySSN.click();
		  EApp2.ChildProtectFirstKidContingentBeneficiarySSN.sendKeys("656000076");
		  EApp2.ChildProtectFirstKidContingentBeneficiaryRelationship.click();
		  EApp2.ChildProtectFirstKidContingentBeneficiaryDOB.click();
		  EApp2.ChildProtectFirstKidContingentBeneficiaryDOB.sendKeys("02201985");
		  act.pause(1000).perform();
	   
	}

	@Then("Second kid Wyatt James Primary and Contingent Beneficiary FullName,SSN, Relationship and DOB")
	public void second_kid_Wyatt_James_Primary_and_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		   EApp2.SomeOneElseForChildProtectPrimarySecondtKid.click();
		   EApp2.ChildProtectSecondChildtPrimaryFN.sendKeys("Margaret Thatcher");
		   EApp2.ChildProtectSecondChildPrimarySSN.click();
		   EApp2.ChildProtectSecondChildPrimarySSN.sendKeys("656000077");
		   EApp2.ChildProtectSecondChildPrimaryRelationship.click();
		   EApp2.ChildProtectSecondChildPrimaryDOB.click();
		   EApp2.ChildProtectSecondChildPrimaryDOB.sendKeys("05201990");
		 
	}

	@Then("Third kid Elizabeth Primary and Contingent Beneficiary FullName, SSN, Relationship and DOB")
	public void third_kid_Elizabeth_Primary_and_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.SomeOneElseForChildProtectPrimaryThirdtKid.click();
		EApp2.ChildProtectThirdChildtPrimaryFN.sendKeys("Caroline Woodward");
		EApp2.ChildProtectThirdChildPrimarySSN.click();
		EApp2.ChildProtectThirdChildPrimarySSN.sendKeys("656000078");
		EApp2.ChildProtectThirdChildPrimaryRelationship.click();
		EApp2.ChildProtectThirdChildPrimaryDOB.click();
		EApp2.ChildProtectThirdChildPrimaryDOB.sendKeys("10301980");

	    act.pause(2000).perform();
	 		EApp2.NextBtn6.click();
	}

	@Then("Nexc page Select Email Summary and select Acknowledgement Military Payment option")
	public void nexc_page_Select_Email_Summary_and_select_Acknowledgement_Military_Payment_option() {
		EApp2.EmailSummary2.click();
		 act.pause(3000).perform();
		 EApp2.AcknowledgeofPayment.click();
	}

	@Then("Click I agree to this coverage and am ready to signin button")
	public void click_I_agree_to_this_coverage_and_am_ready_to_signin_button() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(3000).perform();
	}

	@Then("Slect Application eSignature Three options")
	public void slect_Applucation_eSignature_Three_options() {
		   EApp2.ClickQuestion1.click();
		   EApp2.ClickQuestion2.click();
		   EApp2.ClickQuestion3.click();
			act.pause(2000).perform();
			
	}

	@Then("Select recieve documents option for Paper and click sign button")
	public void select_recieve_documents_option_for_Paper_and_click_sign_button() {
		 EApp2.PaperBtn2.click();
		 act.pause(2000).perform();
	}

	@Then("Select Sign button for Agent Enroller eSignature")
	public void select_Sign_button_for_Agent_Enroller_eSignature() {;
		EApp2.SignBtn2.click();
		act.pause(3000).perform();
		EApp2.eSignatureBrn2.click();
		act.pause(7000).perform();
	}
}
