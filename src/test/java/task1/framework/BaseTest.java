package task1.framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import task1.framework.Browser.Browser;

public class BaseTest {

    private static Browser browser = Browser.INSTANCE;

    @BeforeMethod
    public void setUp() {
        browser.maximizeWindow();
        browser.openPage();

    }

    @AfterMethod
    public void tearDown(){
        browser.quitBrowser();
    }
}
