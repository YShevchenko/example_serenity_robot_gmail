package com.example.taf.pages;

import com.example.taf.widgets.NewMailWidget;
import com.example.taf.widgets.SearchWidget;
import com.example.taf.widgets.SideWidget;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = ".//div[@class='oo']")
    private SideWidget sideWidget;

    @FindBy(xpath = ".//table[@class='aoP aoC']")
    private NewMailWidget newMailWidget;

    @FindBy(xpath = ".//div[@role='search']")
    private SearchWidget searchWidget;

    @FindBy(xpath = ".//div[@role='main']")
    private WebElementFacade mailSearchResult;

    @FindBy(xpath = ".//a[@data-tooltip-align='t,c']")
    private WebElementFacade openAttachmentLink;

    @FindBy(xpath = ".//div[@role='document']")
    private WebElementFacade attachmentText;

    public SideWidget getSideWidget() {
        return sideWidget;
    }

    public NewMailWidget getNewMailWidget() {
        return newMailWidget;
    }

    public WebElementFacade getMailSearchResult() {
        return mailSearchResult;
    }

    public WebElementFacade getOpenAttachmentLink() {
        return openAttachmentLink;
    }

    public WebElementFacade getAttachmentText() {
        return attachmentText;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }
}
