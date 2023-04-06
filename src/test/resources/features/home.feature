@HomeScenarios
Feature: Homepage scenarios


  @USIN1
  Scenario: Title of the page should be "Interview App"
    Given I logIn as "test@yahoo.com" with password "test123"
    Then Verify title is displayed "Interview App"


  @USIN2
  Scenario: When I sign in as a user, I should be able to see only "Sign out" button from nav bar.
    Given I logIn as "test@yahoo.com" with password "test123"
    Then I should be able to see only "Sign out" button

  @USIN3
  Scenario: When I log in as a any user, there should always be 3 dashboards present.
    Given I logIn as "test@yahoo.com" with password "test123"
    Then Verify following dashboards are displayed:
      | All Topics  |
      | Coding      |
      | Soft Skills |

  @USIN4
  Scenario: As a user I should have an option to add a statement in Do's and Dont's sections.
    Given I logIn as "test@yahoo.com" with password "test123"
    When I click a button "addDoBtn"
    Then Verify I have an option add text "yourInputDo" in do section
    When I click a button "addDontBtn"
    Then Verify I  have an option add text "yourInputDont" in dont's section


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








