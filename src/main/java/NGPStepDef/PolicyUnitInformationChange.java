package NGPStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class PolicyUnitInformationChange extends TestBase{

	@Given("login NGP and select Portfolio")
	public void login_NGP_and_select_Portfolio() {
		NGPPayments.Policy.click();
		act.pause(3000).perform();
		NGPPayments.NGKS122439.click();
		act.pause(3000).perform();
	}

	@When("Select the Information Change on Portfolio")
	public void select_the_Information_Change_on_Portfolio() {
		NGPPayments.InformationChange.click();
		act.pause(3000).perform();
	}
	
	@Then("Select the type of changes on Portfolio")
	public void select_the_type_of_changes_on_Portfolio() {
		NGPPayments.ClickType.click();
		act.pause(3000).perform();
		NGPPayments.UnitInformation.click();
		act.pause(3000).perform();
	}

	@Then("Save the changes on Portfolio")
	public void save_the_changes_on_Portfolio() {
		NGPPayments.SavebuttonforPolicy.click();
		act.pause(3000).perform();
	}
}
