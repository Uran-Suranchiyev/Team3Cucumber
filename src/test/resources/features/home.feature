@HomeScenarios
Feature: Homepage scenarios

  @IN-6(1)
  Scenario: As a user I should be able to edit or delete dashboard questions
    Given I logIn as "test@yahoo.com" with password "test123"
    When I click on "Soft Skills" button
    Then Verify "Edit" button is enabled
    Then Verify "Delete" button is enabled


    @IN-6(2)
    Scenario: As a user I should be able to edit or delete dashboard questions
    Given I logIn as "test@yahoo.com" with password "test123"
    Then I click on "Coding" button
    Then Verify "Edit" button is enabled
    Then Verify "Delete" button is enabled


  @IN-7
  Scenario: As a user I should be able to see all questions displayed in "All Topics"
    Given I logIn as "test@yahoo.com" with password "test123"
    When I click on "All Topics" button
    Then Verify "All questions" is displayed


  @IN-8
  Scenario: As a user I should be able to search for certain question based on the given word criteria
    Given I logIn as "test@yahoo.com" with password "test123"
    When I click on "All Topics" button
    And I enter "What is java 8?" word criteria into the the search field
    When I click on "Search icon" button
    Then Verify "What is java 8" is displayed
    And I click on "Show all" button
    Then Verify "All questions" is displayed



  @IN-9
  Scenario: As a user I should be able to click on Sign out button, which take me back to Login page
    Given I logIn as "test@yahoo.com" with password "test123"
    When I click on "Sign Out" button
    Then Verify "Login Page" is displayed


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








