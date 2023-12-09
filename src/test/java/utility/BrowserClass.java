package utility;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.Before;

public class BrowserClass {

    public static Page page;

    @Before
    public static void init() {
        Playwright playwright = Playwright.create();
        BrowserType chrome = playwright.chromium();
        Browser browser = chrome.launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }
}
