

package io.loopcamp.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.loopcamp.jdbctests.utility.ConfigurationReader;

import io.loopcamp.jdbctests.utility.DB_util;
import io.loopcamp.jdbctests.utility.Driver;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

//    @Before
//    public void setUp() {
//        System.out.println("This is coming from BEFORE");
//        Driver.getDriver();
//
//    }
//
//
//    // closing the driver
//    @After
//    public void tearDown(Scenario scenario){
//        System.out.println("This i coming from After");
//
//        if (scenario.isFailed()){
//            final byte []screenshot =
//                    ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot,"image/png", scenario.getName());
//        }
//        Driver.closeDriver();
//
//    }

    @Before
    public void setUpDB(){
        String ip = ConfigurationReader.getProperty("docuportURL");
        String un = ConfigurationReader.getProperty("dbUserName");
        String pw = ConfigurationReader.getProperty("dbPassword");

        DB_util.createConnection(ip, un, pw);
    }


   @After
    public void destroyDB () {
        DB_util.destroy();
    }




}