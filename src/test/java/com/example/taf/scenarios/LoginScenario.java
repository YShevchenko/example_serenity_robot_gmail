package com.example.taf.scenarios;

import com.example.taf.utils.WebDriverUtils;
import com.example.taf.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class LoginScenario {

    @Steps
    private LoginSteps loginSteps;

    @Given("{sender |}user logins in to Gmail with email $email and password $password")
    public void login(final String email, final String password) {
        loginSteps.openLoginPage();
        loginSteps.login(email, password);
    }

    @When("{recipient |}user re-logins in to Gmail with email $email and password $password")
    public void relogin(final String email, final String password) {
        WebDriverUtils.clearCookies();
        loginSteps.openLoginPage();
        loginSteps.selectNewAccount();
        loginSteps.login(email, password);
    }
}
