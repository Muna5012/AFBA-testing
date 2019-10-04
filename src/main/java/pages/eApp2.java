package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EApp2 {
	
	@FindBy(xpath = "//a[contains(text(),'Manage cases')]")
	public static WebElement ManageCaseButton;
	
	@FindBy(xpath = "//*[@type='search']")
	public static WebElement searchSpace;
	
	@FindBy(xpath = "//*[@id='cases_table']/tbody/tr[1]/td[1]")
	public static WebElement SearchAFBACase;
	
	@FindBy(xpath = "//*[@id='add-to-census-btn']")
	public static WebElement NewEnrollement;
	
	@FindBy(xpath = "//input[@id='add-census-ssn-input']")
	public static WebElement SSN;

	@FindBy(xpath = "//*[@id='add-to-census-modal']/div[2]/div/div[2]/div[1]/form/div/div/div[2]/input")
	public static WebElement EnrollmentCity;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[48]" )
	public static WebElement EnrollmentState;
	
	@FindBy(xpath ="/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[37]")
	public static WebElement NC;
	
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
	
	@FindBy(xpath= "//option[@value='Military']")
	public static WebElement Eligibility ;
	
	@FindBy(xpath = "//*[contains(text(),'Coast Guard')]")
	public static WebElement BranchOfService;
	
	@FindBy(xpath = "//*[contains(text(),'Air Force')]")
	public static WebElement BranchOfService2;
	
	@FindBy(xpath = "//*[contains(text(),'Marine Corps')]")
	public static WebElement BranchOfMCService;
	
	
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
	
	@FindBy(xpath="//*[contains(text(),'Show Coverage Options')]")
	public static WebElement ShowCoverageOptions;
	
	@FindBy(xpath="//div[@class='pull-right']/label[1]/span")
	public static WebElement NonTobacco;
	
	@FindBy(xpath="//div[@class='pull-right']/label[2]/span")
	public static WebElement Tobacco;
	
	@FindBy(xpath="//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/label[1]/span")
	public static WebElement NonTobacco2;
	
	@FindBy(xpath ="//*[@name='ko_unique_46']")
	public static WebElement Tobacco2;
	
	@FindBy(xpath = "//select[@class='emp-coverage']/option[3]")
	public static WebElement CustomizeOption1;
	
	@FindBy(xpath = "//select[@class='emp-coverage']/option[6]")
	public static WebElement CustomizeOption2;
	
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
	
	@FindBy(xpath = "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[3]/div/div/label/input")
	public static WebElement waiveEnrollment;
	
	@FindBy(xpath = "//*[@id='step1-form']/div[4]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li/div/label[1]/span")
	public static WebElement Covered;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-next']")
	public static WebElement NextBtn1;
	
	@FindBy(xpath = "//*[contains(text(),'Answer No to All Questions')]")
	public static WebElement AnswerNOAll;
	
	@FindBy (xpath = "//*[@class='btn btn-success btn-next']")
	public static WebElement NextBtn2;
	
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
	
	@FindBy (xpath = "//select[@name='height_inches_null']/option[8]")
	public static WebElement HeightInchesOption6;
	
	@FindBy (xpath = "//select[@name='height_inches_null']/option[10]")
	public static WebElement HeightInchesOption;
	
	@FindBy (xpath = "//*[@id='step3-form']/div[2]/div[7]/div/input")
	public static WebElement Weight;
	
	@FindBy(xpath ="//div[@class='wizard-actions']/button[2]")
	public static WebElement NextBtn3;
	
	
	@FindBy(xpath ="//*[@id='SpouseInfoBlock']/div[3]/div/label[1]/span")
	public static WebElement SpouseGenderMale;
	
	@FindBy(xpath ="//*[@id='spssn']")
	public static WebElement SpouseSSN;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[1]/select/option[7]")
	public static WebElement SpouseHeigthFeet;
	
	@FindBy(xpath ="//*[@id='sp-height-weight']/div/label[2]/select/option[11]")
	public static WebElement SpouseHeightInches;
	
	@FindBy(xpath ="//*[@name='weight_1']")
	public static WebElement SpouseWeight;
	
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
	
	@FindBy(xpath="//*[@name='eeBeneOtherDOB0']")
	public static WebElement PrimaryBeneficiaryDOB;
	
	@FindBy(xpath = "//*[@id='eeContingentBeneficiaryBlock']/div[1]/div/label[3]/span")
	public static WebElement SomeoneElsee;
	
	@FindBy(xpath = "//input[@name='eeContBeneOtherName0']")
	public static WebElement ContingentBeneficiaryFullName;
	
	@FindBy(xpath = "//input[@name='eeContBeneOtherSSN0']")
	public static WebElement ContingentBeneficiarySSNnumber;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[13]")
	public static WebElement ContingentBeneficiaryRelationship;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[12]")
	public static WebElement ContingentRelationship;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[21]")
	public static WebElement ContingentRelationshipForOther;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherDOB0']")
	public static WebElement ContingentBeneficiaryDOB;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[4]/div[1]/div/label[3]/span")
	public static WebElement SomeOneElseforSpouse;
	
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
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherDOB1']")
	public static WebElement SecondContingentBeneficiaryDOB;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherName0']")
	public static WebElement SpouseContingentFN;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherSSN0']")
	public static WebElement SpouseContingentSSN;
	
	@FindBy(xpath ="//*[@name='spContBeneOtherRelation0']/option[18]")
	public static WebElement SpouseContingentRelationship;
	
	@FindBy(xpath= "//*[@name='spContBeneOtherDOB0']")
	public static WebElement spouseContingentDOB;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[1]/div[1]/div/label[2]/span")
	public static WebElement SomeOneEleseForApp;
	
	@FindBy (css=".btn.btn-success.btn-next")
	public static WebElement NextBtn6;
	
	@FindBy(xpath= "//*[@id='military_allotment_payment_started']")
	public static WebElement AcknowledgeofPayment;
	
	@FindBy(xpath="//*[@id='step6-form']/div[3]/div/label[1]/span")
	public static WebElement SiginingInPerson;
	
	@FindBy(xpath ="//*[contains(text(),'I agree to this coverage and am ready to sign')]")
	public static WebElement AgreeToSignInBtn;
	
	@FindBy(xpath ="//*[contains(text(),'Review Application Documents to Continue')]")
	public static WebElement ReviewApplicationBtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[2]/div/div[3]/button")
	public static WebElement CloseBtn;

	@FindBy(xpath="//*[@id='applicant_sig_check_1']")
	public static WebElement CheckBox;
	
	@FindBy(xpath = "//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[2]/div[2]/div/span/div/div/div[2]/label[2]/span")
	public static WebElement PaperBtn;
	
	@FindBy(xpath ="//input[@name='step_6_last_name']")
	public static WebElement SponsorLastName;
	
	@FindBy(xpath ="//input[@class='input-mini input-mask-last-4-ssn']")
	public static WebElement SponsorLastSSN;
	
	@FindBy(xpath ="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[3]")
	public static WebElement verifySSN;	
	
	@FindBy(xpath="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[2]")
	public static WebElement clickModalBodyBtn;
	
	@FindBy(xpath ="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[3]/button[2]")
	public static WebElement SignBtn;
	
	@FindBy(xpath="//*[@id='modal-signing-enroller-in-person']/div[2]/div/div[3]/button[2]")
	public static WebElement eSignatureBrn;
	

}
