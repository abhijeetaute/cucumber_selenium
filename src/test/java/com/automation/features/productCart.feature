
Feature: Product cart feature

  Background:
 	#Given User launch home page of application
   When User navigate to login page
   And User login with <userName> and <password>
      | abhiaute123.aa@gmail.com | Abhijeet@999 |

  Scenario: Add product to cart
    Then User search for product 'Gray nicolls English willow cricket bat babar azam edition'
    When User select first product from search result page