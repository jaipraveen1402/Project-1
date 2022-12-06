package org.Runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmrepo.Generatejvm;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
							glue="org.stepdefinition",
							monochrome=true,
							dryRun=false,
							strict=false,
							plugin= {"html:target","junit:C:\\Users\\Admin\\OneDrive\\Desktop\\repo\\Project-1\\junitreport\\xmlreport.xml","json:junitreport\\jrepo.json"})

public class TestRunnerClass {
	
	@AfterClass
	
	public static void reportGeneration() {
	
		Generatejvm.report("C:\\Users\\Admin\\OneDrive\\Desktop\\repo\\Project-1\\junitreport\\jrepo.json");

	}
	
	
	

}
