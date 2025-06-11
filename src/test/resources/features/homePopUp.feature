Feature:

  Scenario: Close the popup
    Given the user is on homepage
    When the popup is displayed
    Then the user closes the popup
    And the homepage is displayed