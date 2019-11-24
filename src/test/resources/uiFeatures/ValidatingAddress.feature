@userStory2
Feature:  Validating My Address Functionality

  // Scenario: Go to your account and update your address and verify it is updated (Datatable)

  Scenario: Verifying with valid credential
    Given Navigate to Webpage
    Then Sign in with valid credentials

    Then User logs in with valid credentials username email address "helloworld2222@gmail.com" and password "kyrgyzstan1"
    Then User goes to My Addresses, updates address and verifies address
    Then User clicks on update address and updates address with new one
      | Address    | City        | State      | Zip   |
      | 123 Akylai | Los Angeles | California | 90017 |
    And Validate if new address is added
