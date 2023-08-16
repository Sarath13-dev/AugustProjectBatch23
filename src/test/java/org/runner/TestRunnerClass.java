package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\LENOVO\\newEclipseWorkspe\\CucumberTestng\\src\\test\\resources\\Facebook.feature",
glue="org.steps",
plugin= {"rerun:target/failedrerun.txt"})
public class TestRunnerClass extends AbstractTestNGCucumberTests{

}
