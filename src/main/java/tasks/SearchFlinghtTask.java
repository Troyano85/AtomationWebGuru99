package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userInterface.ReservationIU;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchFlinghtTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReservationIU.RADIUS_TYPE),
                SelectFromOptions.byVisibleText("2").from(ReservationIU.PASSENGERS),
                SelectFromOptions.byVisibleText("London").from(ReservationIU.DEPARTING_FROM),
                SelectFromOptions.byVisibleText("April").from(ReservationIU.MONTH),
                SelectFromOptions.byVisibleText("8").from(ReservationIU.DAY),
                SelectFromOptions.byVisibleText("New York").from(ReservationIU.ARRIVING_IN),
                SelectFromOptions.byVisibleText("May").from(ReservationIU.RETURNING),
                SelectFromOptions.byVisibleText("18").from(ReservationIU.RETURNING_DAY),
                Click.on(ReservationIU.SERVICE_CLASS),
                SelectFromOptions.byVisibleText("No Preference").from(ReservationIU.AIRLINE),
                Click.on(ReservationIU.BTN_CONTINUE)
        );

    }
    public static Performable Search(){
        return instrumented(SearchFlinghtTask.class);
    }

}
