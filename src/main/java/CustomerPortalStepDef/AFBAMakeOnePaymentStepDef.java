package CustomerPortalStepDef;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AFBACustomerPortalMainPage;
import pages.OneTimePayment;
import utilities.TestBase;

public class AFBAMakeOnePaymentStepDef extends TestBase{

	@When("Click Make a One time Payment button on customer portal")
	public void click_Make_a_One_time_Payment_button_on_customer_portal() {
		AFBACustomerPortalMainPage.ClickMakeOneTimePayment.click();
	}

	@Then("Select the Insured name")
	public void select_the_Insured_name() {
		act.pause(2000).perform();
		OneTimePayment.SelectSecond.click();
		act.pause(2000).perform();
//		OneTimePayment.SelectThird.click();
//		act.pause(2000).perform();
	}
	
	@Then("click Next button")
	public void click_Next_button() {
		OneTimePayment.NextBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input Credit Card and CVV numbers")
	public void input_Credit_Card_and_CVV_numbers() {
		OneTimePayment.CreditCardNum.sendKeys("4242424242424242");
		OneTimePayment.CVV.sendKeys("123");
		act.pause(2000).perform();
	}

	@Then("Select Pay Now button")
	public void select_Pay_Now_button() {
		OneTimePayment.PayNowBtn.click();
		act.pause(2000).perform();
	}

	@Then("Select the overal feed backs")
	public void select_the_overal_feed_backs() {
		OneTimePayment.RedFace.click();
		act.pause(2000).perform();
		OneTimePayment.AFBAGreenFace.click();
		act.pause(3000).perform();
	} 
	
	@Then("Input comments")
	public void input_comments() {
		OneTimePayment.Comments.click();
		OneTimePayment.Comments.sendKeys("Automation test 11");
		act.pause(3000).perform();
	}

	@Then("Click Save button")
	public void click_Save_button() {
		OneTimePayment.SaveBotton.click();
		act.pause(3000).perform();
	}
	
	
}
