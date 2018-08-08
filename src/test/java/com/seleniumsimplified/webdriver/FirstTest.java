package com.seleniumsimplified.webdriver;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static junit.framework.Assert.assertTrue;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest

{
    @Test
    public void driverIsTheKing()
    {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("https://compendiumdev.co.uk/selenium/");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }

    @Test
    public void fireFoxWebDriver()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://compendiumdev.co.uk/selenium/");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }
}
