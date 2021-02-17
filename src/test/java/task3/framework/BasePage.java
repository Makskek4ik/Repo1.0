package task3.framework;

import task3.framework.Browser.Browser;

public abstract class BasePage {

    private Browser browser = Browser.INSTANCE;

    public BasePage() {
    }

    public String getCurrentURL(){
        return browser.getURL();
    }
}
