package CustomerPortalStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClaimsIntake;
import utilities.TestBase;

public class ClaimsIntake1 extends TestBase{

	@Given("Step two to select relationship to Insured")
	public void step_two_to_select_relationship_to_Insured() {
		ClaimsIntake.Relationship.click();
		act.pause(2000).perform();
		ClaimsIntake.RelationshipSpouse.click();
	}

	@When("Input First Name, Last Name, Email, Select Country")
	public void input_First_Name_Last_Name_Email_Select_Country() {
		act.pause(1000).perform();
		ClaimsIntake.FirstName.sendKeys("Carl");
		ClaimsIntake.LastName.sendKeys("Jackson");
		act.pause(1000).perform();
		ClaimsIntake.Email.sendKeys("qapeep512@gmail.com");
		ClaimsIntake.Country.click();
		act.pause(1000).perform();
		ClaimsIntake.USA.click();
	}

	@Then("Input Address, City, State, ZipCode, Phone")
	public void input_Address_City_State_ZipCode_Phone() {
		ClaimsIntake.Street.sendKeys("Apt 5 Bayview Shores");
		act.pause(1000).perform();
		ClaimsIntake.City.sendKeys("Nashville");
		ClaimsIntake.State.click();
		act.pause(1000).perform();
		ClaimsIntake.ZipCode.click();
		ClaimsIntake.ZipCode.sendKeys("37201");
		ClaimsIntake.Phone.click();
		ClaimsIntake.Phone.sendKeys("7035647558");
		act.pause(2000).perform();
		ClaimsIntake.Next.click();
	}
	
	@Then("Step three Input Insured First Name, Last Name, Policy Number, Nature of Death, Insured complete SSN")
	public void step_three_Input_Insured_First_Name_Last_Name_Policy_Number_Nature_of_Death_Insured_complete_SSN() {
		ClaimsIntake.FName.sendKeys("James");
		ClaimsIntake.LName.sendKeys("Son");
		act.pause(1000).perform();
		ClaimsIntake.PolicyNum.sendKeys("123456");
		act.pause(1000).perform();
		ClaimsIntake.Accidental.click();
		act.pause(1000).perform();
		ClaimsIntake.InsuredCompleteSSN.sendKeys("646200078");
		ClaimsIntake.CauseOfDeath.click();
		act.pause(2000).perform();
	}

	@Then("Select DOB, and select Death Occur outside of the US")
	public void select_DOB_and_select_Death_Occur_outside_of_the_US() {
		ClaimsIntake.DOB.click();
		ClaimsIntake.DOB.sendKeys("09151978");
		act.pause(2000).perform();
		ClaimsIntake.DOD.click();
		ClaimsIntake.DOD.sendKeys("02152020");
		act.pause(2000).perform();
		ClaimsIntake.Next3.click();
		act.pause(2000).perform();
	}
	
	@Then("Step four select Surviving spouse is still living option")
	public void step_four_select_Surviving_spouse_is_still_living_option() {
		ClaimsIntake.Step4Third.click();
		act.pause(1000).perform();
	}

	@Then("Input Spouse SSN")
	public void input_Spouse_SSN() {
		ClaimsIntake.SpouseSSN.click();
		ClaimsIntake.SpouseSSN.sendKeys("656200079");
		ClaimsIntake.SpouseDOB.click();
		ClaimsIntake.SpouseDOB.sendKeys("09151978");
		act.pause(2000).perform();
		ClaimsIntake.Next4.click();
	}

	@Then("Check step five and click Next button")
	public void check_step_five_and_click_Next_button() {
		act.pause(2000).perform();
		ClaimsIntake.Next5.click();
	}

	@Then("Step six Enter your opinion and select Spouse option")
	public void step_six_Enter_your_opinion_and_select_Spouse_option() {
		ClaimsIntake.InputOpinion.click();
		ClaimsIntake.InputOpinion.sendKeys("Test");
		act.pause(2000).perform();
		ClaimsIntake.SelectSpouse.click();
		ClaimsIntake.SelectPreview.click();
		act.pause(1000).perform();
		ClaimsIntake.ClickNoteBtn.click();
		act.pause(3000).perform();
		ClaimsIntake.ClickSubmit.click();
		act.pause(3000).perform();
	}


}
