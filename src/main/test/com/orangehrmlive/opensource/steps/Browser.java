package com.orangehrmlive.opensource.steps;

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
    private String sp = File.separator;
    private String propertyPath = System.getProperty("user.dir") + sp + "src" + sp + "main" + sp + "resources" + sp + "properties" + sp;

    @Given("^browser is open")
    public void opeBrower(){
        before();
    }
    @Given("^browser is close")
    public void closeBrowser(){
        after();
    }

    public void before() {
        Properties prop = new Properties();
        System.out.println(propertyPath);
        InputStream input;
        try {
            input = new FileInputStream(propertyPath + "ui.properties");
            prop.load(input);
            newWebDriver().get(prop.getProperty("orange.url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public WebDriver newWebDriver() {

        String driverPath = System.getProperty("user.dir") + sp + "src" + sp + "main" + sp + "resources" + sp + "drivers" + sp;
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
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


    public void after(){
        getDriver().close();
    }
}
