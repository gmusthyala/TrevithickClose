Feature: Search
  As a customer
  I want to search for a product
  so that I can view the respective product
  Scenario: Search for a product
    Given I am on homepge
    When  I search for a product "Nike"
    Then I shoud be able see the results