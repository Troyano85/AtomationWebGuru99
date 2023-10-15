package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private String username;
    private String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(LoginUI.INPUT_USER_NAME));
        actor.attemptsTo(Enter.theValue(password).into(LoginUI.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(LoginUI.BTN_SUBMIT));

    }
    public static Performable startSection(String username,String password){
        return instrumented(LoginTask.class,username,password);
    }
}
