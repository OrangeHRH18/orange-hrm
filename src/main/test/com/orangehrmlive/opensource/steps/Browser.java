package com.orangehrmlive.opensource.steps;

import com.orangehrmlive.opensource.utils.World;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.fluentlenium.adapter.junit.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Browser extends FluentTest {

    @Given("^browser is open")
    public void opeBrower() {
        before();
    }

    @Given("^browser is close")
    public void closeBrowser() {
        after();
    }

    public void before() {

    }

    @Override
    public WebDriver newWebDriver() {
        return World.getInstance().getDriver();
    }

    public String getBrowser() {
        return "";
    }

    public String getWedDriver() {
        return "";
    }

    public String getCapa() {
        return "";
    }


    public void after() {
        getDriver().close();
    }
}
