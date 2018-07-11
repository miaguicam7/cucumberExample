package examples.java.step;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import example.cucumber.Employee;

public class EmployeeStepdefs {
	//private static final Logger log = LoggerFactory.getLogger(EmployeeStepdefs.class);

	List<Employee> employeeList = null;

	@When("^I see the following cooked I should say:$")
	public void theFoodResponse(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Then("^the organization will have (\\d+) employees$")
	public void the_organization_will_have_Sr_Dev_and_Jr_Dev(int arg1) throws Throwable {
		assertEquals(employeeList.size(), arg1);
	}
}
