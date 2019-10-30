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
	   Remote.BeginEnrollment.click();
	//	Remote.ClickNewSponsor.click();
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
    
}

@Then("Input Sponsor Information include Height and Weight")
public void input_Sponsor_Information_include_Height_and_Weight() {
    
}

@Then("Input Spouse Information include SSN, Gender, Height and Weight")
public void input_Spouse_Information_include_SSN_Gender_Height_and_Weight() {
  
}

@Then("Input Children Information include SSN, Gender, Height, Weight, Status, Relationship")
public void input_Children_Information_include_SSN_Gender_Height_Weight_Status_Relationship() {
  
}

}
