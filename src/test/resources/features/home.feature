@HomeScenarios
Feature: Homepage scenarios

  @IN-6(1)
  Scenario: As a user I should be able to edit or delete dashboard questions
    Given I logIn as user "test@yahoo.com" with password "test123"
    When I click on "Soft Skills" button
    Then Verify "Edit" button is enabled
    Then Verify "Delete" button is enabled


    @IN-6(2)
    Scenario: As a user I should be able to edit or delete dashboard questions
    Given I logIn as user "test@yahoo.com" with password "test123"
    Then I click on "Coding" button
    Then Verify "Edit" button is enabled
    Then Verify "Delete" button is enabled


  @IN-7
  Scenario: As a user I should be able to see all questions displayed in "All Topics"
    Given I logIn as user "test@yahoo.com" with password "test123"
    When I click on "All Topics" button
    Then Verify "All questions" is displayed


  @IN-8
  Scenario: As a user I should be able to search for certain question based on the given word criteria
    Given I logIn as user "test@yahoo.com" with password "test123"
    When I click on "All Topics" button
    And I enter "What is java 8?" word criteria into the the search field
    When I click on "Search icon" button
    Then Verify "What is java 8" is displayed
    And I click on "Show all" button
    Then Verify "All questions" is displayed



  @IN-9
  Scenario: As a user I should be able to click on Sign out button, which take me back to Login page
    Given I logIn as user "test@yahoo.com" with password "test123"
    When I click on "Sign Out" button
    Then Verify "Login Page" is displayed


        



