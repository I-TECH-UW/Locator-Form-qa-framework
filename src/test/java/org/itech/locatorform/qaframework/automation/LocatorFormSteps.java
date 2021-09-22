package org.itech.locatorform.qaframework.automation;

import org.itech.locatorform.qaframework.automation.test.TestBase;
import org.itech.locatorform.qaframework.automation.page.LocatorFormViewPage;
import org.itech.locatorform.qaframework.automation.page.KeyClockLoginPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.itech.locatorform.qaframework.automation.page.HealthDeskViewPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocatorFormSteps extends TestBase {

    private LocatorFormViewPage locatorFormViewPage;

    @After()
    public void destroy() {
        quit();
    }

    @Before()
    public void setLoginPage() {
        System.out.println("....Locator Form Test......");
        locatorFormViewPage = new LocatorFormViewPage(getWebDriver());
    }

    @When("User Logs in to the Health Desk View")
    public void userLogsToHealthDeskView() {
        System.out.println("User Logs in to the Health Desk View");
    }

    @When("User Loads the Public View form")
    public void userGoesToPublicView() {
        locatorFormViewPage.go();
    }

    @Then("Public View Form loads")
    public void publicViewFormLoads() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
    }

    @And("'Next' Button Disabled before user selects Resident Type")
    public void nextButtonDisabled() {
        assertTrue(locatorFormViewPage.nextButtonDisabled());
    }

    @When("User Selects Resident Type {string}")
    public void userselectResdenttype(String resdentType) {
        if (resdentType.trim().equals("Resident")) {
            locatorFormViewPage.selectResdent();
        } else if (resdentType.trim().equals("Non-Resident")) {
            locatorFormViewPage.selectNoneResdent();
        }
    }

    @Then("'Next' Button activated after user selects Resident Type")
    public void nextButtonActivated() {
        assertFalse(locatorFormViewPage.nextButtonDisabled());
    }

    @When("User clicks 'Next' Button")
    public void clicksNext() {
        locatorFormViewPage.clickNext();
    }
}
