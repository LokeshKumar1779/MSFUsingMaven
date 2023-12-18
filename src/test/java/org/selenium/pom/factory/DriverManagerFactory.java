package org.selenium.pom.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.pom.constants.DriverType;

public class DriverManagerFactory {
    public static DriverManager getManager(DriverType driverType) {
        switch (driverType) {
            case CHROME -> {
                return new ChromeDriverManager();
            }
            case FIREFOX -> {
                return new FirefoxDriverManager();
            }
            case SAFARI -> {
                return new SafariDriverManager();
            }
            default -> throw new IllegalStateException("Invalid browser type : " + driverType);

        }
    }
}