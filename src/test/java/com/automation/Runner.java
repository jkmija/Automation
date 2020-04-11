package com.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
//@CucumberOptions(
//    glue = {"com.jalasoft.marksystems.itk"},
//    features = {"src/test/resources/features"})

@RunWith(Cucumber.class)
@CucumberOptions(

    monochrome = true,
    plugin = {"pretty",
        "html:build/cucumber-html-report",
        "json:build/cucumber.json",
        "junit:build/test-report.xml",
        "usage:build/cucumber-usage.json"
    },
    features = {"src/test/resources/features"},
    glue = {"com.automation"},
    tags = {"@Test1"},
    snippets = SnippetType.CAMELCASE
)
public class Runner {

}