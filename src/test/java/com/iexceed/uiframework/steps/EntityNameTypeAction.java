package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.EntityNameTypePageObjects;
import com.iexceed.uiframework.pageobjects.ios.IosEntityNameTypePageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityNameTypeAction {
    public String platForm;
    EntityNameTypePageObjects legalEntityNameTypePage=new EntityNameTypePageObjects();
    private static final Logger log = LogManager.getLogger(EntityNameTypeAction.class);
    IosEntityNameTypePageObjects iosEntityPage=new IosEntityNameTypePageObjects();

    public EntityNameTypeAction(String platform) {
        this.platForm = platform;

    }

    public void selectEntityNameTypeField() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.selectEntityNameType();
        } else {
            legalEntityNameTypePage.selectEntityNameTypePage();
        }
    }
    public void validateEntityName(String legalName)  {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.ios_enterLegalEntityName(legalName);
        } else {
            legalEntityNameTypePage.enterLegalEntityName(legalName);
        }

    }
    public void validateTradeName(String tradeName)  {

        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.ios_enterTradeName(tradeName);
        } else {
            legalEntityNameTypePage.enterTradeName(tradeName);
        }

    }
    public void clickOtherFields(){
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.clickOtherField();
        } else {
            legalEntityNameTypePage.clickOtherField();
        }

    }
    public void fieldValidations() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.ios_fieldValidationMsg();
        } else {
            legalEntityNameTypePage.fieldValidationMsg();
        }

    }
    public void isEntityLegalPage() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.ios_isEntityLegalPage();
        } else {
            legalEntityNameTypePage.isEntityLegalPage();
        }

    }

    public void validateLegalEntityType(String entityType) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.enterLegalEntityType(entityType);
        } else {
            legalEntityNameTypePage.enterLegalEntityType(entityType);
        }

    }
    public void validateEntityType(String type) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.validateEntityTye(type);
        } else {
            legalEntityNameTypePage.validateEntityTye(type);
        }

    }
    public void entePreviouslyKnownField(String previouslyKnown){
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.ios_enterPreviouslyKnown(previouslyKnown);
        } else {
            legalEntityNameTypePage.enterPreviouslyKnown(previouslyKnown);
        }

    }
    public void validatePreviousTradeas(String tradeAs){
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityPage.ios_enterPreviouslyTradingAs(tradeAs);
        } else {
            legalEntityNameTypePage.enterPreviouslyTradingAs(tradeAs);
        }

    }

}
