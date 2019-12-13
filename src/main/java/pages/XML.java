package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XML {

	@FindBy(xpath="//a[contains(text(),'Home')]")
	public static WebElement Home;
	
	@FindBy(xpath="//*[contains(text(),'View Transmittals')]")
	public static WebElement ViewTransmittals;
	
	@FindBy(xpath="//*[@id='submissions']/tbody/tr[1]/td[5]/button")
	public static WebElement ViewSubmition;
	
	@FindBy(xpath="//*[@id='submissions']/tbody/tr[2]/td/div[2]/div/a")
	public static WebElement DawnloadData;
	
	@FindBy(xpath="//*[@id='submissions']/tbody/tr[2]/td/div[2]/table[2]/tbody/tr/td[2]/a")
	public static WebElement ClickTheName;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[4]/table/tbody/tr[1]/td[4]/a")
	public static WebElement ClickView;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[4]/table/tbody/tr[5]/td[4]/a")
	public static WebElement ClickSecondView;
}
