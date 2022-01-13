package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.EntityContactPage;

public class EntityContactPageActions {
    public String platForm;
    EntityContactPage entityContactPage=new EntityContactPage();

    public EntityContactPageActions(String platform) {
        this.platForm = platform;

    }

    public void isEntityContactInfoPage(){
        entityContactPage.isEntityContactPage();
    }
}
