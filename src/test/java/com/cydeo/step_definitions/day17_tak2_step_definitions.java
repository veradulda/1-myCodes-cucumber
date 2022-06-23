package com.cydeo.step_definitions;

import com.cydeo.pages.day17_task2_page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class day17_tak2_step_definitions {

    @Given("user is on the page of web table page")
    public void user_is_on_the_page_of_web_table_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        day17_task1_step_definitions aa = new day17_task1_step_definitions();
        aa.user_enter_us_na("Test");
        aa.user_enter_ps("Tester");
        aa.user_click_login_bttn();
    }

    day17_task2_page task2_page = new day17_task2_page();
    @Given("user is on the ORDER page")
    public void user_is_on_the_order_page() {
        task2_page.orderLink.click();
    }
    @When("user select product {string}")
    public void user_select_product(String string) {
        Select select = new Select(task2_page.productSelect);

        select.selectByValue(string);
    }

    @When("user select quantity {string}")
    public void user_select_quantity(String string) {
        task2_page.quantityInput.clear();
        task2_page.quantityInput.sendKeys(string);
    }
    @When("user select customerName {string}")
    public void user_select_customer_name(String string) {
        task2_page.nameInput.sendKeys(string);
    }
    @When("user select street {string}")
    public void user_select_street(String string) {
        task2_page.streetInput.sendKeys(string);
    }
    @When("user select city {string}")
    public void user_select_city(String string) {
        task2_page.cityInput.sendKeys(string);
    }
    @When("user select state {string}")
    public void user_select_state(String string) {
        task2_page.stateInput.sendKeys(string);
    }
    @When("user select zip {string}")
    public void user_select_zip(String string) {
        task2_page.zipInput.sendKeys(string);
    }
    @When("user select cardType {string}")
    public void user_select_card_type(String string) {
        if(string.equals("Visa")){
            task2_page.Visa.click();
        }else if(string.equals("MasterCard")){
            task2_page.MasterCard.click();
        }else if(string.equals("American Express")){
            task2_page.AmericanExpress.click();
        }

    }
    @When("user select cardNo {string}")
    public void user_select_card_no(String string) {
        task2_page.cardNoInput.sendKeys(string);
    }
    @When("user select cardExpireDate {string}")
    public void user_select_card_expire_date(String string) {
        task2_page.cardExpInput.sendKeys(string);
    }
    @When("user click process order button")
    public void user_click_process_order_button() {
        task2_page.orderButton.click();
    }
    @Then("user can see {string} in the all orders")
    public void user_can_see_in_the_all_orders(String string) {
        List<WebElement> listOfName = task2_page.listOfName;

        boolean result = false;

        for (WebElement webElement : listOfName) {
            if(webElement.getText().equals(string)){
                result = true;
                break;
            }
        }

        Assert.assertTrue(result);

    }


}
