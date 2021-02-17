package task3.project.pages;

import org.openqa.selenium.*;
import task3.framework.BasePage;
import task3.framework.elements.Cookies;
import task3.utils.Logger;

public class HomePage extends BasePage {
    private String nameCookie1 ="example_key_1";
    private String nameCookie2 ="example_key_2";
    private String nameCookie3 ="example_key_3";
    private String valueCookie1 ="example_value_1";
    private String valueCookie2 ="example_value_2";
    private String valueCookie3 ="example_value_3";
    Cookies cookies;

    public HomePage() {
        cookies = new Cookies();
    }

    public int getAmountCookie(){
        return cookies.getCookies().size();
    }

    public void addThreeCoolies(){
        addCookie(nameCookie1,valueCookie1);
        addCookie(nameCookie2,valueCookie2);
        addCookie(nameCookie3,valueCookie3);
    }

    public void addCookie(String name, String value) {
       cookies.addCookie(new Cookie(name, value));
    }

    public boolean deleteCookie(String name) {
        if (isExistsCookie(name)) {
            cookies.deleteCookie(findCookie(name));
            return true;
        }
        Logger.LOGGER.info("cookie has not been deleted");
        return false;
    }

    public boolean isExistsCookie(String name) {
        return findCookie(name) != null;
    }

    public String getValue(String name){
        if (isExistsCookie(name)){
            org.openqa.selenium.Cookie cookie = findCookie(name);
            return cookie.getValue();
        }else {
            return null;
        }
    }

    private Cookie findCookie(String name) {
        for (org.openqa.selenium.Cookie cookie : cookies.getCookies()) {
            if (cookie.getName().equals(name)) {
                return cookie;
            }
        }
        return null;
    }
    public void deleteAllCookies(){
        cookies.deleteAllCookies();
    }

    public void setValue(String name,String newValue) {
        org.openqa.selenium.Cookie cookie = cookies.getCookieNamed(name);
        if (deleteCookie(name)){
            cookies.addCookie(new Cookie(cookie.getName(),
                    newValue, cookie.getDomain(),
                    cookie.getPath(),cookie.getExpiry(),cookie.isSecure(),
                    cookie.isHttpOnly(), cookie.getSameSite()));
        }else {
            Logger.LOGGER.info("value has not been changed");
        }
    }

}
