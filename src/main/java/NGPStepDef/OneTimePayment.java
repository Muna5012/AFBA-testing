package NGPStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class OneTimePayment extends TestBase {

	@Given("login and select Contacts")
	public void login_and_select_Contacts() {
		NGPPayments.Contacts.click();
		act.pause(3000).perform();
		NGPPayments.MARGUERITEJOHNSON.click();
		act.pause(2000).perform();
	}

	@When("Select the Onetime Payment")
	public void select_the_Onetime_Payment() {
		NGPPayments.OnetimePayment.click();
		act.pause(2000).perform();
	}

	@Then("Enter Billing Period")
	public void enter_Billing_Period() {
		NGPPayments.BillingPeriod.click();
		act.pause(2000).perform();
		NGPPayments.Select202006.click();
		act.pause(3000).perform();
	}

	@Then("Select the Payment Type")
	public void select_the_Payment_Type() {
		NGPPayments.PaymentType.click();
		act.pause(2000).perform();
		NGPPayments.SelectDirectCreditCard.click();
		act.pause(3000).perform();
	}

	@Then("Select the Status of Onetime Payment")
	public void select_the_Status_of_Onetime_Payment() {
		NGPPayments.status.click();
		act.pause(2000).perform();
		NGPPayments.NewStatue.click();
		act.pause(3000).perform();
	}

	@Then("Enter Confirmation Number")
	public void enter_Confirmation_Number() {
		NGPPayments.ConfirmationNumber.sendKeys("1234567");
		act.pause(2000).perform();
	}
	
	@Then("Enter Check Number")
	public void enter_Check_Number() {
		NGPPayments.CheckNumber.sendKeys("7654321");
		act.pause(2000).perform(); 
	}

	@Then("Select Settlement Date")
	public void select_Settlement_Date() {
		NGPPayments.Settlementdate.sendKeys("10/25/2018");
		act.pause(2000).perform(); 
	}

	@Then("Enter Transaction Amount")
	public void enter_Transaction_Amount() {
		NGPPayments.TransactionAmount.sendKeys("1");
		act.pause(3000).perform(); 
		NGPPayments.SaveIt.click();
		act.pause(5000).perform();
	}
}
