Feature: Homepage Feature

  As a user,
  I should be able to see menu items on Homepage navigation.

  Background:
    Given I open upday application

  Scenario: Validate navigation menu items are present
    When I am on homepage
    Then I should see below navigation menu items
      |homeNav|
      |topNewsNav|
      |myNewsNav|