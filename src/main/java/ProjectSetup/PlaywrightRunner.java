package ProjectSetup;

import com.microsoft.playwright.*;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class PlaywrightRunner {

  protected  static Playwright playwright;

  protected  Browser browser;

  protected BrowserContext context;

  protected  Page page;



    @BeforeAll
    public static void init()
    {

        Playwright playwright=Playwright.create();
    }

     @BeforeEach
    public void signUp()
    {
         browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         context=browser.newContext();
         page=context.newPage();
         page.navigate("https://www.bestbuy.com/?intl=nosplash");
    }


    @AfterEach
    public void tearDown()
    {
        context.close();
        browser.close();

    }

}
