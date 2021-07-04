Feature: Project Feature
  Verify the Project functionality 
  
    Scenario Outline: Verify the login with valid credentials
    Given User is on Home page
    When enter the username "<username>" and password "<password>"
    Then redirecting on dashboard page    
    Examples: 
    |username                    |password        |
    |scantist3                   |Ssunrise1!      |
    
    Scenario: Verify the Project page
	When Click on project menu
	Then validate the Project page
	
	Scenario: Verify the overview section
	When Get the overview section information
	Then validate the overview section
	
	Scenario: Verify the source scan 
	When Click on project menu
	Then validate the Project page
	When enter the source project name "Gradle-Scopes" and hit enter
	Then validate the project details
	When click on scan button to scan source code
	And wait until the scan completion of source code 
	Then validate the scan result
	When enter the source project name "openssl" and hit enter
	Then validate the project details
	When click on scan button to scan source code
	And wait until the scan completion of source code 
	Then validate the scan result