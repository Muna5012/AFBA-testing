package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EApp14BAFetTermFirstProStepDef extends TestBase {

	@When("Click Manage Cases button and Search IT QA Automation Call Center case")
	public void click_Manage_Cases_button_and_Search_IT_QA_Automation_Call_Center_case() {
		EApp2.ManageCaseButton.click();
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Call Center");
			act.pause(1000).perform();
		    EApp2.SearchITAutomationCallCenter.click();
	}

	@Then("Click New Enrollement button and Input Sponsor SSN, Enrollment City Pago Pago, Enrollment State AS")
	public void click_New_Enrollement_button_and_Input_Sponsor_SSN_Enrollment_City_Pago_Pago_Enrollment_State_AS() {
		EApp2.NewEnrollement.click();
		act.pause(2000).perform();
		EApp2.SSN.click();
		act.pause(1000).perform();
		 EApp2.SSN.sendKeys("545100255");
		 EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Pago Pago");
			act.pause(2000).perform();
			 EApp2.AS.click();
			   act.pause(1000).perform();
			   EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollement button and Input Sponsor Firs tName, Last Name, Gender and DOB")
	public void click_Begin_Enrollement_button_and_Input_Sponsor_Firs_tName_Last_Name_Gender_and_DOB() {
		//EApp2.BeginEnrollment.click();
	    EApp2.ClickNewSponsor.click();
		 EApp2.FirstName.sendKeys("Clarence");
		    EApp2.LastName.sendKeys("Carter");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("09281970");
			EApp2.GenderforMale.click();
	}

	@Then("Click Include Children button to input Adult Child FirstName, LastName, DOB")
	public void click_Include_Children_button_to_input_Adult_Child_FirstName_LastName_DOB() {
		EApp2.ChildrenBtn.click();
		act.pause(2000).perform();
		EApp2.ChildOneFN.sendKeys("Wallace");
	    EApp2.ChildOneLN.sendKeys("Carter");
	    EApp2.ChildOneDOB.click();
	    EApp2.ChildOneDOB.sendKeys("01211994");
	    act.pause(2000).perform();
	}
	
	@Then("Select Military on Eligibility options, select Air Force on BranchOfService")
	public void select_Military_on_Eligibility_options_select_Air_Force_on_BranchOfService() {
		EApp2.Eligibility.click();
		EApp2.BranchOfService2.click();
	}

	@Then("Select Active Status and Rank option O two")
	public void select_Active_Status_and_Rank_option_O_two() {
		EApp2.DutyStatus2.click();
		 EApp2.RankO2.click();
	}

	@Then("Select Military Allotment on Contribution Mode and input DepartmentCode AutoTest and Sourcecode AT{int}")
	public void select_Military_Allotment_on_Contribution_Mode_and_input_DepartmentCode_AutoTest_and_Sourcecode_AT(Integer int1) {
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
		 EApp2.DepartmentCode.sendKeys("AutoTest");
			EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street address, city, state and st Zipcode")
	public void input_Street_address_city_state_and_st_Zipcode() {
		 EApp2.Street.sendKeys("14 River Rd");
		  EApp2.Street2.sendKeys("Apt 1234");
		  EApp2.City.sendKeys("San Diego");
	      EApp2.State.click();
	      EApp2.State.sendKeys("California");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(2000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("92102");
	}

	@Then("Input Email address for confimation and phone numbers")
	public void input_Email_address_for_confimation_and_phone_numbers() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
			EApp2.Phone.sendKeys("7037065961");
			  act.pause(2000).perform();
	}

	@Then("Click Show Coverage options to Select Benefitiary Planes")
	public void click_Show_Coverage_options_to_Select_Benefitiary_Planes() {
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}

	@Then("Select Better Alternative Tobacco for sponsor and Customize one hundred thousand K")
	public void select_Better_Alternative_Tobacco_for_sponsor_and_Customize_one_hundred_thousand_K() {
		 EApp2.Tobacco.click();
		 act.pause(2000).perform();
		 EApp2.CustomizeOption3.click();
		 act.pause(3000).perform();
	}

	@Then("Select FedTerm Customize Sponsor fifty thousand K and Adult Child No customize benefit option")
	public void select_FedTerm_Customize_Sponsor_fifty_thousand_K_and_Adult_Child_No_customize_benefit_option() {
		EApp2.FedTerm.click();
		EApp2.CustomizeOptionSe10.click();
		act.pause(3000).perform();
		
	}

	@Then("Select First Protect customize Adult Child fifty thousand K")
	public void select_First_Protect_customize_Adult_Child_fifty_thousand_K() {
		EApp2.ClickFirstProtect.click();
		EApp2.ClickFirstProtectKid1Customize5.click();
		act.pause(3000).perform();
		
	}

	@Then("Waived Application Member benefit five thousand")
	public void waived_Application_Member_benefit_five_thousand() {
		  EApp2.spouseCoverage.click();
			 EApp2.WaiveApplication.click();
			 act.pause(3000).perform();	
	}

	@Then("Next page Answer All the Questions")
	public void next_page_Answer_All_the_Questions() {
		  EApp2.Next.click();
		  EApp2.AnswerNOAll.click();
		    act.pause(2000).perform(); 
		    EApp2.NextBtn2.click();
	}

	@Then("Next Page Input sponsor information include Height and Weight")
	public void next_Page_Input_sponsor_information_include_Height_and_Weight() {
		EApp2.HeightOption6.click();
	    EApp2.HeightInchesOption5.click();
	    act.pause(2000).perform();
	    EApp2.Weight.click();
	    EApp2.Weight.sendKeys("207"); 
	    EApp2.NextBtn3.click();
	}

	@Then("Next page input Adult child information, SSN, Gender, Height, Weight and Relationship")
	public void next_page_input_Adult_child_information_SSN_Gender_Height_Weight_and_Relationship() {
		EApp2.ChildOneSSN.click();
		EApp2.ChildOneSSN.sendKeys("545100256");
		EApp2.ChildOneGenderMale.click();
		EApp2.ChildOneHeight6Feet.click();
		EApp2.ChildOneHeight0Inches.click();
		EApp2.ChildOneWeight.sendKeys("188");
		EApp2.ChildOneRelationshipParent.click();
		act.pause(2000).perform();
	}

	@Then("Next page Input Better Alternative Sponsor Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void next_page_Input_Better_Alternative_Sponsor_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.Next.click();
		act.pause(1000).perform();
		EApp2.PrimaryBenficiaryFullName.sendKeys("Eva Braun");
		EApp2.PrimaryBeneficiarySSN.click();
	    EApp2.PrimaryBeneficiarySSN.sendKeys("545100257");
	    EApp2.PrimaryBeneficiaryRelationship2.click();
	    EApp2.PrimaryBeneficiaryDOB.click();
		  EApp2.PrimaryBeneficiaryDOB.sendKeys("11281949");
		   act.pause(2000).perform();
	}

	@Then("Input Sponsor Better Alternative Contingent Beneficiary coverage FullName, SSN, Relationship and DOB")
	public void input_Sponsor_Better_Alternative_Contingent_Beneficiary_coverage_FullName_SSN_Relationship_and_DOB() {
		EApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	    EApp2.ContingentBeneficiaryFullName.sendKeys("My Trust");
	    EApp2.ContingentRelationshipForTrust.click();
		act.pause(2000).perform();
	    
	}

	@Then("Input FetTerm product Sponsor Primary Beneficiary FullName, SSN, Relationship and DOB")
	public void input_FetTerm_product_Sponsor_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.SecondPrmaryBenFullName.sendKeys("Wallace Carter");
		EApp2.SecondPrimaryBenfSSN.click();
		EApp2.SecondPrimaryBenfSSN.sendKeys("545100258");
		EApp2.SecondPrimaryBenRelationshipforChild.click();
		EApp2.SecondPrimaryBenfDOB.click();
		EApp2.SecondPrimaryBenfDOB.sendKeys("01211994");
		act.pause(2000).perform();
		
	}

	@Then("Input FedTerm Product Sponsor Contingent Beneficiary FullName, SSN, Relationship and DOB")
	public void input_FedTerm_Product_Sponsor_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
		EApp2.secondSomeOneElse.click();
		EApp2.SecondContingentBeneficiaryFullName.sendKeys("My Trust");
		EApp2.SecondContingentBeneficiaryRelationshipforTrust.click();
		act.pause(2000).perform();
	}

	@Then("Input First Protect Adult Child Primary Beneficiary FullName, SSN. Relastionship and DOB")
	public void input_First_Protect_Adult_Child_Primary_Beneficiary_FullName_SSN_Relastionship_and_DOB() {
		EApp2.FirstProtectPrimarySomeOneElse.click();
		EApp2.FirstProtectPrimaryFN.sendKeys("Mable Godley");
		EApp2.FirstProtectPrimarySSN.click();
		EApp2.FirstProtectPrimarySSN.sendKeys("545100259");
		EApp2.FirstProtectPrimaryRelationshipBF.click();
		EApp2.FirstProtectPrimaryDOB.click();
		EApp2.FirstProtectPrimaryDOB.sendKeys("11151963");
		act.pause(2000).perform();

	}

	@Then("Nexc page select Email Summary and Select Acknowledgement Military Payment option")
	public void nexc_page_select_Email_Summary_and_Select_Acknowledgement_Military_Payment_option() {
		EApp2.NextBtn6.click();
		EApp2.EmailSummary2.click();
		 act.pause(3000).perform();
		 EApp2.AcknowledgeofPayment.click();
	}

	@Then("Click I agree to this Coverage and am ready to signin button")
	public void click_I_agree_to_this_Coverage_and_am_ready_to_signin_button() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(3000).perform();
	}

	@Then("Select Applicant eSignature three options radio Button")
	public void select_Applicant_eSignature_three_options_radio_Button() {
		 EApp2.ClickQuestion1.click();
		   EApp2.ClickQuestion2.click();
		   EApp2.ClickQuestion3.click();
			act.pause(2000).perform();
	}

	@Then("Select recieve Documents option for Paper and click Sign button")
	public void select_recieve_Documents_option_for_Paper_and_click_Sign_button() {
		EApp2.PaperBtn2.click();
		 act.pause(2000).perform();
	}

	@Then("Select Sign Button for Agent Enroller eSignature")
	public void select_Sign_Button_for_Agent_Enroller_eSignature() {
		EApp2.SignBtn2.click();
		act.pause(3000).perform();
		EApp2.eSignatureBrn2.click();
		act.pause(7000).perform();
	}


	  
	
	  
	
	
}
