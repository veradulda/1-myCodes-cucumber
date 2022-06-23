package com.cydeo.step_definitions;

import com.cydeo.pages.googleCom;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Verify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleTitleVerification_steps {

    googleCom googleCom = new googleCom();

    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");
    }
    @When("User search apple on the google")
    public void user_search_apple_on_the_google() {
        googleCom.searchInput.sendKeys("apple", Keys.ENTER);
    }
    @Then("User see apple in the title")
    public void user_see_apple_in_the_title() {
       Assert.assertTrue( Verify.verifyToTitleOfPage(Driver.getDriver(),"apple - Google'da Ara"));
    }


    @When("User search {string} on the google")
    public void user_search_on_the_google(String searchingKeyword) {
        googleCom.searchInput.sendKeys(searchingKeyword, Keys.ENTER);
    }
    @Then("User see {string} in the title")
    public void user_see_in_the_title(String searchingKeyword) {
        Assert.assertTrue( Verify.verifyToTitleOfPage(Driver.getDriver(),searchingKeyword+" - Google'da Ara"));
    }

}
