package NGPStepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class ContactsDeceasedChange extends TestBase{

	@When("Select the Deceased Information Change")
	public void select_the_Deceased_Information_Change() {
		NGPPayments.Contacts.click();
		act.pause(3000).perform();
		NGPPayments.MARGUERITEJOHNSON.click();
		act.pause(2000).perform();
	}

	@Then("Select the type of changes information")
	public void select_the_type_of_changes_information() {
		NGPPayments.InformationChange.click();
		act.pause(2000).perform();
		NGPPayments.ClickType.click();
		act.pause(2000).perform();
		NGPPayments.DeceasedInformation.click();
		act.pause(3000).perform();
	}

	@Then("select Date of Death")
	public void select_Date_of_Death() {
		NGPPayments.DOD.sendKeys("12/20/2010");
		act.pause(3000).perform();
	}

	@Then("Save the Changes")
	public void save_the_Changes() {
		NGPPayments.Save.click();
		act.pause(2000).perform();
	}
}
