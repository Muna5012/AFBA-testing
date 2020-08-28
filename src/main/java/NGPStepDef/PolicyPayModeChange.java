package NGPStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class PolicyPayModeChange extends TestBase{

	@Given("login NGP and select Policy")
	public void login_NGP_and_select_Policy() {
		NGPPayments.Policy.click();
		act.pause(3000).perform();
		NGPPayments.NGKS122444.click();
		act.pause(3000).perform();
	}

	@When("Select the Information Change on Policy")
	public void select_the_Information_Change_on_Policy() {
		NGPPayments.InformationChange.click();
		act.pause(2000).perform();
	}

	@Then("Select the type of changes on Policy")
	public void select_the_type_of_changes_on_Policy() {
		NGPPayments.SelectTypes.click();
		act.pause(2000).perform();
		NGPPayments.PayModeInformationChange.click();
		act.pause(2000).perform();
	}
	
	@Then("Select Payment Method")
	public void select_Payment_Method() {
		NGPPayments.NGAAllotment.click();
		act.pause(3000).perform(); 
		NGPPayments.SavebuttonforPolicy.click();
		act.pause(6000).perform(); 
		
	}
}
