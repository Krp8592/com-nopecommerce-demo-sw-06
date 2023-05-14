package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
            WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
            WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
            WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
            WebElement confirmpassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
            WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompleted;

    /**
     * enter Firstname
     * @param value
     * @throws InterruptedException
     */
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Enter first name  : " + firstName.toString());
        sendTextToElement(firstName,value);
    }

    /**
     * enter Lastname
     * @param value
     * @throws InterruptedException
     */
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName,value);
        log.info("Enter last name  : " + lastName.toString());
    }

    /**
     * enter Email
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Enter email  : " + email.toString());
        sendTextToElement(email,value);
    }

    /**
     * enter Password
     * @param value
     * @throws InterruptedException
     */
    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Enter password  : " + password.toString());
        sendTextToElement(password,value);
    }

    /**
     * enter Confirm Password
     * @param value
     * @throws InterruptedException
     */
    public void enterConfirmPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Enter confirm password  : " + confirmpassword.toString());
        sendTextToElement(confirmpassword,value);
    }

    /**
     * click On Register Button
     * @throws InterruptedException
     */
    public void clickOnRegisterButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Click on register button  : " + registerButton.toString());
        clickOnElement(registerButton);
    }

    /**
     * get Registration Completed Text
     * @return
     * @throws InterruptedException
     */
    public String getRegistrationCompletedText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get registration complete message : " + registrationCompleted.toString());
        return getTextFromElement(registrationCompleted);
    }
}
