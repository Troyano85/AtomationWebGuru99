Feature: Perform a flight search
Scenario: user performs a travel search to stop his trip
  Given user is on the flight search page
  When  User selected flight details
  Then  user must see the <result> of their flight

  Examples:
    |result|
    |'After flight finder - No Seats Avaialble'|
