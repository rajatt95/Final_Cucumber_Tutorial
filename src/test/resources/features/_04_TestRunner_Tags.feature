Feature: Application Login feature

@Test_Regression
  Scenario: HomePage Default Login
    Given User is on NetBanking Landing page
    When User log into application with username and password
    Then HomePage is populated
    And Cards are displayed

#Below scenario is mapped with 2 tags (@Test_Smoke and @Test_Sanity)
@Test_Smoke @Test_Sanity
  Scenario: HomePage Login with Dummy User credentials
    Given User is on NetBanking Landing page
    When User log into application with username "Dummy_User_1" and password "Dummy@213_1"
    Then HomePage is populated
    And Cards are not displayed

@Test_Regression @Test_Sanity
  Scenario: HomePage Login with Dummy User credentials
    Given User is on NetBanking Landing page
    When User log into application with username "Dummy_User_2" and password "Dummy@213_2"
    Then HomePage is populated
    And Cards are not displayed
