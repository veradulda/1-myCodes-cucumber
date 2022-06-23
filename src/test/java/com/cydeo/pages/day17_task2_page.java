package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class day17_task2_page {
    public day17_task2_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[.='Order']" )
    public WebElement orderLink;

    @FindBy (xpath = "//select[@name='product']")
    public WebElement productSelect;

    @FindBy (xpath = "//input[@name='quantity']")
    public WebElement quantityInput;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy (xpath = "//input[@name='street']")
    public WebElement streetInput;

    @FindBy (xpath = "//input[@name='city']")
    public WebElement cityInput;

    @FindBy (xpath = "//input[@name='state']")
    public WebElement stateInput;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement zipInput;

    @FindBy (xpath = "//input[@value='Visa']")
    public WebElement Visa;

    @FindBy (xpath = "//input[@value='MasterCard']")
    public WebElement MasterCard;

    @FindBy (xpath = "//input[@value='American Express']")
    public WebElement AmericanExpress;

    @FindBy (xpath = "//input[@name='cardNo']")
    public WebElement cardNoInput;

    @FindBy (xpath = "//input[@name='cardExp']")
    public WebElement cardExpInput;

    @FindBy (xpath = "//button[.='Process Order']")
    public WebElement orderButton;

    @FindBy(xpath = "//table[@class='table is-fullwidth']//tbody//tr//td[1]")
    public List<WebElement> listOfName;

}
