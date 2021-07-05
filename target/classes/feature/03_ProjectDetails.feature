Feature: Project details Feature
  Verify the project details feature functionality  
 
#   @selenium
#   Scenario Outline: Verify the login with valid credentials
#   Given User is on Home page
#    When enter the username "<username>" and password "<password>"
#    Then redirecting on dashboard page    
#    Examples: 
#    |username                     |password       |
#    |scantist3                    |Ssunrise1!     |
    
    Scenario: Verify the Project page
	When Click on project menu
	Then validate the Project page
	
	Scenario: Verify the source scan 
	Given clear the project name from serach box
	When enter the source project name "Gradle-Scopes" and hit enter
	And Click on project to go project details page
	When read the data from column
	
	Scenario: Verify the source scan 
	Given Click on back
	Given clear the project name from serach box
	When enter the source project name "openssl" and hit enter
	And Click on project to go project details 
	When read the data from column
	
#	Scenario: Verify to download report
#	When Click on genarate report
#	Then Download json report
#	Then Download xml report
#	Then Download csv report
#	Then Download pdf report
	