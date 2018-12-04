package com.orangehrmlive.opensource.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public final class World {
    private static World world = new World();
    private String sp = File.separator;
   // private String propertyPath = System.getProperty("user.dir") + sp + "src" + sp + "main" + sp + "resources" + sp + "properties" + sp;
    private WebDriver webDriver;

    private World() {
        String driverPath = System.getProperty("user.dir") + sp + "src" + sp + "main" + sp + "resources" + sp + "drivers" + sp;
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
       // webDriver = new ChromeDriver();
    }

    public static World getInstance() {
        return world;
    }

    public WebDriver getDriver() {
        return webDriver;
    }
}
