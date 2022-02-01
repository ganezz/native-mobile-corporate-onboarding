package com.iexceed.uiframework.domainobjects;

import com.iexceed.uiframework.appium.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IOSUtility {

    GenericMethods genericMethods;



    public IOSUtility() {
       genericMethods = genericMethods;

    }
    public void scrollToElement(By elm) {

        RemoteWebElement element = (RemoteWebElement)driver.findElement(elm);
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


}
