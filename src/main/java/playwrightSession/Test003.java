package playwrightSession;

import com.microsoft.playwright.*;
import org.junit.Test;

import java.util.Arrays;

public class Test003 {

    @Test
    public void Locators()
    {
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context=browser.newContext(new Browser.NewContextOptions().setPermissions(Arrays.asList("geolocation")));
        Page page=context.newPage();
        page.navigate("https://www.bestbuy.com/?intl=nosplash");
        //page.locator("//a[@data-lid='hdr_dotd']").click();

        //CSS Selector

        page.locator("[data-lid='hdr_dotd']").click();
        System.out.println("Page Title is :" +page.title());



    }

}
