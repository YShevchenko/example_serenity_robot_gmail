package com.example.taf.steps.serenity;

import com.example.taf.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class OpenMailSteps {

    private HomePage homePage;

    @Step
    public void openFoundLetter() {
        homePage.getMailSearchResult().click();
    }

    @Step
    public void openAttachment() {
        homePage.getOpenAttachmentLink().click();
    }

    @Step
    public String getAttachmentText() {
        return homePage.getAttachmentText().getText();
    }
}
