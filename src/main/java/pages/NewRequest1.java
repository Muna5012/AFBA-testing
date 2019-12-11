package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRequest1 {
	
	@FindBy(xpath="//*[contains(text(),'Request Beneficiary Change')]")
	public static WebElement ClickRequestBeneficiaryChange;
	
	@FindBy(xpath="//h1[contains(text(),'Beneficiary Change Request')]")
	public static WebElement GetTextOfBeneficiaryChangeRequest;
	
	@FindBy(xpath="//p[contains(text(),'RADM ELEANOR ROBERSON')]")
	public static WebElement GetTextOfMemberName;
	
	@FindBy(xpath="//span[contains(text(),'Beneficiary Change Requests')]")
	public static WebElement GetTextOfBeneficiaryRequest;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id58']")
	public static WebElement GetTextOfBlueLineNoties;
	
	@FindBy(xpath="//*[contains(text(),'Account Number')]")
	public static WebElement GetTextOfAccountNum;
	
	@FindBy(xpath="//div[contains(text(),'Status')]")
	public static WebElement GetTextOfStatus;
	
	@FindBy(xpath="//div[contains(text(),'Created Date')]")
	public static WebElement GetTextOfCreatedDate;
	
	@FindBy(xpath="//div[contains(text(),'Decision Date')]")
	public static WebElement GetTextOfDecisionDate;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id62']/table/tbody")
	public static WebElement GetTextofAllThePolicies;
	
	@FindBy(xpath="//*[@id='iframePreviewId']")
	public static WebElement GetLinkOfBeneficiaryDesignationForm;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id64:0:j_id77']")
	public static WebElement ClickView1;
	
	@FindBy(xpath="//*[@class='slds-modal slds-fade-in-open']/span/div[2]/iframe")
	public static WebElement GetFormURL1;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:modalPreviewContainer']/div[1]/a")
	public static WebElement CloseForm1;
	
	
	@FindBy(xpath="//*[contains(text(),'Step 1: Instructions')]")
	public static WebElement GetTextOfStepOneInstructions;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage1']/div[2]")
	public static WebElement GetTextOfAllTheNotes;
	
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:newChangeReq']")
	public static WebElement NewRequestBtn;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id84']")
	public static WebElement NextBtn;
	
	@FindBy(xpath="//*[contains(text(),'Step 2: Select Account(s)')]")
	public static WebElement GetTextOfStep2SelectAccount;
	
	@FindBy(xpath="//*[contains(text(),'Select each')]")
	public static WebElement GetTextOfStep2blueLineExplation;
	
	@FindBy(xpath="//*[contains(text(),'Policy Number')]")
	public static WebElement GettextOfPolicyNumber;
	
	@FindBy(xpath="//*[contains(text(),'Insured')]")
	public static WebElement GetTextOfInsured;
	
	@FindBy(xpath="//*[contains(text(),'Coverage Amount')]")
	public static WebElement GetTextOfCoverageAmount;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[1]/th/div")
	public static WebElement GetTextOfFirstPolicyNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[2]/th/div")
	public static WebElement GetTextOfSecondPolicyNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[3]/th/div")
	public static WebElement GetTextOfThirdPolicyNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[2]/th/div")
	public static WebElement GetTextOfFourthPolicyNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[2]/th/div")
	public static WebElement GetTextOfFifthPolicyNumber;
	
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[1]/td[2]/div")
	public static WebElement GetTextOfFirstInsuredFullName;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[2]/td[2]/div")
	public static WebElement GetTextOfSecondInsuredFullName;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[3]/td[2]/div")
	public static WebElement GetTextOfThirdInsuredFullName;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[4]/td[2]/div")
	public static WebElement GetTextOfFourthInsuredFullName;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[5]/td[2]/div")
	public static WebElement GetTextOfFifthInsuredFullName;
	
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[1]/td[3]/div")
	public static WebElement GetTextOfFirstCoverageAmountNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[2]/td[3]/div")
	public static WebElement GetTextOfSecondCoverageAmountNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[3]/td[3]/div")
	public static WebElement GetTextOfThirdCoverageAmountNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[4]/td[3]/div")
	public static WebElement GetTextOfFourthCoverageAmountNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:stage2']/table/tbody/tr[5]/td[3]/div")
	public static WebElement GetTextOfFifthCoverageAmountNumber;
	
	
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id87:0:check-button-label-01']/span[1]")
	public static WebElement RadioBtn;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:policyNext']")
	public static WebElement NextBtn2;
	
	@FindBy(xpath="//*[contains(text(),'Step 3: Primary Beneficiaries')]")
	public static WebElement GetTextOfStepThreePrimaryBene;
	
	@FindBy(xpath="//*[contains(text(),'Please add')]")
	public static WebElement GetTextOfStepThreeNotes;
	
	@FindBy(xpath="//*[contains(text(),'No primary')]")
	public static WebElement GetTextOfNoPrimaryBeneAdd;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:toggleBtnPhone']")
	public static WebElement AddPrimaryBtn;
	
	
	
	
	@FindBy(xpath="//*[contains(text(),'Add Primary Beneficiary')]")
	public static WebElement GetTextOfAddPrimaryBeneficiary;
	
	@FindBy(xpath="//*[contains(text(),' Relationship to Insured')]")
	public static WebElement GetTextOfRelationshipToInsured;
	
	@FindBy(xpath= "//*[@id='Mainmenu:j_id41:j_id42:theForm:relationType']")
	public static WebElement RelationShipClick;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:relationType']/option[26]")
	public static WebElement SelectSpouseForRelationship;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:relationType']/option[5]")
	public static WebElement RelationshipToInsured;
	
	
	
	@FindBy(xpath="//label[contains(text(),'Gender')]")
	public static WebElement GetTextOfGender;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:gender']")
	public static WebElement GenderClick;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:gender']/option[2]")
	public static WebElement GenderMaleOption;
	
	
	
	@FindBy(xpath="//label[contains(text(),'First Name')]")
	public static WebElement GetTextOfFirstName;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:firstName']")
	public static WebElement FirstName;
	
	
	
	@FindBy(xpath="//label[contains(text(),'Last Name')]")
	public static WebElement GetTextOfLastName;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:lastName']")
	public static WebElement LastName;
	
	
	
	@FindBy(xpath="//label[contains(text(),'Middle')]")
	public static WebElement GetTextOfMiddleInitial;
	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:theForm:mInitial']")
	public static WebElement MiddleInitial;
	
	
	
	@FindBy(xpath="//label[contains(text(),'SSN')]")
	public static WebElement GetTextOfSSN;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:ssn']")
	public static WebElement SSN;
	
	
	@FindBy(xpath="//label[contains(text(),'Date')]")
	public static WebElement GetTextOfDOB;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:dob']")
	public static WebElement DOB;
	
	
	
	@FindBy(xpath="//label[contains(text(),'Percentage')]")
	public static WebElement GetTextOfPercentage;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:percentage']")
	public static WebElement Percentage;
	
	
	
	@FindBy(xpath="//label[contains(text(),' Address Line')]")
	public static WebElement GetTextOfAddressLine;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:street1']")
	public static WebElement Address;
	
	
	@FindBy(xpath="//label[contains(text(),'Address Line 2')]")
	public static WebElement GetTextOfAddressLine2;
	
	
	@FindBy(xpath="//label[contains(text(),'City')]")
	public static WebElement GetTextOfCity;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:city']")
	public static WebElement City;
	
	
	@FindBy(xpath="//label[contains(text(),'State')]")
	public static WebElement GetTextOfState;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:state']")
	public static WebElement State;
	
	
	@FindBy(xpath="//label[contains(text(),'Zip Code')]")
	public static WebElement GetTextOfZipCode;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:zip']")
	public static WebElement ZipCode;
	
	
	@FindBy(xpath ="//*[@id='Mainmenu:j_id41:j_id42:theForm:popupButtons']")
	public static WebElement AddClick;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:beneAdd']")
	public static WebElement ADDbtn;
	
	
	@FindBy(xpath="//*[contains(text(),'Please add')]")
	public static WebElement GetetxtOfNotesForTotalPercentage;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:beneficiaryList1']/table/tbody/tr[1]/td[1]/div")
	public static WebElement GetTextOfAddedPrimaryBeneFullName;
	
	@FindBy(xpath="//div[@class='slds-text-heading_small slds-truncate']/span")
	public static WebElement GetTextOfPrimary;
	
	@FindBy(xpath="//*[contains(text(),'100.0')]")
	public static WebElement GetTextOfAddedPercentage;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:beneficiaryList1']/table/tbody/tr[2]/td[1]")
	public static WebElement GetTextOfRelationInfo;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:beneficiaryList1']/table/tbody/tr[2]/td[2]")
	public static WebElement GetTextOfSSNInfo;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:beneficiaryList1']/table/tbody/tr[2]/td[3]")
	public static WebElement GetTextOfDOBInfo;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:beneficiaryList1']/table/tbody/tr[2]/td[4]")
	public static WebElement GetTextOfAddress;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id323:j_id324:j_id325:0:j_id326:j_id327:j_id329']/span")
	public static WebElement GetTextOfAddedStatus;
	
	@FindBy(xpath = "//*[@name='Mainmenu:j_id41:j_id42:theForm:j_id352']")
	public static WebElement NextBtn3;
	
	

	@FindBy(xpath="//*[contains(text(),'Step 4')]")
	public static WebElement GetTextOfStepFourContingentBenef;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:togglecontingentAdd']")
	public static WebElement AddContingentBtn;
	
	@FindBy(xpath="//*[contains(text(),'Add Contingent Beneficiary')]")
	public static WebElement GetTextOfAddContingentBene;
	
	@FindBy(xpath="//*[contains(text(),'If Proceeds')]")
	public static WebElement GetTextOfNotesOfADDContingent;
	
	@FindBy(xpath="//*[contains(text(),'Name of Trust')]")
	public static WebElement GetTextOfNameOfTrust;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:trustName']")
	public static WebElement InputNameOfTrust;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:trusteeNames']")
	public static WebElement TrustteeNameInTrust;
	
	@FindBy(xpath="//*[contains(text(),'Trustee/Trustees named in Trust')]")
	public static WebElement GetTextOfTrustee;
	
	@FindBy(xpath="//*[contains(text(),'Trustee/Trustees named in Trust')]")
	public static WebElement GetTextOfDOTrust;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:percentage']")
	public static WebElement Percentage2;;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:trustDate']")
	public static WebElement DateOfTrust;
	
	@FindBy(xpath ="//*[@id='Mainmenu:j_id41:j_id42:theForm:popupButtons']")
	public static WebElement ADDClick;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:beneAdd']")
	public static WebElement ADDbutton;
	
	
	
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:relationType']/option[3]")
	public static WebElement RelationshipOption2;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:relationType']/option[28]")
	public static WebElement RelationshipToInsuredTrust;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:gender']/option[2]")
	public static WebElement GenderOption;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:firstName']")
	public static WebElement FirstNameforContingernt;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:lastName']")
	public static WebElement LastNameforContingernt;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:mInitial']")
	public static WebElement MiddleNameforContingernt;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:ssn']")
	public static WebElement SSNforContingernt;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:dob']")
	public static WebElement DOBforContingernt;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:percentage']")
	public static WebElement PercentageforContingernt;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:street1']")
	public static WebElement AddressforContingernt;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:modalinput']")
	public static WebElement AddressSureBtnforContingernt;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:city']")
	public static WebElement CityforContingernt;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:state']")
	public static WebElement StateforContingernt;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:zip']")
	public static WebElement ZipCodeforContingernt;
	
	
	
	@FindBy(xpath="//div[contains(text(),'Please add')]")
	public static WebElement GetTextOfStepFourPercentageNotes;
	
	@FindBy(xpath="//div[contains(text(),'NANCY')]")
	public static WebElement GetTextOfContingentFullName;
	
	@FindBy(xpath="//div[contains(text(),'Contingent')]")
	public static WebElement GetTextOfContingent;
	
	@FindBy(xpath="//div[contains(text(),'100.0')]")
	public static WebElement GetTextOfPercentageAfterAddContingent;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:contingentbeneficiaryList1']/table/tbody/tr[2]/td[1]")
	public static WebElement GetTextOfRelation;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:contingentbeneficiaryList1']/table/tbody/tr[2]/td[2]")
	public static WebElement GetTextOfNameOfAddedContingent;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:contingentbeneficiaryList1']/table/tbody/tr[2]/td[3]")
	public static WebElement GetTextOfDateOfAddContingent;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:contingentbeneficiaryList1']/table/tbody/tr[2]/td[4]")
	public static WebElement GetTextOfTruteeName;
	

	
	@FindBy(xpath="//*[@name='Mainmenu:j_id41:j_id42:theForm:j_id439']")
	public static WebElement NextBtn4;
	
	@FindBy(xpath = "//*[contains(text(),'Step 5')]")
	public static WebElement GetTextOfStepFive;
	
	@FindBy(xpath="//*[contains(text(),'Selected Policies')]")
	public static WebElement GetTextOfSlectedPolicies;
	
	@FindBy(xpath="//*[contains(text(),'Policy Number')]")
	public static WebElement GEtTextOfPolicyNum;
	
	@FindBy(xpath="//*[contains(text(),'Insured')]")
	public static WebElement GetTextOfInsuredForSummary;
	
	@FindBy(xpath="//*[contains(text(),'Coverage Amount')]")
	public static WebElement GetTextOfCoverageAmountForSummary;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:summary']/div[1]/table/tbody/tr/th/div")
	public static WebElement GetTextOfPolicyNumber;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:summary']/div[1]/table/tbody/tr/td[1]/div")
	public static WebElement GetTextOfInsuredFullName;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:summary']/div[1]/table/tbody/tr/td[2]/div")
	public static WebElement GetTextOfCoverageAmountOfNum;
	
	@FindBy(xpath="//*[contains(text(),'Primary Beneficiaries')]")
	public static WebElement GetTextOfPrimaryBene;
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:check-button-label-e01']/span[1]")
	public static WebElement CheckingBox;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id581']")
	public static WebElement ReviewBtn;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:modalPreviewContainer']/div[1]/a")
	public static WebElement Xbtn;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:submitRequest']")
	public static WebElement SubmitBtn;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id622']")
	public static WebElement OkBtn;
	
}
