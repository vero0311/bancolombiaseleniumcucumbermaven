package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "tests",
        plugin = {"pretty", "html:reports"},
        snippets = SnippetType.CAMELCASE,
        tags = "@Scenario2"
)

public class Runner {
}
