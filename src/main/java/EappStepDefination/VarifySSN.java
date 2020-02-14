package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class VarifySSN extends TestBase {

	@Given("Click Manage Cases button to Search case")
	public void click_Manage_Cases_button_to_Search_case() {
		 EApp2.ManageCaseButton.click();
		 EApp2.searchSpace.click();
		 EApp2.searchSpace.sendKeys("IT_QA Automation Call Center");
	     act.pause(1000).perform();
		 EApp2.SearchITAutomationCallCenter.click();
	}

	@When("click New Enrollment button to create case")
	public void click_New_Enrollment_button_to_create_case() {
		EApp2.NewEnrollement.click();
		act.pause(1000).perform();
	}

	@Then("Input valid Sponsor SSN, Enrollment city and state")
	public void input_valid_Sponsor_SSN_Enrollment_city_and_state() {
		EApp2.SSN.click();
		 EApp2.SSN.sendKeys("000000000");
		 EApp2.EnrollmentCity.clear();
		 EApp2.EnrollmentCity.sendKeys("Washington");
		  act.pause(2000).perform();
		  EApp2.DC.click();
		  act.pause(1000).perform();
		  EApp2.NextBtn.click();
		  EApp2.SSN.click();
		  act.pause(1000).perform();
		  EApp2.SSN.clear();
		  act.pause(2000).perform();
		   EApp2.SSN.sendKeys("545200083");
		   act.pause(1000).perform();
			EApp2.NextBtn.click();
		  
	}

	@Then("Click Begin Enrollment to create new sponsor")
	public void click_Begin_Enrollment_to_create_new_sponsor() {
		   EApp2.BeginEnrollment.click();
	       // EApp2.ClickNewSponsor.click();
	}

	@Then("Input Sponsor First Name, Last Name, DOB")
	public void input_Sponsor_First_Name_Last_Name_DOB() {
	    EApp2.FirstName.sendKeys("JOSHUA");
	    EApp2.LastName.sendKeys("SCOTT");
	    act.pause(1000).perform();
	    EApp2.DOB.click();
	    EApp2.DOB.sendKeys("09051987");
		EApp2.GenderforMale.click();
	}

	@Then("Select Gender")
	public void select_Gender() {
		EApp2.GenderforMale.click();
		act.pause(1000).perform();
	}

	@Then("Click Married radio button")
	public void click_Married_radio_button() {
		 EApp2.MarriedBtn.click();
	}

	@Then("input Spouse First Name, Last Name and DOB")
	public void input_Spouse_First_Name_Last_Name_and_DOB() {
		 EApp2.SpouseFN.sendKeys("Alice");
		 EApp2.SpouseLN.sendKeys("LeBlanc");
		 act.pause(1000).perform();
		 EApp2.SpouseDOB.click();
		 EApp2.SpouseDOB.sendKeys("11221988");
		 act.pause(1000).perform();
	}

	@Then("Select Eligibility, Branch Of Service, Duty Status, Rank and Contribution Mode")
	public void select_Eligibility_Branch_Of_Service_Duty_Status_Rank_and_Contribution_Mode() {
		EApp2.Eligibility.click();
		EApp2.BranchOfArmyService.click();
		EApp2.DutyStatus2.click();
		act.pause(1000).perform();
		EApp2.RankO6.click();
		 EApp2.ContributionMode.click();
		 act.pause(2000).perform();
	}

	@Then("Enter Department Code, Source Code")
	public void enter_Department_Code_Source_Code() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
		EApp2.SourceCode.sendKeys("ATWINTER");
	}
	
	@Then("Input Stress address, City, State and Zip Code")
	public void input_Stress_address_City_State_and_Zip_Code() {
		  EApp2.Street.sendKeys("17th St NW");
		  EApp2.Street2.sendKeys("1910");
		//  EApp2.City.sendKeys("Washington");
	      EApp2.State.click();
	      EApp2.State.sendKeys("DC");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(2000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("20009");
	      act.pause(2000).perform();
	      EApp2.City.sendKeys("Washington");
	      act.pause(1000).perform();
	}

	@Then("Input Email address and enter second Email address for confirmation")
	public void input_Email_address_and_enter_second_Email_address_for_confirmation() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 act.pause(1000).perform();
		// EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		
	}

	@Then("Input Daytime Phone number")
	public void input_Daytime_Phone_number() {
		 EApp2.Phone.click();
		 EApp2.Phone.sendKeys("7037065961");
		 act.pause(2000).perform();
	}

	@Then("Click Show coverage Options")
	public void click_Show_coverage_Options() {
	//	 EApp2.ShowCoverageOptions.click();
	//	 act.pause(1000).perform();
		 EApp2.ReEmailAddress.click();
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 act.pause(2000).perform();
		 EApp2.ShowCoverageOptions.click();
	}

}
