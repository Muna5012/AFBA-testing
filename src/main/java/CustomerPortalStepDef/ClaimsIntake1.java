package CustomerPortalStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClaimsIntake;
import utilities.TestBase;

public class ClaimsIntake1 extends TestBase{

	@Given("Step two Input First Name, Last Name, Relationship")
	public void step_two_Input_First_Name_Last_Name_Relationship() {
		act.pause(3000).perform();
		ClaimsIntake.FirstName.click();
		ClaimsIntake.FirstName.sendKeys("Kim");
		act.pause(2000).perform();
		ClaimsIntake.LastName.click();
		ClaimsIntake.LastName.sendKeys("Johhy");
		act.pause(3000).perform();
		ClaimsIntake.Relationship.click();
	//	act.pause(2000).perform();
		ClaimsIntake.RelationshipSpouse.click();
	}

	@When("Input Email, Address, City, State, ZipCode, country, and Phone number")
	public void input_Email_Address_City_State_ZipCode_country_and_Phone_number() {
		act.pause(3000).perform();
		ClaimsIntake.Email.click();
		ClaimsIntake.Email.sendKeys("qapeep512@gmail.com");
		act.pause(3000).perform();
		ClaimsIntake.Street.click();
		ClaimsIntake.Street.sendKeys("Apt 5 Bayview Shores");
		act.pause(3000).perform();
		ClaimsIntake.City.click();
		ClaimsIntake.City.sendKeys("Nashville");
		act.pause(3000).perform();
		ClaimsIntake.Stateclick.click();
		ClaimsIntake.State.click();
		act.pause(3000).perform();
		ClaimsIntake.ZipCode.click();
		ClaimsIntake.ZipCode.sendKeys("37201");
		act.pause(3000).perform();
		ClaimsIntake.Country.click();
		ClaimsIntake.USA.click();
		act.pause(3000).perform();
		ClaimsIntake.Phone.click();
		ClaimsIntake.Phone.sendKeys("7035647558");
		act.pause(3000).perform();
		ClaimsIntake.ClickBlank2.click();
		act.pause(3000).perform();
//		ClaimsIntake.ClickBlank.click();
//		act.pause(2000).perform();
		ClaimsIntake.Next.click();
		act.pause(3000).perform();
	}
	
	@Then("Step three Input Insured FN, LN, DOB, DOD, Nature of Death, Cause of Death")
	public void step_three_Input_Insured_FN_LN_DOB_DOD_Nature_of_Death_Cause_of_Death() {
		ClaimsIntake.FName.sendKeys("James");
		act.pause(2000).perform();
		ClaimsIntake.LName.sendKeys("Son");
		act.pause(2000).perform();
		ClaimsIntake.DOB.click();
		ClaimsIntake.DOB.sendKeys("09151978");
		act.pause(3000).perform();
		ClaimsIntake.DOD.click();
		ClaimsIntake.DOD.sendKeys("02152020");
		act.pause(3000).perform();
		ClaimsIntake.Accidental.click();
		act.pause(3000).perform();
		ClaimsIntake.clickforcauseofdeath.click();
		act.pause(3000).perform();
		ClaimsIntake.ClickCauseOfDeath.click();
		ClaimsIntake.CauseOfDeath.click();
		act.pause(3000).perform();
	}

	@Then("select Death Occur outside of the US and select the country")
	public void select_Death_Occur_outside_of_the_US_and_select_the_country() {
		ClaimsIntake.DeathOutsideUS.click();
		act.pause(3000).perform();
		ClaimsIntake.ClickCountry.click();
		ClaimsIntake.Australia.click();
		act.pause(3000).perform();
	}
	
@Then("Input Policy Number and SSN")
public void input_Policy_Number_and_SSN() {
	ClaimsIntake.PolicyNum.sendKeys("123456789");
	act.pause(3000).perform();
	ClaimsIntake.InsuredCompleteSSN.click();
	act.pause(2000).perform();
	ClaimsIntake.InsuredCompleteSSN.sendKeys("454913271");
	act.pause(3000).perform();
//	ClaimsIntake.ClickBlankStep3.click();
//	act.pause(2000).perform();
	ClaimsIntake.Next3.click();
	act.pause(3000).perform();
}
@Then("Step four select Surviving spouse is still living option")
public void step_four_select_Surviving_spouse_is_still_living_option() {
	ClaimsIntake.Step4Third.click();
	act.pause(3000).perform();
}
	
@Then("Input Spouse FN,LN, DOB, SSN and click Next button")
public void input_Spouse_FN_LN_DOB_SSN_and_click_Next_button() {
		act.pause(1000).perform();
		ClaimsIntake.SpouseDOB.click();
		ClaimsIntake.SpouseDOB.sendKeys("09151978");
		act.pause(2000).perform();
		ClaimsIntake.SpouseSSN.click();
		ClaimsIntake.SpouseSSN.sendKeys("226020144");
		act.pause(3000).perform();
//		ClaimsIntake.ClickBlank.click();
//		act.pause(2000).perform();
		ClaimsIntake.Next4Click.click();
		act.pause(3000).perform();
		ClaimsIntake.Next4.click();
	}

@Then("Check step five check the input data and click Next button")
public void check_step_five_check_the_input_data_and_click_Next_button() {
		act.pause(5000).perform();
		ClaimsIntake.Next5.click();
	}

@Then("Step six Enter anything you would like to tell us and select Spouse option")
public void step_six_Enter_anything_you_would_like_to_tell_us_and_select_Spouse_option() {
	act.pause(2000).perform();
		ClaimsIntake.InputOpinion.click();
		ClaimsIntake.InputOpinion.sendKeys("Test one");
		act.pause(2000).perform();
		ClaimsIntake.SelectSpouse.click();
		act.pause(2000).perform();
		ClaimsIntake.SelectPreview.click();
		act.pause(2000).perform();
	
	}


@Then("Click Review button to review all the data and select Note and Submit the application")
public void click_Review_button_to_review_all_the_data_and_select_Note_and_Submit_the_application() {
	act.pause(2000).perform();
	ClaimsIntake.ClickNoteBtn.click();
	act.pause(3000).perform();
	ClaimsIntake.ClickSubmit.click();
	act.pause(3000).perform();
}


}
