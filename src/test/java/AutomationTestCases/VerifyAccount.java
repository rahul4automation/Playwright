package AutomationTestCases;

import BestBuyPages.CreateAccountPage;
import ProjectSetUp.PlayWrightRunner;
import org.junit.jupiter.api.Test;

public class VerifyAccount extends PlayWrightRunner {


    @Test
    public void VerifyAccountTitlePage()
    {
        createAccountPage.AccountPage();
    }

}
