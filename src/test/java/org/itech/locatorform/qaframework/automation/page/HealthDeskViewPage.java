package org.itech.locatorform.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HealthDeskViewPage extends Page {
    private String PAGE_PATH = "/health-desk";

    private static final By FIELD_SEARCH = By.name("searchValue");

    private static final By TABLE_SEARCH_RESULTS = By
            .xpath("//*[@id='root']/div/div/div[3]/div/div/div/div/form/table");

    private static final By RADIO_BUTTON_PASSENGER_RESULT = By.name("pasenger");

    private static final By FIELD_LAST_NAME = By.name("lastName");

    private static final By FIELD_FIRST_NAME = By.name("firstName");

    public HealthDeskViewPage(WebDriver driver) {
        super(driver);
    }

    public HealthDeskViewPage(Page page) {
        super(page);
    }

    @Override
    public String getPageUrl() {
        return PAGE_PATH;
    }

    @Override
    public void go() {
        goToPage(getPageUrl());
    }

    public KeyClockLoginPage redirectToKeyClockLogin() {
        return new KeyClockLoginPage(this);
    }

    public void waitForPageToLoad() {
        waitForElement(FIELD_SEARCH);
    }

    public void clickPassengerResult() {
        clickOnByJavascript(RADIO_BUTTON_PASSENGER_RESULT);
    }

    public void enterSearchText(String text) {
        waitForElement(FIELD_SEARCH);
        setText(FIELD_SEARCH, text);
    }

    public Boolean hasSearchResults() {
        return hasElement(TABLE_SEARCH_RESULTS);
    }

    public String getLastName() {
        return getValue(FIELD_LAST_NAME);
    }

    public String getFirstName() {
        return getValue(FIELD_FIRST_NAME);
    }
}
