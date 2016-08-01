package com.example.taf.widgets.impl;

import com.example.taf.utils.WebDriverUtils;
import com.example.taf.widgets.NewMailWidget;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class NewMailWidgetImpl extends AbstractWidgetImpl implements NewMailWidget {

    private final static String ATTACH_FILE = ".//div[@data-tooltip = 'Attach files']";

    @FindBy(xpath = ".//input[@name='subjectbox']")
    private WebElementFacade subjectInput;

    @FindBy(xpath = ".//textarea[@name='to']")
    private WebElementFacade recipientEmailInput;

    @FindBy(xpath = ".//div[@aria-label='Message Body']")
    private WebElementFacade messageBody;

    @FindBy(xpath = ".//div[contains(@data-tooltip,'Send')]")
    private WebElementFacade sendButton;

    public NewMailWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                             final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public NewMailWidgetImpl(final PageObject page, final ElementLocator locator,
                             final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    public WebElementFacade getSubjectInput() {
        return subjectInput;
    }

    public WebElementFacade getRecipientEmailInput() {
        return recipientEmailInput;
    }

    public WebElementFacade getMessageBody() {
        return messageBody;
    }

    public WebElementFacade getSendButton() {
        return sendButton;
    }

    public WebElement getAttachFilesButton() {
        return WebDriverUtils.getWebDriver().findElement(By.xpath(ATTACH_FILE));
    }
}
