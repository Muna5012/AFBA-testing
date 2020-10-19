package NGPStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class NewClaimIntake extends TestBase {

	@Given("login NGP and select Contacts and input contact Number")
	public void login_NGP_and_select_Contacts_and_input_contact_Number() {
		NGPPayments.Contacts.click();
		act.pause(4000).perform();
		NGPPayments.AARONGARDINER.click();
		act.pause(2000).perform();
	}

	@When("Select New Claim Intake")
	public void select_New_Claim_Intake() {
	
	}

	@Then("Select the reported Date")
	public void select_the_reported_Date() {
	  
	}

	@Then("Select the Relationship to Member option")
	public void select_the_Relationship_to_Member_option() {
	   
	}

	@Then("Input Deceased First Name")
	public void input_Deceased_First_Name() {
	  
	}

	@Then("Input Deceased Last Name")
	public void input_Deceased_Last_Name() {
	  
	}

	@Then("Input Deceased SSN")
	public void input_Deceased_SSN() {
	   
	}

	@Then("Input Deceased Date of Birth")
	public void input_Deceased_Date_of_Birth() {
	
	}

	@Then("Input Deceased DOD")
	public void input_Deceased_DOD() {
	  
	}

	@Then("Select The Cause of Death")
	public void select_The_Cause_of_Death() {
	 
	}

	@Then("Input Notes And Total Coverage in Force")
	public void input_Notes_And_Total_Coverage_in_Force() {
	  
	}

	@Then("Input Basic SSLI Coverage")
	public void input_Basic_SSLI_Coverage() {
	  
	}

	@Then("Input Enhanced SSLI Coverage")
	public void input_Enhanced_SSLI_Coverage() {
	  
	}

	@Then("Input No Cost Paid")
	public void input_No_Cost_Paid() {
	    
	}

	@Then("Input Total Payable By SSLI")
	public void input_Total_Payable_By_SSLI() {
	   
	}

	@Then("Input Unit POC, Unit Address Stress, city, state,ZipCode")
	public void input_Unit_POC_Unit_Address_Stress_city_state_ZipCode() {

	}

}
