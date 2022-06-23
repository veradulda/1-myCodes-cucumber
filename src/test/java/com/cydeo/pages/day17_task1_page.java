package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class day17_task1_page {
    public day17_task1_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement btnButton;


    
    
}
