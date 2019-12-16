package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AFBACustomerPortalMainPage {

	@FindBy(xpath="//*[contains(text(),'Welcome')]")
	public static WebElement WelcomeText;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm']/div[1]/div/div/h1/p[2]")
	public static WebElement GetTextOfToTheAFBAMemberPortal;
	
	@FindBy(xpath="//*[contains(text(),'MEMBER NAME')]")
	public static WebElement MemberName;
	
	@FindBy(xpath="//*[contains(text(),'RAD')]")
	public static WebElement NameofMember;
	
	@FindBy(xpath="//*[contains(text(),'PRIMARY MAILING ADDRESS')]")
	public static WebElement PrimaryMailingAddress;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:personalInformation']/div[2]/div")
	public static WebElement AddressOfPrimaryMailing;
	
	@FindBy(xpath="//*[contains(text(),'EMAIL ADDRESS')]")
	public static WebElement EmailAddress;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:personalInformation']/div[4]/div")
	public static WebElement InputAddress;
	
	@FindBy(xpath="//*[contains(text(),'PRIMARY PHONE')]")
	public static WebElement PrimaryPhoneNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:personalInformation']/div[3]/div")
	public static WebElement PhoneNumberForPrimary;
	
	@FindBy(xpath="//*[contains(text(),'MOBILE PHONE NUMBER')]")
	public static WebElement MobilePhoneNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:personalInformation']/div[5]/div")
	public static WebElement NumberOfMobile;
	
	@FindBy(xpath="//*[contains(text(),'Your Active Policies')]")
	public static WebElement YourActivePoliciesText;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:panel2']/div[1]/table/tbody/tr")
	public static WebElement AccountText;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:panel2']/div[2]/table/tbody/tr")
	public static WebElement AccountNumber1;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:panel2']/div[4]/table/tbody/tr")
	public static WebElement AccountNumber2;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:panel2']/div[6]/table/tbody/tr")
	public static WebElement AccountNumber3;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:panel2']/div[8]/table/tbody/tr")
	public static WebElement AccountNumber4;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:panel2']/div[10]/table/tbody/tr")
	public static WebElement AccountNumber5;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:panel2']/div[12]/table/tbody/tr")
	public static WebElement AccountNumber6;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:panel2']/table[3]/tbody/tr/td[2]")
	public static WebElement TotalBalance;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:panel2']/table[3]/tbody/tr/td[3]")
	public static WebElement TotalNumberOfBalance;
	
	@FindBy(xpath="//*[contains(text(),'Quick Links')]")
	public static WebElement GetTextOfQuickLinks;
	
	@FindBy(xpath="/html/body/div/div/div/div/aside/div[2]")
	public static WebElement GetAlltheTextOfQuickLinks;
	
	@FindBy(xpath="//*[contains(text(),'Contact AFBA')]")
	public static WebElement GetTextofContactAFBA;
	
	@FindBy(xpath="/html/body/div/div/div/div/aside/div[4]")
	public static WebElement GetAllTextOfContactAFBA;
	
	
	
	
	
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:theForm:j_id61']")
	public static WebElement EditContactInformationBtn;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[1]/div/div[2]/p")
	public static WebElement GetNameOfText;
	
	@FindBy(xpath="//h1[contains(text(),'Edit Contact Information')]")
	public static WebElement GetTextOfEditContactInfo;
	
	@FindBy(xpath="//*[@id='toggleBtnPwd']")
	public static WebElement EditPasswordClick;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:passwordContainer']/div[1]/h2")
	public static WebElement GetTextChangePassword;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:passwordContainer']/div[2]/div")
	public static WebElement GetTextOldNewConfirmPassword;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:oldPasswordid']")
	public static WebElement OldPassword;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:newPasswordId']")
	public static WebElement NewPassword;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:confirmPasswordId']")
	public static WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id248']")
	public static WebElement ClickSaveBtn;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id249']")
	public static WebElement ClickOKForSaveNewPassword;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:changepasswordFooter']/a")
	public static WebElement ClickCancel;
	
	@FindBy(xpath="/html/body/div/div/div/div/section/div[1]/form/span[2]/div/div[3]/div/div/a")
	public static WebElement EditAddressBtn;
	
	@FindBy(xpath="//*[contains(text(),'Address Change')]")
	public static WebElement GetTextOfAddressChange;
	
	@FindBy(xpath="//*[contains(text(),'Mailing Street')]")
	public static WebElement GetTextOfMallingStreet;
	
	@FindBy(xpath="//*[contains(text(),'Mailing City')]")
	public static WebElement GetTextOfMallingCity;
	
	@FindBy(xpath="//*[contains(text(),'Mailing State')]")
	public static WebElement GetTextOfMallingState;
	
	@FindBy(xpath="//*[contains(text(),'Mailing Zip Code')]")
	public static WebElement GetTextOfMallingZipCode;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:mailingStreetId']")
	public static WebElement MaillingStreet;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:mailingCityId']")
	public static WebElement MallingCity;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:mailingStateId']")
	public static WebElement MaillingStateclick;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:mailingStateId']/option[41]")
	public static WebElement MaillingState;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:mailingZipId']")
	public static WebElement MaillingZipCode;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:j_id336']")
	public static WebElement SaveBtn;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:j_id337']")
	public static WebElement ClickOKForSaveNewAddress;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:emailid']")
	public static WebElement EditEmailAddress;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:emailContainer']/div[1]/h2")
	public static WebElement GetTextOfChnageEmail;
	
	@FindBy(xpath="//label[contains(text(),'Email Address')]")
	public static WebElement GetTextofEmail;
	 
	@FindBy(xpath="//div[contains(text(),'This action')]")
	public static WebElement GetTextOfEmailNotice;
	
	@FindBy(xpath="//*[@id='toggleBtnEmail']")
	public static WebElement EmailAddressChange;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:emailid']")
	public static WebElement inputEmail;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:j_id444']")
	public static WebElement ClickSaveForNewEmail;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:emailFooter']/a")
	public static WebElement ClickCancelForNewEmail;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:emailFooter']/a")
	public static WebElement CloseNewEmailChange;
	
	@FindBy(xpath="/html/body/div/div/div/div/section/div[1]/form/span[2]/div/div[2]/div/div/a")
	public static WebElement EditMilitarySalutation;
	
	@FindBy(xpath="//*[contains(text(),'Salutation Change')]")
	public static WebElement GetTextOfSalutationChange;
	
	@FindBy(xpath="//*[contains(text(),'Branch of Service')]")
	public static WebElement GetTextOfBOS;
	
	@FindBy(xpath="//*[contains(text(),'Rank')]")
	public static WebElement GetTextOfRank;
	
	@FindBy(xpath="//*[contains(text(),'Duty Status')]")
	public static WebElement GetTextDutyStatus;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:eligibility']")
	public static WebElement BranchOfServiceClick;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:eligibility']/option[5]")
	public static WebElement UnitedStatedArmy;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:eligibility']/option[7]")
	public static WebElement UnitedStatedNavy;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:rank']")
	public static WebElement RankClick;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:rank']/option[19]")
	public static WebElement SelectLTCO05Colonel;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:rank']/option[19]")
	public static WebElement SelectMGO08Master;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:dutyStatus']")
	public static WebElement DutyStatusClick;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:dutyStatus']/option[3]")
	public static WebElement Retired;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:dutyStatus']/option[2]")
	public static WebElement Active;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:j_id296']")
	public static WebElement ClickSaveforSalutationChange;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:j_id297']")
	public static WebElement ClickOKforSalutationChange;
	
	@FindBy(xpath="//*[@class='slds-grid slds-wrap']/div[4]/div/div/a")
	public static WebElement EditPrimaryPhoneNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:phoneContainer']/div[1]/h2")
	public static WebElement GetTextOfChangePhone;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:phoneContainer']/div[2]/div/div/label")
	public static WebElement GetTextOfPhoneNumber;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:phoneNumberid']")
	public static WebElement InputPhoneNumberForChange;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:j_id372']")
	public static WebElement ClickSaveForPhoneNumChange;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:j_id373']")
	public static WebElement ClickOkForSavePhoneNumber;
	
	@FindBy(xpath="//*[@class='slds-grid slds-wrap']/div[6]/div/div/a")
	public static WebElement ClickMobilePhoneNumber;
	
	@FindBy(xpath="//h2[contains(text(),'Change Mobile Phone')]")
	public static WebElement GetTextOfChangeMobilePhone;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:mobilePhoneContainer']/div[2]/div/div/label")
	public static WebElement GetTextOfMobilePhoneNumber;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:mobphoneNumberid']")
	public static WebElement InputMobilePhoneNumber;

	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id408']")
	public static WebElement ClickSaveMobilePhone;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id409']")
	public static WebElement ClickOkChangeMobilePhone;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[2]/h3/span")
	public static WebElement DocumentDelivery;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[3]/div")
	public static WebElement DocumentDeliveryAllText;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[3]/div/img")
	public static WebElement Image;
	
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[4]/h3/span")
    public static WebElement GetTexteDelivery;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[5]/div")
    public static WebElement GetTextOfAlleDelivery;
    
    @FindBy(xpath="//*[@id='toggle-desc']/span[1]")
    public static WebElement ClickYesCheckBoxforDeliveryPreference;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[6]/h3/span/b")
    public static WebElement TextAlertPreference;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[7]")
    public static WebElement TextAlertPreferenceGetALlText;
    
    @FindBy(xpath="/html/body/div/div/div/div/section/div[1]/form/div[7]/div/div[1]/div/label/span[1]/span[1]")
    public static WebElement ClickCheckBoxforTextAlert;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[7]/div/div[2]/div/span/label/span[1]")
    public static WebElement TextAlertRadioBtn1;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[7]/div/div[3]/div/span/label/span[1]")
    public static WebElement TextAlertRadioBtn2;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[7]/div/div[4]/div/span/label/span[1]")
    public static WebElement TextAlertRadioBtn3;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[7]/div/p[2]/a")
    public static WebElement ClickHere;
    
    @FindBy(xpath="//*[contains(text(),'Marketing Preference:')]")
    public static WebElement MarketingPreference;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[9]/div/div/div")
    public static WebElement GetTextOfAllMarketingPreference;;
    
    @FindBy(xpath="/html/body/div/div/div/div/section/div[1]/form/div[9]/div/div/div/label/span[1]/span[1]")
    public static WebElement ClickCheckBoxMarketingAlert;
    
    @FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:j_id48:j_id211']")
    public static WebElement SaveChangesBtn;
    
    @FindBy(xpath="//*[contains(text(),'Save Status')]")
    public static WebElement GetTextOfSaveStatus;
    
    @FindBy(xpath="//*[contains(text(),'Record updated Successfully.Thank you!')]")
    public static WebElement GetTextOfNotiesForSaveStatus;
    
    @FindBy(xpath="//*[@id='modalSuccess']/div/div[3]/input")
    public static WebElement OkForContactInfoChanges;
    
    @FindBy(xpath="/html/body/div/div/div/div/section/div[1]/form/div[9]/div/div/div/label/span[2]/span")
    public static WebElement GetTextOfVarify;
    
    
   
    
    
    @FindBy(xpath="//*[contains(text(),'Set Up Recurring Payments')]")
    public static WebElement ClickSetUpRecurringPAymentBtn;
    
    @FindBy(xpath="//*[contains(text(),'Payment Details For Recurring Payments')]")
    public static WebElement GetTextOfPaymentDetailsForRecurringPayments;
    
    @FindBy(xpath="//*[contains(text(),'Credit Card')]")
    public static WebElement GetTextCreditCard;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:paymentDetails:j_id73:0']")
    public static WebElement SelectCreditCard;
    
    @FindBy(xpath="//*[contains(text(),'Card Type')]")
    public static WebElement GetTextCardType;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:ccDetails:j_id77:j_id79']/option[1]")
    public static WebElement SelectVisa;
    
    @FindBy(xpath="//*[contains(text(),'Cardholder Name')]")
    public static WebElement GetTextCardHolderName;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:ccDetails:j_id81:j_id83']")
    public static WebElement CardHolderName;
    
    @FindBy(xpath="//*[contains(text(),'Card Number')]")
    public static WebElement GetTextOfCardNumber;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:ccDetails:j_id84:j_id86']")
    public static WebElement CardNumber;
    
    @FindBy(xpath="//*[contains(text(),'Expiration Date')]")
    public static WebElement GetTextOfExpirationDate;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:ccDetails:j_id87:expiration']/option[1]")
    public static WebElement MounthForExpirationDate;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:ccDetails:j_id87:j_id91']/option[4]")
    public static WebElement YearForExpirationDate;
    
    @FindBy(xpath="//*[contains(text(),'CVV Number')]")
    public static WebElement GetTextOfCVV; 
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:ccDetails:j_id94:j_id96']")
    public static WebElement CVV;
    
    @FindBy(xpath="//*[contains(text(),'Billing Zip code')]")
    public static WebElement GetTextBillingZipCode;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:ccDetails:j_id97:j_id99']")
    public static WebElement ZipCode;
    
    @FindBy(xpath="//*[contains(text(),'Selected')]")
    public static WebElement GetTextOfSelected;
    
    @FindBy(xpath="//div[contains(text(),'Account')]")
    public static WebElement GetTextOfAccount;
    
    @FindBy(xpath="//div[contains(text(),'Insured')]")
    public static WebElement GetTextOfInsured;
    
    @FindBy(xpath="//div[contains(text(),'Relation')]")
    public static WebElement GetTextOfRelation;
    
    @FindBy(xpath="//div[contains(text(),'Status')]")
    public static WebElement GetTextOfStatus;
    
    @FindBy(xpath="//div[contains(text(),'Payment Day')]")
    public static WebElement GetTextOfPaymentDay;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id120']/input")
    public static WebElement Select1;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id120']/input")
    public static WebElement Select2;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id120']/input")
    public static WebElement Select3;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id120']/input")
    public static WebElement Select4;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id120']/input")
    public static WebElement Select5;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id120']/input")
    public static WebElement Select6;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id122']")
    public static WebElement GetTextOfFirstAccount;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id124']/span")
    public static WebElement GetTextOfFirstInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id126']/span")
    public static WebElement GetTextOfFirstRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id128']/span")
    public static WebElement GetTextOfFirstStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id130']/select/option[5]")
    public static WebElement FirstPaymentDay3;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id122']")
    public static WebElement GetTextOfSecondAccountNum;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id124']/span")
    public static WebElement GetTextOfSecondInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id126']/span")
    public static WebElement GetTextOfSecondRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id128']/span")
    public static WebElement GetTextOfSecondStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id130']/select/option[6]")
    public static WebElement SecondPaymentDay5;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id122']")
    public static WebElement GetTextOfThirdAccountNum;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id124']/span")
    public static WebElement GetTextOfThirdInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id126']/span")
    public static WebElement GetTextOfThirdRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id128']/span")
    public static WebElement GetTextOfThirdStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id130']/select/option[11]")
    public static WebElement ThirdPaymentDay5;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id122']")
    public static WebElement GetTextOfForthAccountNum;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id124']/span")
    public static WebElement GetTextOfForthInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id126']/span")
    public static WebElement GetTextOfForthRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id128']/span")
    public static WebElement GetTextofForthStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id122']")
    public static WebElement GetTextOfFifthAccountNum;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id130']/select/option[15]")
    public static WebElement FourtPaymentDay14;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id124']/span")
    public static WebElement GetTextOfInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id126']/span")
    public static WebElement GetTextOfFifthRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id128']/span")
    public static WebElement GetTextOfFifthStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id130']/select/option[23]")
    public static WebElement FifthPaymentDay4;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id122']")
    public static WebElement GetTextOfSixAccountNum;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id124']/span")
    public static WebElement GetTextOfSixInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id126']/span")
    public static WebElement GetTextOfSixRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id128']/span")
    public static WebElement GetTextOfSixStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id130']/select/option[9]")
    public static WebElement SixPaymentDay6;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id138']")
    public static WebElement Click;
    
    @FindBy(xpath="//*[contains(text(),'I authorize')]")
    public static WebElement GetTextIAuthorize;
    
    @FindBy(xpath = "//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id143']")
    public static WebElement ClickProcess;
    
    @FindBy(xpath="//div[@class='messageText']")
    public static WebElement GetTextOfConfirmation;
    
    @FindBy(xpath="//*[contains(text(),'E-Check')]")
    public static WebElement GetTextECheck;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:paymentDetails:j_id73:1']")
    public static WebElement ECheck;
    
    @FindBy(xpath="//*[contains(text(),'Account Type')]")
    public static WebElement GetTextAccountType;
    
    @FindBy(xpath="//*[contains(text(),'Routing Number')]")
    public static WebElement GetTextRoutingNum;
    
    @FindBy(xpath="//*[contains(text(),'Account Number')]")
    public static WebElement GetTextAccountNum;
        
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:checkDetails:j_id100:j_id102']/option[1]")
    public static WebElement Checking;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:checkDetails:j_id104:j_id106']")
    public static WebElement InputRoutingNum;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:checkDetails:j_id107:j_id109']")
    public static WebElement InputAccountNum;
    
    @FindBy(xpath="//*[contains(text(),'Bank Details')]")
    public static WebElement BankDetails;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:checkDetails:j_id110:j_id112']")
    public static WebElement GetTextOfBanking;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id121']")
    public static WebElement ECSelect1;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id121']")
    public static WebElement ECSelect2;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id121']")
    public static WebElement ECSelect3;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id121']")
    public static WebElement ECSelect4;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id121']")
    public static WebElement ECSelect5;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id121']")
    public static WebElement ECSelect6;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id122']")
    public static WebElement ECFirstAccountNum;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id122']")
    public static WebElement ECSecondAccountNum;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id122']")
    public static WebElement ECThirdAccount;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id122']")
    public static WebElement ECForthAccountNum;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id122']")
    public static WebElement ECFifthAccountNum;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id122']")
    public static WebElement ECSixAccount;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id124']/span")
    public static WebElement ECFirstInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id124']/span")
    public static WebElement ECSecondInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id124']/span")
    public static WebElement ECThirdInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id124']/span")
    public static WebElement ECForthInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id124']/span")
    public static WebElement ECFifthInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id124']/span")
    public static WebElement ECSixInsuredName;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id126']/span")
    public static WebElement ECFirstRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id126']/span")
    public static WebElement ECSecondRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id126']/span")
    public static WebElement ECThirdRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id126']/span")
    public static WebElement ECForthRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id126']/span")
    public static WebElement ECFifthRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id126']/span")
    public static WebElement ECSixRelation;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id128']/span")
    public static WebElement ECFirstStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id126']/span")
    public static WebElement ECSecondStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id126']/span")
    public static WebElement ECThirdStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id126']/span")
    public static WebElement EcForthStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id126']/span")
    public static WebElement ECFifthStatus;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id126']/span")
    public static WebElement ECSixStatus;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:0:j_id131']/option[11]")
    public static WebElement PaymentDay10;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:1:j_id131']/option[10]")
    public static WebElement PaymentDay9;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:2:j_id131']/option[8]")
    public static WebElement PaymentDay7;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:3:j_id131']/option[5]")
    public static WebElement PaymentDay4;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:4:j_id131']/option[15]")
    public static WebElement PaymentDay14;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id119:5:j_id131']/option[18]")
    public static WebElement PaymentDay17;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:j_id44:regBlock:ConfirmScreen']/div/input")
    public static WebElement ECIAuthorize;
    
    @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:j_id44:regBlock:j_id143']")
    public static WebElement ECClickProcess;
    
    
    
    
    @FindBy(xpath="//*[contains(text(),'Make a One-time Payment')]")
    public static WebElement ClickMakeOneTimePayment;
    
    @FindBy(xpath="//h3[contains(text(),'Payor Details')]")
    public static WebElement GetTextPayorDetails;
    
    @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id74']/div[2]/table/tbody")
    public static WebElement GetAllTextPayorDetails;
    
    @FindBy(xpath = "//*[contains(text(),'Selected')]")
    public static WebElement GetTextSelected;
    
    @FindBy(xpath="//div[contains(text(),'Account')]")
    public static WebElement GetTextInsured;
   
    @FindBy(xpath="//div[contains(text(),'Status')]")
    public static WebElement GetTextStatus;
    
    @FindBy(xpath="//div[contains(text(),'Paid Thru Date')]")
    public static WebElement GetTextPaidThruDate;
    
    @FindBy(xpath="//div[contains(text(),'Balance Due')]")
    public static WebElement GetTextBalanceDue;
    
    @FindBy(xpath="//div[contains(text(),'Suspense Amount')]")
    public static WebElement GetTextSuspenseAmount;
    
    @FindBy(xpath="//div[contains(text(),'Amount To Pay')]")
    public static WebElement GetTextAmountPay;
    
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:tb']/tr[1]") 
    public static WebElement GetFirstAccount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:tb']/tr[2]")
   public static WebElement GetSecondAccount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:0:j_id101']")
   public static WebElement FirstAccountNum;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:1:j_id101']")
   public static WebElement SecondAccountNum;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:2:j_id101']")
   public static WebElement ThridAccountNum;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:3:j_id101']")
   public static WebElement ForthAccountNum;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:4:j_id101']")
   public static WebElement FifthAccountNum;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:5:j_id101']")
   public static WebElement SixAccountNum;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:0:j_id103']/span")
   public static WebElement FirstInsuredName;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:1:j_id103']/span")
   public static WebElement SecondInsuredName;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:2:j_id103']/span")
   public static WebElement ThirdInsuredName;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:3:j_id103']/span")
   public static WebElement ForthInsuredName;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:4:j_id103']/span")
   public static WebElement FifthInsuredName;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:5:j_id103']/span")
   public static WebElement SixInsuredName;
    
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:0:j_id105']/span")
   public static WebElement FirstStatus;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:1:j_id105']/span")
   public static WebElement SecondStatus;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:2:j_id105']/span")
   public static WebElement ThirdStatus;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:3:j_id105']/span")
   public static WebElement ForthStatus;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:3:j_id105']/span")
   public static WebElement FifthStatus;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:3:j_id105']/span")
   public static WebElement SixStatus;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:0:j_id107']/span")
   public static WebElement FirstPaidThruDate;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:1:j_id107']/span")
   public static WebElement SecondPaidThruDate;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:2:j_id107']/span")
   public static WebElement ThridPaidThruDate;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:3:j_id107']/span")
   public static WebElement ForthPaidThruDate;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:4:j_id107']/span")
   public static WebElement FifthPaidThruDate;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:5:j_id107']/span")
   public static WebElement SixPaidThruDate;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:0:j_id225']")
   public static WebElement FirstBalanceDue;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:1:j_id226']")
   public static WebElement SecondBalanceDue;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:2:j_id227']")
   public static WebElement ThirdBalanceDue;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:3:j_id228']")
   public static WebElement ForthBalanceDue;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:4:j_id229']")
   public static WebElement FifthBalanceDue;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:5:j_id230']")
   public static WebElement SixBalanceDue;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:0:j_id111']/span")
   public static WebElement FirstSuspenseAmount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:1:j_id111']/span")
   public static WebElement SecondSuspenseAmount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:2:j_id111']/span")
   public static WebElement ThirdSuspenseAmount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:3:j_id111']/span")
   public static WebElement ForthSuspenseAmount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:4:j_id111']/span")
   public static WebElement FifthSuspenseAmount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:5:j_id111']/span")
   public static WebElement SixthSuspenseAmount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:0:j_id113']")
   public static WebElement FirstAmountToPay;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:1:j_id113']")
   public static WebElement SecondAmountToPay;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:2:j_id113']")
   public static WebElement ThirdAmountToPay;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:3:j_id113']")
   public static WebElement ForthAmountToPay;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:4:j_id113']")
   public static WebElement FifthAmountToPay;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:5:j_id113']")
   public static WebElement SixAmountToPay;
   
   @FindBy(xpath="//*[contains(text(),'Total Amount')]")
   public static WebElement TotalAmountToPay;
   
   @FindBy (xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:0:j_id100']")
   public static WebElement SelectFirstBenefAccount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:j_id96']")
   public static WebElement GetChangedTotalNum;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:paymentScreen']/div/p")
   public static WebElement GetAllNotes;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id188']")
   public static WebElement ClickNextBtn;
   
   @FindBy(xpath="//*[contains(text(),'Payment Details')]")
   public static WebElement GetTextOfPaymentDetailsForOneTimePayment;
   
   @FindBy(xpath="//*[contains(text(),'Credit Card Details')]")
   public static WebElement GetTextOfCreditCardDetails;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:ccDetails:j_id118:j_id120']/option[1]")
   public static WebElement Visa;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:ccDetails:j_id122:j_id124']")
   public static WebElement InputCardholderName;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:ccDetails:j_id125:j_id127']")
   public static WebElement InputCreditCardNum;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:ccDetails:j_id128:expiration']/option[1]")
   public static WebElement SelectDEC;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:ccDetails:j_id128:j_id132']/option[4]")
   public static WebElement SelectYear;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:ccDetails:j_id135:j_id137']")
   public static WebElement InputCVV;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:ccDetails:j_id138:j_id140']")
   public static WebElement InputZipCode;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id186']")
   public static WebElement ClickPayNow;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:0:j_id168']/span")
   public static WebElement GetTextOfFirstAccountNumOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:0:j_id170']/span")
   public static WebElement GetTextOfFirstInsuredNameOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:0:j_id172']/span")
   public static WebElement GetTextOfFirstStatusOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:0:j_id174']/span")
   public static WebElement GetTextOfFirstPaidThruDateOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:0:j_id177']")
   public static WebElement GetTextOfFirstBalanceDueOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:0:j_id179']/span")
   public static WebElement GetTextOfFirstSuspenseAmount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:0:j_id181']/span")
   public static WebElement GetTextOfFirstAmountToPay;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:1:j_id168']/span")
   public static WebElement GetTextOfSecondAccountNumOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:1:j_id170']/span")
   public static WebElement GetTextOfSecondInsuredNameOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:1:j_id172']/span")
   public static WebElement GetTextOfSecondStatusOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:1:j_id174']/span")
   public static WebElement GetTextOfSecondPaidThruDateOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:1:j_id177']")
   public static WebElement GetTextOfSecondBalanceDueOTP;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:1:j_id179']/span")
   public static WebElement GetTextOfSecondSuspenseAmount;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id163:j_id164:1:j_id181']/span")
   public static WebElement GetTextOfSecondAmountToPay;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:j_id47:j_id48:j_id49:0:j_id50:j_id51:j_id53']")
   public static WebElement GetTextOfSubmition;
   
   @FindBy(xpath="//*[@name='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id95:1:j_id100']")
   public static WebElement SelectSecondPolicy;
   
   @FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:j_id47:j_id48:j_id49:0:j_id50:j_id51:j_id53']")
   public static WebElement GetTextOfPleaseSelectAtLeastOnePolicyForPayment;
   
   
   
   @FindBy(xpath="//*[contains(text(),'Download Forms')]")
   public static WebElement DownloadForm;
   
   @FindBy(xpath="//*[contains(text(),'Financial Planning Guide')]")
   public static WebElement FinancialPlaningGuide;
   
   @FindBy(xpath="//*[contains(text(),'Change Beneficiary')]")
   public static WebElement ChangeBene;
   
   @FindBy(xpath="//*[contains(text(),'Change of Name')]")
   public static WebElement ChangeName;
   
   @FindBy(xpath="//*[contains(text(),'Allotment Authorization')]")
   public static WebElement AllotmentAuthorization;
   
   @FindBy(xpath="//*[contains(text(),'Allotment Instructions')]")
   public static WebElement AllotmentInstructions;
   
   @FindBy(xpath="//span[contains(text(),'Download')]")
   public static WebElement ClickDownload;
   
   
}