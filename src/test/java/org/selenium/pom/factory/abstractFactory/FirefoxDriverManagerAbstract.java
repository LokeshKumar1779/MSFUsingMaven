package org.selenium.pom.factory.abstractFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.pom.factory.DriverManager;

public class FirefoxDriverManagerAbstract extends DriverManagerAbstract {

    @Override
    protected WebDriver startDriver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
