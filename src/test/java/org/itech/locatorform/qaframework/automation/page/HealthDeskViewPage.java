package org.itech.locatorform.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HealthDeskViewPage extends Page {
    private String PAGE_PATH = "/health-desk";

    private static final By FIELD_SEARCH = By.name("searchValue");

    private static final By TABLE_SEARCH_RESULTS = By
            .xpath("//*[@id='root']/div/div/div[3]/div/div/div/div/form/table");

    private static final By FIELD_LAST_NAME = By.name("lastName");

    private static final By FIELD_FIRST_NAME = By.name("firstName");

    private static final By FIELD_ARRIVAL_DATE = By.name("arrivalDate");

    private static final By BUTTON_SUBMIT = By.className("confirm-button");

    private static final By FIELD_TEST_KID = By.name("testKitId");

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

    public void clickNthPassengerResult() throws InterruptedException {
        for (int n = 1; n <= 1000; n++) {
            By RADIO_BUTTON_PASSENGER_RESULT_N = By.xpath("(//input[@name='pasenger'])[" + n + "]");
            clickOnByJavascript(RADIO_BUTTON_PASSENGER_RESULT_N);
            Thread.sleep(5000);
            if (containsText("No form could be found with that search value")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void clickSubmit() {
        clickOnByJavascript(BUTTON_SUBMIT);
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

    public Boolean submitButtonDisabled() {
        return isDisabled(BUTTON_SUBMIT);
    }

    public void enterArrivalDate(String date) {
        setTextToFieldNoEnter(FIELD_ARRIVAL_DATE, date);
    }

    public void enterTestKid(String testKid) {
        setTextToFieldNoEnter(FIELD_TEST_KID, testKid);
    }
}
