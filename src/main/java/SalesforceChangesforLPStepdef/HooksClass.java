package SalesforceChangesforLPStepdef;

	import cucumber.api.Scenario;
	import cucumber.api.java.*;
	import utilities.*;

	public class HooksClass extends TestBase {


			@Before(order = 1)
			public void setUp() {
				
			  SetUp();
			}
		
			
			@Before(order = 2)
			public void customerPortalChangesForLP() {
				
				CustomerPortalChangesForLP();
			}
			

		
			
			@After
			public void tearDown(Scenario scenario) {
					TearDown(scenario);
			}

		}

