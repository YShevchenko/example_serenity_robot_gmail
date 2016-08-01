package com.example.taf.dto;

public class MailDto {

    private String recipientEmail;
    private String subject;
    private String message;
    private String attachmentFilePath;

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(final String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getAttachmentFilePath() {
        return attachmentFilePath;
    }

    public void setAttachmentFilePath(final String attachmentFilePath) {
        this.attachmentFilePath = attachmentFilePath;
    }
}
