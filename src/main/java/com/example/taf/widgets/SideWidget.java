package com.example.taf.widgets;

import com.example.taf.widgets.impl.SideWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;

@ImplementedBy(SideWidgetImpl.class)
public interface SideWidget extends AbstractWidget {

    public WebElementFacade getComposeButton();

}
