package com.example.taf.scenarios;

import com.example.taf.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;

public class SearchScenario {

    @Steps
    SearchSteps searchSteps;

    @When("user searches for mail by stored timestamp")
    public void searchForMailByTimestamp() {
        searchSteps.searchForMailByTimestamp();
    }

}
