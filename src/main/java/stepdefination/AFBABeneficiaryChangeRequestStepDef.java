package stepdefination;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AFBACustomerPortalMainPage;
import pages.AFBAMemberPortalLoginPage;
import pages.NewRequest1;
import utilities.TestBase;

public class AFBABeneficiaryChangeRequestStepDef extends TestBase {

	@Given("Input Username, Password and click Login to Login account")
	public void input_Username_Password_and_click_Login_to_Login_account() {
		AFBAMemberPortalLoginPage.UserNameforLogin.sendKeys("qapeep512@gmail.com");
		AFBAMemberPortalLoginPage.PasswordforLogin.click();
		AFBAMemberPortalLoginPage.PasswordforLogin.sendKeys("Q85q2019");
		AFBAMemberPortalLoginPage.LoginBtnforLoginPage.click();
		act.pause(2000).perform();
	}

	@When("Click Request Beneficiary Change links")
	public void click_Request_Beneficiary_Change_links() {
		NewRequest1.ClickRequestBeneficiaryChange.click();
		act.pause(3000).perform();
	}

	@Then("Get title of Beneficiary Change Request and Member fullname")
	public void get_title_of_Beneficiary_Change_Request_and_Member_fullname() {
		String str = NewRequest1.GetTextOfBeneficiaryChangeRequest.getText();
		System.out.println(str);
		act.pause(2000).perform();
		String str1 = NewRequest1.GetTextOfMemberName.getText();
		System.out.println(str1+"\n");
		act.pause(2000).perform();
	}

	@Then("Get text of bule line noties")
	public void get_text_of_bule_line_noties() {
		String str = NewRequest1.GetTextOfBeneficiaryRequest.getText();
		System.out.println(str+": ");
		act.pause(2000).perform();
		String str1 = NewRequest1.GetTextOfBlueLineNoties.getText();
		System.out.println(str1+"\n");
		act.pause(2000).perform();
	}

	
	@Then("Click New Request button")
	public void click_New_Request_button() {
		NewRequest1.NewRequestBtn.click();
		act.pause(2000).perform();
	}

	@Then("Get text of all the Step one Instructions notes")
	public void get_text_of_all_the_Step_one_Instructions_notes() {
		String str = NewRequest1.GetTextOfStepOneInstructions.getText();
		System.out.println(str+" :"+ "\n");
		act.pause(2000).perform();
		String str1 = NewRequest1.GetTextOfAllTheNotes.getText();
		System.out.println(str1+"\n");
		act.pause(2000).perform();
		
		String parentHandle = driver.getWindowHandle(); 
		AFBACustomerPortalMainPage.ClickQuestionMark.click();

		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); 
		}
		driver.switchTo().window(parentHandle);
		act.pause(4000).perform();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,2000)");
		 act.pause(1000).perform();
		
		AFBACustomerPortalMainPage.ClickXtoClose.click();
		act.pause(2000).perform();
	}

	@Then("Click Next button to move step two Select Accounts")
	public void click_Next_button_to_move_step_two_Select_Accounts() {
		NewRequest1.NextBtn.click();
		act.pause(2000).perform();
	}
	
	@Then("Get text of Notes for step two")
	public void get_text_of_Notes_for_step_two() {
		String str = NewRequest1.GetTextOfStep2SelectAccount.getText();
		System.out.println("\n"+str+" :");
		act.pause(2000).perform();
		String str2 = NewRequest1.GetTextOfStep2blueLineExplation.getText();
		System.out.println(str2+" :"+ "\n");
		act.pause(2000).perform();
	}

	@Then("Get text of Policy Number, Insured, Coverage Amount")
	public void get_text_of_Policy_Number_Insured_Coverage_Amount() {
		String str = NewRequest1.GettextOfPolicyNumber.getText();
		String str2 = NewRequest1.GetTextOfInsured.getText();
		String str3 = NewRequest1.GetTextOfCoverageAmount.getText();
		System.out.println(str+" "+ str2+"      "+str3);
		act.pause(2000).perform();
	}

	@Then("Get text of first policy account number, Insured full name and Coverage amount of money and select it")
	public void get_text_of_first_policy_account_number_Insured_full_name_and_Coverage_amount_of_money_and_select_it() {
	   String str = NewRequest1.GetTextOfFirstPolicyNumber.getText();
	   String str2 = NewRequest1.GetTextOfFirstInsuredFullName.getText();
	   String str3 = NewRequest1.GetTextOfFirstCoverageAmountNumber.getText();
	   System.out.println(str+"    "+str2+"    "+str3);
	   act.pause(2000).perform();
	   NewRequest1.RadioBtn.click();
	   
	}

	@Then("Get text of second policy account number, Insured full name and Coverage amount of money and select it")
	public void get_text_of_second_policy_account_number_Insured_full_name_and_Coverage_amount_of_money_and_select_it() {
		String str = NewRequest1.GetTextOfSecondPolicyNumber.getText();
		   String str2 = NewRequest1.GetTextOfSecondInsuredFullName.getText();
		   String str3 = NewRequest1.GetTextOfSecondCoverageAmountNumber.getText();
		   System.out.println(str+"    "+str2+"    "+str3);
		   act.pause(2000).perform();
		 
	}

	@Then("Get text of third policy account number, Insured full name and Coverage amount of money and select it")
	public void get_text_of_third_policy_account_number_Insured_full_name_and_Coverage_amount_of_money_and_select_it() {
		String str = NewRequest1.GetTextOfThirdPolicyNumber.getText();
		   String str2 = NewRequest1.GetTextOfThirdInsuredFullName.getText();
		   String str3 = NewRequest1.GetTextOfThirdCoverageAmountNumber.getText();
		   System.out.println(str+"    "+str2+"    "+str3);
		   act.pause(2000).perform();
	}

	@Then("Get text of fourth policy account number, Insured full name and Coverage amount of money and select it")
	public void get_text_of_fourth_policy_account_number_Insured_full_name_and_Coverage_amount_of_money_and_select_it() {
		String str = NewRequest1.GetTextOfFourthPolicyNumber.getText();
		   String str2 = NewRequest1.GetTextOfFourthInsuredFullName.getText();
		   String str3 = NewRequest1.GetTextOfFourthCoverageAmountNumber.getText();
		   System.out.println(str+"    "+str2+"    "+str3);
		   act.pause(2000).perform();
	}

	@Then("Get text of fifth policy account number, Insured full name and Coverage amount of money and select it")
	public void get_text_of_fifth_policy_account_number_Insured_full_name_and_Coverage_amount_of_money_and_select_it() {
	    String str = NewRequest1.GetTextOfFifthPolicyNumber.getText();
		   String str2 = NewRequest1.GetTextOfFifthInsuredFullName.getText();
		   String str3 = NewRequest1.GetTextOfFifthCoverageAmountNumber.getText();
		   System.out.println(str+"    "+str2+"    "+str3 +"\n");
		   act.pause(2000).perform();
	}
	
	@Then("Next page get text of Step three Primary Beneficiaries and get text of notes")
	public void next_page_get_text_of_Step_three_Primary_Beneficiaries_and_get_text_of_notes() {
		NewRequest1.NextBtn2.click();
		act.pause(1000).perform();
		String st = NewRequest1.GetTextOfStepThreePrimaryBene.getText();
		System.out.println(st);
		String st2 = NewRequest1.GetTextOfStepThreeNotes.getText();
		String st3 = NewRequest1.GetTextOfNoPrimaryBeneAdd.getText();
		System.out.println(st2 + "\n" + st3 +"\n");
		act.pause(2000).perform();
	}

	@Then("click Add Primary button")
	public void click_Add_Primary_button() {
		NewRequest1.AddPrimaryBtn.click();
		act.pause(2000).perform();
	}

	@Then("Get text of Add Primary Beneficiary title")
	public void get_text_of_Add_Primary_Beneficiary_title() {
	   String st = NewRequest1.GetTextOfAddPrimaryBeneficiary.getText();
	   System.out.println(st + ":" + "\n");
	   act.pause(1000).perform();
	}

	@Then("Get text of Relationship to insured and select Relastionship to Insured")
	public void get_text_of_Relationship_to_insured_and_select_Relastionship_to_Insured() {
	   String st = NewRequest1.GetTextOfRelationshipToInsured.getText();
	   NewRequest1.RelationShipClick.click();
	   NewRequest1.SelectSpouseForRelationship.click();
	   act.pause(2000).perform();
	   System.out.println(st + ": Spouse");
	   act.pause(2000).perform();
	}

	@Then("Get text of Gender and select gender")
	public void get_text_of_Gender_and_select_gender() {
		 String st = NewRequest1.GetTextOfGender.getText();
		   NewRequest1.GenderClick.click();
		   NewRequest1.GenderMaleOption.click();
		   act.pause(2000).perform();
		   System.out.println(st + ": Male");
		   act.pause(2000).perform();
	}

	@Then("Get text of First Name and input first name")
	public void get_text_of_First_Name_and_input_first_name() {
		 String st = NewRequest1.GetTextOfFirstName.getText();
		   NewRequest1.FirstName.sendKeys("STEVEN");
		   act.pause(2000).perform();
		   System.out.println(st + ": STEVEN");
		   act.pause(2000).perform();
	}

	@Then("Get text of Last Name and input last name")
	public void get_text_of_Last_Name_and_input_last_name() {
		 String st = NewRequest1.GetTextOfLastName.getText();
		   NewRequest1.LastName.sendKeys("ROBERSON");
		   act.pause(2000).perform();
		   System.out.println(st + ": ROBERSON");
		   act.pause(2000).perform();
	}

	@Then("Get text of Middle Name and input middle name")
	public void get_text_of_Middle_Name_and_input_middle_name() {
		 String st = NewRequest1.GetTextOfMiddleInitial.getText();
		   NewRequest1.MiddleInitial.sendKeys("L");
		   act.pause(2000).perform();
		   System.out.println(st + ": L");
		   act.pause(2000).perform();
	}

	@Then("Get text of SSN and input SSN number")
	public void get_text_of_SSN_and_input_SSN_number() {
		 String st = NewRequest1.GetTextOfSSN.getText();
		   NewRequest1.SSN.sendKeys("246174308");
		   act.pause(2000).perform();
		   System.out.println(st + ": 246174308");
		   act.pause(2000).perform();
	}

	@Then("Get text of DOB and input DOB")
	public void get_text_of_DOB_and_input_DOB() {
		 String st = NewRequest1.GetTextOfDOB.getText();
		 NewRequest1.DOB.click();
		 NewRequest1.DOB.sendKeys("371960");
		 act.pause(2000).perform();
		 System.out.println(st + ": 3/7/1960");
		 act.pause(2000).perform();
	}

	@Then("Get text of Percentage and input percentage")
	public void get_text_of_Percentage_and_input_percentage() {
		 String st = NewRequest1.GetTextOfPercentage.getText();
		 NewRequest1.Percentage.click();
		 NewRequest1.Percentage.sendKeys("100");
		 act.pause(2000).perform();
		 System.out.println(st + ": 100");
		 act.pause(2000).perform();
	}

	@Then("Get text of Address Line and input address line")
	public void get_text_of_Address_Line_and_input_address_line() {
		 String st = NewRequest1.GetTextOfAddressLine.getText();
		 NewRequest1.Address.click();
		 NewRequest1.Address.sendKeys("5063 Stonehill LN");
		 act.pause(2000).perform();
		 System.out.println(st + ": 5063 Stonehill LN");
		 act.pause(2000).perform();
	}

	@Then("Get text of City and input city name")
	public void get_text_of_City_and_input_city_name() {
		 String st = NewRequest1.GetTextOfCity.getText();
		 NewRequest1.City.sendKeys("Matthews");
		 act.pause(2000).perform();
		 System.out.println(st + ": Matthews");
		 act.pause(2000).perform();
	}

	@Then("Get text of State and input state name")
	public void get_text_of_State_and_input_state_name() {
		 String st = NewRequest1.GetTextOfState.getText();
		 NewRequest1.State.sendKeys("NC");
		 act.pause(2000).perform();
		 System.out.println(st + ": NC");
		 act.pause(2000).perform();
	}

	@Then("Get text of Zip Code and input zip code")
	public void get_text_of_Zip_Code_and_input_zip_code() {
		 String st = NewRequest1.GetTextOfZipCode.getText();
		 NewRequest1.ZipCode.sendKeys("28104");
		 act.pause(2000).perform();
		 System.out.println(st + ": 28104" +"\n");
		 act.pause(2000).perform();
	}
	
	@Then("Click ADD button to add primary beneficiary")
	public void click_ADD_button_to_add_primary_beneficiary() {
		NewRequest1.AddClick.click();
		act.pause(1000).perform();
		NewRequest1.ADDbtn.click();
		act.pause(2000).perform();
	}

	@Then("Get text of Notes for percentage")
	public void get_text_of_Notes_for_percentage() {
	    String st = NewRequest1.GetetxtOfNotesForTotalPercentage.getText();
	    System.out.println(st + "\n");
	    act.pause(2000).perform();
	}

	@Then("Get text of FullName, Primary, Percentage")
	public void get_text_of_FullName_Primary_Percentage() {
	   String st = NewRequest1.GetTextOfAddedPrimaryBeneFullName.getText();
	   String st2 = NewRequest1.GetTextOfPrimary.getText();
	   String st3 = NewRequest1.GetTextOfAddedPercentage.getText();
	   System.out.println(st + "   " + st2 + "   " + st3 + "\n");
	   act.pause(2000).perform();
	}

	@Then("Get text of Relation, Gender, SSN, DOB, Address for Primary Beneficiary")
	public void get_text_of_Relation_Gender_SSN_DOB_Address_for_Primary_Beneficiary() {
		String st = NewRequest1.GetTextOfRelationInfo.getText();
		System.out.println(st + "\n");
		String st1 = NewRequest1.GetTextOfSSNInfo.getText();
		System.out.println(st1 +"\n");
		String st2 = NewRequest1.GetTextOfDOBInfo.getText();
		System.out.println(st2 +"\n");
		String st3 = NewRequest1.GetTextOfAddress.getText();
	    System.out.println(st3 +"\n");
	    act.pause(2000).perform();
	}
	
	@Then("Get text of Beneficiary added to list status")
	public void get_text_of_Beneficiary_added_to_list_status() {
		  String st = NewRequest1.GetTextOfAddedStatus.getText();
		    System.out.println(st + "\n");
		    act.pause(4000).perform();
	}

	@Then("Click Next button to move step four")
	public void click_Next_button_to_move_step_four() {
		NewRequest1.NextBtn3.click();
		act.pause(2000).perform();
	}
	
	
	@Then("Get text of Step four Contingent Beneficiaries")
	public void get_text_of_Step_four_Contingent_Beneficiaries() {
		String st = NewRequest1.GetTextOfStepFourContingentBenef.getText();
		System.out.println(st);
		act.pause(2000).perform();
	}

	@Then("Get the notes for add contingent beneficiary")
	public void get_the_notes_for_add_contingent_beneficiary() {
		String st2 = NewRequest1.GetTextOfStepThreeNotes.getText();
		System.out.println(st2 + "\n");
		act.pause(2000).perform();
	}

	@Then("Click to Add Contingent Beneficiary")
	public void click_to_Add_Contingent_Beneficiary() {
		NewRequest1.AddContingentBtn.click();
		act.pause(2000).perform();
	}

	@Then("Get text of Add Contingent Beneficiary")
	public void get_text_of_Add_Contingent_Beneficiary() {
		String st = NewRequest1.GetTextOfAddContingentBene.getText();
		System.out.println(st + "\n");
		act.pause(2000).perform();
	}

	@Then("Get text Relationship to Insured and select Relationship to Trust")
	public void get_text_Relationship_to_Insured_and_select_Relationship_to_Trust() {
		String st = NewRequest1.GetTextOfRelationshipToInsured.getText();
		NewRequest1.RelationshipToInsuredTrust.click();
		System.out.println(st + ": Trust");
		act.pause(2000).perform();
	}

	@Then("Get text of Name of Trust and enter name")
	public void get_text_of_Name_of_Trust_and_enter_name() {
		String st = NewRequest1.GetTextOfNameOfTrust.getText();
		NewRequest1.InputNameOfTrust.sendKeys("NANCY");
		System.out.println(st + ": NANCY");
		act.pause(2000).perform();
	}
	

	@Then("Get text of Trustee named in Trust and enter name")
	public void get_text_of_Trustee_named_in_Trust_and_enter_name() {
		String st = NewRequest1.GetTextOfTrustee.getText();
		NewRequest1.TrustteeNameInTrust.sendKeys("NANCY GRAHMAN");
		System.out.println(st + ": NANCY GRAHMAN");
		act.pause(2000).perform();
	}

	
	@Then("Get text of Percentage and enter percentage")
	public void get_text_of_Percentage_and_enter_percentage() {
		 String st = NewRequest1.GetTextOfPercentage.getText();
		 NewRequest1.Percentage.click();
		 NewRequest1.Percentage2.sendKeys("100");
		 act.pause(2000).perform();
		 System.out.println(st + ": 100");
		 act.pause(2000).perform();
	}
	
	
	@Then("Get text of DOB and enter DOB")
	public void get_text_of_DOB_and_enter_DOB() {
		 String st = NewRequest1.GetTextOfDOTrust.getText();
		 NewRequest1.DateOfTrust.click();
		 NewRequest1.DateOfTrust.sendKeys("481970");
		 act.pause(2000).perform();
		 System.out.println(st + ": 4/8/1970");
		 act.pause(2000).perform();
	}


	@Then("Click Add button to Add Contingent Beneficiary")
	public void click_Add_button_to_Add_Contingent_Beneficiary() {
		NewRequest1.ADDClick.click();
		act.pause(1000).perform();
		NewRequest1.ADDbutton.click();
		act.pause(2000).perform();
	}
	
	@Then("Get text of total percentage notes")
	public void get_text_of_total_percentage_notes() {
		String st = NewRequest1.GetTextOfStepFourPercentageNotes.getText();
		System.out.println(st + "\n");
		act.pause(3000).perform();
	}

	@Then("After add contingent get text of Contingent beneficiary name, Contingent, percentage, Relation, Date and Trustee Name")
	public void after_add_contingent_get_text_of_Contingent_beneficiary_name_Contingent_percentage_Relation_Date_and_Trustee_Name() {
		String st = NewRequest1.GetTextOfContingentFullName.getText();
		String st2 = NewRequest1.GetTextOfContingent.getText();
		String st3 = NewRequest1.GetTextOfPercentageAfterAddContingent.getText();
		System.out.println(st + "    " + st2 + "   " +st3);
		act.pause(2000).perform();
		
		String st4 = NewRequest1.GetTextOfRelation.getText();
		System.out.println(st4 + "\n");
		
		String st5 = NewRequest1.GetTextOfNameOfAddedContingent.getText();
		System.out.println(st5 + "\n");
		
		String st6 = NewRequest1.GetTextOfDateOfAddContingent.getText();
		System.out.println(st6 + "\n");
		
		String st7 = NewRequest1.GetTextOfTruteeName.getText();
		System.out.println(st7 + "\n");
		act.pause(2000).perform();
	}

	@Then("Click Next button to move step five")
	public void click_Next_button_to_move_step_five() {
		NewRequest1.NextBtn4.click();
		act.pause(3000).perform();
	}
	
	
	@Then("Get text of Step five Summary Of Selection")
	public void get_text_of_Step_five_Summary_Of_Selection() {
		String st = NewRequest1.GetTextOfStepFive.getText();
		System.out.println(st + "\n");
		act.pause(2000).perform();
	}
	

	@Then("Get text of Selected Policies, Primary Beneficiaries, and Contingent Beneficiaries infromation")
	public void get_text_of_Selected_Policies_Primary_Beneficiaries_and_Contingent_Beneficiaries_infromation() {
		String st = NewRequest1.GetTextOfSlectedPolicies.getText();
		System.out.println(st + "\n");
		act.pause(2000).perform();
		
		String st2 = NewRequest1.GEtTextOfPolicyNum.getText();
		String st3 = NewRequest1.GetTextOfInsuredForSummary.getText();
		String st4 = NewRequest1.GetTextOfCoverageAmountForSummary.getText();
		System.out.println(st2 + "     " + st3 + "     " + st4 );
		act.pause(2000).perform();
		
		String st5 = NewRequest1.GetTextOfPolicyNumber.getText();
		String st6 = NewRequest1.GetTextOfInsuredFullName.getText();
		String st7 = NewRequest1.GetTextOfCoverageAmountOfNum.getText();
		System.out.println(st5 + "     " + st6 + "     " + st7 +"\n" );
		act.pause(2000).perform();
		
		String st8 = NewRequest1.GetTextOfPrimaryBene.getText();
		System.out.println(st8 + "\n");
		act.pause(2000).perform();
		
		String st9 = NewRequest1.GetTextOfPrimaryFullName.getText();
		String st10 = NewRequest1.GetTextOfPrimaey.getText();
		String st11 = NewRequest1.GetTextOfPercentage100.getText();
		System.out.println(st9 + "     " + st10 + "     " + st11 +"\n");
		act.pause(2000).perform();
		
		String st12 = NewRequest1.GetTextOfRelationAndgenderforPrimarySummary.getText();
		String st13 = NewRequest1.GetTextOfSSNForPrimarySummary.getText();
		String st14 = NewRequest1.GetTextOfDOBForPrimarySummary.getText();
		String st15 = NewRequest1.GetTextOfAddressForPrimarySummary.getText();
		System.out.println(st12 + "     " + st13 + "     " + st14 + "      " +st15 );
		act.pause(2000).perform();
		
		String st16 = NewRequest1.GetTextOfContingentBeneForSummary.getText();
		System.out.println(st16 + "\n");
		act.pause(2000).perform();
		
		String st19 = NewRequest1.GetTextOfContengentNameForSummary.getText();
		String st17 = NewRequest1.GetTextOfContingentForSummary.getText();
		String st18 = NewRequest1.GetTextOfpercentageForContingentSummary.getText();
		System.out.println(st19 + "      " + st17 + "      " + st18 +"\n");
		act.pause(2000).perform();
		
		String st20 = NewRequest1.GetTextOfRelationforContingentSummary.getText();
		String st21 = NewRequest1.GetTextOfNameForContingentSummary.getText();
		String st22 = NewRequest1.GetTextOfDOBForContingentSummary.getText();
		String st23 = NewRequest1.GetTextOfNameOfTrusteeContingentSummary.getText();
		System.out.println(st20 + "     " + st21 + "     " + st22 + "      " +st23 +"\n" );
		act.pause(2000).perform();
		
	}
	

	@Then("Get text of all the Notes")
	public void get_text_of_all_the_Notes() {
		String st16 = NewRequest1.GetTextOfNotesForSummary.getText();
		System.out.println(st16 + "\n");
		act.pause(2000).perform();
	}
	

	@Then("Click Checking Box")
	public void click_Checking_Box() {
		NewRequest1.ClickForChecking.click();
		act.pause(1000).perform();
		
		String st16 = NewRequest1.GetTextForCheckingNotes.getText();
		System.out.println(st16 + "\n");
		act.pause(3000).perform();
	}

	
	@Then("Click Submit button to submit the application")
	public void click_Submit_button_to_submit_the_application() {
		NewRequest1.ClickSubmitBtn.click();
		act.pause(4000).perform();
		
		NewRequest1.OkBtn.click();
		act.pause(3000).perform();
	}

	@Then("Navigate back to home page Get text of Account Number, Status, Crated Date, Decision Date")
	public void navigate_back_to_home_page_Get_text_of_Account_Number_Status_Crated_Date_Decision_Date() {
		String str = NewRequest1.GetTextOfAccountNum.getText();
		String str3 = NewRequest1.GetTextOfStatus.getText();
		String str1 = NewRequest1.GetTextOfCreatedDate.getText();
		String str2 = NewRequest1.GetTextOfDecisionDate.getText();
		System.out.println(str+"      "+str3+"     "+str1+"     "+str2);
		act.pause(3000).perform();
	}

	@Then("Get text of beneficiary Account Number, Status, Created Date")
	public void get_text_of_beneficiary_Account_Number_Status_Created_Date() {
		String str = NewRequest1.GetTextOfFirstAccountNum.getText();
		String str1 = NewRequest1.GetTextOfStatusSubmit.getText();
		String str2 = NewRequest1.GetTextOfCreateDate.getText();
		System.out.println(str+"     "+str1+"     "+str2);
		act.pause(3000).perform();
	}

	@Then("Click View button and get Beneficiary Designation Forms Url")
	public void click_View_button_and_get_Beneficiary_Designation_Forms_Url() {
		NewRequest1.ClickView1.click();
		String imageUrl=NewRequest1.GetFormURL1.getAttribute("src");
		System.out.println("\n"+"Image source path : \n"+ imageUrl + "\n");
		act.pause(2000).perform();
		NewRequest1.CloseForm1.click();
		act.pause(2000).perform();
	}





	
}
