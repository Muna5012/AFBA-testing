package EappStepDefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp2;
import pages.EAppGroupAssociation;
import utilities.TestBase;

public class GroupAssociationTestStep extends TestBase{

	@When("EApp Home page click the Manage Case button")
	public void eapp_Home_page_click_the_Manage_Case_button() {
		EAppGroupAssociation.ManageCaseButton.click();
		act.pause(1000).perform();
	}

	@Then("Search the case Group Association Test")
	public void search_the_case_Group_Association_Test() {
		EAppGroupAssociation.searchSpace.click();
		EAppGroupAssociation.searchSpace.sendKeys("Group Association Test");
		act.pause(1000).perform();
		EAppGroupAssociation.GroupAssociationtest.click();
		act.pause(2000).perform();
	}

	@Then("Click the New Enrollement button to create new application")
	public void click_the_New_Enrollement_button_to_create_new_application() {
		EAppGroupAssociation.NewEnrollement.click();
		 act.pause(1000).perform();
	
	}

	@Then("Input New Enrollement sponsor SSN, Enrollement city, and state")
	public void input_New_Enrollement_sponsor_SSN_Enrollement_city_and_state() {
		EAppGroupAssociation.SSN.click();
		EAppGroupAssociation.SSN.sendKeys("200210005");
		EAppGroupAssociation.EnrollmentCity.clear();
		EAppGroupAssociation.EnrollmentCity.sendKeys("Falls Church");
		 act.pause(2000).perform();
		 EAppGroupAssociation.VA.click();
		 act.pause(1000).perform();
		 EAppGroupAssociation.NextBtn.click();
		 act.pause(1000).perform();
		// EApp2.ClickNewSponsor.click();
		 
		 EAppGroupAssociation.BeginEnrollment.click();
		 act.pause(2000).perform();
	}

	@Then("Input sponsor first name, last name, DOB, Gender")
	public void input_sponsor_first_name_last_name_DOB_Gender() {
		EAppGroupAssociation.FirstName.sendKeys("Thoms");
		act.pause(1000).perform();
		EAppGroupAssociation.LastName.sendKeys("Waters");
		act.pause(2000).perform();
		EAppGroupAssociation.DOB.click();
		EAppGroupAssociation.DOB.sendKeys("10121985");
		act.pause(1000).perform();
		EAppGroupAssociation.GenderforMale.click();
	}

	@Then("Input Date Joined Group Association Test")
	public void input_Date_Joined_Group_Association_Test() {
		act.pause(1000).perform();
		EAppGroupAssociation.DateJoinedGroupAssociation.click();
		EAppGroupAssociation.DateJoinedGroupAssociation.sendKeys("12152014");
		act.pause(1000).perform();
	}

	@Then("Select Eligibility option")
	public void select_Eligibility_option() {
		act.pause(1000).perform();
		EAppGroupAssociation.Eligibility.click();
		EApp2.BranchOfArmyService.click();
		EApp2.DutyStatus2.click();
		EApp2.RankO6.click();
		act.pause(1000).perform();
	}

	@Then("Input Street address, City, state, and Zip code")
	public void input_Street_address_City_state_and_Zip_code() {
		 EApp2.Street.sendKeys("13 River Rd");
		  EApp2.Street2.sendKeys("Apt 1244");
		  EApp2.City.sendKeys("Atlantic City");
	      EApp2.State.click();
	      EApp2.State.sendKeys("New Jersey");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(2000).perform();
	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("08201");
	      act.pause(1000).perform();
	}

	@Then("Input Email address, phone number")
	public void input_Email_address_phone_number() {
		 EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		 EApp2.Phone.click();
		 EApp2.Phone.sendKeys("7037065961");
		 act.pause(2000).perform();
		 EApp2.ShowCoverageOptions.click();
		 act.pause(1000).perform();
	}
	
	@Then("Select Benefit of Group Association Term")
	public void select_Benefit_of_Group_Association_Term() {
		EAppGroupAssociation.CoveredGroupAssociationTerm.click();
		act.pause(1000).perform();
		EAppGroupAssociation.Age65to69Covered.click();
		act.pause(1000).perform();
	}

	@Then("Click Next button on Qualification, Sponsor Info, Children Info")
	public void click_Next_button_on_Qualification_Sponsor_Info_Children_Info() {
		EAppGroupAssociation.ClickNext.click();
		 act.pause(1000).perform();
			EAppGroupAssociation.ClickNextForSponsorInfo.click();
			 act.pause(1000).perform();
				EAppGroupAssociation.ClickNextForChil.click();
				 act.pause(1000).perform();
					EAppGroupAssociation.ClickNextBeneficiary.click();
					 act.pause(1000).perform();
			 
	}

	@Then("Input Beneficiaries for Group Association Term Sponsor Beneficiary Full name, Relationship, DOB, SSN")
	public void input_Beneficiaries_for_Group_Association_Term_Sponsor_Beneficiary_Full_name_Relationship_DOB_SSN() {
		EAppGroupAssociation.InputSponsorBeneficiaryFN.click();
		EAppGroupAssociation.InputSponsorBeneficiaryFN.sendKeys("Nima Pater");
		act.pause(2000).perform();
		EAppGroupAssociation.InputSponsorBeneficiaryRelationship.click();
		act.pause(2000).perform();
		EAppGroupAssociation.SponsorBeneSSN.click();
		EAppGroupAssociation.SponsorBeneSSN.sendKeys("200210006");
		EAppGroupAssociation.SponsorBenDOB.click();
		EAppGroupAssociation.SponsorBenDOB.sendKeys("11221990");
		act.pause(2000).perform();
		
	}

	@Then("Select Contingent Beneficiary of Sponsor Coverage")
	public void select_Contingent_Beneficiary_of_Sponsor_Coverage() {
		EAppGroupAssociation.ContingentBeneSomeOneElse.click();
		act.pause(1000).perform();

	}

	@Then("Input Sponsor contingent Beneficiary Full name, Relationship, DOB, SSN")
	public void input_Sponsor_contingent_Beneficiary_Full_name_Relationship_DOB_SSN() {
		EAppGroupAssociation.ContingentBeneFN.click();
		EAppGroupAssociation.ContingentBeneFN.sendKeys("Hallen Petter");
		act.pause(2000).perform();
		EAppGroupAssociation.ContingentBeneRelastionship.click();
		act.pause(2000).perform();
		
		EAppGroupAssociation.ContingentBeneSSN.click();
		EAppGroupAssociation.ContingentBeneSSN.sendKeys("200210007");
		EAppGroupAssociation.ContingentBeneDOB.click();
		EAppGroupAssociation.ContingentBeneDOB.sendKeys("10251988");
	    act.pause(2000).perform();
		EApp2.NextBtn6.click();
	}
	
	@Then("Confirmation page select Sining in person")
	public void confirmation_page_select_Sining_in_person() {
		   EApp2.SiginingInPerson.click();
			  act.pause(2000).perform();
	}

	@Then("Click I agree to this coverage and am ready to sign")
	public void click_I_agree_to_this_coverage_and_am_ready_to_sign() {
		EApp2.AgreeToSignInBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Click Review Application Documents to Continue")
	public void click_Review_Application_Documents_to_Continue() {
		EApp2.ReviewApplicationBtn.click();
		act.pause(6000).perform();
		EApp2.CloseBtn.click();
		act.pause(2000).perform();
	}

	@Then("Select to receive life insurance notice and socuments via paper")
	public void select_to_receive_life_insurance_notice_and_socuments_via_paper() {
		 EApp2.PaperBtn.click();
		 act.pause(2000).perform();
	}

	@Then("Input Sponsor Last name and Birth Month and Day")
	public void input_Sponsor_Last_name_and_Birth_Month_and_Day() {
		 EApp2.SponsorLastName.click();	
		 EApp2.SponsorLastName.sendKeys("Waters");
		 act.pause(1000).perform();
		 EAppGroupAssociation.SponsirBMD.click();
		 EAppGroupAssociation.SponsirBMD.sendKeys("1012");
		 act.pause(3000).perform();  
		 EAppGroupAssociation.ClickBtton.click();
		 act.pause(1000).perform();
		 EAppGroupAssociation.SignBtn.click();
			act.pause(3000).perform();
			EAppGroupAssociation.eSignatureBrn.click();
			act.pause(5000).perform();
		 
	}


}
