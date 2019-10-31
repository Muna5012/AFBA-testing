package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Remote;
import utilities.TestBase;

public class EAppRemote7 extends TestBase{


@When("Click New Enrollment button enter Sponsor SSN, Enrollment City and Enrollment State")
public void click_New_Enrollment_button_enter_Sponsor_SSN_Enrollment_City_and_Enrollment_State() {
	 Remote.SSN.click();
	  Remote.SSN.sendKeys("404000066");
	  Remote.EnrollmentCity.clear();
	  Remote.EnrollmentCity.sendKeys("Las Vegas");
	  Remote.EnrollmentState.click();
	  Remote.NV.click();
	  act.pause(2000).perform();
}

@Then("Select Begin Enrollment button create case")
public void select_Begin_Enrollment_button_create_case() {
	   Remote.NextBtn.click();
//	   Remote.BeginEnrollment.click();
		Remote.ClickNewSponsor.click();
		act.pause(2000).perform();
}

@Then("Enter Sponsor First Name, Last Name, Gender and DOB")
public void enter_Sponsor_First_Name_Last_Name_Gender_and_DOB() {
	Remote.FirstName.sendKeys("Isaih");
    Remote.LastName.sendKeys("Heneberry");
    Remote.DOB.click();
    act.pause(1000).perform();
    Remote.DOB.sendKeys("10041960");
    Remote.GenderMale.click();   
    act.pause(2000).perform();
}

@Then("Select Married button enter spouse First Name, Last Name and DOB")
public void select_Married_button_enter_spouse_First_Name_Last_Name_and_DOB() {
	Remote.MarriedBtn.click();
    Remote.SpouseFN.sendKeys("Julie");
    Remote.SpouseLN.sendKeys("Heneberry");
    Remote.SpouseDOB.click();
    act.pause(1000).perform();
    Remote.SpouseDOB.sendKeys("11291969");
    act.pause(2000).perform();
}

@Then("Select Include Children button enter Adult Child one First Name, Last Name, DOB")
public void select_Include_Children_button_enter_Adult_Child_one_First_Name_Last_Name_DOB() {
	 Remote.ChildrenBtn.click();
	   Remote.ChildOneFN.sendKeys("Rafael");
	   Remote.ChildOneLN.sendKeys("Heneberry");
	   Remote.ChildOneDOB.click();
	   Remote.ChildOneDOB.sendKeys("10021994");
	  act.pause(1000).perform();
}

@Then("Click Add Child button enter Adult Child two First Name, Last Name, DOB")
public void click_Add_Child_button_enter_Adult_Child_two_First_Name_Last_Name_DOB() {
	Remote.AddChildBtn.click();
	   Remote.ChildTwoFN.sendKeys("Margo");
	   Remote.ChildTwoDOB.click();
	   Remote.ChildTwoDOB.sendKeys("10031994");
	   act.pause(1000).perform();
}

@Then("Click Add Child button enter Adult Child three First Name, Last Name, DOB")
public void click_Add_Child_button_enter_Adult_Child_three_First_Name_Last_Name_DOB() {
	 Remote.AddChildBtn.click();
	   Remote.ChildThreeFN.sendKeys("Dawson");
	   Remote.ChildThreeDOB.click();
	   Remote.ChildThreeDOB.sendKeys("10041994");
	   act.pause(1000).perform();
}

@Then("Click Add Child button enter Minor child one First Name, Last Name, DOB")
public void click_Add_Child_button_enter_Minor_child_one_First_Name_Last_Name_DOB() {
	Remote.AddChildBtn.click();
    Remote.ChildFourFN.sendKeys("Lillith");
    Remote.ChildFourDOB.click();
    Remote.ChildFourDOB.sendKeys("12062001");
    act.pause(1000).perform();
}

@Then("Click Add Child button enter Minor Child two First Name, Last Name, DOB")
public void click_Add_Child_button_enter_Minor_Child_two_First_Name_Last_Name_DOB() {
	Remote.AddChildBtn.click();
   Remote.ChildFifthFN.sendKeys("Milton");
   Remote.ChildFifthDOB.click();
   Remote.ChildFifthDOB.sendKeys("12072001");
   act.pause(1000).perform();
}

@Then("Click Add Child button enter Minor Child three First Name, Last Name, DOB")
public void click_Add_Child_button_enter_Minor_Child_three_First_Name_Last_Name_DOB() {
	Remote.AddChildBtn.click();
    Remote.ChildSixFN.sendKeys("Isabella");
    Remote.ChildSixDOB.click();
    Remote.ChildSixDOB.sendKeys("12082001");
    act.pause(1000).perform();
}

@Then("Select Military on Eligibility option, Navy Banch of service, Dute status IRR, Rank E nine, Credit card Contribution Mode")
public void select_Military_on_Eligibility_option_Navy_Banch_of_service_Dute_status_IRR_Rank_E_nine_Credit_card_Contribution_Mode() {
	Remote.Military.click();
	Remote.Navy.click();
	Remote.IRR.click();
	Remote.E9.click();
	Remote.CreditCard.click();
	act.pause(1000).perform();
	Remote.DepartmentCode.sendKeys("AutoTest");
	Remote.SourceCode.sendKeys("IT1");
	act.pause(1000).perform();
}

@Then("Enter Street Address one, Stress Adress two, City, State, ZipCode and Daytime phone numbers")
public void enter_Street_Address_one_Stress_Adress_two_City_State_ZipCode_and_Daytime_phone_numbers() {
	Remote.Street.sendKeys("Bayview Shores");
    Remote.Street2.sendKeys("Apt 7");
    Remote.City.sendKeys("Brooklyn");
    Remote.State.sendKeys("New York");
    Remote.State.sendKeys(Keys.ENTER);
    Remote.ZipCode.click();
    Remote.ZipCode.sendKeys("11201");
    Remote.Phone.click();
    Remote.Phone.sendKeys("7037065961");
    act.pause(3000).perform();

}

@Then("Select Coverage Options")
public void select_Coverage_Options() {
    Remote.ShowCoverageOptions.click();
    act.pause(1000).perform();
}

@Then("Coverage Options waive enrollment in Better Alternative, Fed Term, Application Member Benefit")
public void coverage_Options_waive_enrollment_in_Better_Alternative_Fed_Term_Application_Member_Benefit() {
	Remote.WaiveBA.click();
	   act.pause(1000).perform();
  	Remote.FedTerm.click();
  	act.pause(1000).perform();
	   Remote.WaiveFedTerm.click();
	   act.pause(2000).perform();
}

@Then("Select Senior Protect Tobacco for sponsor and Customize twenty thousand k")
public void select_Senior_Protect_Tobacco_for_sponsor_and_Customize_twenty_thousand_k() {
	Remote.SeniorProtect.click();
	   act.pause(1000).perform();
	   Remote.Tobacco.click();
	   act.pause(1000).perform();
	   Remote.SeniorProtectoNLYSpouseCustomize25.click();
	   act.pause(2000).perform();
		  Remote.ApplicationMemberBenf.click();
		   Remote.WaiveApplication.click();
		   act.pause(2000).perform();
}

@Then("First Protect select Tobacco for sponsor, spouse, AC{int} and Customize fifty thousand K for each child")
public void first_Protect_select_Tobacco_for_sponsor_spouse_AC_and_Customize_fifty_thousand_K_for_each_child(Integer int1) {
	Remote.FirstProtect.click();
	Remote.TobaccoSponsor.click();
    Remote.TobaccoSpouse.click();
    Remote.AC1Tobacco.click();
    act.pause(1000).perform();
    Remote.FirstProtectNoBenefitforSponsor.click();
	  Remote.FirstProtectNoBenefitForSpouse.click();
	  act.pause(1000).perform();
	  Remote.FirstProtectAC1Customize50.click();
	  Remote.FirstProtectAC2Customize50.click();
	  Remote.FirstProtectAC3Customize50.click();
	  act.pause(2000).perform();
}

@Then("Children Protect Covered three MC")
public void children_Protect_Covered_three_MC() {
	 Remote.ChildrenProtectClick.click();
	  Remote.CoveredForFirstKid.click();
	  Remote.CoveredforSecondKid.click();
	  Remote.CoveredForThrid.click();
	  act.pause(2000).perform();
	  act.pause(2000).perform();
	  Remote.NextBtn2.click();
}

@Then("Answer all the questions Yes or NO for Qualification page")
public void answer_all_the_questions_Yes_or_NO_for_Qualification_page() {
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

@Then("Input Sponsor Information include Height and Weight")
public void input_Sponsor_Information_include_Height_and_Weight() {
	 Remote.Height6Feet.click();
	   Remote.Height7Inches.click();
	   Remote.Weight.sendKeys("215");
	   act.pause(2000).perform();
	   Remote.NextBtn2.click();
}

//@Then("Input Spouse Information include SSN, Gender, Height and Weight")
//public void input_Spouse_Information_include_SSN_Gender_Height_and_Weight() {
//	Remote.SpouseSSN.click();
//    Remote.SpouseSSN.sendKeys("404000067");
//    Remote.SpouseGenderFamale.click();
//    Remote.Spouse5Feet.click();
//    Remote.Spouse9Inches.click();
//    Remote.SpouseWeight.sendKeys("137");
//    act.pause(2000).perform();
//}

@Then("Input Children Information include SSN, Gender, Height, Weight, Status, Relationship")
public void input_Children_Information_include_SSN_Gender_Height_Weight_Status_Relationship() {
	  Remote.ChildOneSSN.click();
	    Remote.ChildOneSSN.sendKeys("404000068");
	    Remote.ChildOneGenderMale.click();
	    Remote.ChildOnet5Feet.click();
	    Remote.ChildOne11Inches.click();
	    Remote.ChildOneWeight.sendKeys("124");
	    Remote.ChildUSCitizen.click();
	    Remote.ChildOneRelationshipParent.click();
	    act.pause(1000).perform();
	    Remote.ChildTwoSSN.click();
	    Remote.ChildTwoSSN.sendKeys("404000069");
	    Remote.ChildTwoGenderFamale.click();
	    Remote.ChildTwo5Feet.click();
	    Remote.ChildTwo9Inches.click();
	    Remote.ChildTwoWeight.sendKeys("139");
	    Remote.ChildTwoRelationshipParent.click();
	    Remote.ChildTwoUSCitizenm.click();
	    act.pause(1000).perform();
	    Remote.ChildThreeSSN.click();
	    Remote.ChildThreeSSN.sendKeys("404000070");
	    Remote.ChildThreeGenderFemale.click();
	    Remote.ChildThree5Feet.click();
	    Remote.ChildThree10Inches.click();
	    Remote.ChildThreeWeight.sendKeys("141");
	    Remote.ChildThreeUSCitizen.click();
	    Remote.ChildThreeRelationshipG.click();
	    act.pause(1000).perform();
	    
	    Remote.Child4SSN.click();
	    Remote.Child4SSN.sendKeys("404000071");
	    Remote.Child4Male.click();
	    Remote.Child4Feet5.click();
	    Remote.Child4Inches8.click();
	    Remote.Child4Weight.sendKeys("115");
	    Remote.Child4USCitizenYes.click();
	    Remote.Child4RelationshipGrandParent.click();
	    act.pause(1000).perform();
	    
	    Remote.Child5SSN.click();
	    Remote.Child5SSN.sendKeys("404000072");
	    Remote.Child5Male.click();
	    Remote.Child5Feet5.click();
	    Remote.Child5Inches9.click();
	    Remote.Child5Weight.sendKeys("130");
	    Remote.Child5USCitizen.click();
	    Remote.Child5RelationshipStepParent.click();
	    act.pause(1000).perform();
	    
	    Remote.Child6SSN.click();
	    Remote.Child6SSN.sendKeys("404000073");
	    Remote.Child6Male.click();
	    Remote.Chil65Feet5.click();
	    Remote.Child6Inches6.click();
	    Remote.Child6Weight.sendKeys("100");
	    Remote.Child6USCitizen.click();
	    Remote.Child6RelationshipStepParent.click();
	    act.pause(2000).perform();
	    Remote.Next.click();
	    
	    }

	@Then("Senior Protect Primary Beneficiary of SPonsor Coverage beneficiary FullName, Relationship and DOB")
	public void senior_Protect_Primary_Beneficiary_of_SPonsor_Coverage_beneficiary_FullName_Relationship_and_DOB() {
			Remote.BASponsorPrimarySomeOneElse.click();
		   Remote.PrimaryBenficiaryFullName.sendKeys("Bertha Hibson");
		   Remote.PrimaryRelationshipMother.click();
		    Remote.PrimaryBeneficiaryDOB.click();
		    Remote.PrimaryBeneficiaryDOB.sendKeys("04101842");
		    Remote.VarifyDOB.click();
		    act.pause(1000).perform();
		    Remote.PrimaryBeneficiaryDOB.clear();
		    Remote.PrimaryBeneficiaryDOB.click();
		    Remote.PrimaryBeneficiaryDOB.sendKeys("04101942");
		    act.pause(1000).perform();
	}

	@Then("Senior Protect Contingent Beneficiary of Sponsor Coverage beneficiary FullName, Relationship and DOB")
	public void senior_Protect_Contingent_Beneficiary_of_Sponsor_Coverage_beneficiary_FullName_Relationship_and_DOB() {
			Remote.SomeoneElsee.click();
		    Remote.ContingentBeneficiaryFullName.sendKeys("Samuel Gibson");
		    Remote.ContingentBeneficiaryRelationshipFather.click();
		    Remote.ContingentBeneficiaryDOB.click();
		    Remote.ContingentBeneficiaryDOB.sendKeys("12111837");
		    Remote.ContingentBeneficiaryDOBVarify.click();
		    act.pause(1000).perform();
		    Remote.ContingentBeneficiaryDOB.clear();
		    Remote.ContingentBeneficiaryDOB.click();
		    Remote.ContingentBeneficiaryDOB.sendKeys("12111937");
		    act.pause(1000).perform();
	}

	@Then("First Protect first Adult Child Primary Beneficiary FullName, Relationship and DOB")
	public void first_Protect_first_Adult_Child_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.AC1FirstProtectPrimarySomeOneElse.click();
		Remote.AC1FirstProtectPrimaryFN.sendKeys("Mariska Hargitay");
		Remote.ACFirstProtectPrimaryRelationshipFiance.click();
		Remote.AC1FirstProtectPrimaryDOB.click();
		Remote.AC1FirstProtectPrimaryDOB.sendKeys("12211890");
		Remote.VarifyDOBAC1.click();
		Remote.AC1FirstProtectPrimaryDOB.clear();
		Remote.AC1FirstProtectPrimaryDOB.click();
		Remote.AC1FirstProtectPrimaryDOB.sendKeys("12211990");
		act.pause(1000).perform();
	}

	@Then("First Protect first Adult Child Contingent Beneficiary FullName, Relationship and DOB")
	public void first_Protect_first_Adult_Child_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.AC1FirstProtectContingentSomeOneElse.click();
		Remote.AC1FirstProtectContingentFN.sendKeys("Clarise Nelson");
		Remote.AC1FirstProtectContingentRelationshipStepParent.click();
		Remote.AC1FirstProtectContingentDOB.click();
		Remote.AC1FirstProtectContingentDOB.sendKeys("06141859");
		Remote.AC1FirstProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.AC1FirstProtectContingentDOB.clear();
		Remote.AC1FirstProtectContingentDOB.click();
		Remote.AC1FirstProtectContingentDOB.sendKeys("06141959");
		act.pause(1000).perform();
	}

	@Then("First Protect second Adult Child Primary Beneficiary FullName, Relationship and DOB")
	public void first_Protect_second_Adult_Child_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.AC2FirstProtectPrimarySomeOneElse.click();
		Remote.AC2FirstProtectPrimaryFN.sendKeys("Global Impact");
		Remote.AC2FirstprotectPrimaryRelationshipOther.click();
		Remote.AC2FirstProtectPrimaryDOB.click();
		Remote.AC2FirstProtectPrimaryDOB.sendKeys("07041874");
		Remote.AC1FirstProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.AC2FirstProtectPrimaryDOB.clear();
		Remote.AC2FirstProtectPrimaryDOB.click();
		Remote.AC2FirstProtectPrimaryDOB.sendKeys("07041974");
		act.pause(1000).perform();
	
	}

	@Then("First Protect second Adult Child Contingent Beneficiary FullName, Relationship and DOB")
	public void first_Protect_second_Adult_Child_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.AC2FirstProtectContingentSomeOneElse.click();
		Remote.AC2FirstProtectContingentFN.sendKeys("Ruth House");
		Remote.AC2FirstProtectContingentRelationshipOther.click();
		Remote.AC2FirstProtectContingentDOB.click();
		Remote.AC2FirstProtectContingentDOB.sendKeys("02211878");
		Remote.AC2FirstProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.AC2FirstProtectContingentDOB.clear();
		Remote.AC2FirstProtectContingentDOB.click();
		Remote.AC2FirstProtectContingentDOB.sendKeys("02211978");
		act.pause(1000).perform();
	}

	@Then("First Protect last Adult Child Primary Beneficiary FullName, Relationship and DOB")
	public void first_Protect_last_Adult_Child_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.AC3FirstProtectPrimarySomeOneElse.click();
		Remote.AC3FirstProtectPrimaryFN.sendKeys("Greg So");
		Remote.AC3FirstProtectPrimaryRelationshipUncle.click();
		Remote.AC3FirstProtectPrimaryDOB.click();
		Remote.AC3FirstProtectPrimaryDOB.sendKeys("09251877");
		Remote.AC2FirstProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.AC3FirstProtectPrimaryDOB.clear();
		Remote.AC3FirstProtectPrimaryDOB.click();
		Remote.AC3FirstProtectPrimaryDOB.sendKeys("09251977");
		act.pause(1000).perform();
	}

	@Then("First Protect last Asult Child Contingent Beneficiary FullName, Relationship and DOB")
	public void first_Protect_last_Asult_Child_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.AC3FirstProtectContingentSomeOneElse.click();
		Remote.AC3FirstProtectContingentFN.sendKeys("Marla So");
		Remote.AC3FirstProtectContingentRelationshipAunt.click();
		Remote.AC3FirstProtectContingentDOB.click();
		Remote.AC3FirstProtectContingentDOB.sendKeys("09261874");
		Remote.AC2FirstProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.AC3FirstProtectContingentDOB.clear();
		Remote.AC3FirstProtectContingentDOB.click();
		Remote.AC3FirstProtectContingentDOB.sendKeys("09261974");
		act.pause(1000).perform();
	}

	@Then("Children Protect first Minor Child Lillith Primary Beneficiary FullName, Relationship and DOB")
	public void children_Protect_first_Minor_Child_Lillith_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.MC1ChildProtectPrimarySomeoneElse.click();
		Remote.MC1ChildProtectPrimaryFN.sendKeys("Dell Keech");
		Remote.MC1ChildProtectPrimaryRelationshipGrandParent.click();
		Remote.MC1ChildProtectPrimaryDOB.click();
		Remote.MC1ChildProtectPrimaryDOB.sendKeys("06041820");
		Remote.MC1ChildProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.MC1ChildProtectPrimaryDOB.clear();
		Remote.MC1ChildProtectPrimaryDOB.click();
		Remote.MC1ChildProtectPrimaryDOB.sendKeys("06041920");
		act.pause(1000).perform();
	}

	@Then("Children Protect first Minor Child Lillith Contingent Bneficiary FullName, Relationship and DOB")
	public void children_Protect_first_Minor_Child_Lillith_Contingent_Bneficiary_FullName_Relationship_and_DOB() {
		Remote.MC1ChildProtectContingentSomeoneElse.click();
		Remote.MC1ChildProtectContingentFN.sendKeys("Geraldine Keech");
		Remote.MC1ChildProtectContingentRelationshipGrandParent.click();
		Remote.MC1ChildProtectContingentDOB.click();
		Remote.MC1ChildProtectContingentDOB.sendKeys("09151836");
		Remote.MC1ChildProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.MC1ChildProtectContingentDOB.clear();
		Remote.MC1ChildProtectContingentDOB.click();
		Remote.MC1ChildProtectContingentDOB.sendKeys("09151936");
		act.pause(1000).perform();
	}

	@Then("Children Protect second Minor Child Milton Primary Benedficiary FullName, Relastionship and DOB")
	public void children_Protect_second_Minor_Child_Milton_Primary_Benedficiary_FullName_Relastionship_and_DOB() {
		Remote.MC2ChildProtectPrimarySomeoneElse.click();
		Remote.MC2ChildProtectPrimaryFN.sendKeys("Thomas Hass");
		Remote.MC2ChildProtectPrimaryRelationshipOther.click();
		Remote.MC2ChildProtectPrimaryDOB.click();
		Remote.MC2ChildProtectPrimaryDOB.sendKeys("07211840");
		Remote.MC2ChildProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.MC2ChildProtectPrimaryDOB.clear();
		Remote.MC2ChildProtectPrimaryDOB.click();
		Remote.MC2ChildProtectPrimaryDOB.sendKeys("07212019");
		act.pause(1000).perform();
	}

	@Then("Children Protect second Minor Child Milton Contingent Beneficiary FullName, Relationship and DOB")
	public void children_Protect_second_Minor_Child_Milton_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.MC2ChildProtectContingentSomeoneElse.click();
		Remote.MC2ChildProtectContingentFN.sendKeys("Basil Hayden");
		Remote.MC2ChildProtectContingentRelationshipBoyFriend.click();
		Remote.MC2ChildProtectContingentDOB.click();
		Remote.MC2ChildProtectContingentDOB.sendKeys("02141849");
		Remote.MC2ChildProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.MC2ChildProtectContingentDOB.clear();
		Remote.MC2ChildProtectContingentDOB.click();
		Remote.MC2ChildProtectContingentDOB.sendKeys("02141949");
		act.pause(1000).perform();
	}

	@Then("Children Protect Minor Child Isabella Primary Beneficiary FullName, Relationship and DOB")
	public void children_Protect_Minor_Child_Isabella_Primary_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.MC3ChildProtectPrimarySomeoneElse.click();
		Remote.MC3ChildProtectPrimaryFN.sendKeys("My Trust");
		Remote.MC3ChildProtectPrimaryRelationshipTrust.click();
		Remote.MC3ChildProtectPrimaryDOB.click();
		Remote.MC3ChildProtectPrimaryDOB.sendKeys("02041819");
		Remote.MC3ChildProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.MC3ChildProtectPrimaryDOB.clear();
		Remote.MC3ChildProtectPrimaryDOB.click();
		Remote.MC3ChildProtectPrimaryDOB.sendKeys("02042019");
		act.pause(1000).perform();
	}

	@Then("Children protect Minor Child Isabella Contingent Beneficiary FullName, Relationship and DOB")
	public void children_protect_Minor_Child_Isabella_Contingent_Beneficiary_FullName_Relationship_and_DOB() {
		Remote.MC3ChildProtectContingentSomeoneElse.click();
		Remote.MC3ChildProtectContingentFN.sendKeys("Sharon Stone");
		Remote.MC3ChildProtectContingentRelationshipGuardian.click();
		Remote.MC3ChildProtectContingentDOB.click();
		Remote.MC3ChildProtectContingentDOB.sendKeys("01011899");
		Remote.MC3ChildProtectContingentDOBVarify.click();
		act.pause(1000).perform();
		Remote.MC3ChildProtectContingentDOB.clear();
		Remote.MC3ChildProtectContingentDOB.click();
		Remote.MC3ChildProtectContingentDOB.sendKeys("01011999");
		act.pause(1000).perform();
		Remote.NextBtn6.click();
	}

	@Then("Confirmation page select Email Summary enter Email address for Coverage Confirmation")
	public void confirmation_page_select_Email_Summary_enter_Email_address_for_Coverage_Confirmation() {
	   act.pause(1000).perform();
	   Remote.EmailSummary1.click();
	   act.pause(1000).perform();
	   Remote.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
	   Remote.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
	   act.pause(1000).perform();
	}

	@Then("Enter Credit Card Number, Expiration Date and CVV")
	public void enter_Credit_Card_Number_Expiration_Date_and_CVV() {
	    Remote.DayOfDeducation1forCreditCard.click();
	    Remote.CreditCardNumber.click();
	    Remote.CreditCardNumber.sendKeys("5800000000000001");
	    Remote.ExpirationDate.click();
	    Remote.ExpirationDate.sendKeys("1119");
	    Remote.CVV.sendKeys("116");
	    act.pause(2000).perform();
	}

	@Then("Select Singing Via Email and input Email address for Routing application")
	public void select_Singing_Via_Email_and_input_Email_address_for_Routing_application() {
	   Remote.SiginingViaEmail.click();
	   act.pause(1000).perform();
	   Remote.EnterEmailOne.clear();;
	   Remote.EnterEmailOne.sendKeys("qapeep512@gmail.com");
	   Remote.EnterEmailTwo.clear();;
	   Remote.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
	   act.pause(1000).perform();
	}

	@Then("Click Submit and Send Email for Signature button to submit it")
	public void click_Submit_and_Send_Email_for_Signature_button_to_submit_it() {
		  Remote.SubmitEmailForsignatureBtn.click();
		  act.pause(7000).perform();  
	}

	@Then("Login Email account to input Username and Password")
	public void login_Email_account_to_input_Username_and_Password() {
		driver.get("https://www.google.com");
		 Remote.SignIn.click();  
		 Remote.InputEmail.sendKeys("qapeep512@gmail.com");
			Remote.NextButton.click();	
			act.pause(2000).perform();
			Remote.InputPassword.sendKeys("Muna@5012");
			Remote.NextButton.click();
			act.pause(4000).perform();
	}

	@Then("Select Inbox and check Email from AFBA Enrollment")
	public void select_Inbox_and_check_Email_from_AFBA_Enrollment() {
		Remote.ClickSelect.click();
		act.pause(1000).perform();
		Remote.ClickEmail.click();
		act.pause(2000).perform();
		//Remote.ClickInbox.click();
		Remote.SelectFirstEmail.click();
		act.pause(2000).perform();
	//	Remote.selectEmail.click();
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

	@Then("Enter sponsor Last Name and Last four SSN")
	public void enter_sponsor_Last_Name_and_Last_four_SSN() {
		Remote.LastNameforSponsor.sendKeys("Heneberry");
		Remote.LastSSNforSponsor.sendKeys("0066");
	}

	@Then("Click Review and Sign My Application button")
	public void click_Review_and_Sign_My_Application_button() {
		Remote.ReviewAndSignMyApplication.click();
		act.pause(3000).perform();
	}

	@Then("Click Review Application Ducument button to review all application")
	public void click_Review_Application_Ducument_button_to_review_all_application() {
		Remote.ReviewApplicationDocumentBtn.click();
		act.pause(13000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input sponsor and spouse Last Name and last four SSN")
	public void input_sponsor_and_spouse_Last_Name_and_last_four_SSN() {
		Remote.SponsorLastName.sendKeys("Hennebeey");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
	    Remote.SponsorLastName.clear();
		Remote.SponsorLastName.click();	
	    Remote.SponsorLastName.sendKeys("Heneberry");
		Remote.SponsorLastSSN.sendKeys("0006");
		Remote.verifySSN.click();
	    act.pause(2000).perform();
		Remote.SponsorLastSSN.clear();
		Remote.SponsorLastSSN.click();
		Remote.SponsorLastSSN.sendKeys("0066");
		act.pause(1000).perform();
//		Remote.SpouseLastName.sendKeys("Heneberry");
//		Remote.SpouseLastSSN.click();
//		Remote.SpouseLastSSN.sendKeys("0067");
	}

	@Then("Select Paper option to receive the document")
	public void select_Paper_option_to_receive_the_document() {
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
		act.pause(12000).perform();
		Remote.CloseBtn.click();
		act.pause(2000).perform();
		Remote.Sign.click();
		act.pause(3000).perform();
	}



	}
