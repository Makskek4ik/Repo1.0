package task3.framework.elements;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import task3.framework.Browser.Browser;

import java.util.Set;

public class Cookies {
    private WebDriver driver;

    public Cookies(){
        driver = Browser.INSTANCE.getDriver();
    }

    public Set<Cookie> getCookies(){
        return driver.manage().getCookies();
    }

    public void addCookie(Cookie cookie) {
        driver.manage().addCookie(cookie);
    }

    public void deleteCookie(Cookie cookie) {
        driver.manage().deleteCookie(cookie);
    }

    public Cookie getCookieNamed(String name){
        return driver.manage().getCookieNamed(name);
    }

    public void deleteAllCookies(){
        driver.manage().deleteAllCookies();
    }

}
