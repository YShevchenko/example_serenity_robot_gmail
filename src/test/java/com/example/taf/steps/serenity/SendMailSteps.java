package com.example.taf.steps.serenity;

import com.example.taf.utils.FileUploadUtils;
import com.example.taf.utils.TestSessionUtils;
import com.example.taf.dto.MailDto;
import com.example.taf.pages.HomePage;
import net.thucydides.core.annotations.Step;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SendMailSteps {

    private HomePage homePage;

    @Step
    public void sendMail(final MailDto mailDto) {
        String timeStamp = new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss").format(new Date());
        TestSessionUtils.store(TestSessionUtils.TIMESTAMP_USED, timeStamp);
        homePage.getSideWidget().getComposeButton().click();
        homePage.getNewMailWidget().getRecipientEmailInput().type(mailDto.getRecipientEmail());
        homePage.getNewMailWidget().getSubjectInput().type(mailDto.getSubject() + " " + timeStamp);
        homePage.getNewMailWidget().getMessageBody().type(mailDto.getMessage());
        homePage.getNewMailWidget().getAttachFilesButton().click();
        FileUploadUtils.setFilePath(mailDto.getAttachmentFilePath());
        homePage.waitForAjaxRequestsComplete();
        homePage.waitForDocumentReady();
        homePage.getNewMailWidget().getSendButton().click();
    }
}
