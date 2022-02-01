package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.DashboardPageObjects;
import com.iexceed.uiframework.pageobjects.ios.IosDashboardPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DashboardPageAction {
    public String platForm;
    DashboardPageObjects dashboardPage=new DashboardPageObjects();
    IosDashboardPageObjects iosDashboard=new IosDashboardPageObjects();
    private static final Logger log = LogManager.getLogger(DashboardPageAction.class);

    public DashboardPageAction(String platform) {
        this.platForm = platform;

    }

    public void nextPageArrownav() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_nextPage();
        } else {
            dashboardPage.nextPage();
        }
    }

    public void PreviousPageArrownav() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_previousPageArrow();
        } else {
            dashboardPage.previousPageArrow();
        }
    }
    public void lastPageArrownav() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_lastPage();
        } else {
            dashboardPage.lastPage();
        }
    }
    public void firstPageArrownav() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_firstPage();
        } else {
            dashboardPage.firstPage();
        }
    }

    public void isDashboardPage() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_isDashboardPage();
        } else {
            dashboardPage.isDashboardPage();
        }
    }

    public void isMyapplication() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_isMyapplication();
        } else {
            dashboardPage.isMyapplication();
        }
    }

    public void isUnclaimedApplication() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_isUnclaimedApplicaion();
        } else {
            dashboardPage.isUnclaimedApplicaion();
        }
    }
    public void isCompletedApplication() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_isCompletedApplicaion();
        } else {
            dashboardPage.isCompletedApplicaion();
        }
    }
    public void isActiveApplication() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_isActiveApplicaion();
        } else {
            dashboardPage.isActiveApplicaion();
        }
    }

    public void isTenApplicationPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_isScrollTill10ApplicationList();
        } else {
            dashboardPage.isScrollTill10ApplicationList();
        }
    }
    public void isTenActiveApplicationPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_isActive10ApplicationPresent();
        } else {
            dashboardPage.isActive10ApplicationPresent();
        }
    }
    public void isTenUnclaimedApplicationPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_isUnclaimed10ApplicationPresent();
        } else {
            dashboardPage.isUnclaimed10ApplicationPresent();
        }
    }

    public void isTenCompletedApplicationPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_isComplete10ApplicationPresent();
        } else {
            dashboardPage.isComplete10ApplicationPresent();
        }
    }

    public void validateSearch() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosDashboard.ios_searchValidation();
        } else {
            dashboardPage.searchValidation();
        }
    }
}
