Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario  
  
    Given Launch the browser with url and click add customer option
    
    When The user enter the details by using map
      | firstname | gowtham        |
      | lastname  | sridhar        |
      | mail      | gaut@gmail.com |
      | add       | chennai        |
      | no        | 9176867123     |
      
    Then The user can see the confirmation code using map
