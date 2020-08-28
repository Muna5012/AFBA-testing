package NGPStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class ContactsAddressChange extends TestBase{

	@Given("login NGP and select Contacts and select the contact person name")
	public void login_NGP_and_select_Contacts_and_select_the_contact_person_name() {
		NGPPayments.Contacts.click();
		act.pause(4000).perform();
		NGPPayments.DEREKTHOMPSON.click();
		act.pause(2000).perform();
	}
	

	@When("Select the Information Change")
	public void select_the_Information_Change() {
		NGPPayments.InformationChange.click();
		act.pause(2000).perform();
	}

	@Then("Select the type of changes")
	public void select_the_type_of_changes() {
		NGPPayments.ClickType.click();
		act.pause(2000).perform();
		NGPPayments.AddressChange.click();
		act.pause(2000).perform();
	}

	@Then("Input Address Line")
	public void input_Address_Line() {
		NGPPayments.AddressLine.clear();
		act.pause(1000).perform();
		NGPPayments.AddressLine.sendKeys("2459 Eisenhower Ave");
		act.pause(3000).perform();
	}

	@Then("Input the City name")
	public void input_the_City_name() {
		NGPPayments.CityInput.clear();
		act.pause(1000).perform();
		NGPPayments.CityInput.sendKeys("Alexandria");
		act.pause(3000).perform();
	}

	@Then("Input State")
	public void input_State() {
		NGPPayments.SatetInput.clear();
		act.pause(1000).perform();
		NGPPayments.SatetInput.sendKeys("VA");
		act.pause(3000).perform();
	}

	@Then("Input Country")
	public void input_Country() {
		NGPPayments.CountryInput.clear();
		act.pause(1000).perform();
		NGPPayments.CountryInput.sendKeys("United States of America");
		act.pause(3000).perform();
	}

	@Then("Input the Zip Code")
	public void input_the_Zip_Code() {
		NGPPayments.InputZipCode.clear();
		act.pause(1000).perform();
		NGPPayments.InputZipCode.sendKeys("22314");
		act.pause(3000).perform();
	}

	@Then("Input Phone Number and Email Address")
	public void input_Phone_Number_and_Email_Address() {
		NGPPayments.InputPhoneNumber.clear();
		act.pause(1000).perform();
		NGPPayments.InputPhoneNumber.sendKeys("7032889972");
		act.pause(3000).perform();
		
		NGPPayments.InputEmail.clear();
		act.pause(1000).perform();
		NGPPayments.InputEmail.sendKeys("qapeep512@gmail.com");
		act.pause(3000).perform();
	}

	@Then("Save all the changes")
	public void save_all_the_changes() {
		NGPPayments.SaveButton.click();
		act.pause(8000).perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
