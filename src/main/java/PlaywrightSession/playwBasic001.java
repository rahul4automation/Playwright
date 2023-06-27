package PlaywrightSession;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class playwBasic001 {

    public static void main(String[] args) {
        
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page =browser.newPage();
        page.navigate("https://ksrtc.in/");
        String page_title=page.title();
        System.out.println("KSRTC Page Title is :"+page_title);

    }

}
