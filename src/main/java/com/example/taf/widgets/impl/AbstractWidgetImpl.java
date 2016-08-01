package com.example.taf.widgets.impl;

import com.example.taf.widgets.AbstractWidget;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public abstract class AbstractWidgetImpl extends WidgetObjectImpl implements AbstractWidget {

    public AbstractWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                              final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public AbstractWidgetImpl(final PageObject page, final ElementLocator locator, final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }
}
