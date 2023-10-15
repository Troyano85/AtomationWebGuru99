package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUI {

    public static final Target INPUT_FIRST_NAME = Target.the("write First name")
            .locatedBy("//input[@name=\"firstName\"]");
    public static final Target INPUT_LAST_NAME = Target.the("write Last name")
            .locatedBy("//input[@name=\"lastName\"]");
    public static final Target INPUT_PHONE = Target.the("write phone")
            .locatedBy("//input[@name=\"phone\"]");
    public static final Target INPUT_EMAIL = Target.the("write address")
            .locatedBy("//input[@name=\"userName\"]");
    public static final Target INPUT_ADDRESS = Target.the("write address")
            .locatedBy("//input[@name=\"address1\"]");
    public static final Target INPUT_CITY = Target.the("write city")
            .locatedBy("//input[@name=\"city\"]");
    public static final Target INPUT_PROVINCE = Target.the("write province")
            .locatedBy("//input[@name=\"state\"]");
    public static final Target INPUT_POSTAL_CODE = Target.the("write postal code")
            .locatedBy("//input[@name=\"postalCode\"]");
    public static final Target INPUT_USER_NAME = Target.the("write username")
            .locatedBy("//input[@name=\"email\"]");
    public static final Target INPUT_PASSWORD = Target.the("write password")
            .locatedBy("//input[@name=\"password\"]");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("write password")
            .locatedBy("//input[@name=\"confirmPassword\"]");
    public static final Target BTN_SUBMIT = Target.the("write password")
            .locatedBy("//input[@name=\"submit\"]");

}

