package com.orangehrmlive.opensource.pages;


import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
@PageUrl("https://opensource-demo.orangehrmlive.com/")
public class LoginPage extends FluentPage {
    @FindBy(id = "txtUsername")
    private FluentWebElement username;
    @FindBy(id = "txtPassword")
    private FluentWebElement password;
    @FindBy(id = "btnLogin")
    public FluentWebElement btnLogin;
    @FindBy(id="frmLogin")
    public FluentWebElement form;

    public void login(String usernameText, String passwordText) {
        username.fill().with(usernameText);
        password.fill().with(passwordText);
        btnLogin.click();
    }

    //TODO
    public boolean isLoginPageDisplayed() {
        await().atMost(60, TimeUnit.SECONDS).until(form).displayed();
        return true;
    }
}
