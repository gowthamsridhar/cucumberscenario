Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Confirmation page
    Given The user launch the browser with url
    When The user enter the details
      | gowtham | sridhar | gautham@gmail.com | asdfg | 7188994132 |
      | guna    | govind  | guna@gmail.com    | sfdgg | 9172837465 |
    Then The user can see the confirmation code
