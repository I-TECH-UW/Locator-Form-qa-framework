package org.itech.locatorform.qaframework.automation.page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class LocatorFormViewPage extends Page {

    private static final By BUTTON_NEXT = By.className("next-button");

    private static final By BUTTON_SUBMIT = By.className("confirm-button");

    private static final By BUTTON_BACK = By.className("back-button");

    private static final By RADIO_BUTTON_RESDENT = By.id("resident");

    private static final By RADIO_BUTTON_NON_RESDENT = By.id("nonresident");

    private static final By CHECK_BOX_ACCEPT_TERMS = By.name("acceptedTerms");

    private static final By RADIO_BUTTON_FEVER = By.name("fever");

    private static final By RADIO_BUTTON_COVID = By.name("hadCovidBefore");

    private static final By RADIO_BUTTON_VACCINATED = By.name("vaccinated");

    private static final By FIELD_FLIGHT_NUMBER = By.name("flightNumber");

    private static final By FIELD_SEAT_NUMBER = By.name("seatNumber");

    private static final By FIELD_ARRIVAL_DATE = By.name("arrivalDate");

    private static final By FIELD_LAST_NAME = By.name("lastName");

    private static final By FIELD_NATIONAL_ID = By.name("nationalID");

    private static final By FIELD_FIRST_NAME = By.name("firstName");

    private static final By FIELD_MIDDLE_INNITIAL = By.name("middleInitial");

    private static final By FIELD_DATE_OF_BIRTH = By.name("dateOfBirth");

    private static final By FIELD_PROFESSION = By.name("profession");

    private static final By FIELD_PORT = By.name("portOfEmbarkation");

    private static final By FIELD_DATE_OF_FIRST_DOZE = By.name("dateOfFirstDose");

    private static final By FIELD_DATE_OF_SECOND_DOZE = By.name("dateOfSecondDose");

    private static final By FIELD_MOBILE_PHONE = By.name("mobilePhone");

    private static final By FIELD_EMAIL = By.name("email");

    private static final By FIELD_EMAIL_CONFIRM = By.name("confirmEmail");

    private static final By FIELD_PASSPORT_NUMBER = By.name("passportNumber");

    private static final By FIELD_DATE_OF_EXPIRY = By.name("passportExpiryDate");

    private static final By FIELD_PERMANET_ADDRES_STREET = By.name("permanentAddress.numberAndStreet");

    private static final By FIELD_PERMANET_ADDRES_APARTMENT = By.name("permanentAddress.apartmentNumber");

    private static final By FIELD_PERMANET_ADDRES_CITY = By.name("permanentAddress.city");

    private static final By FIELD_TEMPORALY_ADDRES_HOTEL = By.name("temporaryAddress.hotelName");

    private static final By FIELD_TEMPORALY_ADDRES_STREET = By.name("temporaryAddress.numberAndStreet");

    private static final By FIELD_TEMPORALY_ADDRES_APARTMENT = By.name("temporaryAddress.apartmentNumber");

    private static final By FIELD_PROPOSED_LENGTH_OF_STAY = By.name("lengthOfStay");

    private static final By FIELD_EMERGENCE_CONTACT_LAST_NAME = By.name("emergencyContact.lastName");

    private static final By FIELD_EMERGENCE_CONTACT_FIRST_NAME = By.name("emergencyContact.firstName");

    private static final By FIELD_EMERGENCE_CONTACT_ADDRES = By.name("emergencyContact.address");

    private static final By FIELD_EMERGENCE_CONTACT_MOBILE_NUMBER = By.name("emergencyContact.mobilePhone");

    private static final By BUTTON_ADD_TRAVEL_COMPANION_FAMILY = By
            .xpath("//*[@id='travelCompanionsInformation']/div[2]/button");

    private static final By BUTTON_ADD_TRAVEL_COMPANION_NON_FAMILY = By
            .xpath("//*[@id='nonFamilyTravelCompanionInformation']/div[2]/div/div/button");

    private static final By FIELD_FAMILY_COMPANION_LAST_NAME = By.name("familyTravelCompanions.0.lastName");

    private static final By FIELD_FAMILY_COMPANION_FIRST_NAME = By.name("familyTravelCompanions.0.firstName");

    private static final By FIELD_FAMILY_COMPANION_SEAT_NUMBER = By.name("familyTravelCompanions.0.seatNumber");

    private static final By FIELD_FAMILY_COMPANION_DATE_OF_BIRTH = By.name("familyTravelCompanions.0.dateOfBirth");

    private static final By FIELD_FAMILY_COMPANION_PASPORT = By.name("familyTravelCompanions.0.passportNumber");

    private static final By BUTTON_REMOVE_TRAVEL_COMPANION_FAMILY_2 = By
            .xpath("//*[@id='travelCompanionsInformation']/div[2]/div[2]/div[2]/div[5]/button");

    private static final By BUTTON_REMOVE_TRAVEL_COMPANION_NON_FAMILY = By
            .xpath("//*[@id='nonFamilyTravelCompanionInformation']/div[2]/div[1]/div[2]/div[5]/button");

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

    public Boolean submitButtonDisabled() {
        return isDisabled(BUTTON_SUBMIT);
    }

    public void clickNext() {
        clickOnByJavascript(BUTTON_NEXT);
    }

    public void clickSubmit() {
        clickOnByJavascript(BUTTON_SUBMIT);
    }

    public void clickBack() {
        clickOnByJavascript(BUTTON_BACK);
    }

    public void clickAddTravelCompanionFamily() {
        clickOnByJavascript(BUTTON_ADD_TRAVEL_COMPANION_FAMILY);
    }

    public void clickAddTravelCompanionNonFamily() {
        clickOnByJavascript(BUTTON_ADD_TRAVEL_COMPANION_NON_FAMILY);
    }

    public void clickRemoveTravelCompanionFamily2() {
        clickOnByJavascript(BUTTON_REMOVE_TRAVEL_COMPANION_FAMILY_2);
    }

    public void clickRemoveTravelCompanionNonFamily() {
        clickOnByJavascript(BUTTON_REMOVE_TRAVEL_COMPANION_NON_FAMILY);
    }

    public void checkFeverRadioButton() {
        clickOnByJavascript(RADIO_BUTTON_FEVER);
    }

    public void checkAcceptsTermsCheckBox() {
        clickOnByJavascript(CHECK_BOX_ACCEPT_TERMS);
    }

    public void checkCovidRadioButton() {
        clickOnByJavascript(RADIO_BUTTON_COVID);
    }

    public void checkVaccineRadioButton() {
        clickOnByJavascript(RADIO_BUTTON_VACCINATED);
    }

    public void selectAirLine() {
        selectReactOptionByJavacript("airlineName");
    }

    public void selectPurposeOfVist() {
        selectReactOptionByJavacript("visitPurpose");
    }

    public void selectTitle() {
        selectReactOptionByJavacript("title");
    }

    public void selectSex() {
        selectReactOptionByJavacript("sex");
    }

    public void selectCountriesLastVisted() {
        selectReactOptionByJavacript("countriesVisited");
    }

    public void selectFirstVaccine() {
        selectReactOptionByJavacript("firstVaccineName");
    }

    public void selectSecondVaccine() {
        selectReactOptionByJavacript("secondVaccineName");
    }

    public void selectCountryOfBirth() {
        selectReactOptionByJavacript("countryOfBirth");
    }

    public void selectCountryOfPassport() {
        selectReactOptionByJavacript("countryOfPassportIssue");
    }

    public void selectEmergencyCountry() {
        selectReactOptionByJavacript("emergencyContact.country");
    }

    public void selectFamilyCompanionSex() {
        selectReactOptionByJavacript("familyTravelCompanions.0.sex");
    }

    public void selectFamilyCompanionNationality() {
        selectReactOptionByJavacript("familyTravelCompanions.0.nationality");
    }

    public void enterFlightNumber(String flightNumber) {
        setTextToFieldNoEnter(FIELD_FLIGHT_NUMBER, flightNumber);
    }

    public void enterSeatNumber(String seatNumber) {
        setTextToFieldNoEnter(FIELD_SEAT_NUMBER, seatNumber);
    }

    public void enterArrivalDate(String date) {
        setTextToFieldNoEnter(FIELD_ARRIVAL_DATE, date);
    }

    public void enterNatioanlId(String nationalId) {
        setTextToFieldNoEnter(FIELD_NATIONAL_ID, nationalId);
    }

    public void enterFirstName(String firstName) {
        setTextToFieldNoEnter(FIELD_FIRST_NAME, firstName);
    }

    public void enterLastName(String lastName) {
        setTextToFieldNoEnter(FIELD_LAST_NAME, lastName);
    }

    public void enterMiddleInnitial(String middleName) {
        setTextToFieldNoEnter(FIELD_MIDDLE_INNITIAL, middleName);
    }

    public void enterDateOfBirth(String dateOfBirth) {
        setTextToFieldNoEnter(FIELD_DATE_OF_BIRTH, dateOfBirth);
    }

    public void enterProfession(String profession) {
        setTextToFieldNoEnter(FIELD_PROFESSION, profession);
    }

    public void enterPortOfEmbarkation(String port) {
        setTextToFieldNoEnter(FIELD_PORT, port);
    }

    public void enterDateOfFirstDoze(String date) {
        setTextToFieldNoEnter(FIELD_DATE_OF_FIRST_DOZE, date);
    }

    public void enterDateOfSecondDoze(String date) {
        setTextToFieldNoEnter(FIELD_DATE_OF_SECOND_DOZE, date);
    }

    public void enterPhoneNumber(String phoneNumber) {
        setTextToFieldNoEnter(FIELD_MOBILE_PHONE, phoneNumber);
    }

    public void enterEmail(String email) {
        setTextToFieldNoEnter(FIELD_EMAIL, email);
    }

    public void enterEmailConfirm(String email) {
        setTextToFieldNoEnter(FIELD_EMAIL_CONFIRM, email);
    }

    public void enterPassportNumber(String passportNumber) {
        setTextToFieldNoEnter(FIELD_PASSPORT_NUMBER, passportNumber);
    }

    public void enterDateOfExpiry(String date) {
        setTextToFieldNoEnter(FIELD_DATE_OF_EXPIRY, date);
    }

    public void enterPermanetAddresStreet(String street) {
        setTextToFieldNoEnter(FIELD_PERMANET_ADDRES_STREET, street);
    }

    public void enterPermanetAddresApartment(String apartment) {
        setTextToFieldNoEnter(FIELD_PERMANET_ADDRES_APARTMENT, apartment);
    }

    public void enterPermanetAddresCity(String city) {
        setTextToFieldNoEnter(FIELD_PERMANET_ADDRES_CITY, city);
    }

    public void enterTemporalyAddresHotel(String hotel) {
        setTextToFieldNoEnter(FIELD_TEMPORALY_ADDRES_HOTEL, hotel);
    }

    public void enterTemporalyAddresStreet(String street) {
        setTextToFieldNoEnter(FIELD_TEMPORALY_ADDRES_STREET, street);
    }

    public void enterTemporalyAddresApartment(String apartment) {
        setTextToFieldNoEnter(FIELD_TEMPORALY_ADDRES_APARTMENT, apartment);
    }

    public void enterProposedLenthOfStay(String numberOfDays) {
        setTextToFieldNoEnter(FIELD_PROPOSED_LENGTH_OF_STAY, numberOfDays);
    }

    public void enterEmergencyContactLastName(String lastName) {
        setTextToFieldNoEnter(FIELD_EMERGENCE_CONTACT_LAST_NAME, lastName);
    }

    public void enterEmergencyContactFirstName(String firstName) {
        setTextToFieldNoEnter(FIELD_EMERGENCE_CONTACT_FIRST_NAME, firstName);
    }

    public void enterEmergencyContactAddres(String addres) {
        setTextToFieldNoEnter(FIELD_EMERGENCE_CONTACT_ADDRES, addres);
    }

    public void enterEmergencyContactMobileNumber(String mobileNumber) {
        setTextToFieldNoEnter(FIELD_EMERGENCE_CONTACT_MOBILE_NUMBER, mobileNumber);
    }

    public void enterTravelCompanionFamilyLastName(String name) {
        setTextToFieldNoEnter(FIELD_FAMILY_COMPANION_LAST_NAME, name);
    }

    public void enterTravelCompanionFamilyFirstName(String name) {
        setTextToFieldNoEnter(FIELD_FAMILY_COMPANION_FIRST_NAME, name);
    }

    public void enterTravelCompanionFamilySeat(String seat) {
        setTextToFieldNoEnter(FIELD_FAMILY_COMPANION_SEAT_NUMBER, seat);
    }

    public void enterTravelCompanionDateOfBrith(String date) {
        setTextToFieldNoEnter(FIELD_FAMILY_COMPANION_DATE_OF_BIRTH, date);
    }

    public void enterTravelCompanionPassportNumber(String passportNumber) {
        setTextToFieldNoEnter(FIELD_FAMILY_COMPANION_PASPORT, passportNumber);
    }
}
