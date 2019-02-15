package com.orangehrmlive.opensource.steps;

import com.orangehrmlive.opensource.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;

public class LoginStepDef extends FluentTest {

    @Page
    private LoginPage loginPage;


    @Given("^Orange HRM login page is displayed$")
    public void diplayLoginPage() {
        goTo("https://opensource-demo.orangehrmlive.com/");
        loginPage.isLoginPageDisplayed();
    }

    @And("^the valid user logs into UI$")
    public void userLogsIn() {
        loginPage.login("Admin", "admin123");
    }



}
