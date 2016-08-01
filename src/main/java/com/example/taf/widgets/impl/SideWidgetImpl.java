package com.example.taf.widgets.impl;

import com.example.taf.widgets.SideWidget;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class SideWidgetImpl extends AbstractWidgetImpl implements SideWidget {

    @FindBy(xpath = ".//div[text()='COMPOSE']")
    private WebElementFacade composeButton;

    public SideWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                          final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public SideWidgetImpl(final PageObject page, final ElementLocator locator,
                          final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    public WebElementFacade getComposeButton() {
        return composeButton;
    }

}
