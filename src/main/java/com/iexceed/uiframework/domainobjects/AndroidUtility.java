package com.iexceed.uiframework.domainobjects;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
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
    WaitUtility waitUtility;

    public AndroidUtility() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
    }

    By hamBurgerMenu = By.xpath("//android.widget.ImageView[@content-desc='HAMBURGER_ICON']");
    By businessLogicMenu = By.xpath("//*[@text='Business Location']");
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

    public void swipingHamburgerMenu() throws Exception {
        waitUtility.waitForSeconds(4);
        genericMethods.click(hamBurgerMenu);
        Boolean b = genericMethods.isElementPresent(businessLogicMenu);
        if (Boolean.TRUE.equals(b)) {
            log.debug("menu is swipped");

        }
    }

    public void clearText(By element) {
        driver.findElement(element).clear();
    }

    public void selectionItemVisible(String itemType, List<WebElement> type) throws Exception {
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


    public void hideKeyBoard(){
        try{
           driver.hideKeyboard();
        }catch(Exception e){
            log.debug(e);
        }
    }

    public Boolean selectionCalenderDropdown1(String itemType, List<WebElement> type) {
        Boolean res = false;
        for (WebElement name : type) {
            if (name.getText().contains(itemType)) {
                System.out.println(name.getText());
                name.click();
                res = true;
                break;
            }
        }
        return res;
    }

}
