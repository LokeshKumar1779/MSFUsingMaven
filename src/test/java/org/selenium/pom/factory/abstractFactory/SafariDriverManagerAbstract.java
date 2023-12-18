package org.selenium.pom.factory.abstractFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverManagerAbstract extends DriverManagerAbstract {

    @Override
    protected WebDriver startDriver() {
        driver = new SafariDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
