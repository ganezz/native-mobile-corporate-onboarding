package com.iexceed.uiframework.domainobjects;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.pageobjects.ios.IosEntityDetailsPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IOSUtility {
    private static final Logger log = LogManager.getLogger(IosEntityDetailsPageObjects.class);
    GenericMethods genericMethods;
    private String stringmsg;
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
    public void clearText(By element) {
        driver.findElement(element).clear();
    }

    public void hideKeyboard() {
        List<WebElement> done = driver.findElements(keyboardDone);
        done.get(0).click();
    }

    public int characterCount(String username) {
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) != ' ')
                count++;
        }
        return count;
    }

    public void selectionItemVisible(String itemType, List<WebElement> type) {
        for (WebElement name : type) {
            if (name.isDisplayed()) {
                if ((name.getText()).contains(itemType)) {
                    log.info(name.isDisplayed());
                    stringmsg = String.format(" %s", itemType);
                    log.debug("User details is visible {}", stringmsg);
                    break;
                }
            } else {

                log.debug("User details is not visible {}", stringmsg);

            }
        }
    }
}
