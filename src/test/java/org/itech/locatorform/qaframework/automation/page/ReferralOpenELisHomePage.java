package org.itech.locatorform.qaframework.automation.page;

import org.openqa.selenium.By;

public class ReferralOpenELisHomePage extends Page {

    private static final String PATH_HOME = "/Dashboard.do";

    private static final By FIRST_LEVEL_MENU_ORDER = By.id("menu_sample");

    private static final By SECOND_LEVEL_MENU_E_ORDER = By.id("menu_sample_eorder");

    private static final By BUTTON_LOGOUT = By.id("logout-form");

    public ReferralOpenELisHomePage(Page parent) {
        super(parent);
    }

    @Override
    public String getPageUrl() {
        return null;
    }

    public ReferralOpenElisElectronicOrderPage goToElectronicOrderPage() {
        hoverOn(FIRST_LEVEL_MENU_ORDER);
        clickOn(SECOND_LEVEL_MENU_E_ORDER);
        return new ReferralOpenElisElectronicOrderPage(this);
    }

    public Boolean hasLogout(){
        return hasElement(BUTTON_LOGOUT);
    }
}
