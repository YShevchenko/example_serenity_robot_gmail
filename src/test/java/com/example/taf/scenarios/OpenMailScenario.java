package com.example.taf.scenarios;

import com.example.taf.steps.serenity.OpenMailSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class OpenMailScenario {

    @Steps
    OpenMailSteps openMailSteps;

    @When("user opens attachment in found email")
    public void openAttachmentInFoundLetter() {
        openMailSteps.openFoundLetter();
        openMailSteps.openAttachment();
    }

    @Then("attachment should contain text $expectedText")
    public void verifyAttachmentText(final String expectedText) {
        Assert.assertEquals("Attachment text differs from expected.",
                openMailSteps.getAttachmentText(), expectedText.replace("<endline>", "\n"));
    }
}
