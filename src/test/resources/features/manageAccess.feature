Feature: Manage Access page scenarios

  Background:
    Given I logIn as "admin@yahoo.com" with password "admin123"

  @IN13
  Scenario: Admin should see a form in Manage Access page with following fields
    When I click a button "Manage Access"
    Then Verify form in Manage Access page is displayed with following fields:
      | First Name       |
      | Last Name        |
      | E-mail           |
      | Role             |
      | Batch            |