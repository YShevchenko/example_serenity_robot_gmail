package com.example.taf.scenarios;

import com.example.taf.dto.MailDto;
import com.example.taf.steps.serenity.SendMailSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class SendMailScenario {

    @Steps
    SendMailSteps sendMailSteps;

    @When("user sends following email with timestamp added in subject:$table")
    public void sendMail(final ExamplesTable examplesTable) {
        MailDto mailDto = examplesTable.getRowsAs(MailDto.class).get(0);
        sendMailSteps.sendMail(mailDto);
    }
}
