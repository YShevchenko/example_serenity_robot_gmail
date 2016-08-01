package com.example.taf.pages;

import com.example.taf.utils.WaitUtils;
import net.serenitybdd.core.pages.PageObject;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

public class AbstractPage extends PageObject {

    private static final Long AJAX_TIMEOUT = 10000L;

    public void waitForAjaxRequestsComplete() {
        WaitUtils
                .doWait()
                .atMost(AJAX_TIMEOUT, MILLISECONDS)
                .with()
                .pollInterval(1, SECONDS)
                .until(() -> (Boolean) getJavascriptExecutorFacade().executeScript(
                        "return typeof(jQuery) == 'function' ? (jQuery.active == 0) : true"));
    }

    public void waitForDocumentReady() {
        WaitUtils
                .doWait()
                .atMost(AJAX_TIMEOUT, MILLISECONDS)
                .with()
                .pollInterval(1, SECONDS)
                .until(() -> (Boolean) getJavascriptExecutorFacade().executeScript(
                        "return document.readyState == 'complete'"));
    }
}
