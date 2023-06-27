package CommonUtils;

import com.microsoft.playwright.ElementHandle;



public class CommonMethods extends PlayWrightRunner
{
    private static void clickOnElement(String selector) {
        page.click(selector);
    }

    private static void clickElement(String selector) {
        ElementHandle element = page.querySelector(selector);
        if (element != null) {
            element.click();
        } else {
            System.out.println("Element not found: " + selector);
        }
    }


}
