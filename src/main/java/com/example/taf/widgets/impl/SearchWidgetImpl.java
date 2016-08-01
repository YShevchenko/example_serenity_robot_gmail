package com.example.taf.widgets.impl;

import com.example.taf.widgets.SearchWidget;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class SearchWidgetImpl extends AbstractWidgetImpl implements SearchWidget {

    @FindBy(xpath = ".//input[@aria-label='Search']")
    private WebElementFacade searchInput;

    @FindBy(xpath = ".//button[@aria-label='Search Gmail']")
    private WebElementFacade searchButton;

    public SearchWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                             final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public SearchWidgetImpl(final PageObject page, final ElementLocator locator,
                             final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    public WebElementFacade getSearchInput() {
        return searchInput;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }
}
