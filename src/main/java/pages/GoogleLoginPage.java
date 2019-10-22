package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLoginPage {
	
	@FindBy(xpath = "//*[@id='gb_70']")
	public static WebElement SignIn;
	
	@FindBy(xpath = "//*[@id='identifierId']")
	public static WebElement InputEmail;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")
	public static WebElement Next; 
	
	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
	public static WebElement InputPassword;
	
	@FindBy(xpath = "//*[@id='gbwa']/div[1]/a")
	public static WebElement ClickSelect;
	
	@FindBy(xpath = "//*[@id='gb23']/span[1]")
	public static WebElement ClickEmail;
	
	@FindBy(xpath = "//*[@class='TN bzz aHS-bnt']/div[2]")
	public static WebElement ClickInbox;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[6]/div/div[1]/div[3]/div/table/tbody/tr[1]/td[5]/div[2]/span[1]/span")
	public static WebElement SelectFirstEmail;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td[1]/div[2]/div[2]/div/div[3]/div[1]/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[1]/span")
	public static WebElement selectEmail;
	
	@FindBy(xpath = "//*[contains(text(),'Review Application')]")
	public static WebElement ReviewApplicationBtn;
	
	@FindBy(xpath="//*[@id='spouseLastName']")
	public static WebElement LastName;
	
	@FindBy(xpath="//*[@id='spouseLastFourSSN']")
	public static WebElement LastSSN;
	
	@FindBy(xpath="//*[@class='btn btn-lg btn-primary']")
	public static WebElement ReviewAndSignMyApplication;
	
	@FindBy(xpath ="//*[contains(text(),'Review Application Documents to Continue')]")
	public static WebElement ReviewApplicationDocumentBtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[2]/div/div[3]/button")
	public static WebElement CloseBtn;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/span/div/div/div[2]/label[2]/span")
	public static WebElement PaperBtn;
	
	@FindBy(xpath ="//*[@name='step_6_last_name']")
	public static WebElement SponsorLastName;
	
	@FindBy(xpath ="//*[@name='step_6_ssn']")
	public static WebElement SponsorLastSSN;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/span/table/tbody/tr[2]/td[1]")
	public static WebElement verifySSN;	
	
	@FindBy(xpath="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[2]")
	public static WebElement clickModalBodyBtn;
	
	@FindBy(xpath ="//*[@class='btn btn-success btn-sm center btn-sign']")
	public static WebElement SignBtn;
}
