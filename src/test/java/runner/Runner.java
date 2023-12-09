package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/features",
        glue = {"src/test/java/stepDefinition", "src/test/java/utility"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class Runner {
}
