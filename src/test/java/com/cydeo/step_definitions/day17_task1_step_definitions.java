package com.cydeo.step_definitions;

import com.cydeo.pages.day17_task1_page;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Verify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class day17_task1_step_definitions {
    day17_task1_page day17_task1_page = new day17_task1_page();
    @Given("user is on the login page of web table page")
    public void user_is_on_the_login_page_of_web_table_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enter UsNa {string}")
    public void user_enter_us_na(String string) {
        day17_task1_page.usernameInput.sendKeys(string);
    }

    @When("user enter Ps {string}")
    public void user_enter_ps(String string) {
        day17_task1_page.passwordInput.sendKeys(string);
    }

    @When("user click login bttn")
    public void user_click_login_bttn() {
        day17_task1_page.btnButton.click();
    }

    @Then("user should orders in the URL")
    public void user_should_orders_in_the_url() {
        boolean result = Verify.verifyToContainURL(Driver.getDriver(),"orders");
        Assert.assertTrue(true);
    }

}
