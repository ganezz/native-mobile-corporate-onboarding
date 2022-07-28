package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.implementations.CommonDriver;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.iexceed.uiframework.broweser.testCheck1.Driver;
import static com.iexceed.uiframework.broweser.testCheck1.androidConnection;


public class check1 extends TestBase {

    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(check1.class);
    AndroidUtility androidUtility;

    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;


    public check1() {
        androidConnection();
        PageFactory.initElements(Driver, this);
        genericMethods = new GenericMethods(Driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(Driver);
        textBoxControls = new TextBoxControls();
    }


    @FindBy(xpath = "//android.widget.EditText")
    WebElement textField;
    @FindBy(xpath = "//android.view.View[@text='English']")
    WebElement englishBtn;


    public void isHomePageVisible() throws Exception {
        waitUtility.waitForSeconds(7);
        Boolean b1 = commonElements.isElementVisible(textField);
        if (Boolean.TRUE.equals(b1)) {
            log.info("user in home page");
        } else {
            log.debug("home page is not launched");
        }
    }


}
