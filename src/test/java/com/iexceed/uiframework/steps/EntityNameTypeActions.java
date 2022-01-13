package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.EntityNameTypePage;

public class EntityNameTypeActions {
    public String platForm;
    EntityNameTypePage legalEntityNameTypePage=new EntityNameTypePage();

    public EntityNameTypeActions(String platform) {
        this.platForm = platform;

    }
    public void validateEntityName(String legalName)  {
        legalEntityNameTypePage.enterLegalEntityName(legalName);
    }
    public void validateTradeName(String tradeName)  {
        legalEntityNameTypePage.enterTradeName(tradeName);
    }
    public void clickOtherFields(){
        legalEntityNameTypePage.clickOtherField();
    }
    public void fieldValidations() throws InterruptedException {
        legalEntityNameTypePage.fieldValidationMsg();
    }
    public void isEntityLegalPage() {
        legalEntityNameTypePage.isEntityLegalPage();
    }

    public void validateLegalEntityType(String previousField) throws Exception {
        legalEntityNameTypePage.enterLegalEntityType(previousField);
    }
    public void validateEntityType(String type) throws Exception {
        legalEntityNameTypePage.validateEntityTye(type);
    }
    public void entePreviouslyKnownField(String previouslyKnown){
        legalEntityNameTypePage.enterPreviouslyKnown(previouslyKnown);
    }
    public void validatePreviousTradeas(String tradeAs){
        legalEntityNameTypePage.enterPreviouslyTradingAs(tradeAs);
    }
}
