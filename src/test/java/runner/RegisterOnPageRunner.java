package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "resources/features/register_page.feature", glue = "stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RegisterOnPageRunner {

}
