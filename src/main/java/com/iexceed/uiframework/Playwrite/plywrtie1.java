package com.iexceed.uiframework.Playwrite;

import com.microsoft.playwright.*;

public class plywrtie1 {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();

            // Open new page
            Page page = context.newPage();

            // Go to https://reactjs.orplywritBDDg/
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
        }
    }
}


