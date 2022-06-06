package com.iexceed.uiframework.stepdefinitions.PlyWriteStepDef;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.PlyWrite.PlyWriteActions;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class PlyWritePageDefinition extends TestBase{
    TestBase tb=new TestBase();
    public static WebDriver driver;
    PlyWriteActions ply=new PlyWriteActions();

    @Given("launch webapp (.+)$")
    public void launch_webapp(String testcase) throws Exception {
       //reat web pageautoation using normal css locators
        driver= tb.pcloudyInitialization("https://reactjs.org/");
        ply.clickElem();


    }


    @Given("using plyWrite launch webapp(.+)$")
    public void using_plywrite_launch_webapp(String testcase){
        ply.launchChromium();
    }

    @Given("^using plyWrite chrome launch (.+)$")
    public void using_plywrite_chrome_launch(String testcase) throws InterruptedException {
        ply.launchChrome();
    }
}
