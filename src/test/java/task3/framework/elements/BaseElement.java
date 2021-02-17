package task3.framework.elements;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import task3.framework.Browser.Browser;
import task3.utils.ConfigFileReader;
import task3.utils.Logger;

public abstract class BaseElement {

    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    public WebDriver driver;
    public WebDriverWait wait;

    public BaseElement() {
        this.driver = Browser.INSTANCE.getDriver();
        this.wait = new WebDriverWait(driver, config.getTimeWait());
    }

    public WebElement findElement(By by) {
        WebElement result = null;
        try {
            result = driver.findElement(by);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.LOGGER.error(e);
        }
        return result;
    }

    public void wait(By waitElement) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(waitElement));
        } catch (TimeoutException e) {
            Logger.LOGGER.error(e);
        }
    }

    public WebElement findElementWait(By element, By waitElement) {
        WebElement result = findElement(element);
        wait(waitElement);
        return result;
    }
}
