Feature: Application Login feature

  Scenario Outline: HomePage Login with different User credentials
    Given User is on NetBanking Landing page
    When User log into application with username <username> and password <password>
    Then HomePage is populated
    And Cards are displayed with status <status>

    Examples: 
      | username       | password           | status    |
      | "Invalid_User" | "Invalid_Password" | "Fail"    |
      | "Invalid_User" | "Valid_Password"   | "Fail"    |
      | "Valid_User"   | "Invalid_Password" | "Fail"    |
      | "Valid_User"   | "Valid_Password"   | "Success" |
