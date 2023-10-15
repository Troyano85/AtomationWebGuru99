package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.LoginUI;
import userInterface.RegisterUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterTask implements Task {

    private String firstName,lastName,phone, email,address,city,province,postalCode,userName,password;

    public RegisterTask(String firstName, String lastName, String phone, String email, String address, String city
            , String province, String postalCode, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(RegisterUI.INPUT_FIRST_NAME),
        Enter.theValue(lastName).into(RegisterUI.INPUT_LAST_NAME),
        Enter.theValue(phone).into(RegisterUI.INPUT_PHONE),
        Enter.theValue(email).into(RegisterUI.INPUT_EMAIL),
        Enter.theValue(address).into(RegisterUI.INPUT_ADDRESS),
        Enter.theValue(city).into(RegisterUI.INPUT_CITY),
        Enter.theValue(province).into(RegisterUI.INPUT_PROVINCE),
        Enter.theValue(postalCode).into(RegisterUI.INPUT_POSTAL_CODE),
        Enter.theValue(userName).into(RegisterUI.INPUT_USER_NAME),
        Enter.theValue(password).into(RegisterUI.INPUT_PASSWORD),
        Enter.theValue(password).into(RegisterUI.INPUT_CONFIRM_PASSWORD),
        Click.on(RegisterUI.BTN_SUBMIT));
    }
    public static Performable writeDownData( String firstName, String lastName,String phone, String email
            , String address, String city, String province, String postalCode, String userName, String password){

        return instrumented(RegisterTask.class,firstName,lastName,phone, email,address,city,province,postalCode
                ,userName,password);
    }
}
