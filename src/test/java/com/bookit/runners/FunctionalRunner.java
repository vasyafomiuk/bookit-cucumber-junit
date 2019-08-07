package com.bookit.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin={"pretty:target/cucumber-pretty.txt",
				"html:target/html-report",
				"json:target/c.json",
				"junit:target/junit/junit-report.xml",
			},
		tags = {"@BRIT-4533",},
		features= {
			"src/test/resources/features"
		},
        glue= {"com/bookit/stepdefinitions","com/bookit/suitesetupandteardown"},
        dryRun=true,
        monochrome = true
		)
public class FunctionalRunner {
	
}
