package com.distinct_count.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE, strict = true, monochrome = true, tags = {"~@IgnoreTest", "@AdHoc" }, 
features = {CucumberRunnerUtil.CukeFormat.FEATURE_FILE_LOCATION}, 
glue = {"com.distinct_count"},
plugin = {"pretty", CucumberRunnerUtil.CukeFormat.HTML_REPORT + "adhoc-test-reports", 
		CucumberRunnerUtil.CukeFormat.JSON_RESULTS + "adhoc-test-reports/adhoc-test-reports.json",
		CucumberRunnerUtil.CukeFormat.JUNIT_XML_REPORT + "adhoc-test-reports/adhoc-test-reports.xml"})
public class RunAdHocCuke {


}