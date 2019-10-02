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
	
}
