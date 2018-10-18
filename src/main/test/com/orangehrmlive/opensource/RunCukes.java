package com.orangehrmlive.opensource;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", tags ={"@OR_01"}, format = {"pretty","html:target/cucumber"})
public class RunCukes {
}
