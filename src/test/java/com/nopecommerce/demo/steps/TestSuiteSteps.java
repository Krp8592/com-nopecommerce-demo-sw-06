package com.nopecommerce.demo.steps;

import com.nopecommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TestSuiteSteps {
    @When("^I click on Computer Menu$")
    public void iClickOnComputerMenu() {
        new HomePage().clickOnComputerTab();
    }

    @And("^I click on Desktop$")
    public void iClickOnDesktop() {
        new ComputersPage().clickOnDesktop();
    }

    @Then("^I Should be able to arrange the products in Descending order$")
    public void iShouldBeAbleToArrangeTheProductsInDescendingOrder() throws InterruptedException {
        String actualOrder = new ComputersPage().sortDesktopByPositionZtoA().toString();
        String ExceptedOrder = new ComputersPage().getAllProductNamesAfterShorting().toString();
        Assert.assertTrue(ExceptedOrder.contains(actualOrder));
    }

    @And("^I Select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String arg0) throws InterruptedException {
        new ComputersPage().selectValueFromShortingDropDown("Name: A to Z");
    }

    @And("^I Click on Add To Cart$")
    public void iClickOnAddToCart() throws InterruptedException {
        new ComputersPage().clickAddtoCartByProductName("Build your own computer");
    }

    @And("^I Verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(expectedMessage, new BuildYourOwnComputerPage().getBuildYourOwnComputerText(), "Unable to click on add to card");
    }

    @And("^I Select processor \"([^\"]*)\" using Select class$")
    public void iSelectProcessorUsingSelectClass(String processor) throws InterruptedException {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^I Select ram \"([^\"]*)\" using Select class$")
    public void iSelectRamUsingSelectClass(String ram) throws InterruptedException {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^I Select HDD radio \"([^\"]*)\"$")
    public void iSelectHDDRadio(String hdd) throws InterruptedException {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^I Select OS radio \"([^\"]*)\"$")
    public void iSelectOSRadio(String os) throws InterruptedException {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("^I Check Two Check boxes Microsoft Office and Total Commander$")
    public void iCheckTwoCheckBoxesMicrosoftOfficeAndTotalCommander() throws InterruptedException {
        new BuildYourOwnComputerPage().selectMicrosoftOfficeSoftwareOption();
        new BuildYourOwnComputerPage().selectTotalCommanderSoftwareOption();
    }

    @And("^I Verify the price \"([^\"]*)\"$")
    public void iVerifyThePrice(String expectedPrice) throws InterruptedException {
        Assert.assertEquals(expectedPrice, new BuildYourOwnComputerPage().getTotalPriceText(), "Wrong Configuration");
    }

    @And("^I Click on ADD TO CARD Button$")
    public void iClickOnADDTOCARDButton() throws InterruptedException {
        new BuildYourOwnComputerPage().clickOnAddtoCart();
    }

    @And("^I Verify the Message \"([^\"]*)\" on Top green Bar$")
    public void iVerifyTheMessageOnTopGreenBar(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(expectedMessage, new BuildYourOwnComputerPage().getSuccessfullAddedToCartText(),
                "Not added in cart");
    }

    @And("^I MouseHover on Shopping cart and Click on GO TO CART button\\.$")
    public void iMouseHoverOnShoppingCartAndClickOnGOTOCARTButton() throws InterruptedException {
        new BuildYourOwnComputerPage().mouseHoverToShoppingCartAndClickOnCart();
    }

    @And("^I Change the Qty to \"([^\"]*)\"$")
    public void iChangeTheQtyTo(String qty) throws InterruptedException {
        new ShoppingCartPage().changeValueOfQuantity(qty);
    }

    @And("^I Click on Update shopping cart$")
    public void iClickOnUpdateShoppingCart() throws InterruptedException {
        new ShoppingCartPage().updateShoppingCart();
    }

    @And("^I Verify the Total\"([^\"]*)\"$")
    public void iVerifyTheTotal(String expectedTotal) throws InterruptedException {
        Assert.assertEquals(expectedTotal, new ShoppingCartPage().getPriceText(), "Price not Updated");
    }

    @And("^I Click on CHECKOUT$")
    public void iClickOnCHECKOUT() throws InterruptedException {
        new ShoppingCartPage().clickOnCheckOut();
    }


    @And("^I Verify the Text “Welcome, Please Sign In!”$")
    public void iVerifyTheTextWelcomePleaseSignIn() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @And("^I Click on CHECKOUT AS GUEST Tab$")
    public void iClickOnCHECKOUTASGUESTTab() {
        new LoginPage().clickOnGuestCheckout();
    }

    @And("^I enter FirstName \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) throws InterruptedException {
        new CheckOutPage().enterFirstname(firstName);
    }

    @And("^I enter Lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastName) throws InterruptedException {
        new CheckOutPage().enterLastname(lastName);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException {
        new CheckOutPage().enterEmail(email);
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country) throws InterruptedException {
        new CheckOutPage().selectCountry(country);
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city) throws InterruptedException {
        new CheckOutPage().enterCity(city);
    }

    @And("^I enter Address \"([^\"]*)\"$")
    public void iEnterAddress(String address) throws InterruptedException {
        new CheckOutPage().enterAddress1(address);
    }

    @And("^I Enter zip code \"([^\"]*)\"$")
    public void iEnterZipCode(String zipCode) throws InterruptedException {
        new CheckOutPage().enterZipCode(zipCode);
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phoneNum) throws InterruptedException {
        new CheckOutPage().enterPhoneNumber(phoneNum);
    }

    @And("^I Click on CONTINUE$")
    public void iClickOnCONTINUE() throws InterruptedException {
        new CheckOutPage().clickOnContinue();
    }


    @And("^I Click on Radio Button Next Day Air$")
    public void iClickOnRadioButtonNextDayAir() throws InterruptedException {
        new CheckOutPage().selectNextDayAir();
    }

    @And("^I click on shipping continue$")
    public void iClickOnShippingContinue() throws InterruptedException {
        new CheckOutPage().clickOnShippingContinue();
    }

    @And("^I Select Radio Button Credit Card$")
    public void iSelectRadioButtonCreditCard() throws InterruptedException {
        new CheckOutPage().clickOnCreditCard();
    }

    @And("^I click on payment continue$")
    public void iClickOnPaymentContinue() throws InterruptedException {
        new CheckOutPage().clickOnPaymentContinue();
    }

    @And("^I click on Select “Master card” From Select credit card dropdown$")
    public void iClickOnSelectMasterCardFromSelectCreditCardDropdown() throws InterruptedException {
        new CheckOutPage().selectCreditCardType("Master card");
    }

    @And("^I enter card holder name \"([^\"]*)\"$")
    public void iEnterCardHolderName(String holderName) throws InterruptedException {
        new CheckOutPage().enterCardHolderName(holderName);
    }

    @And("^I Enter card number \"([^\"]*)\"$")
    public void iEnterCardNumber(String cardNumber) throws InterruptedException {
        new CheckOutPage().enterCardNumber(cardNumber);
    }

    @And("^I Select Expiry date \"([^\"]*)\" Year \"([^\"]*)\"$")
    public void iSelectExpiryDateYear(String month, String year) throws InterruptedException {
        new CheckOutPage().selectExpirationDate(month, year);
    }

    @And("^I enter security code \"([^\"]*)\"$")
    public void iEnterSecurityCode(String code) throws InterruptedException {
        new CheckOutPage().enterCardCode(code);
    }

    @And("^I click on payment info continue$")
    public void iClickOnPaymentInfoContinue() throws InterruptedException {
        new CheckOutPage().clickOnPaymentInfoContinue();
    }


    @And("^I Verify Payment Method is “Credit Card”$")
    public void iVerifyPaymentMethodIsCreditCard() throws InterruptedException {
        String expectedMessage = "Credit Card";
        String actualMessage = new CheckOutPage().getPaymentTypeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @And("^I verify shipping method \"([^\"]*)\"$")
    public void iVerifyShippingMethod(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(expectedMessage, new CheckOutPage().getShippingMethodText(), "Unable to checkout");
    }

    @And("^I Verify total \"([^\"]*)\"$")
    public void iVerifyTotal(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(expectedMessage, new CheckOutPage().getTotalPriceText(), "Unable to checkout");
    }

    @And("^I click on confirm$")
    public void iClickOnConfirm() throws InterruptedException {
        new CheckOutPage().clickOnConfirm();
    }

    @And("^I verify message \"([^\"]*)\"$")
    public void iVerifyMessage(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(expectedMessage, new HomePage().getThankYouText(), "Unable to checkout");
    }

    @And("^I verify success message \"([^\"]*)\"$")
    public void iVerifySuccessMessage(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(expectedMessage, new HomePage().getSuccessfulText(), "Unable to checkout");
    }

    @And("^I veify The home page wel come message \"([^\"]*)\"$")
    public void iVeifyTheHomePageWelComeMessage(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(expectedMessage, new HomePage().getWelcomeStoreText(), "Unable to checkout");
    }

    @And("^I click on continue$")
    public void iClickOnContinue() throws InterruptedException {
        new HomePage().clickOnContinue();
    }
}
