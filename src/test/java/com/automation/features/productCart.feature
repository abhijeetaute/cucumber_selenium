
Feature: Home Page feature

  Background:
 	Given User launch home page of application
  
  Scenario: Verify product count on home page
    When User navigate to 'Shop' from top menu
    And User clicks on 'Home' from breadcrum
    Then User verify only '3' books are displayed
    Then User clicks on 'Selenium Ruby' book
    And User see product details page for 'Selenium Ruby'
    
