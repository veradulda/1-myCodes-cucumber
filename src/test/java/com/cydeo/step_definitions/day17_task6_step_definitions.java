package com.cydeo.step_definitions;

import com.cydeo.pages.day17_task6_page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class day17_task6_step_definitions {

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> exceptedResult) {

        System.out.println("exceptedResult = " + exceptedResult);

        day17_task6_page day17_task6_page = new day17_task6_page();

        Select select = new Select(day17_task6_page.drpDwn);

        List<WebElement> allOptions = select.getOptions();

        //System.out.println("allOptions = " + allOptions);

        List<String> allOptionsAsString = new ArrayList<>();

        for (WebElement allOption : allOptions) {
            allOptionsAsString.add(allOption.getText());
        }

       // System.out.println("allOptionsAsString = " + allOptionsAsString);


        Assert.assertEquals(allOptionsAsString,exceptedResult);

    }

}
