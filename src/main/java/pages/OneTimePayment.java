package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneTimePayment {

	@FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id120:1:j_id124']/input")
	public static WebElement SelectSecond;
	
	@FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id120:2:j_id124']/input")
	public static WebElement SelectThird;
	
	@FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id213']")
	public static WebElement NextBtn;
	
	@FindBy(xpath="//*[@id=\"OneTimePayment:j_id41:j_id42:theForm:theBlock:ccDetails\"]/div[2]/table/tbody/tr[3]/td/input")
	public static WebElement CreditCardNum;
	
	@FindBy(xpath="//*[@id=\"OneTimePayment:j_id41:j_id42:theForm:theBlock:ccDetails\"]/div[2]/table/tbody/tr[5]/td/input")
	public static WebElement CVV;
	
	@FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:theBlock:j_id211']")
	public static WebElement PayNowBtn;
	
	@FindBy(xpath="//*[@id=\"OneTimePayment:j_id41:j_id42:theForm:j_id47:j_id48:j_id49:0:j_id50\"]/div/table/tbody")
	public static WebElement GetErrorMessage;
	
	@FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:j_id74:0:j_id82']/img")
	public static WebElement Greenface;
	
	@FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:j_id74:0:j_id85']/img")
	public static WebElement YellowFace;
	
	@FindBy(xpath="/html/body/div/div/div/section/form/div[1]/div[2]/a[3]/img")
	public static WebElement RedFace;
	
	@FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:j_id74:1:j_id82']/img")
	public static WebElement AFBAGreenFace;
	
	@FindBy(xpath="//*[@id=\"OneTimePayment:j_id41:j_id42:theForm:j_id74:1:j_id85\"]/img")
	public static WebElement AFBAYellowFace;
	
	@FindBy(xpath="/html/body/div/div/div/section/form/div[1]/div[4]/a[3]/img")
	public static WebElement AFBARedFace;
	
	@FindBy(xpath="//*[@id='OneTimePayment:j_id41:j_id42:theForm:j_id74:2:j_id91']/textarea")
	public static WebElement Comments;
	
	@FindBy(xpath="//*[@id=\"OneTimePayment:j_id41:j_id42:theForm:j_id74:2:commentsSave\"]")
	public static WebElement SaveBotton; 
	
	@FindBy(xpath="//*[@id=\"OneTimePayment:j_id41:j_id42:theForm:feedback\"]")
	public static WebElement GetAlltheText;
	
	@FindBy(xpath="//*[contains(text(),'Save')]")
	public static WebElement SaveBtn;
	
	
	
	


}
