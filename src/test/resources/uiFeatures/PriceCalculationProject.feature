@userStory3
Feature: Price Calculation
  @test4
  Scenario:  Add to cart 5 orders and verify their total price is calculated correct
    Given Navigate to Webpage
    Then Sign in with valid credentials

    Then User logs in with valid credentials username email address "helloworld2222@gmail.com" and password "kyrgyzstan1"
    Then User goes to My Addresses, updates address and verifies address
    Then User clicks on update address and updates address with new one
      | Address    | City        | State      | Zip   |
      | 123 Akylai | Los Angeles | California | 90017 |
    And Validate if new address is added
   @test5
    Scenario:
    Given User goes to Main page and picks 5 items
    Then User calculates items total
    And Verifies total price of items calculated correct

