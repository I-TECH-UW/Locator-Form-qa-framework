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

    @Then("'Passenger Type' Page loads")
    public void loadPassengerTypePage() {
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

    @Then("'Flight' Page loads")
    public void loadFlightPage() {
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

    @Then("'Personal Info' Page loads")
    public void loadPersonalInfoPage() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
        assertTrue(locatorFormViewPage.containsText("Personal Info"));
    }

    @When("User enters NationaId {string} if resident {string}")
    public void enterNationalId(String nationalId, String resdentType) {
        if (resdentType.trim().equals("Resident")) {
            locatorFormViewPage.enterNatioanlId(nationalId);
        }
    }

    @And("User selects Title")
    public void selectTitle() {
        locatorFormViewPage.selectTitle();
    }

    @And("User enters Last Name {string}")
    public void enterLastName(String lastName) {
        locatorFormViewPage.enterLastName(lastName);
    }

    @And("User enters First Name {string}")
    public void enterFirstName(String firstName) {
        locatorFormViewPage.enterFirstName(firstName);
    }

    @And("User enters Middle Innitial {string}")
    public void enterMiddleInnitial(String middleName) {
        locatorFormViewPage.enterMiddleInnitial(middleName);
    }

    @And("User selects Sex")
    public void selectSex() {
        locatorFormViewPage.selectSex();
    }

    @And("User enters Date of Birth {string}")
    public void enterDateOfBirth(String dateOfBirth) {
        locatorFormViewPage.enterDateOfBirth(dateOfBirth);
    }

    @And("User enters profession {string}")
    public void enterProfession(String profession) {
        locatorFormViewPage.enterProfession(profession);
    }

    @Then("'Recent Travel' Page loads")
    public void loadRecentTravelPage() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
        assertTrue(locatorFormViewPage.containsText("Recent Travel"));
    }

    @And("'Next' Button activated ,no required fields")
    public void nextButtonActivatedWithoutRequiredField() {
        assertFalse(locatorFormViewPage.nextButtonDisabled());
    }

    @And("User selects Countries visited during last 6 months")
    public void selectCountriesLastVisted() {
        locatorFormViewPage.selectCountriesLastVisted();
    }

    @And("User enters Port Of Embarkation {string}")
    public void enterPort(String port) {
        locatorFormViewPage.enterPortOfEmbarkation(port);
    }

    @Then("'Health' Page loads")
    public void loadHealthPage() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
        assertTrue(locatorFormViewPage.containsText("Health"));
    }

    @And("User Checks Fever Test")
    public void checkFeverTest() {
        locatorFormViewPage.checkFeverRadioButton();
    }

    @And("User Checks Covid test")
    public void checkCovidTest() {
        locatorFormViewPage.checkCovidRadioButton();
    }

    @Then("'Vaccine' Page loads")
    public void loadVaccinePage() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
        assertTrue(locatorFormViewPage.containsText("Vaccine"));
    }

    @And("User Selects Whether Vaccinated")
    public void selectsVaccinated() {
        locatorFormViewPage.checkVaccineRadioButton();
    }

    @And("User Selects Name of First Vaccine")
    public void selctsNameOfFirstVaccine() {
        locatorFormViewPage.selectFirstVaccine();
    }

    @And("User Enters Date Of First Dose")
    public void enterDateOfFirstDoze() {
        locatorFormViewPage.enterDateOfFirstDoze(Utils.getPastDate());
    }

    @And("User Selects Name of Second Vaccine")
    public void selctsNameOfSecondVaccine() {
        locatorFormViewPage.selectSecondVaccine();
    }

    @And("User Enters Date Of Second Dose")
    public void enterDateOfSecondtDoze() {
        locatorFormViewPage.enterDateOfSecondDoze(Utils.getPastDate());
    }

    @Then("'Contact Info' Page loads")
    public void loadContactInfoPage() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
        assertTrue(locatorFormViewPage.containsText("Contact Info"));
    }

    @When("User Enters Mobile Phone {string}")
    public void enterPhoneNumber(String phoneNumber) {
        locatorFormViewPage.enterPhoneNumber(phoneNumber);
    }

    @And("User Enters and Confirm Email {string}")
    public void enterEmail(String email) {
        locatorFormViewPage.enterEmail(email);
        locatorFormViewPage.enterEmailConfirm(email);
    }

    @And("User selects Country of Birth")
    public void selectCountryOfBirth() {
        locatorFormViewPage.selectCountryOfBirth();
    }

    @And("User selects Passport Country of Issue")
    public void selectPassportCountry() {
        locatorFormViewPage.selectCountryOfPassport();
    }

    @And("User enters Passport Number {string}")
    public void enterPassportNumber(String passportNumber) {
        locatorFormViewPage.enterPassportNumber(passportNumber);
    }

    @And("User enters Date Of Expiry")
    public void enterDateOfExpiry() {
        locatorFormViewPage.enterDateOfExpiry(Utils.getFutureDate());
    }

    @Then("'Addresses' Page loads")
    public void loadAdressPage() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
        assertTrue(locatorFormViewPage.containsText("Addresses"));
    }

    @When("User enters Permanet Address, Number and Street {string}")
    public void enterPermanetAddressStreet(String street) {
        locatorFormViewPage.enterPermanetAddresStreet(street);
    }

    @And("User enters Permanet Address, Apartment Number {string}")
    public void enterPermanetAddressApartment(String apartment) {
        locatorFormViewPage.enterPermanetAddresApartment(apartment);
    }

    @And("User enters Permanet Address, City {string}")
    public void enterPermanetAddressCity(String city) {
        locatorFormViewPage.enterPermanetAddresCity(city);
    }

    @And("User enters Temporary Address, Hotel Name {string}")
    public void enterTemporalyAddressHotel(String hotel) {
        locatorFormViewPage.enterTemporalyAddresHotel(hotel);
    }

    @And("User enters Temporary Address, Number and Street {string}")
    public void enterTemporalyAddressStreet(String street) {
        locatorFormViewPage.enterTemporalyAddresStreet(street);
    }

    @And("User enters Temporary Address, Apartment Number {string}")
    public void enterTemporalyAddressApartment(String apartment) {
        locatorFormViewPage.enterTemporalyAddresApartment(apartment);
    }

    @And("User enters Proposed Length of Stay in Mauritius for Non Resdent {string}")
    public void enterProposedLengthOfStay(String resdentType) {
        if (resdentType.trim().equals("Non-Resident")) {
            locatorFormViewPage.enterProposedLenthOfStay("3");
        }
    }

    @Then("'Emergency Contact' Page loads")
    public void loadEmergencyContactPage() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
        assertTrue(locatorFormViewPage.containsText("Emergency Contact"));
    }

    @When("User enters Emergency Contact ,Last Name {string}")
    public void enterEmergencyContactLastName(String lastName) {
        locatorFormViewPage.enterEmergencyContactLastName(lastName);
    }

    @And("User enters Emergency Contact ,First Name {string}")
    public void enterEmergencyContactFirstName(String firstName) {
        locatorFormViewPage.enterEmergencyContactFirstName(firstName);
    }

    @And("User enters Emergency Contact ,Address {string}")
    public void enterEmergencyContactAddres(String addres) {
        locatorFormViewPage.enterEmergencyContactAddres(addres);
    }

    @And("User selects Emergency Contact ,Country")
    public void selectEmergencyContactCountry() {
        locatorFormViewPage.selectEmergencyCountry();
    }

    @And("User enters Emergency Contact ,Mobile Phone {string}")
    public void enterEmergencyContactMobileNumber(String mobileNumber) {
        locatorFormViewPage.enterEmergencyContactMobileNumber(mobileNumber);
    }

    @Then("'Travel Companions' Page loads")
    public void loadTravelCompanionPage() {
        assertTrue(locatorFormViewPage.containsText("Public Health Passenger Locator Form"));
        assertTrue(locatorFormViewPage.containsText("Travel Companions"));
    }

    @When("User Clicks 'Add Travel Companion Family' Button")
    public void clickAddTravelCompanionFamily() {
        locatorFormViewPage.clickAddTravelCompanionFamily();
    }

    @And("User Enters Travel Companion ,Last Name {string}")
    public void enterravelCompanionFamilyLastName(String name) {
        locatorFormViewPage.enterTravelCompanionFamilyLastName(name);
    }

    @And("User Enters Travel Companion ,First Name {string}")
    public void enterTravelCompanionFamilyFirstName(String name) {
        locatorFormViewPage.enterTravelCompanionFamilyFirstName(name);
    }

    @And("User selects Travel Companion ,sex")
    public void selectTravelCompanionFamilySex() {
        locatorFormViewPage.selectFamilyCompanionSex();
    }

    @And("User Enters Travel Companion ,Seat {string}")
    public void enterTravelCompanionFamilySeatNumber(String seat) {
        locatorFormViewPage.enterTravelCompanionFamilySeat(seat);
    }

    @And("User Enters Travel Companion ,Date Of Birth {string}")
    public void enterTravelCompanionFamilyDateOfBirth(String date) {
        locatorFormViewPage.enterTravelCompanionDateOfBrith(date);
    }

    @And("User selects Travel Companion ,Nationality")
    public void selectTravelCompanionFamilyNationality() {
        locatorFormViewPage.selectFamilyCompanionNationality();
    }

    @And("User Enters Travel Companion ,Passport Number {string}")
    public void enterTravelCompanionFamilyPassportNumber(String passportNumber) {
        locatorFormViewPage.enterTravelCompanionPassportNumber(passportNumber);
    }

    @When("User Clicks 'Add Travel Companion Family' Button again,to add another Family Companion")
    public void clickAddMoreTravelCompanionFamily() {
        locatorFormViewPage.clickAddTravelCompanionFamily();
    }

    @When("User Removes the Extra Added Family Companion")
    public void removeExtraTravelCompanionFamily() {
        locatorFormViewPage.clickRemoveTravelCompanionFamily2();
    }

    @When("User Clicks 'Add Travel Companion Non-Family' Button ,to add Non-Family Companion")
    public void clickAddTravelCompanionNonFamily() {
        locatorFormViewPage.clickAddTravelCompanionNonFamily();
    }

    @When("User removes the Added Non-Family Companion")
    public void removeExtraTravelCompanionNonFamily() {
        locatorFormViewPage.clickRemoveTravelCompanionNonFamily();
    }

    @When("User clicks 'Back', to go to the previous step")
    public void clickBack() {
        locatorFormViewPage.clickBack();
    }

    @Then("User information is still populated in the fields , and can click 'Next' to move back the current step")
    public void userInformationIsCached() {
        assertFalse(locatorFormViewPage.nextButtonDisabled());
        locatorFormViewPage.clickNext();
    }

    @Then("'Confirmation' Page loads")
    public void loadConfirmationPage() {
        assertTrue(locatorFormViewPage.containsText("Confirmation"));
    }

    @Then("Confirmation Page contains the right Summary Information")
    public void confirmationPageHasRightSummary() {
        assertTrue(locatorFormViewPage.containsText("Personal Information"));
        assertTrue(locatorFormViewPage.containsText("mozzy"));
        assertTrue(locatorFormViewPage.containsText("mutesa"));
    }

    @When("User checks Accept terms CheckBox")
    public void checkAcceptTerms() {
        locatorFormViewPage.checkAcceptsTermsCheckBox();
    }

    @Then("'Submit' Button Disabled before User checks Accept terms CheckBox")
    public void submitButtonDisabled() {
        assertTrue(locatorFormViewPage.submitButtonDisabled());
    }

    @Then("'Submit' Button activated after User checks Accept terms CheckBox")
    public void submitButtonActivated() {
        assertFalse(locatorFormViewPage.submitButtonDisabled());
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
