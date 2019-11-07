package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EApp2 {
	
	@FindBy(xpath = "//a[contains(text(),'Manage cases')]")
	public static WebElement ManageCaseButton;
	
	@FindBy(xpath = "//*[@type='search']")
	public static WebElement searchSpace;
	
	@FindBy(xpath="/html/body/div[1]/ul/li[1]/a")
	public static WebElement Home;
	
	@FindBy(xpath = "//*[contains(text(),'IT_QA Automation Face2Face Remote')]")
	public static WebElement SearchAFBACase;
	
	@FindBy(xpath="//*[contains(text(),'IT_QA Automation Call Center')]")
	public static WebElement SearchITAutomationCallCenter;
	
	@FindBy(xpath="//*[contains(text(),'IT_QA Automation Face2Face')]")
	public static WebElement SearchITQAAutomationFace2Face;
	
	@FindBy(xpath = "//*[@id='add-to-census-btn']")
	public static WebElement NewEnrollement;
	
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
	public static WebElement Eligibility ;
	
	@FindBy(xpath = "//*[contains(text(),'Coast Guard')]")
	public static WebElement BranchOfService;
	
	@FindBy(xpath = "//*[contains(text(),'USPHS')]")
	public static WebElement BranchOfService6;
	
	@FindBy(xpath = "//*[contains(text(),'Air Force')]")
	public static WebElement BranchOfService2;
	
	@FindBy(xpath = "//*[contains(text(),'Marine Corps')]")
	public static WebElement BranchOfMCService;
	
	@FindBy(xpath="//*[contains(text(),'Navy')]")
	public static WebElement BranchOfNavy;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[1]/div[4]/div/div[1]/div[2]/div[1]/select/option[8]")
	public static WebElement NOAA;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[1]/div[4]/div/div[1]/div[2]/div[1]/select/option[2]")
	public static WebElement BranchOfArmyService;
	
	@FindBy (xpath = "//*[contains(text(),'Active Duty')]")
	public static WebElement DutyStatus;
	
	@FindBy (xpath = "//*[contains(text(),'Ready Reserve')]")
	public static WebElement DutyStatus2;
	
	@FindBy(xpath = "//*[contains(text(),'E8')]")
	public static WebElement Rank;
	
	@FindBy(xpath = "//*[contains(text(),'E4')]")
	public static WebElement Rank3; 
	
	@FindBy(xpath = "//*[contains(text(),'E6')]")
	public static WebElement Rank6; 
	
	@FindBy(xpath = "//*[contains(text(),'E7')]")
	public static WebElement Rank7; 
	
	@FindBy(xpath = "//*[contains(text(),'E9')]")
	public static WebElement Rank9; 
	
	@FindBy(xpath = "//*[contains(text(),'O2')]")
	public static WebElement RankO2; 
	
	@FindBy(xpath = "//*[contains(text(),'O3')]")
	public static WebElement RankO3; 
	
	@FindBy(xpath = "//*[contains(text(),'O6')]")
	public static WebElement RankO6;
	
	@FindBy(xpath = "//*[contains(text(),'O7')]")
	public static WebElement RankO7; 
	
	@FindBy(xpath = "//*[contains(text(),'O10')]")
	public static WebElement RankO10; 
	
	@FindBy(xpath = "//*[contains(text(),'O9')]")
	public static WebElement RankO9; 
	
	@FindBy(xpath ="//*[@id='contributionMode']/option[4]")
	public static WebElement ContributionMode;
	
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
	
	@FindBy(xpath="//*[contains(text(),'Show Coverage Options')]")
	public static WebElement ShowCoverageOptions;
	
	@FindBy(xpath="//div[@class='pull-right']/label[1]/span")
	public static WebElement NonTobacco;
	
	@FindBy(xpath="//div[@class='pull-right']/label[2]/span")
	public static WebElement Tobacco;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[1]/div/label[2]")
	public static WebElement TobaccoForSponsorBA;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/label[1]/span")
	public static WebElement NonTobacco2;
	
	@FindBy(xpath ="//*[@name='ko_unique_46']")
	public static WebElement Tobacco2;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[3]/div/label[2]/span")
	public static WebElement TobaccoforFedTermChildOne;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[4]/div/label[2]/span")
	public static WebElement TobaccoforFedTermChildTwo;
	
	@FindBy(xpath = "//select[@class='emp-coverage']/option[3]")
	public static WebElement CustomizeOption1;
	
	@FindBy(xpath = "//*[@class='emp-coverage']/option[3]")
	public static WebElement CustomizeOption;
	
	@FindBy(xpath = "//select[@class='emp-coverage']/option[6]")
	public static WebElement CustomizeOption2;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[4]")
	public static WebElement CustomizeOption3;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[4]")
	public static WebElement CustomizeOption4;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[3]/select/option[3]")
	public static WebElement CustomizeOptionforChild1;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[4]/select/option[3]")
	public static WebElement CustomizeOptionforChild2;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-sm btn-warning']")
	public static WebElement SponserCoverageOption2;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-sm btn-primary']")
	public static WebElement SponserCoverageOption3;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/select")
	public static WebElement ChildCoverageClick;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/select/option[6]")
	public static WebElement ChildrenCoverageOption5;
	
	@FindBy(xpath = "//*[@id='coverage-header-11']")
	public static WebElement spouseCoverage;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li/div/label[1]/span")
	public static WebElement Covered;
	
	@FindBy(xpath ="//*[@id='coverage-header-5']/span")
	public static WebElement FedTerm;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[1]/div/label[2]/span")
	public static WebElement FedTermTobaccoForSponsor;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/label[2]/span")
	public static WebElement FedTermTobaccoForSpouse;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[3]/div/label[1]/span")
	public static WebElement FedTermNOnTobaccoforFirstKid;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[4]/div/label[1]/span")
	public static WebElement FedTermNonTobaccoforSecondKid;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[3]")
	public static WebElement CustomizeOption5;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[3]")
	public static WebElement CustomizeOptionSe2;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[4]")
	public static WebElement CustomizeOptionSe1;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[1]/select/option[4]")
	public static WebElement CustomizeOptionSe10;
	
	@FindBy(xpath= "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/select/option[6]")
	public static WebElement ChildCoverge;
	
	@FindBy(xpath ="//*[@id='coverage-header-6']/span")
	public static WebElement ClickFirstProtect;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[3]/select/option[3]")
	public static WebElement FirstProtectCustomizeFirstKid;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[4]/select/option[3]")
	public static WebElement FirstProtectCustomizeSecondKid;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/label[2]/span")
	public static WebElement FirstProtectTobacoforSpouse;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[3]/div/label[2]/span")
	public static WebElement FirstProtectTobacoForKid;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[4]")
	public static WebElement ClickFirstProtectSpouseCustomize;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[3]/select/option[3]")
	public static WebElement ClickFirstProtectKidCustomize;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[4]/div/div[2]/div/ul/li[2]/select/option[3]")
	public static WebElement ClickFirstProtectKid1Customize5;
	
	
	@FindBy(xpath ="//*[@id='coverage-header-10']/span")
	public static WebElement SeniorProtect;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li/div/label[2]/span")
	public static WebElement SeniorProtectSponsorTobacco;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[3]/div/div[2]/div[2]/a/span")
	public static WebElement SeniorProtectOptionThree;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/a")
	public static WebElement SeniorProtectOptionOne;
	
	@FindBy(xpath ="//select[@class='emp-coverage']")
	public static WebElement SeniorProtectCustomizeclick;
	
	@FindBy(xpath ="//select[@class='emp-coverage']/option[4]")
	public static WebElement SeniorProtectCustomize15;
	
	@FindBy(xpath ="//select[@class='emp-coverage']/option[5]")
	public static WebElement SeniorProtectCustomize20;
	
	@FindBy(xpath ="//select[@class='emp-coverage']/option[6]")
	public static WebElement SeniorProtectCustomize25;
	
	@FindBy(xpath="//*[@id='coverage-header-7']/span")
	public static WebElement ChildrenProtectClick;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[1]/div/label[1]/span")
	public static WebElement CoveredForFirstKid;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/label[1]/span")
	public static WebElement CoveredforSecondKid;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[3]/div/label[1]/span")
	public static WebElement CoveredForThrid;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-next']")
	public static WebElement NextBtn1;
	
	@FindBy(xpath = "//*[contains(text(),'Answer No to All Questions')]")
	public static WebElement AnswerNOAll;
	
	@FindBy(xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[1]/button[1]")
	public static WebElement AnswerOneYes;
	
	@FindBy(xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[1]/button[1]")
	public static WebElement AnswerSecondYes;
	
	@FindBy(xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[1]/button[1]")
	public static WebElement AnswerYes4;
	
	@FindBy(xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[2]/div/div[2]/label/input")
	public static WebElement AnswerYes4click1;
	
	@FindBy(xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[2]/div/div[3]/textarea")
	public static WebElement AnswerYes4clickAnswer;
	
	
	@FindBy(xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[2]/div/div/textarea")
	public static WebElement ForsecongAnswer;
	
	@FindBy(xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[1]/td/div[2]/div/div/textarea")
	public static WebElement ForAnswer;
	
	@FindBy (xpath = "//*[@class='btn btn-success btn-next']")
	public static WebElement NextBtn2;
	
	
	@FindBy (xpath = "//*[@id='step2']/form/div[2]/div[2]/div[2]/div[2]/div[1]/button[1]")
	public static WebElement AnsweYesFirstQuestion;
	
	@FindBy (xpath = "//*[@id='step2']/form/div[2]/div[2]/div[2]/div[2]/div[2]/button[1]")
	public static WebElement AnsweYesFirstQuestionforSpouse;
	
	@FindBy (xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div/button[1]")
	public static WebElement AnsweYes10yearsQuestion;
	
	@FindBy (xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[1]/td/div[2]/div/div/textarea")
	public static WebElement AnsweYes10yearsQuestionAnswer;
	
	@FindBy (xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div/button[1]")
	public static WebElement AnsweYes10yearsQuestiontwo;
	
	@FindBy (xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[2]/div/div[2]/label/input")
	public static WebElement AnsweYes10yearsQuestiontwoRadioBtn;
	
	@FindBy (xpath = "//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[2]/div/div[3]/textarea")
	public static WebElement AnsweYes10yearsQuestiontwoRadioBtnAnswer;
	
	@FindBy(name ="height_feet_null")
	public static WebElement HeightClick;
	
	@FindBy (xpath= "//select[@name='height_feet_null']/option[7]")
	public static WebElement HeightOption;
	
	@FindBy (xpath= "//select[@name='height_feet_null']/option[8]")
	public static WebElement HeightOption6;
	
	@FindBy (xpath ="//*[@id='emp-height-weight']/div/label[2]/select")
	public static WebElement HeightInchesclick;
	
	@FindBy (xpath = "//select[@name='height_inches_null']/option[5]")
	public static WebElement HeightInchesOption3;
	
	@FindBy (xpath = "//select[@name='height_inches_null']/option[6]")
	public static WebElement HeightInchesOption4;
	
	@FindBy (xpath = "//select[@name='height_inches_null']/option[7]")
	public static WebElement HeightInchesOption5;
	
	@FindBy (xpath = "//select[@name='height_inches_null']/option[8]")
	public static WebElement HeightInchesOption6;
	
	@FindBy (xpath = "//select[@name='height_inches_null']/option[9]")
	public static WebElement HeightInchesOption7;
	
	@FindBy (xpath = "//select[@name='height_inches_null']/option[10]")
	public static WebElement HeightInchesOption;
	
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
	public static WebElement SpouseHeigthFeet;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[2]/select/option[11]")
	public static WebElement SpouseHeightInches;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[2]/select/option[13]")
	public static WebElement SpouseHeightInches11;
	
	@FindBy(xpath ="//*[@name='weight_1']")
	public static WebElement SpouseWeight;
	
	@FindBy(xpath ="//*[@id='child-ssn-0']")
	public static WebElement ChildOneSSN;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[3]/div/label[2]/span")
	public static WebElement ChildOneGenderFamale;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[3]/div/label[1]/span")
	public static WebElement ChildOneGenderMale;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[1]/select/option[7]")
	public static WebElement ChildOneHeight5Feet;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[1]/select/option[8]")
	public static WebElement ChildOneHeight6Feet;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[2]/select/option[12]")
	public static WebElement ChildOneHeight10Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[2]/select/option[2]")
	public static WebElement ChildOneHeight0Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[5]/div/label[2]/select/option[8]")
	public static WebElement ChildOneHeight6Inches;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[6]/div/input")
	public static WebElement ChildOneWeight;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[7]/div/button[1]")
	public static WebElement ChildUSCitizen;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[8]/div/select/option[5]")
	public static WebElement ChildOneRelationship;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[1]/div[8]/div/select/option[2]")
	public static WebElement ChildOneRelationshipParent;
	
	@FindBy(xpath = "//*[@id='child-ssn-1']")
	public static WebElement ChildTwoSSN;
	
	@FindBy(xpath = "//*[@id='ChildrenInfoBlock']/ul/li[2]/div[3]/div/label[1]/span")
	public static WebElement ChildTwoGenderMale;
	
	@FindBy(xpath = "//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[1]/select/option[7]")
	public static WebElement ChildTwoHeight5Feet;
	
	@FindBy(xpath = "//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[1]/select/option[5]")
	public static WebElement ChildTwoHeight3Feet;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[13]")
	public static WebElement ChildTwoInches11;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[2]")
	public static WebElement ChildTwoInches0;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[3]")
	public static WebElement ChildTwoInches1;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[5]/div/label[2]/select/option[9]")
	public static WebElement ChildTwoInches6;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[6]/div/input")
	public static WebElement ChildTwoWeight;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[8]/div/select/option[5]")
	public static WebElement ChildTwoRelationship;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[8]/div/select/option[2]")
	public static WebElement ChildTwoRelationshipParent;
	
	@FindBy(xpath ="//*[@id='ChildrenInfoBlock']/ul/li[2]/div[7]/div/button[1]")
	public static WebElement ChildUSCitizenm2;
	
	@FindBy(xpath = "//*[@id='child-ssn-2']")
	public static WebElement ChildThreeSSN;
	
	@FindBy(xpath= "//*[@id='ChildrenInfoBlock']/ul/li[3]/div[3]/div/label[2]/span")
	public static WebElement ChildThreeGenderFemale;
	
	@FindBy(xpath= "//*[@id='ChildrenInfoBlock']/ul/li[3]/div[3]/div/label[1]/span")
	public static WebElement ChildThreeGenderMale;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[1]/select/option[6]")
	public static WebElement ChildThreeHeight4Feet;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[1]/select/option[5]")
	public static WebElement ChildThreeHeight3Feet;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[13]")
	public static WebElement ChildThree11Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[5]/div/label[2]/select/option[4]")
	public static WebElement ChildThree2Inches;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[6]/div/input")
	public static WebElement ChildThreeWeight;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[7]/div/button[1]")
	public static WebElement ChildThreeUSCitizen;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[8]/div/select/option[5]")
	public static WebElement ChildThreeRelationship;
	
	@FindBy(xpath="//*[@id='ChildrenInfoBlock']/ul/li[3]/div[8]/div/select/option[2]")
	public static WebElement ChildThreeRelationshipParent;
	
	@FindBy(xpath ="//*[@class='btn btn-success btn-next']")
	public static WebElement Next;
	
	@FindBy(xpath="//*[@name='eeBeneOtherName0']")
	public static WebElement PrimaryBenficiaryFullName;
	
	@FindBy(xpath="//*[@name='eeBeneOtherSSN0']")
	public static WebElement PrimaryBeneficiarySSN;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherRelation0']/option[17]")
	public static WebElement PrimaryBeneficiaryRelationship;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherRelation0']/option[25]")
	public static WebElement PrimaryBeneficiaryRelationship2;
	
	@FindBy(xpath ="//*[@id='eeBeneficiaryOther']/div[1]/div[2]/div/select/option[10]")
	public static WebElement PrimaryRelationship;
	
	@FindBy(xpath ="//*[@id='eeBeneficiaryOther']/div[1]/div[2]/div/select/option[11]")
	public static WebElement PrimaryRelationshipForFIL;
	
	@FindBy(xpath ="//*[@id='eeBeneficiaryOther']/div[1]/div[2]/div/select/option[12]")
	public static WebElement PrimaryRelationshipBF;
	
	@FindBy(xpath ="//*[@id='eeBeneficiaryOther']/div[1]/div[2]/div/select/option[21]")
	public static WebElement PrimaryRelationshipForOther;
	
	@FindBy(xpath="//*[@name='eeBeneOtherDOB0']")
	public static WebElement PrimaryBeneficiaryDOB;
	
	@FindBy(xpath = "//*[@id='eeContingentBeneficiaryBlock']/div[1]/div/label[3]/span")
	public static WebElement SomeoneElsee;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[1]/div[1]/div/label[2]/span")
	public static WebElement SomeoneElseForSponsorPrimary;
	
	@FindBy(xpath= "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[2]/div[1]/div/label[3]/span")
	public static WebElement SomeoneElseForSponsorContingent;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[3]/div[1]/div/label[2]/span")
	public static WebElement SomeoneElseForSpousePrimary;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[4]/div[1]/div/label[3]/span")
	public static WebElement SomeOneElseForSpouseContingent;
	
	@FindBy(xpath = "//input[@name='eeContBeneOtherName0']")
	public static WebElement ContingentBeneficiaryFullName;
	
	@FindBy(xpath = "//input[@name='eeContBeneOtherSSN0']")
	public static WebElement ContingentBeneficiarySSNnumber;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[13]")
	public static WebElement ContingentBeneficiaryRelationship;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[12]")
	public static WebElement ContingentRelationship;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[29]")
	public static WebElement ContingentRelationUncle;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[21]")
	public static WebElement ContingentRelationshipForOther;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[28]")
	public static WebElement ContingentRelationshipForTrust;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[8]")
	public static WebElement ContingentRelationshipForEstate;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherDOB0']")
	public static WebElement ContingentBeneficiaryDOB;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[4]/div[1]/div/label[3]/span")
	public static WebElement SomeOneElseforSpouse;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[1]/div[1]/div/label[2]/span")
	public static WebElement SecondPrmaryBenSOmeOneElse;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherName1']")
	public static WebElement SecondPrmaryBenFullName;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherSSN1']")
	public static WebElement SecondPrimaryBenfSSN;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[19]")
	public static WebElement SecondPrimaryBenRelationship;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[13]")
	public static WebElement SecondPrimaryBenRelationship2;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[14]")
	public static WebElement SecondPrimaryBenRelationship3;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[18]")
	public static WebElement SecondPrimaryBenRelationship4;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[29]")
	public static WebElement SecondPrimaryBenRelationshipUncle;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[28]")
	public static WebElement SecondPrimaryBenRelationshiTrust;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[5]")
	public static WebElement SecondPrimaryBenRelationshipforChild;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherDOB1']")
	public static WebElement SecondPrimaryBenfDOB;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[2]/div[1]/div/label[3]/span")
	public static WebElement secondSomeOneElse;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherName1']")
	public static WebElement SecondContingentBeneficiaryFullName;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherSSN1']")
	public static WebElement SecondContingentBeneficiarySSN;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation1']/option[27]")
	public static WebElement SecondContingentBeneficiaryRelationship;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation1']/option[28]")
	public static WebElement SecondContingentBeneficiaryRelationshipforTrust;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherDOB1']")
	public static WebElement SecondContingentBeneficiaryDOB;
	
	@FindBy(xpath ="//*[@id='spBeneficiaryOther']/div[1]/div[1]/div/input")
	public static WebElement SpousePrimarytFN;
	
	@FindBy(xpath ="//*[@id='spBeneficiaryOther']/div[2]/div[1]/div/input")
	public static WebElement SpousePrimarytSSN;
	
	@FindBy(xpath ="//*[@id='spBeneficiaryOther']/div[1]/div[2]/div/select/option[18]")
	public static WebElement SpousePrimaryRelationship;
	
	@FindBy(xpath ="//*[@id='spBeneficiaryOther']/div[1]/div[2]/div/select/option[11]")
	public static WebElement SpousePrimaryRelationshipFatherInLaw;
	
	@FindBy(xpath ="//*[@id='spBeneficiaryOther']/div[1]/div[2]/div/select/option[21]")
	public static WebElement SpousePrimaryRelationshipother;
	
	@FindBy(xpath ="//*[@id='spBeneficiaryOther']/div[2]/div[2]/div/input")
	public static WebElement SpousePrimaryDOB;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherName0']")
	public static WebElement SpouseContingentFN;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherSSN0']")
	public static WebElement SpouseContingentSSN;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation0']/option[2]")
	public static WebElement SpouseContingentRelationship;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation0']/option[17]")
	public static WebElement SpouseContingentRelationshipMother;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation0']/option[4]")
	public static WebElement SpouseContingentRelationshipBrother;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation0']/option[21]")
	public static WebElement SpouseContingentRelationshipOther;
	
	@FindBy(xpath= "//*[@name='spContBeneOtherDOB0']")
	public static WebElement spouseContingentDOB;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[1]/div[1]/div/label[2]/span")
	public static WebElement SomeOneEleseForApp;
	
	@FindBy(xpath= "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[1]/div/label[2]/span")
	public static WebElement SomeOneElseForFirstProtect;
	
	@FindBy(xpath= "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[3]/div[1]/div/label[3]/span")
	public static WebElement SomeOneElseForFirstProtectContingent;
	
	@FindBy(xpath ="//*[@id='step5-form']/div[2]/div[6]/div[2]/div[1]/div[1]/div/input")
	public static WebElement FirstProtectPrimaryFirstKidFN;
	
	@FindBy(xpath ="//*[@id='step5-form']/div[2]/div[6]/div[2]/div[2]/div[1]/div/input")
	public static WebElement FirstProtectPrimaryFirstKidSSN;
	
	@FindBy(xpath ="//*[@id='step5-form']/div[2]/div[6]/div[2]/div[1]/div[2]/div/select/option[3]")
	public static WebElement FirstProtecPrimaryFirstKidRelationship;
	
	@FindBy(xpath ="//*[@id='step5-form']/div[2]/div[6]/div[2]/div[1]/div[2]/div/select/option[29]")
	public static WebElement FirstProtecPrimaryFirstKidRelationshipUncle;
	
	@FindBy(xpath ="//*[@id='step5-form']/div[2]/div[6]/div[2]/div[2]/div[2]/div/input")
	public static WebElement FirstProtecPrimaryFirstKidDOB;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[3]/div[2]/div[1]/div[1]/div/input")
	public static WebElement FirstProtectContingentFirstKidFN;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[3]/div[2]/div[2]/div[1]/div/input")
	public static WebElement FirstProtectContingentFirstKidSSN;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[3]/div[2]/div[1]/div[2]/div/select/option[21]")
	public static WebElement FirstProtecContingentFirstKidRelationship;
	
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[4]/div/label[2]/span")
	public static WebElement FirstProtecPrimarySecondKidSomeOneElse;
	
	@FindBy(xpath ="//*[@id='step5-form']/div[2]/div[6]/div[5]/div[1]/div[1]/div/input")
	public static WebElement FirstProtectPrimarySecondKidFN;
	
	@FindBy(xpath ="//*[@id='step5-form']/div[2]/div[6]/div[5]/div[2]/div[1]/div/input")
	public static WebElement FirstProtectPrimarSecondKidSSN;
	
	@FindBy(xpath ="//*[@id='step5-form']/div[2]/div[6]/div[5]/div[1]/div[2]/div/select/option[13]")
	public static WebElement FirstProtecPrimarySecondKidRelationship;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[5]/div[1]/div[2]/div/select/option[29]")
	public static WebElement FirstProtecPrimarySecondKidRelationshipUncle;
	
	@FindBy(xpath ="//*[@id='step5-form']/div[2]/div[6]/div[5]/div[2]/div[2]/div/input")
	public static WebElement FirstProtecPrimarySecondKidDOB;	
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[6]/div[1]/div/label[3]/span")
	public static WebElement SomeOneElseForFirstProtecSecondKidContingent;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[6]/div[2]/div[1]/div[1]/div/input")
	public static WebElement FirstProtectContingentSecondKidFN;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[6]/div[2]/div[2]/div[1]/div/input")
	public static WebElement FirstProtectContingentSecondKidSSN;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[6]/div[2]/div[1]/div[2]/div/select/option[17]")
	public static WebElement FirstProtecContingentSecondKidRelationship;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[6]/div[2]/div[2]/div[2]/div/input")
	public static WebElement FirstProtectContingentSecondKidDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[1]/div/label[2]/span")
	public static WebElement FirstProtectPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='chBeneOtherName2_0']")
	public static WebElement FirstProtectPrimaryFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN2_0']")
	public static WebElement FirstProtectPrimarySSN;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation2_0']/option[3]")
	public static WebElement FirstProtectPrimaryRelationshipBF;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB2_0']")
	public static WebElement FirstProtectPrimaryDOB;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[6]/div[3]/div[1]/div/label[3]/span")
	public static WebElement SomeOneElseForChildProFirstKidContingent;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName0_0']")
	public static WebElement ChildProtectFirstKidContingentFullName;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[6]/div[3]/div[2]/div[1]/div[2]/div/select/option[15]")
	public static WebElement ChildProtectFirstKidContengentRelationship;
	
	@FindBy(xpath="//*[@id='step5-form']/div[1]/div[6]/div[4]/div/label[2]/span")
	public static WebElement ChildProtectSecondKidPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@id='step5-form']/div[1]/div[6]/div[5]/div[1]/div[1]/div/input")
	public static WebElement ChildProtectSecondKidPrimaryFN;
	
	@FindBy(xpath="//*[@id='step5-form']/div[1]/div[6]/div[5]/div[2]/div[1]/div/input")
	public static WebElement ChildProtectSecondKidPrimarySSN;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[6]/div[5]/div[1]/div[2]/div/select/option[15]")
	public static WebElement ChildProtectSecondKidPrimaryRelationship;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB0_1']")
	public static WebElement ChildProtectSecondKidPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[6]/div[6]/div[1]/div/label[3]/span")
	public static WebElement ChildProtectSecondKidContingentSomeOneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName0_1']")
	public static WebElement ChildProtectSecondKidContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation0_1']/option[15]")
	public static WebElement ChildProtectSecondKidContingentRelationship;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[6]/div[7]/div/label[2]/span")
	public static WebElement Childprotect3KidPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@id='step5-form']/div[1]/div[6]/div[8]/div[1]/div[1]/div/input")
	public static WebElement ChildProtect3kidPrimaryFN;
	
	@FindBy(xpath="//*[@id='step5-form']/div[1]/div[6]/div[8]/div[2]/div[1]/div/input")
	public static WebElement ChildProtect3KidPrimarySSN;
	
	@FindBy(xpath="//*[@id='step5-form']/div[1]/div[6]/div[8]/div[1]/div[2]/div/select/option[17]")
	public static WebElement ChildProtect3kidPrimaryRelationship;
	
	@FindBy(xpath="//*[@id='step5-form']/div[1]/div[6]/div[8]/div[2]/div[2]/div/input")
	public static WebElement ChildProtect3KidPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[6]/div[9]/div[1]/div/label[3]/span")
	public static WebElement ChildProtect3KidContingentSomeoneElse;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[6]/div[9]/div[2]/div[1]/div[1]/div/input")
	public static WebElement ChildProtect3KidContingentFN;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[6]/div[9]/div[2]/div[1]/div[2]/div/select/option[21]")
	public static WebElement ChildProtect3KidContingentRelationship;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[1]/div[1]/div/label[2]/span")
	public static WebElement SeniorProtectSponsorPrimarySomeOneElse;
	
	

	@FindBy(xpath="//*[@id='step5-form']/div[3]/div[6]/div[1]/div/label[2]/span")
	public static WebElement ChildProtectPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@id='step5-form']/div[3]/div[6]/div[2]/div[1]/div[1]/div/input")
	public static WebElement ChildProtectPrimaryFN;
	
	@FindBy(xpath="//*[@id='step5-form']/div[3]/div[6]/div[2]/div[2]/div[1]/div/input")
	public static WebElement ChildProtectPrimarySSN;
	
	@FindBy(xpath="//*[@id='step5-form']/div[3]/div[6]/div[2]/div[1]/div[2]/div/select/option[23]")
	public static WebElement ChildProtectPrimaryRelationshipParent;
	
	@FindBy(xpath="//*[@id='step5-form']/div[3]/div[6]/div[2]/div[2]/div[2]/div/input")
	public static WebElement ChildProtectPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[3]/div[1]/div/label[3]/span")
	public static WebElement ChildProtectPContingentSomeOneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName2_0']")
	public static WebElement ChildProtectContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_0']/option[15]")
	public static WebElement ChildProtectContingentRelationship;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[4]/div/label[2]/span")
	public static WebElement SecondChildProtectPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='chBeneOtherName2_1']")
	public static WebElement SecondChildProtectPrimarytFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN2_1']")
	public static WebElement SecondChildProtectPrimarySSN;

	@FindBy(xpath="//*[@name='chBeneOtherRelation2_1']/option[23]")
	public static WebElement SecondChildProtectPrimaryRelationshipParent;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB2_1']")
	public static WebElement SecondChildProtectPrimaryDOB;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[6]/div[1]/div/label[3]/span")
	public static WebElement SecondChildProtectContingentSomeOneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName2_1']")
	public static WebElement SecondChildProtectContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherSSN2_1']")
	public static WebElement SecondChildProtectContingentSSN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_1']/option[23]")
	public static WebElement SecondChildProtectContingentRelationshipParent;
	
	@FindBy(xpath="//*[@name='chContBeneOtherDOB2_1']")
	public static WebElement SecondChildProtectContingentDOB;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[5]/div[6]/div[3]/div[1]/div/label[3]/span")
	public static WebElement ChildProtectContingentSomeOneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName4_0']")
	public static WebElement ChildProtectContingentFullName;
	
	@FindBy(xpath="//*[@name='chContBeneOtherSSN4_0']")
	public static WebElement ChildProtectContingentSSN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation4_0']/option[10]")
	public static WebElement ChildProtectContingentRelationshipFather;
	
	@FindBy(xpath="//*[@name='chContBeneOtherDOB4_0']")
	public static WebElement ChildProtectContingentDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[4]/div[3]/div[1]/div/label[2]/span")
	public static WebElement SeniorProtectPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='spBeneOtherName3']")
	public static WebElement SeniorProtectPrimaryFN;
	
	@FindBy(xpath="//*[@name='spBeneOtherSSN3']")
	public static WebElement SeniorProtectPrimarySSN;
	
	@FindBy(xpath="//*[@name='spBeneOtherRelation3']/option[5]")
	public static WebElement SeniorProtectPrimaryRelationshipChild;
	
	@FindBy(xpath="//*[@name='spBeneOtherDOB3']")
	public static WebElement SeniorProtectPrimaryDOB;
	
	@FindBy (css=".btn.btn-success.btn-next")
	public static WebElement NextBtn6;
	
	@FindBy (xpath="//*[@name='emailSummarySheet']")
	public static WebElement EmailSummary;
	
	@FindBy (xpath="//*[@id='emailSummaryConfirm']/div[1]/label")
	public static WebElement EmailSummary2;
	
	@FindBy (xpath="//*[@id='coverageEmail']")
	public static WebElement EmailSummaryConfirm1;
	
	@FindBy (xpath="//*[@id='coverageEmailRepeat']")
	public static WebElement EmailSummaryConfirm2;
	
	@FindBy(xpath="//*[@id='step6-form']/div[3]/div/label[2]/span")
	public static WebElement SiginingViaEmail;
	
	@FindBy(xpath="//*[@id='step6-form']/div[4]/div[1]/div[2]/div/input")
	public static WebElement EnterEmailOne;
	
	@FindBy(xpath="//*[@id='sponsor-sig-email-repeat']")
	public static WebElement EnterEmailTwo;
	
	@FindBy(xpath="//*[contains(text(),'Submit and send email for signature')]")
	public static WebElement SubmitEmailForsignatureBtn;
	
	@FindBy(xpath= "//*[@id='military_allotment_payment_started']")
	public static WebElement AcknowledgeofPayment;
	
	@FindBy(xpath="//*[@id='step6-form']/div[3]/div/label[1]/span")
	public static WebElement SiginingInPerson;
	
	@FindBy(xpath ="//*[@id='step6-form']/div[5]/div/label[1]/span")
	public static WebElement SpouseSigninYes;
	
	@FindBy(xpath ="//*[@id='step6-form']/div[3]/div/label[1]/span")
	public static WebElement SpouseSigninYesforCallCenter;
	
	@FindBy(xpath ="//*[contains(text(),'I agree to this coverage and am ready to sign')]")
	public static WebElement AgreeToSignInBtn;
	
	@FindBy(xpath ="//*[@id='applicant_sig_check_1']")
	public static WebElement ClickQuestion1;
	
	@FindBy(xpath ="//*[@id='applicant_sig_check_2']")
	public static WebElement ClickQuestion2;
	
	@FindBy(xpath ="//*[@id='applicant_sig_check_3']")
	public static WebElement ClickQuestion3;
	
	
	@FindBy(xpath ="//*[contains(text(),'Review Application Documents to Continue')]")
	public static WebElement ReviewApplicationBtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[2]/div/div[3]/button")
	public static WebElement CloseBtn;

	@FindBy(xpath="//*[@id='applicant_sig_check_1']")
	public static WebElement CheckBox;
	
	@FindBy(xpath = "//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[2]/div[2]/div/span/div/div/div[2]/label[2]/span")
	public static WebElement PaperBtn;
	
	@FindBy(xpath = "//*[@id='modal-signing-applicant-call-center']/div[2]/div/div[2]/div[4]/div/div[2]/label[2]/span")
	public static WebElement PaperBtn2;
	
	@FindBy(xpath ="//*[@name='step_6_last_name']")
	public static WebElement SponsorLastName;
	
	@FindBy(xpath ="//*[@name='step_6_ssn']")
	public static WebElement SponsorLastSSN;
	
	@FindBy(xpath ="//*[@name='step_6_spouse_last_name']")
	public static WebElement SpouseLastName;
	
	@FindBy(xpath ="//*[@name='step_6_spouse_ssn']")
	public static WebElement SpouseLastSSN;
	
	@FindBy(xpath ="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[3]")
	public static WebElement verifySSN;	
	
	@FindBy(xpath="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[2]")
	public static WebElement clickModalBodyBtn;
	
	@FindBy(xpath ="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[3]/button[2]")
	public static WebElement SignBtn;
	
	@FindBy(xpath ="//*[@id='modal-signing-applicant-call-center']/div[2]/div/div[3]/button[2]")
	public static WebElement SignBtn2;
	
	@FindBy(xpath="//*[@id='modal-signing-enroller-in-person']/div[2]/div/div[3]/button[2]")
	public static WebElement eSignatureBrn;
	
	@FindBy(xpath="//*[@id='modal-signing-enroller-call-center']/div[2]/div/div[3]/button[2]")
	public static WebElement eSignatureBrn2;
}
