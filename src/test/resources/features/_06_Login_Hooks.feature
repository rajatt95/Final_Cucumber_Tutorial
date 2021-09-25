Feature: Application Login feature

  #Background: List of steps run before each of the scenarios
  #Background keyword is limited to this feature file (_05_Login_Background_Keyword.feature) only
  #This should always be on the top
  Background: 
    Given Common Code 
    	When For all types of Automation tests  
   

  @Test_Desktop
  Scenario: HomePage Default Login
    Given User is on Desktop NetBanking Landing page
    
  @Test_Mobile
  Scenario: HomePage Login with Dummy User credentials
    Given User is on Mobile NetBanking Landing page
    
  @Test_API
  Scenario: HomePage Login with Dummy User credentials
    Given User is on API of NetBanking Landing page
    