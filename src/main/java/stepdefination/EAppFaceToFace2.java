package stepdefination;

import org.openqa.selenium.Keys;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EApp1;
import pages.EApp2;
import pages.GoogleLoginPage;
import pages.Remote;
import utilities.TestBase;

public class EAppFaceToFace2 extends TestBase {

	@When("Click Manage cases button")
	public void click_Manage_cases_button() {
		EApp2.Home.click();
		act.pause(2000).perform();
		EApp2.ManageCaseButton.click();	
	}

	@Then("Manage Case Page search to find AFBA case")
	public void manage_Case_Page_search_to_find_AFBA_case() {
		EApp2.searchSpace.click();
		EApp2.searchSpace.sendKeys("IT_QA Automation Face2Face");
	}

	@Then("Select AFBA case")
	public void select_AFBA_case() {
	   EApp2.SearchITQAAutomationFace2Face.click();
	}

	@Then("Create New Enrollment")
	public void create_New_Enrollment() {
		EApp2.NewEnrollement.click();
	}

	@Then("Input valid Sponsor SSN")
	public void input_valid_Sponsor_SSN() {
		EApp2.SSN.click();
		EApp2.SSN.sendKeys("545200032");
	}

	@Then("Input Enrollement State then click Next button")
	public void input_Enrollement_State_then_click_Next_button() {
		EApp2.EnrollmentCity.clear();
		EApp2.EnrollmentCity.sendKeys("Rice");
		act.pause(2000).perform();
		EApp2.EnrollmentState.click();
		act.pause(1000).perform();
	}

	@Then("Click Next Button")
	public void click_Next_Button() {
		  EApp2.NextBtn.click();
	}

	@Then("Click Begin Enrollement Button")
	public void click_Begin_Enrollement_Button() {
		 EApp2.BeginEnrollment.click();
		// EApp2.ClickNewSponsor.click();
	}

	@Then("Input valid Sponsor firstName, lastName, DOB")
	public void input_valid_Sponsor_firstName_lastName_DOB() {
		  EApp2.FirstName.sendKeys("Reba");
		  EApp2.LastName.sendKeys("Hess");
		  act.pause(1000).perform();
		  EApp2.DOB.click();
		  EApp2.DOB.sendKeys("10121982");
	}

	@Then("Click Sponsor gender")
	public void click_Sponsor_gender() {
		EApp2.Gender.click();
	}

	@Then("Select Eligibility, Contribution Mode, BranchOfService, DutyStatus, Rank")
	public void select_Eligibility_Contribution_Mode_BranchOfService_DutyStatus_Rank() {
		EApp2.Eligibility.click();
		EApp2.BranchOfService.click();
		EApp2.DutyStatus.click();
		EApp2.Rank.click();
		EApp2.ContributionMode.click();
		act.pause(1000).perform();
	}

	@Then("Input Department Code and Source Code")
	public void input_Department_Code_and_Source_Code() {
		EApp2.DepartmentCode.sendKeys("AutoTest");
		 EApp2.SourceCode.sendKeys("AT1");
	}

	@Then("Input Sponsor address, Email and contact number")
	public void input_Sponsor_address_Email_and_contact_number() {
		 EApp2.Street.sendKeys("1 River Rd");
		  EApp2.Street2.sendKeys("Apt 1222");
		  EApp2.City.sendKeys("Paris");
	      EApp2.State.click();
	      EApp2.State.sendKeys("Virginia");
	      EApp2.State.sendKeys(Keys.ENTER);
	      act.pause(1000).perform();

	      EApp2.ZipCode.click();
	      EApp2.ZipCode.sendKeys("20130");
		  
//		  EApp2.EmailAddress.sendKeys("qapeep19@gmail.com");
//		  EApp2.ReEmailAddress.sendKeys("qapeep19@gmail.com");
		  EApp2.Phone.click();
		  EApp2.Phone.sendKeys("7037065961");
		  act.pause(2000).perform();
	}

	@Then("Click Show Coverage Options button select benefit plan")
	public void click_Show_Coverage_Options_button_select_benefit_plan() {
		 EApp2.ShowCoverageOptions.click();
	}

	@Then("Select Better Alternative Roy click and selct Options")
	public void select_Better_Alternative_Roy_click_and_selct_Options() {
		  EApp2.NonTobacco.click();
		  act.pause(2000).perform();
	}

	@Then("Click Application for member benefit")
	public void click_Application_for_member_benefit() {
		 EApp2.SponserCoverageOption2.click();
		  act.pause(3000).perform();
	}	

	@Then("Select Application Member Benefit radio button")
	public void select_Application_Member_Benefit_radio_button() {
		  EApp2.spouseCoverage.click();
		  act.pause(2000).perform();
		   EApp2.Covered.click();
		   act.pause(2000).perform();
	}

	@Then("click Next button")
	public void click_Next_button() {
		EApp2.FedTerm.click();
		EApp2.WaiveFedTerm.click();
		act.pause(2000).perform();
		EApp2.ClickFirstProtect.click();
		EApp2.WaiveFirstProtect.click();
		act.pause(2000).perform();
		EApp2.NextBtn1.click();
	}

	@Then("Click Answer No to All Questions one click button")
	public void click_Answer_No_to_All_Questions_one_click_button() {
		 EApp2.AnswerNOAll.click();
		  act.pause(2000).perform();
	}

	@Then("Click Next button for next page")
	public void click_Next_button_for_next_page() {
		 EApp2.NextBtn2.click();
	}

	@Then("Input Sponser height feet inches")
	public void input_Sponser_height_feet_inches() {
		EApp2.HeightOption.click();
	    EApp2.HeightInchesOption.click();
	}

	@Then("input weight and click Next button")
	public void input_weight_and_click_Next_button() {
		  act.pause(1000).perform();
		    EApp2.Weight.click();
		    EApp2.Weight.sendKeys("130");
		    EApp2.NextBtn3.click();
	}

	@Then("Click Next button for Spouse or child information")
	public void click_Next_button_for_Spouse_or_child_information() {
		EApp2.NextBtn3.click();
	}
	
	@Then("Input Primary Beneficiaries for Better Alternative Sponsor FullName")
	public void input_Primary_Beneficiaries_for_Better_Alternative_Sponsor_FullName() {
	   EApp2.PrimaryBenficiaryFullName.sendKeys("Lena Best");
	}

	@Then("Input Primary BeneficiarySSN")
	public void input_Primary_BeneficiarySSN() {
	    EApp2.PrimaryBeneficiarySSN.click();
	    EApp2.PrimaryBeneficiarySSN.sendKeys("545200033");
	}

	@Then("Select Primary Beneficiary Relationship")
	public void select_Primary_Beneficiary_Relationship() {
	  EApp2.PrimaryBeneficiaryRelationship.click();
	}

	@Then("Input Primary Beneficiary DOB")
	public void input_Primary_Beneficiary_DOB() {
		  EApp2.PrimaryBeneficiaryDOB.click();
		    EApp2.PrimaryBeneficiaryDOB.sendKeys("04101942");
		    act.pause(2000).perform();
	}

	@Then("Click someone else to add more contingent beneficiary")
	public void click_someone_else_to_add_more_contingent_beneficiary() {
	    EApp2.SomeoneElsee.click();
	    act.pause(1000).perform();
	}

	@Then("Input Contingent Beneficiary FullName")
	public void input_Contingent_Beneficiary_FullName() {
	  EApp2.ContingentBeneficiaryFullName.sendKeys("Mayo Snow");
	}

	@Then("Input Contingent Beneficiary SSN")
	public void input_Contingent_Beneficiary_SSN() {
	    EApp2.ContingentBeneficiarySSNnumber.click();
	    EApp2.ContingentBeneficiarySSNnumber.sendKeys("545200034");
	}

	@Then("Select Contingent Beneficiary Relationship option")
	public void select_Contingent_Beneficiary_Relationship_option() {
		EApp2.ContingentBeneficiaryRelationship.click();
	}
	
	@Then("Contingent Beneficiary DOB")
	public void contingent_Beneficiary_DOB() {
	 //  EApp2.ContingentBeneficiaryDOB.click();
	   EApp2.ContingentBeneficiaryDOB.sendKeys("2211964");
	   act.pause(1000).perform();
	}
	
	@Then("Input Second Primary Beneficiary FullName")
	public void input_Second_Primary_Beneficiary_FullName() {
	   EApp2.SecondPrmaryBenFullName.sendKeys("Art Gill");
	}

	@Then("Input Second Primary Beneficiary SSN")
	public void input_Second_Primary_Beneficiary_SSN() {
	  EApp2.SecondPrimaryBenfSSN.click();
	  EApp2.SecondPrimaryBenfSSN.sendKeys("545200035");
	}

	@Then("Select Second Primary Beneficiary Relationship option")
	public void select_Second_Primary_Beneficiary_Relationship_option() {
	    EApp2.SecondPrimaryBenRelationship.click();    
	}

	@Then("Input Second Primary Beneficiary DOB")
	public void input_Second_Primary_Beneficiary_DOB() {
	    EApp2.SecondPrimaryBenfDOB.click();
	    EApp2.SecondPrimaryBenfDOB.sendKeys("12251970");
	    act.pause(2000).perform();
	}
	
	@Then("click someone else for second contingent beneficiary")
	public void click_someone_else_for_second_contingent_beneficiary() {
	    EApp2.secondSomeOneElse.click();
	    act.pause(3000).perform();
	}

	@Then("Input Second Contingent Beneficiary FullName")
	public void input_Second_Contingent_Beneficiary_FullName() {
	  EApp2.SecondContingentBeneficiaryFullName.sendKeys("Vin Webb");
	}

	@Then("Input second Contingent Beneficiary SSN")
	public void input_second_Contingent_Beneficiary_SSN() {
	   EApp2.SecondContingentBeneficiarySSN.click();
	   EApp2.SecondContingentBeneficiarySSN.sendKeys("545200036");
	}

	@Then("Select Second Contigent Beneficiary Relationship")
	public void select_Second_Contigent_Beneficiary_Relationship() {
	   EApp2.SecondContingentBeneficiaryRelationship.click();
	   act.pause(1000).perform();
	}

	@Then("Input Second Contingent Beneficiary DOB")
	public void input_Second_Contingent_Beneficiary_DOB() {
	   EApp2.SecondContingentBeneficiaryDOB.click();
	   EApp2.SecondContingentBeneficiaryDOB.sendKeys("1211937");
	   act.pause(2000).perform();
	}

	@Then("Click Next for Confirmation page")
	public void click_Next_for_Confirmation_page() {
	   EApp2.NextBtn6.click();
	}

	@Then("Click Signing in person button")
	public void click_Signing_in_person_button() {
		  act.pause(2000).perform();
		EApp2.EmailSummary.click();
		act.pause(1000).perform();
		EApp2.EmailSummaryConfirm1.sendKeys("qapeep512@gmail.com");
		EApp2.EmailSummaryConfirm2.sendKeys("qapeep512@gmail.com");
		
		EApp1.AcknowledgeofPayment.click();
	  EApp2.SiginingViaEmail.click();
	  act.pause(2000).perform();
	  EApp2.EnterEmailOne.clear();
	  EApp2.EnterEmailOne.sendKeys("qapeep512@gmail.com");
	  EApp2.EnterEmailTwo.clear();
	  EApp2.EnterEmailTwo.sendKeys("qapeep512@gmail.com");
	  act.pause(1000).perform();
	  EApp2.SubmitEmailForsignatureBtn.click();
	  act.pause(7000).perform();  
	}

	@Then("Sign in Google login Email account")
	public void sign_in_Google_login_Email_account() {
		 driver.get("https://www.google.com");
		  GoogleLoginPage.SignIn.click();  
		  
	}

	@Then("Input Email login address and click Next button")
	public void input_Email_login_address_and_click_Next_button() {
		 GoogleLoginPage.InputEmail.sendKeys("qapeep512@gmail.com");
			GoogleLoginPage.Next.click();	
			act.pause(2000).perform();
	}

	@Then("Input Email Password to click Next button")
	public void input_Email_Password_to_click_Next_button() {
		GoogleLoginPage.InputPassword.sendKeys("Muna@5012");
		GoogleLoginPage.Next.click();
		act.pause(4000).perform();
		
	}

	@Then("Click InBox on Google account and Select first Email")
	public void click_InBox_on_Google_account_and_Select_first_Email() {
		Remote.ClickSelect.click();
		act.pause(1000).perform();
		Remote.ClickEmail.click();
		act.pause(2000).perform();
		//Remote.ClickInbox.click();
		Remote.SelectFirstEmail.click();
		act.pause(2000).perform();
	}

	@Then("Click Review Application Button to signin")
	public void click_Review_Application_Button_to_signin() {
		act.pause(2000).perform();
		GoogleLoginPage.ReviewApplicationBtn.click();
		
		act.pause(2000).perform();
		java.util.Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String handle1 : driver.getWindowHandles()) {
               System.out.println(handle1);
               driver.switchTo().window(handle1);
        }
	}

	@Then("Input Last Name and Last four SSN number")
	public void input_Last_Name_and_Last_four_SSN_number() {
		GoogleLoginPage.LastName.sendKeys("Hess");
		GoogleLoginPage.LastSSN.sendKeys("0032");
		
	}

	@Then("Click Review and Sign My Application button to confirm")
	public void click_Review_and_Sign_My_Application_button_to_confirm() {
		GoogleLoginPage.ReviewAndSignMyApplication.click();
		act.pause(3000).perform();
	}

	@Then("Click Review Application Ducuments Button to review all the Application")
	public void click_Review_Application_Ducuments_Button_to_review_all_the_Application() {
		GoogleLoginPage.ReviewApplicationDocumentBtn.click();
		   act.pause(6000).perform();
		   GoogleLoginPage.CloseBtn.click();
		   act.pause(2000).perform();
	}

	@Then("Input Sponsor Last Name")
	public void input_Sponsor_Last_Name() {
		 GoogleLoginPage.SponsorLastName.sendKeys("Pakst");
		   GoogleLoginPage.verifySSN.click();
			 act.pause(2000).perform();
			 GoogleLoginPage.SponsorLastName.clear();
			 GoogleLoginPage.SponsorLastName.click();	
			 GoogleLoginPage.SponsorLastName.sendKeys("Hess");
	
	}

	@Then("Input Sponsor last four SSN")
	public void input_Sponsor_last_four_SSN() {
		 GoogleLoginPage.SponsorLastSSN.sendKeys("0032");
		 GoogleLoginPage.verifySSN.click();
			act.pause(2000).perform();
			GoogleLoginPage.SponsorLastSSN.clear();
			GoogleLoginPage.SponsorLastSSN.click();
			GoogleLoginPage.SponsorLastSSN.sendKeys("0032");
	}

	@Then("Select Paper Option for receive the Documents and Signin")
	public void select_Paper_Option_for_receive_the_Documents_and_Signin() {
		GoogleLoginPage.PaperBtn.click();
		act.pause(2000).perform();
		GoogleLoginPage.SignBtn.click();
		act.pause(3000).perform();
	}



}
