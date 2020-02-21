package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import utilities.TestBase;

public class EAppProductionPausing extends TestBase {

	@When("Click Manage Cases button and Search case and create new Case")
	public void click_Manage_Cases_button_and_Search_case_and_create_new_Case() {
		EApp2.ManageCaseButton.click();
		 EApp2.searchSpace.click();
		  EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
			act.pause(1000).perform();
		    EApp2.SearchITQAAutomationFace2Face.click();
		    EApp2.NewEnrollement.click();
	}

	@When("Input Sponsor SSN, Enrollment city and state and click Begin Enrollement button")
	public void input_Sponsor_SSN_Enrollment_city_and_state_and_click_Begin_Enrollement_button() {
		 act.pause(1000).perform();
		 EApp2.SSN.click();
		  EApp2.SSN.sendKeys("545200095");
		  EApp2.EnrollmentCity.clear();
		  EApp2.EnrollmentCity.sendKeys("Durham");
		  act.pause(2000).perform();
		  EApp2.NC.click();
		  act.pause(1000).perform();
		  EApp2.NextBtn.click();
         EApp2.BeginEnrollment.click();
	//	  EApp2.ClickNewSponsor.click();
	}

	@Then("Input sponsor first name, last name, gender and DOB")
	public void input_sponsor_first_name_last_name_gender_and_DOB() {
		 EApp2.FirstName.sendKeys("Aaton");
		    EApp2.LastName.sendKeys("Smith");
		    act.pause(1000).perform();
		    EApp2.DOB.click();
		    EApp2.DOB.sendKeys("05111988");
			EApp2.GenderforMale.click();
	}

	@Then("Select Eligibility, Branch of Service, Duty Status, Contribution Mode, Department code and Source code")
	public void select_Eligibility_Branch_of_Service_Duty_Status_Contribution_Mode_Department_code_and_Source_code() {
		 EApp2.Eligibility.click();
		  EApp2.BranchOfArmyService.click();
		  EApp2.DutyStatus2.click();
		   EApp2.RankO9.click();
		   act.pause(1000).perform();
		   EApp2.ContributionMode.click();
		   act.pause(2000).perform();
			EApp2.DepartmentCode.sendKeys("AutoTest");
		    EApp2.SourceCode.sendKeys("ATWINTER");
		    act.pause(1000).perform();
	}

	@Then("Input street address, city and zip code, Email address And phone number")
	public void input_street_address_city_and_zip_code_Email_address_And_phone_number() {
		  EApp2.Street.sendKeys("18 River Rd");
		  EApp2.Street2.sendKeys("Apt 1569");
		  EApp2.City.sendKeys("LAs Vegas");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Nevada");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("89158");
	      EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
			 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
			 act.pause(2000).perform();
			 EApp2.Phone.click();
			 EApp2.Phone.sendKeys("7037065961");
			 act.pause(4000).perform();
	}

	@Then("click Save for later button and Pause enrollment")
	public void click_Save_for_later_button_and_Pause_enrollment() {
		 EApp2.ClickSaveForLater.click();
		 act.pause(3000).perform();
		 EApp2.ClickPauseEnrollementBtn.click();
		 act.pause(7000).perform();
	}

}
