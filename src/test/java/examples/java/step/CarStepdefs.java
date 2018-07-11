package examples.java.step;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import example.cucumber.Car;
import io.cucumber.datatable.DataTable;

public class CarStepdefs {
	// private static final Logger log =
	// LoggerFactory.getLogger(EmployeeStepdefs.class);

	List<Car> carList = null;

	@When("^The car list we have:$")
	public void setupCarList(DataTable carList) {
		//this.carList = carList;
	}

	@Then("^the organization will have (\\\\d+) cars")
	public void assertCardList(int arg1) throws Throwable {
		assertEquals(carList.size(), arg1);
	}
}
