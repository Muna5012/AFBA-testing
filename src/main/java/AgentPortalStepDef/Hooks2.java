package AgentPortalStepDef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.TestBase;

public class Hooks2 extends TestBase{
	@Before(order = 1)
	public void setUp() {
		
	  SetUp();
	}
	
	@Before(order = 6)
	public void agentlogin() {
		AgentLogin();
	}
	
	@After
	public void tearDown(Scenario scenario) {
			TearDown(scenario);
	}
}
