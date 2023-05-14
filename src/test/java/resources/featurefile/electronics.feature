Feature:Electronics Test
  As a user I want to buy “Nokia Lumia 1020” with registering as a ner user.

  @smoke @regression
  Scenario: User Should navigate to "Cell Phones" page successfully
    Given I am on home page
    When I mouse hover on Electronics Tab
    And I Mouse Hover on Cell phones and click
    Then I should navigate to Cell Phones Page successfully

  @sanity @regression
  Scenario: User I should be able to add a product in to cart and place the order successfully
    Given I am on home page
    When I mouse hover on Electronics Tab
    And I Mouse Hover on Cell phones and click
    And Verify the text Cell phones
    And I Click on List View Tab
    And I click on product name "Nokia Lumia 1020" link
    And Verify the text "Nokia Lumia 1020"
    And Verify the price "$349.00"
    And I Change quantity to "2"
    And I click on ADD TO CART tab
    And Verify the Message "The product has been added to your shopping cart" on Top green Bar
    And I close the bar clicking on the cross button
    And I Then MouseHover on Shopping cart and Click on GO TO CART button.
    And Verify the message "Shopping cart"
    And Verify the quantity is "2"
    And Verify the Total "$698.00"
    And I click on checkbox I agree with the terms of service
    And I click on CHECKOUT
    And Verify the Text “Welcome, Please Sign In!”
    And I click on REGISTER tab
    And I enter First Name "Prime"
    And I enter Last name "Testing"
    And I enter Email "primetesting123@gmail.com"
    And I enter password "Admin@123"
    And I enter confirm password "Admin@123"
    And I click on register button
    Then Verify the message “Your registration completed”


