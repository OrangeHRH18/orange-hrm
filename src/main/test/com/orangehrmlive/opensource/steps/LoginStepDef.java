package com.orangehrmlive.opensource.steps;

import com.orangehrmlive.opensource.pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.fluentlenium.core.annotation.Page;

public class LoginStepDef extends BaseTest {
    @Page
    private LoginPage loginPage;

    @Before("@UISetup")
    public void before() {
        super.before();
    }

    @Given("^Orange HRM login page is displayed$")
    public void diplayLoginPage() {
        loginPage.isLoginPageDisplayed();
    }

    @And("^the valid user logs into UI$")
    public void userLogsIn() {
        loginPage.login();
    }

    @After("@UISetup")
    public void after() {
        super.after();
    }
}
