package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ReservationIU {

    public static final Target RADIUS_TYPE=Target.the("Selection of Round Trip")
            .locatedBy("//input[@value=\"roundtrip\"]");
    public static final Target PASSENGERS=Target.the("Selection of passengers")
            .locatedBy("//select[@name=\"passCount\"]");
    public static final Target DEPARTING_FROM=Target.the("Selection of departing")
            .locatedBy("//select[@name=\"fromPort\"]");
    public static final Target MONTH=Target.the("Selection of month")
            .locatedBy("//select[@name=\"fromMonth\"]");
    public static final Target DAY=Target.the("Selection of day")
            .locatedBy("//select[@name=\"fromDay\"]");
    public static final Target ARRIVING_IN=Target.the("Selection of arriving")
            .locatedBy("//select[@name=\"toPort\"]");
    public static final Target RETURNING=Target.the("Selection of returning")
            .locatedBy("//select[@name=\"toMonth\"]");
    public static final Target RETURNING_DAY=Target.the("Selection of return day")
            .locatedBy("//select[@name=\"toDay\"]");
    public static final Target SERVICE_CLASS=Target.the("Selection of economy class")
            .locatedBy("//input[@name=\"servClass\"]");
    public static final Target AIRLINE=Target.the("Selection of airline")
            .locatedBy("//select[@name=\"airline\"]");
    public static final Target BTN_CONTINUE=Target.the("Selection of airline")
            .locatedBy("//input[@name=\"findFlights\"]");





}
