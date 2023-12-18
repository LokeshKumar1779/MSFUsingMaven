package org.selenium.pom.factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.selenium.pom.constants.DriverType;

public class DriverManagerOriginal {
    public WebDriver initializeDriver(String browserName) {
        WebDriver driver;
//        String browserName = browser;
//        System.out.println("browser Name : "+browserName);

//        String browserName = "CHROME";
        switch (DriverType.valueOf(browserName)){
            case CHROME:
                driver = new ChromeDriver();
                break;
            case SAFARI:
                driver = new SafariDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("INVALID BROWSER NAME : " +browserName);
        }

        driver.manage().window().maximize();
        return driver;
    }
}
