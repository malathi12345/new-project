package log.simple;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\basics\\Cucumber\\src\\test\\resources\\Adactinpage.feature",
monochrome=true,glue="log.simple",dryRun=false,
//plugin="html:C:\\Users\\ELCOT\\eclipse-workspace\\basics\\Cucumber\\target")
plugin="json:C:\\Users\\ELCOT\\eclipse-workspace\\basics\\Cucumber\\target.json")
public class TestRunnerClass {
	
	@AfterClass
	public void tc0() {
		JvmReporting.report("C:\\Users\\ELCOT\\eclipse-workspace\\basics\\Cucumber\\target.json");
		

	}
}
