package com.distinct_count.cucumber;


public class CucumberRunnerUtil {

	public static class CukeTag {
		
		public static final String ADHOC = "@AdHoc";
		public static final String INPROGRESS = "@InProgress";
		public static final String UNIT_TEST = "@UnitTest";
		public static final String INTEGRATION_TEST = "@IntegrationTest";
		public static final String END_TO_END_TEST = "@EndToEndTest";
		public static final String SLOW_TEST = "@SlowTest";
		
	}
	
	
	
	public static class CukeFormat{
		
		public static final String FEATURE_FILE_LOCATION =  "src/test/resources/features";

		public static final String HTML_REPORT = "html:test-results/cucumber-reports/";
		public static final String JSON_RESULTS = "json:test-results/cucumber-reports/";
		public static final String JUNIT_XML_REPORT = "junit:test-results/cucumber-reports/";
		
		public static final String HTML_REPORT_UNIT = "html:test-results/cucumber-reports/unit/";
		public static final String JSON_RESULTS_UNIT = "json:test-results/cucumber-reports/unit/";
		public static final String JUNIT_XML_REPORT_UNIT = "junit:test-results/cucumber-reports/unit/";
		
		public static final String HTML_REPORT_INTEGRATION = "html:test-results/cucumber-reports/integration/";
		public static final String JSON_RESULTS_INTEGRATION = "json:test-results/cucumber-reports/integration/";
		public static final String JUNIT_XML_REPORT_INTEGRATION = "junit:test-results/cucumber-reports/integration/";
		
		public static final String HTML_REPORT_ENDTOEND = "html:test-results/cucumber-reports/endtoend/";
		public static final String JSON_RESULTS_ENDTOEND = "json:test-results/cucumber-reports/endtoend/";
		public static final String JUNIT_XML_REPORT_ENDTOEND = "junit:test-results/cucumber-reports/endtoend/";
		
		public static final String CD_HTML_REPORT = "html:target/cucumber-reports/";
		public static final String CD_JSON_RESULTS = "json:target/cucumber-reports/";
		public static final String CD_JUNIT_XML_REPORT = "junit:target/cucumber-reports/";
		
		public static final String CD_HTML_REPORT_UNIT = "html:target/cucumber-reports/unit/unit/";
		public static final String CD_JSON_RESULTS_UNIT = "json:target/cucumber-reports/unit/";
		public static final String CD_JUNIT_XML_REPORT_UNIT = "junit:target/cucumber-reports/unit/";
		
		public static final String CD_HTML_REPORT_INTEGRATION = "html:target/cucumber-reports/integration/integration/";
		public static final String CD_JSON_RESULTS_INTEGRATION = "json:target/cucumber-reports/integration/";
		public static final String CD_JUNIT_XML_REPORT_INTEGRATION = "junit:target/cucumber-reports/integration/";
		
		public static final String CD_HTML_REPORT_ENDTOEND = "html:target/cucumber-reports/endtoend/endtoend/";
		public static final String CD_JSON_RESULTS_ENDTOEND = "json:target/cucumber-reports/endtoend/";
		public static final String CD_JUNIT_XML_REPORT_ENDTOEND = "junit:target/cucumber-reports/endtoend/";
		
	}
	
	public static final String REGION = "dev";

}
