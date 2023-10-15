package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ReservationResultUI {
    public static final Target TXT_RESPONSE_MESSAGE=Target.the("response message")
            .locatedBy("//*[contains (text(), '{0}')]");
}
