Feature: Search product and navigate to details page

Background:
 	 Given User launch home page of application
   When User navigate to login page
   And User login with <userName> and <password>
      | abhiaute123.aa@gmail.com | Abhijeet@999 |

  Scenario: Searching product
    Then User search for product 'Cricket bat'
    And User see search result for 'Cricket bat'
  
  Scenario Outline:search multiple product through scenario outline
    Then User search for product '<productName>'
    And User see search result for '<productName>'  
    Examples:
							| productName     |
							| Tennis ball |
							| Shoes       |
							
	Scenario: Navigate to Product details page
    Then User search for product 'Gray nicolls English willow cricket bat babar azam edition'
    When User select first product from search result page
    Then User should see product details page for 'Gray nicolls English willow cricket bat babar azam edition'

