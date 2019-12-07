package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AFBACustomerPortalMainPage;
import pages.AFBAMemberPortalLoginPage;
import utilities.TestBase;

public class AFBAMakeOnePaymentStepDef extends TestBase{

	
	@Given("Input Username, Password and click Login button on Login account")
	public void input_Username_Password_and_click_Login_button_on_Login_account() {
		AFBAMemberPortalLoginPage.UserNameforLogin.sendKeys("qapeep512@gmail.com");
		AFBAMemberPortalLoginPage.PasswordforLogin.click();
		AFBAMemberPortalLoginPage.PasswordforLogin.sendKeys("Q85q2019");
		AFBAMemberPortalLoginPage.LoginBtnforLoginPage.click();
		act.pause(2000).perform();
	}

	@When("Click Make a One time Payment button")
	public void click_Make_a_One_time_Payment_button() {
		AFBACustomerPortalMainPage.ClickMakeOneTimePayment.click();
		act.pause(2000).perform();
	}

	@Then("Get text of Payor Details")
	public void get_text_of_Payor_Details() {
	    String str = AFBACustomerPortalMainPage.GetTextPayorDetails.getText();
	    System.out.println(str + "\n");
	}

	@Then("Get text of Firstname, Lastname, Email, Address, City, status")
	public void get_text_of_Firstname_Lastname_Email_Address_City_status() {
	  String str = AFBACustomerPortalMainPage.GetAllTextPayorDetails.getText();
	  System.out.println(str + "\n");
	  act.pause(1000).perform();
	}

	@Then("Get text of Selected, Account, Insured, Status, Paid Thru Date, Balance Due, Suspense Amount, Amount To Pay")
	public void get_text_of_Selected_Account_Insured_Status_Paid_Thru_Date_Balance_Due_Suspense_Amount_Amount_To_Pay() {
		  String str = AFBACustomerPortalMainPage.GetTextSelected.getText();
		  String str1 = AFBACustomerPortalMainPage.GetTextInsured.getText();
		  String str2 = AFBACustomerPortalMainPage.GetTextStatus.getText();
		  String str3 = AFBACustomerPortalMainPage.GetTextPaidThruDate.getText();
		  String str4 = AFBACustomerPortalMainPage.GetTextBalanceDue.getText();
		  String str5 = AFBACustomerPortalMainPage.GetTextSuspenseAmount.getText();
		  String str6 = AFBACustomerPortalMainPage.GetTextAmountPay.getText();
		  System.out.println(str + "    " + str1 + "        " + str2 + "      " + str3 + "    " + str4 + "    " + str5 + "   " + str6);
		  act.pause(2000).perform();
	}

	@Then("Get Text of first police information")
	public void get_Text_of_first_police_information() {
	    String st = AFBACustomerPortalMainPage.FirstAccountNum.getText();
	    String st1 = AFBACustomerPortalMainPage.FirstInsuredName.getText();
	    String st2 = AFBACustomerPortalMainPage.FirstStatus.getText();
	    String st3 = AFBACustomerPortalMainPage.FirstPaidThruDate.getText();
	    String st24 = AFBACustomerPortalMainPage.FirstBalanceDue.getText();
	    String st30 = AFBACustomerPortalMainPage.FirstSuspenseAmount.getText();
	    String st31 = AFBACustomerPortalMainPage.FirstAmountToPay.getText();
	    System.out.println(st+ "  " +st1+"  "+st2+"    "+st3+"       "+st24+"          "+st30+"            "+st31);
	    
	    
	    String st4 = AFBACustomerPortalMainPage.SecondAccountNum.getText();
	    String st5 = AFBACustomerPortalMainPage.SecondInsuredName.getText();
	    String st6 = AFBACustomerPortalMainPage.SecondStatus.getText();
	    String st7 = AFBACustomerPortalMainPage.SecondPaidThruDate.getText();
	    String st25 = AFBACustomerPortalMainPage.SecondBalanceDue.getText();
	    String st32 = AFBACustomerPortalMainPage.SecondSuspenseAmount.getText();
	    String st33 = AFBACustomerPortalMainPage.SecondAmountToPay.getText();
	    System.out.println(st4+"  "+st5+"  "+st6+"  "+st7+"       "+st25+"          "+st32+"           "+st33);
	    
	    String st8 = AFBACustomerPortalMainPage.ThridAccountNum.getText();
	    String st9 = AFBACustomerPortalMainPage.ThirdInsuredName.getText();
	    String st10 = AFBACustomerPortalMainPage.ThirdStatus.getText();
	    String st11 = AFBACustomerPortalMainPage.ThridPaidThruDate.getText();
	    String st26 = AFBACustomerPortalMainPage.ThirdBalanceDue.getText();
	    String st34 = AFBACustomerPortalMainPage.ThirdSuspenseAmount.getText();
	    String st35 = AFBACustomerPortalMainPage.ThirdAmountToPay.getText();
	    System.out.println(st8+"  "+st9+"  "+st10+"  "+st11+"       "+st26+"       "+st34+"            "+st35);
	    
	    
	    String st12 = AFBACustomerPortalMainPage.ForthAccountNum.getText();
	    String st13 = AFBACustomerPortalMainPage.ForthInsuredName.getText();
	    String st14 = AFBACustomerPortalMainPage.ForthStatus.getText();
	    String st15 = AFBACustomerPortalMainPage.ForthPaidThruDate.getText();
	    String st27 = AFBACustomerPortalMainPage.ForthBalanceDue.getText();
	    String st36 = AFBACustomerPortalMainPage.ForthSuspenseAmount.getText();
	    String st37 = AFBACustomerPortalMainPage.ForthAmountToPay.getText();
	    System.out.println(st12+"  "+st13+"  "+st14+"   "+st15+"        "+st27+"        "+st36+"            "+st37);
	    
	    
	    String st16 = AFBACustomerPortalMainPage.FifthAccountNum.getText();
	    String st17 = AFBACustomerPortalMainPage.FifthInsuredName.getText();
	    String st18 = AFBACustomerPortalMainPage.FifthStatus.getText();
	    String st19 = AFBACustomerPortalMainPage.FifthPaidThruDate.getText();
	    String st28 = AFBACustomerPortalMainPage.FifthBalanceDue.getText();
	    String st38 = AFBACustomerPortalMainPage.FifthSuspenseAmount.getText();
	    String st39 = AFBACustomerPortalMainPage.FifthAmountToPay.getText();
	    System.out.println(st16+"  "+st17+"  "+st18+"   "+st19+"       "+st28+"        "+st38+"            "+st39);
	    
	    String st20 = AFBACustomerPortalMainPage.SixAccountNum.getText();
	    String st21 = AFBACustomerPortalMainPage.SixInsuredName.getText();
	    String st22 = AFBACustomerPortalMainPage.SixStatus.getText();
	    String st23 = AFBACustomerPortalMainPage.SixPaidThruDate.getText();
	    String st29 = AFBACustomerPortalMainPage.SixBalanceDue.getText();
	    String st40 = AFBACustomerPortalMainPage.SixthSuspenseAmount.getText();
	    String st41 = AFBACustomerPortalMainPage.SixAmountToPay.getText();
	    System.out.println(st20+"   "+st21+"  "+st22+"  "+st23+"      "+st29+"        "+st40+"           "+st41);
	    String st42 = AFBACustomerPortalMainPage.TotalAmountToPay.getText();
	    System.out.println(st42 + "\n");
	    
	    String st43 = AFBACustomerPortalMainPage.ButtomText.getText();
	    System.out.println(st43 + "\n");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

	
}
