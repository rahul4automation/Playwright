package BestBuyTestCases;


import CommonUtils.PlayWrightRunner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class VerifyAccount extends PlayWrightRunner {

    @Disabled
    @Test
    public void VerifyAccountTitlePage()
    {
        createAccountPage.AccountPage();

    }

    @Test
    public void VerifyCreateAccountPage()
    {
        createAccountPage.VerifyCreateAccountPage();
    }

}
