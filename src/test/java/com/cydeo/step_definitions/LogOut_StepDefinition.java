package com.cydeo.step_definitions;

import com.cydeo.pages.LogOutFunctionality;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LogOut_StepDefinition {

    LogOutFunctionality logOutFunctionality = new LogOutFunctionality();

    Actions actions = new Actions((WebDriver) Driver.getDriver());
    @Then("user click to his own username")
    public void user_click_to_his_own_username() {
        logOutFunctionality.userNameButton.click();

    }
    @Then("user click to Log Out button")
    public void user_click_to_log_out_button() {
        logOutFunctionality.logOutButton.click();

    }

    @And("User clicks the step backButton after successfully logged out.")
    public void userClicksTheStepBackButtonAfterSuccessfullyLoggedOut() {



    }

    @And("user can not go to homepage again.")
    public void userCanNotGoToHomepageAgain() {
        String expectedTitle = "Login | Best solution for startups";
        String actualTitle = Driver.getDriver().toString();
        Assert.assertTrue(actualTitle.contains("Login |"));

    }

    @When("User in on log in page")
    public void user_in_on_log_in_page() {

    }
    @Then("User enters {string} address")
    public void user_enters_address(String string) {

    }
    @Then("user enter {string}")
    public void user_enter(String string) {

    }
    @Then("user clicks on the log in button")
    public void user_clicks_on_the_log_in_button() {

    }
    @Then("user should be on the homepage")
    public void user_should_be_on_the_homepage() {

    }

    }
