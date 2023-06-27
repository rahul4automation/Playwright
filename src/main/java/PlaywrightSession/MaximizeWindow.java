package PlaywrightSession;

import com.microsoft.playwright.*;
import org.junit.Test;

public class MaximizeWindow {

    @Test
    public void MaximizeBrowser() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1900,1800));

            Page page = context.newPage();
            page.navigate("https://www.bestbuy.com/?intl=nosplash");

            // Wait for a while to see the maximized window
            Thread.sleep(3000);

            browser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
