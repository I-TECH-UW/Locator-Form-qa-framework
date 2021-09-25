package org.itech.locatorform.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorFormViewPage extends Page {

    private static final By BUTTON_NEXT = By.className("next-button");

    private static final By BUTTON_BACK = By.className("back-button");

    private static final By RADIO_BUTTON_RESDENT = By.id("resident");

    private static final By RADIO_BUTTON_NON_RESDENT = By.id("nonresident");

    private static final By FIELD_FLIGHT_NUMBER = By.name("flightNumber");

    private static final By FIELD_SEAT_NUMBER = By.name("seatNumber");

    private static final By FIELD_ARRIVAL_DATE = By.name("arrivalDate");


    private static final By LABEL_RESDENT = By.xpath("//*[@id='passengerTypeInformation']/div/div/label[2]");

    private static final By LABEL_NON_RESDENT = By.xpath("//*[@id='passengerTypeInformation']/div/div/label[3]");

    public LocatorFormViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return "";
    }

    public void selectResdent() {
        clickOnByJavascript(RADIO_BUTTON_RESDENT);
    }

    public void selectNoneResdent() {
        clickOnByJavascript(RADIO_BUTTON_NON_RESDENT);
    }

    public Boolean nextButtonDisabled() {
        return isDisabled(BUTTON_NEXT);
    }

    public void clickNext() {
        clickOnByJavascript(BUTTON_NEXT);
    }

    public void selectAirLine() {
        selectReactOptionByJavacript("airlineName");
    }

    public void selectPurposeOfVist() {
        selectReactOptionByJavacript("visitPurpose");
    }

    public void enterFlightNumber(String flightNumber) {
        setText(FIELD_FLIGHT_NUMBER, flightNumber);
    }

    public void enterSeatNumber(String seatNumber) {
        setText(FIELD_SEAT_NUMBER, seatNumber);
    }

    public void enterArrivalDate(String date) {
        setText(FIELD_ARRIVAL_DATE, date);
    }
}
