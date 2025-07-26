package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests1 extends BaseTests {

    @Test
    public void testSuccessfulLogin1() {
        LoginPage loginPage = homePage.clickSignUpAndLoginLink();
        loginPage.insertEmail("test@test.test");
        loginPage.insertPassword("Test123!");

    }
}
