package com.example.taf.widgets;


import com.example.taf.widgets.impl.SearchWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;

@ImplementedBy(SearchWidgetImpl.class)
public interface SearchWidget extends AbstractWidget {

    public WebElementFacade getSearchInput();

    public WebElementFacade getSearchButton();
}
