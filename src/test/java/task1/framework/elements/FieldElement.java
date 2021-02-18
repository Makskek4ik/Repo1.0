package task1.framework.elements;

import org.openqa.selenium.By;

public class FieldElement extends BaseElement {

    public FieldElement() {

    }

    public void findElementAndSendKeys(By element,String keys){
        findElement(element).sendKeys(keys);
    }

    public void findElementAndClear(By element){
        findElement(element).clear();
    }

}
