package com.example.taf.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://mail.google.com")
public class LoginPage extends AbstractPage {

    @FindBy(id = "Email")
    private WebElementFacade emailInput;

    @FindBy(id = "Passwd")
    private WebElementFacade passwordInput;

    @FindBy(id = "next")
    private WebElementFacade nextButton;

    @FindBy(id = "signIn")
    private WebElementFacade singInButton;

    @FindBy(id = "account-chooser-link")
    private WebElementFacade selectDifferentAccount;

    @FindBy(id = "account-chooser-add-account")
    private WebElementFacade addAccount;


    public WebElementFacade getEmailInput() {
        return emailInput;
    }

    public WebElementFacade getPasswordInput() {
        return passwordInput;
    }

    public WebElementFacade getNextButton() {
        return nextButton;
    }

    public WebElementFacade getSingInButton() {
        return singInButton;
    }

    public WebElementFacade getSelectDifferentAccount() {
        return selectDifferentAccount;
    }

    public WebElementFacade getAddAccount() {
        return addAccount;
    }
}
