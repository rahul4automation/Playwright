package BestBuyPages;


import CommonUtils.CommonMethods;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

import static org.junit.Assert.assertEquals;

public class CreateAccountPage extends CommonMethods{

    private final Page createAccountPage;
    private static final String ACCOUNT_BUTTON="//span[contains(text(),'Account')]";
    private static final String Expected_Text="Account";
    private static final String CREATE_BUTTON="//a[contains(text(),'Create Account') and @role='button']";
    private static final String Expected_Value="Create Account";

public CreateAccountPage(Page page)
{

    this.createAccountPage = page;
}


public void AccountPage()
{
    createAccountPage.locator(ACCOUNT_BUTTON).isEnabled();
    String ElementText=createAccountPage.locator(ACCOUNT_BUTTON).textContent();
    System.out.println("Account name is on Page :"+ElementText);
    assertEquals(Expected_Text, ElementText);
    clickElement(ACCOUNT_BUTTON);
}

public void VerifyCreateAccountPage()
{
    clickElement(ACCOUNT_BUTTON);
    createAccountPage.locator(CREATE_BUTTON).isEnabled();
    String CreateAccount=createAccountPage.locator(CREATE_BUTTON).textContent();
    assertEquals(Expected_Value,CreateAccount);
    clickElement(CREATE_BUTTON);

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
