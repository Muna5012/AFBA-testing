package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import pages.Remote;
import utilities.TestBase;

public class EAppRemote5 extends TestBase {


@When("Click New Enrollment button input Sponsor SSN, Enrollment city and Enrollment state")
public void click_New_Enrollment_button_input_Sponsor_SSN_Enrollment_city_and_Enrollment_state() {
	  Remote.SSN.click();
	  Remote.SSN.sendKeys("404000026");
	  Remote.EnrollmentCity.clear();
	  Remote.EnrollmentCity.sendKeys("Greenville");
	  Remote.EnrollmentState.click();
	  Remote.SC.click();
	  act.pause(2000).perform();
}

@Then("Select Begin Enrollment button to create case")
public void select_Begin_Enrollment_button_to_create_case() {
	Remote.NextBtn.click();
	act.pause(1000).perform();
  //  Remote.BeginEnrollment.click();
	Remote.ClickNewSponsor.click();
	act.pause(2000).perform();
}

@Then("Input Sponsor firstName, lastName, gender and DOB")
public void input_Sponsor_firstName_lastName_gender_and_DOB() {
	Remote.FirstName.sendKeys("Carl");
    Remote.LastName.sendKeys("Jackson");
    Remote.DOB.click();
    act.pause(1000).perform();
    Remote.DOB.sendKeys("03171964");
    Remote.GenderMale.click();   
    act.pause(2000).perform();
}

@Then("Select Married button and input spouse firstName, lastName and DOB")
public void select_Married_button_and_input_spouse_firstName_lastName_and_DOB() {
	Remote.MarriedBtn.click();
    Remote.SpouseFN.sendKeys("Melody");
    Remote.SpouseLN.sendKeys("Jackson");
    act.pause(1000).perform();
    Remote.SpouseDOB.click();
    act.pause(1000).perform();
    Remote.SpouseDOB.sendKeys("06171969");
    act.pause(2000).perform();
}

@Then("Select Include Children button to input Adult Child one firstName, lastName, DOB")
public void select_Include_Children_button_to_input_Adult_Child_one_firstName_lastName_DOB() {
   Remote.ChildrenBtn.click();
   Remote.ChildOneFN.sendKeys("Nancy");
   Remote.ChildOneLN.sendKeys("Jackson");
   Remote.ChildOneDOB.click();
   Remote.ChildOneDOB.sendKeys("03181995");
  act.pause(1000).perform();
}

@Then("Click Add Child button to input Adult Child two firstName, lastName, DOB")
public void click_Add_Child_button_to_input_Adult_Child_two_firstName_lastName_DOB() {
   Remote.AddChildBtn.click();
   Remote.ChildTwoFN.sendKeys("Olivia");
   Remote.ChildTwoDOB.click();
   Remote.ChildTwoDOB.sendKeys("03191995");
   act.pause(1000).perform();
}

@Then("Click Add Child button to input Adult Child three firstName, lastName, DOB")
public void click_Add_Child_button_to_input_Adult_Child_three_firstName_lastName_DOB() {
	Remote.AddChildBtn.click();
   Remote.ChildThreeFN.sendKeys("Pia");
   Remote.ChildThreeDOB.click();
   Remote.ChildThreeDOB.sendKeys("03201995");
   act.pause(1000).perform();
}

@Then("Click Add Child button to input Minor child one firstName, lastName, DOB")
public void click_Add_Child_button_to_input_Minor_child_one_firstName_lastName_DOB() {
	Remote.AddChildBtn.click();
	Remote.ChildFourFN.sendKeys("Roman");
	Remote.ChildFourDOB.click();
	Remote.ChildFourDOB.sendKeys("03212003");
	act.pause(1000).perform();
}

@Then("Click Add Child button to input Minor Child two firstName, lastName, DOB")
public void click_Add_Child_button_to_input_Minor_Child_two_firstName_lastName_DOB() {
    Remote.AddChildBtn.click();
    Remote.ChildFifthFN.sendKeys("Steve");
    Remote.ChildFifthDOB.click();
    Remote.ChildFifthDOB.sendKeys("03222003");
    act.pause(1000).perform();
}

@Then("Click Add Child button to input Minor Child three firstName, lastName, DOB")
public void click_Add_Child_button_to_input_Minor_Child_three_firstName_lastName_DOB() {
	Remote.AddChildBtn.click();
	Remote.ChildSixFN.sendKeys("Travis");
	Remote.ChildSixDOB.click();
	Remote.ChildSixDOB.sendKeys("03232003");
	act.pause(2000).perform();
}

@Then("Select Millitary on Eligibility, Coast Guard on Banch of service, Ready Reserve on Duty Status, O four on Rank, Military Allotment on Contribution Mode")
public void select_Millitary_on_Eligibility_Coast_Guard_on_Banch_of_service_Ready_Reserve_on_Duty_Status_O_four_on_Rank_Military_Allotment_on_Contribution_Mode() {
	   Remote.Military.click();
	   Remote.CoastGuard.click();
	   Remote.ReadyReserve.click();
	   Remote.O4.click();
	   Remote.MilitaryAllotment.click();
	   act.pause(2000).perform(); 
}

@Then("Enter Street Address, City, State and Zip code numbers")
public void enter_Street_Address_City_State_and_Zip_code_numbers() {
	  Remote.DepartmentCode.sendKeys("AutoTest");
	  Remote.SourceCode.sendKeys("IT2");
	  Remote.Street.sendKeys("Bayview Shores");
	    Remote.Street2.sendKeys("Apt 5");
	    Remote.City.sendKeys("Nashville");
	    Remote.State.sendKeys("Tennessee");
	    Remote.State.sendKeys(Keys.ENTER);
	    Remote.ZipCode.click();
	    Remote.ZipCode.sendKeys("37201");
	    act.pause(1000).perform();
}

@Then("Enter Daytime phone numbers")
public void enter_Daytime_phone_numbers() {
	Remote.Phone.click();
    Remote.Phone.sendKeys("7037065961");
    act.pause(3000).perform();
}

@Then("Click Show Coverage Option to select Sponsor, Spouse, AC and MC Beneficiary Plans")
public void click_Show_Coverage_Option_to_select_Sponsor_Spouse_AC_and_MC_Beneficiary_Plans() {
	  Remote.ShowCoverageOptions.click();
}

@Then("BA, FedTerm and Application Member Benefit Products")
public void BA_FedTerm_and_Application_Member_Benefit_Products() {
	  act.pause(2000).perform();
	 EApp2.ChildCoverageClick.click();
	   EApp2.ChildrenCoverageOption5.click();
	   act.pause(2000).perform();
	   Remote.SelectOption2.click(); 
     	Remote.FedTerm.click();
       EApp2.CustomizeOption5.click();
   	   act.pause(2000).perform();
   	   EApp2.CustomizeOptionSe1.click();
   	   act.pause(2000).perform();
   	   EApp2.SelectFirstChildCustomize50.click();
   	   act.pause(2000).perform();
   	   EApp2.SelectSecondChildCustomize50.click();
   	   act.pause(2000).perform();
   	   EApp2.SelectThridChildCustomize50.click();
   	   act.pause(2000).perform();
   	   
}

@Then("Senior Protect spouse Customize twenty five thousand K")
public void senior_Protect_spouse_Customize_twenty_five_thousand_K() {
	Remote.SeniorProtect.click();
	   act.pause(1000).perform();
//	Remote.SeniorProtectNoBenefitForSponsor.click();
//	Remote.SeniorProtectCustomizeClick.click();
//	act.pause(1000).perform();
//	Remote.SeniorProtectSpouseCustomize25.click();
//	act.pause(2000).perform();
	   Remote.WaivedSeniorProtect.click();
	   act.pause(2000).perform();
	  Remote.ApplicationMemberBenf.click();
	   Remote.WaiveApplication.click();
	   act.pause(2000).perform();
}

@Then("First Protect No Benefit for Sponsor and Spouse Customize fifty thousand K for three AC")
public void first_Protect_No_Benefit_for_Sponsor_and_Spouse_Customize_fifty_thousand_K_for_three_AC() {
  Remote.FirstProtect.click();
  act.pause(1000).perform();
  Remote.FirstProtectNoBenefitforSponsor.click();
  Remote.FirstProtectNoBenefitForSpouse.click();
  act.pause(1000).perform();
  Remote.FirstProtectAC1Customize50.click();
  Remote.FirstProtectAC2Customize50.click();
  Remote.FirstProtectAC3Customize50.click();
  act.pause(3000).perform();
}

@Then("Childrens Protect Covered for three MC")
public void childrens_Protect_Covered_for_three_MC() {
  Remote.ChildrenProtectClick.click();
  Remote.CoveredForFirstKid.click();
  Remote.CoveredforSecondKid.click();
  Remote.CoveredForThrid.click();
  act.pause(3000).perform();
  Remote.NextBtn2.click();
}

@Then("Next page Answer All the questions")
public void next_page_Answer_All_the_questions() {
	EApp2.AnswerNOAll.click();
	act.pause(2000).perform();
//		Remote.OtherInsuranceSponsor1.click();
//		Remote.OtherInsuranceSponsor2.click();
//		Remote.OtherInsuranceSponsor3.click();
//		Remote.OtherInsuranceSponsor4.click();
//		act.pause(1000).perform();
//		Remote.OtherInsuranceSpouse1.click();
//		Remote.OtherInsuranceSpouse2.click();
//		Remote.OtherInsuranceSpouse3.click();
//		Remote.OtherInsuranceSpouse4.click();
//		act.pause(1000).perform();
//		Remote.OtherInsuranAC1.click();
//		Remote.OtherInsuranAC2.click();
//		Remote.OtherInsuranAC3.click();
//		Remote.OtherInsuranAC4.click();
//		act.pause(1000).perform();
//		Remote.OtherInsuranSecondAC1.click();
//		Remote.OtherInsuranSecondAC2.click();
//	    act.pause(1000).perform();
//	    Remote.SeniorProtecforSpouse1.click();
//	    Remote.SeniorProtecforSpouse2.click();
//	    Remote.SeniorProtecforSpouse3.click();
//	    Remote.SeniorProtecforSpouse4.click();
//	    Remote.SeniorProtecforSpouse5.click();
//	    act.pause(1000).perform();
//	    Remote.SeniorProtectSponsor1.click();
//	    Remote.SeniorProtectSponsor2.click();
//	    Remote.SeniorProtectSponsor3.click();
//	    Remote.SeniorProtectSponsor4.click();
//	    Remote.SeniorProtectSponsor5.click();
//	    Remote.SeniorProtectSponsor6.click();
//	    Remote.SeniorProtectSponsor7.click();
//	    act.pause(1000).perform();
//	    Remote.FirstProtectforSecondAC1.click();
//	    Remote.FirstProtectforSecondAC2.click();
//	    Remote.FirstProtectforSecondAC3.click();
//	    Remote.FirstProtectforSecondAC4.click();
//	    Remote.FirstProtectforSecondAC5.click();
//	    Remote.FirstProtectforSecondAC6.click();
//	    Remote.FirstProtectforSeconsAC7.click();
//	   act.pause(1000).perform();
//	   Remote.FirstProtectforThridAC1.click();
//	   Remote.FirstProtectforThridAC2.click();
//	   Remote.FirstProtectforThridAC3.click();
//	   Remote.FirstProtectforThridAC4.click();
//	   Remote.FirstProtectforThridAC5.click();
//	   Remote.FirstProtectforThridAC6.click();
//	   Remote.FirstProtectforThridAC7.click();
//	    act.pause(2000).perform();
//	  Remote.ChildProtectMC1.click();
//	  Remote.ChildProtectMC2.click();
//	  Remote.ChildProtectMC3.click();
//	  Remote.ChildProtectMC4.click();
//	  act.pause(1000).perform();
//	  Remote.ChildProtectSecondMC1.click();
//	  Remote.ChildProtectSecondMC2.click();
//	  Remote.ChildProtectSecondMC3.click();
//	  Remote.ChildProtectSecondMC4.click();
//	  act.pause(1000).perform();
//	  Remote.ChildProtectThridMC1.click();
//	  Remote.ChildProtectThridMC2.click();
//	  Remote.ChildProtectThridMC3.click();
//	  Remote.ChildProtectThridMC4.click();
//	  act.pause(3000).perform();
	    Remote.NextBtn2.click();  
}

@Then("Input Sponsor Height feet inches and Weight")
public void input_Sponsor_Height_feet_inches_and_Weight() {
	 Remote.Height6Feet.click();
	   Remote.Height6Inches.click();
	   Remote.Weight.sendKeys("230");
	   act.pause(3000).perform();
	   Remote.NextBtn2.click();
}

@Then("Input Spouse SSN, gender, Height feet inches and Weight")
public void input_Spouse_SSN_gender_Height_feet_inches_and_Weight() {
	Remote.SpouseSSN.click();
    Remote.SpouseSSN.sendKeys("404000027");
    Remote.SpouseGenderFamale.click();
    Remote.Spouse5Feet.click();
    Remote.Spouse7Inches.click();
    Remote.SpouseWeight.sendKeys("129");
    act.pause(2000).perform();
}

@Then("Input Children Information SSN, Gender, Height, Weight, Status, Relationship")
public void input_Children_Information_SSN_Gender_Height_Weight_Status_Relationship() {
    Remote.ChildOneSSN.click();
    Remote.ChildOneSSN.sendKeys("404000028");
    Remote.ChildOneGenderFamale.click();
    Remote.ChildOnet5Feet.click();
    Remote.ChildOne8Inches.click();
    Remote.ChildOneWeight.sendKeys("124");
    Remote.ChildUSCitizen.click();
    Remote.ChildOneRelationshipParent.click();
    act.pause(2000).perform();
    Remote.ChildTwoSSN.click();
    Remote.ChildTwoSSN.sendKeys("404000029");
    Remote.ChildTwoGenderFamale.click();
    Remote.ChildTwo5Feet.click();
    Remote.ChildTwo9Inches.click();
    Remote.ChildTwoWeight.sendKeys("127");
    Remote.ChildTwoRelationshipParent.click();
    Remote.ChildTwoUSCitizenm.click();
    act.pause(2000).perform();
    Remote.ChildThreeSSN.click();
    Remote.ChildThreeSSN.sendKeys("404000030");
    Remote.ChildThreeGenderMale.click();
    Remote.ChildThree5Feet.click();
    Remote.ChildThree10Inches.click();
    Remote.ChildThreeWeight.sendKeys("130");
    Remote.ChildThreeUSCitizen.click();
    Remote.ChildThreeRelationshipG.click();
    act.pause(2000).perform();
    
    Remote.Child4SSN.click();
    Remote.Child4SSN.sendKeys("404000031");
    Remote.Child4Male.click();
    Remote.Child4Feet5.click();
    Remote.Child4Inches8.click();
    Remote.Child4Weight.sendKeys("154");
    Remote.Child4USCitizenYes.click();
    Remote.Child4RelationshipGrandParent.click();
    act.pause(2000).perform();
    
    Remote.Child5SSN.click();
    Remote.Child5SSN.sendKeys("404000032");
    Remote.Child5Male.click();
    Remote.Child5Feet5.click();
    Remote.Child5Inches9.click();
    Remote.Child5Weight.sendKeys("157");
    Remote.Child5USCitizen.click();
    Remote.Child5RelationshipStepParent.click();
    act.pause(2000).perform();
    
    Remote.Child6SSN.click();
    Remote.Child6SSN.sendKeys("404000033");
    Remote.Child6Male.click();
    Remote.Chil65Feet5.click();
    Remote.Child6Inches10.click();
    Remote.Child6Weight.sendKeys("160");
    Remote.Child6USCitizen.click();
    Remote.Child6RelationshipStepParent.click();
    act.pause(3000).perform();
    Remote.Next.click();
    
}

@Then("Senior Protect for Spouse Contingent Beneficiary FullName, SSN, Relationship and DOB")
public void senior_Protect_for_Spouse_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
    Remote.BASpouseContingentSomeOneElse.click();
    Remote.SpouseContingentFN.sendKeys("Della Street");
    Remote.SpouseContingentSSN.click();
    Remote.SpouseContingentSSN.sendKeys("404000034");
    Remote.SpouseContingentRelationshipChild.click();
    Remote.spouseContingentDOB.click();
    Remote.spouseContingentDOB.sendKeys("05201879");
    Remote.VarifyDOBSpouseContingent.click();
    act.pause(1000).perform();
    Remote.spouseContingentDOB.clear();
    Remote.spouseContingentDOB.click();
    Remote.spouseContingentDOB.sendKeys("05201979");
    act.pause(1000).perform();
}

@Then("First Protect Adult Child Nancy Primary Beneficiary FullName, SSN, Relationship and DOB")
public void first_Protect_Adult_Child_Nancy_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
  Remote.AC1FirstProtectPrimarySomeOneElse.click();
  Remote.AC1FirstProtectPrimaryFN.sendKeys("Anthony Hopkins");
  Remote.AC1FirstProtectPrimarySSN.click();
  Remote.AC1FirstProtectPrimarySSN.sendKeys("404000035");
  Remote.AC1FirstProtectPrimaryRelationshipExSpouse.click();
  Remote.AC1FirstProtectPrimaryDOB.click();
  Remote.AC1FirstProtectPrimaryDOB.sendKeys("04011859");
  Remote.VarifyDOBAC1.click();
  act.pause(1000).perform();
  Remote.AC1FirstProtectPrimaryDOB.clear();
  Remote.AC1FirstProtectPrimaryDOB.click();
  Remote.AC1FirstProtectPrimaryDOB.sendKeys("04101959");
  act.pause(1000).perform();
}

@Then("First Protect Adult Child Nancy Contingent Beneficiary FullName, SSN, Relationship and DOB")
public void first_Protect_Adult_Child_Nancy_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
   Remote.AC1FirstProtectContingentSomeOneElse.click();
   Remote.AC1FirstProtectContingentFN.sendKeys("Kennedy Ctr");
   Remote.AC1FirstProtectContingentSSN.click();
   Remote.AC1FirstProtectContingentSSN.sendKeys("404000036");
   Remote.AC1FirstProtectContingentRelationshipOther.click();
   Remote.AC1FirstProtectContingentDOB.click();
   Remote.AC1FirstProtectContingentDOB.sendKeys("01291863");
   Remote.AC1FirstProtectContingentDOBVarify.click();
   act.pause(1000).perform();
   Remote.AC1FirstProtectContingentDOB.clear();
   Remote.AC1FirstProtectContingentDOB.click();
   Remote.AC1FirstProtectContingentDOB.sendKeys("01291963");
   act.pause(1000).perform();
}

@Then("First Protect Adult Child Olivia Primary Beneficiary FullName, SSN, Relationship and DOB")
public void first_Protect_Adult_Child_Olivia_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
   Remote.AC2FirstProtectPrimarySomeOneElse.click();
   Remote.AC2FirstProtectPrimaryFN.sendKeys("Al Pacino");
   Remote.AC2FirstProtectPrimarySSN.click();
   Remote.AC2FirstProtectPrimarySSN.sendKeys("404000037");
   Remote.AC2FirstProtectPrimaryRelationshipExSpouse.click();
   Remote.AC2FirstProtectPrimaryDOB.click();
   Remote.AC2FirstProtectPrimaryDOB.sendKeys("09161898");
   Remote.AC1FirstProtectContingentDOBVarify.click();
   act.pause(1000).perform();
   Remote.AC2FirstProtectPrimaryDOB.clear();
   act.pause(1000).perform();
   Remote.AC2FirstProtectPrimaryDOB.click();
   Remote.AC2FirstProtectPrimaryDOB.sendKeys("09161998");
   act.pause(1000).perform();
}

@Then("First Protect Dult Child Olivia Contingent Beneficiary FullName, SSN, Relationship and DOB")
public void first_Protect_Dult_Child_Olivia_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
    Remote.AC2FirstProtectContingentSomeOneElse.click();
    Remote.AC2FirstProtectContingentFN.sendKeys("National Theater");
    Remote.AC2FirstProtectContingentSSN.click();
    Remote.AC2FirstProtectContingentSSN.sendKeys("404000038");
    Remote.AC2FirstProtectContingentRelationshipOther.click();
    Remote.AC2FirstProtectContingentDOB.click();
    Remote.AC2FirstProtectContingentDOB.sendKeys("02211854");
    Remote.AC2FirstProtectContingentDOBVarify.click();
    act.pause(1000).perform();
    Remote.AC2FirstProtectContingentDOB.clear();
    Remote.AC2FirstProtectContingentDOB.click();
    Remote.AC2FirstProtectContingentDOB.sendKeys("02211954");
    act.pause(1000).perform();
}

@Then("First Protect Adult Child Pia Primary Beneficiary FullName, SSN, Relationship and DOB")
public void first_Protect_Adult_Child_Pia_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
	Remote.AC3FirstProtectPrimarySomeOneElse.click();
	Remote.AC3FirstProtectPrimaryFN.sendKeys("James Gandolfini");
	Remote.AC3FirstProtectPrimarySSN.click();
	Remote.AC3FirstProtectPrimarySSN.sendKeys("404000039");
	Remote.AC3FirstProtectPrimaryRelationshipExSpouse.click();
	Remote.AC3FirstProtectPrimaryDOB.click();
	Remote.AC3FirstProtectPrimaryDOB.sendKeys("08281810");
	Remote.AC2FirstProtectContingentDOBVarify.click();
	act.pause(1000).perform();
	Remote.AC3FirstProtectPrimaryDOB.clear();
	Remote.AC3FirstProtectPrimaryDOB.click();
	Remote.AC3FirstProtectPrimaryDOB.sendKeys("08282010");
	act.pause(1000).perform();
}

@Then("First Protect Adult Child Pia Contingent Beneficiary FullName, SSN, Relationship and DOB")
public void first_Protect_Adult_Child_Pia_Contingent_Beneficiary_FullName_SSN_Relationship_and_DOB() {
    Remote.AC3FirstProtectContingentSomeOneElse.click();
    Remote.AC3FirstProtectContingentFN.sendKeys("Arena Stage");
    Remote.AC3FirstProtectContingentSSN.click();
    Remote.AC3FirstProtectContingentSSN.sendKeys("404000040");
    Remote.AC3FirstProtectContingentRelationshipBrother.click();
    Remote.AC3FirstProtectContingentDOB.click();
    Remote.AC3FirstProtectContingentDOB.sendKeys("07041850");
    Remote.AC2FirstProtectContingentDOBVarify.click();
    act.pause(1000).perform();
    Remote.AC3FirstProtectContingentDOB.clear();
    Remote.AC3FirstProtectContingentDOB.click();
    Remote.AC3FirstProtectContingentDOB.sendKeys("07041950");
    act.pause(1000).perform();
}

@Then("Child Protect Minor Child Roman Primary Beneficiary FullName, SSN, Relationship and DOB")
public void child_Protect_Minor_Child_Roman_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
   Remote.MC1ChildProtectPrimarySomeoneElse.click();
   Remote.MC1ChildProtectPrimaryFN.sendKeys("Ariana Grande");
   Remote.MC1ChildProtectPrimarySSN.click();
   Remote.MC1ChildProtectPrimarySSN.sendKeys("404000041");
   Remote.MC1ChildProtectPrimaryRelationshiGirlFriend.click();
   Remote.MC1ChildProtectPrimaryDOB.click();
   Remote.MC1ChildProtectPrimaryDOB.sendKeys("06221892");
   Remote.MC1ChildProtectContingentDOBVarify.click();
   act.pause(1000).perform();
   Remote.MC1ChildProtectPrimaryDOB.clear();
   Remote.MC1ChildProtectPrimaryDOB.click();
   Remote.MC1ChildProtectPrimaryDOB.sendKeys("06221992");
   act.pause(1000).perform();
}

@Then("Child Protect Minor Child Steve Primary Beneficiary FullName, SSN, Relationship and DOB")
public void child_Protect_Minor_Child_Steve_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
   Remote.MC2ChildProtectPrimarySomeoneElse.click();
   Remote.MC2ChildProtectPrimaryFN.sendKeys("Billie Eilish");
   Remote.MC2ChildProtectPrimarySSN.click();
   Remote.MC2ChildProtectPrimarySSN.sendKeys("404000042");
   Remote.MC2ChildProtectPrimaryRelationshipFiance.click();
   Remote.MC2ChildProtectPrimaryDOB.click();
   Remote.MC2ChildProtectPrimaryDOB.sendKeys("12121891");
   Remote.MC2ChildProtectContingentDOBVarify.click();
   act.pause(1000).perform();
   Remote.MC2ChildProtectPrimaryDOB.clear();
   Remote.MC2ChildProtectPrimaryDOB.click();
   Remote.MC2ChildProtectPrimaryDOB.sendKeys("12121991");
   act.pause(1000).perform();
}

@Then("Child Protect Minor Child Travis Primary Beneficiary FullName, SSN, Relationship and DOB")
public void child_Protect_Minor_Child_Travis_Primary_Beneficiary_FullName_SSN_Relationship_and_DOB() {
   Remote.MC3ChildProtectPrimarySomeoneElse.click();
   Remote.MC3ChildProtectPrimaryFN.sendKeys("Camila Cabello");
   Remote.MC3ChildProtectPrimarySSN.click();
   Remote.MC3ChildProtectPrimarySSN.sendKeys("404000043");
   Remote.MC3ChildProtectPrimaryRelationshipFiance.click();
   Remote.MC3ChildProtectPrimaryDOB.click();
   Remote.MC3ChildProtectPrimaryDOB.sendKeys("11151896");
   Remote.MC3ChildProtectContingentDOBVarify.click();
   act.pause(1000).perform();
   Remote.MC3ChildProtectPrimaryDOB.clear();
   Remote.MC3ChildProtectPrimaryDOB.click();
   Remote.MC3ChildProtectPrimaryDOB.sendKeys("11151996");
   act.pause(2000).perform();
   Remote.NextBtn6.click();
   act.pause(2000).perform();
}

@Then("Select Email Summary input Email Address for Confirmation")
public void select_Email_Summary_input_Email_Address_for_Confirmation() {
	Remote.EmailSummary1.click();
	act.pause(1000).perform();
	Remote.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
	Remote.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
	act.pause(1000).perform();
}

@Then("Click Military Allotment Method of Payment option")
public void click_Military_Allotment_Method_of_Payment_option() {
	Remote.AcknowledgeofPayment.click();
	  act.pause(1000).perform();
}

@Then("Click Signing via email option and enter Email for routing application then Submit it")
public void click_Signing_via_email_option_and_enter_Email_for_routing_application_then_Submit_it() {
	  Remote.SiginingViaEmail.click();
	  act.pause(2000).perform();
	  Remote.EnterEmailOne.clear();
	  Remote.EnterEmailOne.sendKeys("qapeep512@gmail.com");
	  Remote.EnterEmailTwo.clear();
	  Remote.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
	  act.pause(1000).perform();
	  Remote.SubmitEmailForsignatureBtn.click();
	  act.pause(9000).perform();  
}

@Then("Login Email UserID and Password")
public void login_Email_UserID_and_Password() {
	 driver.get("https://www.google.com");
	 Remote.SignIn.click();  
	 Remote.InputEmail.sendKeys("qapeep512@gmail.com");
		Remote.NextButton.click();	
		act.pause(2000).perform();
		Remote.InputPassword.sendKeys("Muna@5012");
		Remote.NextButton.click();
		act.pause(4000).perform();
}

@Then("Select Inbox and check the Emails")
public void select_Inbox_and_check_the_Emails() {
	Remote.ClickEmail.click();
	act.pause(4000).perform();
	//Remote.ClickInbox.click();
	Remote.SelectFirstEmail.click();
	act.pause(2000).perform();
}

@Then("Select Email from AFBA Enrollement and click Review Application")
public void select_Email_from_AFBA_Enrollement_and_click_Review_Application() {
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

@Then("Enter sponsor lastName and Last four SSN numbers and click Review and Sign My Application button")
public void enter_sponsor_lastName_and_Last_four_SSN_numbers_and_click_Review_and_Sign_My_Application_button() {
	Remote.LastNameforSponsor.sendKeys("Jackson");
	Remote.LastSSNforSponsor.sendKeys("0026");
}

@Then("Click review application ducuments button to review all the Information")
public void click_review_application_ducuments_button_to_review_all_the_Information() {
	Remote.ReviewAndSignMyApplication.click();
	act.pause(3000).perform();
	Remote.ReviewApplicationDocumentBtn.click();
	act.pause(11000).perform();
	Remote.CloseBtn.click();
	act.pause(2000).perform();
}

@Then("Enter Sponsor and Spouse lastName and last four SSN")
public void enter_Sponsor_and_Spouse_lastName_and_last_four_SSN() {
	Remote.SponsorLastName.sendKeys("Jacksun");
	Remote.verifySSN.click();
    act.pause(2000).perform();
    Remote.SponsorLastName.clear();
	Remote.SponsorLastName.click();	
    Remote.SponsorLastName.sendKeys("Jackson");
	Remote.SponsorLastSSN.sendKeys("0062");
	Remote.verifySSN.click();
    act.pause(2000).perform();
	Remote.SponsorLastSSN.clear();
	Remote.SponsorLastSSN.click();
	Remote.SponsorLastSSN.sendKeys("0026");
	act.pause(1000).perform();
//	Remote.SpouseLastName.sendKeys("Jackson");
//	Remote.SpouseLastSSN.click();
//	Remote.SpouseLastSSN.sendKeys("0027");
}

@Then("Select Paper receive the document option")
public void select_Paper_receive_the_document_option() {
	Remote.PaperBtn.click();
	act.pause(2000).perform();
	Remote.SignBtn.click();
	act.pause(3000).perform();
}
@Then("Navigate back to login AFBA Enrollment Webpage")
public void navigate_back_to_login_AFBA_Enrollment_Webpage() {
	driver.get("https://enroll-sandbox.afba.com/login");
	Remote.email.sendKeys("qapeep512@gmail.com");
	Remote.password.sendKeys("Muna@512");
	Remote.loginBtn.click();
	act.pause(3000).perform();
}

@Then("Click Access Agent Signing Inbox")
public void click_Access_Agent_Signing_Inbox() {
	Remote.AccessAgentSigningInbox.click();
	act.pause(2000).perform();
}

@Then("Sign the Applications on Agent Inbox")
public void sign_the_Applications_on_Agent_Inbox() {
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
