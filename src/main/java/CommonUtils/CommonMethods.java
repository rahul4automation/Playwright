package CommonUtils;

import com.microsoft.playwright.Page;


public class CommonMethods extends PlayWrightRunner
{
    private static void clickElement(String selector) {
        page.click(selector);
    }


}
