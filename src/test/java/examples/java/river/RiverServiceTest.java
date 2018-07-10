package examples.java.river;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * 
 * @author Miguel Ángel Aguilar
 *
 *         -> features: Here we indicate the path that contains the Gherkin file. 
 *         -> glue: reference the steps definition relationated with the Gherkin file. 
 *         -> plugin: reference
 *         the plugin it's working with our cucumber. The most used are the
 *         pretify plugins.
 * 
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:example" })
public class RiverServiceTest {
}
