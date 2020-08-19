package SalesforceChangesforLPStepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesforceChangesforLP;
import utilities.TestBase;

public class AddressChanges extends TestBase {

	@Given("Search the policy Number")
	public void search_the_policy_Number() {
		act.pause(2000).perform();
		SalesforceChangesforLP.Search.sendKeys("1913500382");
		act.pause(4000).perform();
		SalesforceChangesforLP.SearchBtn.click();
		act.pause(3000).perform();
	}

	@When("Select the Owner")
	public void select_the_Owner() {
		SalesforceChangesforLP.SelectContacts002.click();
		act.pause(4000).perform();
		SalesforceChangesforLP.Owner82.click();
		act.pause(3000).perform();
	}
	
	@Then("Select Address Changes request")
	public void select_Address_Changes_request() {
		SalesforceChangesforLP.AddressChangeRequest.click();
		act.pause(3000).perform();
	}
	
//	@Then("Select options Branch Of Service")
//	public void select_options_Branch_Of_Service() {
//		act.pause(2000).perform();
//		driver.switchTo().frame(0);
//		SalesforceChangesforLP.BranchOfService.click();
//		act.pause(2000).perform();
//		SalesforceChangesforLP.UnitedStateArmy.click();
//		act.pause(3000).perform();
//	}
//
//	@Then("Select Rank")
//	public void select_Rank() {
//		//driver.switchTo().frame(0);
//		SalesforceChangesforLP.Rank.click();
//		act.pause(2000).perform();
//		SalesforceChangesforLP.SPCE04.click();
//		act.pause(3000).perform();
//	}
//
//	@Then("Select Duty Status")
//	public void select_Duty_Satatus() {
//		SalesforceChangesforLP.DutyStatus.click();
//		act.pause(2000).perform();
//		SalesforceChangesforLP.Separatee.click();
//		act.pause(3000).perform();
//}

	@Then("Input Address Street")
	public void input_Address_Street() {
		act.pause(3000).perform();
		driver.switchTo().frame(0);
		SalesforceChangesforLP.Address.clear();
		act.pause(2000).perform();
		SalesforceChangesforLP.Address.sendKeys("2388 Carolina Ln 128");
		act.pause(3000).perform();
	}

	@Then("Input City")
	public void input_City() {
		SalesforceChangesforLP.City.clear();
		act.pause(2000).perform();
		SalesforceChangesforLP.City.sendKeys("Burnsville");
		act.pause(3000).perform();
	}

	@Then("Select State")
	public void select_State() {
		act.pause(2000).perform();
		SalesforceChangesforLP.NorthCarolina.click();
		act.pause(3000).perform();
	}

	@Then("Input ZipCode")
	public void input_ZipCode() {
		SalesforceChangesforLP.ZipCode.clear();
		act.pause(2000).perform();
		SalesforceChangesforLP.ZipCode.sendKeys("28714");
		act.pause(3000).perform();
	}
//
//
//	@Then("Input Email Address")
//	public void input_Email_Address() {
//		act.pause(3000).perform();
//		SalesforceChangesforLP.EmailAddress.click();
//		act.pause(3000).perform();
//		SalesforceChangesforLP.EmailAddress.sendKeys("qapeep512@gmail.com");
//
//	}
//
//	@Then("Input Home Email")
//	public void input_Home_Email() {
//		SalesforceChangesforLP.HomeEmail.sendKeys("qapeep19@gmail.com");
//		act.pause(3000).perform();
//	}
//
//	@Then("Input Work Email")
//	public void input_Work_Email() {
//		SalesforceChangesforLP.WorkEmail.sendKeys("qapeep19@gmail.com");
//		act.pause(3000).perform();
//	}
//
//	@Then("Input Other email")
//	public void input_Other_email() {
//		SalesforceChangesforLP.OtherEmail.sendKeys("qapeep19@gmail.com");
//		act.pause(3000).perform();
//	}
//
//	@Then("Input Phone Number")
//	public void input_Phone_Number() {
//		SalesforceChangesforLP.PhoneNumber.clear();
//		act.pause(2000).perform();
//		SalesforceChangesforLP.PhoneNumber.sendKeys("7034567899");
//		act.pause(3000).perform();
//	}
//
//	@Then("Input Home Phone Number")
//	public void input_Home_Phone_Number() {
//		SalesforceChangesforLP.HomePhone.sendKeys("7036547845");
//		act.pause(3000).perform();
//	}
//
//	@Then("Input Mobile Phone")
//	public void input_Mobile_Phone() {
//		SalesforceChangesforLP.MobilePhone.sendKeys("7032569441");
//		act.pause(3000).perform();
//	}
//
//	@Then("Input Other Phone")
//	public void input_Other_Phone() {
//		SalesforceChangesforLP.OtherPhone.sendKeys("7036985669");
//		act.pause(3000).perform();
//	}

	@Then("Submit all the changes")
	public void submit_all_the_changes() {
		SalesforceChangesforLP.Submit.click();
		act.pause(5000).perform();
	}

}
