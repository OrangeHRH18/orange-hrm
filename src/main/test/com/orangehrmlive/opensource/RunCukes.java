package com.orangehrmlive.opensource;

import com.orangehrmlive.opensource.steps.Browser;
import com.orangehrmlive.opensource.utils.World;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", glue = "com.orangehrmlive.opensource.steps", tags = {"@OR_01"}, format = {"pretty", "html:target/cucumber"})
public class RunCukes {

}
