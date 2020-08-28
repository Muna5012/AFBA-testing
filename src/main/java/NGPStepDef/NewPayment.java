package NGPStepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class NewPayment extends TestBase{
	
	@Given("login NGP and select Payment and create the New PRS")
	public void login_NGP_and_select_Payment_and_create_the_New_PRS() {
		NGPPayments.Payments.click();
		act.pause(5000).perform();
		NGPPayments.NewBtn.click();
		act.pause(3000).perform();
	}

	@When("Input Payment Statement Name")
	public void input_Payment_Statement_Name() {
		NGPPayments.PaymentStatemntName.sendKeys("Test-202008");
		act.pause(3000).perform();
		
	}

	@Then("Select the Account")
	public void select_the_Account() {
		NGPPayments.Accountselect.click();
		act.pause(2000).perform();
		NGPPayments.SelectAccount.click();
		act.pause(3000).perform();
	}

	@Then("Input Pay Period")
	public void input_Pay_Period() {
		NGPPayments.PayPeriodInput.sendKeys("20000");
		act.pause(3000).perform();
	}

	@Then("Input Member Insurance Volume")
	public void input_Member_Insurance_Volume() {
		NGPPayments.MemberInsuranceVolume.sendKeys("$45,326,500.00");
		act.pause(3000).perform();
	}

	@Then("Input Spouse Insurance Volume")
	public void input_Spouse_Insurance_Volume() {
		NGPPayments.SpouseInsuranceVolumeInput.sendKeys("$4,292,300.00");
		act.pause(3000).perform();
	}

	@Then("Input Dependant Insurance Volume")
	public void input_Dependant_Insurance_Volume() {
		NGPPayments.DependantInsuranceVolumeInput.sendKeys("$7,773,000.00");
		act.pause(3000).perform();
	}

	@Then("Input Inforce Contribution")
	public void input_Inforce_Contribution() {
		NGPPayments.InforceContributionInput.sendKeys("$33,207.40");
		act.pause(3000).perform();
	}

	@Then("Input Inforce Member Contribution")
	public void input_Inforce_Member_Contribution() {
		NGPPayments.InforceMemberContributionInput.sendKeys("$00.01");
		act.pause(3000).perform();
	}

	@Then("Input Inforce Spouse Contribution")
	public void input_Inforce_Spouse_Contribution() {
		NGPPayments.forceSpouseContributionInput.sendKeys("$00.002");
		act.pause(3000).perform();
	}

	@Then("Input Inforce Dependent Contribution")
	public void input_Inforce_Dependent_Contribution() {
		NGPPayments.forceDependentContributionInput.sendKeys("$00.003");
		act.pause(3000).perform();
	}

	@Then("Select the Status for the statement")
	public void select_the_Status_for_the_statement() {
		NGPPayments.StatusInput.click();
		act.pause(2000).perform();
		NGPPayments.NewOne.click();
		act.pause(3000).perform();
	}

	@Then("Select the Date and Time")
	public void select_the_Date_and_Time() {
		NGPPayments.Date.click();
		act.pause(2000).perform();
		NGPPayments.Selectdate.click();
		act.pause(3000).perform();
		NGPPayments.Time.click();
		act.pause(2000).perform();
		NGPPayments.Time10AM.click();
		act.pause(3000).perform();
	}

	@Then("Seelct the Processed By")
	public void seelct_the_Processed_By() {
		NGPPayments.ProceessedBy.click();
		act.pause(2000).perform();
		NGPPayments.SelectMuna.click();
		act.pause(3000).perform();
	}

	@Then("Input Member Lives")
	public void input_Member_Lives() {
		NGPPayments.InputMemberLives.sendKeys("1,250");
		act.pause(2000).perform();
	}

	@Then("Input Spouse Lives")
	public void input_Spouse_Lives() {
		NGPPayments.InputSpouseLives.sendKeys("450");
		act.pause(2000).perform();
	}

	@Then("Input Dependent Lives and check the value of the buttom")
	public void input_Dependent_Lives_and_check_the_value_of_the_buttom() {
		NGPPayments.InputDependentLives.sendKeys("860");
		act.pause(2000).perform();
	}

	@Then("Click Save button to save the new PRS")
	public void click_Save_button_to_save_the_new_PRS() {
		NGPPayments.SaveBtn.click();
		act.pause(3000).perform();
	}

	
}