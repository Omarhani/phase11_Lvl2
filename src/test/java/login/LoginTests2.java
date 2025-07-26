package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests2 extends BaseTests {

    @Test
    public void testSuccessfulLogin2() {
        LoginPage loginPage = homePage.clickSignUpAndLoginLink();
        loginPage.insertEmail("test@test.test");
        loginPage.insertPassword("Test123!");

    }
    @Test
    public void testSuccessfulLogin3() {
        LoginPage loginPage = homePage.clickSignUpAndLoginLink();
        loginPage.insertEmail("test@test.test");
        loginPage.insertPassword("Test123!");

    }
    @Test
    public void testSuccessfulLogin4() {
        LoginPage loginPage = homePage.clickSignUpAndLoginLink();
        loginPage.insertEmail("test@test.test");
        loginPage.insertPassword("Test123!");

    }
}
