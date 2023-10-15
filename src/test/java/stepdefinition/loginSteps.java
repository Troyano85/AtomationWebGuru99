package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.LoginTask;

import static constants.Url.SIGN_ON;
import static userInterface.HomeUI.TXT_MESSAGE;


public class loginSteps {

    Actor actor=Actor.named("user");

    @Managed
    WebDriver MyDriver;

    @Before
    public void setActor(){actor.can(BrowseTheWeb.with(MyDriver));}

    @Given("user is on the Mercury tours home page")
    public void userIsOnTheMercuryToursHomePage() {
       actor.attemptsTo(
             Open.url(SIGN_ON)
     );
    }
    @When("user writes {string} and {string}")
    public void userWritesAnd(String username, String password) {
       actor.attemptsTo(LoginTask.startSection(username,password));
    }
    @Then("he sees the successful {string}")
    public void heSeesTheSuccessful(String message) {
        EnsureFieldVisible.ensureThat(actor).canSee(TXT_MESSAGE.of(message).resolveFor(actor));
    }

}
