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
		  String str3 = AFBACustomerPortalMainPage.GetTextOfToTheAFBAMemberPortal.getText();
			System.out.println(str3 + "\n");
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
	
	
	@Then("Get text of You Active Policies")
	public void get_text_of_You_Active_Policies() {
		String str = AFBACustomerPortalMainPage.YourActivePoliciesText.getText();
		System.out.println(str +"\n");
		act.pause(1000).perform();
	}

	
	@Then("Get text of Account, Coverafe Amount, Balance Due, Paid Thru Date and Download Informations")
	public void get_text_of_Account_Coverafe_Amount_Balance_Due_Paid_Thru_Date_and_Download_Informations() {
		String str = AFBACustomerPortalMainPage.AccountText.getText();
		System.out.println(str + "\n");
		act.pause(2000).perform();
		String str1 = AFBACustomerPortalMainPage.AccountNumber1.getText();
		String str2 = AFBACustomerPortalMainPage.AccountNumber2.getText();
		String str3 = AFBACustomerPortalMainPage.AccountNumber3.getText();
		String str4 = AFBACustomerPortalMainPage.AccountNumber4.getText();
		String str5 = AFBACustomerPortalMainPage.AccountNumber5.getText();
		String str6 = AFBACustomerPortalMainPage.AccountNumber6.getText();
		act.pause(2000).perform();
		System.out.println(str1 +  "\n" + str2 +  "\n" + str3 +  "\n"  + str4 +  "\n"  + str5 +  "\n" + str6 + "\n");
		act.pause(2000).perform();
		String str7 = AFBACustomerPortalMainPage.TotalBalance.getText();
		String str8 = AFBACustomerPortalMainPage.TotalNumberOfBalance.getText();
		System.out.println(str7 +"  "+str8 + "\n");
		act.pause(1000).perform();
		
	}
	
	@Then("Get text of Quick Links, Edit Contact Information, Make a One time Payment, Set Up Recurring Payments, Sign Up for eDelivery and Text Alerts, Request Beneficiary Change, Request Beneficiary Change, Download Forms")
	public void get_text_of_Quick_Links_Edit_Contact_Information_Make_a_One_time_Payment_Set_Up_Recurring_Payments_Sign_Up_for_eDelivery_and_Text_Alerts_Request_Beneficiary_Change_Request_Beneficiary_Change_Download_Forms() {
		String str = AFBACustomerPortalMainPage.GetTextOfQuickLinks.getText();
		System.out.println(str +":");
		act.pause(1000).perform();
		String str2 = AFBACustomerPortalMainPage.GetAlltheTextOfQuickLinks.getText();
		System.out.println(str2 +"\n");
		act.pause(3000).perform();
	}
	
	@Then("Click Download Form Links")
	public void click_Download_Form_Links() {
		AFBACustomerPortalMainPage.DownloadForm.click();
		act.pause(2000).perform();
	}

	@Then("Get text of Financial Planning Guide and get Url link")
	public void get_text_of_Financial_Planning_Guide_and_get_Url_link() {
		String str = AFBACustomerPortalMainPage.FinancialPlaningGuide.getText();
		System.out.println(str +"\n");
		
	//	AFBACustomerPortalMainPage.FinancialPlaningGuide.click();
		act.pause(2000).perform();
	//	driver.get("https://afbafull-afba.cs93.force.com/MemberPortal/apex/BeneficiaryChangeRequest");
	//	act.pause(3000).perform();
		
		String getUrl=AFBACustomerPortalMainPage.FinancialPlaningGuide.getAttribute("href");
		System.out.println("Image source URL : \n"+ getUrl + "\n");
		act.pause(3000).perform();
	}

	@Then("Get text of Change Beneficiary and get URL link")
	public void get_text_of_Change_Beneficiary_and_get_URL_link() {
		String str = AFBACustomerPortalMainPage.ChangeBene.getText();
		System.out.println(str +"\n");
		act.pause(2000).perform();
		
		String getUrl=AFBACustomerPortalMainPage.ChangeBene.getAttribute("href");
		System.out.println("Image source URL : \n"+ getUrl + "\n");
		act.pause(3000).perform();
	}

	@Then("Get text of Change of Name and get URL link")
	public void get_text_of_Change_of_Name_and_get_URL_link() {
		String str = AFBACustomerPortalMainPage.ChangeName.getText();
		System.out.println(str +"\n");
		
		String getUrl=AFBACustomerPortalMainPage.ChangeName.getAttribute("href");
		System.out.println("Image source URL : \n"+ getUrl + "\n");
		act.pause(3000).perform();
	}

	@Then("Get text of Allotment Authorization and get URL link")
	public void get_text_of_Allotment_Authorization_and_get_URL_link() {
		String str = AFBACustomerPortalMainPage.AllotmentAuthorization.getText();
		System.out.println(str +"\n");
		
		String getUrl=AFBACustomerPortalMainPage.AllotmentAuthorization.getAttribute("href");
		System.out.println("Image source URL : \n"+ getUrl + "\n");
		act.pause(3000).perform();
	}

	@Then("Get text of Allotment Instructions and get URL link")
	public void get_text_of_Allotment_Instructions_and_get_URL_link() {
		String str = AFBACustomerPortalMainPage.AllotmentInstructions.getText();
		System.out.println(str +"\n");
		
		String getUrl=AFBACustomerPortalMainPage.AllotmentInstructions.getAttribute("href");
		System.out.println("Image source URL : \n"+ getUrl + "\n");
		act.pause(4000).perform();
	   
	}

	@Then("Get text of Contact AFBA, Customer Service Hours, Toll free, Local, Email, Fax, Address")
	public void get_text_of_Contact_AFBA_Customer_Service_Hours_Toll_free_Local_Email_Fax_Address() {
		String str = AFBACustomerPortalMainPage.GetTextofContactAFBA.getText();
		System.out.println(str +":");
		act.pause(1000).perform();
		String str2 = AFBACustomerPortalMainPage.GetAllTextOfContactAFBA.getText();
		System.out.println(str2 +"\n");
		act.pause(1000).perform();
	}

}
