package com.orangehrmlive.opensource.steps;

import com.orangehrmlive.opensource.pages.DashboardPage;
import cucumber.api.java.en.Then;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;

public class DashboardStepDef extends FluentTest {
    @Page
    private DashboardPage dashboardPage;

    @Then("^the main dashboard is displayed$")
    public void diplayMainDashboard() {
        dashboardPage.isMainDashboardDisplayed();
    }

}
