package org.itech.locatorform.qaframework.automation;

import org.itech.locatorform.qaframework.automation.test.TestBase;
import org.itech.locatorform.qaframework.automation.page.LocatorFormViewPage;
import org.itech.locatorform.qaframework.automation.page.KeyClockLoginPage;
import org.itech.locatorform.qaframework.automation.utils.Utils;

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
        assertTrue(locatorFormViewPage.containsText("Passenger Type"));
    }

    @And("'Next' Button Disabled before user fills required details")
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

    @Then("'Next' Button activated after user fills required details")
    public void nextButtonActivated() {
        assertFalse(locatorFormViewPage.nextButtonDisabled());
    }

    @When("User clicks 'Next' Button")
    public void clicksNext() {
        locatorFormViewPage.clickNext();
    }

    @Then("'Flight' details page loads")
    public void loadFlightDetails() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
        assertTrue(locatorFormViewPage.containsText("Flight"));
    }

    @When("User select flight Airline")
    public void selectFlightAirline() {
        locatorFormViewPage.selectAirLine();
    }

    @And("User enters Flight Number {string}")
    public void enterFlightNumber(String flightNumber) {
        locatorFormViewPage.enterFlightNumber(flightNumber);
    }

    @And("User enters seat Number {string}")
    public void enterSeatNumber(String seatNumber) {
        locatorFormViewPage.enterSeatNumber(seatNumber);
    }

    @And("User enters Date of Arrival")
    public void enterArrivalDate() {
        locatorFormViewPage.enterArrivalDate(Utils.getFutureDate());
    }

    @And("User Select Purpose of Visit")
    public void selectPurposeOfVist() {
        locatorFormViewPage.selectPurposeOfVist();
    }
}
