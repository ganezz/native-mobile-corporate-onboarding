package com.iexceed.uiframework.domainobjects;

import com.iexceed.uiframework.appium.GenericMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;


public class AndroidUtility {

    GenericMethods genericMethods;
    private static final Logger log = LogManager.getLogger(AndroidUtility.class);
    private String stringmsg;

    public AndroidUtility() {
        genericMethods = new GenericMethods(driver);
    }

    By okBtn = By.xpath("//*[@text='OK']");
    By cancelBtn = By.xpath("//*[@text='Cancel']");
    By cancelBtn1 = By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]");

    public int characterCount(String username) {
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) != ' ')
                count++;
        }
        return count;
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

    public void selectionItemVisible(String itemType, List<WebElement> type) {
        for (WebElement name : type) {
            if (name.isDisplayed()) {
                if ((name.getText()).contains(itemType)) {
                    log.info(name.isDisplayed());
                    stringmsg=String.format(" %s",itemType);
                    log.debug("User details is visible {}",stringmsg);
                    break;
                }
            } else {

                log.debug("User details is not visible {}",stringmsg);

            }
        }
    }

    public void msgConfirmation(String btn) {
        if (btn.equalsIgnoreCase("OK")) {
            genericMethods.click(okBtn);
        } else {
            try {
                genericMethods.back();

            } catch (Exception e) {
                genericMethods.click(cancelBtn);
            }
        }
    }


}
