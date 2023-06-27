package ProjectSetup;

import com.microsoft.playwright.assertions.LocatorAssertions;
import org.junit.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class SignUpTest extends PlaywrightRunner {


      @Test
      public void ValidateSignupPage()
      {
          page.locator("//span[contains(text(),'Account')]").click();
          page.locator("//a[contains(text(),'Create Account') and @role='button']").click();
          page.locator("//input[@id='firstName']").fill("RAHUL");
          page.locator("//input[@id='lastName']").fill("SINGH");
          page.locator("//input[@type='email']").fill("rahulece77@gmail.com");
          page.locator("//input[@id='fld-p1']").fill("Rahul@123#");
          page.locator("//input[@id='reenterPassword']").fill("Rahul@123#");
          assertThat(page.locator("span.c-input-error-message")).containsText("Your passwords match!",new LocatorAssertions.ContainsTextOptions().setTimeout(3000));
          page.locator("//input[@name='phone']").fill("8884703881");
          page.locator("//input[@name='isRecoveryPhone']").check();
          // Verify Create Account is enable or not
          page.locator("//button[contains(text(),'Create an Account')]").isEnabled();
          page.locator("//button[@data-track='Google - createAccount Button']").isEnabled();
          page.locator("//button[@data-track='Google - createAccount Button']").click();

      }


}
