package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.IndustryPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IndustryPageActions {
    public String platForm;
    IndustryPageObjects industryPageObjects = new IndustryPageObjects();
    private static final Logger log = LogManager.getLogger(IndustryPageActions.class);


    public IndustryPageActions(String platform) {
        this.platForm = platform;

    }

    public void isIndustryPage() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.selectIndustryPage();
        }
    }


    public void industryPAge() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.isIndustryPage();
        }
    }

    public void clickAddIndustryBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.clickAddIndustryBtn();
        }
    }

    public void isAddIndustryPage() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.isAddIndusScreen();
        }
    }

    public void selectIndustryType(String industry) throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.selectTypeOfIndustry(industry);
        }
    }

    public void selectSection(String section) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.chooseSection(section);
        }
    }

    public void selectDivision(String division) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.chooseDivision(division);
        }
    }

    public void selectGroup(String group) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.chooseGroup(group);
        }
    }

    public void selectClass(String Class,String type) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.chooseClass(Class,type);
        }
    }
    public void validateEnteredDetails(String TypeofIndustry,String Section,String Division,String Group,String Class) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.validateEnteredDetails(TypeofIndustry,Section,Division,Group,Class);
        }
    }

    public void isEditMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            industryPageObjects.isEditIndustryMsgPresent();
        }
    }

}
