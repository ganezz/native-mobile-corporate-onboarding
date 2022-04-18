package com.iexceed.uiframework.stepdefinitions.PlyWriteStepDef;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.PlyWrite.PlyWriteActions;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class PlyWritePageDefinition extends TestBase{
    TestBase tb=new TestBase();
    public static WebDriver driver;

    @Given("launch webapp (.+)$")
    public void launch_webapp(String testcase) throws Exception {
        driver= tb.pcloudyInitialization("https://reactjs.org/");
        PlyWriteActions ply=new PlyWriteActions();
        ply.clickElem();


    }
}
