package com.iexceed.uiframework.domainobjects;

import com.iexceed.uiframework.appium.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IOSUtility {

    GenericMethods genericMethods;
    By keyboardDone = By.xpath("//*[@label='Done']");


    public IOSUtility() {
        genericMethods = genericMethods;
    }

    public void scrollToElement(By elm) {
        RemoteWebElement element = (RemoteWebElement) driver.findElement(elm);
//        String elementID = element.getId();
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("element", elementID); // Only for ‘scroll in element’
//        scrollObject.put("direction", "up");
//        driver.executeScript("mobile:scroll", scrollObject);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Object> params = new HashMap<>();
        params.put("direction", "down");
        params.put("velocity", 2500);
//        params.put("element", elementID);
        js.executeScript("mobile: swipe", params);

    }

    public void scrollUp() {
//        RemoteWebElement element = (RemoteWebElement)driver.findElement(nxtPageArrow);
//        String elementID = element.getId();
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("element", elementID); // Only for ‘scroll in element’
//        scrollObject.put("direction", "up");
//        driver.executeScript("mobile:scroll", scrollObject);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Object> params = new HashMap<>();
        params.put("direction", "up");
        params.put("velocity", 2500);
//        params.put("element", elementID);
        js.executeScript("mobile: swipe", params);
    }

    public void selectionOfDropdown(String itemType, List<WebElement> type) {
        for (WebElement name : type) {
            if ((name.getText()).contains(itemType)) {
                name.click();
                break;
            }
        }
    }

    public void hideKeyboard() {
        List<WebElement> done = driver.findElements(keyboardDone);
        done.get(0).click();
    }
}
