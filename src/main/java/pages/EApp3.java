package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EApp3 {

	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[1]/div[1]/div/label[2]/span")
	public static WebElement BASponsorPrimarySomeoneElse;
	
	@FindBy(xpath="//*[@name='eeBeneOtherName0']")
	public static WebElement BASponsorPrimaryBenficiaryFullName;
	
	@FindBy(xpath="//*[@name='eeBeneOtherSSN0']")
	public static WebElement BASponsorPrimaryBeneficiarySSN;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherRelation0']/option[17]")
	public static WebElement BASponsorPrimaryBeneficiaryRelationship;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherRelation0']/option[25]")
	public static WebElement BASponsorPrimaryBeneficiaryRelationship2;
	
	@FindBy(xpath ="//*[@id='eeBeneficiaryOther']/div[1]/div[2]/div/select/option[10]")
	public static WebElement BASponsorPrimaryRelationship;
	
	@FindBy(xpath ="//*[@id='eeBeneficiaryOther']/div[1]/div[2]/div/select/option[11]")
	public static WebElement BASponsorPrimaryRelationshipForFIL;
	
	@FindBy(xpath ="//*[@id='eeBeneficiaryOther']/div[1]/div[2]/div/select/option[12]")
	public static WebElement BASponsorPrimaryRelationshipBF;
	
	@FindBy(xpath ="//*[@id='eeBeneficiaryOther']/div[1]/div[2]/div/select/option[21]")
	public static WebElement BASponsorPrimaryRelationshipForOther;
	
	@FindBy(xpath="//*[@name='eeBeneOtherDOB0']")
	public static WebElement BASponsorPrimaryBeneficiaryDOB;
	
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
	public static WebElement BASponsorContingentBeneficiaryFullName;
	
	@FindBy(xpath = "//input[@name='eeContBeneOtherSSN0']")
	public static WebElement BASponsorContingentBeneficiarySSNnumber;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[13]")
	public static WebElement BASponsorContingentBeneficiaryRelationship;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[12]")
	public static WebElement BASponsorContingentRelationship;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[29]")
	public static WebElement BASponsorContingentRelationUncle;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[21]")
	public static WebElement BASponsorContingentRelationshipForOther;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[28]")
	public static WebElement BASponsorContingentRelationshipForTrust;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation0']/option[8]")
	public static WebElement BASponsorContingentRelationshipForEstate;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherDOB0']")
	public static WebElement BASponsorContingentBeneficiaryDOB;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[3]/div[1]/div/label[2]/span")
	public static WebElement BASpouseSomeOneElse;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[1]/div[3]/div[2]/div[1]/div[1]/div/input")
	public static WebElement BASpousePrimaryFullName;
	
	@FindBy(xpath="//input[@name='spBeneOtherSSN0']")
	public static WebElement BASpousePrimarySSN;
	
	@FindBy(xpath="//*[@name='spBeneOtherRelation0']/option[12]")
	public static WebElement BASpousePrimaryRelationship;
	
	@FindBy(xpath="//*[@name='spBeneOtherDOB0']")
	public static WebElement BASpousePrimaryDOB;
	
	
	
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[1]/div[1]/div/label[2]/span")
	public static WebElement FedTermSponsorPrmaryBenSOmeOneElse;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherName1']")
	public static WebElement FedTermSponsorPrmaryBenFullName;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherSSN1']")
	public static WebElement FedTermSponsorPrimaryBenfSSN;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[19]")
	public static WebElement FedTermSponsorPrimaryBenRelationship;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[13]")
	public static WebElement FedTermSponsorPrimaryBenRelationship2;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[14]")
	public static WebElement FedTermSponsorPrimaryBenRelationship3;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[18]")
	public static WebElement FedTermSponsorPrimaryBenRelationship4;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[29]")
	public static WebElement FedTermSponsorPrimaryBenRelationshipUncle;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[28]")
	public static WebElement FedTermSponsorPrimaryBenRelationshiTrust;
	
	@FindBy(xpath ="//*[@name='eeBeneOtherRelation1']/option[5]")
	public static WebElement FedTermSponsorPrimaryBenRelationshipforChild;
	
	@FindBy(xpath = "//*[@name='eeBeneOtherDOB1']")
	public static WebElement FedTermSponsorPrimaryBenfDOB;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[2]/div[1]/div/label[3]/span")
	public static WebElement secondSomeOneElse;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherName1']")
	public static WebElement FedTermSponsorContingentBeneficiaryFullName;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherSSN1']")
	public static WebElement FedTermSponsorContingentBeneficiarySSN;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation1']/option[27]")
	public static WebElement FedTermSponsorContingentBeneficiaryRelationship;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherRelation1']/option[28]")
	public static WebElement FedTermSponsorContingentBeneficiaryRelationshipforTrust;
	
	@FindBy(xpath = "//*[@name='eeContBeneOtherDOB1']")
	public static WebElement FedTermSponsorContingentBeneficiaryDOB;
	
	
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[3]/div[1]/div/label[2]/span")
	public static WebElement FedTermSpousePrimarySomeOneElse;
	
	@FindBy(xpath ="//*[@name='spBeneOtherName1']")
	public static WebElement FedTermSpousePrimarytFN;
	
	@FindBy(xpath ="//*[@name='spBeneOtherSSN1']")
	public static WebElement FedTermSpousePrimarytSSN;
	
	@FindBy(xpath ="//*[@name='spBeneOtherRelation1']/option[10]")
	public static WebElement FedTermSpousePrimaryRelationshipFather;
	
	@FindBy(xpath ="//*[@name='spBeneOtherDOB1']")
	public static WebElement FedtermSpousePrimaryDOB;
	
	
	
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
	
	
	@FindBy(xpath= "/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[1]/div/label[2]/span")
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
	
	
	
	
	@FindBy(xpath="//*[@id='step5-form']/div[2]/div[6]/div[1]/div/label[2]/span")
	public static WebElement SomeOneElseForChildProtectPrimaryFirstKid;
	
	@FindBy(xpath="//*[@id='step5-form']/div[2]/div[6]/div[2]/div[1]/div[1]/div/input")
	public static WebElement ChildProtecFirstChildtPrimaryFN;
	
	@FindBy(xpath="//*[@id='step5-form']/div[2]/div[6]/div[2]/div[2]/div[1]/div/input")
	public static WebElement ChildProtectFirstChildPrimarySSN;
	
	@FindBy(xpath="//*[@id='step5-form']/div[2]/div[6]/div[2]/div[1]/div[2]/div/select/option[4]")
	public static WebElement ChildProtectFirstChildPrimaryRelationshipBrother;
	
	@FindBy(xpath="//*[@id='step5-form']/div[2]/div[6]/div[2]/div[2]/div[2]/div/input")
	public static WebElement ChildProtectFirstChildPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[2]/div[6]/div[3]/div[1]/div/label[3]/span")
	public static WebElement SomeOneElseChildProtectFirstKidContingetnt;
	
	@FindBy(xpath="//*[@id='chContBeneficiaryOther']/div[1]/div[1]/div/input")
	public static WebElement ChildProtectFirstKidContingentBeneficiaryFN;
	
	@FindBy(xpath="//*[@id='chContBeneficiaryOther']/div[2]/div[1]/div/input")
	public static WebElement ChildProtectFirstKidContingentBeneficiarySSN;
	
	@FindBy(xpath="//*[@id='chContBeneficiaryOther']/div[1]/div[2]/div/select/option[20]")
	public static WebElement ChildProtectFirstKidContingentBeneficiaryRelationship;
	
	@FindBy(xpath="//*[@id='chContBeneficiaryOther']/div[2]/div[2]/div/input")
	public static WebElement ChildProtectFirstKidContingentBeneficiaryDOB;
	
	
	
	@FindBy(xpath="//*[@id='step5-form']/div[2]/div[6]/div[4]/div/label[2]/span")
	public static WebElement SomeOneElseForChildProtectPrimarySecondtKid;
	
	@FindBy(xpath="//*[@name='chBeneOtherName1_1']")
	public static WebElement ChildProtectSecondChildtPrimaryFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN1_1']")
	public static WebElement ChildProtectSecondChildPrimarySSN;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_1']/option[7]")
	public static WebElement ChildProtectSecondChildPrimaryRelationship;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB1_1']")
	public static WebElement ChildProtectSecondChildPrimaryDOB;
	
	
	
	@FindBy(xpath="//*[@id='step5-form']/div[2]/div[6]/div[7]/div/label[2]/span")
	public static WebElement SomeOneElseForChildProtectPrimaryThirdtKid;
	
	@FindBy(xpath="//*[@name='chBeneOtherName1_2']")
	public static WebElement ChildProtectThirdChildtPrimaryFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN1_2']")
	public static WebElement ChildProtectThirdChildPrimarySSN;
	
	@FindBy(xpath="//*[@name='chBeneOtherRelation1_2']/option[10]")
	public static WebElement ChildProtectThirdChildPrimaryRelationship;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB1_2']")
	public static WebElement ChildProtectThirdChildPrimaryDOB;

	
	
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
	public static WebElement FirstProtectSponsorPrimarySomeOneElse;
	
	@FindBy(xpath="//*[@id='step5-form']/div[3]/div[6]/div[2]/div[1]/div[1]/div/input")
	public static WebElement FirstProtectSponsorPrimaryFl;;
	
	@FindBy(xpath="//*[@id='step5-form']/div[3]/div[6]/div[2]/div[2]/div[1]/div/input")
	public static WebElement FirstProtectSponsorPrimarySSN;
	
	@FindBy(xpath="//*[@id='step5-form']/div[3]/div[6]/div[2]/div[1]/div[2]/div/select/option[23]")
	public static WebElement FirstProtectSponsorPrimaryRelationshipParent;
	
	@FindBy(xpath="//*[@id='step5-form']/div[3]/div[6]/div[2]/div[2]/div[2]/div/input")
	public static WebElement FirstProtectSponsorPrimaryDOB;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[3]/div[1]/div/label[3]/span")
	public static WebElement FirstProtectPContingentSomeOneElse;
	
	@FindBy(xpath="//*[@name='chContBeneOtherName2_0']")
	public static WebElement FirstProtectContingentFN;
	
	@FindBy(xpath="//*[@name='chContBeneOtherRelation2_0']/option[15]")
	public static WebElement FirstProtectContingentRelationship;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[6]/div[4]/div/label[2]/span")
	public static WebElement FirstProtectSpousePrimarySomeOneElse;
	
	@FindBy(xpath="//*[@name='chBeneOtherName2_1']")
	public static WebElement FirstProtectSpousePrimarytFN;
	
	@FindBy(xpath="//*[@name='chBeneOtherSSN2_1']")
	public static WebElement FirstProtectSpousePrimarySSN;

	@FindBy(xpath="//*[@name='chBeneOtherRelation2_1']/option[12]")
	public static WebElement FirstProtectSpousePrimaryRelationshipParent;
	
	@FindBy(xpath="//*[@name='chBeneOtherDOB2_1']")
	public static WebElement FirstProtectSpousePrimaryDOB;
	
	
	
	
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
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[4]/div[1]/div[1]/div/label[2]/span")
	public static WebElement FirstprotectSponsorPrimarySomeOneElse;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[5]/form/div[3]/div[1]/div[1]/div/label[2]/span")
	public static WebElement FirstprotectSponsorPrimarySOE;
	
	@FindBy(xpath="//input[@name='eeBeneOtherName3']")
	public static WebElement FirstprotectSponsorPrimaryFL;
	
	@FindBy(xpath="//input[@name='eeBeneOtherSSN3']")
	public static WebElement FirstprotectSponsorPrimarySSN;
	
	@FindBy(xpath="//*[@name='eeBeneOtherRelation3']/option[20]")
	public static WebElement FirstprotectSponsorPrimaryRelationship;
	
	@FindBy(xpath="//*[@name='eeBeneOtherDOB3']")
	public static WebElement FirstprotectSponsorPrimaryDOB;
	
	
	
	
	@FindBy(xpath="//input[@name='eeBeneOtherName2']")
	public static WebElement FirstprotectSponsorPrimaryFL2;
	
	@FindBy(xpath="//input[@name='eeBeneOtherSSN2']")
	public static WebElement FirstprotectSponsorPrimarySSN2;
	
	@FindBy(xpath="//*[@name='eeBeneOtherRelation2']/option[20]")
	public static WebElement FirstprotectSponsorPrimaryRelationship2;
	
	@FindBy(xpath="//*[@name='eeBeneOtherDOB2']")
	public static WebElement FirstprotectSponsorPrimaryDOB2;
	
	
	
	@FindBy(xpath="//input[@name='eeBeneOtherName2']")
	public static WebElement GroupFreeSponsorBeneFL;
	
	@FindBy(xpath="//input[@name='eeBeneOtherSSN2']")
	public static WebElement GroupFreeSponsorBeneSSN;
	
	@FindBy(xpath="//select[@name='eeBeneOtherRelation2']/option[20]")
	public static WebElement GroupFreeSponsorBeneRelationship;
	
	@FindBy(xpath="//input[@name='eeBeneOtherDOB2']")
	public static WebElement GroupFreeSponsorBeneDOB;
}
