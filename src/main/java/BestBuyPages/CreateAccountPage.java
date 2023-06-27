package BestBuyPages;


import CommonUtils.CommonMethods;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

import static org.junit.Assert.assertEquals;

public class CreateAccountPage extends CommonMethods{

    private final Page createAccountPage;
    private static final String FIRST_NAME="//span[contains(text(),'Account')]";
    private static final String Expected_Text="Account";

public CreateAccountPage(Page page)
{

    this.createAccountPage = page;
}


public void AccountPage()
{
    createAccountPage.locator(FIRST_NAME).isEnabled();
    String ElementText=createAccountPage.locator(FIRST_NAME).textContent();
    System.out.println("Account name is on Page :"+ElementText);
    assertEquals(Expected_Text, ElementText);
    clickElement(FIRST_NAME);





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
