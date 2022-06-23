package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void teardownScenario(Scenario scenario){


//        if (scenario.isFailed()) {
//            byte[] ss = ((TakesScreenshot)(Driver.getDriver())).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(ss,"image/png",scenario.getName());
//        }

        byte[] ss = ((TakesScreenshot)(Driver.getDriver())).getScreenshotAs(OutputType.BYTES);
        scenario.attach(ss,"image/png",scenario.getName());

        Driver.closeDriver();

    }

}
