package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class Verify {

    public static boolean verifyToTitleOfPage(WebDriver drv,String expectdResult){
        boolean result = false;

        if(expectdResult.equals(drv.getTitle())){
            result = true;
        }

        return  result;
    }


    public static  boolean verifyToContainURL(WebDriver drv,String expectedResult){
        boolean result = false;

        if(drv.getCurrentUrl().contains(expectedResult)){
            result = true;
        }

        return result;
    }


}
