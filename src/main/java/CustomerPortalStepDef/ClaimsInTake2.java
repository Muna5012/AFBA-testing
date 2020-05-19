package CustomerPortalStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClaimsIntake;
import utilities.TestBase;

public class ClaimsInTake2 extends TestBase{
	
	@Given("Step two to select Child to relationship Insured")
	public void step_two_to_select_Child_to_relationship_Insured() {
		ClaimsIntake.Relationship.click();
		act.pause(2000).perform();
		ClaimsIntake.RelationshipChild.click();
	}

	@When("Input First Name, Last Name, Email, Select Country, Address, City, State, ZipCode, Phone")
	public void input_First_Name_Last_Name_Email_Select_Country_Address_City_State_ZipCode_Phone() {
		act.pause(1000).perform();
		ClaimsIntake.FirstName.sendKeys("NATHAN");
		ClaimsIntake.LastName.sendKeys("ALFSEN");
		act.pause(1000).perform();
		ClaimsIntake.Email.sendKeys("qapeep512@gmail.com");
		ClaimsIntake.Country.click();
		act.pause(1000).perform();
		ClaimsIntake.USA.click();
		act.pause(1000).perform();
		ClaimsIntake.Street.sendKeys("1070 Backer Way");
		act.pause(1000).perform();
		ClaimsIntake.City.sendKeys("RENO");
		ClaimsIntake.StateNevada.click();
		act.pause(1000).perform();
		ClaimsIntake.ZipCode.click();
		ClaimsIntake.ZipCode.sendKeys("89532");
		ClaimsIntake.Phone.click();
		ClaimsIntake.Phone.sendKeys("7035647558");
		act.pause(2000).perform();
		ClaimsIntake.Next.click();
		
	}

	@When("Step three Input Insured First name, Last name, Policy Num, NOD, Insured complete SSN, COD, DOB, DOB")
	public void step_three_Input_Insured_First_name_Last_name_Policy_Num_NOD_Insured_complete_SSN_COD_DOB_DOB() {
		ClaimsIntake.FName.sendKeys("Leo");
		ClaimsIntake.LName.sendKeys("Pugh");
		act.pause(1000).perform();
		ClaimsIntake.PolicyNum.sendKeys("6541230");
		act.pause(1000).perform();
		ClaimsIntake.Suicide.click();
		act.pause(1000).perform();
		ClaimsIntake.InsuredCompleteSSN.sendKeys("646200078");
		ClaimsIntake.GunshotSelfInflicted.click();
		act.pause(2000).perform();
		ClaimsIntake.DOB.click();
		ClaimsIntake.DOB.sendKeys("02031995");
		act.pause(2000).perform();
		ClaimsIntake.DOD.click();
		ClaimsIntake.DOD.sendKeys("01212020");
		act.pause(2000).perform();
	}
	
	@Then("Select death outside of US, Australia")
	public void select_death_outside_of_US_Australia() {
		ClaimsIntake.DeathOutsideUS.click();
		act.pause(1000).perform();
		ClaimsIntake.Australia.click();
		act.pause(1000).perform();
		ClaimsIntake.Next3.click();
		act.pause(2000).perform();
	}
	
	@Then("Step four select first option Spouse Predeceased the Insured")
	public void step_four_select_first_option_Spouse_Predeceased_the_Insured() {
		ClaimsIntake.Step4First.click();
		act.pause(1000).perform();
	}

	@Then("Input deceased spouse FN, LN, DOD")
	public void input_deceased_spouse_FN_LN_DOD() {
		ClaimsIntake.DeceasedSpouseFN.sendKeys("Julie");
		ClaimsIntake.DeceasedSpouseLN.sendKeys("John");
		act.pause(2000).perform();
		ClaimsIntake.DeceasedSpouseDOD.click();
		ClaimsIntake.DeceasedSpouseDOD.sendKeys("12102018");
		act.pause(2000).perform();
	}

	@Then("Click Add another deceased spouse")
	public void click_Add_another_deceased_spouse() {
		ClaimsIntake.AddAnotherDeceasedSpouse.click();
		act.pause(1000).perform();
	}

	@Then("Input second deceased spouse FN, LN, DOD")
	public void input_second_deceased_spouse_FN_LN_DOD() {
		ClaimsIntake.SecondDeceasedSpouseFN.sendKeys("Molly");
		ClaimsIntake.SecondDeceasedSpouseLN.sendKeys("Smith");
		act.pause(2000).perform();
		ClaimsIntake.SecondDeceasedSpouseDOD.click();
		ClaimsIntake.SecondDeceasedSpouseDOD.sendKeys("10192010");
		act.pause(2000).perform();
		ClaimsIntake.Next4.click();
	}
	
	@Then("Step five Next of Kin Information select option for next of kin same the information select yes")
	public void step_five_Next_of_Kin_Information_select_option_for_next_of_kin_same_the_information_select_yes() {
		ClaimsIntake.SelectYesFirst.click();
		act.pause(5000).perform();
	}

	@Then("Select No")
	public void select_No() {
		ClaimsIntake.SelectNoSecond.click();
		act.pause(2000).perform();
	}

	@Then("select next of relationship, email, FN, LN, street, City, State, Zipcode, Country, phone")
	public void select_next_of_relationship_email_FN_LN_street_City_State_Zipcode_Country_phone() {
		ClaimsIntake.Step5firstOptionStep4NextRelationshipChild.click();
		ClaimsIntake.NextOfEmail.sendKeys("qapeep512@gmail.com");
		act.pause(1000).perform();
		ClaimsIntake.NextOfFN.sendKeys("Lawrence");
		ClaimsIntake.NextOfLN.sendKeys("LeBlanc");
		act.pause(1000).perform();
		ClaimsIntake.NextOfStreet.sendKeys("13 River Rd");
		ClaimsIntake.NextOfCity.sendKeys("Portland");
		act.pause(2000).perform();
		ClaimsIntake.NextOfState.click();
		ClaimsIntake.NextOfZipCode.click();
		ClaimsIntake.NextOfZipCode.sendKeys("97035");
		act.pause(2000).perform();
		ClaimsIntake.NextOfCountry.click();
		ClaimsIntake.NextOfPhone.sendKeys("2026549889");
		act.pause(2000).perform();
		ClaimsIntake.NextForStepFive.click();
	}
	
	@Then("Step six input opinion for this claim")
	public void step_six_input_opinion_for_this_claim() {
		act.pause(2000).perform();
		ClaimsIntake.InputOpinion.sendKeys("Automation Test 2");
	}

	@Then("Select Next of Kin option for package be sent")
	public void select_Next_of_Kin_option_for_package_be_sent() {
		ClaimsIntake.SelectNextOf.click();
		act.pause(2000).perform();
	}

	@Then("Click Review button to move step seven")
	public void click_Review_button_to_move_step_seven() {
		ClaimsIntake.SelectPreview.click();
		act.pause(4000).perform();
	}

	@Then("Click the radio button on Note")
	public void click_the_radio_button_on_Note() {
		ClaimsIntake.ClickNoteBtn.click();
		act.pause(2000).perform();
	}

	@Then("Submit the application")
	public void submit_the_application() {
		ClaimsIntake.ClickSubmit.click();
		act.pause(5000).perform();
	}
	

}
