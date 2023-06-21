package playwrightSession;

import com.microsoft.playwright.*;
import org.junit.Test;


public class Test002 {

    //Discuss About BrowserContext



    @Test
    public void  BrowserContextTest()
    {
        Playwright playwright =Playwright.create();
        Browser browser= playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context1=browser.newContext();
        Page page1 =context1.newPage();
        page1.navigate("https://www.amazon.in");
        System.out.println("AMAZON page title is :" +page1.title());

        BrowserContext context2=browser.newContext();
        Page page2 =context2.newPage();
        page2.navigate("https://www.flipkart.com");
        System.out.println("FLIPKART page title is :" +page2.title());

        BrowserContext context3=browser.newContext();
        Page page3 =context3.newPage();
        page3.navigate("https://www.meesho.com/");
        System.out.println("MEESHO page title is :" +page3.title());


    }
}
