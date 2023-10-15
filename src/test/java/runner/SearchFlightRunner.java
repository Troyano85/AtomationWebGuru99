package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "resources/features/search_flight.feature", glue = "stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class SearchFlightRunner {
}
