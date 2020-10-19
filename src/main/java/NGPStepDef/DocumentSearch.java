package NGPStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class DocumentSearch extends TestBase{

	@Given("login NGP and select Documents")
	public void login_NGP_and_select_Documents() {
		NGPPayments.Documents.click();
		act.pause(3000).perform();
	
	}

	@When("Select the Document Type and Create Date to search the Criteria")
	public void select_the_Document_Type_and_Create_Date_to_search_the_Criteria() {
		NGPPayments.Bills.click();
		act.pause(2000).perform();
		NGPPayments.CreatedDate.click();
		act.pause(3000).perform();
		NGPPayments.Search.click();
		act.pause(6000).perform();
	}

	@Then("Select the Document name")
	public void select_the_Document_name() {
		NGPPayments.Select2Name.click();
		act.pause(2000).perform();
		NGPPayments.Select3Name.click();
		act.pause(2000).perform();
		NGPPayments.Select4Name.click();
		act.pause(2000).perform();
		NGPPayments.Select5Name.click();
		act.pause(2000).perform();
	}

	@Then("Print the Document")
	public void print_the_Document() {
		NGPPayments.Print.click();
		act.pause(3000).perform();
	}

	@Then("Select My Account to check the Document prints")
	public void select_My_Account_to_check_the_Document_prints() {
		NGPPayments.SelectMyName.click();
		act.pause(2000).perform();
		NGPPayments.MyAccount.click();
		act.pause(3000).perform();
	}

	@Then("Select the Document Prints")
	public void select_the_Document_Prints() {
		NGPPayments.SelectDocumentPrints.click();
		act.pause(4000).perform();
		NGPPayments.SelectFirstDocumentPrintName.click();
		act.pause(4000).perform();
	}

	@Then("Check the Status of the Document")
	public void check_the_Status_of_the_Document() {
		 String str = NGPPayments.Status.getText();
		 System.out.println(str);
		 act.pause(2000).perform();
		 String str1 = NGPPayments.New.getText();
		 System.out.println(str1);
		 act.pause(3000).perform();
	}

	@Then("Click the Document Print Detail Name to check the detail")
	public void click_the_Document_Print_Detail_Name_to_check_the_detail() {
		NGPPayments.SelectDocumentPrintDetail.click();
		act.pause(4000).perform();
	}
}
