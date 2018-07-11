package example.cucumber;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Data
@ToString
public class Car {
	private String brand;
	private String color;
	private String torque;
	private String hp;
}
