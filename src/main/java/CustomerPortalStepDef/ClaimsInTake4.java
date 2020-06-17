package CustomerPortalStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClaimsIntake;
import utilities.TestBase;

public class ClaimsInTake4 extends TestBase{

	@Given("Step two to select more options to relationship Insured")
	public void step_two_to_select_more_options_to_relationship_Insured() {
		ClaimsIntake.Relationship.click();
		act.pause(2000).perform();
		ClaimsIntake.RelationshipExSpouse.click();
	}

	@When("Input first name, last name, Email, country, address, city, state, Zipcode, phone number")
	public void input_first_name_last_name_Email_country_address_city_state_Zipcode_phone_number() {
		act.pause(1000).perform();
		ClaimsIntake.FirstName.sendKeys("Allen");
		ClaimsIntake.LastName.sendKeys("Kerr");
		act.pause(1000).perform();
		ClaimsIntake.Email.sendKeys("qapeep512@gmail.com");
		ClaimsIntake.Country.click();
		act.pause(1000).perform();
		ClaimsIntake.USA.click();
		act.pause(1000).perform();
		ClaimsIntake.Street.sendKeys("Apt 1227 7 River Rd");
		act.pause(1000).perform();
		ClaimsIntake.City.sendKeys("Winchester");
		ClaimsIntake.State.click();
		act.pause(1000).perform();
		ClaimsIntake.ZipCode.click();
		ClaimsIntake.ZipCode.sendKeys("22604");
		ClaimsIntake.Phone.click();
		ClaimsIntake.Phone.sendKeys("7035647558");
		act.pause(2000).perform();
		ClaimsIntake.Next.click();
	}

	@When("Step three Input Insured first name, last name, Policy Num, date of divource, SSN, COD, DOB")
	public void step_three_Input_Insured_first_name_last_name_Policy_Num_date_of_divource_SSN_COD_DOB() {
		ClaimsIntake.FName.sendKeys("Donatella");
		ClaimsIntake.LName.sendKeys("Kerr");
		act.pause(1000).perform();
		ClaimsIntake.PolicyNum.sendKeys("4567890");
		act.pause(1000).perform();
		ClaimsIntake.NaturalCauses.click();
		act.pause(1000).perform();
		ClaimsIntake.InsuredCompleteSSN.sendKeys("646200080");
		ClaimsIntake.Bronchitis.click();
		act.pause(2000).perform();
		ClaimsIntake.DOB.click();
		ClaimsIntake.DOB.sendKeys("11151987");
		act.pause(2000).perform();
		ClaimsIntake.DOD.click();
		ClaimsIntake.DOD.sendKeys("12182010");
		act.pause(2000).perform();
		ClaimsIntake.Next3.click();
		act.pause(2000).perform();
	}

	@Then("Step four select Insured was never married")
	public void step_four_select_Insured_was_never_married() {
		ClaimsIntake.Step4Forth.click();
		act.pause(1000).perform();
		ClaimsIntake.Next4.click();
	}

	@Then("Step five Next of Kin Information select Yes first, then select No to fill out information")
	public void step_five_Next_of_Kin_Information_select_Yes_first_then_select_No_to_fill_out_information() {
		act.pause(2000).perform();
		ClaimsIntake.SelectYesFirst.click();
		act.pause(5000).perform();
		ClaimsIntake.SelectNoSecond.click();
		act.pause(2000).perform();
	}

	@Then("select Next of Kin Relationship, Email, FN, LN, Adress, city, state, zipcode, country, and phone number")
	public void select_Next_of_Kin_Relationship_Email_FN_LN_Adress_city_state_zipcode_country_and_phone_number() {
		ClaimsIntake.Step5firstOptionStep4NextRelationshipChild.click();
		ClaimsIntake.NextOfEmail.sendKeys("qapeep512@gmail.com");
		act.pause(1000).perform();
		ClaimsIntake.NextOfFN.sendKeys("Demitri");
		ClaimsIntake.NextOfLN.sendKeys("Kerr");
		act.pause(1000).perform();
		ClaimsIntake.NextOfStreet.sendKeys("80 River Rd");
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
	
	@Then("Step six to input opinion and select Other on Package be sent")
	public void step_six_to_input_opinion_and_select_Other_on_Package_be_sent() {
		act.pause(2000).perform();
		ClaimsIntake.InputOpinion.sendKeys("Automation Test 4");
		act.pause(2000).perform();
		ClaimsIntake.SelectOther.click();
		act.pause(2000).perform();
	}

	@Then("Input FN, LN, relationship, street, city, state, zipcode and country for other")
	public void input_FN_LN_relationship_street_city_state_zipcode_and_country_for_other() {
		ClaimsIntake.OtherFN.sendKeys("Nathaniel");
		act.pause(1000).perform();
		ClaimsIntake.OtherLN.sendKeys("Jefferson");
		act.pause(2000).perform();
		ClaimsIntake.Otherrelationship.click();
		act.pause(2000).perform();
		ClaimsIntake.OtherAddress.sendKeys("Apt 2 Bayview Shores");
		ClaimsIntake.OtherCity.sendKeys("Charlotte");
		act.pause(2000).perform();
		ClaimsIntake.OtherState.click();
		act.pause(2000).perform();
		ClaimsIntake.OtherZipCode.click();
		ClaimsIntake.OtherZipCode.sendKeys("96915");
		act.pause(2000).perform();
		ClaimsIntake.OtherCountryUS.click();
		act.pause(2000).perform();
		ClaimsIntake.SelectPreview.click();
		act.pause(3000).perform();
	}
	
	@Then("Step seven review all the information, and select Note checking box submit the application")
	public void step_seven_review_all_the_information_and_select_Note_checking_box_submit_the_application() {
		ClaimsIntake.ClickNoteBtn.click();
		act.pause(2000).perform();
		ClaimsIntake.ClickSubmit.click();
		act.pause(5000).perform();
	}


}
