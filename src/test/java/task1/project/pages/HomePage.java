package task1.project.pages;

import org.openqa.selenium.*;
import task1.framework.BasePage;
import task1.framework.elements.Button;
import task1.utils.Logger;

public class HomePage extends BasePage {

    private String result = "/html/body/pre";
    private Button button;

    public HomePage() {
        button = new Button();
    }

    public String getText() {
        String text = button.findElement(By.xpath(result)).getText();
        Logger.LOGGER.info("text: " + text);
        return text;
    }
}
