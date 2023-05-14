package com.nopecommerce.demo.steps;

import com.nopecommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ElectronicsSteps {
    @When("^I mouse hover on Electronics Tab$")
    public void iMouseHoverOnElectronicsTab() throws InterruptedException {
        new HomePage().mouseHoverToElectronicTab();
    }

    @And("^I Mouse Hover on Cell phones and click$")
    public void iMouseHoverOnCellPhonesAndClick() throws InterruptedException {
        new HomePage().mouseHoverToCellPhonesAndClick();
    }

    @Then("^I should navigate to Cell Phones Page successfully$")
    public void iShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        String expectedMessage = "Cell phones";
        String actualMessage = new CellPhonePage().getCellPhoneText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("^Verify the text Cell phones$")
    public void verifyTheTextCellPhones() throws InterruptedException {
        String expectedMessage = "Cell phones";
        String actualMessage = new CellPhonePage().getCellPhoneText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("^I Click on List View Tab$")
    public void iClickOnListViewTab() {
        new CellPhonePage().clickOnListViewIcon();
    }

    @And("^I click on product name \"([^\"]*)\" link$")
    public void iClickOnProductNameLink(String product) throws InterruptedException {
        new CellPhonePage().selectPhoneFromList(product);
    }

    @And("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expectedText) throws InterruptedException {
        Assert.assertEquals(new CellPhonePage().getProductNameText(), expectedText, "Product text is not displayed.");
    }

    @And("^Verify the price \"([^\"]*)\"$")
    public void verifyThePrice(String expectedPrice) throws InterruptedException {
        String actualPrice = new CellPhonePage().getPriceText();
        Assert.assertEquals(expectedPrice, actualPrice, "Price is not displayed.");
    }

    @And("^I Change quantity to \"([^\"]*)\"$")
    public void iChangeQuantityTo(String quantity) throws InterruptedException {
        new CellPhonePage().updateQuantity(quantity);
    }

    @And("^I click on ADD TO CART tab$")
    public void iClickOnADDTOCARTTab() throws InterruptedException {
        new CellPhonePage().clickOnAddToCart();
    }

    @And("^Verify the Message \"([^\"]*)\" on Top green Bar$")
    public void verifyTheMessageOnTopGreenBar(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(new CellPhonePage().getSuccessfullAddedToCartText(), expectedMessage, "Product is not added to the shopping cart");
    }

    @And("^I close the bar clicking on the cross button$")
    public void iCloseTheBarClickingOnTheCrossButton() throws InterruptedException {
        new CellPhonePage().closeNotificationBar();
    }

    @And("^I Then MouseHover on Shopping cart and Click on GO TO CART button\\.$")
    public void iThenMouseHoverOnShoppingCartAndClickOnGOTOCARTButton() throws InterruptedException {
        new ShoppingCartPage().mouseHoverToShoppingCard();
        new ShoppingCartPage().mouseHoverToGoToCardAndClick();
    }

    @And("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(new ShoppingCartPage().getShoppingCartText(), expectedMessage, "User is not navigated to shopping cart page.");
    }

    @And("^Verify the quantity is \"([^\"]*)\"$")
    public void verifyTheQuantityIs(String expectedQuantity) throws InterruptedException {
        Assert.assertEquals(new ShoppingCartPage().getNumberOfQuantityValue(), expectedQuantity, "Expected quantity is not displayed");
    }

    @And("^Verify the Total \"([^\"]*)\"$")
    public void verifyTheTotal(String expectedTotal) throws InterruptedException {
        Assert.assertEquals(new ShoppingCartPage().getPriceText(), expectedTotal, "Expected total is not displayed");
    }

    @And("^I click on checkbox I agree with the terms of service$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() throws InterruptedException {
        new ShoppingCartPage().selectTermsAndCondition();
    }

    @And("^I click on CHECKOUT$")
    public void iClickOnCHECKOUT() throws InterruptedException {
        new ShoppingCartPage().clickOnCheckOut();
    }

    @And("^Verify the Text “Welcome, Please Sign In!”$")
    public void verifyTheTextWelcomePleaseSignIn() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Expected Wel Come Message is not displayed.");
    }

    @And("^I click on REGISTER tab$")
    public void iClickOnREGISTERTab() {
        new HomePage().clickOnRegisterTab();
    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) throws InterruptedException {
        new RegisterPage().enterFirstname(firstName);
    }

    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) throws InterruptedException {
        new RegisterPage().enterLastname(lastName);
    }

    @And("^I enter Email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException {
        new RegisterPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws InterruptedException {
        new RegisterPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword) throws InterruptedException {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() throws InterruptedException {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^Verify the message “Your registration completed”$")
    public void verifyTheMessageYourRegistrationCompleted() throws InterruptedException {
        String expectedMessage = "Your registration completed";
        String actualMessage = new RegisterPage().getRegistrationCompletedText();
        Assert.assertEquals(expectedMessage, actualMessage, "Registration is not successfully completed");
    }


}
