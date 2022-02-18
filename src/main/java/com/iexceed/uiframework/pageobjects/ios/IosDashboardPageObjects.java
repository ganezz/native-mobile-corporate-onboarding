package com.iexceed.uiframework.pageobjects.ios;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.domainobjects.IOSUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IosDashboardPageObjects extends TestBase {

    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(IosDashboardPageObjects.class);
    AndroidUtility androidUtility;
    IOSUtility iosUtility;

    public IosDashboardPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
        iosUtility = new IOSUtility();
    }


    By addNewAppliBtn = By.xpath("//XCUIElementTypeButton[@name='New Application Button']");
    By addNewAppliBtnArabic = By.xpath("//XCUIElementTypeButton[@name='New Application Button']");
    By myApplicationTab = By.xpath("//XCUIElementTypeOther[@name='My Application Button']");
    By myApplicationTabArabic = By.xpath("//XCUIElementTypeOther[@name='My Application Button']");
    By unClaimApplicationTab = By.xpath("//XCUIElementTypeOther[@name='Unclaimed Application Button']");
    By unClaimApplicationTabArabic = By.xpath("//XCUIElementTypeOther[@name='Unclaimed Application Button']");
    By completedApplicationTab = By.xpath("//XCUIElementTypeOther[@name='Completed Application Button']");
    By completedApplicationTabArabic = By.xpath("//XCUIElementTypeOther[@name='Completed Application Button']");
    By activeApplicationTab = By.xpath("//XCUIElementTypeOther[@name='Active Application Button']");
    By activeApplicationTabArabic = By.xpath("//XCUIElementTypeOther[@name='Active Application Button']");
    By searchBox = By.xpath("//XCUIElementTypeTextField[@name='SearchTextField']");
    By nxtPageArrow = By.xpath("//XCUIElementTypeButton[@name='Next Button']");
    By previousPageArrow = By.xpath("//XCUIElementTypeButton[@name='Previous Button']");
    By lastPageArrow = By.xpath("//XCUIElementTypeButton[@name='End Button']");
    By firstPageArrow = By.xpath("//XCUIElementTypeButton[@name='Start Button']");
    By nxtPageArabicArrow = By.xpath("//XCUIElementTypeButton[@name='Next Button']");
    By previousPageArabicArrow = By.xpath("//XCUIElementTypeButton[@name='Previous Button']");
    By lastPageArabicArrow = By.xpath("//XCUIElementTypeButton[@name='End Button']");
    By firstPageArabicArrow = By.xpath("//XCUIElementTypeButton[@name='Start Button']");


    public void ios_nextPage() throws Exception {
        ios_isMyapplication();
        ios_isScrollTill10ApplicationList();
        Boolean b = genericMethods.isElementPresent(nxtPageArrow);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(nxtPageArrow);
        } else {
            genericMethods.click(nxtPageArabicArrow);
        }
        waitUtility.waitForSeconds(1);
    }

    public void ios_previousPageArrow() throws Exception {
        Boolean b = genericMethods.isElementPresent(previousPageArrow);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(previousPageArrow);
        } else {
            genericMethods.click(previousPageArabicArrow);
        }
        waitUtility.waitForSeconds(1);
    }

    public void ios_lastPage() throws Exception {
        ios_nextPage();
        Boolean b = genericMethods.isElementPresent(lastPageArrow);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(lastPageArrow);
        } else {
            genericMethods.click(lastPageArabicArrow);
        }
        waitUtility.waitForSeconds(1);
    }

    public void ios_firstPage() throws Exception {

        Boolean b = genericMethods.isElementPresent(firstPageArrow);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(firstPageArrow);
        } else {
            genericMethods.click(firstPageArabicArrow);
        }
        waitUtility.waitForSeconds(1);
    }


    public void ios_isDashboardPage() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(addNewAppliBtn);
        Boolean b1 = genericMethods.isElementPresent(addNewAppliBtnArabic);
        if (Boolean.TRUE.equals(b)) {
            log.info("user in dashboardPage");
        } else if (Boolean.TRUE.equals(b1)) {
            log.info("user in dashboardPage");
        }

    }

    public void ios_isMyapplication() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(myApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(myApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(myApplicationTab));
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(myApplicationTabArabic));
        } else {
            log.debug("myapplication tab not visible");
        }
    }

    public void ios_isUnclaimedApplicaion() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(unClaimApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(unClaimApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(unClaimApplicationTab));
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(unClaimApplicationTabArabic));
        } else {
            log.debug("unclaimed application tab is not visible");
        }
    }

    public void ios_isCompletedApplicaion() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(completedApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(completedApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(completedApplicationTab));
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(completedApplicationTabArabic));
        } else {
            log.debug("completed application tab is not visible");
        }
    }

    public void ios_isActiveApplicaion() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(activeApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(activeApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(activeApplicationTab));
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(activeApplicationTabArabic));
        } else {
            log.debug("active application tab is not visible");
        }
    }

    public void ios_isScrollTill10ApplicationList() throws Exception {
        waitUtility.waitForSeconds(2);
        iosUtility.scrollUp();
    }

    public void ios_isActive10ApplicationPresent() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(activeApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(activeApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(activeApplicationTab));
            genericMethods.click(activeApplicationTab);
            waitUtility.waitForSeconds(2);
            iosUtility.scrollUp();

        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(activeApplicationTabArabic));
            genericMethods.click(activeApplicationTabArabic);
            waitUtility.waitForSeconds(2);
            iosUtility.scrollUp();
        } else {
            log.debug("Active application tab is not visible");
        }
    }

    public void ios_isComplete10ApplicationPresent() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(completedApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(completedApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(completedApplicationTab));
            genericMethods.click(completedApplicationTab);
            waitUtility.waitForSeconds(2);
            iosUtility.scrollUp();
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(completedApplicationTabArabic));
            genericMethods.click(completedApplicationTabArabic);
            waitUtility.waitForSeconds(2);
            iosUtility.scrollUp();
        } else {
            log.debug("Ccompleted application tab is not visible");
        }
    }


    public void ios_isUnclaimed10ApplicationPresent() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(unClaimApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(unClaimApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(unClaimApplicationTab));
            genericMethods.click(unClaimApplicationTab);
            waitUtility.waitForSeconds(2);
            iosUtility.scrollUp();
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(unClaimApplicationTabArabic));
            genericMethods.click(unClaimApplicationTabArabic);
            waitUtility.waitForSeconds(2);
            iosUtility.scrollUp();
        } else {
            log.debug("unclaimed application tab is not visible");
        }
    }

    public void ios_searchValidation() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(searchBox);

        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(searchBox);
            genericMethods.sendKeys(searchBox, "CPOB3087");
        } else {
            log.debug("not able to search ");
        }
    }


}
