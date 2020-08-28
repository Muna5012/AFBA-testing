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
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[4]/div[2]/div/div[2]/span/span")
	public static WebElement TotalCheckAmount;
	
	@FindBy(xpath="//*[contains(text(),'Created By')]")
	public static WebElement CreatedBy;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[10]/div[1]/div/div[2]/span")
	public static WebElement NameOfCreated;
	
	@FindBy(xpath="//*[contains(text(),'Last Modified By')]")
	public static WebElement LastModifiedBy;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div/div/article/div[2]/div/div[3]/div/div/div[10]/div[2]/div/div[2]")
	public static WebElement NameOfLastModifiedBy;
	
	
	
	
	@FindBy(xpath="//*[contains(text(),'Forgot your password?')]")
	public static WebElement ForgetYourPassword;
	
	@FindBy(xpath="//*[@id=\"centerPanel\"]/div/div[2]/div/div[1]/div/span/img")
	public static WebElement NGPPicture;
	
	@FindBy(xpath="//*[@id=\"64:2;a\"]")
	public static WebElement UsernameForgetpassword;
	
	@FindBy(xpath="//*[@id=\"centerPanel\"]/div/div[2]/div/div[3]/div/div[2]/button/span")
	public static WebElement ResetpasswordBtn;
	
	@FindBy(xpath="//*[contains(text(),'PASSWORD RESET')]")
	public static WebElement Passwordreset;
	
	@FindBy(xpath="//*[@id=\"centerPanel\"]/div/div[2]/div/div[2]/div/div[1]/div")
	public static WebElement GetetxtOfPasswordreset;
	
	@FindBy(xpath="//*[contains(text(),'NOW, CHECK YOUR EMAIL')]")
	public static WebElement getTextOfCheckYourEmail;
	
	@FindBy(xpath="//*[@id=\"centerPanel\"]/div/div[2]/div/div[2]/div/div[1]/div")
	public static WebElement GetTextOfCheckEmail;
	
	@FindBy(xpath="//*[@id=\"centerPanel\"]/div/div[2]/div/div[3]/div/div[1]/div/a")
	public static WebElement BacktoLogin;
	
	
	
	@FindBy(xpath="//div[contains(text(),'New')]")
	public static WebElement NewBtn;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[1]/div[1]/div/div/div/input")
	public static WebElement PaymentStatemntName;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/input")
	public static WebElement Accountselect;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li/a/div[2]/div[1]")
	public static WebElement SelectAccount;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li/a/div[2]/div[2]")
	public static WebElement selectNGPaccount;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[3]/div[1]/div/div/div/input")
	public static WebElement PayPeriodInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[4]/div[1]/div/div/div/input")
	public static WebElement MemberInsuranceVolume;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[5]/div[1]/div/div/div/input")
	public static WebElement SpouseInsuranceVolumeInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[6]/div[1]/div/div/div/input")
	public static WebElement DependantInsuranceVolumeInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[7]/div[1]/div/div/div/input")
	public static WebElement InforceContributionInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[8]/div[1]/div/div/div/input")
	public static WebElement InforceMemberContributionInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[9]/div[1]/div/div/div/input")
	public static WebElement forceSpouseContributionInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[10]/div[1]/div/div/div/input")
	public static WebElement forceDependentContributionInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[1]/div/div/a")
	public static WebElement StatusInput;
	
	@FindBy(xpath="/html/body/div[9]/div/ul/li[2]/a")
	public static WebElement NewOne;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[2]/div/div/fieldset/div/div[1]/input")
	public static WebElement Date;
	
	@FindBy(xpath="/html/body/div[10]/div/div[2]/table/tbody/tr[5]/td[2]/span")
	public static WebElement Selectdate;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[2]/div/div/fieldset/div/div[2]/div/input")
	public static WebElement Time;
	
	@FindBy(xpath="/html/body/div[10]/div/ul/li[21]")
	public static WebElement Time10AM;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div/input")
	public static WebElement ProceessedBy;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li/a/div[2]/div[1]")
	public static WebElement SelectMuna;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[4]/div[2]/div/div/div/input")
	public static WebElement InputMemberLives;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[5]/div[2]/div/div/div/input")
	public static WebElement InputSpouseLives;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[6]/div[2]/div/div/div/input")
	public static WebElement InputDependentLives;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[3]/div/button[3]/span")
	public static WebElement SaveBtn;
	
	
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div[3]/div[2]/div/div/div/div/nav/ul/li[2]/a")
	public static WebElement Contacts;
	
	@FindBy(xpath="//a[contains(text(),'AARON GARDINER')]")
	public static WebElement AARONGARDINER;
	
	@FindBy(xpath="//a[contains(text(),'AARON FREE')]")
	public static WebElement AARONFREE;
	
	@FindBy(xpath="//a[contains(text(),'AARIONNA HOLLIDAY')]")
	public static WebElement AARIONNAHOLLIDAY;
	
	@FindBy(xpath="//a[contains(text(),'AALIYAH CARTER')]")
	public static WebElement AALIYAHCARTER;
	
	@FindBy(xpath="//a[contains(text(),'ADAM PATTERSON')]")
	public static WebElement ADAMPATTERSON;
	
	@FindBy(xpath="//a[contains(text(),'ELISABETH DOUGHERTY')]")
	public static WebElement ELISABETHDOUGHERTY;
	
	@FindBy(xpath="//a[contains(text(),'MARGUERITE JOHNSON')]")
	public static WebElement MARGUERITEJOHNSON;
	
	@FindBy(xpath="//a[contains(text(),'JEFFREY AUMEN')]")
	public static WebElement JEFFREYAUMEN;
	
	@FindBy(xpath="//a[contains(text(),'ABDULKARM NKRUMBIH')]")
	public static WebElement ABDULKARMNKRUMBIH;
	
	@FindBy(xpath="//a[contains(text(),'DEREK THOMPSON')]")
	public static WebElement DEREKTHOMPSON;
	
	@FindBy(xpath="//div[contains(text(),'Information Change')]")
	public static WebElement InformationChange;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[1]/div[1]/div/select")
	public static WebElement ClickType;
	
	@FindBy(xpath="//option[contains(text(),'Address Information')]")
	public static WebElement AddressChange;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[2]/div[1]/lightning-input-field/lightning-textarea/div/textarea")
	public static WebElement AddressLine;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[2]/div[2]/lightning-input-field/lightning-input/div/input")
	public static WebElement CityInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[2]/div[3]/lightning-input-field/lightning-input/div/input")
	public static WebElement SatetInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[2]/div[4]/lightning-input-field/lightning-input/div/input")
	public static WebElement CountryInput;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[2]/div[5]/lightning-input-field/lightning-input/div/input")
	public static WebElement InputZipCode;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[2]/div[6]/lightning-input-field/lightning-input/div/input")
	public static WebElement InputPhoneNumber;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[2]/div[8]/lightning-input-field/lightning-input/div/input")
	public static WebElement InputEmail;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[3]/button[2]")
	public static WebElement SaveButton;
	
	
	
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[1]/div[1]/div/select/option[4]")
	public static WebElement DeceasedInformation;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/lightning-input-field[2]/lightning-input/lightning-datepicker/div/div/input")
	public static WebElement DOD;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[3]/button[2]")
	public static WebElement Save;
	
	
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[1]/div[1]/div/select/option[3]")
	public static WebElement MilitaryChange;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[2]/div/div/select")
	public static WebElement BranchInput;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[3]/div/div/select")
	public static WebElement RankInput;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[4]/div/div/select")
	public static WebElement DutyStatusInput;
	
	
	
	
	@FindBy(xpath = "//*[contains(text(),'Portfolio')]")
	public static WebElement Policy;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/div[2]/ul/li/a/div")
	public static WebElement NewPolicy;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[3]/div/button[2]/span")
	public static WebElement NextforNewPolicy;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[1]/div[1]/div/div/div/input")
	public static WebElement PolicyAccount;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/input")
	public static WebElement SelectOwnerClick;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li[1]/a/div[2]/div[1]")
	public static WebElement PolicySelectAALIYAHCARTER;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/div/input")
	public static WebElement SelectInsured;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li[1]/a/div[2]/div[1]")
	public static WebElement InsuredSelectAALIYAHCARTER;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[4]/div[1]/div/div/div/div/div/div[1]/div/input")
	public static WebElement SelectPayor;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[4]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li[1]/a")
	public static WebElement PayAALIYAHCARTER;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[5]/div[1]/div/div/div/input")
	public static WebElement ProductCode;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[6]/div[1]/div/div/div/div/div/div[1]/div/input")
	public static WebElement GroupDetail;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[6]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li/a/div[2]/div[1]")
	public static WebElement SelectNGP;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[7]/div[1]/div/div/div/input")
	public static WebElement ReportingUnitCode;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[8]/div[1]/div/div/div/div/div/div[1]/div/input")
	public static WebElement ReportingUnitDetail;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[8]/div[1]/div/div/div/div/div/div[1]/div/div/div[3]/div/span")
	public static WebElement NewReportingUnit;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[1]/div[1]/div/div/div/input")
	public static WebElement ReportingUnitName;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[1]/div/div/div/input")
	public static WebElement UIC;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[3]/div[1]/div/div/div/input")
	public static WebElement GuardState;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[4]/div[1]/div/div/div/input")
	public static WebElement Branch;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[5]/div[1]/div/div/div/input")
	public static WebElement PointOfContact;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[6]/div[1]/div/div/div/input")
	public static WebElement PRN;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[7]/div[1]/div/div/div/div/div/div[1]/div/input")
	public static WebElement AccountSelect;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[7]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li/a/div[2]/div[1]")
	public static WebElement NGPKS;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[1]/div[2]/div/div/div/input")
	public static WebElement PhoneNum;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[3]/div[2]/div/div/div/input")
	public static WebElement StreetEnter;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[2]/div/div/div/input")
	public static WebElement FaxEnter;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[4]/div[2]/div/div/div/input")
	public static WebElement CityEnter;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[5]/div[2]/div/div/div/input")
	public static WebElement StateEnter;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[6]/div[2]/div/div/div/input")
	public static WebElement ZipCodeEnter;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[7]/div[2]/div/div/div/input")
	public static WebElement BusinessEmailEnter;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[8]/div[2]/div/div/div/input")
	public static WebElement PersionalEmail;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div[2]/div/div[3]/div/button[3]/span")
	public static WebElement SaveNewReportingUnit;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[9]/div[1]/div/div/div/div/div/div/div/a")
	public static WebElement AffiliationCode;
	
	@FindBy(xpath="/html/body/div[8]/div/ul/li[4]/a")
	public static WebElement ESPPAYROL;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[10]/div[1]/div/div/div/input")
	public static WebElement NumberOfChildren;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[12]/div[1]/div/div/div/input")
	public static WebElement ContactReason;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[1]/div[2]/div/div/div/input")
	public static WebElement NGAssociationFee;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[2]/div[2]/div/div/div/input")
	public static WebElement BalanceDue;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[3]/div[2]/div/div/div/input")
	public static WebElement FrequencyAmount;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[4]/div[2]/div/div/div/input")
	public static WebElement AnnualPremium;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[5]/div[2]/div/div/div/input")
	public static WebElement LastPayment;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[6]/div[2]/div/div/div/input")
	public static WebElement Suspense;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[7]/div[2]/div/div/div/input")
	public static WebElement PaymentFrequency;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[8]/div[2]/div/div/div/input")
	public static WebElement PaymentMethod;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[9]/div[2]/div/div/div/div/input")
	public static WebElement PaidOfDateInput;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[10]/div[2]/div/div/div/div/input")
	public static WebElement LastPaymentDateInput;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div/article/div[3]/div/div/div/div/div[11]/div[2]/div/div/div/div/input")
	public static WebElement ProductEffectiveDate;
	
	@FindBy(xpath="/html/body/div[7]/div[2]/div[2]/div/div[3]/div/button[3]/span")
	public static WebElement SaveNewPolicy;
	
	
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div/div/h1/div/div/span[2]")
	public static WebElement RecentlyViewedOption;
	
	@FindBy(xpath="/html/body/div[7]/div/div/div[1]/div/div/div/div/div[1]/div/ul/li[3]/a/span")
	public static WebElement AllPolicies;
	
	@FindBy(xpath="//*[contains(text(),'NGKS112747')]")
	public static WebElement NGKS112747;

	@FindBy(xpath="//*[contains(text(),'NGKS122438')]")
	public static WebElement NGKS122438;
	
	@FindBy(xpath="//*[contains(text(),'NGKS122439')]")
	public static WebElement NGKS122439;
	
	@FindBy(xpath="//*[contains(text(),'NGKS122440')]")
	public static WebElement NGKS122440;
	
	@FindBy(xpath="//*[contains(text(),'NGKS122442')]")
	public static WebElement NGKS122442;
	
	@FindBy(xpath="//*[contains(text(),'NGKS122444')]")
	public static WebElement NGKS122444;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[1]/div/select")
	public static WebElement SelectTypes;
	
	@FindBy(xpath="//*[contains(text(),'PayMode Information Change')]")
	public static WebElement PayModeInformationChange;
	
	@FindBy(xpath="//*[contains(text(),'Unit Information')]")
	public static WebElement UnitInformation;
	
	@FindBy(xpath="//*[contains(text(),'Terminate all Benefits')]")
	public static WebElement TerminateAllBenefits;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div[2]/div[1]/div/select")
	public static WebElement SelectPaymentMethod;
	
	@FindBy(xpath="//*[contains(text(),'Direct - ACH')]")
	public static WebElement DirectACH;
	
	@FindBy(xpath="//*[contains(text(),'Direct - Check')]")
	public static WebElement DirectCheck;
	
	@FindBy(xpath="//*[contains(text(),'Direct - Credit Card')]")
	public static WebElement DirectCreditCard;
	
	@FindBy(xpath="//option[contains(text(),'NGA Allotment')]")
	public static WebElement NGAAllotment;
	
	@FindBy(xpath="//option[contains(text(),'Direct - Other')]")
	public static WebElement DirectOther;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/lightning-input-field[3]/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/input")
	public static WebElement ContractReason;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[3]/button[2]")
	public static WebElement SavebuttonforPolicy;
	
	
	
	
	
	
	@FindBy(xpath="//*[contains(text(),'Onetime Payment')]")
	public static WebElement OnetimePayment;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[3]/div/div[1]/div/select")
	public static WebElement BillingPeriod;
	
	@FindBy(xpath="//*[contains(text(),'202006')]")
	public static WebElement Select202006;
	
	@FindBy(xpath="//*[contains(text(),'202007')]")
	public static WebElement Select202007;
	
	@FindBy(xpath="//*[contains(text(),'202008')]")
	public static WebElement Select202008;
	
	@FindBy(xpath="//*[contains(text(),'202009')]")
	public static WebElement Select202009;
	
	@FindBy(xpath="//*[contains(text(),'202010')]")
	public static WebElement Select202010;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[5]/lightning-input-field/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/input")
	public static WebElement PaymentType;
	
	@FindBy(xpath="//*[contains(text(),'Direct - Credit Card')]")
	public static WebElement SelectDirectCreditCard;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[5]/lightning-input-field/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[2]/lightning-base-combobox-item[2]")
	public static WebElement SelectCreditCard;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[7]/lightning-input-field/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/input")
	public static WebElement status;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[7]/lightning-input-field/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[2]/lightning-base-combobox-item[2]")
	public static WebElement NewStatue;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[7]/lightning-input-field/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[2]/lightning-base-combobox-item[3]")
	public static WebElement newSettled;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[4]/lightning-input-field/lightning-input/div/input")
	public static WebElement ConfirmationNumber;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[6]/lightning-input-field/lightning-input/div/input")
	public static WebElement CheckNumber;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[8]/lightning-input-field/lightning-input/lightning-datepicker/div/div/input")
	public static WebElement Settlementdate;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/div/div[10]/lightning-input-field/lightning-input/div/input")
	public static WebElement TransactionAmount;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div[2]/section/div[2]/div/form/button[1]")
	public static WebElement SaveIt;
	
	
	
	
	
	
	
	
	
	
	
}
