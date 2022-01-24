package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.EntityNameTypePageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityNameTypeActions {
    public String platForm;
    EntityNameTypePageObjects legalEntityNameTypePage=new EntityNameTypePageObjects();
    private static final Logger log = LogManager.getLogger(EntityNameTypeActions.class);


    public EntityNameTypeActions(String platform) {
        this.platForm = platform;

    }
    public void validateEntityName(String legalName)  {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            legalEntityNameTypePage.enterLegalEntityName(legalName);
        }

    }
    public void validateTradeName(String tradeName)  {

        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            legalEntityNameTypePage.enterTradeName(tradeName);
        }

    }
    public void clickOtherFields(){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            legalEntityNameTypePage.clickOtherField();
        }

    }
    public void fieldValidations() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            legalEntityNameTypePage.fieldValidationMsg();
        }

    }
    public void isEntityLegalPage() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            legalEntityNameTypePage.isEntityLegalPage();
        }

    }

    public void validateLegalEntityType(String previousField) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            legalEntityNameTypePage.enterLegalEntityType(previousField);
        }

    }
    public void validateEntityType(String type) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            legalEntityNameTypePage.validateEntityTye(type);
        }

    }
    public void entePreviouslyKnownField(String previouslyKnown){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            legalEntityNameTypePage.enterPreviouslyKnown(previouslyKnown);
        }

    }
    public void validatePreviousTradeas(String tradeAs){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            legalEntityNameTypePage.enterPreviouslyTradingAs(tradeAs);
        }

    }
}
