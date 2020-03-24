package EappStepDefination;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import pages.Remote;
import utilities.TestBase;

public class EAppRemote2 extends TestBase {

	@When("Click New Enrollment Input Sponsor SSN, Enrollment City and Enrollment State")
	public void click_New_Enrollment_Input_Sponsor_SSN_Enrollment_City_and_Enrollment_State() {
		  Remote.SSN.click();
		  Remote.SSN.sendKeys("666666666");
		  Remote.EnrollmentCity.clear();
		  Remote.EnrollmentCity.sendKeys("Charlotte");
		  Remote.EnrollmentState.click();
		  Remote.NC.click();
		  act.pause(2000).perform();
	}

	@Then("click Next and Click Begin Enrollment button")
	public void click_Next_and_Click_Begin_Enrollment_button() {
		  Remote.NextBtn.click();
		  Remote.SSN.clear();
		  act.pause(1000).perform();
		  Remote.SSN.click();
		  act.pause(1000).perform();
		  Remote.SSN.sendKeys("656000050");
		  act.pause(2000).perform();
		  Remote.NextBtn.click();
		  act.pause(2000).perform();
		  Remote.BeginEnrollment.click();
	//	 Remote.ClickNewSponsor.click();
		 act.pause(2000).perform();
	}

	@Then("Input Sponsor First Name, Last Name, Gender and Date Of Birth")
	public void input_Sponsor_First_Name_Last_Name_Gender_and_Date_Of_Birth() {
		   Remote.FirstName.sendKeys("Smith");
		    Remote.LastName.sendKeys("Robert");
		    Remote.DOB.click();
		    act.pause(1000).perform();
		    Remote.DOB.sendKeys("12301961");
		    Remote.GenderMale.click();   
		    act.pause(2000).perform();

	}

	@Then("Click Married Radio button and Input spouse First Name, Last Name and Date Of Birth")
	public void click_Married_Radio_button_and_Input_spouse_First_Name_Last_Name_and_Date_Of_Birth() {
		Remote.MarriedBtn.click();
	    Remote.SpouseFN.sendKeys("Maria");
	    Remote.SpouseLN.sendKeys("Robert");
	    Remote.SpouseDOB.click();
	    act.pause(1000).perform();
	    Remote.SpouseDOB.sendKeys("04111963");
	}

	@Then("Select Military on Eligibility Option, Navy on Branch of Service, Retiree status,")
	public void select_Military_on_Eligibility_Option_Navy_on_Branch_of_Service_Retiree_status() {
		  Remote.Military.click();
		   Remote.Navy.click();
		   Remote.RetireeDuty.click();
	}

	@Then("Select O three on Rank, Checkmatic on Contribution Mode")
	public void select_O_three_on_Rank_Checkmatic_on_Contribution_Mode() {
		 Remote.O3.click();
		   Remote.Checkmatic.click();
		   act.pause(2000).perform();
	}

	@Then("Enter Department_code and Source_code")
	public void enter_Department_code_and_Source_code() {
		Remote.DepartmentCode.sendKeys("AutoTest");
	    Remote.SourceCode.sendKeys("IT2");
	}

	@Then("Input Street Address, City, State and Zip")
	public void input_Street_Address_City_State_and_Zip() {
		    Remote.Street.sendKeys("Bayview Shores");
		    Remote.Street2.sendKeys("Apt 2");
		    Remote.City.sendKeys("Piti");
		    Remote.State.sendKeys("Guam");
		    Remote.State.sendKeys(Keys.ENTER);
		    Remote.ZipCode.click();
		    Remote.ZipCode.sendKeys("96915");
	}

	@Then("Input Email address, Daytime Phone Numbers")
	public void input_Email_address_Daytime_Phone_Numbers() {
		Remote.Phone.click();
	    Remote.Phone.sendKeys("7037065961");
	    act.pause(2000).perform();
	}

	@Then("Click Show Coverage Option to select Beneficiaries Product Plans")
	public void click_Show_Coverage_Option_to_select_Beneficiaries_Product_Plans() {
		  Remote.ShowCoverageOptions.click();
	}

//	@Then("Better Alternative select Tobacco for Sponsor and spouse")
//	public void better_Alternative_select_Tobacco_for_Sponsor_and_spouse() {
//		  Remote.TobaccoforSponsor.click();
//		  Remote.TobaccoforSpouse.click();
//		  act.pause(2000).perform();
//		  Remote.BASponsorCustomize50.click();
//		  act.pause(1000).perform();
//		  Remote.BASpouseCustomize50.click();
//		  act.pause(2000).perform();
//	}
//
//	@Then("Better Alternative Customise fifty thousand K for Sponsor and Spouse")
//	public void better_Alternative_Customise_fifty_thousand_K_for_Sponsor_and_Spouse() {
//		 Remote.BASponsorCustomize50.click();
//		    act.pause(1000).perform();
//		    Remote.BASpouseCustomize50.click();
//		    act.pause(2000).perform();
//	}

	@Then("Select Fed Term and Customize sponsor and spouse")
	public void select_Fed_Term_and_Customize_sponsor_and_spouse() {
	//	Remote.FedTerm.click();
		Remote.BASponsorCustomize100.click();
		   act.pause(2000).perform();
		   Remote.BASpouseCustomize100.click();
		   act.pause(2000).perform();
		   Remote.NextBtn2.click();
	}

//	@Then("Senior Protect select Option two")
//	public void senior_Protect_select_Option_two() {
//	    Remote.SeniorProtect.click();
//	 	   Remote.SeniorProtectOption2.click();
//		   act.pause(2000).perform();	  
//	   
//	}
//
//	@Then("First Protect Customize sponsor and spouse fifty thousand K")
//	public void first_Protect_Customize_sponsor_and_spouse_fifty_thousand_K() {
//		  Remote.FirstProtect.click();
//		  Remote.FirstProtectSponsorCustomize50.click();
//		  Remote.FirstProtectSpouseCustomize50.click();
//		  act.pause(2000).perform();
//		  Remote.NextBtn2.click();
//	}

	@Then("Click Next to Answer All the questions one by one")
	public void click_Next_to_Answer_All_the_questions_one_by_one() {
		EApp2.AnswerNOAll.click();
		act.pause(2000).perform();
//		    Remote.OISponsor1.click();
//		    Remote.OISponsor2.click();
//		    Remote.BASponsor1.click();
//		    Remote.BASponsor2.click();
//		    Remote.BASponsor3.click();
//		    Remote.BASponsor4.click();
//		    Remote.BASponsor5.click();
//		    Remote.BASponsor6.click();
//		    act.pause(1000).perform();
//		    Remote.SeniorProtectSponsor1.click();
//		    Remote.SeniorProtectSponsor2.click();
//		    Remote.SeniorProtectSponsor3.click();
//		    Remote.SeniorProtectSponsor4.click();
//		    Remote.FirstProtectSponsor1.click();
//		    Remote.FirstProtectSponsor2.click();
//		    Remote.FirstProtectSponsor3.click();
//		    Remote.FirstProtectSponsor4.click();
//		    Remote.FirstProtectSponsor5.click();
//		    Remote.FirstProtectSponsor6.click();
//		    Remote.FirstProtectSponsor7.click();
//		    act.pause(1000).perform();
//		    Remote.OISpouse1.click();
//		    Remote.OISpouse2.click();
//		    Remote.BASpouse1.click();
//		    Remote.BASpouse2.click();
//		    Remote.BASpouse3.click();
//		    Remote.BASpouse4.click();
//		    Remote.BASpouse5.click();
//		    Remote.BASpouse6.click();
//		    act.pause(1000).perform();
//		    Remote.SeniorProtectSpouse1.click();
//		    Remote.SeniorProtectSpouse2.click();
//		    Remote.SeniorProtectSpouse3.click();
//		    Remote.SeniorProtectSpouse4.click();
//		    act.pause(1000).perform();
//		    Remote.FirstProtectSpouse1.click();
//		    Remote.FirstProtectSpouse2.click();
//		    Remote.FirstProtectSpouse3.click();
//		    Remote.FirstProtectSpouse4.click();
//		    Remote.FirstProtectSpouse5.click();
//		    Remote.FirstProtectSpouse6.click();
//		    Remote.FirstProtectSpouse7.click();
		    act.pause(3000).perform();
		    Remote.NextBtn2.click();  
	}

	@Then("Select Sponsor Information Height Feet, Inches and Weight")
	public void select_Sponsor_Information_Height_Feet_Inches_and_Weight() {
		   Remote.Height6Feet.click();
		   Remote.Height3Inches.click();
		   Remote.Weight.sendKeys("230");
		   act.pause(2000).perform();
		   Remote.NextBtn2.click();
	}

	@Then("Select Spouse Information SSN, Gender, Height feet inches and Weight")
	public void select_Spouse_Information_SSN_Gender_Height_feet_inches_and_Weight() {
		    Remote.SpouseSSN.click();
		    Remote.SpouseSSN.sendKeys("888888888");
		    act.pause(1000).perform();
//		    Remote.SpouseGenderFamale.click();
		    Remote.Spouse5Feet.click();
		    Remote.Spouse5Inches.click();
		    Remote.SpouseWeight.sendKeys("165");
		    act.pause(2000).perform();
		    Remote.NextBtn2.click(); 
		    act.pause(2000).perform();
		    Remote.SpouseSSN.clear();
		    act.pause(1000).perform();
		    Remote.SpouseSSN.click();
		    act.pause(1000).perform();
		    Remote.SpouseSSN.sendKeys("656000051");
		    act.pause(1000).perform();
		    Remote.SpouseGenderFamale.click();
		    act.pause(2000).perform();
		    Remote.NextBtn2.click(); 
	}
	
	@Then("Better Alternative Sponsor Primary Beneficiary FullName, SSN, Relationship and Date of Birth")
	public void better_Alternative_Sponsor_Primary_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
	   Remote.BASponsorPrimarySomeOneElse.click();
		Remote.PrimaryBenficiaryFullName.sendKeys("Frank Tieri");
	    Remote.PrimaryBeneficiarySSN.click();
	    Remote.PrimaryBeneficiarySSN.sendKeys("656000052");
	    Remote.PrimaryRelationshipForUncle.click();
	    act.pause(1000).perform();
	}

	@Then("Better Alternative Sponsor Contingent Beneficiary FullName, SSN, Relationship and Date of Birth")
	public void better_Alternative_Sponsor_Contingent_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
		Remote.SomeoneElsee.click();
		Remote.ContingentBeneficiaryFullName.sendKeys("Maria Tieri");
		Remote.ContingentBeneficiaryRelationshipSister.click();
		Remote.ContingentBeneficiarySSNnumber.click();
		Remote.ContingentBeneficiarySSNnumber.sendKeys("656000053");
	}

	@Then("Better Alternative Spouse Primary Beneficiary FullName, SSN, Relationship and Date of Birth")
	public void better_Alternative_Spouse_Primary_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
		   Remote.SomeoneElseForSpousePrimary.click();
		   Remote.SpousePrimarytFN.sendKeys("Vincent Gigante");
		   Remote.SpousePrimarytSSN.click();
		   Remote.SpousePrimarytSSN.sendKeys("656000054");
		   Remote.SpousePrimaryRelationshipOther.click();
	}

	@Then("Better Alternative Spouse Contingent Beneficiary FullName, SSN, Relationship and Date of Birth")
	public void better_Alternative_Spouse_Contingent_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
	   Remote.BASpouseContingentSomeOneElse.click();
	   Remote.SpouseContingentFN.sendKeys("Charlie Luciano");
	   Remote.SpouseContingentSSN.click();
	   Remote.SpouseContingentSSN.sendKeys("656000055");
	   Remote.SpouseContingentRelationshipBrother.click();
	   act.pause(1000).perform();
	}

//	@Then("Senior Protect Sponsor Primary Beneficiary FullName, SSN, Relationship and Date of Birth")
//	public void senior_Protect_Sponsor_Primary_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
//	    Remote.SeniorProtectSponsorPrimaryBenifSomeoneElse.click();
//	    Remote.SeniorProtectSponsorPrmaryBenFullName.sendKeys("Nick Morello");
//	    Remote.SeniorProtectSponsorPrimaryBenfSSN.click();
//	    Remote.SeniorProtectSponsorPrimaryBenfSSN.sendKeys("656000056");
//	    Remote.SeniorProtectSponsorPrimaryBenRelationshipGrandParent.click();
//	    act.pause(1000).perform();
//	}
//
//	@Then("Senior Protect Sponsor Contingent Beneficiary FullName, SSN, Relationship and Date of Birth")
//	public void senior_Protect_Sponsor_Contingent_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
//	    Remote.SeniorProtectSponsorContingentSomeoneElse.click();
//	    Remote.SeniorProtrctSponsorContingentFullName.sendKeys("Lorenzo Strollo");
//	    Remote.SeniorProtrctSponsorContingentSSN.click();
//	    Remote.SeniorProtrctSponsorContingentSSN.sendKeys("656000057");
//	    act.pause(1000).perform();
//	    Remote.SeniorProtrctSponsorContingentRelationshipOther.click();
//	    act.pause(1000).perform();
//	}
//
//	@Then("Senior Protect Spouse Primary Beneficiary FullName, SSN, Relationship and Date of Birth")
//	public void senior_Protect_Spouse_Primary_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
//	    Remote.SeniorProtectSpousePrimarySomeoneElse.click();
//	    Remote.SeniorProtectSpousePrmaryBenFullName.sendKeys("Dominick Cirillo");
//	    Remote.SeniorProtectSpousePrimaryBenfSSN.click();
//	    Remote.SeniorProtectSpousePrimaryBenfSSN.sendKeys("656000058");
//	    Remote.SeniorProtectSpousePrimaryBenRelationshipUncle.click();
//	    act.pause(1000).perform();
//	}
//
//	@Then("Senior Protect Spouse Contingent Beneficiary FullName, SSN, Relationship and Date of Birth")
//	public void senior_Protect_Spouse_Contingent_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
//	    Remote.SeniorProtectSpouseContingentSomeoneElse.click();
//	    Remote.SeniorProtectSpouseContingentFullName.sendKeys("Angela Cirillo");
//	    Remote.SeniorProtectSpouseContingentSSN.click();
//	    Remote.SeniorProtectSpouseContingentSSN.sendKeys("656000059");
//	    Remote.SeniorProtectSpouseContingentRelationshipMother.click();
//	    act.pause(1000).perform();
//	    
//	}
//
//	@Then("First Protect Sponsor Primary Beneficiary FullName, SSN, Relationship and Date of Birth")
//	public void first_Protect_Sponsor_Primary_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
//		  Remote.FirstprotectSponsorPrimarySomeOneElse.click();
//		  Remote.FirstProtectSponsorPrimaryFullName.sendKeys("Mario Leo");
//		  Remote.FirstProtectSponsorPrimarySSN.click();
//		  Remote.FirstProtectSponsorPrimarySSN.sendKeys("656000060");
//		  Remote.FirstProtectSponsorPrimaryRelationshipOther.click();
//		  act.pause(1000).perform();
//	}
//
//	@Then("First Protect Sponsor Contingent Beneficiary FullName, SSN, Relationship and Date of Birth")
//	public void first_Protect_Sponsor_Contingent_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
//	    Remote.FirstProtectSponsorContingentSomeoneElse.click();
//	    Remote.FirstProtectSponsorContingentFullName.sendKeys("Charlie Luciano");
//	    Remote.FirstProtectSponsorContingentSSN.click();
//	    Remote.FirstProtectSponsorContingentSSN.sendKeys("656000061");
//	    Remote.FirstProtectSponsorContingentRelationshipBrother.click();
//	    act.pause(1000).perform();
//	}
//
//	@Then("First Protect Spouse Primary Beneficiary FullName, SSN, Relationship and Date of Birth")
//	public void first_Protect_Spouse_Primary_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
//	   Remote.FirstprotectSpousePrimarySomeOneElse.click();
//	   Remote.FirstProtectSpousePrimaryFullName.sendKeys("Connie Morello");
//	   Remote.FirstProtectSpousePrimarySSN.click();
//	   Remote.FirstProtectSpousePrimarySSN.sendKeys("656000062");
//	   Remote.FirstProtectSpousePrimaryRelationshipGrandParent.click();
//	   act.pause(1000).perform();
//	}
//
//	@Then("First Protect Spouse Contingent Beneficiary FullName, SSN, Relationship and Date of Birth")
//	public void first_Protect_Spouse_Contingent_Beneficiary_FullName_SSN_Relationship_and_Date_of_Birth() {
//	   Remote.FirstProtectSpouseContingentSomeoneElse.click();
//	   Remote.FirstProtectSpouseContingentFullName.sendKeys("Matthew Strollo");
//	   Remote.FirstProtectSpouseContingentSSN.click();
//	   Remote.FirstProtectSpouseContingentSSN.sendKeys("656000063");
//	   Remote.FirstProtectSpouseContingentRelationshipFatherInLaw.click();
//	   act.pause(2000).perform();
//	}
	
	@Then("Confirmation page select Email Summary input Email address")
	public void confirmation_page_select_Email_Summary_input_Email_address() {
		    Remote.NextBtn6.click();
		    act.pause(2000).perform();
			Remote.EmailSummary1.click();
			act.pause(1000).perform();
			Remote.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
			Remote.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
			act.pause(1000).perform();
	}

	@Then("Enter Bank Information select Day Of Deduction one, Account type Checking")
	public void enter_Bank_Information_select_Day_Of_Deduction_one_Account_type_Checking() {
	    Remote.DayOfDeduction1.click();
	    act.pause(1000).perform();
	    Remote.CheckingAccountType.click();
	}

	@Then("Input Routing Number, Account Number, Bank Name, City, State and Zip")
	public void input_Routing_Number_Account_Number_Bank_Name_City_State_and_Zip() {
	    Remote.RoutingNumber.click();
	    Remote.RoutingNumber.sendKeys("011103093");
	    Remote.AccountNumber.click();
	    Remote.AccountNumber.sendKeys("123423532");
	    Remote.BankName.sendKeys("TD Bank");
	    Remote.CityStateZip.sendKeys("Arlington, VA, 22205");
	    act.pause(2000).perform();
	}

	@Then("Select Singing Via Email button and input Email address")
	public void select_Singing_Via_Email_button_and_input_Email_address() {
		  Remote.SiginingViaEmail.click();
		  act.pause(2000).perform();
		  Remote.EnterEmailOne.clear();
		  Remote.EnterEmailOne.sendKeys("qapeep512@gmail.com");
		  Remote.EnterEmailTwo.clear();
		  Remote.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
		  act.pause(1000).perform();
	}

	@Then("Click Submit and Send Email for Signature button")
	public void click_Submit_and_Send_Email_for_Signature_button() {
		  Remote.SubmitEmailForsignatureBtn.click();
		  act.pause(9000).perform();  
	}

	@Then("Open Email account to login Email username and password")
	public void open_Email_account_to_login_Email_username_and_password() {
		 driver.get("https://www.google.com");
		 Remote.SignIn.click();  
		 Remote.InputEmail.sendKeys("qapeep512@gmail.com");
			Remote.NextButton.click();	
			act.pause(2000).perform();
			Remote.InputPassword.sendKeys("Muna@5012");
			Remote.NextButton.click();
			act.pause(4000).perform();
	}

	@Then("Select Inbox and check Email")
	public void select_Inbox_and_check_Email() {
		Remote.ClickSelect.click();
		act.pause(1000).perform();
		Remote.ClickEmail.click();
		act.pause(2000).perform();
		//Remote.ClickInbox.click();
		Remote.SelectFirstEmail.click();
		act.pause(2000).perform();
	//	Remote.selectEmail.click();
		
	}

	@Then("Click Review Application on AFBA Enrollment")
	public void click_Review_Application_on_AFBA_Enrollment() {
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

	@Then("Input sponsor Last Name and Last four SSN numbers")
	public void input_sponsor_Last_Name_and_Last_four_SSN_numbers() {
		Remote.LastNameforSponsor.sendKeys("Robert");
		Remote.LastSSNforSponsor.sendKeys("0050");
	}

	@Then("Click Review and sign my application button")
	public void click_Review_and_sign_my_application_button() {
		Remote.ReviewAndSignMyApplication.click();
		act.pause(3000).perform();
	}

	@Then("Click to open Review Application Ducuments button to review all the application")
	public void click_to_open_Review_Application_Ducuments_button_to_review_all_the_application() {
		Remote.ReviewApplicationDocumentBtn.click();
		act.pause(9000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input Sponsor and spouse Last Name and last four SSN numbers")
	public void input_Sponsor_and_spouse_Last_Name_and_last_four_SSN_numbers() {
		Remote.SponsorLastName.sendKeys("Manganooo");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
	    Remote.SponsorLastName.clear();
		Remote.SponsorLastName.click();	
	    Remote.SponsorLastName.sendKeys("Robert");
		Remote.SponsorLastSSN.sendKeys("0005");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
		Remote.SponsorLastSSN.clear();
		Remote.SponsorLastSSN.click();
		Remote.SponsorLastSSN.sendKeys("0050");
		act.pause(1000).perform();
		Remote.SpouseLastName.sendKeys("Robert");
		Remote.SpouseLastSSN.click();
		Remote.SpouseLastSSN.sendKeys("0051");
	}

	@Then("Select Paper radio button to receive the Document")
	public void select_Paper_radio_button_to_receive_the_Document() {
		Remote.PaperBtn.click();
		act.pause(2000).perform();
		Remote.SignBtn.click();
		act.pause(3000).perform();
		driver.get("https://enroll-sandbox.afba.com/login");
		Remote.email.sendKeys("qapeep512@gmail.com");
		Remote.password.sendKeys("Muna@512");
		Remote.loginBtn.click();
		act.pause(3000).perform();
		Remote.AccessAgentSigningInbox.click();
		act.pause(2000).perform();
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





