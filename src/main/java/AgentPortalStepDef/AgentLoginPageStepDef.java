package AgentPortalStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AgentLoginPage;
import utilities.TestBase;

public class AgentLoginPageStepDef extends TestBase {
	
	@Given("Click Forget password button")
	public void click_Forget_password_button() {
		 String str = AgentLoginPage.GetTextOfEnterYourUserName.getText();
		    System.out.println(str + "\n");
			act.pause(2000).perform();
		AgentLoginPage.ForgetPasswordBtn.click();
		act.pause(1000).perform();
	}

	@When("Open new page Enter your User Name")
	public void open_new_page_Enter_your_User_Name() {
		 String str = AgentLoginPage.GetTextOfForgetPassword.getText();
		    System.out.println(str + "\n");
			act.pause(2000).perform();
	}

	@Then("Click Submit button")
	public void click_Submit_button() {
	    
	}


}
