package com.example.taf.widgets;

import com.example.taf.widgets.impl.NewMailWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

@ImplementedBy(NewMailWidgetImpl.class)
public interface NewMailWidget extends AbstractWidget {

    public WebElementFacade getSubjectInput();

    public WebElementFacade getRecipientEmailInput();

    public WebElementFacade getMessageBody();

    public WebElementFacade getSendButton();

    public WebElement getAttachFilesButton();
}
