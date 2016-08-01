package com.example.taf.utils;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils {

    private WebDriverUtils() {
    }

    public static void maximizeWindow() {
        getWebDriver().manage().window().maximize();
    }

    public static void clearCookies() {
        getWebDriver().manage().deleteAllCookies();
    }

    public static WebDriver getWebDriver() {
        return ThucydidesWebDriverSupport.getDriver();
    }
}
