package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EAppGroupAssociation {

	@FindBy(xpath = "//a[contains(text(),'Manage cases')]")
	public static WebElement ManageCaseButton;
	
	@FindBy(xpath = "//*[@type='search']")
	public static WebElement searchSpace;
	
	@FindBy(xpath="//*[contains(text(),'Group Association Test')]")
	public static WebElement GroupAssociationtest;
	
	@FindBy(xpath = "//*[@id='add-to-census-btn']")
	public static WebElement NewEnrollement;
	
	@FindBy(xpath = "//input[@id='add-census-ssn-input']")
	public static WebElement SSN;
	
	@FindBy(xpath = "//*[@id='add-to-census-modal']/div[2]/div/div[2]/div[1]/form/div/div/div[2]/input")
	public static WebElement EnrollmentCity;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[48]" )
	public static WebElement EnrollmentState;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div/div[3]/limited-state-select/select/option[51]")
	public static WebElement VA;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[3]/div/button[2]")
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
	
	@FindBy(xpath ="//*[@id='step1-form']/div[1]/div[1]/div[2]/div[2]/div/label[1]/span")
	public static WebElement Gender;
	
	@FindBy(xpath ="//*[@id='step1-form']/div[1]/div[1]/div[2]/div[2]/div/label[1]/span")
	public static WebElement GenderforMale;
	
	@FindBy(xpath="//*[@id='date_joined_union']")
	public static WebElement DateJoinedGroupAssociation;
	
	@FindBy(xpath= "//*[@id='step1-form']/div[1]/div[4]/div/div[1]/div/div/select/option[7]")
	public static WebElement GovernmentContractor ;
	
	@FindBy(xpath="//*[@id='step1-form']/div[1]/div[4]/div/div[1]/div[1]/div/select/option[3]")
	public static WebElement FireDepartment;
	
	@FindBy(xpath= "//option[@value='Military']")
	public static WebElement Eligibility ;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/ul/li/div/label[1]/span")
	public static WebElement CoveredGroupAssociationTerm;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/form/div[4]/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/ul/div/li[2]/div")
	public static WebElement Age65to69Covered;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[3]/button[2]")
	public static WebElement ClickNext;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[3]/button[2]/span")
	public static WebElement ClickNextForSponsorInfo;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[3]/button[2]")
	public static WebElement ClickNextForChil;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[3]/button[2]/span")
	public static WebElement ClickNextBeneficiary;
	
	@FindBy(xpath="//*[@id=\"eeBeneficiaryOther\"]/div[1]/div[1]/div/input")
	public static WebElement InputSponsorBeneficiaryFN;
	
	@FindBy(xpath="//*[@id=\"eeBeneficiaryOther\"]/div[1]/div[2]/div/select/option[8]")
	public static WebElement InputSponsorBeneficiaryRelationship;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[1]/div[2]/div[2]/div[1]/div/input")
	public static WebElement SponsorBeneSSN;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div/input")
	public static WebElement SponsorBenDOB;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[2]/div[1]/div/label[3]/span")
	public static WebElement ContingentBeneSomeOneElse;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[2]/div[2]/div[1]/div[1]/div/input")
	public static WebElement ContingentBeneFN;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[2]/div[2]/div[2]/div[1]/div/input")
	public static WebElement ContingentBeneSSN;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[2]/div[2]/div[1]/div[2]/div/select/option[5]")
	public static WebElement ContingentBeneRelastionship;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[2]/div[2]/div[2]/div[2]/div/input")
	public static WebElement ContingentBeneDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[6]/div[2]/form[3]/div[3]/div/label[1]/span")
	public static WebElement SingningInPerson;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[3]/button[2]/span")
	public static WebElement ClickIAgreeToCoverageAndReadySign;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[12]/div[2]/div/div[2]/div[2]/div/span/table/tbody/tr[2]/td[2]/input")
	public static WebElement SponsirBMD; 
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[12]/div[2]/div/div[3]/button[2]")
	public static WebElement SignBtn;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[12]/div[2]/div/div[3]")
	public static WebElement ClickBtton;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[13]/div[2]/div/div[3]/button[2]")
	public static WebElement eSignatureBrn;
	
	
	
	
	
}
