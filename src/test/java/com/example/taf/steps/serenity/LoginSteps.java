package com.example.taf.steps.serenity;

import com.example.taf.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    private LoginPage loginPage;

    @Step
    public void openLoginPage() {
        loginPage.open();
    }

    @Step
    public void login(final String login, final String password) {
        loginPage.getEmailInput().type(login);
        loginPage.getNextButton().click();
        loginPage.getPasswordInput().type(password);
        loginPage.getSingInButton().click();
    }

    @Step
    public void selectNewAccount() {
        loginPage.getSelectDifferentAccount().click();
        loginPage.getAddAccount().click();
    }
}
