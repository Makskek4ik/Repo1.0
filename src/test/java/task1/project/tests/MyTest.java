package task1.project.tests;

import org.testng.annotations.Test;
import task1.framework.BaseTest;
import task1.project.pages.HomePage;
import task1.utils.Logger;

import static org.testng.Assert.assertEquals;

public class MyTest extends BaseTest {

    @Test()
    public void Test1() {
        try {
            HomePage homePage = new HomePage();
            assertEquals(homePage.getText(), "{\n" +
                            "  \"authenticated\": true, \n" +
                            "  \"user\": \"user\"\n" +
                            "}",
                    "different expected and final result");//1
        } catch (Exception e) {
            Logger.LOGGER.error(e.getMessage());
        }
    }
}