package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Remote;
import utilities.TestBase;

public class EAppRemote8 extends TestBase {

	
	@When("Click New Enrollment button to create case")
	public void click_New_Enrollment_button_to_create_case() {
		 Remote.SSN.click();
		 Remote.SSN.sendKeys("404000074");
		 Remote.EnrollmentCity.clear();
		 Remote.EnrollmentCity.sendKeys("Jackson");
		 Remote.EnrollmentState.click();
		 Remote.WY.click();
		 act.pause(2000).perform();
	}

	@Then("Enter Sponsor SSN, Enrollment City is Jackson and Enrollment State is WY")
	public void enter_Sponsor_SSN_Enrollment_City_is_Jackson_and_Enrollment_State_is_WY() {
		 Remote.NextBtn.click();
	}

	@Then("Select Begin Enrollment button to start the case")
	public void select_Begin_Enrollment_button_to_start_the_case() {
	//	Remote.BeginEnrollment.click();
		Remote.ClickNewSponsor.click();
		act.pause(2000).perform();
	}

	@Then("Enter Sponsor First Name Maude, Last Name Findlay, Gender famale and DOB")
	public void enter_Sponsor_First_Name_Maude_Last_Name_Findlay_Gender_famale_and_DOB() {
		Remote.FirstName.sendKeys("Maude");
	    Remote.LastName.sendKeys("Findlay");
	    Remote.DOB.click();
	    act.pause(1000).perform();
	    Remote.DOB.sendKeys("03151978");
	    Remote.Gender.click();   
	    act.pause(2000).perform();
	   
	}

	@Then("Select Married button enter spouse First Name Walter, Last Name Findlay and DOB")
	public void select_Married_button_enter_spouse_First_Name_Walter_Last_Name_Findlay_and_DOB() {
		 Remote.MarriedBtn.click();
		 Remote.SpouseFN.sendKeys("Walter");
		 Remote.SpouseLN.sendKeys("Findlay");
		 Remote.SpouseDOB.click();
		 act.pause(1000).perform();
		 Remote.SpouseDOB.sendKeys("07211969");
	}

	@Then("Select Include Children button enter Adult Child one First Name Carol, Last Name Findlay, DOB")
	public void select_Include_Children_button_enter_Adult_Child_one_First_Name_Carol_Last_Name_Findlay_DOB() {
		Remote.ChildrenBtn.click();
		Remote.ChildOneFN.sendKeys("Carol");
		Remote.ChildOneLN.sendKeys("Findlay");
		Remote.ChildOneDOB.click();
		Remote.ChildOneDOB.sendKeys("08011993");
		act.pause(1000).perform();
	}

	@Then("Click Add Child button enter Adult Child two First Name Arthur, Last Name Findlay, DOB")
	public void click_Add_Child_button_enter_Adult_Child_two_First_Name_Arthur_Last_Name_Findlay_DOB() {
	    Remote.AddChildBtn.click();
	    Remote.ChildTwoFN.sendKeys("Arthur");
	    Remote.ChildTwoDOB.click();
	    Remote.ChildTwoDOB.sendKeys("08021993");
	    act.pause(1000).perform();
	    
	}

	@Then("Click Add Child button enter Adult Child three First Name Edith, Last Name Findlay, DOB")
	public void click_Add_Child_button_enter_Adult_Child_three_First_Name_Edith_Last_Name_Findlay_DOB() {
		Remote.AddChildBtn.click();
		Remote.ChildThreeFN.sendKeys("Edith");
		Remote.ChildThreeDOB.click();
		Remote.ChildThreeDOB.sendKeys("08031993");
		act.pause(1000).perform();
	}

	@Then("Click Add Child button enter Minor child one First Name Gloria, Last Name Findlay, DOB")
	public void click_Add_Child_button_enter_Minor_child_one_First_Name_Gloria_Last_Name_Findlay_DOB() {
		Remote.AddChildBtn.click();
	    Remote.ChildFourFN.sendKeys("Gloria");
	    Remote.ChildFourDOB.click();
	    Remote.ChildFourDOB.sendKeys("03212014");
	    act.pause(1000).perform();
	}

	@Then("Click Add Child button enter Minor Child two First Name Mike, Last Name Findlay, DOB")
	public void click_Add_Child_button_enter_Minor_Child_two_First_Name_Mike_Last_Name_Findlay_DOB() {
		Remote.AddChildBtn.click();
		Remote.ChildFifthFN.sendKeys("Mike");
		Remote.ChildFifthDOB.click();
		Remote.ChildFifthDOB.sendKeys("03222014");
		act.pause(1000).perform();
	}

	@Then("Click Add Child button enter Minor Child three First Name Lionel, Last Name Findlay, DOB")
	public void click_Add_Child_button_enter_Minor_Child_three_First_Name_Lionel_Last_Name_Findlay_DOB() {
		Remote.AddChildBtn.click();
	    Remote.ChildSixFN.sendKeys("Lionel");
	    Remote.ChildSixDOB.click();
	    Remote.ChildSixDOB.sendKeys("03232014");
	    act.pause(1000).perform();
	}

	@Then("Select Law Enforcement on Eligibility option and select checkmatic for Contribution Mode")
	public void select_Law_Enforcement_on_Eligibility_option_and_select_checkmatic_for_Contribution_Mode() {
	  Remote.LawEnforcement.click();
	  act.pause(1000).perform();
	  Remote.Checkmatic.click();
	  act.pause(1000).perform();
	}

	@Then("Enter Street Address, City, State, Zip and Daytime phone numbers")
	public void enter_Street_Address_City_State_Zip_and_Daytime_phone_numbers() {
		Remote.Street.sendKeys("Bayview Shores");
	    Remote.Street2.sendKeys("Apt 8");
	    Remote.City.sendKeys("Pago Pago");
	    Remote.State.sendKeys("American Samoa");
	    Remote.State.sendKeys(Keys.ENTER);
	    Remote.ZipCode.click();
	    Remote.ZipCode.sendKeys("96799");
	    Remote.Phone.click();
	    Remote.Phone.sendKeys("7037065961");
	    act.pause(3000).perform();
	}

	@Then("Select Beneficiary Coverage Options")
	public void select_Beneficiary_Coverage_Options() {
		Remote.ShowCoverageOptions.click();
	    act.pause(1000).perform();
	}

	@Then("Coverage Benficiary Options waive enrollment in Better Alternative, Fed Term, Application Member Benefit")
	public void coverage_Benficiary_Options_waive_enrollment_in_Better_Alternative_Fed_Term_Application_Member_Benefit() {
		Remote.WaiveBA.click();
		act.pause(1000).perform();
	  	Remote.FedTerm.click();
	  	act.pause(1000).perform();
		Remote.WaiveFedTerm.click();
		act.pause(2000).perform();
	}

	@Then("Select Senior Protect select Option one")
	public void select_Senior_Protect_select_Option_one() {
		Remote.SeniorProtect.click();
		act.pause(1000).perform();
		Remote.SeniorProtectOption1.click();
		act.pause(2000).perform();
		Remote.ApplicationMemberBenf.click();
		Remote.WaiveApplication.click();
		act.pause(2000).perform();
	}

	@Then("First Protect select NonTobacco Customize fifty thousand K for each adult child")
	public void first_Protect_select_NonTobacco_Customize_fifty_thousand_K_for_each_adult_child() {
		Remote.FirstProtect.click();
		act.pause(1000).perform();
		Remote.FirstProtectNoBenefitforSponsor.click();
		Remote.FirstProtectNoBenefitForSpouse.click();
		act.pause(1000).perform();
		Remote.FirstProtectAC1Customize50.click();
		Remote.FirstProtectAC2Customize50.click();
		Remote.FirstProtectAC3Customize50.click();
		act.pause(2000).perform();
	}

	@Then("Childrens Protect Covered three Minor Child")
	public void childrens_Protect_Covered_three_Minor_Child() {
		  Remote.ChildrenProtectClick.click();
		  Remote.CoveredForFirstKid.click();
		  Remote.CoveredforSecondKid.click();
		  Remote.CoveredForThrid.click();
		  act.pause(2000).perform();
		  act.pause(2000).perform();
		  Remote.NextBtn2.click();
	}
	
	@Then("Answer Yes or No questions for Qualification")
	public void answer_Yes_or_No_questions_for_Qualification() {
		Remote.OtherInsuranceSponsor1.click();
		Remote.OtherInsuranceSponsor2.click();
		Remote.OtherInsuranceSponsor3.click();
		Remote.OtherInsuranceSponsor4.click();
		act.pause(1000).perform();
		Remote.OtherInsuranceSpouse1.click();
		Remote.OtherInsuranceSpouse2.click();
		Remote.OtherInsuranceSpouse3.click();
		Remote.OtherInsuranceSpouse4.click();
		act.pause(1000).perform();
		Remote.OtherInsuranAC1.click();
		Remote.OtherInsuranAC2.click();
		Remote.OtherInsuranAC3.click();
		Remote.OtherInsuranAC4.click();
		act.pause(1000).perform();
		Remote.OtherInsuranSecondAC1.click();
		Remote.OtherInsuranSecondAC2.click();
	    act.pause(1000).perform();
	    Remote.SeniorProtecforSpouse1.click();
	    Remote.SeniorProtecforSpouse2.click();
	    Remote.SeniorProtecforSpouse3.click();
	    Remote.SeniorProtecforSpouse4.click();
	    Remote.SeniorProtecforSpouse5.click();
	    act.pause(1000).perform();
	    Remote.SeniorProtectSponsor1.click();
	    Remote.SeniorProtectSponsor2.click();
	    Remote.SeniorProtectSponsor3.click();
	    Remote.SeniorProtectSponsor4.click();
	    Remote.SeniorProtectSponsor5.click();
	    Remote.SeniorProtectSponsor6.click();
	    Remote.SeniorProtectSponsor7.click();
	    act.pause(1000).perform();
	    Remote.FirstProtectforSecondAC1.click();
	    Remote.FirstProtectforSecondAC2.click();
	    Remote.FirstProtectforSecondAC3.click();
	    Remote.FirstProtectforSecondAC4.click();
	    Remote.FirstProtectforSecondAC5.click();
	    Remote.FirstProtectforSecondAC6.click();
	    Remote.FirstProtectforSeconsAC7.click();
	    act.pause(1000).perform();
	    Remote.FirstProtectforThridAC1.click();
	    Remote.FirstProtectforThridAC2.click();
	    Remote.FirstProtectforThridAC3.click();
	    Remote.FirstProtectforThridAC4.click();
	    Remote.FirstProtectforThridAC5.click();
	    Remote.FirstProtectforThridAC6.click();
	    Remote.FirstProtectforThridAC7.click();
	    act.pause(2000).perform();
	    Remote.ChildProtectMC1.click();
	    Remote.ChildProtectMC2.click();
	    Remote.ChildProtectMC3.click();
	    Remote.ChildProtectMC4.click();
	    act.pause(1000).perform();
	    Remote.ChildProtectSecondMC1.click();
	    Remote.ChildProtectSecondMC2.click();
	    Remote.ChildProtectSecondMC3.click();
	    Remote.ChildProtectSecondMC4.click();
 	    act.pause(1000).perform();
	    Remote.ChildProtectThridMC1.click();
	    Remote.ChildProtectThridMC2.click();
	    Remote.ChildProtectThridMC3.click();
   	    Remote.ChildProtectThridMC4.click();
        act.pause(2000).perform();
	    Remote.NextBtn2.click();  
	}

	@Then("Enter Sponsor Information include Height and Weight")
	public void enter_Sponsor_Information_include_Height_and_Weight() {
		 Remote.Height5Feet.click();
		 Remote.Height11Inches.click();
		 Remote.Weight.sendKeys("156");
		 act.pause(2000).perform();
		 Remote.NextBtn2.click();
	}

	@Then("Enter Spouse Information include Height and Weight")
	public void enter_Spouse_Information_include_Height_and_Weight() {
	    Remote.SpouseSSN.click();
	    Remote.SpouseSSN.sendKeys("404000075");
	    Remote.SpouseGenderMale.click();
	    Remote.Spouse6Feet.click();
	    Remote.Spouse6Inches.click();
	    Remote.SpouseWeight.sendKeys("238");
	    act.pause(2000).perform();
	}

	@Then("Enter Children Information include SSN, Gender, Height, Weight, Status and Relationship")
	public void enter_Children_Information_include_SSN_Gender_Height_Weight_Status_and_Relationship() {
		  Remote.ChildOneSSN.click();
		  Remote.ChildOneSSN.sendKeys("404000076");
		  Remote.ChildOneGenderFamale.click();
		  Remote.ChildOnet5Feet.click();
		  Remote.ChildOne9Inches.click();
		  Remote.ChildOneWeight.sendKeys("124");
		  Remote.ChildUSCitizen.click();
		  Remote.ChildOneRelationshipParent.click();
		  act.pause(1000).perform();
		    
		  Remote.ChildTwoSSN.click();
		  Remote.ChildTwoSSN.sendKeys("404000077");
		  Remote.ChildTwoGenderMale.click();
		  Remote.ChildTwo5Feet.click();
		  Remote.ChildTwo10Inches.click();
		  Remote.ChildTwoWeight.sendKeys("139");
		  Remote.ChildTwoRelationshipParent.click();
		  Remote.ChildTwoUSCitizenm.click();
		  act.pause(1000).perform();
		    
		  Remote.ChildThreeSSN.click();
		  Remote.ChildThreeSSN.sendKeys("404000078");
		  Remote.ChildThreeGenderFemale.click();
		  Remote.ChildThree5Feet.click();
		  Remote.ChildThree9Inches.click();
		  Remote.ChildThreeWeight.sendKeys("141");
		  Remote.ChildThreeUSCitizen.click();
		  Remote.ChildThreeRelationshipG.click();
		  act.pause(1000).perform();
		    
		  Remote.Child4SSN.click();
		  Remote.Child4SSN.sendKeys("404000079");
		  Remote.Child4Famale.click();
		  Remote.Child4Feet3.click();
		  Remote.Child4Inches8.click();
		  Remote.Child4Weight.sendKeys("115");
		  Remote.Child4USCitizenYes.click();
		  Remote.Child4RelationshipGrandParent.click();
		  act.pause(1000).perform();
		    
		   Remote.Child5SSN.click();
		   Remote.Child5SSN.sendKeys("404000080");
		   Remote.Child5Male.click();
		   Remote.Child5Feet3.click();
		   Remote.Child5Inches7.click();
		   Remote.Child5Weight.sendKeys("130");
		   Remote.Child5USCitizen.click();
		   Remote.Child5RelationshipStepParent.click();
		   act.pause(1000).perform();
		    
		    Remote.Child6SSN.click();
		    Remote.Child6SSN.sendKeys("404000081");
		    Remote.Child6Male.click();
		    Remote.Chil65Feet3.click();
		    Remote.Child6Inches6.click();
		    Remote.Child6Weight.sendKeys("100");
		    Remote.Child6USCitizen.click();
		    Remote.Child6RelationshipStepParent.click();
		    act.pause(2000).perform();
		    Remote.Next.click();
		    
		    }
	
	@Then("Enter Senior Protect Primary Beneficiary of Spouse Coverage beneficiary FullName, Relationship")
	public void enter_Senior_Protect_Primary_Beneficiary_of_Spouse_Coverage_beneficiary_FullName_Relationship() {
	   	   Remote.SomeoneElseForSpousePrimary.click();
		   Remote.SpousePrimarytFN.sendKeys("NY Dodgers");
		   Remote.SpousePrimaryRelationshipOther.click();
	}

	@Then("Senior Protect Contingent Beneficiary of Spouse Coverage beneficiary FullName, Relationship")
	public void senior_Protect_Contingent_Beneficiary_of_Spouse_Coverage_beneficiary_FullName_Relationship() {
		  Remote.BASpouseContingentSomeOneElse.click();
	      Remote.SpouseContingentFN.sendKeys("Conrad Bane");
	      Remote.SpouseContingentRelationshipBoyFriend.click();
	}

	@Then("First Protect first Adult Child Carol Primary Beneficiary FullName, Relationship")
	public void first_Protect_first_Adult_Child_Carol_Primary_Beneficiary_FullName_Relationship() {
		Remote.AC1FirstProtectPrimarySomeOneElse.click();
		Remote.AC1FirstProtectPrimaryFN.sendKeys("Wyatt Erpp");
		Remote.ACFirstProtectPrimaryRelationshipNephew.click();
	}

	@Then("First Protect first Adult Child Contingent Beneficiary FullName, Relationship")
	public void first_Protect_first_Adult_Child_Contingent_Beneficiary_FullName_Relationship() {
		Remote.AC1FirstProtectContingentSomeOneElse.click();
		Remote.AC1FirstProtectContingentFN.sendKeys("Towson Li");
		Remote.AC1FirstProtectContingentRelationshipSister.click();
	}

	@Then("First Protect second Adult Child Primary Beneficiary FullName, Relationship")
	public void first_Protect_second_Adult_Child_Primary_Beneficiary_FullName_Relationship() {
		Remote.AC2FirstProtectPrimarySomeOneElse.click();
		Remote.AC2FirstProtectPrimaryFN.sendKeys("Mia Carr");
		Remote.AC2FirstprotectPrimaryRelationshipAunt.click();
	}

	@Then("First Protect second Adult Child Contingent Beneficiary FullName, Relationship")
	public void first_Protect_second_Adult_Child_Contingent_Beneficiary_FullName_Relationship() {
		Remote.AC2FirstProtectContingentSomeOneElse.click();
		Remote.AC2FirstProtectContingentFN.sendKeys("Belva Dane");
		Remote.AC2FirstProtectContingentRelationshipOther.click();
	}

	@Then("First Protect last Adult Child Primary Beneficiary FullName, Relationship")
	public void first_Protect_last_Adult_Child_Primary_Beneficiary_FullName_Relationship() {
		Remote.AC3FirstProtectPrimarySomeOneElse.click();
		Remote.AC3FirstProtectPrimaryFN.sendKeys("June Carter");
		Remote.AC3FirstProtectPrimaryRelationshipSister.click();
	}

	@Then("First Protect last Asult Child Contingent Beneficiary FullName, Relationship")
	public void first_Protect_last_Asult_Child_Contingent_Beneficiary_FullName_Relationship() {
		Remote.AC3FirstProtectContingentSomeOneElse.click();
		Remote.AC3FirstProtectContingentFN.sendKeys("Chuck Gage");
		Remote.AC3FirstProtectContingentRelationshipUncle.click();
	}

	@Then("Children Protect first Minor Child Lillith Primary Beneficiary FullName, Relationship")
	public void children_Protect_first_Minor_Child_Lillith_Primary_Beneficiary_FullName_Relationship() {
		Remote.MC1ChildProtectPrimarySomeoneElse.click();
		Remote.MC1ChildProtectPrimaryFN.sendKeys("Nikki Six");
		Remote.MC1ChildProtectPrimaryRelationshipBrother.click();
	}

	@Then("Children Protect first Minor Child Lillith Contingent Bneficiary FullName, Relationship")
	public void children_Protect_first_Minor_Child_Lillith_Contingent_Bneficiary_FullName_Relationship() {
		Remote.MC1ChildProtectContingentSomeoneElse.click();
		Remote.MC1ChildProtectContingentFN.sendKeys("Courtney Love");
		Remote.MC1ChildProtectContingentRelationshipSister.click();
	}

	@Then("Children Protect second Minor Child Milton Primary Benedficiary FullName, Relastionship")
	public void children_Protect_second_Minor_Child_Milton_Primary_Benedficiary_FullName_Relastionship() {
		Remote.MC2ChildProtectPrimarySomeoneElse.click();
		Remote.MC2ChildProtectPrimaryFN.sendKeys("Dave Axe");
		Remote.MC2ChildProtectPrimaryRelationshipOther.click();
	}

	@Then("Children Protect second Minor Child Milton Contingent Beneficiary FullName, Relationship")
	public void children_Protect_second_Minor_Child_Milton_Contingent_Beneficiary_FullName_Relationship() {
		Remote.MC2ChildProtectContingentSomeoneElse.click();
		Remote.MC2ChildProtectContingentFN.sendKeys("My Trust");
		Remote.MC2ChildProtectContingentRelationshipTrust.click();
	}

	@Then("Children Protect Minor Child Isabella Primary Beneficiary FullName, Relationship")
	public void children_Protect_Minor_Child_Isabella_Primary_Beneficiary_FullName_Relationship() {
		Remote.MC3ChildProtectPrimarySomeoneElse.click();
		Remote.MC3ChildProtectPrimaryFN.sendKeys("Jewel Marxs");
		Remote.MC3ChildProtectPrimaryRelationshipStepParent.click();
	}

	@Then("Children protect Minor Child Isabella Contingent Beneficiary FullName, Relationship")
	public void children_protect_Minor_Child_Isabella_Contingent_Beneficiary_FullName_Relationship() {
		Remote.MC3ChildProtectContingentSomeoneElse.click();
		Remote.MC3ChildProtectContingentFN.sendKeys("Celia Waz");
		Remote.MC3ChildProtectContingentRelationshipNiece.click();
	}
	
	@Then("Confirmation page select Email Summary enter Email address and repeat it for confirmation")
	public void confirmation_page_select_Email_Summary_enter_Email_address_and_repeat_it_for_confirmation() {
		  Remote.NextBtn6.click();
		    act.pause(2000).perform();
		  act.pause(1000).perform();
		   Remote.EmailSummary1.click();
		   act.pause(1000).perform();
		   Remote.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
		   Remote.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
		   act.pause(1000).perform();
		   
	}

	@Then("Select Day Of Deduction, Account Type, Routing Number, Account Number, Bank Name, City, State, Zip")
	public void select_Day_Of_Deduction_Account_Type_Routing_Number_Account_Number_Bank_Name_City_State_Zip() {
		Remote.DayOfDeduction1.click();
	    act.pause(1000).perform();
	    Remote.CheckingAccountType.click();
	    Remote.RoutingNumber.click();
	    Remote.RoutingNumber.sendKeys("011103093");
	    Remote.AccountNumber.click();
	    Remote.AccountNumber.sendKeys("123423532");
	    Remote.BankName.sendKeys("TD Bank");
	    Remote.CityStateZip.sendKeys("Arlington, VA, 22205");
	    act.pause(2000).perform();  
	}

	@Then("Click Singing Via Email option and enter Email address and repeat it")
	public void click_Singing_Via_Email_option_and_enter_Email_address_and_repeat_it() {
		   Remote.SiginingViaEmail.click();
		    act.pause(2000).perform();
			Remote.EnterEmailOne.clear();
			Remote.EnterEmailOne.sendKeys("qapeep512@gmail.com");
			Remote.EnterEmailTwo.clear();
			Remote.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
			act.pause(1000).perform();
		 
	}
	
	@Then("Click Submit and Send Email for Signature button to submit application")
	public void click_Submit_and_Send_Email_for_Signature_button_to_submit_application() {
		 Remote.SubmitEmailForsignatureBtn.click();
		  act.pause(9000).perform();
	}

	@Then("Navigate back to Email account Login Email Username and Password")
	public void navigate_back_to_Email_account_Login_Email_Username_and_Password() {
		 driver.get("https://www.google.com");
		 Remote.SignIn.click();  
		 Remote.InputEmail.sendKeys("qapeep512@gmail.com");
		 Remote.NextButton.click();	
		 act.pause(2000).perform();
		 Remote.InputPassword.sendKeys("Muna@5012");
		 Remote.NextButton.click();
		 act.pause(4000).perform();
	}

	@Then("Select Inbox and check the Email from AFBA Enrollement and click Review Application on AFBA Enrollment")
	public void select_Inbox_and_check_the_Email_from_AFBA_Enrollement_and_click_Review_Application_on_AFBA_Enrollment() {
		Remote.ClickSelect.click();
		act.pause(1000).perform();
		Remote.ClickEmail.click();
		act.pause(2000).perform();
		//Remote.ClickInbox.click();
		Remote.SelectFirstEmail.click();
		act.pause(2000).perform();
		act.pause(2000).perform();
		Remote.ReviewApplicationBtn.click();
		act.pause(2000).perform();
		
		java.util.Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String handle1 : driver.getWindowHandles()) {
               System.out.println(handle1);
               driver.switchTo().window(handle1);
        }
	}

	

	@Then("Enter sponsor last Name and Last four SSN numbers")
	public void enter_sponsor_last_Name_and_Last_four_SSN_numbers() {
		Remote.LastNameforSponsor.sendKeys("Findlay");
		Remote.LastSSNforSponsor.sendKeys("0074");
	}

	@Then("Click review and sign my Application button")
	public void click_review_and_sign_my_Application_button() {
		Remote.ReviewAndSignMyApplication.click();
		act.pause(3000).perform();
	}

	@Then("Click ReviewAapplication ducuments button to review all application")
	public void click_ReviewAapplication_ducuments_button_to_review_all_application() {
		Remote.ReviewApplicationDocumentBtn.click();
		act.pause(9000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
	}

	@Then("Enter sponsor and spouse last Name and last four SSN numbers")
	public void enter_sponsor_and_spouse_last_Name_and_last_four_SSN_numbers() {
		Remote.SponsorLastName.sendKeys("Rojasp");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
	    Remote.SponsorLastName.clear();
		Remote.SponsorLastName.click();	
	    Remote.SponsorLastName.sendKeys("Findlay");
		Remote.SponsorLastSSN.sendKeys("0077");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
		Remote.SponsorLastSSN.clear();
		Remote.SponsorLastSSN.click();
		Remote.SponsorLastSSN.sendKeys("0074");
		act.pause(1000).perform();
		Remote.SpouseLastName.sendKeys("Findlay");
		Remote.SpouseLastSSN.click();
		Remote.SpouseLastSSN.sendKeys("0075");
	}

	@Then("Select Paper receive the Document option")
	public void select_Paper_receive_the_Document_option() {
		Remote.PaperBtn.click();
		act.pause(2000).perform();
		Remote.SignBtn.click();
		act.pause(3000).perform();
	}

	@Then("Navigate back to login AFBA Enrollment web page")
	public void navigate_back_to_login_AFBA_Enrollment_web_page() {
		driver.get("https://enroll-sandbox.afba.com/login");
		Remote.email.sendKeys("qapeep512@gmail.com");
		Remote.password.sendKeys("Muna@512");
		Remote.loginBtn.click();
		act.pause(3000).perform();
	}

	@Then("Click Access agent to Signing Inbox button")
	public void click_Access_agent_to_Signing_Inbox_button() {
		Remote.AccessAgentSigningInbox.click();
		act.pause(2000).perform();
	}

	@Then("Sign the Application on Agent Inbox and esingging")
	public void sign_the_Application_on_Agent_Inbox_and_esingging() {
		Remote.SignButton.click();
		act.pause(2000).perform();
		Remote.ReviewApplicationDocumentBtn.click();
		act.pause(10000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
		Remote.Sign.click();
		act.pause(3000).perform();
	}


	}


