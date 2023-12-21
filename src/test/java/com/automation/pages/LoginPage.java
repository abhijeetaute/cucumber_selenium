package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//input[@id='userid']")
	private WebElement userNameInput;

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pwdInput;

	@FindBy(xpath = "//button[@id='signin-continue-btn']")
	private WebElement continueButton;

	@FindBy(xpath = "//button[@id='sgnBt']")
	private WebElement signInButton;

	@FindBy(xpath = "//button[@id='webauthn-maybe-later-link']")
	private WebElement mayBeLaterButton;

	@FindBy(xpath = "//div[@role='navigation']//li/button")
	private WebElement logoutDropdown;

	@FindBy(xpath = "//a[text()='Sign out']")
	private WebElement signout;

	@FindBy(xpath = "//*[@id='user-info']")
	private WebElement userInfoEmail;

	@FindBy(xpath = "//input[@id='kmsi-checkbox']")
	private WebElement keepMeSignedIn;


	public void login(String userName, String password) {
		waitforElement(By.xpath("//input[@id='kmsi-checkbox']"));

		if (!isElementPresent(By.xpath("//*[@id='user-info']"))) {
			waitForElementToBePresent(continueButton);
			userNameInput.sendKeys(userName);
			continueButton.click();
		}
		waitForElementToBePresent(pwdInput);
		pwdInput.sendKeys(password);
		signInButton.click();
		waitForElementNotToBePresent(signInButton);
		if (isElementPresent(By.xpath("//button[@id='webauthn-maybe-later-link']")))
			mayBeLaterButton.click();
	}

	public void logOut() {
		logoutDropdown.click();
		waitForElementToBePresent(signout);
		signout.click();
		waitForElementNotToBePresent(signInButton);
	}
}
