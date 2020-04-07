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

	@Then("Select the accounts and click Next button")
	public void select_the_accounts_and_click_Next_button() {
		OneTimePayment.SelectThird.click();
		act.pause(1000).perform();
		OneTimePayment.NextBtn.click();
		act.pause(2000).perform();
	}

	@Then("Input Credit Card and CVV numbers")
	public void input_Credit_Card_and_CVV_numbers() {
		OneTimePayment.CreditCardNum.sendKeys("4111111111111111");
		OneTimePayment.CVV.sendKeys("321");
		act.pause(2000).perform();
	}

	@Then("Select Pay Now button")
	public void select_Pay_Now_button() {
		OneTimePayment.PayNowBtn.click();
		act.pause(2000).perform();
	}

	@Then("Select your overall feed back and comments")
	public void select_your_overall_feed_back_and_comments() {
		OneTimePayment.Greenface.click();
		act.pause(1000).perform();
		OneTimePayment.AFBAGreenFace.click();
		act.pause(1000).perform();
		OneTimePayment.Comments.click();
		OneTimePayment.Comments.sendKeys("Automation test");
		act.pause(2000).perform();
	}

	@Then("get text of your feedback")
	public void get_text_of_your_feedback() {
		  String str = OneTimePayment.GetAlltheText.getText();
		    System.out.println(str + "\n");
			act.pause(1000).perform();
			
			OneTimePayment.SaveBtn.click();
			act.pause(3000).perform();
	}
}
