package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AFBACustomerPortalMainPage;
import pages.AFBAMemberPortalLoginPage;
import utilities.TestBase;

public class AFBASetUpRecurringPayments extends TestBase{
	
	@Given("Input Username, Password and Click Login button on Login page")
	public void input_Username_Password_and_Click_Login_button_on_Login_page() {
		AFBAMemberPortalLoginPage.UserNameforLogin.sendKeys("qapeep512@gmail.com");
		AFBAMemberPortalLoginPage.PasswordforLogin.click();
		AFBAMemberPortalLoginPage.PasswordforLogin.sendKeys("Q85q2019");
		AFBAMemberPortalLoginPage.LoginBtnforLoginPage.click();
		act.pause(2000).perform();
	}

	@When("Click Set up Recurring Payments button")
	public void click_Set_up_Recurring_Payments_button() {
		AFBACustomerPortalMainPage.ClickSetUpRecurringPAymentBtn.click();
		act.pause(2000).perform();
	}

	@Then("Get text of Payment Details for Recurring Payments")
	public void get_text_of_Payment_Details_for_Recurring_Payments() {
	    String str = AFBACustomerPortalMainPage.GetTextOfPaymentDetailsForRecurringPayments.getText();
	    System.out.println(str +"\n");
	}

	@Then("Get text of Payment method and select it")
	public void get_text_of_Payment_method_and_select_it() {
	   String str = AFBACustomerPortalMainPage.GetTextCreditCard.getText();
	   AFBACustomerPortalMainPage.SelectCreditCard.click();
	   System.out.println(str + "\n");
	}

	@Then("Get text of Card Type and Select it")
	public void get_text_of_Card_Type_and_Select_it() {
	   String str = AFBACustomerPortalMainPage.GetTextCardType.getText();
	   act.pause(1000).perform();
	   AFBACustomerPortalMainPage.SelectVisa.click();
	   System.out.println(str +": Visa");
	   act.pause(1000).perform();
	   
	}

	@Then("Get text of Cardholder Name and Input name")
	public void get_text_of_Cardholder_Name_and_Input_name() {
		  String str = AFBACustomerPortalMainPage.GetTextCardHolderName.getText();
		  act.pause(1000).perform();
		  AFBACustomerPortalMainPage.CardHolderName.sendKeys("ELEANOR ROBERSON");
		  System.out.println(str +": ELEANOR ROBERSON");
		  act.pause(1000).perform();
	}

	@Then("Get text of Card Number and Input Credit or Debit Card Number")
	public void get_text_of_Card_Number_and_Input_Credit_or_Debit_Card_Number() {
		 String str = AFBACustomerPortalMainPage.GetTextOfCardNumber.getText();
		  act.pause(1000).perform();
		  AFBACustomerPortalMainPage.CardNumber.sendKeys("4111111111111111");
		  System.out.println(str +": 4111111111111111");
		  act.pause(1000).perform();
	}

	@Then("Get text of Expiration Date, Select mounth and Years")
	public void get_text_of_Expiration_Date_Select_mounth_and_Years() {
		 String str = AFBACustomerPortalMainPage.GetTextOfExpirationDate.getText();
		  AFBACustomerPortalMainPage.MounthForExpirationDate.click();
		  act.pause(1000).perform();
		  AFBACustomerPortalMainPage.YearForExpirationDate.click();
		  System.out.println(str +": DEC/2022");
		  act.pause(1000).perform();
	}

	@Then("Get text of CVV Number and Input three digit CVV numbers")
	public void get_text_of_CVV_Number_and_Input_three_digit_CVV_numbers() {
		 String str = AFBACustomerPortalMainPage.GetTextOfCVV.getText();
		  act.pause(1000).perform();
		  AFBACustomerPortalMainPage.CVV.sendKeys("235");
		  System.out.println(str +": 235");
		  act.pause(1000).perform();
	}

	@Then("Get text of Billing Zip Code and input zip code")
	public void get_text_of_Billing_Zip_Code_and_input_zip_code() {
		 String str = AFBACustomerPortalMainPage.GetTextBillingZipCode.getText();
		  act.pause(1000).perform();
		  AFBACustomerPortalMainPage.ZipCode.click();
		  AFBACustomerPortalMainPage.ZipCode.clear();
		  AFBACustomerPortalMainPage.ZipCode.sendKeys("20147");
		  System.out.println(str +": 20147" +"\n");
		  act.pause(1000).perform();
	}

	@Then("Get text of title of status")
	public void get_text_of_title_of_status() {
		 String str = AFBACustomerPortalMainPage.GetTextOfSelected.getText();
		 String str2 = AFBACustomerPortalMainPage.GetTextOfAccount.getText();
		 String str3 = AFBACustomerPortalMainPage.GetTextOfInsured.getText();
		 String str4 = AFBACustomerPortalMainPage.GetTextOfRelation.getText();
		 String str5 = AFBACustomerPortalMainPage.GetTextOfStatus.getText();
		  System.out.println(str +" " + str2 + "  " + str3 + "  " + str4 + "  " + str5 + "  ");
		  act.pause(2000).perform();
	}

	@Then("Get text of Selected, Account, Insured, Relation, Status and Payment Day information")
	public void get_text_of_Selected_Account_Insured_Relation_Status_and_Payment_Day_information() {
	   	  AFBACustomerPortalMainPage.Select1.click();
		  String str = AFBACustomerPortalMainPage.GetTextOfFirstAccount.getText();
		  String str1 = AFBACustomerPortalMainPage.GetTextOfFirstInsuredName.getText();
		  String str2 = AFBACustomerPortalMainPage.GetTextOfFirstRelation.getText();
		  String str3 = AFBACustomerPortalMainPage.GetTextOfFirstStatus.getText();
		  System.out.println(str + " " + str1 + " " + str2+ " " + str3 );
	 	  AFBACustomerPortalMainPage.FirstPaymentDay3.click();  
		  
		  AFBACustomerPortalMainPage.Select2.click();
		  String str4 = AFBACustomerPortalMainPage.GetTextOfSecondAccountNum.getText();
		  String str5 = AFBACustomerPortalMainPage. GetTextOfSecondInsuredName.getText();
		  String str6 = AFBACustomerPortalMainPage.GetTextOfSecondRelation.getText();
		  String str7 = AFBACustomerPortalMainPage.GetTextOfSecondStatus.getText();  
		  System.out.println(str4 +" " + str5 + " " + str6 + " " + str7 + " ");
		  AFBACustomerPortalMainPage.SecondPaymentDay5.click();
		  act.pause(1000).perform();
		  
		  AFBACustomerPortalMainPage.Select3.click();
		  String str8 = AFBACustomerPortalMainPage.GetTextOfThirdAccountNum.getText();
		  String str9 = AFBACustomerPortalMainPage.GetTextOfThirdInsuredName.getText();
		  String str10 = AFBACustomerPortalMainPage.GetTextOfThirdRelation.getText();
		  String str11 = AFBACustomerPortalMainPage.GetTextOfThirdStatus.getText();
		  System.out.println(str8 +" " + str9 +" " + str10 +" " + str11 +" ");
		  AFBACustomerPortalMainPage.ThirdPaymentDay5.click();
		  act.pause(1000).perform();
		  
		  AFBACustomerPortalMainPage.Select4.click();
		  String str12 = AFBACustomerPortalMainPage.GetTextOfForthAccountNum.getText();
		  String str13 = AFBACustomerPortalMainPage.GetTextOfForthInsuredName.getText();
		  String str14 = AFBACustomerPortalMainPage.GetTextOfForthRelation.getText();
		  String str15 = AFBACustomerPortalMainPage.GetTextofForthStatus.getText();
		  System.out.println(str12 +" " + str13 +" " + str14 + " " + str15 + " ");
		  AFBACustomerPortalMainPage.FourtPaymentDay14.click();
		  act.pause(1000).perform();
		  
		  AFBACustomerPortalMainPage.Select5.click();
		  String str16 = AFBACustomerPortalMainPage.GetTextOfFifthAccountNum.getText();
		  String str17 = AFBACustomerPortalMainPage.GetTextOfInsuredName.getText();
		  String str18 = AFBACustomerPortalMainPage.GetTextOfFifthRelation.getText();
		  String str19 = AFBACustomerPortalMainPage.GetTextOfFifthStatus.getText();
		  System.out.println(str16 + " " + str17 + " " + str18 + " " + str19 + " ");
		  AFBACustomerPortalMainPage.FifthPaymentDay4.click();
		  act.pause(1000).perform();
		  
		  AFBACustomerPortalMainPage.Select6.click();
		  String str20 = AFBACustomerPortalMainPage.GetTextOfSixAccountNum.getText();
		  String str21 = AFBACustomerPortalMainPage.GetTextOfSixInsuredName.getText();
		  String str22 = AFBACustomerPortalMainPage.GetTextOfSixRelation.getText();
		  String str23 = AFBACustomerPortalMainPage.GetTextOfSixStatus.getText();
		  System.out.println(str20 +" " + str21 + " " + str22  + " " +str23 + "\n");
		  AFBACustomerPortalMainPage.SixPaymentDay6.click();
		  act.pause(2000).perform();    
	}

	@Then("Click authorize informaion and get all the Text")
	public void click_authorize_informaion_and_get_all_the_Text() {
		AFBACustomerPortalMainPage.Click.click();
		 String str = AFBACustomerPortalMainPage.GetTextIAuthorize.getText();
		  System.out.println(str +"\n");
		  act.pause(1000).perform();
	}

	
	@Then("Click Process button")
	public void click_Process_button() {
	  AFBACustomerPortalMainPage.ClickProcess.click();
	   act.pause(4000).perform();
	  String st = AFBACustomerPortalMainPage.GetTextOfConfirmation.getText();
	  System.out.println(st +"\n");
	   act.pause(3000).perform();
	}

	
	@Then("Get text of E Check")
	public void get_text_of_E_Check() {
		AFBACustomerPortalMainPage.ClickSetUpRecurringPAymentBtn.click();
		act.pause(2000).perform();
		String str = AFBACustomerPortalMainPage.GetTextECheck.getText();
		 System.out.println(str +"\n");
		 act.pause(1000).perform();
	}
	

	@Then("Select E Check recurring payment")
	public void select_E_Check_recurring_payment() {
		AFBACustomerPortalMainPage.ECheck.click();
		act.pause(1000).perform();
	}


	@Then("Get text of Account Type and select Checking account type")
	public void get_text_of_Account_Type_and_select_Checking_account_type() {
		String str = AFBACustomerPortalMainPage.GetTextAccountType.getText();
		System.out.println(str + ": Checking");
		AFBACustomerPortalMainPage.Checking.click();
	}

	
	@Then("Get text of Routing Number and input Routing Number")
	public void get_text_of_Routing_Number_and_input_Routing_Number() {
		String str = AFBACustomerPortalMainPage.GetTextRoutingNum.getText();
		AFBACustomerPortalMainPage.InputRoutingNum.sendKeys("061219694");
		System.out.println(str + ": 061219694");
		act.pause(1000).perform();
//		String str2 = AFBACustomerPortalMainPage.GetTextAccountNum.getText();
//		AFBACustomerPortalMainPage.InputAccountNum.click();
//		AFBACustomerPortalMainPage.InputAccountNum.sendKeys("265270002");
//		System.out.println(str2 + ": 265270002");
//		act.pause(2000).perform();
	}
	
	
	@Then("Get text of Account Number and input account number")
	public void get_text_of_Account_Number_and_input_account_number() {
		String str = AFBACustomerPortalMainPage.GetTextAccountNum.getText();
		AFBACustomerPortalMainPage.InputAccountNum.click();
		AFBACustomerPortalMainPage.InputAccountNum.sendKeys("265270002");
		System.out.println(str + ": 265270002");
		act.pause(2000).perform();
	}

	
	@Then("Get text of Bank Details")
	public void get_text_of_Bank_Details() {
		AFBACustomerPortalMainPage.BankDetails.click();
		String str = AFBACustomerPortalMainPage.BankDetails.getText();
		System.out.println(str + ": ");
		String str1 = AFBACustomerPortalMainPage.GetTextOfBanking.getText();
		System.out.println(str1 + "\n");
		act.pause(1000).perform();
	}

	
	@Then("Selected each account and select payment day for each account")
	public void selected_each_account_and_select_payment_day_for_each_account() {
		String str28 = AFBACustomerPortalMainPage.GetTextOfSelected.getText();
		String str24 = AFBACustomerPortalMainPage.GetTextOfAccount.getText();
		String str25 = AFBACustomerPortalMainPage.GetTextOfInsured.getText();
		String str26 = AFBACustomerPortalMainPage.GetTextOfRelation.getText();
		String str27 = AFBACustomerPortalMainPage.GetTextOfStatus.getText();
		System.out.println(str28 +" " + str24 + "  " + str25 + "  " + str26 + "  " + str27 + "  ");
		act.pause(2000).perform();
		  
		AFBACustomerPortalMainPage.ECSelect1.click();
		String str = AFBACustomerPortalMainPage.ECFirstAccountNum.getText();
		String str1 = AFBACustomerPortalMainPage.ECFirstInsuredName.getText();
		String str2 = AFBACustomerPortalMainPage.ECFirstRelation.getText();
		String str3 = AFBACustomerPortalMainPage.ECFirstStatus.getText();
		System.out.println(str + " " + str1 +" " + str2 +" " + str3 );
		AFBACustomerPortalMainPage.PaymentDay10.click();
		act.pause(1000).perform();
		
		AFBACustomerPortalMainPage.ECSelect2.click();
		String str4 = AFBACustomerPortalMainPage.ECSecondAccountNum.getText();
		String str5 = AFBACustomerPortalMainPage.ECSecondInsuredName.getText();
		String str6 = AFBACustomerPortalMainPage.ECSecondRelation.getText();
		String str7 = AFBACustomerPortalMainPage.ECSecondStatus.getText();
		System.out.println(str4 + " " + str5 +" " + str6 +" " + str7 );
		AFBACustomerPortalMainPage.PaymentDay9.click();
		act.pause(1000).perform();
		
		AFBACustomerPortalMainPage.ECSelect3.click();
		String str8 = AFBACustomerPortalMainPage.ECThirdAccount.getText();
		String str9 = AFBACustomerPortalMainPage.ECThirdInsuredName.getText();
		String str10 = AFBACustomerPortalMainPage.ECThirdRelation.getText();
		String str11 = AFBACustomerPortalMainPage.ECThirdStatus.getText();
		System.out.println(str8 + " " + str9 +" " + str10 +" " + str11 );
		AFBACustomerPortalMainPage.PaymentDay7.click();
		act.pause(1000).perform();
		
		AFBACustomerPortalMainPage.ECSelect4.click();
		String str12 = AFBACustomerPortalMainPage.ECForthAccountNum.getText();
		String str13 = AFBACustomerPortalMainPage.ECForthInsuredName.getText();
		String str14 = AFBACustomerPortalMainPage.ECForthRelation.getText();
		String str15 = AFBACustomerPortalMainPage.EcForthStatus.getText();
		System.out.println(str12 + " " + str13 +" " + str14 +" " + str15 );
		AFBACustomerPortalMainPage.PaymentDay4.click();
		act.pause(1000).perform();
		
		AFBACustomerPortalMainPage.ECSelect5.click();
		String str16 = AFBACustomerPortalMainPage.ECFifthAccountNum.getText();
		String str17 = AFBACustomerPortalMainPage.ECFifthInsuredName.getText();
		String str18 = AFBACustomerPortalMainPage.ECFifthRelation.getText();
		String str19 = AFBACustomerPortalMainPage.ECFifthStatus.getText();
		System.out.println(str16 + " " + str17 +" " + str18 +" " + str19 );
		AFBACustomerPortalMainPage.PaymentDay14.click();
		act.pause(1000).perform();
		
		AFBACustomerPortalMainPage.ECSelect6.click();
		String str20 = AFBACustomerPortalMainPage.ECSixAccount.getText();
		String str21 = AFBACustomerPortalMainPage.ECSixInsuredName.getText();
		String str22 = AFBACustomerPortalMainPage.ECSixRelation.getText();
		String str23 = AFBACustomerPortalMainPage.ECSixStatus.getText();
	
		System.out.println(str20 + " " + str21 +" " + str22 +" " + str23 + "\n");
		AFBACustomerPortalMainPage.PaymentDay17.click();
		act.pause(1000).perform();	
	}

	
	@Then("Click radio button to confirm all information")
	public void click_radio_button_to_confirm_all_information() {
		AFBACustomerPortalMainPage.ECIAuthorize.click();
		act.pause(1000).perform();
	}
	
	@Then("Click Process button to")
	public void click_Process_button_to() {
		String str = AFBACustomerPortalMainPage.GetTextIAuthorize.getText();
		System.out.println(str +"\n");
		AFBACustomerPortalMainPage.ECClickProcess.click();
		act.pause(2000).perform();
		
//		String st1 = AFBACustomerPortalMainPage.GetTextOfConfirmation.getText();
//		System.out.println(st1 +"\n");
		
		AFBACustomerPortalMainPage.InputAccountNum.click();
		AFBACustomerPortalMainPage.InputAccountNum.sendKeys("265270002");
		System.out.println(str + ": 265270002");
		
		AFBACustomerPortalMainPage.ECClickProcess.click();
		act.pause(2000).perform();
		String st2 = AFBACustomerPortalMainPage.GetTextOfConfirmation.getText();
		System.out.println("\n" + st2 +"\n");
	}
	
	
	}


