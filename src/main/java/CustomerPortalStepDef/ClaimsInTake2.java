package CustomerPortalStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClaimsIntake;
import utilities.TestBase;

public class ClaimsInTake2 extends TestBase{
	
	@Given("Step two Input First Name, Last Name, relationship Insured")
	public void step_two_Input_First_Name_Last_Name_relationship_Insured() {
		act.pause(2000).perform();
		ClaimsIntake.FirstName.click();
		ClaimsIntake.FirstName.sendKeys("NATHAN");
		act.pause(2000).perform();
		ClaimsIntake.LastName.click();
		ClaimsIntake.LastName.sendKeys("ALFSEN");
		act.pause(2000).perform();
		ClaimsIntake.Relationship.click();
		act.pause(2000).perform();
		ClaimsIntake.RelationshipChild.click();
		act.pause(2000).perform();
	}

	@When("Input Email, Address, City, State, ZipCode, Select Country, and Phone")
	public void input_Email_Address_City_State_ZipCode_Select_Country_and_Phone() {
		//act.pause(2000).perform();
		ClaimsIntake.Email.click();
		ClaimsIntake.Email.sendKeys("qapeep512@gmail.com");
		act.pause(2000).perform();
		ClaimsIntake.Street.click();
		ClaimsIntake.Street.sendKeys("1070 Backer Way");
		act.pause(2000).perform();
		ClaimsIntake.City.click();
		ClaimsIntake.City.sendKeys("RENO");
		act.pause(2000).perform();
		ClaimsIntake.State.click();
		ClaimsIntake.StateNevada.click();
		act.pause(2000).perform();
		ClaimsIntake.ZipCode.click();
		ClaimsIntake.ZipCode.sendKeys("89532");
		act.pause(3000).perform();
		ClaimsIntake.Country.click();
		//act.pause(2000).perform();
		ClaimsIntake.USA.click();
		act.pause(2000).perform();
		ClaimsIntake.Phone.click();
		//act.pause(2000).perform();
		ClaimsIntake.Phone.sendKeys("7035647558");
		act.pause(2000).perform();
		ClaimsIntake.ClickBlank2.click();
		act.pause(2000).perform();
		ClaimsIntake.Next.click();
		act.pause(2000).perform();
		
	}

	@When("Step three Input Insured First name, Last name, DOB, DOD, Nature of death and cause of death")
	public void step_three_Input_Insured_First_name_Last_name_DOB_DOD_Nature_of_death_and_cause_of_death() {
		ClaimsIntake.FName.click();
		ClaimsIntake.FName.sendKeys("Leo");
		act.pause(2000).perform();
		ClaimsIntake.LName.click();
		ClaimsIntake.LName.sendKeys("Pugh");
		act.pause(2000).perform();
		ClaimsIntake.DOB.click();
		ClaimsIntake.DOB.sendKeys("02031995");
		act.pause(2000).perform();
		ClaimsIntake.DOD.click();
		ClaimsIntake.DOD.sendKeys("01212020");
		act.pause(2000).perform();
		ClaimsIntake.ClickNatureOfDeath.click();
		ClaimsIntake.Suicide.click();
		act.pause(3000).perform();
		ClaimsIntake.clickforcauseofdeath.click();
		//act.pause(2000).perform();
		ClaimsIntake.GunshotSelfInflicted.click();
		act.pause(3000).perform();
	}
	
	@Then("Input Cinfirmation ID and SSN")
	public void input_Cinfirmation_ID_and_SSN() {
		ClaimsIntake.PolicyNum.click();
		ClaimsIntake.PolicyNum.sendKeys("6541230");
		act.pause(2000).perform();
		ClaimsIntake.InsuredCompleteSSN.click();
		//act.pause(1000).perform();
		ClaimsIntake.InsuredCompleteSSN.sendKeys("646200078");
		act.pause(3000).perform();
		ClaimsIntake.Next3.click();
		act.pause(3000).perform();
	}
	
	@Then("Step four select first option Spouse Predeceased the Insured")
	public void step_four_select_first_option_Spouse_Predeceased_the_Insured() {
		ClaimsIntake.Step4First.click();
		act.pause(3000).perform();
	}


	@Then("Input Deceased spouse FN, LN, DOD")
	public void input_Deceased_spouse_FN_LN_DOD() {
		ClaimsIntake.DeceasedSpouseFN.click();
		ClaimsIntake.DeceasedSpouseFN.sendKeys("Julie");
		act.pause(2000).perform();
		ClaimsIntake.DeceasedSpouseLN.click();
		ClaimsIntake.DeceasedSpouseLN.sendKeys("John");
		act.pause(2000).perform();
		ClaimsIntake.DeceasedSpouseDOD.click();
		ClaimsIntake.DeceasedSpouseDOD.sendKeys("12102018");
		act.pause(2000).perform();
	}

	@Then("Click Add another Deceased spouse")
	public void click_Add_another_Deceased_spouse() {
		ClaimsIntake.AddAnotherDeceasedSpouse.click();
		act.pause(2000).perform();
	}


	@Then("Input second Deceased spouse FN, LN, DOD")
	public void input_second_Deceased_spouse_FN_LN_DOD() {
		ClaimsIntake.SecondDeceasedSpouseFN.click();
		ClaimsIntake.SecondDeceasedSpouseFN.sendKeys("Molly");
		act.pause(2000).perform();
		ClaimsIntake.SecondDeceasedSpouseLN.click();
		ClaimsIntake.SecondDeceasedSpouseLN.sendKeys("Smith");
		act.pause(2000).perform();
		ClaimsIntake.SecondDeceasedSpouseDOD.click();
		ClaimsIntake.SecondDeceasedSpouseDOD.sendKeys("10192010");
		act.pause(2000).perform();
		ClaimsIntake.Next4Click.click();
		act.pause(2000).perform();
		ClaimsIntake.Next4.click();
	}
	
	@Then("Step five select the Yes button to check the information")
	public void step_five_select_the_Yes_button_to_check_the_information() {
		act.pause(2000).perform();
		ClaimsIntake.SelectYesFirst.click();
		act.pause(5000).perform();
	}

	@Then("Select No to input information")
	public void select_No_to_input_information() {
		ClaimsIntake.SelectNoSecond.click();
		act.pause(2000).perform();
	}

	@Then("select Relationship, Email, FN, LN, street, City, State, Zipcode, Country, phone")
	public void select_Relationship_Email_FN_LN_street_City_State_Zipcode_Country_phone() {
		act.pause(1000).perform();
		ClaimsIntake.Step5firstOptionStep4NextRelationship.click();
		ClaimsIntake.Step5firstOptionStep4NextRelationshipChild.click();
		act.pause(3000).perform();
		ClaimsIntake.NextOfEmail.click();
		ClaimsIntake.NextOfEmail.sendKeys("qapeep512@gmail.com");
		act.pause(2000).perform();
		ClaimsIntake.NextOfFN.click();
		ClaimsIntake.NextOfFN.sendKeys("Lawrence");
		act.pause(2000).perform();
		ClaimsIntake.NextOfLN.click();
		ClaimsIntake.NextOfLN.sendKeys("LeBlanc");
		act.pause(2000).perform();
		ClaimsIntake.NextOfStreet.click();
		ClaimsIntake.NextOfStreet.sendKeys("13 River Rd");
		act.pause(2000).perform();
		ClaimsIntake.NextOfCity.click();
		ClaimsIntake.NextOfCity.sendKeys("Portland");
		act.pause(2000).perform();
		ClaimsIntake.NextOfStateClick.click();
		ClaimsIntake.NextOfState.click();
		act.pause(2000).perform();
		ClaimsIntake.NextOfZipCode.click();
		ClaimsIntake.NextOfZipCode.sendKeys("97035");
		act.pause(2000).perform();
		ClaimsIntake.NextofCountryClick.click();
		ClaimsIntake.NextOfCountry.click();
		act.pause(2000).perform();
		ClaimsIntake.NextOfPhone.click();
		ClaimsIntake.NextOfPhone.sendKeys("2026549889");
		act.pause(2000).perform();
		ClaimsIntake.Next5.click();
		act.pause(2000).perform();
	}
	
	@Then("Step six input opinion for this claim")
	public void step_six_input_opinion_for_this_claim() {
		ClaimsIntake.InputOpinion.click();
		ClaimsIntake.InputOpinion.sendKeys("Test Two");
		act.pause(2000).perform();
	}

	@Then("Select Next of Kin option and click Review")
	public void select_Next_of_Kin_option_and_click_Review() {
		ClaimsIntake.SelectNextOf.click();
		act.pause(3000).perform();
		ClaimsIntake.SelectPreview.click();
		act.pause(4000).perform();
	}

	@Then("Check all the data and select Note")
	public void check_all_the_data_and_select_Note() {
		ClaimsIntake.ClickNoteBtn.click();
		act.pause(3000).perform();
	}

	@Then("Submit the application")
	public void submit_the_application() {
		ClaimsIntake.ClickSubmit.click();
		act.pause(5000).perform();
	}
	

}
