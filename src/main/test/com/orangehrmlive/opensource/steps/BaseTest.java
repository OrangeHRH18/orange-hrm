package com.orangehrmlive.opensource.steps;

import cucumber.api.java.Before;
import org.fluentlenium.adapter.junit.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest extends FluentTest {

    @Before("UISetup")
    public void before() {

    }

    @Override
    public WebDriver newWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chromeDriver/chromedriver.exe"); // Set for ChromeDriver
        WebDriver driver = new ChromeDriver();
        return driver;
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
}
