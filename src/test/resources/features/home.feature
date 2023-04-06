@HomeScenarios
Feature: Homepage scenarios

  Scenario: Title of the page should be "Interview App"
    Given I logIn as "test@yahoo.com" with password "test123"
    Then Verify title is displayed "Interview App"

  @IN10
  Scenario:  When admin logs in "Manage Access" button should be visible
    Given I logIn as "admin@yahoo.com" with password "admin123"
    Then Verify "Manage Access" button is visible

  @IN11
  Scenario Outline: Admin should be able to edit or delete any Do or Don't item in Interview section
    Given I logIn as "admin@yahoo.com" with password "admin123"
    When I click a button "edit" in section "<Section>"
    And add to item text "Uran changed text" in section "<Section>"
    Then Verify item contain text "Uran changed text" in section "<Section>"
    When I click a button "delete" in section "<Section>"
    Then Verify item which contain text "Uran changed text" is deleted in section "<Section>"
    Examples:
    |Section|
    |Do     |
    |Don't  |

  @IN12
  Scenario Outline: Admin should have an ability to add a new dashboard.When a new dashboard is created,
  regular user should be able to see it on their end
    Given I logIn as "admin@yahoo.com" with password "admin123"
    When I add new dashboard "<dashboard text>"
    And I click a button "Sign out"
    And  I logIn as "test@yahoo.com" with password "test123"
    Then Verify dashboard "<dashboard text>" is displayed
    Examples:
      | dashboard text |
      | Itachi         |








