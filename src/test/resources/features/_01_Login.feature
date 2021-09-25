Feature: Application Login feature

  Scenario: HomePage Default Login
    Given User is on NetBanking Landing page
    When User log into application with username and password
    Then HomePage is populated
    And Cards are displayed
