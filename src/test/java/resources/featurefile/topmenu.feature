Feature: Top Menu Test
  As a user I want to open electronics page.

  @smoke @regression
  Scenario: User should navigate to "Electronics" page successfully
    Given I am on home page
    When  I click on "Electronics" page
    Then  I should navigate to electronics page successfully