package NGPStepDef;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import utilities.*;

public class Hooks extends TestBase {


		@Before(order = 1)
		public void setUp() {
			
		  SetUp();
		}
	
		
		@Before(order = 2)
		public void ngp() {
			
			NGP();
		}
		

	
		
		@After
		public void tearDown(Scenario scenario) {
				TearDown(scenario);
		}

	}