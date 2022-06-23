package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia_pages {
    public Wikipedia_pages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='searchInput']")
    public WebElement searchInput;

    @FindBy(xpath = "//*[@id='searchButton']")
    public WebElement goInput;

    @FindBy(id = "firstHeading")
    public WebElement firstheadingH;

    @FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[1]/th/div")
    public WebElement titleOfImage;

}
