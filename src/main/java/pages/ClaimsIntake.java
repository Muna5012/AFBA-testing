package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClaimsIntake {
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm']/div[1]/div/div[2]/h1")
	public static WebElement GetTextOdReportingADeathClaim;

	@FindBy(xpath = "//*[@id='Mainmenu:j_id27:j_id28:theForm:j_id43']")
	public static WebElement CNext;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantRelationship']")
	public static WebElement Relationship;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantRelationship']/option[4]")
	public static WebElement RelationshipSpouse;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantRelationship']/option[3]")
	public static WebElement RelationshipChild;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantRelationship']/option[26]")
	public static WebElement RelationshipExSpouse;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantFirstName']")
	public static WebElement FirstName;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantLastName']")
	public static WebElement LastName;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:email']")
	public static WebElement Email; 
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantCountry']")
	public static WebElement Country;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantCountry']/option[2]")
	public static WebElement USA;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:address']")
	public static WebElement Street;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:city']")
	public static WebElement City;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:state']/option[43]")
	public static WebElement State;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:state']/option[29]")
	public static WebElement StateNevada;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:state']/option[42]")
	public static WebElement StateSouthDakota;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:zipCode\"]")
	public static WebElement ZipCode;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:informantPhone\"]")
	public static WebElement Phone;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:stage2\"]/div[2]")
	public static WebElement ClickBlank;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:j_id76\"]/div[4]/div/label")
	public static WebElement ClickBlank2;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:policyNext']")
	public static WebElement Next;
	
	
	
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:insuredFirstName']")
	public static WebElement FName;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:insuredLastName']")
	public static WebElement LName;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:insredPolicyNumber\"]")
	public static WebElement PolicyNum;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:natureOfDeath\"]/option[3]")
	public static WebElement Accidental;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:natureOfDeath\"]/option[6]")
	public static WebElement Suicide;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:natureOfDeath\"]/option[5]")
	public static WebElement NaturalCauses;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:insuredSSN\"]")
	public static WebElement InsuredCompleteSSN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:causeOfDeath\"]")
	public static WebElement clickforcauseofdeath;;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:causeOfDeath\"]/option[3]")
	public static WebElement CauseOfDeath;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:causeOfDeath\"]/option[4]")
	public static WebElement GunshotSelfInflicted;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:causeOfDeath\"]/option[14]")
	public static WebElement Bronchitis;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:dateOfBirth\"]")
	public static WebElement DOB;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:dateOfDeath\"]")
	public static WebElement DOD;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:outsideUS-label-01']/span[1]")
	public static WebElement DeathOutsideUS;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:deathcountry\"]/option[10]")
	public static WebElement Australia;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:j_id126']/div[2]/div/label")
	public static WebElement ClickBlankStep3;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:j_id136\"]")
	public static WebElement Next3;
	
	
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:sposequestionRadio:0\"]")
	public static WebElement Step4First;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseFirstName\"]")
	public static WebElement DeceasedSpouseFN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseLastName\"]")
	public static WebElement DeceasedSpouseLN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseDateOfDeath\"]")
	public static WebElement DeceasedSpouseDOD;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:check-button-label-06\"]/span[1]")
	public static WebElement AddAnotherDeceasedSpouse;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseOtherFirstName\"]")
	public static WebElement SecondDeceasedSpouseFN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseOtherLastName\"]")
	public static WebElement SecondDeceasedSpouseLN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseOtherDateOfDeath\"]")
	public static WebElement SecondDeceasedSpouseDOD;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:j_id257\"]")
	public static WebElement Next4;
	
	
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:sposequestionRadio:1\"]")
	public static WebElement Step4Second;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:exspouseFirstName\"]")
	public static WebElement ExSpouseFN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:exspouseLastName\"]")
	public static WebElement ExSpouseLN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:dateOfDivorce\"]")
	public static WebElement DODivorce;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:check-button-label-07\"]/span[1]")
	public static WebElement IsthispersonDeceasedClick;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:divrocedspousedateOfDeath\"]")
	public static WebElement ExDOD;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:check-button-label-08\"]/span[1]")
	public static WebElement AddAnotherExSpouse;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:exAnotherSpouseFirstName\"]")
	public static WebElement SecondXSpouseFN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:exAnotherSpouseLastName\"]")
	public static WebElement SecondXSpouseLn;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:dateOfAnotherDivorce\"]")
	public static WebElement SecondXDivorceDate;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:check-button-label-09\"]/span[1]")
	public static WebElement SecondXIsthisPersonDeceasedClick;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:anothersdivrocedpousedateOfDeath\"]")
	public static WebElement SecondXDOD;
	
	
	

	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:sposequestionRadio:2\"]")
	public static WebElement Step4Third;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:survivingSpouseFirstName\"]")
	public static WebElement SpouseFN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:survivingSpouseLastName\"]")
	public static WebElement SpouseLN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseDateOfBirth\"]")
	public static WebElement SpouseDOB;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseSSN\"]")			
	public static WebElement SpouseSSN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseStreetAddr\"]")
	public static WebElement SpouseStreetAddress;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseCity\"]")
	public static WebElement SpouseCity;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseState\"]")
	public static WebElement SpouseState;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseZipCode\"]")
	public static WebElement SpouseZipCode;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseCountry\"]")
	public static WebElement SpouseCountry;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spousePhone\"]")
	public static WebElement SpousePhoneNum;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:spouseEmail\"]")
	public static WebElement SpouseEmail;
	
	
			
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:sposequestionRadio:3\"]")
	public static WebElement Step4Forth;
	
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kininformantRadio:0\"]")
	public static WebElement Step5SelectYes;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kininformantRadio:1\"]")
	public static WebElement Step5SelectNO;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinRelationship\"]/option[4]")
	public static WebElement Step5NextRelationshipChild;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinEmail\"]")
	public static WebElement NextEmail;;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinFirstName\"]")
	public static WebElement NextFN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinLastName\"]")
	public static WebElement NextLN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinStreetAddr\"]")
	public static WebElement NextStreet;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinCity\"]")
	public static WebElement NextCity;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinState\"]/option[47]")
	public static WebElement NextStateVA;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinZipCode\"]")
	public static WebElement NextZipCode;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinCountry\"]/option[2]")
	public static WebElement NextCountry;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinPhone\"]")
	public static WebElement NextPhoneNum;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:j_id289\"]")
	public static WebElement Next5;
	
	
	
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:kinclaimDetail']")
	public static WebElement InputOpinion;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimPackageRadio:0\"]")
	public static WebElement SelectSpouse;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimPackageRadio:1\"]")
	public static WebElement SelectNextOf;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimPackageRadio:2\"]")
	public static WebElement SelectInformantMe;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimPackageRadio:3\"]")
	public static WebElement SelectOther;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimFirstName\"]")
	public static WebElement OtherFN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimLastName\"]")
	public static WebElement OtherLN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:ClaimRelationship\"]/option[11]")
	public static WebElement Otherrelationship;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimStreetAddr\"]")
	public static WebElement OtherAddress;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimCity\"]")
	public static WebElement OtherCity;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimState\"]/option[34]")
	public static WebElement OtherState;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimZipCode\"]")
	public static WebElement OtherZipCode;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:claimCountry\"]/option[2]")
	public static WebElement OtherCountryUS;
	
	
	
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:j_id321\"]")
	public static WebElement SelectPreview;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:check-button-label-e01\"]/span[1]")
	public static WebElement ClickNoteBtn;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:submitRequest\"]")
	public static WebElement ClickSubmit;
	
	
	
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kininformantRadio:0\"]")
	public static WebElement SelectYesFirst;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kininformantRadio:1\"]")
	public static WebElement SelectNoSecond;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinRelationship\"]/option[4]")
	public static WebElement Step5firstOptionStep4NextRelationshipChild;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinEmail\"]")
	public static WebElement NextOfEmail;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinFirstName\"]")
	public static WebElement NextOfFN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinLastName\"]")
	public static WebElement NextOfLN;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinStreetAddr\"]")
	public static WebElement NextOfStreet;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinCity\"]")
	public static WebElement NextOfCity;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinState\"]/option[38]")
	public static WebElement NextOfState;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinZipCode\"]")
	public static WebElement NextOfZipCode;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinCountry\"]/option[2]")
	public static WebElement NextOfCountry;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:kinPhone\"]")
	public static WebElement NextOfPhone;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:j_id289\"]")
	public static WebElement NextForStepFive;
	
	
}
