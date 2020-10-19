package NGPStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class ContactsPersonalInformationChange extends TestBase{

	@Given("login NGP and select Contacts and select the contact")
	public void login_NGP_and_select_Contacts_and_select_the_contact() {
		NGPPayments.Contacts.click();
		act.pause(4000).perform();
		NGPPayments.AARONGARDINER.click();
		act.pause(2000).perform();
	}

	@When("Select the Information Change Request button")
	public void select_the_Information_Change_Request_button() {
		NGPPayments.InformationChange.click();
		act.pause(2000).perform();
	}

	@Then("Select the type of changes for Personal Information Change")
	public void select_the_type_of_changes_for_Personal_Information_Change() {
		NGPPayments.ClickType.click();
		act.pause(2000).perform();
		NGPPayments.PersonalInformation.click();
		act.pause(2000).perform();
	}

	@Then("Input First Name")
	public void input_First_Name() {
		NGPPayments.FirstName.clear();
		act.pause(2000).perform();
		NGPPayments.FirstName.sendKeys("Kim");
		act.pause(2000).perform();
	}

	@Then("Input Last Name")
	public void input_Last_Name() {
		NGPPayments.LastName.clear();
		act.pause(2000).perform();
		NGPPayments.LastName.sendKeys("Schulman");
		act.pause(2000).perform();
	}

	@Then("Input Middle Name")
	public void input_Middle_Name() {
		NGPPayments.MiddleName.clear();
		act.pause(2000).perform();
		NGPPayments.MiddleName.sendKeys("M");
		act.pause(2000).perform();  
	}

	@Then("Input Gender, Suffix")
	public void input_Gender_Suffix() {
		NGPPayments.Suffix.sendKeys("Test");
		act.pause(2000).perform();
	}

	@Then("Input DOD ID")
	public void input_DOD_ID() {
		NGPPayments.DODID.sendKeys("123456");
		act.pause(4000).perform();
		NGPPayments.SaveButton.click();
	}

}
