package com.distinct_count.stepdef;

import org.springframework.beans.factory.annotation.Autowired;
import com.distinct_count.CountInput;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CountInputStepdef {
String output = "";
	@Autowired
	@Given("^sequence of input string$")
	public void sequence_of_input_string() throws Throwable {
		
	}

	@When("^\"([^\"]*)\" count letters between the first and the last letters$")
	public void count_letters_between_the_first_and_the_last_letters(String arg1) throws Throwable {
		output=CountInput.parseSentence(arg1);
	}

	@Then("^display \"([^\"]*)\"$")
	public void display(String arg1) throws Throwable {
		junit.framework.Assert.assertEquals(output,arg1);
	}
}