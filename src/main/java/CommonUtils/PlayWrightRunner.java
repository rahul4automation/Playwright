package CommonUtils;
import BestBuyPages.CreateAccountPage;
import com.microsoft.playwright.*;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class PlayWrightRunner {

    protected  static Playwright playwright;

    protected  Browser browser;

    protected BrowserContext context;

    protected static Page page;

    protected CreateAccountPage createAccountPage;


    @BeforeAll
    public static void init()
    {

        playwright=Playwright.create();
    }

    @BeforeEach
    public void signUp()
    {
        browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context=browser.newContext();
        page=context.newPage();
        createAccountPage =new CreateAccountPage(page);
        page.navigate("https://www.bestbuy.com/?intl=nosplash");
        page.waitForLoadState();
    }


    @AfterEach
    public void tearDown()
    {
        context.close();
        browser.close();

    }

}
