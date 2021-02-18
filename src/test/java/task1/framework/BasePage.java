package task1.framework;

import task1.framework.Browser.Browser;

public abstract class BasePage {

    private Browser browser = Browser.INSTANCE;

    public BasePage() {
    }

    public void getURL(){
        browser.getURL();
    }
}
