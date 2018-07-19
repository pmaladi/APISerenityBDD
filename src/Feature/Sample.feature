Feature: Login Action
 
Scenario Outline: Filter by different item types
    Given I have searched for items containing '<material>'
    When I filter results by type '<type>'
    Then I should only see items containing '<material>' of type '<type>'
  Examples:
    | material | type           |
    | silk     | Handmade       |
    | bronze   | Vintage        |
    | wool     | Craft Supplies |