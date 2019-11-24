@TEC-103
Feature: Etsy Search Functionality


  @TECTC-1011
  Scenario Outline: Validate Etsy search message
    Given Navigate to Etsy Homepage
    When User searches for "<item>"
    Then Validate search message have  word "<item>"
    Examples:
      | item   |
      | carpet |
      | 123    |


  @TECTC-1012
  Scenario Outline: Verify if every Etsy department match the Title name and valid
    Given Navigate to Etsy Homepage
    When User clicks on "<department>"
    Then User validate Title "<title>"
    Examples:
      | department            | title                         |
      | Jewelry & Accessories | Jewelry & Accessories \| Etsy |
      | Clothing & Shoes      | Clothing & Shoes \| Etsy      |

      | Home & Living         | Home & Living \| Etsy         |
      | Wedding & Party       | Wedding & Party \| Etsy       |

  @TECTC-1013
  Scenario Outline: Verify if item has free shipping label on result items
    Given Navigate to Etsy Homepage
    When User searches for "<item>"
    Then User clicks on Free Shipping
    Then Verify all results have "FREE shippin" label
    Examples:
      | item                   |
      | wireless phone charger |


    @TECTC_1014
    Scenario Outline: Validate over price functionality
      Given Navigate to Etsy Homepage
      When User searches for "<item>"
      And User clicks on Over Price checkbox
      Then User verifies all items prices are over that price
      Examples:
        | item   |
        | carpet |










