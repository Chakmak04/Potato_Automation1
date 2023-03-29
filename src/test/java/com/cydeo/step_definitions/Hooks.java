package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // import fromm io.cucumber java not from junit
    // @Before (order =1)
    public void setUpScenario(){

        System.out.println("====Setting up browser using cucumber @Before");
    }

    //  @Before (value ="@login",order=2)
    public void setUpScenarioForLogin(){

        System.out.println("====This will only apply to scenario with @Login tag");
    }

    //  @Before (value ="@db",order =0)
    public void setUpForDatabaseScenario(){

        System.out.println("====This will only apply to scenario with @db tag");
    }

    @After
    public void teardownScenario(Scenario scenario){

        // this scenario class keep tracks of currenlty executed scenario , and this object
        // this allows us to attack our screenshot to our report
        // scenario.attach();


        // add the cond : i want to take screenshot if my scanerio fails
        // if scenario failes this method will rerun TRUE boolean value

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }


        // the screenshot is in the report


        // we are down-casting our driver , as take screenshot is an interface
        // this is the way if u want to take a screenshot , we have to attach it into our report
//
        //BrowserUtils.sleep(5);
        Driver.closeDriver();// this will close my driver after every scenario is done

        //  System.out.println("===Closing browser using cucumber @After");
        //System.out.println("===Scenario ended/Take screenshot if failed!");
    }

    // @BeforeStep
    public void setUpStep(){

        System.out.println("--------applying setup using @Before Setp");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("------------>applying teardown using @AfterStep");
    }


}
