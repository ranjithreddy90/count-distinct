@AdHoc
Feature: To verify count of distinct letters between the first and the last letters of input
  
  Description: This feature verifies count of distinct letters between the first and the last letters

  Scenario Outline: User verifies count of letters between the first and the last letters
    Given sequence of input string
    When "<inputstring>" count letters between the first and the last letters
    Then display "<outputdata>"

    Examples: 
      | inputstring         | outputdata        |
      | Received date range | R4d      d2e  r3e |
