package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClaimsIntake {

	@FindBy(xpath = "//*[@id='Mainmenu:j_id27:j_id28:theForm:j_id42']")
	public static WebElement ClickNext;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantRelationship']")
	public static WebElement Relationship;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:informantRelationship']/option[4]")
	public static WebElement RelationshipSpouse;
	
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
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:state']/option[47]")
	public static WebElement State;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id27:j_id28:theForm:state']/option[47]")
	public static WebElement ZipCode;
	
	@FindBy(xpath="//*[@id=\"Mainmenu:j_id27:j_id28:theForm:informantPhone\"]")
	public static WebElement Phone;
	
	
	
	
	
	
	
	
}
