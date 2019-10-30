package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Remote;
import utilities.TestBase;

public class EAppRemote6 extends TestBase {

	
	@When("Click New Enrollment button input Sponsor SSN, Enrollment city, Enrollment State")
	public void click_New_Enrollment_button_input_Sponsor_SSN_Enrollment_city_Enrollment_State() {
		 Remote.SSN.click();
		  Remote.SSN.sendKeys("404000044");
		  Remote.EnrollmentCity.clear();
		  Remote.EnrollmentCity.sendKeys("Tamuning");
		  Remote.EnrollmentState.click();
		  Remote.GU.click();
		  act.pause(2000).perform();
	}

	@Then("Select Begin Enrollment button to create new case")
	public void select_Begin_Enrollment_button_to_create_new_case() {
	    	Remote.NextBtn.click();
		//   Remote.BeginEnrollment.click();
			Remote.ClickNewSponsor.click();
			act.pause(2000).perform();
	}

	@Then("Input Sponsor First Name, Last Name, Gender and Date of Birth")
	public void input_Sponsor_First_Name_Last_Name_Gender_and_Date_of_Birth() {
		Remote.FirstName.sendKeys("Eleanor");
	    Remote.LastName.sendKeys("Lawson");
	    Remote.DOB.click();
	    act.pause(1000).perform();
	    Remote.DOB.sendKeys("05211970");
	    Remote.Gender.click();   
	    act.pause(2000).perform();
	}

	@Then("Select Married button and enter spouse First Name, Last Name and DOB")
	public void select_Married_button_and_enter_spouse_First_Name_Last_Name_and_DOB() {
		Remote.MarriedBtn.click();
	    Remote.SpouseFN.sendKeys("Daniel");
	    Remote.SpouseLN.sendKeys("Lawson");
	    Remote.SpouseDOB.click();
	    act.pause(1000).perform();
	    Remote.SpouseDOB.sendKeys("09241963");
	    act.pause(2000).perform();
	}

	@Then("Select Include Children button to enter Adult Child one First Name, Last Name, DOB")
	public void select_Include_Children_button_to_enter_Adult_Child_one_First_Name_Last_Name_DOB() {
		 Remote.ChildrenBtn.click();
		   Remote.ChildOneFN.sendKeys("Falco");
		   Remote.ChildOneLN.sendKeys("Lawson");
		   Remote.ChildOneDOB.click();
		   Remote.ChildOneDOB.sendKeys("09251994");
		  act.pause(1000).perform();
	}

	@Then("Click Add Child button to enter Adult Child two First Name, Last Name, DOB")
	public void click_Add_Child_button_to_enter_Adult_Child_two_First_Name_Last_Name_DOB() {
		  Remote.AddChildBtn.click();
		   Remote.ChildTwoFN.sendKeys("Gavin");
		   Remote.ChildTwoDOB.click();
		   Remote.ChildTwoDOB.sendKeys("09261994");
		   act.pause(1000).perform();
	}

	@Then("Click Add Child button to enter Adult Child three First Name, Last Name, DOB")
	public void click_Add_Child_button_to_enter_Adult_Child_three_First_Name_Last_Name_DOB() {
		   Remote.AddChildBtn.click();
		   Remote.ChildThreeFN.sendKeys("Hector");
		   Remote.ChildThreeDOB.click();
		   Remote.ChildThreeDOB.sendKeys("09271994");
		   act.pause(1000).perform();
	}

	@Then("Click Add Child button to enter Minor child one First Name, Last Name, DOB")
	public void click_Add_Child_button_to_enter_Minor_child_one_First_Name_Last_Name_DOB() {
		Remote.AddChildBtn.click();
		Remote.ChildFourFN.sendKeys("Ibis");
		Remote.ChildFourDOB.click();
		Remote.ChildFourDOB.sendKeys("11042001");
		act.pause(1000).perform();
	}

	@Then("Click Add Child button to enter Minor Child two First Name, Last Name, DOB")
	public void click_Add_Child_button_to_enter_Minor_Child_two_First_Name_Last_Name_DOB() {
		Remote.AddChildBtn.click();
	    Remote.ChildFifthFN.sendKeys("Jayda");
	    Remote.ChildFifthDOB.click();
	    Remote.ChildFifthDOB.sendKeys("11052001");
	    act.pause(1000).perform();
	}

	@Then("Click Add Child button to enter Minor Child three First Name, Last Name, DOB")
	public void click_Add_Child_button_to_enter_Minor_Child_three_First_Name_Last_Name_DOB() {
		Remote.AddChildBtn.click();
		Remote.ChildSixFN.sendKeys("Kyra");
		Remote.ChildSixDOB.click();
		Remote.ChildSixDOB.sendKeys("11062001");
		act.pause(2000).perform();
	}
	
	@Then("Select Fire Department on Eligibility option")
	public void select_Fire_Department_on_Eligibility_option() {
		   Remote.FireDepartment.click();
		   act.pause(1000).perform();
	}

	@Then("Select Checkmatic on Contribution Mode")
	public void select_Checkmatic_on_Contribution_Mode() {
		   Remote.Checkmatic.click();
		   act.pause(1000).perform();
	}

	@Then("Enter Street Address, City, State, ZipCode and Daytime phone numbers")
	public void enter_Street_Address_City_State_ZipCode_and_Daytime_phone_numbers() {
		Remote.Street.sendKeys("Bayview Shores");
	    Remote.Street2.sendKeys("Apt 6");
	    Remote.City.sendKeys("Cape Charles");
	    Remote.State.sendKeys("Virginia");
	    Remote.State.sendKeys(Keys.ENTER);
	    Remote.ZipCode.click();
	    Remote.ZipCode.sendKeys("23310");
	    Remote.Phone.click();
	    Remote.Phone.sendKeys("7037065961");
	    act.pause(3000).perform();
	    Remote.ShowCoverageOptions.click();
	}
	
	@Then("Coverage Options Waive enrollment in Better Alternative, Fed Term and Application Member Benefit")
	public void coverage_Options_Waive_enrollment_in_Better_Alternative_Fed_Term_and_Application_Member_Benefit() {
		  Remote.WaiveBA.click();
		   act.pause(1000).perform();
	     	Remote.FedTerm.click();
	     	act.pause(1000).perform();
		   Remote.WaiveFedTerm.click();
		   act.pause(2000).perform();
	}

	@Then("Select Senior Protect Customize spouse")
	public void select_Senior_Protect_Customize_spouse() {
		Remote.SeniorProtect.click();
		   act.pause(1000).perform();
		   Remote.SeniorProtectoNLYSpouseCustomize25.click();
		   act.pause(2000).perform();
			  Remote.ApplicationMemberBenf.click();
			   Remote.WaiveApplication.click();
			   act.pause(2000).perform();
	}

	@Then("First Protect No benefit for Sponsor and spouse Customize three adult children fifty thousand K")
	public void first_Protect_No_benefit_for_Sponsor_and_spouse_Customize_three_adult_children_fifty_thousand_K() {
		 Remote.FirstProtect.click();
		  act.pause(1000).perform();
		  Remote.AC1Tobacco.click();
		  Remote.AC2Tobacco.click();
		  Remote.AC3Tobacco.click();
		  act.pause(2000).perform();
		  Remote.FirstProtectNoBenefitforSponsor.click();
		  Remote.FirstProtectNoBenefitForSpouse.click();
		  act.pause(1000).perform();
		  Remote.FirstProtectAC1Customize50.click();
		  Remote.FirstProtectAC2Customize50.click();
		  Remote.FirstProtectAC3Customize50.click();
		  act.pause(2000).perform();
	}

	@Then("Children Protect Covered three Minor children")
	public void children_Protect_Covered_three_Minor_children() {
		 Remote.ChildrenProtectClick.click();
		  Remote.CoveredForFirstKid.click();
		  Remote.CoveredforSecondKid.click();
		  Remote.CoveredForThrid.click();
		  act.pause(2000).perform();
		  act.pause(2000).perform();
		  Remote.NextBtn2.click();
	}
	
	@Then("Answer all the questions Yes or NO for Qualification")
	public void answer_all_the_questions_Yes_or_NO_for_Qualification() {
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
	
	@Then("Input Sponsor Information which include Height and Weight")
	public void input_Sponsor_Information_which_include_Height_and_Weight() {
		 Remote.Height6Feet.click();
		   Remote.Height6Inches.click();
		   Remote.Weight.sendKeys("230");
		   act.pause(2000).perform();
		   Remote.NextBtn2.click();
	}

	@Then("Input Spouse Information which include SSN, Gender, Height and Weight")
	public void input_Spouse_Information_which_include_SSN_Gender_Height_and_Weight() {
		Remote.SpouseSSN.click();
	    Remote.SpouseSSN.sendKeys("404000045");
	    Remote.SpouseGenderMale.click();
	    Remote.Spouse6Feet.click();
	    Remote.Spouse5Inches.click();
	    Remote.SpouseWeight.sendKeys("201");
	    act.pause(2000).perform();
	}

	@Then("Input Children Information which include SSN, Gender, Height, Weight, Status, Relationship")
	public void input_Children_Information_which_include_SSN_Gender_Height_Weight_Status_Relationship() {
		  Remote.ChildOneSSN.click();
		    Remote.ChildOneSSN.sendKeys("404000046");
		    Remote.ChildOneGenderMale.click();
		    Remote.ChildOnet5Feet.click();
		    Remote.ChildOne11Inches.click();
		    Remote.ChildOneWeight.sendKeys("155");
		    Remote.ChildUSCitizen.click();
		    Remote.ChildOneRelationshipParent.click();
		    act.pause(1000).perform();
		    Remote.ChildTwoSSN.click();
		    Remote.ChildTwoSSN.sendKeys("404000047");
		    Remote.ChildTwoGenderMale.click();
		    Remote.ChildTwo6Feet.click();
		    Remote.ChildTwo0Inches.click();
		    Remote.ChildTwoWeight.sendKeys("165");
		    Remote.ChildTwoRelationshipParent.click();
		    Remote.ChildTwoUSCitizenm.click();
		    act.pause(1000).perform();
		    Remote.ChildThreeSSN.click();
		    Remote.ChildThreeSSN.sendKeys("404000048");
		    Remote.ChildThreeGenderMale.click();
		    Remote.ChildThree6Feet.click();
		    Remote.ChildThree1Inches.click();
		    Remote.ChildThreeWeight.sendKeys("175");
		    Remote.ChildThreeUSCitizen.click();
		    Remote.ChildThreeRelationshipG.click();
		    act.pause(1000).perform();
		    
		    Remote.Child4SSN.click();
		    Remote.Child4SSN.sendKeys("404000049");
		    Remote.Child4Famale.click();
		    Remote.Child4Feet5.click();
		    Remote.Child4Inches6.click();
		    Remote.Child4Weight.sendKeys("113");
		    Remote.Child4USCitizenYes.click();
		    Remote.Child4RelationshipGrandParent.click();
		    act.pause(1000).perform();
		    
		    Remote.Child5SSN.click();
		    Remote.Child5SSN.sendKeys("404000050");
		    Remote.Child5Famale.click();
		    Remote.Child5Feet5.click();
		    Remote.Child5Inches7.click();
		    Remote.Child5Weight.sendKeys("115");
		    Remote.Child5USCitizen.click();
		    Remote.Child5RelationshipStepParent.click();
		    act.pause(1000).perform();
		    
		    Remote.Child6SSN.click();
		    Remote.Child6SSN.sendKeys("404000051");
		    Remote.Child6Famale.click();
		    Remote.Chil65Feet5.click();
		    Remote.Child6Inches7.click();
		    Remote.Child6Weight.sendKeys("117");
		    Remote.Child6USCitizen.click();
		    Remote.Child6RelationshipStepParent.click();
		    act.pause(2000).perform();
		    Remote.Next.click();
	}
	
	@Then("Senior Protect Spouse Primary Beneficiary Full Name, Relationship, SSN")
	public void senior_Protect_Spouse_Primary_Beneficiary_Full_Name_Relationship_SSN() {
		 Remote.SomeoneElseForSpousePrimary.click();
		 Remote.SpousePrimarytFN.sendKeys("Tony Hawk");
		 Remote.SpousePrimarytSSN.click();
		 Remote.SpousePrimarytSSN.sendKeys("404000052");
		 Remote.SpousePrimaryRelationshipGirlFriend.click();
		 act.pause(1000).perform();
	}

	@Then("Senior Protect Spouse Contingent Beneficiary Full Name, Relationship, SSN")
	public void senior_Protect_Spouse_Contingent_Beneficiary_Full_Name_Relationship_SSN() {
	   Remote.BASpouseContingentSomeOneElse.click();
	   Remote.SpouseContingentFN.sendKeys("NIcki Minaj");
	   Remote.SpouseContingentSSN.click();
	   Remote.SpouseContingentSSN.sendKeys("404000053");
	   Remote.SpouseContingentRelationshipBrother.click();
	   act.pause(1000).perform();
	}

	@Then("First Protect Adult Child Falco Primary Beneficiary FullName, SSN, Relationship")
	public void first_Protect_Adult_Child_Falco_Primary_Beneficiary_FullName_SSN_Relationship() {
		  Remote.AC1FirstProtectPrimarySomeOneElse.click();
		  Remote.AC1FirstProtectPrimaryFN.sendKeys("Gal Gadot");
		  Remote.AC1FirstProtectPrimarySSN.click();
		  Remote.AC1FirstProtectPrimarySSN.sendKeys("404000054");
		  Remote.AC1FirstProtectPrimaryRelationshipOther.click();
		  act.pause(1000).perform();
	}

	@Then("First Protect Adult Child Falco Contingent Beneficiary FullName, SSN, Relationship")
	public void first_Protect_Adult_Child_Falco_Contingent_Beneficiary_FullName_SSN_Relationship() {
		  Remote.AC1FirstProtectContingentSomeOneElse.click();
		   Remote.AC1FirstProtectContingentFN.sendKeys("Mae West");
		   Remote.AC1FirstProtectContingentSSN.click();
		   Remote.AC1FirstProtectContingentSSN.sendKeys("404000055");
		   Remote.AC1FirstProtectContingentRelationshipMotherInLaw.click();
		   act.pause(1000).perform();
	}

	@Then("First Protect Adult Child Gavin Primary Beneficiary FullName, SSN, Relationship")
	public void first_Protect_Adult_Child_Gavin_Primary_Beneficiary_FullName_SSN_Relationship() {
		 Remote.AC2FirstProtectPrimarySomeOneElse.click();
		   Remote.AC2FirstProtectPrimaryFN.sendKeys("Emma Watson");
		   Remote.AC2FirstProtectPrimarySSN.click();
		   Remote.AC2FirstProtectPrimarySSN.sendKeys("404000056");
		   Remote.AC2FirstProtectPrimaryRelationshipGirlFriend.click();
		   act.pause(1000).perform();
	}

	@Then("First Protect Dult Child Gavin Contingent Beneficiary FullName, SSN, Relationship")
	public void first_Protect_Dult_Child_Gavin_Contingent_Beneficiary_FullName_SSN_Relationship() {
		  Remote.AC2FirstProtectContingentSomeOneElse.click();
		    Remote.AC2FirstProtectContingentFN.sendKeys("Roy Rogers");
		    Remote.AC2FirstProtectContingentSSN.click();
		    Remote.AC2FirstProtectContingentSSN.sendKeys("404000057");
		    Remote.AC2FirstProtectContingentRelationshipFatherInLaw.click();
		    act.pause(1000).perform();
	}

	@Then("First Protect Adult Child Hector Primary Beneficiary FullName, SSN, Relationship")
	public void first_Protect_Adult_Child_Hector_Primary_Beneficiary_FullName_SSN_Relationship() {
		Remote.AC3FirstProtectPrimarySomeOneElse.click();
		Remote.AC3FirstProtectPrimaryFN.sendKeys("Blake Lively");
		Remote.AC3FirstProtectPrimarySSN.click();
		Remote.AC3FirstProtectPrimarySSN.sendKeys("404000058");
		Remote.AC3FirstProtectPrimaryRelationshipAunt.click();
		act.pause(1000).perform();
	}

	@Then("First Protect Adult Child Hector Contingent Beneficiary FullName, SSN, Relationship")
	public void first_Protect_Adult_Child_Hector_Contingent_Beneficiary_FullName_SSN_Relationship() {
		 Remote.AC3FirstProtectContingentSomeOneElse.click();
		 Remote.AC3FirstProtectContingentFN.sendKeys("Heath Leger");
		 Remote.AC3FirstProtectContingentSSN.click();
		 Remote.AC3FirstProtectContingentSSN.sendKeys("404000059");
		 Remote.AC3FirstProtectContingentRelationshipBrother.click();
		 act.pause(1000).perform();
	}

	@Then("Child Protect Minor Child Ibis Primary Beneficiary FullName, SSN, Relationship")
	public void child_Protect_Minor_Child_Ibis_Primary_Beneficiary_FullName_SSN_Relationship() {
		Remote.MC1ChildProtectPrimarySomeoneElse.click();
		   Remote.MC1ChildProtectPrimaryFN.sendKeys("Ton Ford");
		   Remote.MC1ChildProtectPrimarySSN.click();
		   Remote.MC1ChildProtectPrimarySSN.sendKeys("404000060");
		   Remote.MC1ChildProtectPrimaryRelationshipExSpouse.click();
		   act.pause(1000).perform();
	}

	@Then("Child Protect Minor Child Ibis Contingent Beneficiary FullName, SSN, Relationship")
	public void child_Protect_Minor_Child_Ibis_Contingent_Beneficiary_FullName_SSN_Relationship() {
	   Remote.MC1ChildProtectContingentSomeoneElse.click();
	   Remote.MC1ChildProtectContingentFN.sendKeys("My Estate");
	   Remote.MC1ChildProtectContingentSSN.click();
	   Remote.MC1ChildProtectContingentSSN.sendKeys("404000061");
	   Remote.MC1ChildProtectContingentRelationshipEstate.click();
	   act.pause(1000).perform();
	}

	@Then("Child Protect Minor Child Jayda Primary Beneficiary FullName, SSN, Relationship")
	public void child_Protect_Minor_Child_Jayda_Primary_Beneficiary_FullName_SSN_Relationship() {
		   Remote.MC2ChildProtectPrimarySomeoneElse.click();
		   Remote.MC2ChildProtectPrimaryFN.sendKeys("Donna Ford");
		   Remote.MC2ChildProtectPrimarySSN.click();
		   Remote.MC2ChildProtectPrimarySSN.sendKeys("404000062");
		   Remote.MC2ChildProtectPrimaryRelationshipAUnt.click();
		   act.pause(1000).perform();
	}

	@Then("Child Protect Minor Child Jayda Contingent Beneficiary FullName, SSN, Relationship")
	public void child_Protect_Minor_Child_Jayda_Contingent_Beneficiary_FullName_SSN_Relationship() {
	    Remote.MC2ChildProtectContingentSomeoneElse.click();
	    Remote.MC2ChildProtectContingentFN.sendKeys("My Trust");
	    Remote.MC2ChildProtectContingentSSN.click();
	    Remote.MC2ChildProtectContingentSSN.sendKeys("404000063");
	    Remote.MC2ChildProtectContingentRelationshipTrust.click();
	    act.pause(1000).perform();
	}

	@Then("Child Protect Minor Child Kyra Primary Beneficiary FullName, SSN, Relationship")
	public void child_Protect_Minor_Child_Kyra_Primary_Beneficiary_FullName_SSN_Relationship() {
		  Remote.MC3ChildProtectPrimarySomeoneElse.click();
		   Remote.MC3ChildProtectPrimaryFN.sendKeys("Xavier Ford");
		   Remote.MC3ChildProtectPrimarySSN.click();
		   Remote.MC3ChildProtectPrimarySSN.sendKeys("404000064");
		   Remote.MC3ChildProtectPrimaryRelationshipBrother.click();
		   act.pause(1000).perform();
	}

	@Then("Child Protect Minor Child Kyra Contingent Beneficiary FullName, SSN, Relationship")
	public void child_Protect_Minor_Child_Kyra_Contingent_Beneficiary_FullName_SSN_Relationship() {
	        Remote.MC3ChildProtectContingentSomeoneElse.click();
	        Remote.MC3ChildProtectContingentFN.sendKeys("Rough Riders");
	        Remote.MC3ChildProtectContingentSSN.click();
	        Remote.MC3ChildProtectContingentSSN.sendKeys("404000065");
	        Remote.MC3ChildProtectContingentRelationshipOther.click();
	        act.pause(2000).perform();
	        Remote.NextBtn6.click();
	        act.pause(2000).perform();
	}

@Then("Select Email Summary and enter Email Address for Confirmation")
public void select_Email_Summary_and_enter_Email_Address_for_Confirmation() {
	Remote.EmailSummary1.click();
	act.pause(1000).perform();
	Remote.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
	Remote.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
	act.pause(1000).perform();
}

@Then("Select Day of Deducation one And Account Type for checking Bank Information")
public void select_Day_of_Deducation_one_And_Account_Type_for_checking_Bank_Information() {
	Remote.DayOfDeduction1.click();
    act.pause(1000).perform();
    Remote.CheckingAccountType.click();
    act.pause(1000).perform();
}

@Then("Input Routing Number, Account Number, Bank Name, City State ZipCode")
public void input_Routing_Number_Account_Number_Bank_Name_City_State_ZipCode() {
	 Remote.RoutingNumber.click();
	    Remote.RoutingNumber.sendKeys("011103093");
	    Remote.AccountNumber.click();
	    Remote.AccountNumber.sendKeys("123423532");
	    Remote.BankName.sendKeys("TD Bank");
	    Remote.CityStateZip.sendKeys("Arlington, VA, 22205");
	    act.pause(2000).perform();
}

@Then("Select Signing Via Email button and enter Email Address for routing application")
public void select_Signing_Via_Email_button_and_enter_Email_Address_for_routing_application() {
	 Remote.SiginingViaEmail.click();
	  act.pause(2000).perform();
	  Remote.EnterEmailOne.clear();
	  Remote.EnterEmailOne.sendKeys("qapeep512@gmail.com");
	  Remote.EnterEmailTwo.clear();
	  Remote.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
	  act.pause(1000).perform();
}

@Then("Click Sumbit and send email for Signature")
public void click_Sumbit_and_send_email_for_Signature() {
	 Remote.SubmitEmailForsignatureBtn.click();
	  act.pause(9000).perform();  
}

@Then("Login Email User ID and Password")
public void login_Email_User_ID_and_Password() {
	 driver.get("https://www.google.com");
	 Remote.SignIn.click();  
	 Remote.InputEmail.sendKeys("qapeep512@gmail.com");
		Remote.NextButton.click();	
		act.pause(2000).perform();
		Remote.InputPassword.sendKeys("Muna@5012");
		Remote.NextButton.click();
		act.pause(4000).perform();
}

@Then("Select Inbox and check the Email from AFBA Enrollement")
public void select_Inbox_and_check_the_Email_from_AFBA_Enrollement() {
	Remote.ClickSelect.click();
	act.pause(1000).perform();
	Remote.ClickEmail.click();
	act.pause(2000).perform();
	//Remote.ClickInbox.click();
	Remote.SelectFirstEmail.click();
	act.pause(2000).perform();
}

@Then("Click Review Application on AFBA Enrollement")
public void click_Review_Application_on_AFBA_Enrollement() {
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

@Then("Enter sponsor LastName and Last four SSN numbers")
public void enter_sponsor_LastName_and_Last_four_SSN_numbers() {
	Remote.LastNameforSponsor.sendKeys("Lawson");
	Remote.LastSSNforSponsor.sendKeys("0044");
}

@Then("Click Review and Sign My Application button to sigin")
public void click_Review_and_Sign_My_Application_button_to_sigin() {
	Remote.ReviewAndSignMyApplication.click();
	act.pause(3000).perform();
}

@Then("Click Review Application Ducuments button to review all application information")
public void click_Review_Application_Ducuments_button_to_review_all_application_information() {
	Remote.ReviewApplicationDocumentBtn.click();
	act.pause(11000).perform();
	Remote.CloseBtn.click();
	act.pause(2000).perform();
}

@Then("Input sponsor and spouse LastName and Last four SSN number")
public void input_sponsor_and_spouse_LastName_and_Last_four_SSN_number() {
	Remote.SponsorLastName.sendKeys("Lwason");
	Remote.verifySSN.click();
    act.pause(2000).perform();
    Remote.SponsorLastName.clear();
	Remote.SponsorLastName.click();	
    Remote.SponsorLastName.sendKeys("Lawson");
	Remote.SponsorLastSSN.sendKeys("0004");
	Remote.verifySSN.click();
    act.pause(2000).perform();
	Remote.SponsorLastSSN.clear();
	Remote.SponsorLastSSN.click();
	Remote.SponsorLastSSN.sendKeys("0044");
	act.pause(1000).perform();
	Remote.SpouseLastName.sendKeys("Lawson");
	Remote.SpouseLastSSN.click();
	Remote.SpouseLastSSN.sendKeys("0045");
	act.pause(1000).perform();
}

@Then("Select Paper receive the document")
public void select_Paper_receive_the_document() {
	Remote.PaperBtn.click();
	act.pause(2000).perform();
	Remote.SignBtn.click();
	act.pause(3000).perform();
}

@Then("Navigate back to login AFBA Enrollment login page")
public void navigate_back_to_login_AFBA_Enrollment_login_page() {
	driver.get("https://enroll-sandbox.afba.com/login");
	Remote.email.sendKeys("qapeep512@gmail.com");
	Remote.password.sendKeys("Muna@512");
	Remote.loginBtn.click();
	act.pause(3000).perform();
}

@Then("Select Access agent signing inbox button")
public void select_Access_agent_signing_inbox_button() {
	Remote.AccessAgentSigningInbox.click();
	act.pause(2000).perform();
}

@Then("Sign the Application on Agent Inbox and eSigning")
public void sign_the_Application_on_Agent_Inbox_and_eSigning() {
	Remote.SignButton.click();
	act.pause(2000).perform();
	Remote.ReviewApplicationDocumentBtn.click();
	act.pause(12000).perform();
	Remote.CloseBtn.click();
	act.pause(2000).perform();
	Remote.Sign.click();
	act.pause(3000).perform();
}
	 
	




}
