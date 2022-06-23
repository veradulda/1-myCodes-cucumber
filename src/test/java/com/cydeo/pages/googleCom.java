package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleCom {
    public googleCom() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchInput;


}
