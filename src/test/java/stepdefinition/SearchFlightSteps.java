package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.SearchFlinghtTask;
import userInterface.ReservationResultUI;

import static constants.Url.RESERVATION;


import static userInterface.ReservationResultUI.TXT_RESPONSE_MESSAGE;

public class SearchFlightSteps {

    Actor actor=Actor.named("user");

    @Managed
    WebDriver MyDriver;

    @Before
    public void setActor(){actor.can(BrowseTheWeb.with(MyDriver));}

    @Given("user is on the flight search page")
    public void userIsOnTheFlightSearchPage() {
        actor.attemptsTo(
                Open.url(RESERVATION)
        );
    }
    @When("User selected flight details")
    public void userSelectedFlightDetails() {
        actor.attemptsTo(
                SearchFlinghtTask.Search());
    }


    @Then("user must see the {string} of their flight")
    public void userMustSeeTheOfTheirFlight(String result) {
        EnsureFieldVisible.ensureThat(actor).canSee(TXT_RESPONSE_MESSAGE.of(result).resolveFor(actor));

    }





}
