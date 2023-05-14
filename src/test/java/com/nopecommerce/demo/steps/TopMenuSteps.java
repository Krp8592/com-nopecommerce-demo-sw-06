package com.nopecommerce.demo.steps;

import com.nopecommerce.demo.pages.ElectronicsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Then("^I should navigate to electronics page successfully$")
    public void iShouldNavigateToElectronicsPageSuccessfully() {
        String expectedMessage = "Electronics";
        String actualMessage = new ElectronicsPage().getElectronicsHeaderText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on");
    }

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on \"([^\"]*)\" page$")
    public void iClickOnPage(String menu) throws Throwable {
        new ElectronicsPage().selectMenu(menu);
    }
}
