package task1.framework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Button extends BaseElement {

    public Button() {
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public void findAndClick(By by) {
        findElement(by).click();
    }

    public void findAndClickWait(By by, By waitElement) {
        findElementWait(by, waitElement).click();
    }

}
