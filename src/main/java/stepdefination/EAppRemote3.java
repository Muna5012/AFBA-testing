package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import pages.Remote;
import utilities.TestBase;

public class EAppRemote3 extends TestBase {

	@When("Click New Enrollment enter Sponsor SSN, Enrollment City and Enrollment State")
	public void click_New_Enrollment_enter_Sponsor_SSN_Enrollment_City_and_Enrollment_State() {
		  Remote.SSN.click();
		  Remote.SSN.sendKeys("414000022");
		  Remote.EnrollmentCity.clear();
		  Remote.EnrollmentCity.sendKeys("Las Vegas");
		  Remote.EnrollmentState.click();
		  Remote.NV.click();
		  act.pause(2000).perform();
	}

	@Then("click Next and select Begin Enrollment button")
	public void click_Next_and_select_Begin_Enrollment_button() {
		  Remote.NextBtn.click();
	   	//  Remote.BeginEnrollment.click();
		  Remote.ClickNewSponsor.click();
		  act.pause(2000).perform();
	}

	@Then("Input Sponsor First Name, Last Name, gender and Date Of Birth")
	public void input_Sponsor_First_Name_Last_Name_gender_and_Date_Of_Birth() {
		  Remote.FirstName.sendKeys("Victoria Gotti");
		    Remote.LastName.sendKeys("Gotti");
		    Remote.DOB.click();
		    act.pause(1000).perform();
		    Remote.DOB.sendKeys("11271962");
		    Remote.Gender.click();   
		    act.pause(2000).perform();
	}

	@Then("Click Married Radio button and enter spouse First Name, Last Name and Date Of Birth")
	public void click_Married_Radio_button_and_enter_spouse_First_Name_Last_Name_and_Date_Of_Birth() {
		Remote.MarriedBtn.click();
	    Remote.SpouseFN.sendKeys("Carmine");
	    Remote.SpouseLN.sendKeys("Agnello");
	    Remote.SpouseDOB.click();
	    act.pause(1000).perform();
	    Remote.SpouseDOB.sendKeys("09161960");
	}

	@Then("Select Law Enforcement on Eligibility, select Credit Card on Contribution Mode")
	public void select_Law_Enforcement_on_Eligibility_select_Credit_Card_on_Contribution_Mode() {
	   Remote.LawEnforcement.click();
	   act.pause(1000).perform();
	   Remote.CreditCard.click();
	   act.pause(1000).perform();
	}

	@Then("Enter Street Address, City, State and Zip")
	public void enter_Street_Address_City_State_and_Zip() {
		 Remote.Street.sendKeys("Bayview Shores");
		 Remote.Street2.sendKeys("Apt 3");
		 Remote.City.sendKeys("San Diego");
		 Remote.State.sendKeys("California");
		 Remote.State.sendKeys(Keys.ENTER);
		 Remote.ZipCode.click();
		 Remote.ZipCode.sendKeys("92037");
	}

	@Then("Enter Email address, Daytime Phone Numbers")
	public void enter_Email_address_Daytime_Phone_Numbers() {
		Remote.Phone.click();
	    Remote.Phone.sendKeys("7037065961");
	    act.pause(3000).perform();
	}

	@Then("Click Show Coverage Option to select sponsor and spouse Beneficiary Plans")
	public void click_Show_Coverage_Option_to_select_sponsor_and_spouse_Beneficiary_Plans() {
		  Remote.ShowCoverageOptions.click();
	}
	

	@Then("Better Alternative select Tobacco for Spouse and Customize fifty thousand K for Sponsor and Spouse")
	public void better_Alternative_select_Tobacco_for_Spouse_and_Customize_fifty_thousand_K_for_Sponsor_and_Spouse() {
		Remote.TobaccoforSpouse.click();
		act.pause(1000).perform();
		Remote.BASponsorCustomize50.click();
		Remote.BASpouseCustomize50.click();
		act.pause(1000).perform();
	}

	@Then("Waived Fed Term and Application Member Benefit Products")
	public void waived_Fed_Term_and_Application_Member_Benefit_Products() {
		Remote.FedTerm.click();
		Remote.WaiveFedTerm.click();
		act.pause(2000).perform();
		Remote.ApplicationMemberBenf.click();
		Remote.WaiveApplication.click();
		act.pause(2000).perform();
	}

	@Then("Senior Protect select Option One")
	public void senior_Protect_select_Option_One() {
		Remote.SeniorProtect.click();
		Remote.SeniorProtectOption1.click();
		act.pause(2000).perform();
	}

	@Then("First Protect Customize one hundred K for sponsor and spouse")
	public void first_Protect_Customize_one_hundred_K_for_sponsor_and_spouse() {
		Remote.FirstProtect.click();
		Remote.FirstProtectSponsorCustomize100.click();
		Remote.FirstProtectSpouseCustomize100.click();
		act.pause(2000).perform();
		Remote.NextBtn2.click();
	}

	@Then("Next page for Qualification Answer all the questions")
	public void next_page_for_Qualification_Answer_all_the_questions() {
		EApp2.AnswerNOAll.click();
		act.pause(2000).perform();
//		Remote.OISponsor1.click();
//	    Remote.OISponsor2.click();
//	    Remote.BASponsor1.click();
//	    Remote.BASponsor2.click();
//	    Remote.BASponsor3.click();
//	    Remote.BASponsor4.click();
//	    Remote.BASponsor5.click();
//	    Remote.BASponsor6.click();
//	    Remote.BASponsor7.click();
//	    act.pause(1000).perform();
//	    Remote.SeniorProtectSponsor1.click();
//	    Remote.SeniorProtectSponsor2.click();
//	    Remote.SeniorProtectSponsor3.click();
//	    Remote.SeniorProtectSponsor4.click();
//	    Remote.SeniorProtectSponsor5.click();
//    //  Remote.SeniorProtectSponsor6.click();
//	    Remote.FirstProtectSponsor1.click();
//	    Remote.FirstProtectSponsor2.click();
//	    Remote.FirstProtectSponsor3.click();
//	    Remote.FirstProtectSponsor4.click();
//	    Remote.FirstProtectSponsor5.click();
//	    Remote.FirstProtectSponsor6.click();
//	    Remote.FirstProtectSponsor7.click();
//	    act.pause(1000).perform();
//	    Remote.OISpouse1.click();
//	    Remote.OISpouse2.click();
//	    Remote.BASpouse1.click();
//	    Remote.BASpouse2.click();
//	    Remote.BASpouse3.click();
//	    Remote.BASpouse4.click();
//	    Remote.BASpouse5.click();
//	    Remote.BASpouse6.click();
//	    Remote.BASpouse7.click();
//	    act.pause(1000).perform();
//	    Remote.SeniorProtectSpouse1.click();
//	    Remote.SeniorProtectSpouse2.click();
//	    Remote.SeniorProtectSpouse3.click();
//	    Remote.SeniorProtectSpouse4.click();
//	    Remote.SeniorProtectSpouse5.click();
////	    Remote.SeniorProtectSpouse6.click();
//	    act.pause(1000).perform();
//	    Remote.FirstProtectSpouse1.click();
//	    Remote.FirstProtectSpouse2.click();
//	    Remote.FirstProtectSpouse3.click();
//	    Remote.FirstProtectSpouse4.click();
//	    Remote.FirstProtectSpouse5.click();
//	    Remote.FirstProtectSpouse6.click();
//	    Remote.FirstProtectSpouse7.click();
	    act.pause(2000).perform();
	    Remote.NextBtn2.click();  
	}
	

	@Then("Enter Sponsor Information Height Feet, Inches and Weight")
	public void enter_Sponsor_Information_Height_Feet_Inches_and_Weight() {
		   Remote.Height5Feet.click();
		   Remote.Height4Inches.click();
		   Remote.Weight.sendKeys("136");
		   act.pause(2000).perform();
		   Remote.NextBtn2.click();
	}

	@Then("Enter Spouse Information SSN, Gender, Height feet inches and Weight")
	public void enter_Spouse_Information_SSN_Gender_Height_feet_inches_and_Weight() {
		  Remote.SpouseSSN.click();
		    Remote.SpouseSSN.sendKeys("414000023");
		    Remote.SpouseGenderFamale.click();
		    Remote.Spouse5Feet.click();
		    Remote.Spouse8Inches.click();
		    Remote.SpouseWeight.sendKeys("185");
		    act.pause(2000).perform();
		    Remote.NextBtn2.click(); 
	}
	
	@Then("Input Beneficiaries for Better Alternative Sponsor Primary Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_Better_Alternative_Sponsor_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		    Remote.BASponsorPrimarySomeOneElse.click();
			Remote.PrimaryBenficiaryFullName.sendKeys("Frank Tieri");
		    Remote.PrimaryRelationshipForUncle.click();
		    Remote.PrimaryBeneficiaryDOB.click();
		    Remote.PrimaryBeneficiaryDOB.sendKeys("12121846");
		    Remote.VarifyDOB.click();
		    act.pause(2000).perform();
		    Remote.PrimaryBeneficiaryDOB.clear();
		    Remote.PrimaryBeneficiaryDOB.click();
		    Remote.PrimaryBeneficiaryDOB.sendKeys("12121946");
		    act.pause(1000).perform();
	}

	@Then("Input Beneficiaries for Better Alternative Sponsor Contingent Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_Better_Alternative_Sponsor_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.SomeoneElsee.click();
		Remote.ContingentBeneficiaryFullName.sendKeys("Port City");
		Remote.ContingentBeneficiaryRelationshipOther.click();
		Remote.ContingentBeneficiaryDOB.click();
		Remote.ContingentBeneficiaryDOB.sendKeys("03171864");
		Remote.VarifyDOB.click();
		  act.pause(2000).perform();
		Remote.ContingentBeneficiaryDOB.clear();
		Remote.ContingentBeneficiaryDOB.click();
		Remote.ContingentBeneficiaryDOB.sendKeys("03171964");
		act.pause(1000).perform();
		
	}

	@Then("Input Beneficiaries for Better Alternative Spouse Primary Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_Better_Alternative_Spouse_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		   Remote.SomeoneElseForSpousePrimary.click();
		   Remote.SpousePrimarytFN.sendKeys("Axl Rose");
		   Remote.SpousePrimaryRelationshipGirlFriend.click();
		   Remote.SpousePrimaryDOB.click();
		   Remote.SpousePrimaryDOB.sendKeys("02061862");
		   Remote.VarifyDOB.click();
		   act.pause(2000).perform();
		   Remote.SpousePrimaryDOB.clear();
		   Remote.SpousePrimaryDOB.click();
		   Remote.SpousePrimaryDOB.sendKeys("02061962");
		   act.pause(1000).perform();
	}

	@Then("Input Beneficiaries for Better Alternative Spouse Contingent Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_Better_Alternative_Spouse_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		   Remote.BASpouseContingentSomeOneElse.click();
		   Remote.SpouseContingentFN.sendKeys("Chuck Berry");
		   Remote.SpouseContingentRelationshipBrother.click();
		   Remote.spouseContingentDOB.click();
		   Remote.spouseContingentDOB.sendKeys("10181826");
		   Remote.VarifyDOB.click();
		   act.pause(2000).perform();
		   Remote.spouseContingentDOB.clear();
		   Remote.spouseContingentDOB.click();
		   Remote.spouseContingentDOB.sendKeys("10181926");
		   act.pause(1000).perform();
	}

	@Then("Input Beneficiaries for Senior Protect Sponsor Primary Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_Senior_Protect_Sponsor_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		    Remote.SeniorProtectSponsorPrimaryBenifSomeoneElse.click();
		    Remote.SeniorProtectSponsorPrmaryBenFullName.sendKeys("Muddy Waters");
		    Remote.SeniorProtectSponsorPrimaryBenRelationshipFather.click();
		    Remote.SeniorProtectSponsorPrimaryBenfDOB.click();
		    Remote.SeniorProtectSponsorPrimaryBenfDOB.sendKeys("04051813");
		    Remote.VarifyDOB2.click();
		    act.pause(2000).perform();
		    Remote.SeniorProtectSponsorPrimaryBenfDOB.clear();
		    Remote.SeniorProtectSponsorPrimaryBenfDOB.click();
		    Remote.SeniorProtectSponsorPrimaryBenfDOB.sendKeys("04051913");
		    act.pause(1000).perform();
		    
	}

	@Then("Input Beneficiaries for Senior Protect Sponsor Contingent Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_Senior_Protect_Sponsor_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		    Remote.SeniorProtectSponsorContingentSomeoneElse.click();
		    Remote.SeniorProtrctSponsorContingentFullName.sendKeys("Willie Brown");
		    Remote.SeniorProtrctSponsorContingentRelationshipBoyFriend.click();
		    Remote.SeniorProtrctSponsorContingentDOB.click();
		    Remote.SeniorProtrctSponsorContingentDOB.sendKeys("08061800");
		    Remote.VarifyDOB2.click();
		    act.pause(2000).perform();
		    Remote.SeniorProtrctSponsorContingentDOB.clear();
		    Remote.SeniorProtrctSponsorContingentDOB.click();
		    Remote.SeniorProtrctSponsorContingentDOB.sendKeys("08061900");
		    act.pause(1000).perform();
	}

	@Then("Input Beneficiaries for Senior Protect Spouse Primary Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_Senior_Protect_Spouse_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		  Remote.SeniorProtectSpousePrimarySomeoneElse.click();
	      Remote.SeniorProtectSpousePrmaryBenFullName.sendKeys("Jessica Oakland");
	      Remote.SeniorProtectSpousePrimaryBenRelationshipAunt.click();
	      Remote.SeniorProtectSpousePrimaryBenfDOB.click();
	      Remote.SeniorProtectSpousePrimaryBenfDOB.sendKeys("12121848");
	      Remote.VarifyDOB2.click();
	      act.pause(2000).perform();
	      Remote.SeniorProtectSpousePrimaryBenfDOB.clear();
	      Remote.SeniorProtectSpousePrimaryBenfDOB.click();
	      Remote.SeniorProtectSpousePrimaryBenfDOB.sendKeys("12121948");
		  act.pause(1000).perform();
	}

	@Then("Input Beneficiaries for Senior Protect Spouse Contingent Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_Senior_Protect_Spouse_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.SeniorProtectSpouseContingentSomeoneElse.click();
	    Remote.SeniorProtectSpouseContingentFullName.sendKeys("Global Tasks");
	    Remote.SeniorProtectSpouseContingentRelationshipOther.click();
	    Remote.SeniorProtectSpouseContingentDOB.click();
	    Remote.SeniorProtectSpouseContingentDOB.sendKeys("10111849");
	    Remote.VarifyDOB2.click();
	    act.pause(2000).perform();
	    Remote.SeniorProtectSpouseContingentDOB.clear();
	    Remote.SeniorProtectSpouseContingentDOB.click();
	    Remote.SeniorProtectSpouseContingentDOB.sendKeys("10111949");
	    act.pause(1000).perform();
	    
	}

	@Then("Input Beneficiaries for First Protect Sponsor Primary Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_First_Protect_Sponsor_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		  Remote.FirstprotectSponsorPrimarySomeOneElse.click();
		  Remote.FirstProtectSponsorPrimaryFullName.sendKeys("Angus Young");
		  Remote.FirstProtectSponsorPrimaryRelationshipGirlFriend.click();
		  Remote.FirstProtectSponsorPrimaryDOB.click();
		  Remote.FirstProtectSponsorPrimaryDOB.sendKeys("03311855");
		  Remote.FirstProtectSponsorPrimaryDOBVarify.click();
		  act.pause(2000).perform();
		  Remote.FirstProtectSponsorPrimaryDOB.clear();
		  Remote.FirstProtectSponsorPrimaryDOB.click();
		  Remote.FirstProtectSponsorPrimaryDOB.sendKeys("03311955");
		  act.pause(1000).perform();
	}

	@Then("Input Beneficiaries for First Protect Sponsor Contingent Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_First_Protect_Sponsor_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		   Remote.FirstProtectSponsorContingentSomeoneElse.click();
		    Remote.FirstProtectSponsorContingentFullName.sendKeys("Chuck Berry");
		    Remote.FirstProtectSponsorContingentRelationshipBrother.click();
		    Remote.FirstProtectSponsorContingentDOB.click();
		    Remote.FirstProtectSponsorContingentDOB.sendKeys("10181826");
		    Remote.FirstProtectSponsorPrimaryDOBVarify.click();
		    act.pause(2000).perform();
		    Remote.FirstProtectSponsorContingentDOB.clear();
		    Remote.FirstProtectSponsorContingentDOB.click();
		    Remote.FirstProtectSponsorContingentDOB.sendKeys("10181926");
		    act.pause(1000).perform();
	}

	@Then("Input Beneficiaries for First Protect Spouse Primary Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_First_Protect_Spouse_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		   Remote.FirstprotectSpousePrimarySomeOneElse.click();
		   Remote.FirstProtectSpousePrimaryFullName.sendKeys("Muddy Waters");
		   Remote.FirstProtectSpousePrimaryRelationshipFatherInLaw.click();
		   Remote.FirstProtectSpousePrimaryDOB.click();
		   Remote.FirstProtectSpousePrimaryDOB.sendKeys("04051813");
		   Remote.FirstProtectSponsorPrimaryDOBVarify.click();
		   act.pause(2000).perform();
		   Remote.FirstProtectSpousePrimaryDOB.clear();
		   Remote.FirstProtectSpousePrimaryDOB.click();
		   Remote.FirstProtectSpousePrimaryDOB.sendKeys("04051913");
		   act.pause(2000).perform();
	}
	

	@Then("Input Beneficiaries for First Protect Spouse Contingent Beneficiary FullName, Relationship and DOB")
	public void input_Beneficiaries_for_First_Protect_Spouse_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
	    Remote.FirstProtectSpouseContingentSomeoneElse.click();
	    Remote.FirstProtectSpouseContingentFullName.sendKeys("Willie Brown");
	    Remote.FirstProtectSpouseContingentRelationshipFatherBrother.click();
	    Remote.FirstProtectSpouseContingentDOB.click();
	    Remote.FirstProtectSpouseContingentDOB.sendKeys("08061800");
	    Remote.FirstProtectSponsorPrimaryDOBVarify.click();
	    act.pause(2000).perform();
	    Remote.FirstProtectSpouseContingentDOB.clear();
	    Remote.FirstProtectSpouseContingentDOB.click();
	    Remote.FirstProtectSpouseContingentDOB.sendKeys("08061900");
	    act.pause(1000).perform();
	}
	
	@Then("Confirmation page select Email Summary enter Email address")
	public void confirmation_page_select_Email_Summary_enter_Email_address() {
		    Remote.NextBtn6.click();
		    act.pause(2000).perform();
			Remote.EmailSummary1.click();
			act.pause(1000).perform();
			Remote.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
			Remote.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
			act.pause(1000).perform();
	}

	@Then("Enter Credit Card Number and Expiration Date and CVV")
	public void enter_Credit_Card_Number_and_Expiration_Date_and_CVV() {
	    Remote.DayOfDeducation1forCreditCard.click();
	    Remote.CreditCardNumber.click();
	    Remote.CreditCardNumber.sendKeys("5800000000000001");
	    Remote.ExpirationDate.click();
	    Remote.ExpirationDate.sendKeys("0220");
	    Remote.CVV.sendKeys("316");
	    act.pause(2000).perform();
	}

	@Then("Select Singing Via Email and input Email address")
	public void select_Singing_Via_Email_and_input_Email_address() {
		  Remote.SiginingViaEmail.click();
		  act.pause(2000).perform();
		  Remote.EnterEmailOne.clear();
		  Remote.EnterEmailOne.sendKeys("qapeep512@gmail.com");
		  Remote.EnterEmailTwo.clear();
		  Remote.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
		  act.pause(1000).perform();
	}

	@Then("Click Submit and Send Email for Signature")
	public void click_Submit_and_Send_Email_for_Signature() {
		  Remote.SubmitEmailForsignatureBtn.click();
		  act.pause(7000).perform();  
	}

	@Then("Open Email account to Login Email Username and Password")
	public void open_Email_account_to_Login_Email_Username_and_Password() {
		driver.get("https://www.google.com");
		 Remote.SignIn.click();  
		 Remote.InputEmail.sendKeys("qapeep512@gmail.com");
			Remote.NextButton.click();	
			act.pause(2000).perform();
			Remote.InputPassword.sendKeys("Muna@5012");
			Remote.NextButton.click();
			act.pause(4000).perform();
	}

	@Then("Select Inbox and check Emails")
	public void select_Inbox_and_check_Emails() {
		Remote.ClickSelect.click();
		act.pause(1000).perform();
		Remote.ClickEmail.click();
		act.pause(2000).perform();
		//Remote.ClickInbox.click();
		Remote.SelectFirstEmail.click();
		act.pause(2000).perform();
	//	Remote.selectEmail.click();
	}

	@Then("Select Email and click Review Application on AFBA Enrollment")
	public void select_Email_and_click_Review_Application_on_AFBA_Enrollment() {
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

	@Then("Input sponsor Last Name and Last Four SSN")
	public void input_sponsor_Last_Name_and_Last_Four_SSN() {
		Remote.LastNameforSponsor.sendKeys("Gotti");
		Remote.LastSSNforSponsor.sendKeys("0022");
	}

	@Then("Click Review and Sign My Application")
	public void click_Review_and_Sign_My_Application() {
		Remote.ReviewAndSignMyApplication.click();
		act.pause(3000).perform();
	}

	@Then("Click Review Application Ducuments button to review application")
	public void click_Review_Application_Ducuments_button_to_review_application() {
		Remote.ReviewApplicationDocumentBtn.click();
		act.pause(10000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input Sponsor and spouse Last Name and last four SSN")
	public void input_Sponsor_and_spouse_Last_Name_and_last_four_SSN() {
		Remote.SponsorLastName.sendKeys("GoGto");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
	    Remote.SponsorLastName.clear();
		Remote.SponsorLastName.click();	
	    Remote.SponsorLastName.sendKeys("Gotti");
		Remote.SponsorLastSSN.sendKeys("0020");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
		Remote.SponsorLastSSN.clear();
		Remote.SponsorLastSSN.click();
		Remote.SponsorLastSSN.sendKeys("0022");
		act.pause(1000).perform();
		Remote.SpouseLastName.sendKeys("Agnello");
		Remote.SpouseLastSSN.click();
		Remote.SpouseLastSSN.sendKeys("0023");
	}

	@Then("Select Paper to receive the Document")
	public void select_Paper_to_receive_the_Document() {
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
