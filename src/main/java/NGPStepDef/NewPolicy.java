package NGPStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class NewPolicy extends TestBase{

	@Given("login NGP and select Portfolio and create the New Policy")
	public void login_NGP_and_select_Portfolio_and_create_the_New_Policy() {
		NGPPayments.Policy.click();
		act.pause(3000).perform();
		NGPPayments.NewPolicy.click();
		act.pause(2000).perform();
		NGPPayments.NextforNewPolicy.click();
		act.pause(2000).perform();
	}

	@When("Input Policy or Account Number")
	public void input_Policy_or_Account_Number() {
		NGPPayments.PolicyAccount.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Select the Owner for new Policy")
	public void select_the_Owner_for_new_Policy() {
		NGPPayments.SelectOwnerClick.click();
		act.pause(2000).perform();
		NGPPayments.PolicySelectAALIYAHCARTER.click();
		act.pause(2000).perform();
	}

	@Then("Select Insured on the contacts")
	public void select_Insured_on_the_contacts() {
		NGPPayments.SelectInsured.click();
		act.pause(2000).perform();
		NGPPayments.InsuredSelectAALIYAHCARTER.click();
		act.pause(2000).perform();
	}

	@Then("Select the Payor on the contacts")
	public void select_the_Payor_on_the_contacts() {
		NGPPayments.SelectPayor.click();
		act.pause(2000).perform();
		NGPPayments.PayAALIYAHCARTER.click();
		act.pause(2000).perform();
	}

	@Then("Input Product Code")
	public void input_Product_Code() {
		NGPPayments.ProductCode.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Search the Group Details")
	public void search_the_Group_Details() {
		NGPPayments.GroupDetail.click();
		act.pause(2000).perform();
		NGPPayments.SelectNGP.click();
		act.pause(2000).perform();
	}

	@Then("enter Reporting Unit Code")
	public void enter_Reporting_Unit_Code() {
		NGPPayments.ReportingUnitCode.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Search Reporting Unit Detail")
	public void search_Reporting_Unit_Detail() {
		NGPPayments.ReportingUnitDetail.click();
		act.pause(2000).perform();
		NGPPayments.NewReportingUnit.click();
		act.pause(2000).perform();
		NGPPayments.ReportingUnitName.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.UIC.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.GuardState.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.Branch.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.PointOfContact.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.PRN.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.AccountSelect.click();
		act.pause(2000).perform();
		NGPPayments.NGPKS.click();
		act.pause(2000).perform();
		
		NGPPayments.PhoneNum.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.FaxEnter.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.StreetEnter.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.CityEnter.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.StateEnter.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.ZipCodeEnter.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.BusinessEmailEnter.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.PersionalEmail.sendKeys("");
		act.pause(2000).perform();
		
		NGPPayments.SaveNewReportingUnit.click();
		act.pause(2000).perform();
		
	}

	@Then("Select Affiliation Code")
	public void select_Affiliation_Code() {
		NGPPayments.AffiliationCode.click();
		act.pause(2000).perform();
		NGPPayments.ESPPAYROL.click();
		act.pause(2000).perform();
	}

	@Then("Enter Number of Children")
	public void enter_Number_of_Children() {
		NGPPayments.NumberOfChildren.click();
		act.pause(2000).perform();
	}

	@Then("Enter Contact Reason")
	public void enter_Contact_Reason() {
		NGPPayments.ContactReason.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Enter NG Association Fee")
	public void enter_NG_Association_Fee() {
		NGPPayments.NGAssociationFee.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Enter Balance Due")
	public void enter_Balance_Due() {
		NGPPayments.BalanceDue.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Enter Frequency Amount")
	public void enter_Frequency_Amount() {
		NGPPayments.FrequencyAmount.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Enter Annual Premium")
	public void enter_Annual_Premium() {
		NGPPayments.AnnualPremium.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Enter Last Payment")
	public void enter_Last_Payment() {
		NGPPayments.LastPayment.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Enter Suspense")
	public void enter_Suspense() {
		NGPPayments.Suspense.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Payment Frequency")
	public void payment_Frequency() {
		NGPPayments.PaymentFrequency.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Payment Method")
	public void payment_Method() {
		NGPPayments.PaymentMethod.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Enter Paid To Date")
	public void enter_Paid_To_Date() {
		NGPPayments.PaidOfDateInput.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Enter Last Payment Date")
	public void enter_Last_Payment_Date() {
		NGPPayments.LastPaymentDateInput.sendKeys("");
		act.pause(2000).perform();
	}

	@Then("Enter Product Effective Date")
	public void enter_Product_Effective_Date() {
		NGPPayments.SaveNewPolicy.sendKeys("");
		act.pause(2000).perform();
		NGPPayments.SaveNewPolicy.click();
		act.pause(7000).perform();
	}
}
