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
import tasks.RegisterTask;

import static constants.Url.PAGE_REGISTER;
import static userInterface.RegisterSucessUI.TXT_VALIDATION_TEXT;

public class RegisterOnPageSteps {

    Actor actor=Actor.named("user");

    @Managed
    WebDriver MyDriver;

    @Before
    public void setActor(){actor.can(BrowseTheWeb.with(MyDriver));}


    @Given("user is on the registration page")
    public void userIsOnTheRegistrationPage() {

        actor.attemptsTo(
                Open.url(PAGE_REGISTER)
        );

    }
    @When("user enters his personal data {string},{string},{string},{string}.{string},{string},{string},{string},{string},{string}")
    public void userEntersHisPersonalData(String firstName, String lastName, String phone, String email
            , String address, String city, String province, String postalCode, String userName, String password) {
        actor.attemptsTo(RegisterTask.writeDownData(firstName,lastName,phone, email,address,city,province,postalCode
                ,userName,password));
    }
    @Then("user sees the {string}")
    public void userSeesThe(String validText) {
        EnsureFieldVisible.ensureThat(actor).canSee(TXT_VALIDATION_TEXT.of(validText).resolveFor(actor));

    }


}
