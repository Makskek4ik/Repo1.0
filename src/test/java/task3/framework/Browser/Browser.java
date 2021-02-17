package task3.framework.Browser;

import org.openqa.selenium.WebDriver;
import task3.utils.ConfigFileReader;

public class Browser {

    private WebDriver driver;

    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    public static final Browser INSTANCE  = new Browser();

    private Browser() {
        driver = BrowserFactory.getDriver(config.getBrowserName());
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void openPage() {
        driver.get(config.getApplicationUrl());
    }

    public void quitBrowser() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
