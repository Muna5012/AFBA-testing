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
	
	@FindBy(xpath= "//option[@value='Military']")
	public static WebElement Military;
	
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
	
	@FindBy (xpath = "//*[contains(text(),'Retiree')]")
	public static WebElement RetireeDuty;
	
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
	
	@FindBy(xpath ="//*[@id='contributionMode']/option[3]")
	public static WebElement MilitaryAllotmentCheckmatic;
	
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
	
	@FindBy(xpath="//*[@class='btn btn-block btn-sm btn-primary']")
	public static WebElement SeniorProtectOption3;
	
	@FindBy(xpath="//*[@class='btn btn-block btn-sm btn-warning']")
	public static WebElement SeniorProtectOption2;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[3]")
	public static WebElement FirstProtectSponsorCustomize50;
	
	@FindBy(xpath="//*[@id=\"step1-form\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[3]")
	public static WebElement FirstProtectSpouseCustomize50;
	
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
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[1]/button[2]")
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
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse5;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[6]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SeniorProtectSpouse6;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor5;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor6;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[1]/button[2]")
	public static WebElement FirstProtectSponsor7;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse1;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse2;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse3;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse4;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse5;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse6;
	
	@FindBy(xpath="//*[@id=\"step2\"]/form/div[7]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement FirstProtectSpouse7;
	
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
	public static WebElement PrimaryRelationshipMother;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[21]")
	public static WebElement PrimaryRelationshipForOther;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation0']/option[29]")
	public static WebElement PrimaryRelationshipForUncle;
	
	@FindBy(xpath="//*[@name='eeBeneOtherDOB0']")
	public static WebElement PrimaryBeneficiaryDOB;
	
	
	
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
	
	@FindBy(xpath= "//*[@name='spContBeneOtherDOB0']")
	public static WebElement spouseContingentDOB;
	
	
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[1]/div[1]/div/label[2]/span")
	public static WebElement SeniorProtectSponsorPrimaryBenifSomeoneElse;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherName1']")
	public static WebElement SeniorProtectSponsorPrmaryBenFullName;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherSSN1']")
	public static WebElement SeniorProtectSponsorPrimaryBenfSSN;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherDOB1']")
	public static WebElement SeniorProtectSponsorPrimaryBenfDOB;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[3]")
	public static WebElement SeniorProtectSponsorPrimaryBenRelationshipBrother;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[15]")
	public static WebElement SeniorProtectSponsorPrimaryBenRelationshipGrandParent;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[2]/div[1]/div/label[3]/span")
	public static WebElement SeniorProtectSponsorContingentSomeoneElse;
	
	@FindBy(xpath="//*[@name='eeContBeneOtherName1']")
	public static WebElement SeniorProtrctSponsorContingentFullName;
	
	@FindBy(xpath="//*[@name='eeContBeneOtherSSN1']")
	public static WebElement SeniorProtrctSponsorContingentSSN;
	
	@FindBy(xpath="//*[@name='eeContBeneOtherRelation1']/option[21]")
	public static WebElement SeniorProtrctSponsorContingentRelationshipOther;
	
	
	
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
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[6]/div/div[1]/div[3]/div/table/tbody/tr[1]/td[5]/div[2]")
	public static WebElement SelectFirstEmail;
	
	
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[4]/div/table/tr/td[1]/div[2]/div[2]/div/div[3]/div[1]/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[1]/span")
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
	
	@FindBy(xpath="//*[@id='pending-table']/tbody/tr/td[1]/button")
	public static WebElement SignButton;
	
	@FindBy(xpath="//*[@class='btn btn-success btn-sm center']")
	public static WebElement Sign;
	
	
}
