package examples.java.river.step;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import example.cucumber.river.RiverService;

public class RiverStepdefs {

	RiverService riverService;

	String province;

	@Given("I want know a province river")
	public void setUpStepDef() {
		riverService = new RiverService();
	}

	@When("I ask for a (.*) river")
	public void setWhenClause(String arg1) {
		province = arg1;
	}

	@Then("the result should be (.*)")
	public void setThenClause(String arg1) {
		assertTrue(riverService.getProvinceRiver(province).equals(arg1));
	}
}
