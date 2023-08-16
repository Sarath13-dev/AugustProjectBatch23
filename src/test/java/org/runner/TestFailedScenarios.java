package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"@target/failedrerun.txt"}, glue="org.steps")
public class TestFailedScenarios  extends AbstractTestNGCucumberTests{
	

}
