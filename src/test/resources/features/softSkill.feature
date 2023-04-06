@SoftSkillScenarios
Feature: SoftSkillPage scenarios
@USIN5
Scenario Outline: As a user I need an option to add a question in dashboards like "Coding" and "Soft Skills"
Given I logIn as "test@yahoo.com" with password "test123"
When I click a dashboard button "<dashboard>"
And I click a button Enter new question
And I fill out new question " What is java 8?" in page "<dashboard>"
And I click a button "enter"
Then Verify new question " What is java 8?" is displayd

Examples:
| dashboard   |
| Coding      |
| Soft Skill  |