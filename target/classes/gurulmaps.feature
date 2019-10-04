Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Launch the browser with url and click addmember option
    When The user enter the details by using maps
      | firstname | lastname | mail              | add         | no         |
      | gowtham   | sridhar  | gautham@gmail.com | chennai     | 7299663131 |
      | guna      | govind   | guna@gmail.com    | krishnagiri | 9876465778 |
      | arun      | kumar    | arun@gmail.com    | madurai     | 9098764532 |
      | ram       | prakash  | ramd@gmail.com    | theni       | 9897654324 |
    Then The user can see the confirmation code using maps
