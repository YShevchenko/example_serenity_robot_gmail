package com.example.taf.steps.serenity;

import com.example.taf.utils.TestSessionUtils;
import com.example.taf.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class SearchSteps {

    private HomePage homePage;

    @Step
    public void searchForMailByTimestamp() {
        String timestamp = TestSessionUtils.get(TestSessionUtils.TIMESTAMP_USED, String.class);
        homePage.getSearchWidget().getSearchInput().type(timestamp);
        homePage.getSearchWidget().getSearchButton().click();
        homePage.waitForDocumentReady();
    }
}
