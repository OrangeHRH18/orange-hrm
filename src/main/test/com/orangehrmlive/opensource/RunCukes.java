package com.orangehrmlive.opensource;

import com.orangehrmlive.opensource.steps.Browser;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", tags ={"@OR_01"}, format = {"pretty","html:target/cucumber"})
public class RunCukes {
    @BeforeClass
    public static void before(){

    }
}
