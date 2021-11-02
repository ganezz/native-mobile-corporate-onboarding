package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.domainobjects.ConnectionObjects;

import java.util.Map;

public class CapabilitiesActions {
    ConnectionObjects connectionObjects;

    public CapabilitiesActions() {
        connectionObjects = new ConnectionObjects();
    }

    public void setCapabilities(String mode,String platform, String version, String deviceName, String applicationName, String maxDuration,String noReset, Map<String, String> deviceConfig,String isTrusteded) throws Exception {
        if (mode.equalsIgnoreCase("pcloudy"))
            connectionObjects.setRemoteDeviceCapabilities(platform, version, deviceName, applicationName,maxDuration,isTrusteded);
        else if (mode.contains("real") || mode.contains("Real"))
            connectionObjects.setRealDeviceCapabilities(platform,deviceName,applicationName,noReset);
    }


}
