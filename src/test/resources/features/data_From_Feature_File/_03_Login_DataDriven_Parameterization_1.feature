Feature: Application Login feature

  Scenario Outline: HomePage User Signup
    Given User is on NetBanking Landing page
    When User sign up with following details <FirstName> <LastName> <Email> <Country>

    Examples: 
      | FirstName | LastName | Email                     | Country  |
      | "Rajat"   | "Verma"  | "rajat.verma@gmail.com"   | "India"  |
      | "Shreya"  | "Sharma" | "shreya.sharma@gmail.com" | "Canada" |
      | "Alan"    | "Chang"  | "alan.chan@jetblue.com"   | "US"     |
