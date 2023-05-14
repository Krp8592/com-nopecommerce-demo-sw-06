Feature: TestSuite

  @smoke @regression
  Scenario: User should be able to arrange products in alphabetical order successfully
    Given I am on home page
    When I click on Computer Menu
    And I click on Desktop
    Then I Should be able to arrange the products in Descending order

  @sanity @regression
  Scenario: User should be able to add a product in to shopping cart
    Given I am on home page
    When I click on Computer Menu
    And I click on Desktop
    And I Select Sort By position "Name: A to Z"
    And I Click on Add To Cart
    And I Verify the Text "Build your own computer"
    And I Select processor "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    And I Select ram "8GB [+$60.00]" using Select class
    And I Select HDD radio "400 GB [+$100.00]"
    And I Select OS radio "Vista Premium [+$60.00]"
    And I Check Two Check boxes Microsoft Office and Total Commander
    And I Verify the price "$1,475.00"
    And I Click on ADD TO CARD Button
    And I Verify the Message "The product has been added to your shopping cart" on Top green Bar
    And I close the bar clicking on the cross button
    And I MouseHover on Shopping cart and Click on GO TO CART button.
    And Verify the message "Shopping cart"
    And I Change the Qty to "2"
    And I Click on Update shopping cart
    And I Verify the Total"$2,950.00"
    And I click on checkbox I agree with the terms of service
    And I Click on CHECKOUT
    And I Verify the Text “Welcome, Please Sign In!”
    And I Click on CHECKOUT AS GUEST Tab
    And I enter FirstName "Prime"
    And I enter Lastname "Testing"
    And I enter email "primetesting@gmail.com"
    And I select country "India"
    And I enter city "Chikhodra"
    And I enter Address "Chikhodra Chokdi"
    And I Enter zip code "388320"
    And I enter phone number "7733552266"
    And I Click on CONTINUE
    And I Click on Radio Button Next Day Air
    And I click on shipping continue
    And I Select Radio Button Credit Card
    And I click on payment continue
    And I click on Select “Master card” From Select credit card dropdown
    And I enter card holder name "Prime Testing"
    And I Enter card number "5573615091331588"
    And I Select Expiry date "05" Year "2025"
    And I enter security code "123"
    And I click on payment info continue
    And I Verify Payment Method is “Credit Card”
    And I verify shipping method "Next Day Air"
    And I Verify total "$2,950.00"
    And I click on confirm
    And I verify message "Thank you"
    And I verify success message "Your order has been successfully processed!"
    And I click on continue
    And I veify The home page wel come message "Welcome to our store"


