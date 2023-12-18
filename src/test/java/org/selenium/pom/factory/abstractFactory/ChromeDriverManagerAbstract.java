package org.selenium.pom.factory.abstractFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManagerAbstract extends DriverManagerAbstract {

    @Override
    protected WebDriver startDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
