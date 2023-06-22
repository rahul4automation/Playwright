package playwrightSession;

import com.microsoft.playwright.*;
import org.junit.Test;

import java.util.Arrays;


public class Test004 {

    @Test
    public void ListOfValueLocatorHandle() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setPermissions(Arrays.asList("geolocation")));
        Page page = context.newPage();
        page.navigate("https://www.bestbuy.com/?intl=nosplash");
        Locator ListOfOptions = page.locator("//ul[@class='bottom-nav-left lv']/li");
        for(int i=0;i<ListOfOptions.count();i++)
        {
            System.out.println("List of MenuItems:"+ListOfOptions.nth(i).allTextContents());
            page.locator("//ul[@class='bottom-nav-left lv']/li",new Page.LocatorOptions().setHasText("Deal of the Day")).click();
        }


    }

}
