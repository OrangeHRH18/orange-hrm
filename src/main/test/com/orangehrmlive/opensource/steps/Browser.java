package com.orangehrmlive.opensource.steps;

import com.orangehrmlive.opensource.utils.World;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.fluentlenium.adapter.FluentAdapter;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.ExecutableFinder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Browser extends FluentAdapter {

    private static final String PATH_TO_CHROME_DRIVER = "C:\\Users\\bobby.e.paris\\IdeaProjects\\orange-hrm\\target\\classes\\drivers\\chromedriver.exe";
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";


    @Before("@UI")
    public void setup() {
        setSystemProperty();
    }

    private static boolean executableNotPresentInPath() {
        return new ExecutableFinder().find("chromedriver") == null;
    }

    private static boolean systemPropertyNotSet() {
        return System.getProperty(CHROME_DRIVER_PROPERTY) == null;
    }

    private static void setSystemProperty() {
        System.setProperty(CHROME_DRIVER_PROPERTY, PATH_TO_CHROME_DRIVER);
        System.setProperty("fluentlenium.webDriver", "chrome");
        System.setProperty("fluentlenium.capabilities", "chrome");
    }


}
