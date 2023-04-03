@HomeScenarios
Feature: Homepage scenarios
  @USIN1
  Scenario: Title of the page should be "Interview App"
    Given I logIn as user "test@yahoo.com" with password "test123"
    Then Verify title is displayed "Interview App"

  @USIN2
  Scenario: When I sign in as a user, I should be able to see only "Sign out" button from nav bar.
    Given I logIn as user "test@yahoo.com" with password "test123"
    Then I should be able to see only "Sign out" button

  @USIN3
  Scenario: When I log in as a any user, there should always be 3 dashboards present.
    Given I logIn as user "test@yahoo.com" with password "test123"
    Then Verify following dashboards are displayed:
      | All Topics  |
      | Coding      |
      | Soft Skills |

  @USIN4
  Scenario: As a user I should have an option to add a statement in Do's and Dont's sections.
    Given I logIn as user "test@yahoo.com" with password "test123"
    When I click a button "addDoBtn"
    Then Verify I have an option add text "yourInputDo" in do section
    When I click a button "addDontBtn"
    Then Verify I  have an option add text "yourInputDont" in dont's section

  @USIN5
  Scenario Outline: As a user I need an option to add a question in dashboards like "Coding" and "Soft Skills"
    Given I logIn as user "test@yahoo.com" with password "test123"
    When I click a dashboard button "<dashboard>"
    And I click a button Enter new question
    And I fill out new question " What is java 8?" in page "<dashboard>"
    And I click a button "enter"
    Then Verify new question " What is java 8?" is displayd

    Examples:
      | dashboard   |
      | Coding      |
      | Soft Skill  |

