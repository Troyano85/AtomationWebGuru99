package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterSucessUI {

    public static final Target TXT_VALIDATION_TEXT=Target.the("validation text")
            .locatedBy("//*[contains (text(), '{0}')]");
}
