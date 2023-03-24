@HomeScenarios
Feature: Homepage scenarios
  Background:
    Given I logIn as user "test@yahoo.com" with password "test123"

    Scenario: Title of the page should be "Interview App"
      Then Verify title is displayed "Interview App"


