package com.iexceed.uiframework.Playwrite;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonDriver;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import com.microsoft.playwright.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class plywrite2 extends TestBase{



    @FindBy(xpath = "//a[contains(text(),'Community')]")
    WebElement community;

    @FindBy(xpath = "//input[@id='algolia-doc-search']")
    WebElement search;

    By dosTxt= By.xpath("//a[contains(text(),'Docs')]");
    By tut= By.xpath("//a[contains(text(),'Tutorial')]");





    private TextBoxControls textBoxControls;
    private CommonElements commonElements;
    private WaitUtility waitUtility;
    private CommonDriver commonDriver;
    private JavaScriptControls javaScriptControls;

    public plywrite2() {
        PageFactory.initElements(driver1,this);
        commonElements = new CommonElements();
        waitUtility  = new WaitUtility();
        textBoxControls = new TextBoxControls();
        commonDriver = new CommonDriver(driver1);
        javaScriptControls = new JavaScriptControls(driver1);
    }

    public void clickInput() throws Exception {
        waitUtility.waitForSeconds(2);
        commonElements.click(community);
        waitUtility.waitForSeconds(2);
        commonElements.click(search);
        textBoxControls.setText(search,"js");
    }

    public void clickElem() throws Exception {
        driver1.findElement(dosTxt).click();
        waitUtility.waitForSeconds(1);
       driver1.findElement(tut).click();
    }

    public void plywrirLogin(){
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();

            // Open new page
            Page page = context.newPage();

            // Go to https://reactjs.org/
            page.navigate("https://reactjs.org/");

            // Click a:has-text("Docs")
            page.locator("a:has-text(\"Docs\")").click();
            // assertThat(page).hasURL("https://reactjs.org/docs/getting-started.html");

            // Click a:has-text("Tutorial") >> nth=0
            page.locator("a:has-text(\"Tutorial\")").first().click();
            // assertThat(page).hasURL("https://reactjs.org/tutorial/tutorial.html");

            // Click text=Blog >> nth=0
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://reactjs.org/blog/2022/03/29/react-v18.html"), () ->
            page.waitForNavigation(() -> {
                page.locator("text=Blog").first().click();
            });

            // Click a:has-text("Community") >> nth=1
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://reactjs.org/community/support.html"), () ->
            page.waitForNavigation(() -> {
                page.locator("a:has-text(\"Community\")").nth(1).click();
            });

            // Click [placeholder="Search"]
            page.locator("[placeholder=\"Search\"]").click();

            // Fill [placeholder="Search"]
            page.locator("[placeholder=\"Search\"]").fill("divya");

            // Click text=React has a community of millions of developers. On this page we’ve listed some
            page.locator("text=React has a community of millions of developers. On this page we’ve listed some ").click();
        }
    }



    public void plywrirLoginC() throws InterruptedException {
        Playwright playwrite = Playwright.create();
        BrowserType chrome = playwrite.chromium();
        // Set headless mode to false for GUI execution
        BrowserType.LaunchOptions options = new BrowserType.LaunchOptions();
        options.setHeadless(false);
        Browser browser = chrome.launch(options);
        // Launch AUT in Chrome Browser
        Page page = browser.newPage();
        page.navigate("https://google.com");
        Thread.sleep(5000);
        // Close the Browser
        browser.close();
    }


}



