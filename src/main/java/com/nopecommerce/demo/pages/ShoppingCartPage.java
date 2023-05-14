package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {

    private  static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement priceText;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@id,'itemquantity')]")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsAndCondition;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shopingCart;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCart;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@id,'itemquantity')]")
    WebElement quantityValue;

    /**
     * get Shopping CartText
     *
     * @return
     * @throws InterruptedException
     */
    public String getShoppingCartText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Getting text from : " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    /**
     * get PriceText
     *
     * @return
     * @throws InterruptedException
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Getting text from : " + priceText.toString());
        return getTextFromElement(priceText);
    }

    /**
     * change Value Of Quantity
     *
     * @param value
     * @throws InterruptedException
     */
    public void changeValueOfQuantity(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Change quantity : " + quantity.toString());
        sendTextToElement(quantity, value);
    }

    /**
     * update Shopping Cart
     *
     * @throws InterruptedException
     */
    public void updateShoppingCart() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Click on update shopping cart : " + updateShoppingCart.toString());
        clickOnElement(updateShoppingCart);
    }

    /**
     * select Terms And Condition
     *
     * @throws InterruptedException
     */
    public void selectTermsAndCondition() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Select terms and conditions : " + termsAndCondition.toString());
        clickOnElement(termsAndCondition);
    }

    /**
     * click On CheckOut
     *
     * @throws InterruptedException
     */
    public void clickOnCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click on check out : " + checkOut.toString());
        clickOnElement(checkOut);
    }

    /**
     * mouse Hover To Shopping Card
     *
     * @throws InterruptedException
     */
    public void mouseHoverToShoppingCard() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Mouse hover to shopping cart : " + shopingCart.toString());
        mouseHoverToElement(shopingCart);
    }

    /**
     * mouse Hover To GoTo Card And Click
     *
     * @throws InterruptedException
     */
    public void mouseHoverToGoToCardAndClick() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Mouse hover to go to cart and click  : " + goToCart.toString());
        mouseHoverToElementAndClick(goToCart);
    }

    /**
     * get Number Of Quantity Value
     *
     * @return
     * @throws InterruptedException
     */
    public String getNumberOfQuantityValue() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get number of quantity : " + quantityValue.toString());
        return getAttributeValueFromElement(quantityValue);
    }

}
