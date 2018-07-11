package examples.java;

import java.util.Locale;
import java.util.Map;

import cucumber.api.TypeRegistryConfigurer;
import example.cucumber.Car;
import example.cucumber.Employee;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import io.cucumber.datatable.TableTransformer;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

	@Override
	public Locale locale() {
		return new Locale("es_ES");
	}

	/**
	 * * Transforms a table entry to in instance of {@code T}
	 * <p>
	 * A table entry consists of the cells of a row paired with the header cells.
	 *
	 * @param <T> the target type
	 */
	private final TableEntryTransformer<Employee> employeeEntryTransformer = new TableEntryTransformer<Employee>() {
		@Override
		public Employee transform(Map<String, String> tableEntry) {
			return new Employee(tableEntry.get("name"), tableEntry.get("role"));
		}
	};

	/**
	 * Transforms a table row to an instance of {@code T}.
	 *
	 * @param table the table
	 * @return an instance of {@code T}
	 * @throws Throwable when the transform fails for any reason
	 */

	private final TableTransformer<Car> carTableTransformer = new TableTransformer<Car>() {
		@Override
		public Car transform(DataTable dataTable) {

			return new Car();
		}
	};

	@Override
	public void configureTypeRegistry(cucumber.api.TypeRegistry typeRegistry) {

		typeRegistry.defineDataTableType(new DataTableType(Employee.class, employeeEntryTransformer));

		typeRegistry.defineDataTableType(new DataTableType(Car.class, carTableTransformer));
	}
}
