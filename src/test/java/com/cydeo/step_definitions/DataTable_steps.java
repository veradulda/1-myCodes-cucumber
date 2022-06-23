package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTable_steps {


    @Then("user want to live there")
    public void userWantToLiveThere(List<String> data) {
        System.out.println(data);
        for (String datum : data) {
            System.out.println(datum);
        }
    }

}
