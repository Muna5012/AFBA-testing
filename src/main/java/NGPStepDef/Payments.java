package NGPStepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NGPPayments;
import utilities.TestBase;

public class Payments extends TestBase {
	
@When("login NGP and select Payment button")
public void login_NGP_and_select_Payment_button() {
	NGPPayments.Payments.click();
	act.pause(5000).perform();
	
}

//@Then("Select Recently Viewed")
//public void select_Recently_Viewed() {
//	NGPPage.RecentlyViewed.click();
//	act.pause(3000).perform();
//  
//}
//
//@Then("Select All the list")
//public void select_All_the_list() {
//	NGPPage.All.click();
//	act.pause(3000).perform();
//}

@Then("Select February")
public void select_February() {
	NGPPayments.selectFeb.click();
	act.pause(3000).perform();
}

@Then("Check Payment Statement Name, Status, Account, Pay Period and Status")
public void check_Payment_Statement_Name_Status_Account_Pay_Period_and_Status() {
	 act.pause(1000).perform();
	 String str = NGPPayments.PaymentStateName.getText();
	 System.out.println(str);
	 act.pause(2000).perform();
			 
	 String str1 = NGPPayments.PaymentStatemonthandYear.getText();
	 System.out.println(str1 + "\n");
	 act.pause(2000).perform();
					 
	 String str2 = NGPPayments.Account.getText();
	 System.out.println(str2);
	 act.pause(2000).perform();
	 String str3 = NGPPayments.AccountName.getText();
	 System.out.println(str3 + "\n");
	 act.pause(2000).perform();
							  
	 String str4 = NGPPayments.PayPeriod.getText();
	 System.out.println(str4);
	 act.pause(2000).perform();
	 String str5 = NGPPayments.PayPeriodNum.getText();
	 System.out.println(str5 + "\n");
	 act.pause(2000).perform();
									  
	 String str6 = NGPPayments.Statuscheck.getText();
	 System.out.println(str6);
	 act.pause(2000).perform();
	 String str7 = NGPPayments.StatusNew.getText();
	 System.out.println(str7 + "\n");
	 act.pause(2000).perform();
}

@Then("Check Insurance Volume Member, Spouse and Dependant Insurance Volume")
public void check_Insurance_Volume_Member_Spouse_and_Dependant_Insurance_Volume() {
	 String str8 = NGPPayments.InsuranceVolume.getText();
	 System.out.println(str8);
	 act.pause(2000).perform();
	 String str9 = NGPPayments.MemberInsuaranceVolume.getText();
	 System.out.println(str9);
	 act.pause(2000).perform();
	 String str10 = NGPPayments.TotalNumberofMemberInsurance.getText();
	 System.out.println(str10 + "\n");
	 act.pause(2000).perform();
	 
	 
	 String str11 = NGPPayments.SpouseInsuranceVolume.getText();
	 System.out.println(str11 );
	 act.pause(2000).perform();
	 String str12 = NGPPayments.TotallNumOfSpouseInsuranceVolume.getText();
	 System.out.println(str12 + "\n");
	 act.pause(2000).perform();
	 
	 String str13 = NGPPayments.DependantinsuranceVolume.getText();
	 System.out.println(str13 );
	 act.pause(2000).perform();
	 String str14 = NGPPayments.TotallDependantInsuranceVolume.getText();
	 System.out.println(str14 + "\n");
	 act.pause(2000).perform();
}

@Then("Check Member Lives, Spouse Lives, Dependent Lives")
public void check_Member_Lives_Spouse_Lives_Dependent_Lives() {
	String str15 = NGPPayments.MemberLives.getText();
	 System.out.println(str15);
	 act.pause(2000).perform();
	 String str10 = NGPPayments.TotalMemberLives.getText();
	 System.out.println(str10 + "\n");
	 act.pause(2000).perform();
	 
	 
	 String str11 = NGPPayments.SpouseLives.getText();
	 System.out.println(str11 );
	 act.pause(2000).perform();
	 String str12 = NGPPayments.TotalSpouseLives.getText();
	 System.out.println(str12 + "\n");
	 act.pause(2000).perform();
	 
	 String str13 = NGPPayments.DependentLives.getText();
	 System.out.println(str13 );
	 act.pause(2000).perform();
	 String str14 = NGPPayments.TotalDependentLives.getText();
	 System.out.println(str14 + "\n");
	 act.pause(2000).perform();
}

@Then("Check Payment Summary Total Billing, Total Onetime,, Total DFAS, Total Traditional Air, Total Traditional Army")
public void check_Payment_Summary_Total_Billing_Total_Onetime_Total_DFAS_Total_Traditional_Air_Total_Traditional_Army() {
	String str32 = NGPPayments.PaymentSummary.getText();
	 System.out.println(str32);
	 act.pause(2000).perform();
	
	String str16 = NGPPayments.TotalBilling.getText();
	 System.out.println(str16);
	 act.pause(2000).perform();
	 String str17 = NGPPayments.TotalNumberOfBilling.getText();
	 System.out.println(str17 + "\n");
	 act.pause(2000).perform();
	 
	 
	 String str18 = NGPPayments.TotalOneTime.getText();
	 System.out.println(str18 );
	 act.pause(2000).perform();
	 String str19 = NGPPayments.TotalNumberOfOneTime.getText();
	 System.out.println(str19 + "\n");
	 act.pause(2000).perform();
	 
	 String str20 = NGPPayments.TotalDFAS.getText();
	 System.out.println(str20 );
	 act.pause(2000).perform();
	 String str21 = NGPPayments.TotalNumberOfDFAS.getText();
	 System.out.println(str21 + "\n");
	 act.pause(2000).perform();
	 
	String str22 = NGPPayments.TotalTraditionalAir.getText();
	System.out.println(str22);
	act.pause(2000).perform();
	String str23 = NGPPayments.TotalNumberOfTraditionalAir.getText();
	System.out.println(str23 + "\n");
	act.pause(2000).perform();
		 
		 
	String str24 = NGPPayments.TotalTraditionalArmy.getText();
	System.out.println(str24);
	act.pause(2000).perform();
	String str25 = NGPPayments.TotalNumberOfTraditionalArm.getText();
	System.out.println(str25 + "\n");
	act.pause(2000).perform();
}

@Then("Check the Payment Summary of Total AGR Air, Total AGR Army, Total Retired, Previous Statements Balance")
public void check_the_Payment_Summary_of_Total_AGR_Air_Total_AGR_Army_Total_Retired_Previous_Statements_Balance() {

	String str26 = NGPPayments.TotalAGRAir.getText();
	System.out.println(str26);
	act.pause(2000).perform();
	String str27 = NGPPayments.TotalNumberOfAGRAir.getText();
	System.out.println(str27 + "\n");
	act.pause(2000).perform();
	
	 String str28 = NGPPayments.TotalAGRArmy.getText();
	 System.out.println(str28 );
	 act.pause(2000).perform();
	 String str29 = NGPPayments.TotalNumberOfAGRArmy.getText();
	 System.out.println(str29+ "\n");
	 act.pause(2000).perform();
	 
	String str30 = NGPPayments.TotalRetired.getText();
	System.out.println(str30);
	act.pause(2000).perform();
	String str31 = NGPPayments.TotalNumberOfRetired.getText();
	System.out.println(str31 + "\n");
	act.pause(2000).perform();
	
	String str33 = NGPPayments.PreviousStatmentBalance.getText();
	System.out.println(str33);
	act.pause(2000).perform();
	String str34 = NGPPayments.NumberOfPreviousStatmentBalance.getText();
	System.out.println(str34 + "\n");
	act.pause(2000).perform();
		 
}

@Then("Check the Payment Summary of Inforce Contribution, Total Allocation, Current Statemnt Balance, Total Association Fee, Check Amount")
public void check_the_Payment_Summary_of_Inforce_Contribution_Total_Allocation_Current_Statemnt_Balance_Total_Association_Fee_Check_Amount() {
	String str35 = NGPPayments.InforceContribution.getText();
	System.out.println(str35);
	act.pause(2000).perform();
	String str36 = NGPPayments.TotalNumberOfInforceContribution.getText();
	System.out.println(str36 + "\n");
	act.pause(2000).perform();
	
	 String str37 = NGPPayments.TotalAllocation.getText();
	 System.out.println(str37 );
	 act.pause(2000).perform();
	 String str38 = NGPPayments.TotalnumberofAllocation.getText();
	 System.out.println(str38+ "\n");
	 act.pause(2000).perform();
	 
	String str39 = NGPPayments.CurrentStatmentBalance.getText();
	System.out.println(str39);
	act.pause(2000).perform();
	String str40 = NGPPayments.NumberOfCurrentStatmentBalance.getText();
	System.out.println(str40 + "\n");
	act.pause(2000).perform();
	
	String str41 = NGPPayments.TotalAssociationFee.getText();
	System.out.println(str41);
	act.pause(2000).perform();
	String str42 = NGPPayments.TotalNumberOfAssociationFee.getText();
	System.out.println(str42 + "\n");
	act.pause(2000).perform();
	
	String str43 = NGPPayments.CheckAmount.getText();
	System.out.println(str43);
	act.pause(2000).perform();
	String str44 = NGPPayments.TotalCheckAmount.getText();
	System.out.println(str44 + "\n");
	act.pause(2000).perform();
	
	String str45 = NGPPayments.CreatedBy.getText();
	System.out.println(str45);
	act.pause(2000).perform();
	String str46 = NGPPayments.NameOfCreated.getText();
	System.out.println(str46 + "\n");
	act.pause(2000).perform();
	
	String str47 = NGPPayments.LastModifiedBy.getText();
	System.out.println(str47);
	act.pause(2000).perform();
	String str48 = NGPPayments.NameOfLastModifiedBy.getText();
	System.out.println(str48 + "\n");
	act.pause(2000).perform();
	
}

}
