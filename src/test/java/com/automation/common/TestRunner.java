package com.automation.common;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/com/automation/features",
	glue={"com/automation/common","com.automation.steps"},
	plugin = {"pretty"},
	monochrome = true
)
public class TestRunner {

	
}
