package com.cydeo.step_definitions;

import com.cydeo.pages.Wikipedia_pages;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Verify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_Steps {

   Wikipedia_pages wikipedia_pages = new Wikipedia_pages();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://en.wikipedia.org/");
    }
    @When("user type {string} in the searchbox")
    public void user_type_in_the_searchbox(String searchingKeyword) {
        wikipedia_pages.searchInput.sendKeys(searchingKeyword);
    }
    @When("user click search button")
    public void user_click_search_button() {
        wikipedia_pages.goInput.click();
    }
    @Then("user see {string} at the title")
    public void user_see_at_the_title(String expectedResult) {
        Verify.verifyToTitleOfPage(Driver.getDriver(),expectedResult);
    }

    @Then("user see {string} at the main header")
    public void user_see_at_the_main_header(String string) {

          Assert.assertTrue( wikipedia_pages.firstheadingH.getText().equals(string));
    }

    @Then("user see {string} at the image header")
    public void user_see_at_the_image_header(String string) {
       Assert.assertTrue(wikipedia_pages.titleOfImage.getText().equals(string));
    }

}
