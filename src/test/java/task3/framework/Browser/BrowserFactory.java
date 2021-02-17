package task3.framework.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import task3.utils.ConfigFileReader;

public class BrowserFactory {

    private static ConfigFileReader config = ConfigFileReader.configFileReader;

    public static WebDriver getDriver(String nameBrowser) {
        System.setProperty(config.getDriverAdapter(), config.getDriverPath());
        switch (nameBrowser.toUpperCase()) {
            case "CHROME":
                return new ChromeDriver();
            case "FIREFOX":
                return new FirefoxDriver();
            default:
                throw new RuntimeException("Invalid browser name");
        }
    }
}
