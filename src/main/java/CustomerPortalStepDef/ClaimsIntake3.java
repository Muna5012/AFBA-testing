package CustomerPortalStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClaimsIntake;
import utilities.TestBase;

public class ClaimsIntake3  extends TestBase{
	
	@Given("Step two input First Name, Last Name, Relationship")
	public void step_two_input_First_Name_Last_Name_Relationship() {
		act.pause(2000).perform();
		ClaimsIntake.FirstName.click();
		ClaimsIntake.FirstName.sendKeys("Aleia");
		ClaimsIntake.LastName.sendKeys("Dubois");
		act.pause(2000).perform();
		ClaimsIntake.Relationship.click();
		act.pause(2000).perform();
		ClaimsIntake.RelationshipExSpouse.click();
	}

	@When("Input Email, Address, City, State, Zipcode, Country and Phone Num")
	public void input_Email_Address_City_State_Zipcode_Country_and_Phone_Num() {
		act.pause(2000).perform();
		ClaimsIntake.Email.click();
		ClaimsIntake.Email.sendKeys("qapeep19@gmail.com");
		act.pause(2000).perform();
		ClaimsIntake.Street.click();
		ClaimsIntake.Street.sendKeys("Apt 1227 7 River Rd");
		act.pause(2000).perform();
		ClaimsIntake.City.click();
		ClaimsIntake.City.sendKeys("Pago Pago");
		act.pause(2000).perform();
		ClaimsIntake.State.click();
		ClaimsIntake.StateSouthDakota.click();
		act.pause(2000).perform();
		ClaimsIntake.ZipCode.click();
		ClaimsIntake.ZipCode.sendKeys("96799");
		act.pause(2000).perform();
		ClaimsIntake.Country.click();
		act.pause(2000).perform();
		ClaimsIntake.USA.click();
		act.pause(2000).perform();
		ClaimsIntake.Phone.click();
		ClaimsIntake.Phone.sendKeys("7035647558");
		act.pause(2000).perform();
		ClaimsIntake.ClickBlank2.click();
		act.pause(2000).perform();
		ClaimsIntake.Next.click();
	}

	@Then("Step three Input Insured FN, LN, Policy Num, NOD, Insured complete SSN, CauseOfDeath, DOB, DOB")
	public void step_three_Input_Insured_FN_LN_Policy_Num_NOD_Insured_complete_SSN_CauseOfDeath_DOB_DOB() {
		ClaimsIntake.FName.click();
		ClaimsIntake.FName.sendKeys("Barthon");
		act.pause(2000).perform();
		ClaimsIntake.LName.click();
		ClaimsIntake.LName.sendKeys("Dubois");
		act.pause(2000).perform();
		ClaimsIntake.DOB.click();
		ClaimsIntake.DOB.sendKeys("10041998");
		act.pause(2000).perform();
		ClaimsIntake.DOD.click();
		ClaimsIntake.DOD.sendKeys("11202019");
		act.pause(3000).perform();
		ClaimsIntake.ClickNatureOfDeath.click();
		ClaimsIntake.NaturalCauses.click();
		act.pause(3000).perform();
		ClaimsIntake.clickforcauseofdeath.click();
		ClaimsIntake.Bronchitis.click();
		act.pause(3000).perform();
		ClaimsIntake.PolicyNum.click();
		ClaimsIntake.PolicyNum.sendKeys("4567890");
		act.pause(3000).perform();
		ClaimsIntake.InsuredCompleteSSN.click();
		ClaimsIntake.InsuredCompleteSSN.sendKeys("646200078");
		act.pause(3000).perform();
		ClaimsIntake.Next3.click();
		act.pause(3000).perform();
	}
	
	@Then("Step four Select the Insured was dicorced")
	public void step_four_Select_the_Insured_was_dicorced() {
		ClaimsIntake.Step4Second.click();
		act.pause(3000).perform();
	}

	@Then("input Ex Spouse FN, LN, Date of Divorce, select deceased and input Date of Death")
	public void input_Ex_Spouse_FN_LN_Date_of_Divorce_select_deceased_and_input_Date_of_Death() {
		ClaimsIntake.ExSpouseFN.sendKeys("Julie");
		ClaimsIntake.ExSpouseLN.sendKeys("John");
		act.pause(2000).perform();
		ClaimsIntake.DODivorce.click();
		ClaimsIntake.DODivorce.sendKeys("12102018");
		act.pause(2000).perform();
		ClaimsIntake.IsthispersonDeceasedClick.click();
		act.pause(2000).perform();
		ClaimsIntake.ExDOD.click();
		ClaimsIntake.ExDOD.sendKeys("10122015");
		act.pause(2000).perform();
	}

	@Then("Select add another Ex Spouse, input Ex Spouse FN, LN, Date of  Second Divorce, Date of Death")
	public void select_add_another_Ex_Spouse_input_Ex_Spouse_FN_LN_Date_of_Second_Divorce_Date_of_Death() {
		ClaimsIntake.AddAnotherExSpouse.click();
		act.pause(1000).perform();
		ClaimsIntake.SecondXSpouseFN.sendKeys("Molly");
		ClaimsIntake.SecondXSpouseLn.sendKeys("Smith");
		act.pause(2000).perform();
		ClaimsIntake.SecondXDivorceDate.click();
		ClaimsIntake.SecondXDivorceDate.sendKeys("10192010");
		act.pause(2000).perform();
		ClaimsIntake.SecondXIsthisPersonDeceasedClick.click();
		act.pause(2000).perform();
		ClaimsIntake.SecondXDOD.click();
		ClaimsIntake.SecondXDOD.sendKeys("10182019");
		act.pause(1000).perform();
		ClaimsIntake.Next4.click();
	}
	
	@Then("Step five select yrd first, then select No to fill out all the information")
	public void step_five_select_yrd_first_then_select_No_to_fill_out_all_the_information() {
		act.pause(2000).perform();
		ClaimsIntake.SelectYesFirst.click();
		act.pause(5000).perform();
		ClaimsIntake.SelectNoSecond.click();
		act.pause(2000).perform();
		ClaimsIntake.Step5firstOptionStep4NextRelationshipChild.click();
		ClaimsIntake.NextOfEmail.sendKeys("qapeep512@gmail.com");
		act.pause(1000).perform();
		ClaimsIntake.NextOfFN.sendKeys("Mark");
		ClaimsIntake.NextOfLN.sendKeys("Blanc");
		act.pause(1000).perform();
		ClaimsIntake.NextOfStreet.sendKeys("13 River Rd");
		ClaimsIntake.NextOfCity.sendKeys("Portland");
		act.pause(2000).perform();
		ClaimsIntake.NextOfState.click();
		act.pause(2000).perform();
		ClaimsIntake.NextOfZipCode.click();
		ClaimsIntake.NextOfZipCode.sendKeys("97035");
		act.pause(2000).perform();
		ClaimsIntake.NextOfCountry.click();
		
		ClaimsIntake.NextOfPhone.sendKeys("2026549889");
		act.pause(2000).perform();
		ClaimsIntake.NextForStepFive.click();
	}
	
	@Then("Step six Additional claims Information input opinion and select package to send Information me")
	public void step_six_Additional_claims_Information_input_opinion_and_select_package_to_send_Information_me() {
		act.pause(2000).perform();
		ClaimsIntake.InputOpinion.sendKeys("Automation Test 3");
		act.pause(2000).perform();
		ClaimsIntake.SelectInformantMe.click();
		act.pause(2000).perform();
		ClaimsIntake.SelectPreview.click();
		act.pause(6000).perform();
	}

	@Then("Step seven Summary of selection Click Notes radio button and submit the application")
	public void step_seven_Summary_of_selection_Click_Notes_radio_button_and_submit_the_application() {
//		ClaimsIntake.ClickNoteBtn.click();
//		act.pause(2000).perform();
//		ClaimsIntake.ClickSubmit.click();
		act.pause(5000).perform();
	}
	
}
