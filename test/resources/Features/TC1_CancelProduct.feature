@cancel
Feature: Verifying Amazon Cancel Booking Page

  Scenario Outline: Cancel the order in add cart
    Given User is on the Amazon Page
    Then User should verify the after launch "Hello"
    When User search the product "<search>"
    Then User should verify after search success message "iphone 14"
    When User select the radio button to sort by high to low
    Then User should verify all product arranged in descending order
    When User select the first product and save product name and price
    Then User should verify after select the product "iPhone 14 Pro max"
    When User add the product to add cart
    Then User should verify after produt adding to cart "Shopping Cart"
    When User is sign in page enter the "<username>" and "<password>"
    Then User should verify after adding address "Checkout"
    And User enter the new address "<Fullname>","<MobileNo>","<Pincode>","<address>","<area>","<Landmark>","<city>" & "<State>"
    And User enter the patyment options using NetBanking
    And User verify same product and price remove the product in add cart
    Then User should verify after remove the produt to cart "Your Amazon Cart is empty."

    Examples: 
      | search    | username   | password       | Fullname         | MobileNo   | Pincode | address            | area     | Landmark         | city    | State      |
      | iphone 14 | 7550253193 | Keerthana@1809 | Santhosh Kumwoar | 9360418886 |  600078 | G1/14 Gandhi Nagar | Perambur | Vinayagar temple | Chennai | TAMIL NADU |
