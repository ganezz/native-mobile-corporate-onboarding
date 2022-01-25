package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.DashboardPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DashboardPageAction {
    public String platForm;
    DashboardPageObjects dashboardPage=new DashboardPageObjects();
    private static final Logger log = LogManager.getLogger(DashboardPageAction.class);

    public DashboardPageAction(String platform) {
        this.platForm = platform;

    }

    public void isDashboardPage() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            dashboardPage.isDashboardPage();
        }
    }

    public void isMyapplication() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            dashboardPage.isMyapplication();
        }
    }

    public void isUnclaimedApplication() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            dashboardPage.isUnclaimedApplicaion();
        }
    }
    public void isCompletedApplication() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            dashboardPage.isCompletedApplicaion();
        }
    }
    public void isActiveApplication() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            dashboardPage.isActiveApplicaion();
        }
    }

    public void isTenApplicationPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            dashboardPage.isScrollTill10ApplicationList();
        }
    }

    public void validateSearch() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            dashboardPage.searchValidation();
        }
    }
}
