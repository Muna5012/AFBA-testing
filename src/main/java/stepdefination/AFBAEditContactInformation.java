package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AFBACustomerPortalMainPage;
import pages.AFBAMemberPortalLoginPage;
import utilities.TestBase;

public class AFBAEditContactInformation extends TestBase {

	@Given("Input Username and Password ang click button to login Account")
	public void input_Username_and_Password_ang_click_button_to_login_Account() {
		AFBAMemberPortalLoginPage.UserNameforLogin.sendKeys("qapeep512@gmail.com");
		AFBAMemberPortalLoginPage.PasswordforLogin.click();
		AFBAMemberPortalLoginPage.PasswordforLogin.sendKeys("Q85q2019");
		AFBAMemberPortalLoginPage.LoginBtnforLoginPage.click();
		act.pause(2000).perform();
		
	}

	@When("Click Edit Contact Information button")
	public void click_Edit_Contact_Information_button() {
		AFBACustomerPortalMainPage.EditContactInformationBtn.click();
		act.pause(2000).perform();
	}

	@Then("Get text of Edit Contact Information")
	public void get_text_of_Edit_Contact_Information() {
		String str = AFBACustomerPortalMainPage.GetTextOfEditContactInfo.getText();
		System.out.println(str);
		String str2 = AFBACustomerPortalMainPage.GetNameOfText.getText();
		System.out.println(str2 + "\n ");
	}
	
	@Then("Click pencil icon to Edit Password")
	public void click_pencil_icon_to_Edit_Password() {
		AFBACustomerPortalMainPage.EditPasswordClick.click();
		act.pause(1000).perform();
	}

	@Then("Get text of Change Password, Old Passowrd, New Password, Confirm Passowrd")
	public void get_text_of_Change_Password_Old_Passowrd_New_Password_Confirm_Passowrd() {
	   String str = AFBACustomerPortalMainPage.GetTextChangePassword.getText();
		System.out.println(str);
	   String str1 = AFBACustomerPortalMainPage.GetTextOldNewConfirmPassword.getText();
	   System.out.println(str1 + "\n ");
	   act.pause(1000).perform();
	}

	@Then("Input Old Password, New Password, Confirm Passoword")
	public void input_Old_Password_New_Password_Confirm_Passoword() {
		AFBACustomerPortalMainPage.OldPassword.click();
		AFBACustomerPortalMainPage.OldPassword.sendKeys("Test1223");
		AFBACustomerPortalMainPage.NewPassword.click();
		AFBACustomerPortalMainPage.NewPassword.sendKeys("Test5012");
		AFBACustomerPortalMainPage.ConfirmPassword.click();
		AFBACustomerPortalMainPage.ConfirmPassword.sendKeys("Test5012");
	act.pause(2000).perform();
	}

	@Then("Click Save Button to save new Password")
	public void click_Save_Button_to_save_new_Password() {
		AFBACustomerPortalMainPage.ClickCancel.click();
//		AFBACustomerPortalMainPage.ClickSaveBtn.click();
//		act.pause(2000).perform();
//		AFBACustomerPortalMainPage.ClickOKForSaveNewPassword.click();
		act.pause(2000).perform();
	}

	@Then("Click pencil icon to Edit Primary Mailing Address")
	public void click_pencil_icon_to_Edit_Primary_Mailing_Address() {
		AFBACustomerPortalMainPage.EditAddressBtn.click();
		act.pause(2000).perform();
	}

	@Then("Get text of Address Change, Mailing Street, Mailing City, Maling State, Mailing Zip Code")
	public void get_text_of_Address_Change_Mailing_Street_Mailing_City_Maling_State_Mailing_Zip_Code() {
		String str = AFBACustomerPortalMainPage.GetTextOfAddressChange.getText();
		System.out.println(str);
		
		String str2 = AFBACustomerPortalMainPage.GetTextOfMallingStreet.getText();
		AFBACustomerPortalMainPage.MaillingStreet.clear();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.MaillingStreet.sendKeys("5063 STONEHILL LANE2 APT2");
		System.out.println(str2 + ": 5063 STONEHILL LANE2 APT2");
		
		String str3 = AFBACustomerPortalMainPage.GetTextOfMallingCity.getText();
		AFBACustomerPortalMainPage.MallingCity.clear();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.MallingCity.sendKeys("MATTHEWS");
		act.pause(1000).perform();
		System.out.println(str3 + ": MATTHEWS");
		
		String str4 = AFBACustomerPortalMainPage.GetTextOfMallingState.getText();
		AFBACustomerPortalMainPage.MaillingStateclick.click();
		AFBACustomerPortalMainPage.MaillingState.click();
		act.pause(1000).perform();
		System.out.println(str4 + ": NORTH CAROLINA");
		
		String str5 = AFBACustomerPortalMainPage.GetTextOfMallingZipCode.getText();
		AFBACustomerPortalMainPage.MaillingZipCode.clear();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.MaillingZipCode.sendKeys("20147");
		act.pause(1000).perform();
		System.out.println(str5+": 20147 " +"\n");
		
		
	}	

	@Then("Click Save Button to save new Address")
	public void click_Save_Button_to_save_new_Address() {
		AFBACustomerPortalMainPage.SaveBtn.click();
		act.pause(2000).perform();
		AFBACustomerPortalMainPage.ClickOKForSaveNewAddress.click();
		act.pause(2000).perform();
	}

	@Then("Click pencil icon to Edit Email Address")
	public void click_pencil_icon_to_Edit_Email_Address() {
		AFBACustomerPortalMainPage.EmailAddressChange.click();
	}

	@Then("Get text of Change Email, Email Address, and button of notice text")
	public void get_text_of_Change_Email_Email_Address_and_button_of_notice_text() {
		String str = AFBACustomerPortalMainPage.GetTextOfChnageEmail.getText();
		System.out.println(str);
		String str2 = AFBACustomerPortalMainPage.GetTextofEmail.getText();
		AFBACustomerPortalMainPage.inputEmail.clear();
		AFBACustomerPortalMainPage.inputEmail.sendKeys("qapeep512@gmail.com");
		act.pause(2000).perform();
		System.out.println(str2 + ": qapeep512@gmail.com");
		String str3 = AFBACustomerPortalMainPage.GetTextOfEmailNotice.getText();
		System.out.println(str3 + "\n ");
		act.pause(1000).perform();
		
	}

	@Then("Click Save button to save new Email Address")
	public void click_Save_button_to_save_new_Email_Address() {
		AFBACustomerPortalMainPage.ClickSaveForNewEmail.click();
		act.pause(2000).perform();
		AFBACustomerPortalMainPage.ClickCancelForNewEmail.click();
		act.pause(2000).perform();
	}

	@Then("Click pencil icon to Edit Military Salutation")
	public void click_pencil_icon_to_Edit_Military_Salutation() {
		AFBACustomerPortalMainPage.EditMilitarySalutation.click();
		act.pause(1000).perform();
	}

	@Then("Get text of Salutation Change, Branch of Service, Rank, Duty Status and Select it")
	public void get_text_of_Salutation_Change_Branch_of_Service_Rank_Duty_Status_and_Select_it() {
	  String str = AFBACustomerPortalMainPage.GetTextOfSalutationChange.getText();
	  System.out.println(str);
	 
	  String str2 = AFBACustomerPortalMainPage.GetTextOfBOS.getText();
		AFBACustomerPortalMainPage.BranchOfServiceClick.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.UnitedStatedNavy.click();
		System.out.println(str2 + ": United States Navy");
		
	  String str3 = AFBACustomerPortalMainPage.GetTextOfRank.getText();
	    AFBACustomerPortalMainPage.RankClick.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.SelectMGO08Master.click();
		System.out.println(str3 + ": RADM -O08 - ADMIRAL");
		
	  String str4 = AFBACustomerPortalMainPage.GetTextDutyStatus.getText();
		AFBACustomerPortalMainPage.DutyStatusClick.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.Active.click();
	    System.out.println(str4+ ": Active" + "\n ");
	    act.pause(1000).perform();
	  
	}

	@Then("Click Save button to save new Salutation Change")
	public void click_Save_button_to_save_new_Salutation_Change() {
		AFBACustomerPortalMainPage.ClickSaveforSalutationChange.click();
		act.pause(2000).perform();
		AFBACustomerPortalMainPage.ClickOKforSalutationChange.click();
		act.pause(2000).perform();
	}

	@Then("Click pencil icon to Edit Primary Phone Number")
	public void click_pencil_icon_to_Edit_Primary_Phone_Number() {
		AFBACustomerPortalMainPage.EditPrimaryPhoneNumber.click();
		act.pause(1000).perform();
	}

	@Then("Get text of Change Phone and Phone Number and input new Phone number")
	public void get_text_of_Change_Phone_and_Phone_Number_and_input_new_Phone_number() {
		String str = AFBACustomerPortalMainPage.GetTextOfChangePhone.getText();
		System.out.println(str);
		
		String str2 = AFBACustomerPortalMainPage.GetTextOfPhoneNumber.getText();
		System.out.println(str2+": 770-559-4989 " + "\n" );
		
		AFBACustomerPortalMainPage.InputPhoneNumberForChange.clear();
		AFBACustomerPortalMainPage.InputPhoneNumberForChange.click();
		AFBACustomerPortalMainPage.InputPhoneNumberForChange.sendKeys("7705594989");
		act.pause(1000).perform();
	}
	

	@Then("Click Save button to save New Phone Number")
	public void click_Save_button_to_save_New_Phone_Number() {
		AFBACustomerPortalMainPage.ClickSaveForPhoneNumChange.click();
		act.pause(2000).perform();
		AFBACustomerPortalMainPage.ClickOkForSavePhoneNumber.click();
		act.pause(2000).perform();
	}

	@Then("Get text of Change Mobile Phone, Mobile Phone Number and input Mobile Phone Number")
	public void get_text_of_Change_Mobile_Phone_Mobile_Phone_Number_and_input_Mobile_Phone_Number() {
		AFBACustomerPortalMainPage.ClickMobilePhoneNumber.click();
		act.pause(1000).perform();
		
		String string = AFBACustomerPortalMainPage.GetTextOfChangeMobilePhone.getText();
		System.out.println(string);
		act.pause(1000).perform();
		
		String string2 = AFBACustomerPortalMainPage.GetTextOfMobilePhoneNumber.getText();
		System.out.println(string2 + ": 248-910-1083" + "\n ");
		act.pause(1000).perform();
		
		AFBACustomerPortalMainPage.InputMobilePhoneNumber.sendKeys("2489101083");
		act.pause(1000).perform();
	}

	
	@Then("Save New Mobile Phone Number")
	public void save_New_Mobile_Phone_Number() {
		AFBACustomerPortalMainPage.ClickSaveMobilePhone.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.ClickOkChangeMobilePhone.click();
		act.pause(2000).perform();
	}

	
	@Then("Get text of Document Delivery Explained")
	public void get_text_of_Document_Delivery_Explained() {
		String str = AFBACustomerPortalMainPage.DocumentDelivery.getText();
		System.out.println(str + "\n");
		act.pause(2000).perform();
		String str2 = AFBACustomerPortalMainPage.DocumentDeliveryAllText.getText();
		System.out.println(str2+ "\n");
		act.pause(2000).perform();
		
		String imageUrl=AFBACustomerPortalMainPage.Image.getAttribute("src");
		System.out.println("Image source path : \n"+ imageUrl + "\n");
		
	}
	

	@Then("Get all the text of Document Delivery Explained")
	public void get_all_the_text_of_Document_Delivery_Explained() {
		String str = AFBACustomerPortalMainPage.DeliveryPreference.getText();
		System.out.println("\n"+ str + "\n");
		act.pause(1000).perform();
		String str2 = AFBACustomerPortalMainPage.DeliveryPreferenceAllText.getText();
		System.out.println(str2+ "\n");
		act.pause(1000).perform();
	}
	
	@Then("Get text of eDelivery")
	public void get_text_of_eDelivery() {
	   
	}

	@Then("Get all the text of eDelivery explain")
	public void get_all_the_text_of_eDelivery_explain() {
	    
	}

	@Then("Select checkbox to opt in eDelivery to email")
	public void select_checkbox_to_opt_in_eDelivery_to_email() {
		AFBACustomerPortalMainPage.ClickYesCheckBoxforDeliveryPreference.click();
		act.pause(1000).perform();
	}
	
	@Then("Get text of Text Alert")
	public void get_text_of_Text_Alert() {
		String str = AFBACustomerPortalMainPage.TextAlertPreference.getText();
		System.out.println("\n"+ str + "\n");
		act.pause(1000).perform();
	}
	
	
	@Then("Get all the text of Text Alert")
	public void get_all_the_text_of_Text_Alert() {
		String str2 = AFBACustomerPortalMainPage.TextAlertPreferenceGetALlText.getText();
		System.out.println(str2+ "\n");
		act.pause(1000).perform();
	}


	@Then("Select checkbox to opt in Text Alerts to the phone number")
	public void select_checkbox_to_opt_in_Text_Alerts_to_the_phone_number() {
		AFBACustomerPortalMainPage.ClickCheckBoxforTextAlert.click();
		act.pause(1000).perform();
	}

	
	@Then("Select each alert you want to receive")
	public void select_each_alert_you_want_to_receive() {
		AFBACustomerPortalMainPage.TextAlertRadioBtn1.click();
		AFBACustomerPortalMainPage.TextAlertRadioBtn2.click();
		AFBACustomerPortalMainPage.TextAlertRadioBtn3.click();
		act.pause(1000).perform();
	}
	

	@Then("Click Here button to access AFBA Text Message Terms and Conditions")
	public void click_Here_button_to_access_AFBA_Text_Message_Terms_and_Conditions() {
		//AFBACustomerPortalMainPage.ClickHere.click();
		act.pause(1000).perform();
		
	}

	
	@Then("Get text of Marketing Preference")
	public void get_text_of_Marketing_Preference() {
		String str = AFBACustomerPortalMainPage.MarketingPreference.getText();
		System.out.println(str+ "\n");
		act.pause(1000).perform();
	}
	
	
	@Then("Get text of all the Marketing Preference")
	public void get_text_of_all_the_Marketing_Preference() {
		String string = AFBACustomerPortalMainPage.GetTextOfAllMarketingPreference.getText();
		System.out.println(string + "\n");
		act.pause(1000).perform();
	}

	
	@Then("Select checkbox for currently opted out of receiving Marketing from AFBA third party vendors")
	public void select_checkbox_for_currently_opted_out_of_receiving_Marketing_from_AFBA_third_party_vendors() {
		AFBACustomerPortalMainPage.ClickCheckBoxMarketingAlert.click();
		act.pause(1000).perform();
	}

	
	@Then("Click Save Changes button to save it")
	public void click_Save_Changes_button_to_save_it() {
		//AFBACustomerPortalMainPage.SaveChangesBtn.click();
		act.pause(2000).perform();
	
	}
	
	@Then("Click Ok button to save updated status")
	public void click_Ok_button_to_save_updated_status() {
	//	AFBACustomerPortalMainPage.OkForContactInfoChanges.click();
		act.pause(2000).perform();
	}
}
