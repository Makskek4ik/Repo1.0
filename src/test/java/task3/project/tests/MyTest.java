package task3.project.tests;

import org.testng.annotations.Test;
import task3.framework.BaseTest;
import task3.project.pages.HomePage;
import task3.utils.Logger;

import static org.testng.Assert.*;

public class MyTest extends BaseTest {

    @Test
    public void Test1() {
        try {
            HomePage homePage = new HomePage();
            assertEquals(homePage.getCurrentURL(),"http://example.com/","Site form did not open");//1
            homePage.addThreeCoolies();
            assertEquals(homePage.getAmountCookie(),3,
                    "wrong number of cookies ");//2
            homePage.deleteCookie("example_key_1");
            assertFalse(homePage.isExistsCookie("example_key_1"),
                    "cookie exists, but it shouldn't exist");//3
            homePage.setValue("example_key_3","example_value_300");
            assertEquals(homePage.getValue("example_key_3"),"example_value_300",
                    "value has not been changed");//4
            homePage.deleteAllCookies();
            assertEquals(homePage.getAmountCookie(),0,
                    "not all cookies have been deleted");//5
        }catch (Exception e){
            Logger.LOGGER.error(e.getMessage());
        }
    }
}