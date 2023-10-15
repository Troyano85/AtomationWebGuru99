package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target TXT_MESSAGE=Target.the("login successsfully")
            .locatedBy("//*[contains (text(), '{0}')]");
}
