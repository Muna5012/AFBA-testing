package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AFBAMemberPortalLoginPage {

	@FindBy(xpath="//*[@id='sitelogin:loginForm']/feildset/table/tbody/tr[1]/td/h1")
	public static WebElement AccountLogin;
	
	@FindBy(xpath="//*[contains(text(),'Register Here')]")
	public static WebElement RegisterHere;
	
	@FindBy(xpath="//*[contains(text(),'Register with AFBA')]")
	public static WebElement RegisterWithAFBA;
	
	@FindBy(xpath="//input[@id='Registration:theForm:FirstName']")
	public static WebElement FirstName;
	
	@FindBy(xpath="//input[@id='Registration:theForm:LastName']")
	public static WebElement LastName;
	
	@FindBy(xpath="//input[@id='Registration:theForm:SSN']")
	public static WebElement SSN;
	
	@FindBy(xpath="//input[@id='Registration:theForm:BirthDate']")
	public static WebElement DOB;
	
	@FindBy(xpath="//input[@id='Registration:theForm:email']")
	public static WebElement Email;
	
	@FindBy(xpath="//input[@id='Registration:theForm:password']")
	public static WebElement Password;
	
	@FindBy(xpath="//input[@id='Registration:theForm:confirmPassword']")
	public static WebElement ConfirmPassword;
	
	@FindBy(xpath="/html/body/div/div/div/section/p")
	public static WebElement ContactAFBAText;
	
	@FindBy(xpath="//*[@id='Registration:theForm']/fieldset/table/tbody/tr[10]/td/p")
	public static WebElement getTextOnButton;
	
	@FindBy(xpath="//*[contains(text(),'Customer Service Hours')]")
	public static WebElement CustomerServiceHours;
	
	@FindBy(xpath="//*[contains(text(),'Toll-free')]")
	public static WebElement Tellfree;
	
	@FindBy(xpath="//*[contains(text(),'Local')]")
	public static WebElement Local;
	
	@FindBy(xpath="/html/body/div/div/div/aside/div[2]/p/a")
	public static WebElement EmailClick;
	
	@FindBy(xpath="//*[contains(text(),'Address')]")
	public static WebElement Address;
	
	@FindBy(xpath="//h1[contains(text(),'Contact Us')]")
	public static WebElement ContactUs;
	
	@FindBy(xpath="//*[@id='subject']/option[2]")
	public static WebElement SubjectSelectLifeInsurance;
	
	@FindBy(xpath="//input[@id='name']")
	public static WebElement Name;
	
	@FindBy(xpath="//*[@id='00N00000008eSec']")
	public static WebElement SSNorPolicyNumber;
	
	@FindBy(xpath="//*[@id='email']")
	public static WebElement EmailAddress;
	
	@FindBy(xpath="//*[@id='phone']")
	public static WebElement PhoneNumber;
	
	@FindBy(xpath="//*[@name='description']")
	public static WebElement Message;
	
	@FindBy(xpath="//*[@name='submit']")
	public static WebElement SubmitBtn;
	
	@FindBy(xpath="//div[contains(text(), 'Success!')]")
	public static WebElement SuccessBox;
	
	@FindBy(xpath="//*[contains(text(),'Forgot your UserName?')]")
	public static WebElement ForgetYourUserName;
	
	@FindBy (xpath="//div[@class='h3Title']/..")
	public static WebElement ContactAFBA;
	
	@FindBy(xpath="//*[contains(text(),'Login')]")
	public static WebElement LoginBtn;
	
	@FindBy(xpath="//legend[contains(text(),'Forgot Username')]")
	public static WebElement ForgotUserNameText;
	
	@FindBy(xpath="//*[@id='j_id0:theForm:lName']")
	public static WebElement LastNameForForgetUserName;
	
	@FindBy(xpath="//*[@id='j_id0:theForm:dateOfBirth']")
	public static WebElement DOBForForgotUserName;
	
	@FindBy(xpath="//*[@id='j_id0:theForm:ssn']")
	public static WebElement SSNForForgotUserName;
	
	@FindBy(xpath="//*[@id='recaptcha-anchor']/div[1]")
	public static WebElement Robot;
	
	@FindBy(xpath="//input[@class='button']")
	public static WebElement FindUserNameBtn;
	
	@FindBy(xpath="//*[contains(text(),'Forgot your password?')]")
	public static WebElement ForgotYourPassword;
	
	@FindBy(xpath="//*[contains(text(),'Forgot Your Password')]")
	public static WebElement ForgotYourUserNameText;
	
	@FindBy(xpath="//input[@id='j_id0:theForm:username']")
	public static WebElement UserName;
	
	@FindBy(xpath="//input[@id='j_id0:theForm:submit']")
	public static WebElement ForgotYourPasswordSubmitBtn;
	
	@FindBy(xpath="//*[contains(text(),'Welcome')]")
	public static WebElement WelcomeText;
	
	@FindBy(xpath="//*[contains(text(),'to the')]")
	public static WebElement AFBAMemberPortalText;
	
	@FindBy(xpath="//*[contains(text(),'An email')]")
	public static WebElement AnEmailHasBeenSentText;
	
	@FindBy(xpath="//*[contains(text(),'Go to Login Page')]")
	public static WebElement GoToLoginPageClick;
	
	@FindBy(xpath="//a[contains(text(),'Help')]")
	public static WebElement HelpBtn;
	
	@FindBy(xpath="//*[contains(text(),'Frequently Asked Questions')]")
	public static WebElement FrequenrlyAskedQuestionText;
	
	@FindBy(xpath="//*[contains(text(),'How do I login to AFBA Member Portal?')]")
	public static WebElement HowToLoginText;
	
	@FindBy(xpath="//*[contains(text(),'AFBA Member Portal gives')]")
	public static WebElement AFBAExplanations;
	
	@FindBy(xpath="//*[contains(text(),'To gain')]")
	public static WebElement ToGainaccess;
	
	@FindBy(xpath="//*[contains(text(),'1. Go to AFBA Member Portal ')]")
	public static WebElement stepExplanation1;
	
	@FindBy(xpath="//*[contains(text(),'I forgot my password')]")
	public static WebElement ForgetPassword;
	
	@FindBy(xpath="//*[contains(text(),'forgotten your password')]")
	public static WebElement IfYouHaveForgottenIxplanation;
	
	@FindBy(xpath="//*[@id='j_id0:theForm']/p[11]")
	public static WebElement ForgotPasswordExplanation;
	
	
	
	@FindBy(xpath="//*[contains(text(),'I forgot my Username. What can I do?')]")
	public static WebElement ForgetUserName;
	
	@FindBy(xpath="//*[contains(text(),'forgotten your Username')]")
	public static WebElement followstepForForgotenUserNameText;
	
	@FindBy(xpath="//*[@id='j_id0:theForm']/p[16]")
	public static WebElement ForgotUserNameExplanation;
	
	@FindBy(xpath="//*[contains(text(),'How can I receive my documents')]")
	public static WebElement Edeliverytext;
	
	@FindBy(xpath="//*[contains(text(),'You can choose')]")
	public static WebElement ChooseExplanationForeDelivery;
	
	@FindBy(xpath="//*[contains(text(),'To sign up')]")
	public static WebElement eDeliveryStepsText;
	
	@FindBy(xpath="//*[@id='j_id0:theForm']/p[23]")
	public static WebElement eDeliveryExplanation;
	
	
	
	@FindBy(xpath="//*[@id='j_id0:theForm']/p[5]/a[1]/b/span")
	public static WebElement LoginClick1;
	
	@FindBy(xpath="//*[@id='j_id0:theForm']/p[5]/a[2]/b/span")
	public static WebElement RegisterHereBtn;
	
	@FindBy(xpath="//*[@id='j_id0:theForm']/p[11]/a[1]/b/span")
	public static WebElement LoginClick2;
	
	@FindBy(xpath="//*[contains(text(),'Forgot your password?')]")
	public static WebElement ForgetYourPassword;
	
	@FindBy(xpath="//*[@id='j_id0:theForm']/p[11]/a[3]/b/span")
	public static WebElement loginClick3;
	
	
	@FindBy(xpath="//*[@id='j_id0:theForm']/p[16]/a[1]/b/span")
	public static WebElement loginClick4;
	
	@FindBy(xpath="//*[contains(text(),'Forgot your Username?')]")
	public static WebElement ForgetYourUsername;
	
	@FindBy(xpath="//*[contains(text(),'eDelivery')]")
	public static WebElement eDelivery;
	
	
	
	@FindBy(xpath="//*[@id='sitelogin:loginForm:username']")
	public static WebElement UserNameforLogin;
	
	@FindBy(xpath="//*[@id='sitelogin:loginForm:password']")
	public static WebElement PasswordforLogin;
	
	@FindBy(xpath="//*[@id='sitelogin:loginForm:submitbutton']")
	public static WebElement LoginBtnforLoginPage;
	
	
	
	// contains text  //h3[contains(text(), 'Contact AF')]
	// exact match   //h3[.='Contact AFBA']
	
	
	 //p[@style='text-align:left;padding-left: 1.25em; background: #e8e8e8']
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}