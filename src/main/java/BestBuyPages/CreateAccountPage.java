package BestBuyPages;


import com.microsoft.playwright.Page;

import static org.junit.Assert.assertEquals;

public class CreateAccountPage {

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

}

}
