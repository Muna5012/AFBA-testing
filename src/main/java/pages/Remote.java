package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Remote {

	
	@FindBy(xpath = "//input[@id='add-census-ssn-input']")
	public static WebElement SSN;

	@FindBy(xpath = "//*[@id='add-to-census-modal']/div[2]/div/div[2]/div[1]/form/div/div/div[2]/input")
	public static WebElement EnrollmentCity;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[48]" )
	public static WebElement EnrollmentState;
	
	@FindBy(xpath ="/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[6]")
	public static WebElement AS;
	
	@FindBy(xpath ="/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[37]")
	public static WebElement NC;
	
	@FindBy(xpath ="/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[32]")
	public static WebElement NV;
	
	@FindBy(xpath ="/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[29]")
	public static WebElement MO;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[2]")
	public static WebElement AL;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[51]")
	public static WebElement VA;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[12]")
	public static WebElement FL;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[11]")
	public static WebElement DC;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[14]")
	public static WebElement GU;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[24]")
	public static WebElement MD;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[45]")
	public static WebElement SC;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[56]")
	public static WebElement WY;
	
	@FindBy(xpath = "//*[@id='add-to-census-modal']/div[2]/div/div[3]/div/button[2]")
	public static WebElement NextBtn;
	
	@FindBy(xpath ="//*[@id='add-to-census-modal']/div[2]/div/div[3]/div/button[3]")
	public static WebElement BeginEnrollment;
	
	@FindBy(xpath = "//*[@id='add-to-census-modal']/div[2]/div/div[3]/div/button[5]")
	public static WebElement ClickNewSponsor;
	
	@FindBy(xpath= "//input[@id='eeBenefitFName']")
	public static WebElement FirstName;
	
	@FindBy(xpath= "//input[@id='eeBenefitLName']")
	public static WebElement LastName;
	
	@FindBy(name= "eeBenefitDOB")
	public static WebElement DOB;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[1]/div[1]/div[2]/div[2]/div/label[2]/span")
	public static WebElement Gender;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[1]/div[1]/div[2]/div[2]/div/label[1]/span")
	public static WebElement GenderMale;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[1]/div[1]/div[2]/div[3]/div/label[1]/span")
	public static WebElement MarriedBtn;
	
	@FindBy(xpath ="//*[@id='spFName']")
	public static WebElement SpouseFN;
	
	@FindBy(xpath ="//*[@id='spLName']")
	public static WebElement SpouseLN;
	
	@FindBy(xpath ="//*[@id='spDOB']")
	public static WebElement SpouseDOB;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[1]/div[1]/div[2]/div[3]/div/label[2]/span")
	public static WebElement ChildrenBtn;
	
	@FindBy(xpath ="//*[@id='child-first-0']")
	public static WebElement ChildOneFN;
	
	@FindBy(xpath ="//*[@id='child-last-0']")
	public static WebElement ChildOneLN;
	
	@FindBy(xpath ="//*[@id='child-dob-0']")
	public static WebElement ChildOneDOB;
	
	@FindBy(xpath ="//*[@id='addChildBtn']/div/button")
	public static WebElement AddChildBtn;
	
	@FindBy(xpath ="//*[@id='child-first-1']")
	public static WebElement ChildTwoFN;
	
	@FindBy(xpath ="//*[@id='child-last-1']")
	public static WebElement ChildTwoLN;
	
	@FindBy(xpath ="//*[@id='child-dob-1']")
	public static WebElement ChildTwoDOB;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[1]/div[1]/div[2]/div[2]/div/label[1]/span")
	public static WebElement GenderforMale;
	
	@FindBy(xpath="//*[@id='child-first-2']")
	public static WebElement ChildThreeFN;
	
	@FindBy(xpath="//*[@id='child-dob-2']")
	public static WebElement ChildThreeDOB;
	
	@FindBy(xpath="//*[@id='child-first-3']")
	public static WebElement ChildFourFN;
	
	@FindBy(xpath="//*[@id='child-dob-3']")
	public static WebElement ChildFourDOB;
	
	@FindBy(xpath="//*[@id='child-first-4']")
	public static WebElement ChildFifthFN;
	
	@FindBy(xpath="//*[@id='child-dob-4']")
	public static WebElement ChildFifthDOB;
	
	@FindBy(xpath="//*[@id='child-first-5']")
	public static WebElement ChildSixFN;
	
	@FindBy(xpath="//*[@id='child-dob-5']")
	public static WebElement ChildSixDOB;
	
	
	@FindBy(xpath= "//option[@value='Military']")
	public static WebElement Military;
	
	@FindBy(xpath= "//option[@value='Fire Department']")
	public static WebElement FireDepartment;
	
	@FindBy(xpath= "//option[@value='Non-ESP Government']")
	public static WebElement ESP;
	
	@FindBy(xpath= "//option[@value='Law Enforcement']")
	public static WebElement LawEnforcement;
	
	@FindBy(xpath = "//*[contains(text(),'Coast Guard')]")
	public static WebElement CoastGuard;
	
	@FindBy(xpath = "//*[contains(text(),'USPHS')]")
	public static WebElement USPHS;
	
	@FindBy(xpath = "//*[contains(text(),'Air Force')]")
	public static WebElement AirForce;
	
	@FindBy(xpath = "//*[contains(text(),'Marine Corps')]")
	public static WebElement MarineCorps;
	
	@FindBy(xpath="//*[contains(text(),'Navy')]")
	public static WebElement Navy;
	
	@FindBy(xpath = "//*[@name='mil-eligibility-0']/option[8]")
	public static WebElement NOAA;
	
	@FindBy(xpath = "//*[@name='mil-eligibility-0']/option[2]")
	public static WebElement Army;
	
	@FindBy (xpath = "//*[contains(text(),'Active Duty')]")
	public static WebElement ActiveDuty;
	
	@FindBy (xpath = "//*[@name='mil-eligibility-1']/option[7]")
	public static WebElement IRR;
	
	@FindBy (xpath = "//*[contains(text(),'Retiree')]")
	public static WebElement RetireeDuty;
	
	@FindBy (xpath = "//*[contains(text(),'Ready Reserve')]")
	public static WebElement ReadyReserve;
	
	@FindBy(xpath = "//*[contains(text(),'E8')]")
	public static WebElement E8;
	
	@FindBy(xpath = "//*[contains(text(),'E4')]")
	public static WebElement E4; 
	
	@FindBy(xpath = "//*[contains(text(),'E5')]")
	public static WebElement E5; 
	
	@FindBy(xpath = "//*[contains(text(),'E6')]")
	public static WebElement E6; 
	
	@FindBy(xpath = "//*[contains(text(),'E7')]")
	public static WebElement E7; 
	
	@FindBy(xpath = "//*[contains(text(),'E9')]")
	public static WebElement E9; 
	
	@FindBy(xpath = "//*[contains(text(),'O2')]")
	public static WebElement O2; 
	
	@FindBy(xpath = "//*[contains(text(),'O3')]")
	public static WebElement O3; 
	
	@FindBy(xpath = "//*[contains(text(),'O4')]")
	public static WebElement O4; 
	
	@FindBy(xpath = "//*[contains(text(),'O5')]")
	public static WebElement O5; 
	
	@FindBy(xpath = "//*[contains(text(),'O6')]")
	public static WebElement O6;
	
	@FindBy(xpath = "//*[contains(text(),'O7')]")
	public static WebElement O7; 
	
	@FindBy(xpath = "//*[contains(text(),'O8')]")
	public static WebElement O8; 
	
	@FindBy(xpath = "//*[contains(text(),'O10')]")
	public static WebElement O10; 
	
	@FindBy(xpath = "//*[contains(text(),'O9')]")
	public static WebElement O9; 
	
	@FindBy(xpath ="//*[@id='contributionMode']/option[4]")
	public static WebElement MilitaryAllotment;
	
	@FindBy(xpath ="//*[@id='contributionMode']/option[2]")
	public static WebElement CreditCard;
	
	@FindBy(xpath ="//*[@id='contributionMode']/option[3]")
	public static WebElement Checkmatic;
	
	@FindBy(xpath ="//input[@name='deptCode']")
	public static WebElement DepartmentCode;
	
	@FindBy(xpath="//input[@name='sourceCode']")
	public static WebElement SourceCode;
	
	@FindBy(xpath="//*[@id='eeStreet1']")
	public static WebElement Street;
	
	@FindBy (xpath="//*[@id='eeStreet2']")
	public static WebElement Street2;
	
	@FindBy(xpath="//*[@id='eeCity']")
	public static WebElement City;
	
	@FindBy(xpath="//*[@id='eeState']")
	public static WebElement State;
	
	@FindBy(xpath="//input[@id='eeZip']")
	public static WebElement ZipCode;
	
	@FindBy(xpath="//input[@id='email']")
	public static WebElement EmailAddress;
	
	@FindBy(xpath="//input[@id='email_repeat']")
	public static WebElement ReEmailAddress;
	
	@FindBy(xpath ="//input[@id='phone']")
	public static WebElement Phone;
	
	@FindBy(xpath="//*[contains(text(),'Show Coverage Options')]")
	public static WebElement ShowCoverageOptions;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[3]/div/div/label/input")
	public static WebElement WaiveBA;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[3]/div/div/label/input")
	public static WebElement WaiveApplication;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[3]/div/div/label/input")
	public static WebElement WaiveFirstProtect;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[3]/div/div/label/input")
	public static WebElement WaiveFedTerm;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[3]/div/div/label/input")
	public static WebElement WaiveChildProtect;
	
	@FindBy(xpath ="//*[@id='coverage-header-5']/span")
	public static WebElement FedTerm;
	
	@FindBy(xpath ="//*[@id='coverage-header-6']/span")
	public static WebElement FirstProtect;
	
	@FindBy(xpath ="//*[@id='coverage-header-10']/span")
	public static WebElement SeniorProtect;
	
	@FindBy(xpath="//*[@id='coverage-header-7']/span")
	public static WebElement ChildrenProtect;
	
	@FindBy(xpath = "//*[@id='coverage-header-11']")
	public static WebElement ApplicationMemberBenf;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li/div/label[1]/span")
	public static WebElement CoveredAppication;
	
	@FindBy(xpath="//div[@class='pull-right']/label[2]/span")
	public static WebElement Tobacco;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[1]/div/label[2]/span")
	public static WebElement TobaccoforSponsor;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/label[2]/span")
	public static WebElement TobaccoforSpouse;
	
	@FindBy(xpath="//*[@class='btn btn-block btn-sm btn-danger']")
	public static WebElement SeniorProtectOption1;
	
	@FindBy(xpath="//*[@class='btn btn-block btn-sm btn-primary']")
	public static WebElement SeniorProtectOption3;
	
	@FindBy(xpath="//*[@class='btn btn-block btn-sm btn-warning']")
	public static WebElement SeniorProtectOption2;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select")
	public static WebElement SeniorProtectCustomizeClick;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[2]")
	public static WebElement SeniorProtectNoBenefitForSponsor;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[6]")
	public static WebElement SeniorProtectSpouseCustomize25;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li/select/option[6]")
	public static WebElement SeniorProtectoNLYSpouseCustomize25;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[3]")
	public static WebElement FirstProtectSponsorCustomize50;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[3]")
	public static WebElement FirstProtectSpouseCustomize50;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[4]")
	public static WebElement FirstProtectSponsorCustomize100;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[4]")
	public static WebElement FirstProtectSpouseCustomize100;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[3]/select/option[3]")
	public static WebElement FirstProtectAC1Customize50;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[4]/select/option[3]")
	public static WebElement FirstProtectAC2Customize50;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[5]/select/option[3]")
	public static WebElement FirstProtectAC3Customize50;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[2]")
	public static WebElement FirstProtectNoBenefitforSponsor;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[2]")
	public static WebElement FirstProtectNoBenefitForSpouse;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[1]/div/label[2]/span")
	public static WebElement TobaccoSponsor;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/label[2]/span")
	public static WebElement TobaccoSpouse;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[3]/div/label[2]/span")
	public static WebElement AC1Tobacco;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[4]/div/label[2]/span")
	public static WebElement AC2Tobacco;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[5]/div/label[2]/span")
	public static WebElement AC3Tobacco;
	
	@FindBy(xpath="//*[@id='coverage-header-7']/span")
	public static WebElement ChildrenProtectClick;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[1]/div/label[1]/span")
	public static WebElement CoveredForFirstKid;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/label[1]/span")
	public static WebElement CoveredforSecondKid;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[3]/div/label[1]/span")
	public static WebElement CoveredForThrid;
	
	
	
	@FindBy(xpath = "//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[3]")
	public static WebElement BASponsorCustomize50;
	
	@FindBy(xpath = "//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[6]")
	public static WebElement BASponsorCustomize200;
	
	@FindBy(xpath = "//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[4]")
	public static WebElement BASponsorCustomize100;
	
	@FindBy(xpath = "//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[7]")
	public static WebElement BASponsorCustomize250;
	
	@FindBy(xpath = "//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[5]")
	public static WebElement BASponsorCustomize150;
	
	@FindBy(xpath = "//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[3]")
	public static WebElement BASpouseCustomize50;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-sm btn-danger']")
	public static WebElement Option1;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-sm btn-warning']")
	public static WebElement Option2;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-sm btn-primary']")
	public static WebElement Option3;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/select/option[6]")
	public static WebElement ChildrenCover5;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[1]/div/label[2]/span")
	public static WebElement FedTermSponsorTobacco;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/label[2]/span")
	public static WebElement FedTermSpouseTobacco;
	
	@FindBy(xpath="//*[@class='emp-coverage']/option[3]")
	public static WebElement FedTermCustomize50;
	
	@FindBy(xpath="//*[@class='emp-coverage']/option[4]")
	public static WebElement FedTermCustomize100;
	
	@FindBy(xpath="//*[@class='emp-coverage']/option[5]")
	public static WebElement FedTermCustomize150;
	
	@FindBy(xpath="//*[@class='emp-coverage']/option[6]")
	public static WebElement FedTermCustomize200;
	
	@FindBy(xpath="//*[@class='emp-coverage']/option[7]")
	public static WebElement FedTermCustomize250;
	
	@FindBy(xpath="//*[@class='pull-right']/label[2]/span")
	public static WebElement TobaccoforFedTermOrFirstProtect;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-next']")
	public static WebElement NextBtn1;
	
	@FindBy(xpath = "//*[contains(text(),'Answer No to All Questions')]")
	public static WebElement AnswerNOAll;
	
	
	
	@FindBy(xpath = "//*[@id=\"step2\"]/form/div[2]/div[2]/div[2]/div[2]/div[1]/button[2]")
	public static WebElement OISponsor1;
	
	@FindBy(xpath = "//*[@id=\"step2\"]/form/div[2]/div[3]/div[2]/div[2]/div[1]/button[2]")
	public static WebElement OISponsor2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[2]/div[2]/div[2]/div[2]/button[2]")
	public static WebElement OISpouse1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[3]/div[2]/div[2]/div[2]/button[2]")
	public static WebElement OISpouse2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement BASponsor1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement BASponsor2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement BASponsor3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement BASponsor4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement BASponsor5;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement BASponsor6;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement BASponsor7;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement BASpouse1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement BASpouse2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement BASpouse3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement BASpouse4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement BASpouse5;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement BASpouse6;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement BASpouse7;
	
	@FindBy(xpath="//*[@id='step2']/form/div[6]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement SeniorProtectSponsor1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement SeniorProtectSponsor2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement SeniorProtectSponsor3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement SeniorProtectSponsor4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement SeniorProtectSponsor5;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement SeniorProtectSponsor6;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement SeniorProtectSponsor7;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse3;
	
	@FindBy(xpath="//*[@id='step2']/form/div[6]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse4;
	
	@FindBy(xpath="//*[@id='step2']/form/div[6]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse5;
	
	@FindBy(xpath="//*[@id='step2']/form/div[6]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse6;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor1;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor2;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor3;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor4;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor5;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor6;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor7;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[8]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor8;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse3;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse4;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse5;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse6;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse7;
	
	@FindBy(xpath="//*[@id='step2']/form/div[7]/div[1]/table/tbody/tr[8]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse8;
	
	
	
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[2]/div[2]/div[2]/div[1]/button[2]")
	public static WebElement OtherInsuranceSponsor1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[2]/div[2]/div[2]/div[5]/button[2]")
	public static WebElement OtherInsuranceSponsor2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[3]/div[2]/div[2]/div[1]/button[2]")
	public static WebElement OtherInsuranceSponsor3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[3]/div[2]/div[2]/div[5]/button[2]")
	public static WebElement OtherInsuranceSponsor4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[2]/div[2]/div[2]/div[2]/button[2]")
	public static WebElement OtherInsuranceSpouse1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[2]/div[2]/div[2]/div[6]/button[2]")
	public static WebElement OtherInsuranceSpouse2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[3]/div[2]/div[2]/div[2]/button[2]")
	public static WebElement OtherInsuranceSpouse3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[3]/div[2]/div[2]/div[6]/button[2]")
	public static WebElement OtherInsuranceSpouse4;
	
	@FindBy(xpath="//*[@id='step2']/form/div[2]/div[2]/div[2]/div[2]/div[3]/button[2]")
	public static WebElement OtherInsuranAC1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[2]/div[2]/div[2]/div[7]/button[2]")
	public static WebElement OtherInsuranAC2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[3]/div[2]/div[2]/div[3]/button[2]")
	public static WebElement OtherInsuranAC3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[3]/div[2]/div[2]/div[7]/button[2]")
	public static WebElement OtherInsuranAC4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[2]/div[2]/div[2]/div[4]/button[2]")
	public static WebElement OtherInsuranSecondAC1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[2]/div[3]/div[2]/div[2]/div[4]/button[2]")
	public static WebElement OtherInsuranSecondAC2;
	
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement SeniorProtecforSpouse1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement SeniorProtecforSpouse2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement SeniorProtecforSpouse3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement SeniorProtecforSpouse4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[5]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement SeniorProtecforSpouse5;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectforSecondAC1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectforSecondAC2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectforSecondAC3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectforSecondAC4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectforSecondAC5;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectforSecondAC6;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectforSeconsAC7;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement FirstProtectforThridAC1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement FirstProtectforThridAC2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement FirstProtectforThridAC3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement FirstProtectforThridAC4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement FirstProtectforThridAC5;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement FirstProtectforThridAC6;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement FirstProtectforThridAC7;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement ChildProtectMC1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement ChildProtectMC2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement ChildProtectMC3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement ChildProtectMC4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement ChildProtectSecondMC1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement ChildProtectSecondMC2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement ChildProtectSecondMC3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement ChildProtectSecondMC4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement ChildProtectThridMC1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement ChildProtectThridMC2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement ChildProtectThridMC3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[3]/button[2]")
	public static WebElement ChildProtectThridMC4;
	
	
	
	@FindBy (xpath = "//*[@class='btn btn-success btn-next']")
	public static WebElement NextBtn2;
	
	@FindBy(name ="height_feet_null")
	public static WebElement HeightClick;
	
	@FindBy (xpath= "//select[@name='height_feet_null']/option[7]")
	public static WebElement Height5Feet;
	
	@FindBy (xpath= "//select[@name='height_feet_null']/option[8]")
	public static WebElement Height6Feet;
	
	@FindBy (xpath= "//select[@name='height_feet_null']/option[6]")
	public static WebElement Height4Feet;
	
	@FindBy (xpath ="//select[@name='height_inches_null']/option[5]")
	public static WebElement Height3Inches;
	
	@FindBy (xpath ="//select[@name='height_inches_null']/option[6]")
	public static WebElement Height4Inches;
	
	@FindBy (xpath ="//select[@name='height_inches_null']/option[7]")
	public static WebElement Height5Inches;
	
	@FindBy (xpath ="//select[@name='height_inches_null']/option[8]")
	public static WebElement Height6Inches;
	
	@FindBy (xpath ="//select[@name='height_inches_null']/option[9]")
	public static WebElement Height7Inches;
	
	@FindBy (xpath ="//select[@name='height_inches_null']/option[10]")
	public static WebElement Height8Inches;
	
	@FindBy (xpath ="//select[@name='height_inches_null']/option[11]")
	public static WebElement Height9Inches;
	
	@FindBy (xpath ="//select[@name='height_inches_null']/option[12]")
	public static WebElement Height10Inches;
	
	@FindBy (xpath ="//select[@name='height_inches_null']/option[13]")
	public static WebElement Height11Inches;
	
	@FindBy (xpath = "//*[@id='step3-form']/div[2]/div[7]/div/input")
	public static WebElement Weight;
	
	@FindBy(xpath ="//div[@class='wizard-actions']/button[2]")
	public static WebElement NextBtn3;
	
	@FindBy(xpath ="//*[@id='SpouseInfoBlock']/div[3]/div/label[1]/span")
	public static WebElement SpouseGenderMale;
	
	@FindBy(xpath ="//*[@id='SpouseInfoBlock']/div[3]/div/label[2]/span")
	public static WebElement SpouseGenderFamale;
	
	@FindBy(xpath ="//*[@id='spssn']")
	public static WebElement SpouseSSN;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[1]/select/option[7]")
	public static WebElement Spouse5Feet;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[1]/select/option[8]")
	public static WebElement Spouse6Feet;
	
	@FindBy(xpath="//*[@id='sp-height-weight']/div/label[2]/select/option[7]")
	public static WebElement Spouse5Inches;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[2]/select/option[8]")
	public static WebElement Spouse6Inches;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[2]/select/option[9]")
	public static WebElement Spouse7Inches;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[2]/select/option[10]")
	public static WebElement Spouse8Inches;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[2]/select/option[11]")
	public static WebElement Spouse9Inches;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[2]/select/option[12]")
	public static WebElement Spouse10Inches;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[2]/select/option[13]")
	public static WebElement Spouse11Inches;
	
	@FindBy(xpath ="//*[@name='weight_1']")
	public static WebElement SpouseWeight;
	
	@FindBy(xpath ="//*[@id='child-ssn-0']")
	public static WebElement ChildOneSSN;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[3]/div/label[2]/span")
	public static WebElement ChildOneGenderFamale;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[3]/div/label[1]/span")
	public static WebElement ChildOneGenderMale;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[1]/select/option[7]")
	public static WebElement ChildOnet5Feet;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[1]/select/option[8]")
	public static WebElement ChildOnet6Feet;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[2]/select/option[8]")
	public static WebElement ChildOne6Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[2]/select/option[9]")
	public static WebElement ChildOne7Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[2]/select/option[10]")
	public static WebElement ChildOne8Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[2]/select/option[11]")
	public static WebElement ChildOne9Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[2]/select/option[12]")
	public static WebElement ChildOne10Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[2]/select/option[13]")
	public static WebElement ChildOne11Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[6]/div/input")
	public static WebElement ChildOneWeight;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[7]/div/button[1]")
	public static WebElement ChildUSCitizen;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[8]/div/select/option[2]")
	public static WebElement ChildOneRelationshipParent;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[8]/div/select/option[5]")
	public static WebElement ChildOneRelationshipNot;
	
	@FindBy(xpath = "//*[@id='child-ssn-1']")
	public static WebElement ChildTwoSSN;
	
	@FindBy(xpath = "//*[@id='ChildrenInfoBlock']/ul/li[2]/div[3]/div/label[1]/span")
	public static WebElement ChildTwoGenderMale;
	
	@FindBy(xpath = "//*[@id='ChildrenInfoBlock']/ul/li[2]/div[3]/div/label[2]/span")
	public static WebElement ChildTwoGenderFamale;
	
	@FindBy(xpath = "//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[1]/select/option[5]")
	public static WebElement ChildTwo3Feet;
	
	@FindBy(xpath = "//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[1]/select/option[6]")
	public static WebElement ChildTwo4Feet;
	
	@FindBy(xpath = "//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[1]/select/option[7]")
	public static WebElement ChildTwo5Feet;
	
	@FindBy(xpath = "//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[1]/select/option[8]")
	public static WebElement ChildTwo6Feet;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[2]")
	public static WebElement ChildTwo0Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[8]")
	public static WebElement ChildTwo6Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[9]")
	public static WebElement ChildTwo7Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[10]")
	public static WebElement ChildTwo8Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[11]")
	public static WebElement ChildTwo9Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[12]")
	public static WebElement ChildTwo10Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[13]")
	public static WebElement ChildTwo11Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[6]/div/input")
	public static WebElement ChildTwoWeight;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[8]/div/select/option[5]")
	public static WebElement ChildTwoRelationshipG;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[8]/div/select/option[2]")
	public static WebElement ChildTwoRelationshipParent;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[7]/div/button[1]")
	public static WebElement ChildTwoUSCitizenm;
	
	@FindBy(xpath = "//*[@id='child-ssn-2']")
	public static WebElement ChildThreeSSN;
	
	@FindBy(xpath= "//*[@id='ChildrenInfoBlock']/ul/li[3]/div[3]/div/label[2]/span")
	public static WebElement ChildThreeGenderFemale;
	
	@FindBy(xpath= "//*[@id='ChildrenInfoBlock']/ul/li[3]/div[3]/div/label[1]/span")
	public static WebElement ChildThreeGenderMale;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[1]/select/option[5]")
	public static WebElement ChildThree3Feet;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[1]/select/option[6]")
	public static WebElement ChildThree4Feet;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[1]/select/option[7]")
	public static WebElement ChildThree5Feet;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[1]/select/option[8]")
	public static WebElement ChildThree6Feet;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[3]")
	public static WebElement ChildThree1Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[4]")
	public static WebElement ChildThree2Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[5]")
	public static WebElement ChildThree3Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[9]")
	public static WebElement ChildThree7Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[10]")
	public static WebElement ChildThree8Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[11]")
	public static WebElement ChildThree9Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[12]")
	public static WebElement ChildThree10Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[13]")
	public static WebElement ChildThree11Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[6]/div/input")
	public static WebElement ChildThreeWeight;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[7]/div/button[1]")
	public static WebElement ChildThreeUSCitizen;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[8]/div/select/option[5]")
	public static WebElement ChildThreeRelationshipG;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[8]/div/select/option[2]")
	public static WebElement ChildThreeRelationshipParent;
	
	
	@FindBy(xpath="//*[@id='child-ssn-3']")
	public static WebElement Child4SSN;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[4]/div[3]/div/label[1]/span")
	public static WebElement Child4Male;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[4]/div[3]/div/label[2]/span")
	public static WebElement Child4Famale;
	
	@FindBy(xpath="//*[@name='height_feet_6']/option[7]")
	public static WebElement Child4Feet5;
	
	@FindBy(xpath="//*[@name='height_feet_6']/option[5]")
	public static WebElement Child4Feet3;
	
	@FindBy(xpath="//*[@name='height_inches_6']/option[10]")
	public static WebElement Child4Inches8;
	
	@FindBy(xpath="//*[@name='height_inches_6']/option[11]")
	public static WebElement Child4Inches9;
	
	@FindBy(xpath="//*[@name='height_inches_6']/option[9]")
	public static WebElement Child4Inches7;
	
	@FindBy(xpath="//*[@name='height_inches_6']/option[8]")
	public static WebElement Child4Inches6;
	
	@FindBy(xpath="//*[@name='weight_6']")
	public static WebElement Child4Weight;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[4]/div[7]/div/button[1]")
	public static WebElement Child4USCitizenYes;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[4]/div[8]/div/select/option[4]")
	public static WebElement Child4RelationshipGrandParent;
	
	@FindBy(xpath="//*[@id='child-ssn-4']")
	public static WebElement Child5SSN;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[5]/div[3]/div/label[1]/span")
	public static WebElement Child5Male;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[5]/div[3]/div/label[2]/span")
	public static WebElement Child5Famale;
	
	@FindBy(xpath="//*[@name='height_feet_7']/option[7]")
	public static WebElement Child5Feet5;
	
	@FindBy(xpath="//*[@name='height_feet_7']/option[5]")
	public static WebElement Child5Feet3;
	
	@FindBy(xpath="//*[@name='height_inches_7']/option[9]")
	public static WebElement Child5Inches7;
	
	@FindBy(xpath="//*[@name='height_inches_7']/option[10]")
	public static WebElement Child5Inches8;
	
	@FindBy(xpath="//*[@name='height_inches_7']/option[11]")
	public static WebElement Child5Inches9;
	
	@FindBy(xpath="//*[@name='weight_7']")
	public static WebElement Child5Weight;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[5]/div[7]/div/button[1]")
	public static WebElement Child5USCitizen;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[5]/div[8]/div/select/option[3]")
	public static WebElement Child5RelationshipStepParent;
	
	@FindBy(xpath="//*[@id='child-ssn-5']")
	public static WebElement Child6SSN;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[6]/div[3]/div/label[1]/span")
	public static WebElement Child6Male;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[6]/div[3]/div/label[2]/span")
	public static WebElement Child6Famale;
	
	@FindBy(xpath="//*[@name='height_feet_8']/option[7]")
	public static WebElement Chil65Feet5;
	
	@FindBy(xpath="//*[@name='height_feet_8']/option[5]")
	public static WebElement Chil65Feet3;
	
	@FindBy(xpath="//*[@name='height_inches_8']/option[10]")
	public static WebElement Child6Inches8;
	
	@FindBy(xpath="//*[@name='height_inches_8']/option[8]")
	public static WebElement Child6Inches6;
	
	@FindBy(xpath="//*[@name='height_inches_8']/option[9]")
	public static WebElement Child6Inches7;
	
	@FindBy(xpath="//*[@name='height_inches_8']/option[12]")
	public static WebElement Child6Inches10;
	
	@FindBy(xpath="//*[@name='weight_8']")
	public static WebElement Child6Weight;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[6]/div[7]/div/button[1]")
	public static WebElement Child6USCitizen;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[6]/div[8]/div/select/option[5]")
	public static WebElement Child6RelationshipStepParent;
	
	
	
	@FindBy(xpath ="//*[@class='btn btn-success btn-next']")
	public static WebElement Next;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[1]/div[1]/div/label[2]/span")
	public static WebElement BASponsorPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='eeBeneOtherName0']")
	public static WebElement PrimaryBenficiaryFullName;
	
	@FindBy(xpath="//*[@name='eeBeneOtherSSN0']")
	public static WebElement PrimaryBeneficiarySSN;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[2]")
	public static WebElement PrimaryRelationshipAunt;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[3]")
	public static WebElement PrimaryRelationshipBoyFriend;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[4]")
	public static WebElement PrimaryRelationshipBrother;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[5]")
	public static WebElement PrimaryRelationshipChild;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[8]")
	public static WebElement PrimaryRelationshipEstate;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[10]")
	public static WebElement PrimaryRelationshipFather;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[13]")
	public static WebElement PrimaryRelationshipGirlFriend;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[16]")
	public static WebElement PrimaryRelationshipGuardian;

	@FindBy(xpath="//*[@name='eeBeneOtherRelation0']/option[17]")
	public static WebElement PrimaryRelationshipMother;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[21]")
	public static WebElement PrimaryRelationshipForOther;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[28]")
	public static WebElement PrimaryRelationshipForTrust;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[29]")
	public static WebElement PrimaryRelationshipForUncle;
	
	@FindBy(xpath="//*[@name='eeBeneOtherDOB0']")
	public static WebElement PrimaryBeneficiaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[1]/div[2]/div[2]/div[2]/label")
	public static WebElement VarifyDOB;
	
	
	
	@FindBy(xpath = "//*[@id='eeContingentBeneficiaryBlock']/div[1]/div/label[3]/span")
	public static WebElement SomeoneElsee;
	
	@FindBy(xpath = "//input[@name='eeContBeneOtherName0']")
	public static WebElement ContingentBeneficiaryFullName;
	
	@FindBy(xpath = "//input[@name='eeContBeneOtherSSN0']")
	public static WebElement ContingentBeneficiarySSNnumber;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherDOB0']")
	public static WebElement ContingentBeneficiaryDOB;
	
	@FindBy(xpath = "//*[@id='eeContingentBeneficiaryOther']/div[2]/div[2]/label")
	public static WebElement ContingentBeneficiaryDOBVarify;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[2]")
	public static WebElement ContingentBeneficiaryRelationshipAunt;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[3]")
	public static WebElement ContingentBeneficiaryRelationshipBoyFriend;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[4]")
	public static WebElement ContingentBeneficiaryRelationshipBrother;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[5]")
	public static WebElement ContingentBeneficiaryRelationshipChild;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[8]")
	public static WebElement ContingentBeneficiaryRelationshipEstate;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[10]")
	public static WebElement ContingentBeneficiaryRelationshipFather;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[13]")
	public static WebElement ContingentBeneficiaryRelationshipGirlFriend;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[16]")
	public static WebElement ContingentBeneficiaryRelationshipMother;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[21]")
	public static WebElement ContingentBeneficiaryRelationshipOther;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[25]")
	public static WebElement ContingentBeneficiaryRelationshipSister;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[28]")
	public static WebElement ContingentBeneficiaryRelationshipTrust;
	
	
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[3]/div[1]/div/label[2]/span")
	public static WebElement SomeoneElseForSpousePrimary;
	
	@FindBy(xpath ="//*[@name='spBeneOtherName0']")
	public static WebElement SpousePrimarytFN;
	
	@FindBy(xpath ="//*[@name='spBeneOtherSSN0']")
	public static WebElement SpousePrimarytSSN;
	
	@FindBy(xpath ="//*[@name='spBeneOtherRelation0']/option[11]")
	public static WebElement SpousePrimaryRelationshipFatherInLaw;
	
	@FindBy(xpath ="//*[@name='spBeneOtherRelation0']/option[13]")
	public static WebElement SpousePrimaryRelationshipGirlFriend;
	
	@FindBy(xpath ="//*[@name='spBeneOtherRelation0']/option[21]")
	public static WebElement SpousePrimaryRelationshipOther;
	
	@FindBy(xpath ="//*[@name='spBeneOtherRelation0']/option[8]")
	public static WebElement SpousePrimaryRelationshipEstate;
	
	@FindBy(xpath ="//*[@name='spBeneOtherDOB0']")
	public static WebElement SpousePrimaryDOB;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[4]/div[1]/div/label[3]/span")
	public static WebElement BASpouseContingentSomeOneElse;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherName0']")
	public static WebElement SpouseContingentFN;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherSSN0']")
	public static WebElement SpouseContingentSSN;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation0']/option[2]")
	public static WebElement SpouseContingentRelationship;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation0']/option[4]")
	public static WebElement SpouseContingentRelationshipBrother;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation0']/option[3]")
	public static WebElement SpouseContingentRelationshipBoyFriend;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation0']/option[5]")
	public static WebElement SpouseContingentRelationshipChild;
	
	@FindBy(xpath= "//*[@name='spContBeneOtherDOB0']")
	public static WebElement spouseContingentDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[4]/div[2]/div[2]/div[2]/label")
	public static WebElement VarifyDOBSpouseContingent;
	
	
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[1]/div[1]/div/label[2]/span")
	public static WebElement SeniorProtectSponsorPrimaryBenifSomeoneElse;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherName1']")
	public static WebElement SeniorProtectSponsorPrmaryBenFullName;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherSSN1']")
	public static WebElement SeniorProtectSponsorPrimaryBenfSSN;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherDOB1']")
	public static WebElement SeniorProtectSponsorPrimaryBenfDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[1]/div[2]/div[2]/div[2]/label")
	public static WebElement VarifyDOB2;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[3]")
	public static WebElement SeniorProtectSponsorPrimaryBenRelationshipBrother;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[15]")
	public static WebElement SeniorProtectSponsorPrimaryBenRelationshipGrandParent;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[10]")
	public static WebElement SeniorProtectSponsorPrimaryBenRelationshipFather;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[9]")
	public static WebElement SeniorProtectSponsorPrimaryBenRelationshipEXspouse;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[2]/div[1]/div/label[3]/span")
	public static WebElement SeniorProtectSponsorContingentSomeoneElse;
	
	@FindBy(xpath="//*[@name='eeContBeneOtherName1']")
	public static WebElement SeniorProtrctSponsorContingentFullName;
	
	@FindBy(xpath="//*[@name='eeContBeneOtherSSN1']")
	public static WebElement SeniorProtrctSponsorContingentSSN;
	
	@FindBy(xpath="//*[@name='eeContBeneOtherDOB1']")
	public static WebElement SeniorProtrctSponsorContingentDOB;
	
	@FindBy(xpath="//*[@name='eeContBeneOtherRelation1']/option[21]")
	public static WebElement SeniorProtrctSponsorContingentRelationshipOther;
	
	@FindBy(xpath="//*[@name='eeContBeneOtherRelation1']/option[3]")
	public static WebElement SeniorProtrctSponsorContingentRelationshipBoyFriend;
	
	@FindBy(xpath="//*[@name='eeContBeneOtherRelation1']/option[2]")
	public static WebElement SeniorProtrctSponsorContingentRelationshipAunt;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[3]/div[1]/div/label[2]/span")
	public static WebElement SeniorProtectSpousePrimarySomeoneElse;
	
	@FindBy(xpath = "//*[@name='spBeneOtherName1']")
	public static WebElement SeniorProtectSpousePrmaryBenFullName;
	
	@FindBy(xpath ="//*[@name='spBeneOtherSSN1']")
	public static WebElement SeniorProtectSpousePrimaryBenfSSN;
	
	@FindBy(xpath = "//*[@name='spBeneOtherDOB1']")
	public static WebElement SeniorProtectSpousePrimaryBenfDOB;
	
	@FindBy(xpath ="//*[@name='spBeneOtherRelation1']/option[29]")
	public static WebElement SeniorProtectSpousePrimaryBenRelationshipUncle;
	
	@FindBy(xpath ="//*[@name='spBeneOtherRelation1']/option[2]")
	public static WebElement SeniorProtectSpousePrimaryBenRelationshipAunt;
	
	@FindBy(xpath ="//*[@name='spBeneOtherRelation1']/option[25]")
	public static WebElement SeniorProtectSpousePrimaryBenRelationshipSister;
	


	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[4]/div[1]/div/label[3]/span")
	public static WebElement SeniorProtectSpouseContingentSomeoneElse;
	
	@FindBy(xpath = "//*[@name='spContBeneOtherName1']")
	public static WebElement SeniorProtectSpouseContingentFullName;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherSSN1']")
	public static WebElement SeniorProtectSpouseContingentSSN;
	
	@FindBy(xpath = "//*[@name='spContBeneOtherDOB1']")
	public static WebElement SeniorProtectSpouseContingentDOB;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation1']/option[29]")
	public static WebElement SeniorProtectSpouseContingentRelationshipUncle;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation1']/option[17]")
	public static WebElement SeniorProtectSpouseContingentRelationshipMother;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation1']/option[21]")
	public static WebElement SeniorProtectSpouseContingentRelationshipOther;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation1']/option[2]")
	public static WebElement SeniorProtectSpouseContingentRelationshipAunt;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[1]/div[1]/div/label[2]/span")
	public static WebElement FirstprotectSponsorPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='eeBeneOtherName2']")
	public static WebElement FirstProtectSponsorPrimaryFullName;
	
	@FindBy(xpath="//*[@name='eeBeneOtherSSN2']")
	public static WebElement FirstProtectSponsorPrimarySSN;
	
	@FindBy(xpath="//*[@name='eeBeneOtherDOB2']")
	public static WebElement FirstProtectSponsorPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[1]/div[2]/div[2]/div[2]/label")
	public static WebElement FirstProtectSponsorPrimaryDOBVarify;
	
	@FindBy(xpath="//*[@name='eeBeneOtherRelation2']/option[29]")
	public static WebElement FirstProtectSponsorPrimaryRelationshipUncle;
	
	@FindBy(xpath="//*[@name='eeBeneOtherRelation2']/option[21]")
	public static WebElement FirstProtectSponsorPrimaryRelationshipOther;
	
	@FindBy(xpath="//*[@name='eeBeneOtherRelation2']/option[13]")
	public static WebElement FirstProtectSponsorPrimaryRelationshipGirlFriend;
	
	@FindBy(xpath="//*[@name='eeBeneOtherRelation2']/option[25]")
	public static WebElement FirstProtectSponsorPrimaryRelationshipSister;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[2]/div[1]/div/label[3]/span")
	public static WebElement FirstProtectSponsorContingentSomeoneElse;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherName2']")
	public static WebElement FirstProtectSponsorContingentFullName;
	
	@FindBy(xpath ="//*[@name='eeContBeneOtherSSN2']")
	public static WebElement FirstProtectSponsorContingentSSN;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherDOB2']")
	public static WebElement FirstProtectSponsorContingentDOB;
	
	@FindBy(xpath ="//*[@name='eeContBeneOtherRelation2']/option[4]")
	public static WebElement FirstProtectSponsorContingentRelationshipBrother;
	
	@FindBy(xpath ="//*[@name='eeContBeneOtherRelation2']/option[4]")
	public static WebElement FirstProtectSponsorContingentRelationshipGirlFriend;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[3]/div[1]/div/label[2]/span")
	public static WebElement FirstprotectSpousePrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='spBeneOtherName2']")
	public static WebElement FirstProtectSpousePrimaryFullName;
	
	@FindBy(xpath="//*[@name='spBeneOtherSSN2']")
	public static WebElement FirstProtectSpousePrimarySSN;
	
	@FindBy(xpath="//*[@name='spBeneOtherDOB2']")
	public static WebElement FirstProtectSpousePrimaryDOB;
	
	@FindBy(xpath="//*[@name='spBeneOtherRelation2']/option[25]")
	public static WebElement FirstProtectSpousePrimaryRelationshipSister;
	
	@FindBy(xpath="//*[@name='spBeneOtherRelation2']/option[15]")
	public static WebElement FirstProtectSpousePrimaryRelationshipGrandParent;
	
	@FindBy(xpath="//*[@name='spBeneOtherRelation2']/option[11]")
	public static WebElement FirstProtectSpousePrimaryRelationshipFatherInLaw;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[4]/div[1]/div/label[3]/span")
	public static WebElement FirstProtectSpouseContingentSomeoneElse;
	
	@FindBy(xpath = "//*[@name='spContBeneOtherName2']")
	public static WebElement FirstProtectSpouseContingentFullName;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherSSN2']")
	public static WebElement FirstProtectSpouseContingentSSN;
	
	@FindBy(xpath = "//*[@name='spContBeneOtherDOB2']")
	public static WebElement FirstProtectSpouseContingentDOB;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation2']/option[11]")
	public static WebElement FirstProtectSpouseContingentRelationshipFatherInLaw;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation2']/option[4]")
	public static WebElement FirstProtectSpouseContingentRelationshipFatherBrother;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation2']/option[3]")
	public static WebElement FirstProtectSpouseContingentRelationshipFatherBoyFriend;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[1]/div/label[2]/span")
	public static WebElement AC1FirstProtectPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='chBeneOtherName1_0']")
	public static WebElement AC1FirstProtectPrimaryFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN1_0']")
	public static WebElement AC1FirstProtectPrimarySSN;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_0']/option[9]")
	public static WebElement AC1FirstProtectPrimaryRelationshipExSpouse;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_0']/option[21]")
	public static WebElement AC1FirstProtectPrimaryRelationshipOther;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_0']/option[12]")
	public static WebElement ACFirstProtectPrimaryRelationshipFiance;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_0']/option[19]")
	public static WebElement ACFirstProtectPrimaryRelationshipNephew;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB1_0']")
	public static WebElement AC1FirstProtectPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[2]/div[2]/div[2]/label")
	public static WebElement VarifyDOBAC1;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[3]/div[1]/div/label[3]/span")
	public static WebElement AC1FirstProtectContingentSomeOneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName1_0']")
	public static WebElement AC1FirstProtectContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherSSN1_0']")
	public static WebElement AC1FirstProtectContingentSSN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_0']/option[21]")
	public static WebElement AC1FirstProtectContingentRelationshipOther;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_0']/option[18]")
	public static WebElement AC1FirstProtectContingentRelationshipMotherInLaw;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_0']/option[27]")
	public static WebElement AC1FirstProtectContingentRelationshipStepParent;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_0']/option[25]")
	public static WebElement AC1FirstProtectContingentRelationshipSister;
	
	@FindBy(xpath="//*[@name='chContBeneOtherDOB1_0']")
	public static WebElement AC1FirstProtectContingentDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[3]/div[2]/div[2]/div[2]/label")
	public static WebElement AC1FirstProtectContingentDOBVarify;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[4]/div/label[2]/span")
	public static WebElement AC2FirstProtectPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='chBeneOtherName1_1']")
	public static WebElement AC2FirstProtectPrimaryFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN1_1']")
	public static WebElement AC2FirstProtectPrimarySSN;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_1']/option[26]")
	public static WebElement AC2FirstProtectPrimaryRelationshipExSpouse;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_1']/option[13]")
	public static WebElement AC2FirstProtectPrimaryRelationshipGirlFriend;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_1']/option[21]")
	public static WebElement AC2FirstprotectPrimaryRelationshipOther;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_1']/option[2]")
	public static WebElement AC2FirstprotectPrimaryRelationshipAunt;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB1_1']")
	public static WebElement AC2FirstProtectPrimaryDOB;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[6]/div[1]/div/label[3]/span")
	public static WebElement AC2FirstProtectContingentSomeOneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName1_1']")
	public static WebElement AC2FirstProtectContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherSSN1_1']")
	public static WebElement AC2FirstProtectContingentSSN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_1']/option[21]")
	public static WebElement AC2FirstProtectContingentRelationshipOther;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_1']/option[21]")
	public static WebElement AC2FirstProtectContingentRelationshipFatherInLaw;
	
	@FindBy(xpath="//*[@name='chContBeneOtherDOB1_1']")
	public static WebElement AC2FirstProtectContingentDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[6]/div[2]/div[2]/div[2]/label")
	public static WebElement AC2FirstProtectContingentDOBVarify;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[7]/div/label[2]/span")
	public static WebElement AC3FirstProtectPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='chBeneOtherName1_2']")
	public static WebElement AC3FirstProtectPrimaryFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN1_2']")
	public static WebElement AC3FirstProtectPrimarySSN;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_2']/option[4]")
	public static WebElement AC3FirstProtectPrimaryRelationshipExSpouse;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_2']/option[2]")
	public static WebElement AC3FirstProtectPrimaryRelationshipAunt;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_2']/option[29]")
	public static WebElement AC3FirstProtectPrimaryRelationshipUncle;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_2']/option[25]")
	public static WebElement AC3FirstProtectPrimaryRelationshipSister;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB1_2']")
	public static WebElement AC3FirstProtectPrimaryDOB;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[9]/div[1]/div/label[3]/span")
	public static WebElement AC3FirstProtectContingentSomeOneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName1_2']")
	public static WebElement AC3FirstProtectContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherSSN1_2']")
	public static WebElement AC3FirstProtectContingentSSN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_2']/option[2]")
	public static WebElement AC3FirstProtectContingentRelationshipAunt;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_2']/option[4]")
	public static WebElement AC3FirstProtectContingentRelationshipBrother;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_2']/option[29]")
	public static WebElement AC3FirstProtectContingentRelationshipUncle;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation1_2']/option[7]")
	public static WebElement AC3FirstProtectContingentRelationshipDomesticPartner;
	
	@FindBy(xpath="//*[@name='chContBeneOtherDOB1_2']")
	public static WebElement AC3FirstProtectContingentDOB;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[1]/div/label[2]/span")
	public static WebElement MC1ChildProtectPrimarySomeoneElse;
	
	@FindBy(xpath="//*[@name='chBeneOtherName2_0']")
	public static WebElement MC1ChildProtectPrimaryFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN2_0']")
	public static WebElement MC1ChildProtectPrimarySSN;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_0']/option[13]")
	public static WebElement MC1ChildProtectPrimaryRelationshiGirlFriend;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_0']/option[9]")
	public static WebElement MC1ChildProtectPrimaryRelationshipExSpouse;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_0']/option[15]")
	public static WebElement MC1ChildProtectPrimaryRelationshipGrandParent;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_0']/option[4]")
	public static WebElement MC1ChildProtectPrimaryRelationshipBrother;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB2_0']")
	public static WebElement MC1ChildProtectPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[2]/div[2]/div[2]/label")
	public static WebElement MC1ChildProtectContingentDOBVarify;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[3]/div[1]/div/label[3]/span")
	public static WebElement MC1ChildProtectContingentSomeoneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName2_0']")
	public static WebElement MC1ChildProtectContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherSSN2_0']")
	public static WebElement MC1ChildProtectContingentSSN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherDOB2_0']")
	public static WebElement MC1ChildProtectContingentDOB;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_0']/option[13]")
	public static WebElement MC1ChildProtectContingentRelationshipGirlFriend;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_0']/option[8]")
	public static WebElement MC1ChildProtectContingentRelationshipEstate;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_0']/option[25]")
	public static WebElement MC1ChildProtectContingentRelationshipSister;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_0']/option[15]")
	public static WebElement MC1ChildProtectContingentRelationshipGrandParent;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[4]/div/label[2]/span")
	public static WebElement MC2ChildProtectPrimarySomeoneElse;
	
	@FindBy(xpath="//*[@name='chBeneOtherName2_1']")
	public static WebElement MC2ChildProtectPrimaryFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN2_1']")
	public static WebElement MC2ChildProtectPrimarySSN;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_1']/option[12]")
	public static WebElement MC2ChildProtectPrimaryRelationshipFiance;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_1']/option[2]")
	public static WebElement MC2ChildProtectPrimaryRelationshipAUnt;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_1']/option[21]")
	public static WebElement MC2ChildProtectPrimaryRelationshipOther;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB2_1']")
	public static WebElement MC2ChildProtectPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[5]/div[2]/div[2]/label")
	public static WebElement MC2ChildProtectContingentDOBVarify;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[6]/div[1]/div/label[3]/span")
	public static WebElement MC2ChildProtectContingentSomeoneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName2_1']")
	public static WebElement MC2ChildProtectContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherSSN2_1']")
	public static WebElement MC2ChildProtectContingentSSN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_1']/option[12]")
	public static WebElement MC2ChildProtectContingentRelationshipFiance;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_1']/option[28]")
	public static WebElement MC2ChildProtectContingentRelationshipTrust;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_1']/option[3]")
	public static WebElement MC2ChildProtectContingentRelationshipBoyFriend;
	
	@FindBy(xpath="//*[@name='chContBeneOtherDOB2_1']")
	public static WebElement MC2ChildProtectContingentDOB;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[7]/div/label[2]/span")
	public static WebElement MC3ChildProtectPrimarySomeoneElse;
	
	@FindBy(xpath="//*[@name='chBeneOtherName2_2']")
	public static WebElement MC3ChildProtectPrimaryFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN2_2']")
	public static WebElement MC3ChildProtectPrimarySSN;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_2']/option[12]")
	public static WebElement MC3ChildProtectPrimaryRelationshipFiance;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_2']/option[4]")
	public static WebElement MC3ChildProtectPrimaryRelationshipBrother;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_2']/option[28]")
	public static WebElement MC3ChildProtectPrimaryRelationshipTrust;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_2']/option[27]")
	public static WebElement MC3ChildProtectPrimaryRelationshipStepParent;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB2_2']")
	public static WebElement MC3ChildProtectPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[8]/div[2]/div[2]/label")
	public static WebElement MC3ChildProtectContingentDOBVarify;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[9]/div[1]/div/label[3]/span")
	public static WebElement MC3ChildProtectContingentSomeoneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName2_2']")
	public static WebElement MC3ChildProtectContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherSSN2_2']")
	public static WebElement MC3ChildProtectContingentSSN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_2']/option[21]")
	public static WebElement MC3ChildProtectContingentRelationshipOther;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_2']/option[4]")
	public static WebElement MC3ChildProtectContingentRelationshipBrother;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_2']/option[20]")
	public static WebElement MC3ChildProtectContingentRelationshipNiece;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_2']/option[4]")
	public static WebElement MC3ChildProtectContingentRelationshipGuardian;
	
	@FindBy(xpath="//*[@name='chContBeneOtherDOB2_2']")
	public static WebElement MC3ChildProtectContingentDOB;
	
	
	
	
	@FindBy (css=".btn.btn-success.btn-next")
	public static WebElement NextBtn6;
	
	@FindBy (xpath="//*[@id='emailSummaryConfirm']/div[1]/label")
	public static WebElement EmailSummary;
	
	@FindBy (xpath="//*[@name='emailSummarySheet']")
	public static WebElement EmailSummary1;
	
	@FindBy (xpath="//*[@id='coverageEmail']")
	public static WebElement EmailSummaryConfirm1;
	
	@FindBy (xpath="//*[@id='coverageEmailRepeat']")
	public static WebElement EmailSummaryConfirm2;
	
	@FindBy(xpath= "//*[@id='military_allotment_payment_started']")
	public static WebElement AcknowledgeofPayment;
	
	@FindBy(xpath="//*[@id='checkmatic-form']/div[4]/select/option[2]")
	public static WebElement DayOfDeduction1;
	
	@FindBy(xpath="//*[@id='checkmatic-account-type']/option[2]")
	public static WebElement CheckingAccountType;
	
	@FindBy(xpath="//*[@id='checkmatic-routing-number']")
	public static WebElement RoutingNumber;
	
	@FindBy(xpath="//*[@id='checkmatic-account-number']")
	public static WebElement AccountNumber;
	
	@FindBy(xpath="//*[@id='checkmatic-bank-name']")
	public static WebElement BankName;
	
	@FindBy(xpath="//*[@id='checkmatic-bank-city-state-zip']")
	public static WebElement CityStateZip;
	
	@FindBy(xpath="//*[@id='credit-card-info']/div[3]/div[2]/select/option[2]")
	public static WebElement DayOfDeducation1forCreditCard;
	
	@FindBy(xpath="//*[@name='credit-card-number']")
	public static WebElement CreditCardNumber;
	
	@FindBy(xpath="//*[@name='expiration-date']")
	public static WebElement ExpirationDate;
	
	@FindBy(xpath="//*[@name='cvv']")
	public static WebElement CVV;
	
	
	@FindBy(xpath="//*[@id='step6-form']/div[3]/div/label[2]/span")
	public static WebElement SiginingViaEmail;
	
	@FindBy(xpath="//*[@id='step6-form']/div[4]/div[1]/div[2]/div/input")
	public static WebElement EnterEmailOne;
	
	@FindBy(xpath="//*[@id='sponsor-sig-email-repeat']")
	public static WebElement EnterEmailTwo;
	
	@FindBy(xpath="//*[contains(text(),'Submit and send email for signature')]")
	public static WebElement SubmitEmailForsignatureBtn;
	
	@FindBy(xpath = "//*[@id='gb_70']")
	public static WebElement SignIn;
	
	@FindBy(xpath = "//*[@id='identifierId']")
	public static WebElement InputEmail;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")
	public static WebElement NextButton; 
	
	@FindBy(xpath = "//*[@id='password']/div[1]/div/div[1]/input")
	public static WebElement InputPassword;
	
	@FindBy(xpath = "//*[@id='identifierNext']/span")
	public static WebElement NextButtonUseranme; 
	
	@FindBy(xpath = "//*[@id='passwordNext']/span/span")
	public static WebElement NextButtonSSN; 
	
	@FindBy(xpath = "//*[@id='gbwa']/div[1]/a")
	public static WebElement ClickSelect;
	
	@FindBy(xpath = "//*[@id='gb23']/span[1]")
	public static WebElement ClickEmail;
	
	@FindBy(xpath = "//*[@class='TN bzz aHS-bnt']/div[2]")
	public static WebElement ClickInbox;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[6]/div/div[1]/div[3]/div/table/tbody/tr[1]/td[6]/div/div/div/span/span")
	public static WebElement SelectFirstEmail;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[3]/div[2]/div[2]/div[2]/div")
	public static WebElement selectEmail;
	
	@FindBy(xpath = "//*[contains(text(),'Review Application')]")
	public static WebElement ReviewApplicationBtn;
	
	@FindBy(xpath="//*[@id='spouseLastName']")
	public static WebElement LastNameforSponsor;
	
	@FindBy(xpath="//*[@id='spouseLastFourSSN']")
	public static WebElement LastSSNforSponsor;
	
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
	
	@FindBy(xpath ="//*[@name='step_6_last_name_spouse']")
	public static WebElement SpouseLastName;
	
	@FindBy(xpath ="//*[@name='step_6_ssn_spouse']")
	public static WebElement SpouseLastSSN;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/span/table/tbody/tr[2]/td[1]")
	public static WebElement verifySSN;	
	
	@FindBy(xpath="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[2]")
	public static WebElement clickModalBodyBtn;
	
	@FindBy(xpath ="//*[@class='btn btn-success btn-sm center btn-sign']")
	public static WebElement SignBtn;
	
	@FindBy(xpath = "//input[@id='login']")
    public static WebElement email;

    @FindBy(xpath = "//input[@id='password']")
	public static WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginBtn; 
	
	@FindBy(xpath="//*[contains(text(),'Access agent signing inbox')]")
	public static WebElement AccessAgentSigningInbox;
	
	@FindBy(xpath="//*[@id='pending']/div[3]")
	public static WebElement NoSigining;
	
	@FindBy(xpath="//*[@id='pending-table']/tbody/tr/td[1]/button")
	public static WebElement SignButton;
	
	@FindBy(xpath="//*[@class='btn btn-success btn-sm center']")
	public static WebElement Sign;
	
	
}
