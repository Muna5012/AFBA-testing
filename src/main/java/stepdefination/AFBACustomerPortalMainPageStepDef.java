package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AFBACustomerPortalMainPage;
import pages.AFBAMemberPortalLoginPage;
import utilities.TestBase;

public class AFBACustomerPortalMainPageStepDef extends TestBase{

	@Given("Get text of Welcome")
	public void get_text_of_Welcome() {
		AFBAMemberPortalLoginPage.UserNameforLogin.sendKeys("qapeep512@gmail.com");
		AFBAMemberPortalLoginPage.PasswordforLogin.click();
		AFBAMemberPortalLoginPage.PasswordforLogin.sendKeys("Q85q2019");
		AFBAMemberPortalLoginPage.LoginBtnforLoginPage.click();
		act.pause(2000).perform();
	}

	@When("Get text of Member Name")
	public void get_text_of_Member_Name() {
		  act.pause(1000).perform();
		String str = AFBACustomerPortalMainPage.WelcomeText.getText();
		System.out.println(str + "\n");
		  act.pause(1000).perform();
		String str1 = AFBACustomerPortalMainPage.MemberName.getText();
		System.out.println(str1);
		  act.pause(1000).perform();
		String str2 = AFBACustomerPortalMainPage.NameofMember.getText();
		System.out.println(str2 + "\n");
		act.pause(1000).perform();
	}

	@Then("Get text of Primary Mailing Address")
	public void get_text_of_Primary_Mailing_Address() {
		String str = AFBACustomerPortalMainPage.PrimaryMailingAddress.getText();
		System.out.println(str);
		  act.pause(1000).perform();
		  
		String str1 = AFBACustomerPortalMainPage.AddressOfPrimaryMailing.getText();
		System.out.println(str1 + "\n");
		act.pause(1000).perform();
		
	}

	@Then("Get text of Email Address")
	public void get_text_of_Email_Address() {
		String str = AFBACustomerPortalMainPage.EmailAddress.getText();
		System.out.println(str);
		act.pause(1000).perform();
		String str1 = AFBACustomerPortalMainPage.InputAddress.getText();
		System.out.println(str1 + "\n");
		act.pause(1000).perform();
	}

	@Then("Get text of Primary Phone Number")
	public void get_text_of_Primary_Phone_Number() {
		String str = AFBACustomerPortalMainPage.PrimaryPhoneNumber.getText();
		System.out.println(str);
		act.pause(1000).perform();
		String str1 = AFBACustomerPortalMainPage.PhoneNumberForPrimary.getText();
		System.out.println(str1 + "\n");
		act.pause(1000).perform();
	}

	@Then("Get text of Mobile Phone Number")
	public void get_text_of_Mobile_Phone_Number() {
		String str = AFBACustomerPortalMainPage.MobilePhoneNumber.getText();
		System.out.println(str);
		act.pause(1000).perform();
		String str1 = AFBACustomerPortalMainPage.NumberOfMobile.getText();
		System.out.println(str1 + "\n");
		act.pause(1000).perform();
	}
	
	@Then("Get Text of You Active Policies")
	public void get_Text_of_You_Active_Policies() {
		String str = AFBACustomerPortalMainPage.YourActivePoliciesText.getText();
		System.out.println(str +"\n");
		act.pause(1000).perform();
	}

	@Then("Get Text of Account, Coverafe Amount, Balance Due, Paid Thru Date and Download Informations")
	public void get_Text_of_Account_Coverafe_Amount_Balance_Due_Paid_Thru_Date_and_Download_Informations() {
		String str = AFBACustomerPortalMainPage.AccountText.getText();
		System.out.println(str + "\n");
		act.pause(2000).perform();
		String str1 = AFBACustomerPortalMainPage.AccountNumber1.getText();
		String str2 = AFBACustomerPortalMainPage.AccountNumber2.getText();
		String str3 = AFBACustomerPortalMainPage.AccountNumber3.getText();
		String str4 = AFBACustomerPortalMainPage.AccountNumber4.getText();
		String str5 = AFBACustomerPortalMainPage.AccountNumber5.getText();
		act.pause(2000).perform();
		System.out.println(str1 +  "\n" + str2 +  "\n" + str3 +  "\n"  + str4 +  "\n"  + str5 +  "\n");
		act.pause(2000).perform();
		String str6 = AFBACustomerPortalMainPage.TotalBalance.getText();
		String str7 = AFBACustomerPortalMainPage.TotalNumberOfBalance.getText();
		System.out.println(str6 +"  "+str7);
		act.pause(1000).perform();
		
	}
	

	@Then("Click Edit Contact Information button")
	public void click_Edit_Contact_Information_button() {
		AFBACustomerPortalMainPage.EditContactInformationBtn.click();
		act.pause(2000).perform();
	}

//	@Then("Click Edit Password button")
//	public void click_Edit_Password_button() {
//	//	AFBACustomerPortalMainPage.EditPasswordClick.click();
//		act.pause(1000).perform();
//	}
//
//	@Then("Change Password to input Old Password, New Password, Confirm Password")
//	public void change_Password_to_input_Old_Password_New_Password_Confirm_Password() {
////		AFBACustomerPortalMainPage.OldPassword.click();
////		AFBACustomerPortalMainPage.OldPassword.sendKeys("Test12345");
////		AFBACustomerPortalMainPage.NewPassword.click();
////		AFBACustomerPortalMainPage.NewPassword.sendKeys("Test12345");
////		AFBACustomerPortalMainPage.ConfirmPassword.click();
////		AFBACustomerPortalMainPage.ConfirmPassword.sendKeys("Test12345");
////		act.pause(1000).perform();
////		AFBACustomerPortalMainPage.ClickSaveBtn.click();
////		act.pause(3000).perform();
////		AFBACustomerPortalMainPage.OldPassword.click();
////		AFBACustomerPortalMainPage.OldPassword.sendKeys("Test1223");
////		AFBACustomerPortalMainPage.NewPassword.click();
////		AFBACustomerPortalMainPage.NewPassword.sendKeys("Test5012");
////		AFBACustomerPortalMainPage.ConfirmPassword.click();
////		AFBACustomerPortalMainPage.ConfirmPassword.sendKeys("Test5012");
//	act.pause(2000).perform();
//	}
//
//	@Then("Click Save Button to save new Password")
//	public void click_Save_Button_to_save_new_Password() {
////		AFBACustomerPortalMainPage.ClickSaveBtn.click();
////		act.pause(2000).perform();
////		AFBACustomerPortalMainPage.ClickOKForSaveNewPassword.click();
//		act.pause(2000).perform();
//		}
//
	@Then("Click Edit Primary Mailing Address button")
	public void click_Edit_Primary_Mailing_Address_button() {
		AFBACustomerPortalMainPage.EditAddressBtn.click();
		act.pause(2000).perform();
	}

	@Then("Address Change input Mailing Street, City, State and ZipCode")
	public void address_Change_input_Mailing_Street_City_State_and_ZipCode() {
		AFBACustomerPortalMainPage.MaillingStreet.clear();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.MaillingStreet.sendKeys("5063 STONEHILL LANE2 APT2");
		AFBACustomerPortalMainPage.MallingCity.clear();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.MallingCity.sendKeys("MATTHEWS");
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.MaillingStateclick.click();
		AFBACustomerPortalMainPage.MaillingState.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.MaillingZipCode.clear();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.MaillingZipCode.sendKeys("20147");
		act.pause(1000).perform();
	}

	@Then("Click Save Button to saving new Address")
	public void click_Save_Button_to_saving_new_Address() {
		AFBACustomerPortalMainPage.SaveBtn.click();
		act.pause(2000).perform();
		AFBACustomerPortalMainPage.ClickOKForSaveNewAddress.click();
		act.pause(2000).perform();
		
	}
	
	@Then("Navigate back to Edit Contact Information Page to click Edit Email Address button")
	public void navigate_back_to_Edit_Contact_Information_Page_to_click_Edit_Email_Address_button() {
		AFBACustomerPortalMainPage.EmailAddressChange.click();
	}

	@Then("Input New Email address")
	public void input_New_Email_address() {
		AFBACustomerPortalMainPage.inputEmail.clear();
		AFBACustomerPortalMainPage.inputEmail.sendKeys("qapeep512@gmail.com");
	}

	@Then("Click Save button to save it")
	public void click_Save_button_to_save_it() {
	//	AFBACustomerPortalMainPage.ClickCancelForNewEmail.click();
		AFBACustomerPortalMainPage.ClickSaveForNewEmail.click();
		act.pause(2000).perform();
		AFBACustomerPortalMainPage.ClickCancelForNewEmail.click();
		act.pause(2000).perform();
	}
	
	@Then("Click Edit Milliraty Salutation")
	public void click_Edit_Milliraty_Salutation() {
		AFBACustomerPortalMainPage.EditMilitarySalutation.click();
		act.pause(1000).perform();
	}

	@Then("Select Branch of Service, Rank And Duty Status")
	public void select_Branch_of_Service_Rank_And_Duty_Status() {
		AFBACustomerPortalMainPage.BranchOfServiceClick.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.UnitedStatedNavy.click();
		AFBACustomerPortalMainPage.RankClick.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.SelectMGO08Master.click();
		AFBACustomerPortalMainPage.DutyStatusClick.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.Active.click();
		AFBACustomerPortalMainPage.ClickSaveforSalutationChange.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.ClickOKforSalutationChange.click();
		act.pause(2000).perform();
	}

	@Then("Click Edit Primary Phone Number")
	public void click_Edit_Primary_Phone_Number() {
		AFBACustomerPortalMainPage.EditPrimaryPhoneNumber.click();
		act.pause(1000).perform();
	}

	@Then("Input New Phone Number and Save it")
	public void input_New_Phone_Number_and_Save_it() {
		AFBACustomerPortalMainPage.InputPhoneNumberForChange.clear();
		AFBACustomerPortalMainPage.InputPhoneNumberForChange.sendKeys("7705594989");
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.ClickSaveForPhoneNumChange.click();
		act.pause(2000).perform();
		AFBACustomerPortalMainPage.ClickOkForSavePhoneNumber.click();
		act.pause(2000).perform();
	}

	@Then("Click Edit Mobile Phone Number")
	public void click_Edit_Mobile_Phone_Number() {
		AFBACustomerPortalMainPage.EditMobilePhoneNumber.click();
		act.pause(1000).perform();
		
	}

	@Then("Input New Mobile Phone Number and save It")
	public void input_New_Mobile_Phone_Number_and_save_It() {
		AFBACustomerPortalMainPage.InputMobilePhoneNumber.clear();
		AFBACustomerPortalMainPage.InputMobilePhoneNumber.sendKeys("2489101083");
		AFBACustomerPortalMainPage.ClickSaveforChangeMobilePhone.click();
		act.pause(1000).perform();
		AFBACustomerPortalMainPage.ClickOkforChangeMobilePhone.click();
		act.pause(2000).perform();
	}

	@Then("Get all the text of Document Delivery Preference")
	public void get_all_the_text_of_Document_Delivery_Preference() {
		String str = AFBACustomerPortalMainPage.DocumentDelivery.getText();
		System.out.println("\n"+ str + "\n");
		act.pause(2000).perform();
		String str2 = AFBACustomerPortalMainPage.DocumentDeliveryAllText.getText();
		System.out.println(str2+ "\n");
		act.pause(2000).perform();
		
		String imageUrl=AFBACustomerPortalMainPage.Image.getAttribute("src");
		System.out.println("Image source path : \n"+ imageUrl + "\n");
	}
	
	@Then("Get all the text of Delivery Preference")
	public void get_all_the_text_of_Delivery_Preference() {
		String str = AFBACustomerPortalMainPage.DeliveryPreference.getText();
		System.out.println("\n"+ str + "\n");
		act.pause(1000).perform();
		String str2 = AFBACustomerPortalMainPage.DeliveryPreferenceAllText.getText();
		System.out.println(str2+ "\n");
		act.pause(1000).perform();
	}

	@Then("Select checkbox for document delivery method eDelivery to email")
	public void select_checkbox_for_document_delivery_method_eDelivery_to_email() {
//		Actions action = new Actions(driver);
//		action.moveToElement(AFBACustomerPortalMainPage.ClickYesCheckBoxforDeliveryPreference).build().perform();
		AFBACustomerPortalMainPage.ClickYesCheckBoxforDeliveryPreference.click();
		act.pause(1000).perform();
	}

	@Then("Get text of Text Alert Preference")
	public void get_text_of_Text_Alert_Preference() {
		String str = AFBACustomerPortalMainPage.TextAlertPreference.getText();
		System.out.println("\n"+ str + "\n");
		act.pause(1000).perform();
		String str2 = AFBACustomerPortalMainPage.TextAlertPreferenceGetALlText.getText();
		System.out.println(str2+ "\n");
		act.pause(1000).perform();
	}

	@Then("Select checkbox to sign up for using my mobile device")
	public void select_checkbox_to_sign_up_for_using_my_mobile_device() {
		AFBACustomerPortalMainPage.ClickCheckBoxforTextAlert.click();
//		Actions action = new Actions(driver);
//		action.moveToElement(AFBACustomerPortalMainPage.ClickCheckBoxforTextAlert).build().perform();
		act.pause(1000).perform();
	}

	@Then("Select each alert you want to receive")
	public void select_each_alert_you_want_to_receive() {
//		AFBACustomerPortalMainPage.TextAlertRadioBtn1.click();
//		AFBACustomerPortalMainPage.TextAlertRadioBtn2.click();
//		AFBACustomerPortalMainPage.TextAlertRadioBtn3.click();
		act.pause(1000).perform();
	}

	@Then("Click Here button to access AFBA Text Message Terms and Conditions")
	public void click_Here_button_to_access_AFBA_Text_Message_Terms_and_Conditions() {
		act.pause(1000).perform();
	}

	@Then("Get text of Marketing Alert Preference")
	public void get_text_of_Marketing_Alert_Preference() {
		String str = AFBACustomerPortalMainPage.MarketingAlertPreference.getText();
		System.out.println(str+ "\n");
		act.pause(1000).perform();
	}

	@Then("Select checkbox for currently opted in to receive any Marketing from AFBA option")
	public void select_checkbox_for_currently_opted_in_to_receive_any_Marketing_from_AFBA_option() {
		AFBACustomerPortalMainPage.ClickCheckBoxMarketingAlert.click();
//		Actions action = new Actions(driver);
//		action.moveToElement(AFBACustomerPortalMainPage.ClickCheckBoxMarketingAlert).build().perform();
		act.pause(1000).perform();
	}

	@Then("Click Save Changes button to save it")
	public void click_Save_Changes_button_to_save_it() {
		AFBACustomerPortalMainPage.SaveChangesBtn.click();
	}


}
