Feature: Login Feature
    Verify the login functionality

    @selenium 
    Scenario Outline: Verify the login with valid credentials
    Given User is on Home page
    When enter the username "<username>" and password "<password>"
    Then redirecting on dashboard page
    Then logout the user account
    
    Examples: 
    |username                     |password       |
    |scantist3                    |Ssunrise1!     |