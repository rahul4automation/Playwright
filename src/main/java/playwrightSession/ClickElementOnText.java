package playwrightSession;

import com.microsoft.playwright.*;
import org.junit.Test;

import java.util.List;

public class ClickElementOnText {


    @Test
    public void ClickElementByText()
    {
        try{
        Playwright playwright =Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context =browser.newContext();
        Page page=context.newPage();
        page.navigate("https://www.bestbuy.com/?intl=nosplash");
        String targetText = "Deal of the Day";
        List<ElementHandle> elementList = page.querySelectorAll("//ul[@class='bottom-nav-left lv']/li");
        for (ElementHandle element : elementList) {
            String elementText = element.innerText();
            if (elementText.equals(targetText))
            {
                element.click();
               break;
            }
        }

        browser.close();
        playwright.close();
    }
        catch (PlaywrightException e)
    {
        e.printStackTrace();
    }

    }
}
