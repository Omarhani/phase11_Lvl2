package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static utils.MethodHandles.myAssertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickSignUpAndLoginLink();
        loginPage.insertEmail("test@test.test");
        loginPage.insertPassword("Test123!");
        myAssertEquals(1,1);
    }
    @Test
    public void testSuccessfulLogin2() {
        LoginPage loginPage = homePage.clickSignUpAndLoginLink();
        loginPage.insertEmail("test@test.test");
        loginPage.insertPassword("Test123!");
        myAssertEquals(1,2);
    }
}
