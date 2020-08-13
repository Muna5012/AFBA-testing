package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NGPPayments {

	@FindBy(xpath = "//*[@id='47:2;a']")
	public static WebElement Username;
	
	@FindBy(xpath = "//*[@id=\"59:2;a\"]")
	public static WebElement Password;

	@FindBy(xpath = "//*[contains(text(),'Log in')]")
	public static WebElement Login;
	
	@FindBy(xpath = "//*[contains(text(),'Payments')]")
	public static WebElement Payments;
	
	@FindBy(xpath = "//*[contains(text(),'Recently Viewed')]")
	public static WebElement RecentlyViewed;
	
	@FindBy(xpath = "//*[@id=\"virtualAutoCompleteMenuOption_9fb0a05da7c37\"]")
	public static WebElement All;
	
	@FindBy(css =" [title*='Kansas-202002']")
	public static WebElement selectFeb;
	
	@FindBy(xpath="//*[@id=\"3038:0\"]")
	public static WebElement GetTexFName;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[1]/div/div/div[1]/div[1]/div/div[1]/span")
	public static WebElement PaymentStateName;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[1]/div/div/div[1]/div[1]/div/div[2]/span/span")
	public static WebElement PaymentStatemonthandYear;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div[1]/span")
	public static WebElement Account;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div[2]/span/div/a")
	public static WebElement AccountName;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[1]/div/div/div[3]/div[1]/div/div[1]/span")
	public static WebElement PayPeriod;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[1]/div/div/div[3]/div[1]/div/div[2]/span/span")
	public static WebElement PayPeriodNum;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[1]/div/div/div[1]/div[2]/div/div[1]/span")
	public static WebElement Statuscheck;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[1]/div/div/div[1]/div[2]/div/div[2]/span/span")
	public static WebElement StatusNew;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/h3/button/span")
	public static WebElement InsuranceVolume;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/span")
	public static WebElement MemberInsuaranceVolume;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div[2]/span/span")
	public static WebElement TotalNumberofMemberInsurance;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div[1]/span")
	public static WebElement SpouseInsuranceVolume;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div[2]/span/span")
	public static WebElement TotallNumOfSpouseInsuranceVolume;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[3]/div[1]/div/div[1]/span")
	public static WebElement DependantinsuranceVolume;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[3]/div[1]/div/div[2]/span/span")
	public static WebElement TotallDependantInsuranceVolume;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/span")
	public static WebElement MemberLives;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/span/span")
	public static WebElement TotalMemberLives;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/span")
	public static WebElement SpouseLives;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/span/span")
	public static WebElement TotalSpouseLives;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div[1]/span")
	public static WebElement DependentLives;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div[2]/span/span")
	public static WebElement TotalDependentLives;
	
	
	@FindBy(xpath="//*[contains(text(),'Payment Summary')]")
	public static WebElement PaymentSummary;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/span")
	public static WebElement TotalBilling;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/span/span")
	public static WebElement TotalNumberOfBilling;
	
	@FindBy(xpath="//*[contains(text(),'Total Onetime')]")
	public static WebElement TotalOneTime;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[2]/span/span")
	public static WebElement TotalNumberOfOneTime;
	
	@FindBy(xpath="//*[contains(text(),'Total DFAS')]")
	public static WebElement TotalDFAS;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[3]/div[1]/div/div[2]/span/span")
	public static WebElement TotalNumberOfDFAS;
	
	@FindBy(xpath="//*[contains(text(),'Total Traditional Air')]")
	public static WebElement TotalTraditionalAir;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[4]/div[1]/div/div[2]/span/span")
	public static WebElement TotalNumberOfTraditionalAir;
	
	@FindBy(xpath="//*[contains(text(),'Total Traditional Army')]")
	public static WebElement TotalTraditionalArmy;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[5]/div[1]/div/div[2]/span/span")
	public static WebElement TotalNumberOfTraditionalArm;
	
	@FindBy(xpath="//*[contains(text(),'Total AGR Air')]")
	public static WebElement TotalAGRAir;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[6]/div[1]/div/div[2]/span/span")
	public static WebElement TotalNumberOfAGRAir;
	
	@FindBy(xpath="//*[contains(text(),'Total AGR Army')]")
	public static WebElement TotalAGRArmy;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[7]/div[1]/div/div[2]/span/span")
	public static WebElement TotalNumberOfAGRArmy;
	
	@FindBy(xpath="//*[contains(text(),'Total Retired')]")
	public static WebElement TotalRetired;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[8]/div[1]/div/div[2]/span/span")
	public static WebElement TotalNumberOfRetired;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[1]/div[2]/div/div[1]/span")
	public static WebElement InforceContribution;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[1]/div[2]/div/div[2]/span/span")
	public static WebElement TotalNumberOfInforceContribution;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[2]/div[2]/div/div[1]/span")
	public static WebElement TotalAllocation;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[2]/div[2]/div/div[2]/span/span")
	public static WebElement TotalnumberofAllocation;
	
	@FindBy(xpath="//*[contains(text(),'Previous Statement Balance')]")
	public static WebElement PreviousStatmentBalance;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[9]/div[1]/div/div[2]/span/span")
	public static WebElement NumberOfPreviousStatmentBalance;
	
	@FindBy(xpath="//*[contains(text(),'Current Statement Balance')]")
	public static WebElement CurrentStatmentBalance;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[3]/div[2]/div/div[2]/span/span")
	public static WebElement NumberOfCurrentStatmentBalance;
	
	@FindBy(xpath="//*[contains(text(),'Total Association Fee')]")
	public static WebElement TotalAssociationFee;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[4]/div[2]/div/div[2]/span/span")
	public static WebElement TotalNumberOfAssociationFee;
	
	@FindBy(xpath="//*[contains(text(),'Check Amount')]")
	public static WebElement CheckAmount;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[5]/div[2]/div/div[2]/span/span")
	public static WebElement TotalCheckAmount;
	
	@FindBy(xpath="//*[contains(text(),'Created By')]")
	public static WebElement CreatedBy;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[10]/div[1]/div/div[2]/span")
	public static WebElement NameOfCreated;
	
	@FindBy(xpath="//*[contains(text(),'Last Modified By')]")
	public static WebElement LastModifiedBy;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[10]/div[2]/div/div[2]")
	public static WebElement NameOfLastModifiedBy;
}
