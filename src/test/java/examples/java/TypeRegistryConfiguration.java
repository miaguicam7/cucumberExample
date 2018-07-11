package examples.java;

import java.util.Locale;
import java.util.Map;

import cucumber.api.TypeRegistryConfigurer;
import example.cucumber.Employee;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

	@Override
	public Locale locale() {
		return new Locale("es_ES");
	}

	private final TableEntryTransformer<Employee> employeeEntryTransformer = new TableEntryTransformer<Employee>() {
		@Override
		public Employee transform(Map<String, String> tableEntry) {
			return new Employee(tableEntry.get("name"), tableEntry.get("role"));
		}
	};

	@Override
	public void configureTypeRegistry(cucumber.api.TypeRegistry typeRegistry) {

		typeRegistry.defineDataTableType(new DataTableType(Employee.class, employeeEntryTransformer));
	}
}
