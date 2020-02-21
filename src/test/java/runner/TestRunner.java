  
package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
				plugin = {
						"html:CucumberReports/HTML", 
						"json:CucumberReports/Jason/MyJasonReport.json",
						"junit:CucumberReports/Junit/MyJunitReport.xml",
						"pretty:CucumberReports/Pretty/MyPretty.txt",
						"usage:CucumberReports/Usage/UsageReport.xml"
				},
				
		features = "MyFeatures"
		,glue = "EappStepDefination",
		dryRun = false,
		tags = {"@EAppProductionIssue1"}
		)

public class TestRunner {

}