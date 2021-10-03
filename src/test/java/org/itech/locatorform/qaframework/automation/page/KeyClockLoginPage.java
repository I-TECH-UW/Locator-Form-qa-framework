package org.itech.locatorform.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class represents the Login page
 */
public class KeyClockLoginPage extends Page {

	private static final String PATH_LOGIN = "/auth/realms/Airport/protocol/openid-connect/auth?client_id=locator-form&redirect_uri=https%3A%2F%2Ftesting.openelisci.org%2Fhealth-desk&state=c0a34d0d-8497-4d2a-9f65-fc6faf11800a&response_mode=fragment&response_type=code&scope=openid&nonce=06f18c11-baef-4d92-b5b5-fe3c6c2c94ce";

	private static final By FIELD_USERNAME = By.id("username");

	private static final By FIELD_PASSWORD = By.id("password");

	private static final By BUTTON_SIGN_IN = By.id("kc-login");

	static final String LOGOUT_PATH = "/logout";

	private String username;

	private String password;

	public KeyClockLoginPage(Page page) {
		super(page);
		username = properties.getUsername();
		password = properties.getPassword();
	}

	@Override
	public void go() {
		goToPage(PATH_LOGIN);
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

	public HealthDeskViewPage loginAndGoToHealthDeskViewPage() {
		enterUsername(this.username);
		enterPassword(this.password);
		clickOn(BUTTON_SIGN_IN);
		return new HealthDeskViewPage(this);
	}
}
