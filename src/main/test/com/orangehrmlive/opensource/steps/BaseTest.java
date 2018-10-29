package com.orangehrmlive.opensource.steps;

import cucumber.api.java.Before;
import org.fluentlenium.adapter.junit.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseTest extends FluentTest {
    private String sp = File.separator;
    private String propertyPath = System.getProperty("user.dir") + sp + "src" + sp + "main" + sp + "resources" + sp + "properties" + sp;

    @Before("UISetup")
    public void before() {
        Properties prop = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream(propertyPath + "ui.properties");
        try {
            prop.load(stream);
            getDriver().get(prop.getProperty("orange.url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public WebDriver newWebDriver() {

        String driverPath = System.getProperty("user.dir") + sp + "src" + sp + "main" + sp + "resources" + sp + "drivers" + sp;

        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe"); // Set for ChromeDriver
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

    @Before("UISetup")
    public void after(){
        getDriver().close();
    }
}
