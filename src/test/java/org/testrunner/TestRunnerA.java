package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", dryRun = false, 
monochrome = true, strict = true, plugin = { "pretty", "html:target\\Reports", "json:target\\Reports\\Output.json",
				"junit:target\\Reports\\fb.xml","rerun:src\\test\\resources\\Rerun\\failed.txt" })

public class TestRunnerA {
	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir") + "\\target\\Reports\\Output.json");
	}
}
