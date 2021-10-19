package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.DomainObjects.ConnectionObjects;
import org.openqa.selenium.By;

import java.util.Map;

public class CapabilitiesActions {
    ConnectionObjects connectionObjects;

    public CapabilitiesActions() {
        connectionObjects = new ConnectionObjects();
    }

    public void setCapabilities(String mode, String pcloudy_username, String pcloudy_apikey, String platform, String version, String deviceName, String automationName, String applicationName, String androidActivity, String androidPackage, String bundleID, String maxDuration, String deviceURL, String orientation, String noReset, Map<String, String> deviceConfig, String targetCompanyName, String trustCompanyName, String trustBtn, String isTrusteded) throws Exception {
        if (mode.equalsIgnoreCase("pcloudy"))
            connectionObjects.setRemoteDeviceCapabilities(pcloudy_username, pcloudy_apikey, platform, version, deviceName, automationName, applicationName, androidActivity, androidPackage, bundleID, maxDuration, deviceURL, orientation, isTrusteded, By.xpath(targetCompanyName), By.xpath(trustCompanyName), By.xpath(trustBtn));
        else if (mode.contains("real") || mode.contains("Real"))
            connectionObjects.setRealDeviceCapabilities(platform, deviceName, automationName, applicationName, androidActivity, androidPackage, deviceURL, noReset, orientation);
    }


}
