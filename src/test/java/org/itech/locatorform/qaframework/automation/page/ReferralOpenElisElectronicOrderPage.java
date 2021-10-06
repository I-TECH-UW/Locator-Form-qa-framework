package org.itech.locatorform.qaframework.automation.page;

import org.openqa.selenium.By;

public class ReferralOpenElisElectronicOrderPage extends Page {

    private static final String PATH_PATH = "/ElectronicOrders.do";

    private static final By FIELD_SEARCH = By.id("searchValue");

    private static final By TABLE_SEARCH_RESULTS = By.id("eOrderTable");

    private static final By BUTTON_SEARCH = By.xpath("//*[@id='mainForm']/table/tbody/tr[4]/td/button[1]");

    public ReferralOpenElisElectronicOrderPage(Page parent) {
        super(parent);
    }

    @Override
    public String getPageUrl() {
        return PATH_PATH;
    }

    public void enterSearchText(String text) {
        setTextToFieldNoEnter(FIELD_SEARCH, text);
    }

    public void clickSearchButton() {
        clickOn(BUTTON_SEARCH);
    }

    public Boolean hasSentOrders() throws InterruptedException {
        clickSearchButton();
        while (!hasElementWithoutWait(TABLE_SEARCH_RESULTS)) {
            Thread.sleep(10000);
            clickSearchButton();
        }
        return hasElementWithoutWait(TABLE_SEARCH_RESULTS);
    }
}
