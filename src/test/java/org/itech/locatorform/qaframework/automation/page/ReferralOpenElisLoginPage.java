package org.itech.locatorform.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReferralOpenElisLoginPage extends Page {

    private static final String PATH_LOGIN = "/LoginPage.do";

    private static final By FIELD_USERNAME = By.id("loginName");

    private static final By FIELD_PASSWORD = By.id("password");

    private static final By BUTTON_SUBMIT = By.id("submitButton");

    public ReferralOpenElisLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return PATH_LOGIN;
    }

    public void enterUsername(String username) {
        setTextToFieldNoEnter(FIELD_USERNAME, username);
    }

    public void enterPassword(String password) {
        setTextToFieldNoEnter(FIELD_PASSWORD, password);
    }

    public void clickLoginButton() {
        clickOn(BUTTON_SUBMIT);
    }

    public ReferralOpenELisHomePage goToReferralHomePage() {
        goToReferralPage();
        enterUsername(properties.getReferralUsername());
        enterPassword(properties.getReferralPassword());
        clickLoginButton();
        return new ReferralOpenELisHomePage(this);
    }
}
