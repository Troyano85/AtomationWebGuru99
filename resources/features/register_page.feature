Feature: register on the page

  Scenario Outline: user registers on the page by entering their data
    Given user is on the registration page
    When  user enters his personal data <FirstName>,<LastName>,<Phone>,<Email>.<Address>,<City>,<Province>,<PostalCode>,<UserName>,<Password>
    Then user sees the <validText>

    Examples:
      |FirstName|LastName|Phone|Email|Address|City|Province|PostalCode|UserName|Password|validText|
      |'David'|'Torres'|'384534'|'david3@gmail.com'|'calle 18 4-24'|'Medellin'|'sel'|'124'|'qualityadmi'|'pass1'|'Note: Your user name is qualityadmi.'|
