package NGPStepDef;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class HomePage extends TestBase {

	@Given("login check the Home page")
	public void login_check_the_Home_page() {
	//	NGPPayments.HomePage.click();
		act.pause(4000).perform();
		
		String str1 = NGPPayments.Welcome.getText();
		 System.out.println(str1 + "\n");
		 act.pause(3000).perform();
		 
		 driver.switchTo().frame(0);
		 String str2 = NGPPayments.NGAADSHBOARD.getText();
		 System.out.println(str2 + "\n");
		 act.pause(3000).perform(); 
		 
	}

	@When("Check the reports and select the NGA Contribution Summary")
	public void check_the_reports_and_select_the_NGA_Contribution_Summary() {
		act.pause(3000).perform();
		NGPPayments.NGAContributionSummary.click();
		act.pause(10000).perform();
		NGPPayments.HomePage.click();
		act.pause(3000).perform();
	}

	@Then("Navigate back to Home page and check the NAG Coverage Summary")
	public void navigate_back_to_Home_page_and_check_the_NAG_Coverage_Summary() {
		driver.switchTo().frame(0);
		NGPPayments.NGACoverageSummary.click();
		act.pause(8000).perform();
		NGPPayments.HomePage.click();
		act.pause(3000).perform();
	}

	@Then("Check the data on Payment Method and Frequency SSLI")
	public void check_the_data_on_Payment_Method_and_Frequency_SSLI() {
		driver.switchTo().frame(0);
		NGPPayments.PaymentMethodAndFrequencySSLI.click();
		act.pause(10000).perform();
		NGPPayments.HomePage.click();
		act.pause(3000).perform();
	}

	@Then("Check the data Monthly Billing Summary by Pay Type")
	public void check_the_data_Monthly_Billing_Summary_by_Pay_Type() {
		driver.switchTo().frame(0);
		NGPPayments.MonthlyBillingSummaryByPayType.click();
		act.pause(10000).perform();
		NGPPayments.HomePage.click();
		act.pause(3000).perform();
	}

	@Then("Check the data Inactive Coverages with Payment")
	public void check_the_data_Inactive_Coverages_with_Payment() {
		driver.switchTo().frame(0);
		NGPPayments.InactiveCoverageWithPayment.click();
		act.pause(10000).perform();
		NGPPayments.HomePage.click();
		act.pause(3000).perform();
	}

	@Then("Check the data Refunds by Billing Date")
	public void check_the_data_Refunds_by_Billing_Date() {
		driver.switchTo().frame(0);
		NGPPayments.RefundsByBillingDate.click();
		act.pause(10000).perform();
		NGPPayments.HomePage.click();
		act.pause(3000).perform();
	}

	@Then("Check the data NGP Cases DRAFT")
	public void check_the_data_NGP_Cases_DRAFT() {
		driver.switchTo().frame(0);
		NGPPayments.NGPCasesDRAFT.click();
		act.pause(10000).perform();
		NGPPayments.HomePage.click();
		act.pause(3000).perform();
	}
}
