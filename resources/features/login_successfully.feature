Feature: Enter the application

  Scenario Outline: user enter the application with their correct credentials
    Given user is on the Mercury tours home page
    When user writes <username> and <password>
    Then he sees the successful <message>
    Examples:
      | username      | password | message              |
      | 'qualityadmi' | 'pass1'  | 'Login Successfully' |


