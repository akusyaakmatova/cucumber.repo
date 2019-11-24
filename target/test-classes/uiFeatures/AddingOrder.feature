@TEC-102
Feature: Adding Order

  Scenario: Verify create order functionality
    Given Navigate to login page
    Then User logs in with valid credentials username is "Tester" password "test"
    And User clicks on order
    Then User creates new order
      | Product Name | Quantity | Customer Name | Street     | City    | State | Zip   | Card Number | Expired Date |
      | ScreenSaver  | 2        | Techtorial    | 123 N Tech | Chicago | IL    | 60000 | 718292      | 12/21        |

    Then User verifies Order "is" created

    Scenario: Verify create order functionality with invalid data
      Given Navigate to login page
      Then User logs in with invalid credentials username "Tester" password "test"
      And User clicks on order
      Then User creates new order
        | Product Name | Quantity | Customer Name | Street     | City    | State | Zip   | Card Number | Expired Date |
        | ScreenSaver  | 2        | Techtorial    | 123 N Tech | Chicago | IL    | 6jhsb | 718292      | 12/21        |
      Then User verifies order "is NOT" created

