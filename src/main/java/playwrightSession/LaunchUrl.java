package playwrightSession;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class LaunchUrl {

    @Test
    public void LauchGoogle()
    {
        Playwright playwright =Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         Page page=browser.newPage();
         page.navigate("https://www.google.com");

         // Method Title()
        System.out.println("Page Title is :"+page.title());


        // Method Url()
        System.out.println("Page URL name is  :"+page.url());

         // Method goBack
        System.out.println("back page "+page.goBack());

        // Method Title()
        System.out.println("Page Title1 is :"+page.title());

        System.out.println("Forward Page " +page.goForward() );

        // Method Title()
        System.out.println("Page Title2 is :"+page.title());


        }
    }

