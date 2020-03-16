package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import pages.EApp3;
import utilities.TestBase;

public class NewMembershipAppSponsorSpousewithAdultChild extends TestBase{

	@When("Click Manage Cases button and Search IT QA Automation Call Center Case")
	public void click_Manage_Cases_button_and_Search_IT_QA_Automation_Call_Center_Case() {
		EApp2.Home.click();
		act.pause(2000).perform();
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
		EApp2.SSN.sendKeys("545200108");
		EApp2.EnrollmentCity.clear();
		EApp2.EnrollmentCity.sendKeys("PARK CITY");
		act.pause(2000).perform();
		EApp2.UT.click();
		act.pause(1000).perform();
		EApp2.NextBtn.click();
	}

	@Then("click Begin Enrollement buttonInput Sponsor First Name, Last Name, Gender and DOB")
	public void click_Begin_Enrollement_buttonInput_Sponsor_First_Name_Last_Name_Gender_and_DOB() {
	//	EApp2.BeginEnrollment.click();
	    EApp2.ClickNewSponsor.click();
		EApp2.FirstName.sendKeys("DANE");
		EApp2.LastName.sendKeys("ALBAN");
		act.pause(1000).perform();
		EApp2.DOB.click();
		EApp2.DOB.sendKeys("08201978");
	    EApp2.Gender.click();
	}

	@Then("Click Married to input Spouse First Name, Last Name and DOB")
	public void click_Married_to_input_Spouse_First_Name_Last_Name_and_DOB() {
		 EApp2.MarriedBtn.click();
		 act.pause(1000).perform();
		 EApp2.SpouseFN.sendKeys("Kim");
		 EApp2.SpouseLN.sendKeys("ALBAN");
		 act.pause(1000).perform();
		 EApp2.SpouseDOB.click();
		 EApp2.SpouseDOB.sendKeys("01301969");
	}

	@Then("Click Include Children Button to input Adult Child First Name, Last Name, DOB")
	public void click_Include_Children_Button_to_input_Adult_Child_First_Name_Last_Name_DOB() {
		EApp2.ChildrenBtn.click();
		act.pause(1000).perform();
		EApp2.ChildOneFN.sendKeys("Aaron");
	    EApp2.ChildOneLN.sendKeys("ALBAN");
	    EApp2.ChildOneDOB.click();
	    EApp2.ChildOneDOB.sendKeys("10111995");
	    act.pause(1000).perform();
	}

	@Then("Click Add Child button to input Minor Child First Name, Last Name and DOB")
	public void click_Add_Child_button_to_input_Minor_Child_First_Name_Last_Name_and_DOB() {
		EApp2.AddChildBtn.click();
		act.pause(1000).perform();
		EApp2.ChildTwoFN.sendKeys("Carol");
		EApp2.ChildTwoDOB.click();
		EApp2.ChildTwoDOB.sendKeys("09262001");
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
		 EApp2.DepartmentCode.sendKeys("AutomationTest");
			EApp2.SourceCode.sendKeys("ATWINTER");
	}

	@Then("Input Street address, City, State and St Zipcode")
	public void input_Street_address_City_State_and_St_Zipcode() {
		 EApp2.Street.sendKeys("5141 Cove Canyon Dr APt");
		  EApp2.City.sendKeys("Park City");
	      EApp2.State.click();
	      EApp2.State.sendKeys("UT");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(2000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("84098");
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
	
	@Then("Select BA Customize sponsor spouse, and select child coverage")
	public void select_BA_Customize_sponsor_spouse_and_select_child_coverage() {
		EApp2.Tobacco.click();
		act.pause(2000).perform();
		EApp2.BASponsorCustomize100.click();
		act.pause(1000).perform();
		EApp2.CustomizeOption4.click();
		act.pause(2000).perform();
		EApp2.ChildCoverageClick.click();
		EApp2.ChildrenCoverageOption5.click();
		act.pause(1000).perform();
   
	}

	@Then("Click Fed Term, Tobacco to sponsor, Cutomize sponsor and spouse, no benefit to two kids")
	public void click_Fed_Term_Tobacco_to_sponsor_Cutomize_sponsor_and_spouse_no_benefit_to_two_kids() {
		EApp2.FedTerm.click();
		EApp2.LT20SponsorCustomize100.click();
		act.pause(2000).perform();
		EApp2.LT20NoBenefitforspouse.click();
		act.pause(1000).perform();
		EApp2.LT20NoBenefitforAdultChild.click();
		act.pause(1000).perform();
		EApp2.LT20NoBenefitForSecondChild.click();
		
		
   
	}

	@Then("Click First Protect Customize two adult child, no benefit to sponsor and spouse")
	public void click_First_Protect_Customize_two_adult_child_no_benefit_to_sponsor_and_spouse() {
		EApp2.ClickFirstProtect.click();
		act.pause(2000).perform();
		EApp2.NOBeneForFirstProtectSponsor.click();
		act.pause(1000).perform();
		EApp2.NOBeneForFirstProtectSpouse.click();
		act.pause(1000).perform();
		EApp2.ClickFirstProtectFirstKidCustomize150.click();
		act.pause(2000).perform();
		EApp2.ClickFirstProtectKid1Customize5.click();
		act.pause(1000).perform();
	}
	
	@Then("Click Senior Protect and waived Senior Protect")
	public void click_Senior_Protect_and_waived_Senior_Protect() {
		EApp2.SeniorProtect.click();
		EApp2.WaiveSeniorProtect.click();
		act.pause(2000).perform();
	}

	@Then("Click Covedred on group free, and answer yes or no questions")
	public void click_Covedred_on_group_free_and_answer_yes_or_no_questions() {
		EApp2.spouseCoverage.click();
		EApp2.Covered.click();
		act.pause(3000).perform();	
		EApp2.YesForFirstQuestion.click();
		act.pause(1000).perform();
		EApp2.YESForSecondQuestion.click();
		act.pause(2000).perform();
	}

	@Then("Next page Answer All Qustions")
	public void next_page_Answer_All_Qustions() {
		EApp2.Next.click();
		EApp2.AnswerNOAll.click();
//	    act.pause(2000).perform(); 
//	    EApp2.AnsweYesFirstQuestion.click();
//	    EApp2.AnsweYesFirstQuestionforSpouse.click();
//	    EApp2.AnsweYes10yearsQuestion.click();
//	    EApp2.AnsweYes10yearsQuestionAnswer.sendKeys("Reason One.....");
//	    act.pause(2000).perform();
//	    EApp2.AnsweYes10yearsQuestiontwo.click();
//	    EApp2.AnsweYes10yearsQuestiontwoRadioBtn.click();
//	    EApp2.AnsweYes10yearsQuestiontwoRadioBtnAnswer.sendKeys("Reason Two.....");
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
		EApp2.SpouseSSN.click();
		 EApp2.SpouseSSN.sendKeys("545200023");
		 EApp2.SpouseGenderMale.click();
		 act.pause(1000).perform();
		 EApp2.SpouseHeigthFeet.click();
		 EApp2.SpouseHeightInches.click();
		  act.pause(2000).perform();
		  EApp2.SpouseWeight.click();
		  EApp2.SpouseWeight.sendKeys("143");
		  act.pause(2000).perform();
		  
		EApp2.ChildOneSSN.click();
		EApp2.ChildOneSSN.sendKeys("545200024");
		EApp2.ChildOneGenderFamale.click();
		EApp2.ChildOneHeight5Feet.click();
		EApp2.ChildOneHeight10Inches.click();
		EApp2.ChildOneWeight.sendKeys("143");
		act.pause(1000).perform();
		//EApp2.ChildUSCitizen.click();
		EApp2.ChildOneRelationshipParent.click();
		
		act.pause(3000).perform();
		EApp2.ChildTwoSSN.click();
		EApp2.ChildTwoSSN.sendKeys("545200025");
		EApp2.ChildTwoGenderMale.click();
		EApp2.ChildTwoHeight5Feet.click();
		EApp2.ChildTwoInches6.click();
		EApp2.ChildTwoWeight.sendKeys("103");
		act.pause(1000).perform();
	//	EApp2.ChildUSCitizenm2.click();
		EApp2.ChildTwoRelationshipParent.click();
		act.pause(2000).perform();
		EApp2.Next.click();
	}


	@Then("Input BA Sponsor Primary Beneficiary full name, DOB, SSN and relationship")
	public void input_BA_Sponsor_Primary_Beneficiary_full_name_DOB_SSN_and_relationship() {
		act.pause(1000).perform();
		EApp3.BASponsorPrimarySomeoneElse.click();
		EApp2.PrimaryBenficiaryFullName.sendKeys("Maldo Lanski");
		EApp2.PrimaryBeneficiarySSN.click();
		EApp2.PrimaryBeneficiarySSN.sendKeys("545200082");
		EApp2.PrimaryBeneficiaryRelationship.click();
		EApp2.PrimaryBeneficiaryDOB.click();
		EApp2.PrimaryBeneficiaryDOB.sendKeys("10121954");
	}	
	
	@Then("Input BA Spouse Primary Beneficiary full name, DOB, SSN, relationship")
	public void input_BA_Spouse_Primary_Beneficiary_full_name_DOB_SSN_relationship() {
		EApp2.BASpouseSomeOneElse.click();
		EApp2.BASpousePrimaryFullName.sendKeys("NATHAN ALFSEN");
		EApp2.BASpousePrimarySSN.click();
		EApp2.BASpousePrimarySSN.sendKeys("545200110");
		EApp2.BASpousePrimaryRelationship.click();
		EApp2.BASpousePrimaryDOB.click();
		EApp2.BASpousePrimaryDOB.sendKeys("10141993");
		act.pause(2000).perform();
	}
	
	@Then("Input Fed Term Sponsor Primary Beneficiary full name, SSN, relationship, DOB")
	public void input_Fed_Term_Sponsor_Primary_Beneficiary_full_name_SSN_relationship_DOB() {
		EApp2.SecondPrmaryBenSOmeOneElse.click();
		EApp2.SecondPrmaryBenFullName.sendKeys("SCOTT JOHN");
		EApp2.SecondPrimaryBenfSSN.click();
		EApp2.SecondPrimaryBenfSSN.sendKeys("545200111");
		EApp2.SecondPrimaryBenRelationship.click();
		EApp2.SecondPrimaryBenfDOB.click();
		EApp2.SecondPrimaryBenfDOB.sendKeys("10141987");
		act.pause(2000).perform();
	}

	@Then("Input Fed Term Spouse Primary Beneficiary full name, SSN, relationship, DOB")
	public void input_Fed_Term_Spouse_Primary_Beneficiary_full_name_SSN_relationship_DOB() {
		EApp3.FedTermSpousePrimarySomeOneElse.click();
		EApp3.FedTermSpousePrimarytFN.sendKeys("DANE ALBAN");
		EApp3.FedTermSpousePrimarytSSN.click();
		EApp3.FedTermSpousePrimarytSSN.sendKeys("545200112");
		EApp3.FedTermSpousePrimaryRelationshipFather.click();
		EApp3.FedtermSpousePrimaryDOB.click();
		EApp3.FedtermSpousePrimaryDOB.sendKeys("03301992");
		act.pause(2000).perform();
	}

	@Then("Input First Protect first kid primary beneficiary full name, SSN, relationship, DOB")
	public void input_First_Protect_first_kid_primary_beneficiary_full_name_SSN_relationship_DOB() {
		EApp2.FirstProtectPrimarySomeOneElse.click();
		EApp2.FirstProtectPrimaryFN.sendKeys("JOSHUA SCOTT");
		EApp2.FirstProtectPrimarySSN.click();
		EApp2.FirstProtectPrimarySSN.sendKeys("545200113");
		EApp2.FirstProtectPrimaryRelationshipBF.click();
		EApp2.FirstProtectPrimaryDOB.click();
		EApp2.FirstProtectPrimaryDOB.sendKeys("10151986");
		act.pause(2000).perform();
	}
	
	@Then("Input First Protect second kid primary beneficiary full name, SSN, relationship, DOB")
	public void input_First_Protect_second_kid_primary_beneficiary_full_name_SSN_relationship_DOB() {
		EApp3.FirstProtectSponsorPrimarySomeOneElse.click();
		EApp3.FirstProtectSponsorPrimaryFl.clear();
		act.pause(1000).perform();
		EApp3.FirstProtectSponsorPrimaryFl.click();
		EApp3.FirstProtectSponsorPrimaryFl.sendKeys("TIKA ALBEK");
		EApp3.FirstProtectSponsorPrimarySSN.click();
		EApp3.FirstProtectSponsorPrimarySSN.sendKeys("545200114");
		EApp3.FirstProtectSponsorPrimaryRelationshipParent.click();
		EApp3.FirstProtectSponsorPrimaryDOB.click();
		EApp3.FirstProtectSponsorPrimaryDOB.sendKeys("08161984");
		act.pause(2000).perform();
		
		EApp3.FirstProtectSpousePrimarySomeOneElse.click();
		EApp3.FirstProtectSpousePrimarytFN.sendKeys("EMILY AGUILAR");
		EApp3.FirstProtectSpousePrimarySSN.click();
		EApp3.FirstProtectSpousePrimarySSN.sendKeys("545200115");
		EApp3.FirstProtectSpousePrimaryRelationshipParent.click();
		EApp3.FirstProtectSpousePrimaryDOB.click();
		EApp3.FirstProtectSpousePrimaryDOB.sendKeys("05011970");
		act.pause(2000).perform();
	}

	@Then("Input Group Free sponsor primary beneficiary full name, SSN, relationship, DOB")
	public void input_Group_Free_sponsor_primary_beneficiary_full_name_SSN_relationship_DOB() {
		act.pause(1000).perform();
		EApp3.FirstprotectSponsorPrimarySomeOneElse.click();
		EApp3.FirstprotectSponsorPrimaryFL.sendKeys("BRITTANY AHMEYER");
		EApp3.FirstprotectSponsorPrimarySSN.click();
		EApp3.FirstprotectSponsorPrimarySSN.sendKeys("545200116");
		EApp3.FirstprotectSponsorPrimaryRelationship.click();
		EApp3.FirstprotectSponsorPrimaryDOB.click();
		EApp3.FirstprotectSponsorPrimaryDOB.sendKeys("09091990");
		act.pause(2000).perform();
	}
	

	@Then("Nexc page select Email Summary and select Acknowledgement Military Payment radio button")
	public void nexc_page_select_Email_Summary_and_select_Acknowledgement_Military_Payment_radio_button() {
		EApp2.NextBtn6.click();
		EApp2.EmailSummary2.click();
		act.pause(3000).perform();
		EApp2.AcknowledgeofPayment.click();
		//  EApp2.SpouseSigninYesforCallCenter.click();
		  act.pause(2000).perform();
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
