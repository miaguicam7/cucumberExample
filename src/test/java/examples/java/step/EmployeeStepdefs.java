package examples.java.step;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import example.cucumber.Employee;

public class EmployeeStepdefs {

    private int currTotalSrDev;
    private int currTotalJrDev;

    @When("^I see the following cooked I should say:$")
    public void theFoodResponse(List<String> expectedCucumberTable) {
        // Normally you'd put this in a database or JSON
        List<Employee> actualCukes = new ArrayList<Employee>();
        
//        actualCukes.add(new Employee("Paco", "Jardinero"));
//        actualCukes.add(new Employee("Bartolo", "Albañil")); 
    }

  

    @Then("^the organization will have (\\d+) Sr. Dev and (\\d+) Jr. Dev$")
    public void the_organization_will_have_Sr_Dev_and_Jr_Dev(int expTotalSrDev,
            int expTotalJrDev) throws Throwable {
        assertThat(currTotalSrDev, is(expTotalSrDev));
        assertThat(currTotalJrDev, is(expTotalJrDev));
    }}
