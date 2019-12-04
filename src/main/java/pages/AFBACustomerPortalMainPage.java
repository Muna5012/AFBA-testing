package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AFBACustomerPortalMainPage {

	@FindBy(xpath="//*[contains(text(),'Welcome')]")
	public static WebElement WelcomeText;
	
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
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:theForm:j_id61']")
	public static WebElement EditContactInformationBtn;
	
	@FindBy(xpath="//*[@id='toggleBtnPwd']")
	public static WebElement EditPasswordClick;
	
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
	
	@FindBy(xpath="/html/body/div/div/div/div/section/div[1]/form/span[2]/div/div[3]/div/div/a")
	public static WebElement EditAddressBtn;
	
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
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id334']")
	public static WebElement SaveBtn;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id335']")
	public static WebElement ClickOKForSaveNewAddress;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:emailid']")
	public static WebElement EditEmailAddress;
	
	@FindBy(xpath="//*[@id='toggleBtnEmail']")
	public static WebElement EmailAddressChange;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:emailid']")
	public static WebElement inputEmail;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id442']")
	public static WebElement ClickSaveForNewEmail;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:emailFooter']/a")
	public static WebElement ClickCancelForNewEmail;
	
	
	
	@FindBy(xpath="/html/body/div/div/div/div/section/div[1]/form/span[2]/div/div[2]/div/div/a")
	public static WebElement EditMilitarySalutation;
	
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
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id294']")
	public static WebElement ClickSaveforSalutationChange;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id295']")
	public static WebElement ClickOKforSalutationChange;
	
	@FindBy(xpath="//*[@class='slds-grid slds-wrap']/div[4]/div/div/a")
	public static WebElement EditPrimaryPhoneNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:phoneNumberid']")
	public static WebElement InputPhoneNumberForChange;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id370']")
	public static WebElement ClickSaveForPhoneNumChange;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id371']")
	public static WebElement ClickOkForSavePhoneNumber;
	
	@FindBy(xpath="//*[@class='slds-grid slds-wrap']/div[6]/div/div/a")
	public static WebElement EditMobilePhoneNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:mobphoneNumberid']")
	public static WebElement InputMobilePhoneNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id407']")
	public static WebElement ClickOkforChangeMobilePhone;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48:j_id406']")
	public static WebElement ClickSaveforChangeMobilePhone;
	
	@FindBy(xpath="//*[contains(text(),'Your Active Policies')]")
	public static WebElement YourActivePoliciesText;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:theForm:panel2\"]/div[1]/table/tbody/tr")
	public static WebElement AccountText;
	
	

	@FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:theForm:panel2\"]/div[2]/table/tbody/tr")
	public static WebElement AccountNumber1;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:theForm:panel2\"]/div[4]/table/tbody/tr")
	public static WebElement AccountNumber2;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:theForm:panel2\"]/div[6]/table/tbody/tr")
	public static WebElement AccountNumber3;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:theForm:panel2\"]/div[8]/table/tbody/tr")
	public static WebElement AccountNumber4;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:theForm:panel2\"]/div[10]/table/tbody/tr")
	public static WebElement AccountNumber5;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:theForm:panel2\"]/table[3]/tbody/tr/td[2]")
	public static WebElement TotalBalance;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:theForm:panel2\"]/table[3]/tbody/tr/td[3]")
	public static WebElement TotalNumberOfBalance;
	
	
	
	
	@FindBy(xpath="//*[contains(text(),'Document Delivery Preference:')]")
	public static WebElement DocumentDelivery;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[3]/div")
	public static WebElement DocumentDeliveryAllText;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:j_id48\"]/div[3]/div/img")
	public static WebElement Image;
	
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[4]/h3/span")
    public static WebElement DeliveryPreference;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[5]/div")
    public static WebElement DeliveryPreferenceAllText;
    
    @FindBy(xpath="//*[@id=\"toggle-desc\"]/span[1]")
    public static WebElement ClickYesCheckBoxforDeliveryPreference;
    
    @FindBy(xpath="//*[contains(text(),'Text Alert Preference:')]")
    public static WebElement TextAlertPreference;
    
    @FindBy(xpath="//*[@id=\"Mainmenu:j_id41:j_id42:j_id48\"]/div[7]")
    public static WebElement TextAlertPreferenceGetALlText;
    
    @FindBy(xpath="/html/body/div/div/div/div/section/div[1]/form/div[7]/div/div[1]/div/label/span[1]/span[1]")
    public static WebElement ClickCheckBoxforTextAlert;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[7]/div/div[2]/div/span/label/span[1]")
    public static WebElement TextAlertRadioBtn1;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[7]/div/div[3]/div/span/label/span[1]")
    public static WebElement TextAlertRadioBtn2;
    
    @FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:j_id48']/div[7]/div/div[4]/div/span/label/span[1]")
    public static WebElement TextAlertRadioBtn3;
    
    @FindBy(xpath="//*[contains(text(),'Marketing Alert Preference:')]")
    public static WebElement MarketingAlertPreference;
    
    @FindBy(xpath="/html/body/div/div/div/div/section/div[1]/form/div[9]/div/div/div/label/span[1]/span[1]")
    public static WebElement ClickCheckBoxMarketingAlert;
    
    @FindBy(xpath="//*[@value='SAVE CHANGES']")
    public static WebElement SaveChangesBtn;
}
