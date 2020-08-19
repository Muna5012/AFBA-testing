package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesforceChangesforLP {

	@FindBy(xpath = "//*[@id=\"username\"]")
	public static WebElement Username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	public static WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"Login\"]")
	public static WebElement Login;
	
	@FindBy(xpath="//*[@id=\"phSearchInput\"]")
	public static WebElement Search;
	
	@FindBy(xpath="//*[@id=\"phSearchButton\"]")
	public static WebElement SearchBtn;
	
	@FindBy(xpath="//*[@id=\"Contact_body\"]/table/tbody/tr[2]/th/a")
	public static WebElement Contact;
	
	@FindBy(xpath="//*[@id=\"topButtonRow\"]/input[6]")
	public static WebElement AddressChangeRequest;
	
	
	
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:eligibility\"]")
	public static WebElement BranchOfService;
	
	@FindBy(xpath="//*[@id='j_id0:contactForm:eligibility']/option[3]")
	public static WebElement UnitedStatesCoastGuard;
	
	@FindBy(xpath="//*[@id='j_id0:contactForm:eligibility']/option[4]")
	public static WebElement UnitedStatesPublicHealthService;
	
	@FindBy(xpath="//*[@id='j_id0:contactForm:eligibility']/option[5]")
	public static WebElement UnitedStateArmy;
	
	@FindBy(xpath="//*[@id='j_id0:contactForm:eligibility']/option[6]")
	public static WebElement UnitedStateMarineCorp;
	
	@FindBy(xpath="//*[@id='j_id0:contactForm:eligibility']/option[7]")
	public static WebElement UnitedStatenavy;
	
	@FindBy(xpath="//*[@id='j_id0:contactForm:eligibility']/option[8]")
	public static WebElement UnitedStateAirForce;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:eligibility\"]/option[2]")
	public static WebElement NOAA;
	
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:rank\"]")
	public static WebElement Rank;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:rank\"]/option[6]")
	public static WebElement SPCE04;;
	
	@FindBy(xpath="//*[@id='j_id0:contactForm:rank']/option[8]")
	public static WebElement TSGTE06;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:rank\"]/option[4]")
	public static WebElement A1C;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:rank\"]/option[10]")
	public static WebElement MSGTE07;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:rank\"]/option[23]")
	public static WebElement COLO06;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:rank\"]/option[5]")
	public static WebElement PO3E04;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:rank\"]/option[16]")
	public static WebElement CAPTo06;
	
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:dutyStatus\"]")
	public static WebElement DutyStatus;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:dutyStatus\"]/option[7]")
	public static WebElement Reserves;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:dutyStatus\"]/option[6]")
	public static WebElement Separatee;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:dutyStatus\"]/option[4]")
	public static WebElement RET;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:dutyStatus\"]/option[3]")
	public static WebElement AD;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:dutyStatus\"]/option[5]")
	public static WebElement RR;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:dutyStatus\"]/option[1]")
	public static WebElement NG;
	
	
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:addressStreet\"]")
	public static WebElement Address;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:city\"]")
	public static WebElement City;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:state\"]")
	public static WebElement StateClick;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:state\"]/option[42]")
	public static WebElement NorthCarolina;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:state\"]/option[17]")
	public static WebElement Gorgia;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:state\"]/option[16]")
	public static WebElement FL;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:state\"]/option[54]")
	public static WebElement TN;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:state\"]/option[19]")
	public static WebElement HI;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:state\"]/option[11]")
	public static WebElement CO;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:state\"]/option[13]")
	public static WebElement DE;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:state\"]/option[49]")
	public static WebElement Pennsylvania;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:zipCode\"]")
	public static WebElement ZipCode;
	
	
	
	
	@FindBy(xpath="//*[@name='j_id0:contactForm:emailAddress']")
	public static WebElement EmailAddress;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:homeEmail\"]")
	public static WebElement HomeEmail;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:workEmail\"]")
	public static WebElement WorkEmail;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:email5\"]")
	public static WebElement OtherEmail;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:dayPhone\"]")
	public static WebElement PhoneNumber;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:homePhone\"]")
	public static WebElement HomePhone;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:mobilePhone\"]")
	public static WebElement MobilePhone;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:otherPhone\"]")
	public static WebElement OtherPhone;
	
	@FindBy(xpath="//*[@id=\"j_id0:contactForm:j_id88\"]")
	public static WebElement Submit;
	
	@FindBy(xpath="//*[@id=\"Portfolio__c_body\"]/table/tbody/tr[2]/th/a")
	public static WebElement SelectPortfolio;
	
	@FindBy(xpath="//*[@id=\"lookup00300000005rb8d00N00000008ezCH\"]")
	public static WebElement SelectOwner;
	
	@FindBy(xpath="//*[@id=\"lookup003000000064j8h00N00000008ezCH\"]")
	public static WebElement Owner01;
	
	@FindBy(xpath="//*[@id=\"lookup00300000006563d00N00000008ezCH\"]")
	public static WebElement Owner87;
	
	@FindBy(xpath="//*[@id=\"lookup003000000064YZV00N00000008ezCH\"]")
	public static WebElement OwnerLTS;
	
	@FindBy(xpath="/html/body/div/div[2]/table/tbody/tr/td/div[2]/table/tbody/tr/td[2]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/table/tbody/tr[2]/th/a")
	public static WebElement SelectContacts002;
	
	
	@FindBy(xpath="//*[@id=\"Contact_body\"]/table/tbody/tr[2]/th")
	public static WebElement Contacts002;
	
	@FindBy(xpath="//*[@id=\"lookup00300000005rb8d00N00000008ezCH\"]")
	public static WebElement Owner82;
	
	@FindBy(xpath="//*[@id=\"lookup003000000065AB400N00000008ezCH\"]")
	public static WebElement Owner025;
	
	@FindBy(xpath="//*[@id=\"lookup003000000064j8h00N00000008ezCH\"]")
	public static WebElement Owner201;
}
