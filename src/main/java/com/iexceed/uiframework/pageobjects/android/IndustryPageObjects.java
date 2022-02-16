package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IndustryPageObjects extends TestBase {

        GenericMethods genericMethods;
        private final WaitUtility waitUtility;
        private static final Logger log = LogManager.getLogger(IndustryPageObjects.class);
        AndroidUtility androidUtility;

    public IndustryPageObjects() {
            genericMethods = new GenericMethods(driver);
            waitUtility = new WaitUtility();
            androidUtility = new AndroidUtility();
        }

        By addIndustry = By.xpath("//android.view.View[@content-desc='Add a new industry']");
        By addIndustryArabic = By.xpath("//android.view.View[@content-desc='أضف صناعة جديدة']");
        By typeOfIndus = By.xpath("//android.widget.EditText[@text='Primary']");
        By typeOfIndus2 = By.xpath("//android.widget.EditText[@text='Secondary']");
        By viewField = By.xpath("//android.view.View");
        By sectionDD = By.xpath("//android.view.View[@content-desc='Section']");
        By sectionDDArabic = By.xpath("//android.view.View[@content-desc='الجزء']");
        By searchBox = By.xpath("//android.widget.EditText");
        By divisionDD = By.xpath("//android.view.View[@content-desc='Division']");
        By divDDArabic = By.xpath("//android.view.View[@content-desc='قسم']");
        By groupDD = By.xpath("//android.view.View[@content-desc='Group']");
        By groupDDArabic = By.xpath("//android.view.View[@content-desc='مجموعة']");
        By classDD = By.xpath("//android.view.View[@content-desc='Class']");
        By classDDArabic = By.xpath("//android.view.View[@content-desc='فصل']");
        By industryMenu = By.xpath("//android.view.View[@text='Industry']");
        By closBtn = By.xpath("//*[@text='Close']");
        By closBtnArabic = By.xpath("//android.view.View[@text='قريب']");
        By industryEditMsg=By.xpath("//*[@text='Edit ! Industry edited successfully']");
        By industryEditMsgArabic=By.xpath("//android.view.View[@text='تعديل ! تمت إضافة الصناعة بنجاح']");


        public void selectIndustryPage() throws Exception {
            androidUtility.swipingHamburgerMenu();
            genericMethods.click(industryMenu);
        }
        public void isIndustryPage() throws Exception {
            waitUtility.waitForSeconds(2);
            Boolean b = genericMethods.isElementPresent(addIndustry);
            if (Boolean.TRUE.equals(b)) {
                log.debug("user in industry page");
            } else {
                genericMethods.isElementPresent(addIndustryArabic);
            }
        }

        public void clickAddIndustryBtn() throws Exception {
            waitUtility.waitForSeconds(2);
            Boolean b = genericMethods.isElementPresent(addIndustry);
            if (Boolean.TRUE.equals(b)) {
                genericMethods.click(addIndustry);
            } else {
                genericMethods.click(addIndustryArabic);
            }
        }

        public void isAddIndusScreen() throws Exception {
            waitUtility.waitForSeconds(3);
            try {
                Boolean b = genericMethods.isElementPresent(sectionDD);
                if (Boolean.TRUE.equals(b)) {
                    log.debug("user in add industry page");
                } else {
                    genericMethods.isElementPresent(sectionDDArabic);
                    log.debug("user in ass industry page");
                }
            }catch(Exception e){
                log.debug(e);
            }
        }

        public void selectTypeOfIndustry(String industry) throws InterruptedException {
            Boolean b = genericMethods.isElementPresent(typeOfIndus);
                        if (Boolean.TRUE.equals(b)) {
                genericMethods.click(typeOfIndus);
            } else {
                genericMethods.click(typeOfIndus2);
            }
                    List<WebElement> tempIndustryList1 = driver.findElements(viewField);
                    androidUtility.selectionOfDropdown(industry, tempIndustryList1);
                    }

        public void chooseSection(String section) throws Exception {
            waitUtility.waitForSeconds(2);
            Boolean b = genericMethods.isElementPresent(sectionDD);
            if (Boolean.TRUE.equals(b)) {
                genericMethods.click(sectionDD);
            } else {
                genericMethods.click(sectionDDArabic);
            }
            waitUtility.waitForSeconds(1);
            genericMethods.click(searchBox);
            genericMethods.sendKeys(searchBox, section);
            log.info(driver.findElements(viewField).size());
            List<WebElement> tempSectionList = driver.findElements(viewField);
            androidUtility.selectionOfDropdown(section, tempSectionList);
        }

        public void chooseDivision(String division) throws Exception {
            Boolean b = genericMethods.isElementPresent(divisionDD);
            if (Boolean.TRUE.equals(b)) {
                genericMethods.click(divisionDD);
            } else {
                genericMethods.click(divDDArabic);
            }
            waitUtility.waitForSeconds(1);
            genericMethods.click(searchBox);
            genericMethods.sendKeys(searchBox, division);
            log.info(driver.findElements(viewField).size());
            List<WebElement> tempDivisionList = driver.findElements(viewField);
            androidUtility.selectionOfDropdown(division, tempDivisionList);
        }

        public void chooseGroup(String group) throws Exception {
            Boolean b = genericMethods.isElementPresent(groupDD);
            if (Boolean.TRUE.equals(b)) {
                genericMethods.click(groupDD);
            } else {
                genericMethods.click(groupDDArabic);
            }
            waitUtility.waitForSeconds(1);
            genericMethods.click(searchBox);
            genericMethods.sendKeys(searchBox, group);
            log.info(driver.findElements(viewField).size());
            List<WebElement> tempGroupList = driver.findElements(viewField);
            androidUtility.selectionOfDropdown(group, tempGroupList);
        }

        public void chooseClass(String Class,String type) throws Exception {
            Boolean b = genericMethods.isElementPresent(classDD);
            if (Boolean.TRUE.equals(b)) {
                genericMethods.click(classDD);
            } else {
                genericMethods.click(classDDArabic);
            }
            waitUtility.waitForSeconds(1);
            genericMethods.click(searchBox);
            try {
                if (type.equalsIgnoreCase("edit")) {
                    genericMethods.sendKeys(searchBox, "Marine aquaculture");
                    log.info(driver.findElements(viewField).size());
                    List<WebElement> tempClassList = driver.findElements(viewField);
                    androidUtility.selectionOfDropdown("Marine aquaculture", tempClassList);
                } else {
                    genericMethods.sendKeys(searchBox, Class);
                    log.info(driver.findElements(viewField).size());
                    List<WebElement> tempClassList = driver.findElements(viewField);
                    androidUtility.selectionOfDropdown(Class, tempClassList);
                }
            }catch(Exception e){
                log.debug(e);
            }


        }

        public void validateEnteredDetails(String TypeofIndustry, String Section, String Division, String Group, String Class) throws Exception {
            try {
                isEditIndustryMsgPresent();
            }catch(Exception e){
              log.debug(e);
            }
            genericMethods.waitForVisibility(viewField);
            log.info(driver.findElements(viewField).size());
            List<WebElement> tempDetails = driver.findElements(viewField);
            androidUtility.selectionItemVisible(TypeofIndustry, tempDetails);
            androidUtility.selectionItemVisible(Section, tempDetails);
            androidUtility.selectionItemVisible(Division, tempDetails);
            androidUtility.selectionItemVisible(Group, tempDetails);
            androidUtility.selectionItemVisible(Class, tempDetails);

        }

        public void isEditIndustryMsgPresent() throws Exception {
            waitUtility.waitForSeconds(2);
            Boolean b = genericMethods.isElementPresent(industryEditMsg);
            Boolean b1 = genericMethods.isElementPresent(industryEditMsgArabic);
            if (Boolean.TRUE.equals(b)) {
                genericMethods.isElementPresent(industryEditMsg);
                genericMethods.click(closBtn);
            } else if (Boolean.TRUE.equals(b1)) {
                genericMethods.isElementPresent(industryEditMsgArabic);
                genericMethods.click(closBtnArabic);
            } else {
                try {
                    genericMethods.click(closBtn);
                } catch (Exception e) {
                    genericMethods.click(closBtnArabic);
                }
            }

        }

    }
